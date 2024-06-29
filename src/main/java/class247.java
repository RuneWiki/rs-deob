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
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class247 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Z")
    private boolean field3833 = false;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3830 = "Loaded textures";

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ei", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 5)
    public final void focusLost(FocusEvent arg0) {
        class123.field2130 = false;
        field3848++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZZ)V", line = 15)
    private final void method1630(boolean arg0, boolean arg1) {
        field3846++;
        synchronized (this) {
            if (class157.field2563) {
                return;
            }
            class157.field2563 = true;
        }
        if (class177.field2849.field2139 != null) {
            class177.field2849.field2139.destroy();
        }
        try {
            if (arg1) {
                return;
            }
            this.method343(1);
        } catch (Exception var12) {
        }
        if (class216.field3456 != null) {
            try {
                class216.field3456.removeFocusListener(this);
                class216.field3456.getParent().remove(class216.field3456);
            } catch (Exception var11) {
            }
        }
        if (class177.field2849 != null) {
            try {
                class177.field2849.method807(9694);
            } catch (Exception var10) {
            }
        }
        this.method342(93);
        if (class283.field4376 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ei", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 75)
    public final synchronized void paint(Graphics arg0) {
        field3842++;
        if (class34.field691 != this || class157.field2563) {
            return;
        }
        class246.field3815 = true;
        if (class33.field661 && !class249.field3893 && (class338.method2339((byte) -120) - class334.field5121) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class61.field1183 <= var2.width && class177.field2864 <= var2.height) {
                class104.field1796 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/lang/String;)V", line = 96)
    public final void method1631(int arg0, String arg1) {
        field3840++;
        if (this.field3833) {
            return;
        }
        this.field3833 = true;
        if (arg0 != 302) {
            this.method342(29);
        }
        System.out.println("error_game_" + arg1);
        try {
            class102.method666(class177.field2849.field2139, false, "loggedout");
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ei", name = "run", descriptor = "()V", line = 121)
    public final void run() {
        field3824++;
        try {
            if (class124.field2133 != null) {
                String var1 = class124.field2133.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class124.field2151;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1631(302, "wrongjava");
                        return;
                    }
                    class337.field5239 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class124.field2151 == null || class124.field2151.equals("1.4.2"))) {
                    this.method1631(302, "wrongjava");
                    return;
                }
            }
            if (class124.field2151 != null && class124.field2151.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class124.field2151.length() > var3) {
                    char var5 = class124.field2151.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class33.field661 = true;
                }
            }
            if (class177.field2849.field2139 != null) {
                Method var6 = class124.field2154;
                if (var6 != null) {
                    try {
                        var6.invoke(class177.field2849.field2139, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class343.method2378((byte) -78);
            this.method1640(-2);
            class330.field5055 = class296.method1983(class216.field3456, 8217, class134.field2257, class88.field1658);
            this.method345(-31401);
            class197.field3167 = class330.method2285((byte) -6);
            while (class303.field4581 == 0L || class303.field4581 > class338.method2339((byte) -120)) {
                class215.field3447 = class197.field3167.method835(class337.field5239, (byte) -104, class260.field4055);
                for (int var8 = 0; var8 < class215.field3447; var8++) {
                    this.method1641(12727);
                }
                this.method1633(-27660);
                class215.method1446(class177.field2849, (byte) -105, class216.field3456);
            }
        } catch (Exception var11) {
            class106.method694(var11, (String) null, (byte) -108);
            this.method1631(302, "crash");
        }
        this.method1630(true, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V", line = 230)
    public static final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3828++;
        int var5 = -arg0;
        int var6 = arg0;
        class241.method1598(arg1, -7, class155.field2522[arg3], arg2 + arg0, -arg0 + arg2);
        if (arg4 > -125) {
            return;
        }
        int var7 = 0;
        int var8 = -1;
        while (var7 < var6) {
            var8 += 2;
            var7++;
            var5 += var8;
            if (var5 >= 0) {
                var6--;
                var5 -= var6 << 1;
                int[] var9 = class155.field2522[arg3 + var6];
                int[] var10 = class155.field2522[arg3 - var6];
                int var11 = arg2 - var7;
                int var12 = arg2 + var7;
                class241.method1598(arg1, -7, var9, var12, var11);
                class241.method1598(arg1, -7, var10, var12, var11);
            }
            int var13 = arg2 - var6;
            int var14 = arg2 + var6;
            int[] var15 = class155.field2522[arg3 + var7];
            int[] var16 = class155.field2522[arg3 - var7];
            class241.method1598(arg1, -7, var15, var14, var13);
            class241.method1598(arg1, -7, var16, var14, var13);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 286)
    private final void method1633(int arg0) {
        if (arg0 != -27660) {
            return;
        }
        long var2 = class338.method2339((byte) -120);
        long var4 = class106.field1840[class56.field1111];
        class106.field1840[class56.field1111] = var2;
        class56.field1111 = class56.field1111 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class188.field3043 = ((var6 >> 1) + 32000) / var6;
        }
        field3826++;
        if ((class50.field1015++) > 50) {
            class50.field1015 -= 50;
            class246.field3815 = true;
            class216.field3456.setSize(class88.field1658, class134.field2257);
            class216.field3456.setVisible(true);
            if (class283.field4376 != null && class177.field2866 == null) {
                Insets var7 = class283.field4376.getInsets();
                class216.field3456.setLocation(class294.field4488 + var7.left, class123.field2122 + var7.top);
            } else {
                class216.field3456.setLocation(class294.field4488, class123.field2122);
            }
        }
        this.method351(arg0 + 48975);
    }

    @OriginalMember(owner = "client!ei", name = "providesignlink", descriptor = "(Lte;)V", line = 327)
    public static final void providesignlink(class124 arg0) {
        field3827++;
        class177.field2849 = arg0;
        class224.field3528 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 336)
    public final URL getDocumentBase() {
        field3823++;
        if (class283.field4376 == null) {
            return class177.field2849 == null || class177.field2849.field2139 == this ? super.getDocumentBase() : class177.field2849.field2139.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 351)
    public final void windowActivated(WindowEvent arg0) {
        field3831++;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 360)
    public static final void method1634(int arg0) {
        field3843++;
        if (class322.field4911 == 0 || class322.field4911 == 5) {
            return;
        }
        try {
            if (++class307.field4634 > 2000) {
                if (class177.field2860 != null) {
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                }
                if (class271.field4186 >= 1) {
                    class157.field2565 = -5;
                    class322.field4911 = 0;
                    return;
                }
                if (class329.field5049 == class205.field3347) {
                    class205.field3347 = class313.field4760;
                } else {
                    class205.field3347 = class329.field5049;
                }
                class322.field4911 = 1;
                class271.field4186++;
                class307.field4634 = 0;
            }
            if (class322.field4911 == 1) {
                class28.field541 = class177.field2849.method806(class245.field3808, class205.field3347, -27289);
                class322.field4911 = 2;
            }
            if (class322.field4911 == 2) {
                if (class28.field541.field1852 == 2) {
                    throw new IOException();
                }
                if (class28.field541.field1852 != 1) {
                    return;
                }
                class177.field2860 = new class87((Socket) class28.field541.field1853, class177.field2849);
                class28.field541 = null;
                long var1 = class186.field3023 = class116.method767(-127, class120.field2082);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class14.field263.field3249 = 0;
                class14.field263.method1311(14, 10964);
                class14.field263.method1311(var3, 10964);
                class177.field2860.method611((byte) 60, 0, class14.field263.field3273, 2);
                if (class41.field797 != null) {
                    class41.field797.method1497(arg0 ^ 0xFFFFFFD1);
                }
                if (class328.field5033 != null) {
                    class328.field5033.method1497(arg0 ^ 0x61);
                }
                int var4 = class177.field2860.method616((byte) -27);
                if (class41.field797 != null) {
                    class41.field797.method1497(-90);
                }
                if (class328.field5033 != null) {
                    class328.field5033.method1497(arg0 ^ 0xFFFFFF8A);
                }
                if (var4 != 0) {
                    class157.field2565 = var4;
                    class322.field4911 = 0;
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                    return;
                }
                class322.field4911 = 3;
            }
            if (class322.field4911 == 3) {
                if (class177.field2860.method608(-127) < 8) {
                    return;
                }
                class177.field2860.method605((byte) -29, 0, class190.field3082.field3273, 8);
                class190.field3082.field3249 = 0;
                int[] var5 = new int[4];
                class328.field5012 = class190.field3082.method1297(false);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class328.field5012 >> 32);
                class14.field263.field3249 = 0;
                var5[3] = (int) class328.field5012;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class14.field263.method1311(10, arg0 + 10980);
                class14.field263.method1359(arg0 + 16721, var5[0]);
                class14.field263.method1359(16705, var5[1]);
                class14.field263.method1359(16705, var5[2]);
                class14.field263.method1359(16705, var5[3]);
                class14.field263.method1353((byte) -105, class116.method767(-127, class120.field2082));
                class14.field263.method1309(110, class135.field2272);
                class14.field263.method1347(class79.field1557, 0, class341.field5301);
                class302.field4576.field3249 = 0;
                if (class38.field730 == 40) {
                    class302.field4576.method1311(18, 10964);
                } else {
                    class302.field4576.method1311(16, 10964);
                }
                class302.field4576.method1313(class14.field263.field3249 + class295.method1975((byte) 121, class228.field3604) + 163, -376480);
                class302.field4576.method1359(arg0 + 16721, 537);
                class302.field4576.method1311(class119.field2080, arg0 + 10980);
                class302.field4576.method1311(class63.field1219 ? 1 : 0, 10964);
                class302.field4576.method1311(1, arg0 ^ 0xFFFFD524);
                class302.field4576.method1311(class241.method1595(2), 10964);
                class302.field4576.method1313(class88.field1658, -376480);
                class302.field4576.method1313(class134.field2257, -376480);
                class302.field4576.method1311(class219.field3477, 10964);
                class28.method227((byte) -97, class302.field4576);
                class302.field4576.method1309(117, class228.field3604);
                class302.field4576.method1359(16705, class190.field3090);
                class302.field4576.method1359(16705, class180.method1131((byte) 115));
                class1.field13 = true;
                class302.field4576.method1313(class79.field1565, -376480);
                class302.field4576.method1359(arg0 + 16721, class84.field1592.method2033(false));
                class302.field4576.method1359(16705, class186.field3026.method2033(false));
                class302.field4576.method1359(16705, class212.field3416.method2033(false));
                class302.field4576.method1359(16705, class331.field5069.method2033(false));
                class302.field4576.method1359(16705, class221.field3508.method2033(false));
                class302.field4576.method1359(16705, class138.field2304.method2033(false));
                class302.field4576.method1359(16705, class75.field1530.method2033(false));
                class302.field4576.method1359(16705, class136.field2278.method2033(false));
                class302.field4576.method1359(16705, class154.field2514.method2033(false));
                class302.field4576.method1359(16705, class52.field1040.method2033(false));
                class302.field4576.method1359(arg0 + 16721, class259.field4026.method2033(false));
                class302.field4576.method1359(16705, class118.field2060.method2033(false));
                class302.field4576.method1359(16705, class84.field1596.method2033(false));
                class302.field4576.method1359(16705, class18.field330.method2033(false));
                class302.field4576.method1359(arg0 + 16721, class235.field3698.method2033(false));
                class302.field4576.method1359(arg0 ^ 0xFFFFBEB1, class301.field4570.method2033(false));
                class302.field4576.method1359(16705, class211.field3398.method2033(false));
                class302.field4576.method1359(16705, class103.field1789.method2033(false));
                class302.field4576.method1359(16705, class62.field1188.method2033(false));
                class302.field4576.method1359(16705, class176.field2829.method2033(false));
                class302.field4576.method1359(arg0 + 16721, class260.field4059.method2033(false));
                class302.field4576.method1359(arg0 + 16721, class240.field3754.method2033(false));
                class302.field4576.method1359(16705, class104.field1799.method2033(false));
                class302.field4576.method1359(16705, class109.field1923.method2033(false));
                class302.field4576.method1359(arg0 + 16721, class81.field1578.method2033(false));
                class302.field4576.method1359(16705, class147.field2417.method2033(false));
                class302.field4576.method1359(16705, class48.field994.method2033(false));
                class302.field4576.method1359(arg0 + 16721, class330.field5054.method2033(false));
                class302.field4576.method1359(16705, class252.field3945.method2033(false));
                class302.field4576.method1332(class14.field263.field3273, class14.field263.field3249, (byte) 0, 0);
                class177.field2860.method611((byte) 60, 0, class302.field4576.field3273, class302.field4576.field3249);
                class14.field263.method83(var5, 34);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class190.field3082.method83(var5, 80);
                class322.field4911 = 4;
            }
            if (class322.field4911 == 4) {
                if (class177.field2860.method608(-84) < 1) {
                    return;
                }
                int var7 = class177.field2860.method616((byte) -70);
                if (var7 == 21) {
                    class322.field4911 = 7;
                } else if (var7 == 29) {
                    class322.field4911 = 10;
                } else if (var7 == 1) {
                    class157.field2565 = var7;
                    class322.field4911 = 5;
                    return;
                } else if (var7 == 2) {
                    class322.field4911 = 8;
                } else if (var7 == 15) {
                    class322.field4911 = 0;
                    class157.field2565 = var7;
                    return;
                } else if (var7 == 23 && class271.field4186 < 1) {
                    class271.field4186++;
                    class307.field4634 = 0;
                    class322.field4911 = 1;
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                    return;
                } else {
                    class157.field2565 = var7;
                    class322.field4911 = 0;
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                    return;
                }
            }
            if (class322.field4911 == 6) {
                class14.field263.field3249 = 0;
                class14.field263.method80(17, (byte) 112);
                class177.field2860.method611((byte) 60, 0, class14.field263.field3273, class14.field263.field3249);
                class322.field4911 = 4;
                return;
            }
            if (arg0 != -16) {
                method1632(78, -52, 36, -5, 13);
            }
            if (class322.field4911 == 7) {
                if (class177.field2860.method608(-79) >= 1) {
                    class166.field2676 = class177.field2860.method616((byte) -83) * 60 + 180;
                    class157.field2565 = 21;
                    class322.field4911 = 0;
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                    return;
                }
                return;
            }
            if (class322.field4911 == 10) {
                if (class177.field2860.method608(-79) >= 1) {
                    class171.field2754 = class177.field2860.method616((byte) -48);
                    class322.field4911 = 0;
                    class157.field2565 = 29;
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                    return;
                }
                return;
            }
            if (class322.field4911 == 8) {
                if (class177.field2860.method608(-54) < 14) {
                    return;
                }
                class177.field2860.method605((byte) -87, 0, class190.field3082.field3273, 14);
                class190.field3082.field3249 = 0;
                class29.field545 = class190.field3082.method1317((byte) -123);
                class84.field1595 = class190.field3082.method1317((byte) -116);
                class294.field4494 = class190.field3082.method1317((byte) -82) == 1;
                class211.field3400 = class190.field3082.method1317((byte) -107) == 1;
                class268.field4124 = class190.field3082.method1317((byte) -72) == 1;
                class188.field3047 = class190.field3082.method1317((byte) -124) == 1;
                class101.field1778 = class190.field3082.method1317((byte) -74) == 1;
                class100.field1758 = class190.field3082.method1315(14289);
                class77.field1534 = class190.field3082.method1317((byte) -80) == 1;
                class15.field277 = class190.field3082.method1317((byte) -108) == 1;
                class264.method1762(class15.field277, 2);
                class274.method1836(arg0 + 16, class15.field277);
                if (!class63.field1219) {
                    if ((!class294.field4494 || class268.field4124) && !class77.field1534) {
                        try {
                            class102.method666(class177.field2849.field2139, false, "unzap");
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class102.method666(class177.field2849.field2139, false, "zap");
                        } catch (Throwable var13) {
                        }
                    }
                }
                try {
                    class102.method666(class177.field2849.field2139, false, "loggedin");
                } catch (Throwable var12) {
                }
                class301.field4559 = class190.field3082.method85(arg0 + 138);
                class250.field3926 = class190.field3082.method1315(arg0 + 14305);
                class322.field4911 = 9;
            }
            if (class322.field4911 == 9) {
                if (class177.field2860.method608(-61) >= class250.field3926) {
                    class190.field3082.field3249 = 0;
                    class177.field2860.method605((byte) -117, 0, class190.field3082.field3273, class250.field3926);
                    class322.field4911 = 0;
                    class157.field2565 = 2;
                    class9.method76(-118);
                    class303.field4597 = -1;
                    class35.method283(false, -4221);
                    class301.field4559 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class177.field2860 != null) {
                class177.field2860.method607((byte) -76);
                class177.field2860 = null;
            }
            if (class271.field4186 < 1) {
                class271.field4186++;
                class307.field4634 = 0;
                class322.field4911 = 1;
                if (class329.field5049 == class205.field3347) {
                    class205.field3347 = class313.field4760;
                } else {
                    class205.field3347 = class329.field5049;
                }
            } else {
                class322.field4911 = 0;
                class157.field2565 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 745)
    public static final void method1635(int arg0, int arg1) {
        field3851++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class94.field1692 += arg0 * arg1;
        if (class255.field3994.length < class94.field1692) {
            class94.field1692 -= class255.field3994.length;
            int var3 = (int) (Math.random() * 12.0D);
            class220.method1464((byte) 95, class93.field1678[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class54.field1079[var4 + var5] - class255.field3994[class94.field1692 + var4 & class255.field3994.length - 1] * arg1 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class54.field1079[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class54.field1079[var10 + var11] = 255;
                } else {
                    class54.field1079[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg1; var13++) {
            class334.field5130[var13] = class334.field5130[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class334.field5130[var14] = (int) (Math.sin((double) class305.field4621 / 14.0D) * 16.0D + Math.sin((double) class305.field4621 / 15.0D) * 14.0D + Math.sin((double) class305.field4621 / 16.0D) * 12.0D);
            class305.field4621++;
        }
        int var15 = ((class25.field494 & 0x1) + arg1) / 2;
        class343.field5329 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class343.field5329; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class54.field1079[(var18 << 7) + var17] = 192;
        }
        class343.field5329 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var21 += class54.field1079[var22 + var20 + var15];
                }
                if (-var15 - (1 - var22) >= 0) {
                    var21 -= class54.field1079[var20 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class174.field2793[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class174.field2793[var15 * 128 + var23 + var26];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class174.field2793[var23 + var26 - var15 * 128 - 128];
                }
                if (var25 >= 0) {
                    class54.field1079[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBII)V", line = 920)
    public final void method1636(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3832++;
        try {
            if (class34.field691 != null) {
                class133.field2250++;
                if (class133.field2250 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1631(302, "alreadyloaded");
                return;
            }
            class88.field1658 = arg4;
            class61.field1183 = arg4;
            class34.field691 = this;
            class252.field3951 = arg3;
            class294.field4488 = 0;
            if (arg2 != -85) {
                field3821 = 53;
            }
            class134.field2257 = arg1;
            class177.field2864 = arg1;
            class123.field2122 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class158.field2573 = true;
            } else {
                class158.field2573 = false;
            }
            if (class177.field2849 == null) {
                class224.field3528 = class177.field2849 = new class124(this, arg0, (String) null, 0);
            }
            class107 var7 = class177.field2849.method802(1, -35, this);
            while (var7.field1852 == 0) {
                class127.method843(-111, 10L);
            }
            class52.field1050 = (Thread) var7.field1853;
        } catch (Exception var9) {
            class106.method694(var9, (String) null, (byte) -127);
            this.method1631(arg2 ^ 0xFFFFFE85, "crash");
        }
    }

    @OriginalMember(owner = "client!ei", name = "destroy", descriptor = "()V", line = 976)
    public final void destroy() {
        field3844++;
        if (class34.field691 == this && !class157.field2563) {
            class303.field4581 = class338.method2339((byte) -120);
            class127.method843(-110, 5000L);
            class224.field3528 = null;
            this.method1630(false, false);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V", line = 992)
    public static final void method1637() {
        for (int var0 = 0; var0 < class175.field2819; var0++) {
            class271 var1 = class2.field37[var0];
            class8.method67(var1);
            class2.field37[var0] = null;
        }
        class175.field2819 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V", line = 1008)
    public static void method1638(int arg0) {
        field3830 = null;
        if (arg0 < 18) {
            providesignlink((class124) null);
        }
    }

    @OriginalMember(owner = "client!ei", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1018)
    public final void windowClosed(WindowEvent arg0) {
        field3853++;
    }

    @OriginalMember(owner = "client!ei", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1025)
    public final void update(Graphics arg0) {
        field3822++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ei", name = "stop", descriptor = "()V", line = 1033)
    public final void stop() {
        field3850++;
        if (class34.field691 == this && !class157.field2563) {
            class303.field4581 = class338.method2339((byte) -120) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIIII)V", line = 1053)
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class196.field3152 < 100) {
            class326.method2256(false);
        }
        if (class249.field3893) {
            class115.method757(arg3, arg1, arg0 + arg3, arg1 - -arg2);
        } else {
            class270.method1806(arg3, arg1, arg0 + arg3, arg1 - -arg2);
        }
        field3855++;
        if (arg4 != 9591) {
            method1634(-51);
        }
        if (class196.field3152 < 100) {
            byte var5 = 20;
            int var6 = arg3 + (arg0 / 2);
            int var7 = arg1 + (arg2 / 2) - var5 - 18;
            if (class249.field3893) {
                class115.method755(arg3, arg1, arg0, arg2, 0);
                class115.method756(var6 - 152, var7, 304, 34, 9179409);
                class115.method756(var6 - 151, var7 - -1, 302, 32, 0);
                class115.method755(var6 - 150, var7 + 2, class196.field3152 * 3, 30, 9179409);
                class115.method755(class196.field3152 * 3 + var6 - 150, var7 - -2, 300 - class196.field3152 * 3, 30, 0);
            } else {
                class270.method1811(arg3, arg1, arg0, arg2, 0);
                class270.method1802(var6 - 152, var7, 304, 34, 9179409);
                class270.method1802(var6 - 151, var7 + 1, 302, 32, 0);
                class270.method1811(var6 - 150, var7 + 2, class196.field3152 * 3, 30, 9179409);
                class270.method1811(var6 + (class196.field3152 * 3) - 150, var7 + 2, 300 - class196.field3152 * 3, 30, 0);
            }
            class214.field3428.method2105(class148.field2430, var6, var5 + var7, 16777215, -1);
            return;
        }
        class202.field3258 = (int) ((float) (arg2 * 2) / class244.field3799);
        class99.field1752 = (int) ((float) (arg0 * 2) / class244.field3799);
        class233.field3662 = class250.field3923 - (int) ((float) arg2 / class244.field3799);
        class253.field3958 = class318.field4808 - ((int) ((float) arg0 / class244.field3799));
        int var8 = class318.field4808 - ((int) ((float) arg0 / class244.field3799));
        int var9 = class250.field3923 - ((int) ((float) arg2 / class244.field3799));
        int var10 = (int) ((float) arg0 / class244.field3799) + class318.field4808;
        int var11 = (int) ((float) arg2 / class244.field3799) + class250.field3923;
        if (class249.field3893) {
            if (class68.field1461 == null || class68.field1461.field4377 != arg0 || class68.field1461.field4383 != arg2) {
                class68.field1461 = null;
                class68.field1461 = new class206(arg0, arg2);
            }
            class270.method1805(class68.field1461.field3353, arg0, arg2);
            class283.method1902(0, arg0, -16708, 0, var9, var11, var10, arg2, var8);
            class268.method1788(var11, class15.field277, var9, var8, arg2, arg0, 0, true, 0, var10);
            class298.method1987(0, var8, var10, 394, var9, arg0, arg2, 0, var11);
            class68.field1461.method1392();
            class115.method751(class68.field1461.field3353, arg3, arg1, arg0, arg2);
            class270.field4170 = null;
        } else {
            class283.method1902(arg1, arg0 + arg3, arg4 + -26299, arg3, var9, var11, var10, arg1 + arg2, var8);
            class268.method1788(var11, class15.field277, var9, var8, arg1 + arg2, arg0 + arg3, arg1, true, arg3, var10);
            class298.method1987(arg1, var8, var10, 394, var9, arg3 + arg0, arg1 + arg2, arg3, var11);
        }
        if (class280.field4319 > 0) {
            class303.field4601--;
            if (class303.field4601 == 0) {
                class280.field4319--;
                class303.field4601 = 20;
            }
        }
        if (!class95.field1705) {
            return;
        }
        int var12 = arg2 + arg1 - 8;
        int var13 = arg0 + arg3 - 5;
        int var14 = 16776960;
        class33.field674.method2116("Fps:" + class188.field3043, var13, var12, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        var12 -= 15;
        class33.field674.method2116("Mem:" + var16 + "k", var13, var12, var14, -1);
        var12 -= 15;
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V", line = 1171)
    public final synchronized void method1640(int arg0) {
        if (class216.field3456 != null) {
            class216.field3456.removeFocusListener(this);
            class216.field3456.getParent().remove(class216.field3456);
        }
        Container var2;
        if (class177.field2866 != null) {
            var2 = class177.field2866;
        } else if (class283.field4376 == null) {
            var2 = class177.field2849.field2139;
        } else {
            var2 = class283.field4376;
        }
        field3834++;
        var2.setLayout((LayoutManager) null);
        class216.field3456 = new class78(this);
        var2.add(class216.field3456);
        class216.field3456.setSize(class88.field1658, class134.field2257);
        class216.field3456.setVisible(true);
        if (class283.field4376 == var2) {
            Insets var3 = class283.field4376.getInsets();
            class216.field3456.setLocation(var3.left + class294.field4488, var3.top - -class123.field2122);
        } else {
            class216.field3456.setLocation(class294.field4488, class123.field2122);
        }
        if (arg0 != -2) {
            return;
        }
        class216.field3456.addFocusListener(this);
        class216.field3456.requestFocus();
        class106.field1827 = true;
        class123.field2130 = true;
        class246.field3815 = true;
        class104.field1796 = false;
        class334.field5121 = class338.method2339((byte) -120);
    }

    @OriginalMember(owner = "client!ei", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 1221)
    public final AppletContext getAppletContext() {
        field3847++;
        if (class283.field4376 == null) {
            return class177.field2849 == null || class177.field2849.field2139 == this ? super.getAppletContext() : class177.field2849.field2139.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)V", line = 1236)
    private final void method1641(int arg0) {
        field3845++;
        long var2 = class338.method2339((byte) -120);
        long var4 = class32.field658[class254.field3964];
        class32.field658[class254.field3964] = var2;
        class254.field3964 = class254.field3964 + 1 & 0x1F;
        if (arg0 != 12727) {
            field3830 = (String) null;
        }
        synchronized (this) {
            class106.field1827 = class123.field2130;
        }
        this.method357(-21185);
        if (var4 != 0L && var2 > var4) {
        }
    }

    @OriginalMember(owner = "client!ei", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1268)
    public final void windowDeactivated(WindowEvent arg0) {
        field3852++;
    }

    @OriginalMember(owner = "client!ei", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1284)
    public final void windowClosing(WindowEvent arg0) {
        field3825++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ei", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 1298)
    public final URL getCodeBase() {
        field3854++;
        if (class283.field4376 == null) {
            return class177.field2849 == null || class177.field2849.field2139 == this ? super.getCodeBase() : class177.field2849.field2139.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1314)
    public final void windowDeiconified(WindowEvent arg0) {
        field3849++;
    }

    @OriginalMember(owner = "client!ei", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1323)
    public final void windowIconified(WindowEvent arg0) {
        field3838++;
    }

    @OriginalMember(owner = "client!ei", name = "start", descriptor = "()V", line = 1330)
    public final void start() {
        field3835++;
        if (class34.field691 == this && !class157.field2563) {
            class303.field4581 = 0L;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZIIILjava/lang/String;II)V", line = 1346)
    public final void method1642(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field3836++;
        try {
            class134.field2257 = arg2;
            class177.field2864 = arg2;
            class123.field2122 = 0;
            class88.field1658 = arg3;
            class61.field1183 = arg3;
            class252.field3951 = arg7;
            class34.field691 = this;
            class294.field4488 = 0;
            class283.field4376 = new Frame();
            class283.field4376.setTitle("Jagex");
            class283.field4376.setResizable(true);
            class283.field4376.addWindowListener(this);
            if (arg0 != 10) {
                this.paint((Graphics) null);
            }
            class283.field4376.setVisible(true);
            class283.field4376.toFront();
            Insets var9 = class283.field4376.getInsets();
            class283.field4376.setSize(var9.right + var9.left + class61.field1183, class177.field2864 - -var9.top + var9.bottom);
            class224.field3528 = class177.field2849 = new class124((Applet) null, arg6, arg5, arg4);
            class107 var10 = class177.field2849.method802(1, arg0 ^ 0xFFFFFFC7, this);
            while (var10.field1852 == 0) {
                class127.method843(arg0 - 59, 10L);
            }
            class52.field1050 = (Thread) var10.field1853;
        } catch (Exception var12) {
            class106.method694(var12, (String) null, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!ei", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 1388)
    public final String getParameter(String arg0) {
        field3839++;
        if (class283.field4376 == null) {
            return class177.field2849 == null || class177.field2849.field2139 == this ? super.getParameter(arg0) : class177.field2849.field2139.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1402)
    public final void focusGained(FocusEvent arg0) {
        field3841++;
        class123.field2130 = true;
        class246.field3815 = true;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIII)V", line = 1412)
    public static final void method1643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3820++;
        if (arg6 != 3467) {
            return;
        }
        if (arg5 == arg9 && arg4 == arg7 && arg2 == arg8 && arg1 == arg3) {
            class191.method1221(arg8, arg0, (byte) -127, arg7, arg5, arg3);
            return;
        }
        int var10 = arg5;
        int var11 = arg7;
        int var12 = arg9 * 3;
        int var13 = arg5 * 3;
        int var14 = arg4 * 3;
        int var15 = arg2 * 3;
        int var16 = arg7 * 3;
        int var17 = var15 + var13 - var12 - var12;
        int var18 = arg1 * 3;
        int var19 = arg8 + var12 - var15 - arg5;
        int var20 = arg3 + var14 - var18 - arg7;
        int var21 = var18 - (var14 + var14 - var16);
        int var22 = var12 - var13;
        int var23 = var14 - var16;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var17 * var25;
            int var28 = var20 * var26;
            int var29 = var21 * var25;
            int var30 = var19 * var26;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = arg7 + (var28 + var29 + var32 >> 12);
            int var34 = (var27 + var30 + var31 >> 12) + arg5;
            class191.method1221(var34, arg0, (byte) -26, var11, var10, var33);
            var10 = var34;
            var11 = var33;
        }
    }

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "(I)Z", line = 1492)
    public final boolean method1644(int arg0) {
        field3837++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
            if (arg0 != -27946) {
                field3821 = -89;
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1631(arg0 ^ 0xFFFF93F8, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1525)
    public final void windowOpened(WindowEvent arg0) {
        field3829++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public abstract void method345(int arg0);

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public abstract void method342(int arg0);

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public abstract void method357(int arg0);

    @OriginalMember(owner = "client!ei", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "(I)V")
    public abstract void method351(int arg0);

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "(I)V")
    public abstract void method343(int arg0);
}
