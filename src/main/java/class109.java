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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class109 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Z")
    private boolean field2636 = false;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "B")
    public static byte field2606 = 0;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[J")
    public static long[] field2609 = new long[200];

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lae;")
    public static class6 field2627 = class64.method474(119, "m");

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lm;")
    public static class77 field2625 = new class77(8);

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Lae;")
    private static class6 field2644 = class64.method474(120, "Loading title screen )2 ");

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lae;")
    public static class6 field2648 = field2644;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lae;")
    private static class6 field2647 = class64.method474(117, "Attack");

    @OriginalMember(owner = "client!re", name = "N", descriptor = "Lae;")
    public static class6 field2645 = field2647;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
    public static boolean field2650;

    @OriginalMember(owner = "client!re", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 3)
    public final void windowClosing(WindowEvent arg0) {
        field2616++;
        this.destroy();
    }

    @OriginalMember(owner = "client!re", name = "start", descriptor = "()V", line = 12)
    public final void start() {
        field2622++;
        if (class40.field896 == this && !class122.field3013) {
            class24.field612 = 0L;
        }
    }

    @OriginalMember(owner = "client!re", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 26)
    public final String getParameter(String arg0) {
        field2631++;
        if (class18.field349 == null) {
            return class64.field1391 == null || class64.field1391.field766 == this ? super.getParameter(arg0) : class64.field1391.field766.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 48)
    public final void focusGained(FocusEvent arg0) {
        field2617++;
        class82.field2011 = true;
        class32.field772 = true;
    }

    @OriginalMember(owner = "client!re", name = "run", descriptor = "()V", line = 59)
    public final void run() {
        field2611++;
        try {
            if (class31.field751 != null) {
                String var1 = class31.field751.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class31.field757;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method919((byte) 25, "wrongjava");
                        return;
                    }
                    class51.field1160 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class31.field757 == null || class31.field757.equals("1.4.2"))) {
                    this.method919((byte) 25, "wrongjava");
                    return;
                }
            }
            if (class64.field1391.field766 != null) {
                Method var3 = class31.field767;
                if (var3 != null) {
                    try {
                        var3.invoke(class64.field1391.field766, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method926(54);
            class60.field1313 = class105.method890(class70.field1564, class117.field2766, class95.field2253, (byte) -120);
            this.method204(false);
            class138.field3361 = class114.method944((byte) 89);
            class138.field3361.method435((byte) -50);
            while (class24.field612 == 0L || class5.method22(111) < class24.field612) {
                class5.field64 = class138.field3361.method432(4, class51.field1160, class24.field607);
                for (int var4 = 0; var4 < class5.field64; var4++) {
                    this.method917(-1);
                }
                this.method928((byte) 90);
            }
        } catch (Exception var7) {
            class78.method675(var7, 64, null);
            this.method919((byte) 25, "crash");
        }
        this.method925((byte) 77);
    }

    @OriginalMember(owner = "client!re", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 141)
    public final void windowDeiconified(WindowEvent arg0) {
        field2641++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 148)
    private final void method917(int arg0) {
        field2629++;
        long var2 = class5.method22(arg0 ^ 0xFFFFFF85);
        long var4 = class137.field3327[class65.field1422];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class137.field3327[class65.field1422] = var2;
        class65.field1422 = class65.field1422 - arg0 & 0x1F;
        synchronized (this) {
            class79.field1907 = class82.field2011;
        }
        this.method203((byte) 19);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V", line = 174)
    public final void method918(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2635++;
        if (arg0 != 48) {
            return;
        }
        try {
            if (class40.field896 == null) {
                class138.field3353 = arg3;
                class95.field2253 = arg1;
                class117.field2766 = arg4;
                class40.field896 = this;
                if (class64.field1391 == null) {
                    class12.field227 = class64.field1391 = new class31(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg2, null, 0);
                }
                class64.field1391.method280(-113, this, 1);
            } else {
                class35.field832++;
                if (class35.field832 >= 3) {
                    this.method919((byte) 25, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var7) {
            class78.method675(var7, 64, null);
            this.method919((byte) 25, "crash");
        }
    }

    @OriginalMember(owner = "client!re", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 213)
    public final void windowIconified(WindowEvent arg0) {
        field2633++;
    }

    @OriginalMember(owner = "client!re", name = "providesignlink", descriptor = "(Led;)V", line = 220)
    public static final void providesignlink(class31 arg0) {
        field2607++;
        class64.field1391 = arg0;
        class12.field227 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/lang/String;)V", line = 229)
    public final void method919(byte arg0, String arg1) {
        field2623++;
        if (this.field2636) {
            return;
        }
        this.field2636 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
        if (arg0 != 25) {
            field2648 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 252)
    public final AppletContext getAppletContext() {
        field2613++;
        if (class18.field349 == null) {
            return class64.field1391 == null || class64.field1391.field766 == this ? super.getAppletContext() : class64.field1391.field766.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 272)
    public static void method920(byte arg0) {
        field2625 = null;
        field2609 = null;
        field2627 = null;
        field2645 = null;
        field2647 = null;
        field2648 = null;
        field2644 = null;
        if (arg0 > -14) {
            method923(null, (byte) 30, 18, -56);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/net/InetAddress;Ljava/lang/String;IIIII)V", line = 292)
    public final void method921(int arg0, InetAddress arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2634++;
        try {
            class40.field896 = this;
            class138.field3353 = arg0;
            class95.field2253 = arg4;
            class117.field2766 = arg3;
            class18.field349 = new Frame();
            if (arg6 >= -94) {
                this.method200(-35);
            }
            class18.field349.setTitle("Jagex");
            class18.field349.setResizable(false);
            class18.field349.addWindowListener(this);
            class18.field349.setVisible(true);
            class18.field349.toFront();
            Insets var9 = class18.field349.getInsets();
            class18.field349.setSize(var9.left + arg3 + var9.right, var9.top + arg4 + var9.bottom);
            class12.field227 = class64.field1391 = new class31(true, null, arg1, arg7, arg2, arg5);
            class64.field1391.method280(-71, this, 1);
        } catch (Exception var11) {
            class78.method675(var11, 64, null);
        }
    }

    @OriginalMember(owner = "client!re", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 324)
    public final URL getCodeBase() {
        field2619++;
        if (class18.field349 == null) {
            return class64.field1391 == null || class64.field1391.field766 == this ? super.getCodeBase() : class64.field1391.field766.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIBILqc;)V", line = 340)
    public static final void method922(int arg0, int arg1, byte arg2, int arg3, class100 arg4) {
        field2620++;
        if (class85.field2058 >= 400) {
            return;
        }
        if (arg4.field2361 != null) {
            arg4 = arg4.method842(5585);
        }
        if (arg4 == null || !arg4.field2370) {
            return;
        }
        class6 var5 = arg4.field2364;
        if (arg4.field2332 != 0) {
            var5 = class85.method731(new class6[] { var5, class51.method407(class12.field229.field1436, arg4.field2332, false), class134.field3264, client.field469, class114.method942((byte) 71, arg4.field2332), class105.field2500 }, 14569);
        }
        if (class19.field382 == 1) {
            class5.field57++;
            class6.method26(arg0, class76.field1792, arg3, class85.method731(new class6[] { class96.field2290, class64.field1415, var5 }, 14569), (byte) -64, arg1, 47);
        } else if (!class117.field2783) {
            class49.field1107++;
            class6[] var6 = arg4.field2343;
            if (class82.field2012) {
                var6 = class26.method233((byte) 127, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method68(field2645, -66)) {
                        class35.field823++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 42;
                        }
                        if (var7 == 1) {
                            var8 = 17;
                        }
                        if (var7 == 2) {
                            var8 = 13;
                        }
                        if (var7 == 3) {
                            var8 = 53;
                        }
                        if (var7 == 4) {
                            var8 = 46;
                        }
                        class6.method26(arg0, var6[var7], arg3, class85.method731(new class6[] { class30.field728, var5 }, 14569), (byte) -73, arg1, var8);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method68(field2645, -66)) {
                        class27.field673++;
                        int var10 = 0;
                        short var11 = 0;
                        if (class12.field229.field1436 < arg4.field2332) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 42;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 17;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 13;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 53;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 46;
                        }
                        class6.method26(arg0, var6[var9], arg3, class85.method731(new class6[] { class30.field728, var5 }, 14569), (byte) -127, arg1, var10);
                    }
                }
            }
            class6.method26(arg0, class25.field636, arg3, class85.method731(new class6[] { class30.field728, var5 }, 14569), (byte) -15, arg1, 1001);
        } else if ((class70.field1562 & 0x2) == 2) {
            class40.field897++;
            class6.method26(arg0, client.field472, arg3, class85.method731(new class6[] { class20.field395, class64.field1415, var5 }, 14569), (byte) -116, arg1, 48);
        }
        int var12 = 110 / ((arg2 + 46) / 33);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lkd;BII)V", line = 482)
    public static final void method923(class66 arg0, byte arg1, int arg2, int arg3) {
        field2626++;
        if ((arg3 & 0x40) != 0) {
            int var4 = class85.field2051.method624((byte) 48);
            byte[] var5 = new byte[var4];
            class77 var6 = new class77(var5);
            class85.field2051.method617(var5, var4, -25923, 0);
            class117.field2789[arg2] = var6;
            arg0.method483((byte) -66, var6);
        }
        if ((arg3 & 0x100) != 0) {
            arg0.field1767 = class85.field2051.method640(39);
            arg0.field1742 = class85.field2051.method651((byte) 109);
            arg0.field1758 = class85.field2051.method640(50);
            arg0.field1756 = class85.field2051.method640(40);
            arg0.field1727 = class85.field2051.method669((byte) 127) + class5.field61;
            arg0.field1736 = class85.field2051.method669((byte) 125) + class5.field61;
            arg0.field1772 = class85.field2051.method651((byte) -122);
            arg0.method613(0);
        }
        if ((arg3 & 0x200) != 0) {
            arg0.field1746 = class85.field2051.method636(110);
            int var7 = class85.field2051.method648(788075800);
            arg0.field1748 = (var7 & 0xFFFF) + class5.field61;
            if (arg0.field1746 == 65535) {
                arg0.field1746 = -1;
            }
            arg0.field1786 = 0;
            arg0.field1754 = 0;
            arg0.field1768 = var7 >> 16;
            if (class5.field61 < arg0.field1748) {
                arg0.field1754 = -1;
            }
        }
        if (arg1 < 43) {
            return;
        }
        if ((arg3 & 0x1) != 0) {
            arg0.field1775 = class85.field2051.method660((byte) -12);
            if (arg0.field1775.method61(0, -32011) == 126) {
                arg0.field1775 = arg0.field1775.method56(-58, 1);
                class73.method575(arg0.field1456, arg0.field1775, false, 2);
            } else if (class12.field229 == arg0) {
                class73.method575(arg0.field1456, arg0.field1775, false, 2);
            }
            arg0.field1747 = 0;
            arg0.field1730 = 150;
            arg0.field1776 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            arg0.field1733 = class85.field2051.method669((byte) 119);
            if (arg0.field1733 == 65535) {
                arg0.field1733 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg0.field1799 = class85.field2051.method669((byte) 126);
            arg0.field1781 = class85.field2051.method637(10670);
        }
        if ((arg3 & 0x8) != 0) {
            int var8 = class85.field2051.method669((byte) 121);
            int var9 = class85.field2051.method651((byte) -10);
            if (var8 == 65535) {
                var8 = -1;
            }
            class58.method437(arg0, var8, -8, var9);
        }
        if ((arg3 & 0x4) != 0) {
            int var10 = class85.field2051.method636(124);
            int var11 = class85.field2051.method620((byte) -8);
            int var12 = class85.field2051.method624((byte) -117);
            int var13 = class85.field2051.field1821;
            if (arg0.field1456 != null && arg0.field1451 != null) {
                long var14 = arg0.field1456.method43((byte) -56);
                boolean var16 = false;
                if (var11 <= 1) {
                    for (int var17 = 0; var17 < class24.field613; var17++) {
                        if (class64.field1402[var17] == var14) {
                            var16 = true;
                            break;
                        }
                    }
                }
                if (!var16 && class62.field1347 == 0) {
                    class66.field1449.field1821 = 0;
                    class85.field2051.method619(var12, 2914, class66.field1449.field1858, 0);
                    class66.field1449.field1821 = 0;
                    class6 var18 = class123.method1015(32767, class66.field1449).method29(true);
                    arg0.field1775 = var18.method40((byte) -45);
                    arg0.field1730 = 150;
                    arg0.field1776 = var10 >> 8;
                    arg0.field1747 = var10 & 0xFF;
                    if (var11 == 2 || var11 == 3) {
                        class73.method575(class85.method731(new class6[] { class104.field2466, arg0.field1456 }, 14569), var18, false, 1);
                    } else if (var11 == 1) {
                        class73.method575(class85.method731(new class6[] { class67.field1488, arg0.field1456 }, 14569), var18, false, 1);
                    } else {
                        class73.method575(arg0.field1456, var18, false, 2);
                    }
                }
            }
            class85.field2051.field1821 = var12 + var13;
        }
        if ((arg3 & 0x400) != 0) {
            int var19 = class85.field2051.method620((byte) -8);
            int var20 = class85.field2051.method640(68);
            arg0.method611(-89, class5.field61, var19, var20);
            arg0.field1723 = class5.field61 + 300;
            arg0.field1801 = class85.field2051.method624((byte) 80);
            arg0.field1745 = class85.field2051.method620((byte) -8);
        }
        if ((arg3 & 0x20) == 0) {
            return;
        }
        int var21 = class85.field2051.method651((byte) 102);
        int var22 = class85.field2051.method620((byte) -8);
        arg0.method611(-116, class5.field61, var21, var22);
        arg0.field1723 = class5.field61 + 300;
        arg0.field1801 = class85.field2051.method651((byte) 124);
        arg0.field1745 = class85.field2051.method651((byte) 105);
    }

    @OriginalMember(owner = "client!re", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 679)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2632++;
    }

    @OriginalMember(owner = "client!re", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 691)
    public final void windowOpened(WindowEvent arg0) {
        field2643++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V", line = 698)
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2642++;
        int var7 = 2048 - arg5 & 0x7FF;
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg4;
        if (var7 != 0) {
            int var12 = class131.field3208[var7];
            int var13 = class131.field3232[var7];
            int var14 = var9 * var13 - arg4 * var12 >> 16;
            var11 = var9 * var12 + arg4 * var13 >> 16;
            var9 = var14;
        }
        if (var8 != 0) {
            int var15 = class131.field3208[var8];
            int var16 = class131.field3232[var8];
            int var17 = var11 * var15 + var10 * var16 >> 16;
            var11 = var11 * var16 - var10 * var15 >> 16;
            var10 = var17;
        }
        class68.field1513 = arg3 - var11;
        class79.field1903 = arg5;
        class96.field2291 = arg6 - var9;
        class76.field1798 = arg2;
        class103.field2439 = arg1 - var10;
        if (arg0 != 1000) {
            providesignlink(null);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 748)
    private final synchronized void method925(byte arg0) {
        if (arg0 <= 56) {
            field2606 = -114;
        }
        field2640++;
        if (class122.field3013) {
            return;
        }
        class122.field3013 = true;
        try {
            class70.field1564.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method200(4258);
        } catch (Exception var4) {
        }
        if (class18.field349 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class64.field1391 != null) {
            try {
                class64.field1391.method285((byte) 117);
            } catch (Exception var2) {
            }
        }
        this.method199(503);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 797)
    public final synchronized void method926(int arg0) {
        field2637++;
        Container var2;
        if (class18.field349 == null) {
            var2 = class64.field1391.field766;
        } else {
            var2 = class18.field349;
        }
        if (class70.field1564 != null) {
            class70.field1564.removeFocusListener(this);
            var2.remove(class70.field1564);
        }
        class70.field1564 = new class80(this);
        var2.add(class70.field1564);
        class70.field1564.setSize(class117.field2766, class95.field2253);
        class70.field1564.setVisible(true);
        if (class18.field349 == null) {
            class70.field1564.setLocation(0, 0);
        } else {
            Insets var3 = class18.field349.getInsets();
            class70.field1564.setLocation(var3.left, var3.top);
        }
        if (arg0 <= 8) {
            field2606 = -14;
        }
        class70.field1564.addFocusListener(this);
        class70.field1564.requestFocus();
        class32.field772 = true;
        class78.field1877 = false;
        class70.field1572 = class5.method22(119);
    }

    @OriginalMember(owner = "client!re", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 838)
    public final synchronized void paint(Graphics arg0) {
        field2612++;
        if (class40.field896 != this || class122.field3013) {
            return;
        }
        class32.field772 = true;
        if (class31.field757 != null && class31.field757.startsWith("1.5") && class5.method22(85) - class70.field1572 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class117.field2766 <= var2.width && class95.field2253 <= var2.height) {
                class78.field1877 = true;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "stop", descriptor = "()V", line = 865)
    public final void stop() {
        field2621++;
        if (class40.field896 == this && !class122.field3013) {
            class24.field612 = class5.method22(41) + 4000L;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Z", line = 878)
    public final boolean method927(int arg0) {
        if (arg0 != 1) {
            this.stop();
        }
        field2615++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
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
                this.method919((byte) 25, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "destroy", descriptor = "()V", line = 913)
    public final void destroy() {
        field2614++;
        if (class40.field896 == this && !class122.field3013) {
            class24.field612 = class5.method22(49);
            class82.method696(3, 5000L);
            class12.field227 = null;
            this.method925((byte) 92);
        }
    }

    @OriginalMember(owner = "client!re", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 927)
    public final void windowClosed(WindowEvent arg0) {
        field2618++;
    }

    @OriginalMember(owner = "client!re", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 936)
    public final void windowDeactivated(WindowEvent arg0) {
        field2630++;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 945)
    private final void method928(byte arg0) {
        field2610++;
        if (arg0 < 67) {
            method920((byte) 122);
        }
        long var2 = class5.method22(127);
        long var4 = class78.field1878[class73.field1675];
        class78.field1878[class73.field1675] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class134.field3266 = ((var6 >> 1) + 32000) / var6;
        }
        class73.field1675 = class73.field1675 + 1 & 0x1F;
        if (class82.field2002++ > 50) {
            class82.field2002 -= 50;
            class32.field772 = true;
            class70.field1564.setSize(class117.field2766, class95.field2253);
            class70.field1564.setVisible(true);
            if (class18.field349 == null) {
                class70.field1564.setLocation(0, 0);
            } else {
                Insets var7 = class18.field349.getInsets();
                class70.field1564.setLocation(var7.left, var7.top);
            }
        }
        this.method198(true);
    }

    @OriginalMember(owner = "client!re", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 1008)
    public final URL getDocumentBase() {
        field2638++;
        if (class18.field349 == null) {
            return class64.field1391 == null || class64.field1391.field766 == this ? super.getDocumentBase() : class64.field1391.field766.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1023)
    public final void focusLost(FocusEvent arg0) {
        class82.field2011 = false;
        field2628++;
    }

    @OriginalMember(owner = "client!re", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1038)
    public final void windowActivated(WindowEvent arg0) {
        field2624++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public abstract void method204(boolean arg0);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public abstract void method200(int arg0);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public abstract void method199(int arg0);

    @OriginalMember(owner = "client!re", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
    public abstract void method198(boolean arg0);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public abstract void method203(byte arg0);
}
