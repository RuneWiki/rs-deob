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

@OriginalClass("client!wd")
public abstract class class100 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "Z")
    private boolean field1719 = false;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1690 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lmb;")
    public static class96 field1686 = class243.method1708("l", (byte) 103);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lmb;")
    public static class96 field1682 = class243.method1708("Lade Konfiguration )2 ", (byte) 125);

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lmb;")
    private static class96 field1707 = class243.method1708(" from your ignore list first)3", (byte) 127);

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lmb;")
    public static class96 field1691 = field1707;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Z")
    public static boolean field1720;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Z")
    public static boolean field1721;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "[[Lw;")
    public static class107[][] field1704;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BZ)V")
    private final void method748(byte arg0, boolean arg1) {
        field1694++;
        synchronized (this) {
            if (class195.field3359) {
                return;
            }
            class195.field3359 = true;
        }
        if (class234.field4017.field2277 != null) {
            class234.field4017.field2277.destroy();
        }
        try {
            if (arg0 != 37) {
                this.method748((byte) -32, true);
            }
            this.method758(119);
        } catch (Exception var9) {
        }
        if (class3.field28 != null) {
            try {
                class3.field28.removeFocusListener(this);
                class3.field28.getParent().remove(class3.field28);
            } catch (Exception var8) {
            }
        }
        if (class234.field4017 != null) {
            try {
                class234.field4017.method945(-2637);
            } catch (Exception var7) {
            }
        }
        this.method764(arg0 + 32);
        if (class103.field1743 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!wd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1701++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lri;")
    public static final class36 method749(boolean arg0) {
        class197.field3435 = 0;
        if (arg0) {
            field1690 = -8;
        }
        field1698++;
        return class162.method1175(-1);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method750(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field1692++;
        try {
            if (arg4 >= -3) {
                this.focusGained((FocusEvent) null);
            }
            class163.field2891 = 0;
            class216.field3710 = this;
            class232.field3979 = arg0;
            class5.field109 = arg0;
            class215.field3697 = 0;
            class168.field2954 = arg1;
            class162.field2880 = arg1;
            class109.field2013 = arg2;
            class103.field1743 = new Frame();
            class103.field1743.setTitle("Jagex");
            class103.field1743.setResizable(true);
            class103.field1743.addWindowListener(this);
            class103.field1743.setVisible(true);
            class103.field1743.toFront();
            Insets var8 = class103.field1743.getInsets();
            class103.field1743.setSize(class5.field109 + var8.left + var8.right, class162.field2880 - -var8.top - -var8.bottom);
            class157.field2739 = class234.field4017 = new class123((Applet) null, arg5, arg3, arg6);
            class263 var9 = class234.field4017.method946(1, 0, this);
            while (var9.field4605 == 0) {
                class226.method1543(10L, -738);
            }
        } catch (Exception var11) {
            client.method815((String) null, (byte) -93, var11);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method751(String arg0, byte arg1) {
        field1709++;
        if (arg1 != -108) {
            method749(false);
        }
        if (this.field1719) {
            return;
        }
        this.field1719 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    private final void method752(byte arg0) {
        field1688++;
        long var2 = class155.method1133(126);
        long var4 = class89.field1487[class180.field3101];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class89.field1487[class180.field3101] = var2;
        class180.field3101 = class180.field3101 + 1 & 0x1F;
        if (arg0 == -121) {
            synchronized (this) {
                class37.field635 = class119.field2203;
            }
            this.method756(true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1697++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public abstract void method753(byte arg0);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method754(int arg0, int arg1) {
        field1699++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class78.field1329[arg0];
        int var3 = class79.field1346[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var4 = (int) class214.field3687[arg0];
        int var5 = class53.field927[arg0];
        long var6 = class214.field3687[arg0];
        if (var3 == 28) {
            class77.field1312++;
            boolean var8 = class2.method12(0, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 0, var5);
            if (!var8) {
                class2.method12(1, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var5);
            }
            class60.field1031 = 0;
            class186.field3255 = class167.field2950;
            class170.field2980 = 2;
            class215.field3704 = class272.field4722;
            class140.field2505.method1012((byte) -25, 177);
            class140.field2505.method1675(var5 + class196.field3383, -91);
            class140.field2505.method1632(true, var4);
            class140.field2505.method1675(class225.field3832 + var2, -108);
        }
        if (var3 == 3) {
            class237.field4082++;
            boolean var10 = class2.method12(0, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 0, var5);
            if (!var10) {
                class2.method12(1, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var5);
            }
            class170.field2980 = 2;
            class60.field1031 = 0;
            class215.field3704 = class272.field4722;
            class186.field3255 = class167.field2950;
            class140.field2505.method1012((byte) 88, 56);
            class140.field2505.method1675(class225.field3832 + var2, 69);
            class140.field2505.method1632(true, class196.field3383 + var5);
            class140.field2505.method1632(true, var4);
        }
        if (var3 == 33) {
            class173.field3025++;
            class140.field2505.method1012((byte) -23, 165);
            class140.field2505.method1629(32767, var4);
            class140.field2505.method1625((byte) -104, var2);
            class140.field2505.method1639(-91, var5);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 1005) {
            class60.field1031 = 0;
            class170.field2980 = 2;
            class215.field3704 = class272.field4722;
            class186.field3255 = class167.field2950;
            class197 var12 = class86.field1450[var4];
            if (var12 != null) {
                class229 var13 = var12.field3436;
                if (var13.field3926 != null) {
                    var13 = var13.method1560((byte) -74);
                }
                if (var13 != null) {
                    class152.field2674++;
                    class140.field2505.method1012((byte) -128, 230);
                    class140.field2505.method1629(32767, var13.field3920);
                }
            }
        }
        if (var3 == 35) {
            boolean var14 = class2.method12(0, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 0, var5);
            class110.field2032++;
            if (!var14) {
                class2.method12(1, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var5);
            }
            class170.field2980 = 2;
            class186.field3255 = class167.field2950;
            class60.field1031 = 0;
            class215.field3704 = class272.field4722;
            class140.field2505.method1012((byte) 97, 181);
            class140.field2505.method1629(32767, var4);
            class140.field2505.method1629(32767, class196.field3383 + var5);
            class140.field2505.method1632(true, class48.field851);
            class140.field2505.method1631(class133.field2382, (byte) 27);
            class140.field2505.method1675(class225.field3832 + var2, -104);
        }
        if (var3 == 50) {
            class107 var16 = class55.method408(var2, 251234864);
            boolean var17 = true;
            if (var16.field1869 > 0) {
                var17 = class52.method398(0, var16);
            }
            if (var17) {
                class140.field2505.method1012((byte) -128, 250);
                class140.field2505.method1625((byte) 36, var2);
                class62.field1060++;
            }
        }
        if (var3 == 34 && class85.method617(var6, var5, var2, 8324)) {
            class171.field2996++;
            class140.field2505.method1012((byte) 39, 152);
            class140.field2505.method1632(true, class225.field3832 + var2);
            class140.field2505.method1625((byte) 51, class133.field2382);
            class140.field2505.method1629(32767, class196.field3383 + var5);
            class140.field2505.method1675(class48.field851, -98);
            class140.field2505.method1629(32767, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var3 == 25) {
            class153.field2698++;
            class140.field2505.method1012((byte) -128, 148);
            class140.field2505.method1639(-103, var5);
            class140.field2505.method1675(var4, 77);
            class140.field2505.method1625((byte) -92, var2);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 37) {
            class47 var18 = class22.field371[var4];
            if (var18 != null) {
                class143.field2542++;
                class2.method12(1, class236.field4047.field4566[0], var18.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var18.field4528[0]);
                class186.field3255 = class167.field2950;
                class215.field3704 = class272.field4722;
                class170.field2980 = 2;
                class60.field1031 = 0;
                class140.field2505.method1012((byte) -122, 128);
                class140.field2505.method1639(-124, var4);
            }
        }
        if (var3 == 38) {
            class197 var19 = class86.field1450[var4];
            if (var19 != null) {
                class93.field1543++;
                class2.method12(1, class236.field4047.field4566[0], var19.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var19.field4528[0]);
                class215.field3704 = class272.field4722;
                class186.field3255 = class167.field2950;
                class60.field1031 = 0;
                class170.field2980 = 2;
                class140.field2505.method1012((byte) -123, 142);
                class140.field2505.method1675(var4, 71);
            }
        }
        if (var3 == 57) {
            class197 var20 = class86.field1450[var4];
            if (var20 != null) {
                class51.field889++;
                class2.method12(1, class236.field4047.field4566[0], var20.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var20.field4528[0]);
                class215.field3704 = class272.field4722;
                class60.field1031 = 0;
                class170.field2980 = 2;
                class186.field3255 = class167.field2950;
                class140.field2505.method1012((byte) 46, 147);
                class140.field2505.method1639(-124, var4);
            }
        }
        if (var3 == 15) {
            class47.method363(30797);
        }
        if (var3 == 44) {
            class140.field2505.method1012((byte) 65, 114);
            class140.field2505.method1642(var2, 255);
            class140.field2505.method1632(true, var4);
            class140.field2505.method1639(-99, var5);
            class48.field844++;
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 1006) {
            class60.field1031 = 0;
            class215.field3704 = class272.field4722;
            class186.field3255 = class167.field2950;
            class170.field2980 = 2;
            class140.field2505.method1012((byte) 89, 168);
            class109.field2012++;
            class140.field2505.method1675(var4, 101);
        }
        if (var3 == 16) {
            class47 var21 = class22.field371[var4];
            if (var21 != null) {
                class2.method12(1, class236.field4047.field4566[0], var21.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var21.field4528[0]);
                class60.field1031 = 0;
                class134.field2406++;
                class170.field2980 = 2;
                class186.field3255 = class167.field2950;
                class215.field3704 = class272.field4722;
                class140.field2505.method1012((byte) -2, 171);
                class140.field2505.method1629(32767, var4);
            }
        }
        if (var3 == 17) {
            class224.field3805++;
            boolean var22 = class2.method12(0, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 0, var5);
            if (!var22) {
                class2.method12(1, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var5);
            }
            class170.field2980 = 2;
            class60.field1031 = 0;
            class215.field3704 = class272.field4722;
            class186.field3255 = class167.field2950;
            class140.field2505.method1012((byte) -18, 179);
            class140.field2505.method1629(32767, class225.field3832 + var2);
            class140.field2505.method1639(-92, var4);
            class140.field2505.method1675(class196.field3383 + var5, -97);
            class140.field2505.method1653(-157537144, class93.field1545);
            class140.field2505.method1639(-111, class195.field3350);
            class140.field2505.method1632(true, class239.field4145);
        }
        if (var3 == 13) {
            class140.field2505.method1012((byte) -28, 132);
            class140.field2505.method1632(true, var4);
            class89.field1479++;
            class140.field2505.method1653(-157537144, var2);
            class140.field2505.method1675(var5, 103);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 39) {
            class47 var24 = class22.field371[var4];
            if (var24 != null) {
                class2.method12(1, class236.field4047.field4566[0], var24.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var24.field4528[0]);
                class170.field2980 = 2;
                class232.field3978++;
                class186.field3255 = class167.field2950;
                class60.field1031 = 0;
                class215.field3704 = class272.field4722;
                class140.field2505.method1012((byte) -124, 197);
                class140.field2505.method1675(var4, 107);
            }
        }
        if (var3 == 29) {
            class197 var25 = class86.field1450[var4];
            if (var25 != null) {
                class227.field3864++;
                class2.method12(1, class236.field4047.field4566[0], var25.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var25.field4528[0]);
                class215.field3704 = class272.field4722;
                class60.field1031 = 0;
                class170.field2980 = 2;
                class186.field3255 = class167.field2950;
                class140.field2505.method1012((byte) -124, 21);
                class140.field2505.method1632(true, var4);
            }
        }
        if (var3 == 26) {
            class140.field2505.method1012((byte) -122, 250);
            class62.field1060++;
            class140.field2505.method1625((byte) 112, var2);
            class107 var26 = class55.method408(var2, 251234864);
            if (var26.field1877 != null && var26.field1877[0][0] == 5) {
                int var27 = var26.field1877[0][1];
                class54.field937[var27] = 1 - class54.field937[var27];
                class235.method1593((byte) -3, var27);
            }
        }
        if (var3 == 43) {
            class101.field1725++;
            class85.method617(var6, var5, var2, 8324);
            class140.field2505.method1012((byte) -126, 208);
            class140.field2505.method1675((int) (var6 >>> 32) & Integer.MAX_VALUE, 113);
            class140.field2505.method1639(-126, class196.field3383 + var5);
            class140.field2505.method1675(class225.field3832 + var2, 45);
        }
        if (var3 == 14) {
            class71.method483(-64);
            class107 var28 = class55.method408(var2, 251234864);
            class93.field1545 = var2;
            class195.field3350 = var5;
            class239.field4145 = var4;
            class148.field2616 = 1;
            class53.method403(-93, var28);
            class178.field3075 = class36.method289(-5615, new class96[] { class91.field1513, class269.method1845(var4, (byte) 61).field2779, class211.field3628 });
            if (class178.field3075 == null) {
                class178.field3075 = class156.field2723;
            }
            return;
        }
        if (var3 == 58) {
            class140.field2505.method1012((byte) -126, 246);
            class25.field421++;
            class140.field2505.method1653(-157537144, var2);
            class140.field2505.method1629(32767, var5);
            class140.field2505.method1639(-103, var4);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 20) {
            class197 var29 = class86.field1450[var4];
            if (var29 != null) {
                class186.field3228++;
                class2.method12(1, class236.field4047.field4566[0], var29.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var29.field4528[0]);
                class170.field2980 = 2;
                class60.field1031 = 0;
                class186.field3255 = class167.field2950;
                class215.field3704 = class272.field4722;
                class140.field2505.method1012((byte) -119, 182);
                class140.field2505.method1632(true, class239.field4145);
                class140.field2505.method1629(32767, class195.field3350);
                class140.field2505.method1639(-119, var4);
                class140.field2505.method1642(class93.field1545, 255);
            }
        }
        if (var3 == 1001) {
            class186.field3255 = class167.field2950;
            class215.field3704 = class272.field4722;
            class60.field1031 = 0;
            class170.field2980 = 2;
            class140.field2505.method1012((byte) 93, 24);
            class140.field2505.method1639(-92, var4);
            class101.field1733++;
        }
        if (var3 == 48) {
            class251.field4348++;
            class85.method617(var6, var5, var2, 8324);
            class140.field2505.method1012((byte) -123, 202);
            class140.field2505.method1632(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class140.field2505.method1632(true, var2 + class225.field3832);
            class140.field2505.method1629(32767, class196.field3383 + var5);
        }
        if (var3 == 45) {
            class140.field2505.method1012((byte) -119, 250);
            class140.field2505.method1625((byte) -95, var2);
            class107 var30 = class55.method408(var2, 251234864);
            class62.field1060++;
            if (var30.field1877 != null && var30.field1877[0][0] == 5) {
                int var31 = var30.field1877[0][1];
                if (class54.field937[var31] != var30.field1808[0]) {
                    class54.field937[var31] = var30.field1808[0];
                    class235.method1593((byte) -3, var31);
                }
            }
        }
        if (var3 == 10) {
            class107 var32 = class1.method7(var2, var5, -88);
            if (var32 != null) {
                class71.method483(-64);
                class260.method1793(class140.method1041(client.method817(var32), 32677), var5, var2, false);
                class148.field2616 = 0;
                class75.field1302 = class144.method1064(-1, var32);
                if (class75.field1302 == null) {
                    class75.field1302 = class226.field3839;
                }
                if (!var32.field1867) {
                    class138.field2478 = class36.method289(-5615, new class96[] { class77.field1323, var32.field1821, class211.field3628 });
                    return;
                }
                class138.field2478 = class36.method289(-5615, new class96[] { var32.field1812, class211.field3628 });
            }
            return;
        }
        if (var3 == 23) {
            class47 var33 = class22.field371[var4];
            if (var33 != null) {
                class121.field2229++;
                class2.method12(1, class236.field4047.field4566[0], var33.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var33.field4528[0]);
                class186.field3255 = class167.field2950;
                class215.field3704 = class272.field4722;
                class60.field1031 = 0;
                class170.field2980 = 2;
                class140.field2505.method1012((byte) -122, 247);
                class140.field2505.method1675(var4, 24);
            }
        }
        if (var3 == 4) {
            class197 var34 = class86.field1450[var4];
            if (var34 != null) {
                class97.field1633++;
                class2.method12(1, class236.field4047.field4566[0], var34.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var34.field4528[0]);
                class186.field3255 = class167.field2950;
                class60.field1031 = 0;
                class215.field3704 = class272.field4722;
                class170.field2980 = 2;
                class140.field2505.method1012((byte) -119, 42);
                class140.field2505.method1632(true, class48.field851);
                class140.field2505.method1675(var4, 12);
                class140.field2505.method1642(class133.field2382, 255);
            }
        }
        if (var3 == 1003) {
            class61.field1048++;
            class85.method617(var6, var5, var2, 8324);
            class140.field2505.method1012((byte) -20, 150);
            class140.field2505.method1632(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class140.field2505.method1632(true, var5 + class196.field3383);
            class140.field2505.method1675(class225.field3832 + var2, -96);
        }
        if (var3 == 46) {
            class229.field3883++;
            class140.field2505.method1012((byte) 123, 112);
            class140.field2505.method1629(32767, var5);
            class140.field2505.method1639(-118, var4);
            class140.field2505.method1631(var2, (byte) 27);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 8) {
            class140.field2505.method1012((byte) -128, 213);
            class265.field4619++;
            class140.field2505.method1642(var2, 255);
            class140.field2505.method1632(true, class48.field851);
            class140.field2505.method1632(true, var5);
            class140.field2505.method1625((byte) 72, class133.field2382);
        }
        if (var3 == 1007) {
            class107 var35 = class55.method408(var2, 251234864);
            if (var35 == null || var35.field1949[var5] < 100000) {
                class101.field1733++;
                class140.field2505.method1012((byte) -128, 24);
                class140.field2505.method1639(-100, var4);
            } else {
                class226.method1540(class120.field2227, 0, (byte) 88, class36.method289(-5615, new class96[] { class31.method205(var35.field1949[var5], (byte) -78), class201.field3490, class269.method1845(var4, (byte) 61).field2779 }));
            }
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 18) {
            class259.field4501++;
            class140.field2505.method1012((byte) 102, 143);
            class140.field2505.method1629(32767, var5);
            class140.field2505.method1642(var2, 255);
            class140.field2505.method1632(true, var4);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 11) {
            class239.field4126++;
            boolean var36 = class2.method12(0, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 0, var5);
            if (!var36) {
                class2.method12(1, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var5);
            }
            class60.field1031 = 0;
            class170.field2980 = 2;
            class186.field3255 = class167.field2950;
            class215.field3704 = class272.field4722;
            class140.field2505.method1012((byte) 97, 81);
            class140.field2505.method1632(true, var4);
            class140.field2505.method1675(class225.field3832 + var2, -106);
            class140.field2505.method1632(true, class196.field3383 + var5);
        }
        if (var3 == 51) {
            class140.field2505.method1012((byte) -127, 157);
            class222.field3791++;
            class140.field2505.method1632(true, var5);
            class140.field2505.method1642(var2, 255);
            class140.field2505.method1675(var4, -118);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 12) {
            class140.field2505.method1012((byte) 26, 218);
            class140.field2505.method1639(-88, var4);
            class38.field656++;
            class140.field2505.method1629(32767, var5);
            class140.field2505.method1653(-157537144, var2);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 22 && class85.method617(var6, var5, var2, 8324)) {
            class140.field2505.method1012((byte) -29, 44);
            class173.field3024++;
            class140.field2505.method1675(class225.field3832 + var2, -93);
            class140.field2505.method1629(32767, class239.field4145);
            class140.field2505.method1631(class93.field1545, (byte) 27);
            class140.field2505.method1639(-117, class195.field3350);
            class140.field2505.method1639(-114, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class140.field2505.method1629(32767, class196.field3383 + var5);
        }
        if (var3 == 31) {
            class140.field2505.method1012((byte) -125, 252);
            class171.field2993++;
            class140.field2505.method1639(-111, var5);
            class140.field2505.method1642(var2, 255);
            class140.field2505.method1639(-96, var4);
            class140.field2505.method1625((byte) 50, class133.field2382);
            class140.field2505.method1675(class48.field851, 104);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 5) {
            class267.method1833(class216.field3712, var5, var2);
        }
        if (var3 == 21) {
            class244.field4238 = true;
            class267.method1833(class216.field3712, var5, var2);
        }
        if (var3 == 59) {
            class197 var38 = class86.field1450[var4];
            if (var38 != null) {
                class2.method12(1, class236.field4047.field4566[0], var38.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var38.field4528[0]);
                class215.field3704 = class272.field4722;
                class186.field3255 = class167.field2950;
                class60.field1031 = 0;
                class170.field2980 = 2;
                class140.field2505.method1012((byte) -126, 170);
                class140.field2505.method1639(-125, var4);
                class41.field701++;
            }
        }
        if (var3 == 41) {
            class47 var39 = class22.field371[var4];
            if (var39 != null) {
                class36.field616++;
                class2.method12(1, class236.field4047.field4566[0], var39.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var39.field4528[0]);
                class60.field1031 = 0;
                class186.field3255 = class167.field2950;
                class215.field3704 = class272.field4722;
                class170.field2980 = 2;
                class140.field2505.method1012((byte) -120, 205);
                class140.field2505.method1632(true, var4);
                class140.field2505.method1642(class133.field2382, 255);
                class140.field2505.method1632(true, class48.field851);
            }
        }
        int var40 = 113 / ((67 - arg1) / 46);
        if (var3 == 2 || var3 == 1004) {
            class85.method615(class192.field3316[arg0], var4, var2, var5, true);
        }
        if (var3 == 1) {
            class197 var41 = class86.field1450[var4];
            if (var41 != null) {
                class1.field5++;
                class2.method12(1, class236.field4047.field4566[0], var41.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var41.field4528[0]);
                class215.field3704 = class272.field4722;
                class186.field3255 = class167.field2950;
                class170.field2980 = 2;
                class60.field1031 = 0;
                class140.field2505.method1012((byte) 34, 123);
                class140.field2505.method1632(true, var4);
            }
        }
        if (var3 == 32) {
            boolean var42 = class2.method12(0, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 0, var5);
            class64.field1090++;
            if (!var42) {
                class2.method12(1, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var5);
            }
            class170.field2980 = 2;
            class215.field3704 = class272.field4722;
            class186.field3255 = class167.field2950;
            class60.field1031 = 0;
            class140.field2505.method1012((byte) -127, 219);
            class140.field2505.method1675(var4, -95);
            class140.field2505.method1629(32767, var5 + class196.field3383);
            class140.field2505.method1629(32767, class225.field3832 + var2);
        }
        if (var3 == 7) {
            class47 var44 = class22.field371[var4];
            if (var44 != null) {
                class152.field2670++;
                class2.method12(1, class236.field4047.field4566[0], var44.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var44.field4528[0]);
                class60.field1031 = 0;
                class186.field3255 = class167.field2950;
                class170.field2980 = 2;
                class215.field3704 = class272.field4722;
                class140.field2505.method1012((byte) 120, 49);
                class140.field2505.method1632(true, var4);
            }
        }
        if (var3 == 36) {
            class47 var45 = class22.field371[var4];
            if (var45 != null) {
                class145.field2571++;
                class2.method12(1, class236.field4047.field4566[0], var45.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var45.field4528[0]);
                class170.field2980 = 2;
                class60.field1031 = 0;
                class215.field3704 = class272.field4722;
                class186.field3255 = class167.field2950;
                class140.field2505.method1012((byte) 40, 65);
                class140.field2505.method1629(32767, var4);
            }
        }
        if (var3 == 30) {
            class178.field3080++;
            class140.field2505.method1012((byte) -123, 0);
            class140.field2505.method1631(var2, (byte) 27);
            class140.field2505.method1632(true, class239.field4145);
            class140.field2505.method1642(class93.field1545, 255);
            class140.field2505.method1629(32767, var5);
            class140.field2505.method1632(true, var4);
            class140.field2505.method1632(true, class195.field3350);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 24) {
            class159.field2759++;
            boolean var46 = class2.method12(0, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 0, var5);
            if (!var46) {
                class2.method12(1, class236.field4047.field4566[0], var2, (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var5);
            }
            class170.field2980 = 2;
            class215.field3704 = class272.field4722;
            class186.field3255 = class167.field2950;
            class60.field1031 = 0;
            class140.field2505.method1012((byte) 45, 161);
            class140.field2505.method1629(32767, class196.field3383 + var5);
            class140.field2505.method1632(true, class225.field3832 + var2);
            class140.field2505.method1629(32767, var4);
        }
        if (var3 == 19) {
            class47 var48 = class22.field371[var4];
            if (var48 != null) {
                class236.field4044++;
                class2.method12(1, class236.field4047.field4566[0], var48.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var48.field4528[0]);
                class170.field2980 = 2;
                class60.field1031 = 0;
                class186.field3255 = class167.field2950;
                class215.field3704 = class272.field4722;
                class140.field2505.method1012((byte) -126, 90);
                class140.field2505.method1675(var4, 37);
            }
        }
        if (var3 == 47) {
            class47 var49 = class22.field371[var4];
            if (var49 != null) {
                class264.field4615++;
                class2.method12(1, class236.field4047.field4566[0], var49.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var49.field4528[0]);
                class60.field1031 = 0;
                class215.field3704 = class272.field4722;
                class186.field3255 = class167.field2950;
                class170.field2980 = 2;
                class140.field2505.method1012((byte) 71, 83);
                class140.field2505.method1675(var4, 60);
            }
        }
        if (var3 == 40) {
            class277.field4817++;
            class85.method617(var6, var5, var2, 8324);
            class140.field2505.method1012((byte) -122, 61);
            class140.field2505.method1632(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class140.field2505.method1629(32767, var2 + class225.field3832);
            class140.field2505.method1675(class196.field3383 + var5, 49);
        }
        if (var3 == 6) {
            class45.field779++;
            class140.field2505.method1012((byte) -125, 97);
            class140.field2505.method1629(32767, var5);
            class140.field2505.method1639(-83, var4);
            class140.field2505.method1653(-157537144, var2);
            class193.field3334 = 0;
            class169.field2968 = class55.method408(var2, 251234864);
            class116.field2165 = var5;
        }
        if (var3 == 9 && class27.field459 == null) {
            class193.method1346(var5, (byte) -72, var2);
            class27.field459 = class1.method7(var2, var5, -125);
            class53.method403(-85, class27.field459);
        }
        if (var3 == 42) {
            class47 var50 = class22.field371[var4];
            if (var50 != null) {
                class32.field508++;
                class2.method12(1, class236.field4047.field4566[0], var50.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var50.field4528[0]);
                class170.field2980 = 2;
                class60.field1031 = 0;
                class215.field3704 = class272.field4722;
                class186.field3255 = class167.field2950;
                class140.field2505.method1012((byte) 117, 188);
                class140.field2505.method1675(class195.field3350, -94);
                class140.field2505.method1639(-92, var4);
                class140.field2505.method1632(true, class239.field4145);
                class140.field2505.method1653(-157537144, class93.field1545);
            }
        }
        if (var3 == 49) {
            class85.method617(var6, var5, var2, 8324);
            class229.field3903++;
            class140.field2505.method1012((byte) 116, 31);
            class140.field2505.method1632(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class140.field2505.method1632(true, class225.field3832 + var2);
            class140.field2505.method1675(class196.field3383 + var5, -116);
        }
        if (class148.field2616 != 0) {
            class148.field2616 = 0;
            class53.method403(-68, class55.method408(class93.field1545, 251234864));
        }
        if (class124.field2301) {
            class71.method483(-64);
        }
        if (class169.field2968 != null && class193.field3334 == 0) {
            class53.method403(-111, class169.field2968);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public abstract void method755(int arg0);

    @OriginalMember(owner = "client!wd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1685++;
    }

    @OriginalMember(owner = "client!wd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!wd", name = "providesignlink", descriptor = "(Lgd;)V")
    public static final void providesignlink(class123 arg0) {
        class234.field4017 = arg0;
        class157.field2739 = arg0;
        field1716++;
    }

    @OriginalMember(owner = "client!wd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1705++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public abstract void method756(boolean arg0);

    @OriginalMember(owner = "client!wd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1695++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    private final void method757(int arg0) {
        field1713++;
        long var2 = class50.field876[class203.field3522];
        long var4 = class155.method1133(arg0 + 128);
        class50.field876[class203.field3522] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class53.field925 = ((var6 >> 1) + 32000) / var6;
        }
        class203.field3522 = class203.field3522 - arg0 & 0x1F;
        if ((class83.field1415++) > 50) {
            class83.field1415 -= 50;
            class41.field694 = true;
            class3.field28.setSize(class232.field3979, class168.field2954);
            class3.field28.setVisible(true);
            if (class103.field1743 != null && class207.field3571 == null) {
                Insets var7 = class103.field1743.getInsets();
                class3.field28.setLocation(var7.left + class163.field2891, class215.field3697 + var7.top);
            } else {
                class3.field28.setLocation(class163.field2891, class215.field3697);
            }
        }
        this.method753((byte) 88);
    }

    @OriginalMember(owner = "client!wd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1684++;
        class119.field2203 = true;
        class41.field694 = true;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public abstract void method758(int arg0);

    @OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
    public final void run() {
        field1715++;
        try {
            if (class123.field2278 != null) {
                String var1 = class123.field2278.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class123.field2286;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method751("wrongjava", (byte) -108);
                        return;
                    }
                    class150.field2633 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class123.field2286 == null || class123.field2286.equals("1.4.2"))) {
                    this.method751("wrongjava", (byte) -108);
                    return;
                }
            }
            if (class123.field2286 != null && class123.field2286.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class123.field2286.length()) {
                    char var5 = class123.field2286.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class107.field1854 = true;
                }
            }
            if (class234.field4017.field2277 != null) {
                Method var6 = class123.field2292;
                if (var6 != null) {
                    try {
                        var6.invoke(class234.field4017.field2277, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method762(19064);
            class85.field1442 = class156.method1136(class3.field28, class168.field2954, -19558, class232.field3979);
            this.method755(-36);
            class209.field3607 = class21.method153(-22088);
            while (class260.field4570 == 0L || class260.field4570 > class155.method1133(125)) {
                class106.field1776 = class209.field3607.method419(class19.field319, -124, class150.field2633);
                for (int var7 = 0; var7 < class106.field1776; var7++) {
                    this.method752((byte) -121);
                }
                this.method757(-1);
                class207.method1430(class3.field28, 82, class234.field4017);
            }
        } catch (Exception var10) {
            client.method815((String) null, (byte) -104, var10);
            this.method751("crash", (byte) -108);
        }
        this.method748((byte) 37, true);
    }

    @OriginalMember(owner = "client!wd", name = "start", descriptor = "()V")
    public final void start() {
        field1702++;
        if (class216.field3710 == this && !class195.field3359) {
            class260.field4570 = 0L;
        }
    }

    @OriginalMember(owner = "client!wd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1708++;
        if (class216.field3710 == this && !class195.field3359) {
            class260.field4570 = class155.method1133(126);
            class226.method1543(5000L, -738);
            class157.field2739 = null;
            this.method748((byte) 37, false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
    public final void method759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1717++;
        try {
            if (class216.field3710 == null) {
                class215.field3697 = 0;
                class232.field3979 = arg3;
                class5.field109 = arg3;
                class163.field2891 = 0;
                class109.field2013 = arg2;
                class168.field2954 = arg0;
                class162.field2880 = arg0;
                class216.field3710 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class234.field4017 == null) {
                    class157.field2739 = class234.field4017 = new class123(this, arg4, (String) null, 0);
                }
                class263 var7 = class234.field4017.method946(1, arg1 ^ arg1, this);
                while (var7.field4605 == 0) {
                    class226.method1543(10L, -738);
                }
            } else {
                class150.field2645++;
                if (class150.field2645 >= 3) {
                    this.method751("alreadyloaded", (byte) -108);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            client.method815((String) null, (byte) -114, var9);
            this.method751("crash", (byte) -108);
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)Z")
    public final boolean method760(int arg0) {
        field1703++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 >= -36) {
            return false;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method751("invalidhost", (byte) -108);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field1682 = null;
        field1691 = null;
        field1707 = null;
        if (arg0 != 10) {
            providesignlink((class123) null);
        }
        field1704 = null;
        field1686 = null;
    }

    @OriginalMember(owner = "client!wd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1711++;
        if (class103.field1743 == null) {
            return class234.field4017 == null || class234.field4017.field2277 == this ? super.getParameter(arg0) : class234.field4017.field2277.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public final synchronized void method762(int arg0) {
        field1689++;
        if (class3.field28 != null) {
            class3.field28.removeFocusListener(this);
            class3.field28.getParent().remove(class3.field28);
        }
        Container var2;
        if (class207.field3571 != null) {
            var2 = class207.field3571;
        } else if (class103.field1743 == null) {
            var2 = class234.field4017.field2277;
        } else {
            var2 = class103.field1743;
        }
        var2.setLayout((LayoutManager) null);
        class3.field28 = new class26(this);
        var2.add(class3.field28);
        class3.field28.setSize(class232.field3979, class168.field2954);
        class3.field28.setVisible(true);
        if (class103.field1743 == var2) {
            Insets var3 = class103.field1743.getInsets();
            class3.field28.setLocation(class163.field2891 + var3.left, class215.field3697 + var3.top);
        } else {
            class3.field28.setLocation(class163.field2891, class215.field3697);
        }
        class3.field28.addFocusListener(this);
        class3.field28.requestFocus();
        class119.field2203 = true;
        class41.field694 = true;
        if (arg0 == 19064) {
            class38.field670 = false;
            class37.field635 = true;
            class43.field742 = class155.method1133(127);
        }
    }

    @OriginalMember(owner = "client!wd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1706++;
    }

    @OriginalMember(owner = "client!wd", name = "stop", descriptor = "()V")
    public final void stop() {
        field1718++;
        if (class216.field3710 == this && !class195.field3359) {
            class260.field4570 = class155.method1133(125) + 4000L;
        }
    }

    @OriginalMember(owner = "client!wd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1683++;
        this.destroy();
    }

    @OriginalMember(owner = "client!wd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1714++;
        if (class103.field1743 == null) {
            return class234.field4017 == null || class234.field4017.field2277 == this ? super.getAppletContext() : class234.field4017.field2277.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1696++;
        if (class103.field1743 == null) {
            return class234.field4017 == null || class234.field4017.field2277 == this ? super.getDocumentBase() : class234.field4017.field2277.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1712++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZIII)V")
    public static final void method763(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        field1710++;
        if (arg4 != 2) {
            return;
        }
        class140.field2512 = (short) arg3;
        if (arg1 < 1) {
            arg1 = 1;
        }
        class139.field2488 = (short) arg1;
    }

    @OriginalMember(owner = "client!wd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class119.field2203 = false;
        field1693++;
    }

    @OriginalMember(owner = "client!wd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1687++;
        if (class216.field3710 != this || class195.field3359) {
            return;
        }
        class41.field694 = true;
        if (class107.field1854 && class155.method1133(125) - class43.field742 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class5.field109 <= var2.width && class162.field2880 <= var2.height) {
                class38.field670 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1700++;
        if (class103.field1743 == null) {
            return class234.field4017 == null || class234.field4017.field2277 == this ? super.getCodeBase() : class234.field4017.field2277.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    public abstract void method764(int arg0);
}
