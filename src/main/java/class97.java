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

@OriginalClass("client!oa")
public abstract class class97 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Z")
    private boolean field1729 = false;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lpj;")
    public static class237 field1715 = class33.method353("hitbar_default", 112);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lpj;")
    public static class237 field1734 = class33.method353(")3)3)3", 65);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lpj;")
    public static class237 field1719 = class33.method353(" )2>", 16);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lfa;")
    public static class239 field1750;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[[[B")
    public static byte[][][] field1718;

    @OriginalMember(owner = "client!oa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1726++;
        if (class43.field946 == null) {
            return class268.field4572 == null || class268.field4572.field1306 == this ? super.getDocumentBase() : class268.field4572.field1306.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIB[B)Lpj;")
    public static final class237 method723(int arg0, int arg1, byte arg2, byte[] arg3) {
        field1727++;
        int var4 = 60 % ((arg2 + 21) / 62);
        class237 var5 = new class237();
        var5.field4114 = 0;
        var5.field4151 = new byte[arg1];
        for (int var6 = arg0; var6 < arg0 + arg1; var6++) {
            if (arg3[var6] != 0) {
                var5.field4151[var5.field4114++] = arg3[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final synchronized void method724(int arg0) {
        field1738++;
        if (class20.field379 != null) {
            class20.field379.removeFocusListener(this);
            class20.field379.getParent().remove(class20.field379);
        }
        Container var2;
        if (class24.field433 != null) {
            var2 = class24.field433;
        } else if (class43.field946 == null) {
            var2 = class268.field4572.field1306;
        } else {
            var2 = class43.field946;
        }
        var2.setLayout((LayoutManager) null);
        class20.field379 = new class70(this);
        var2.add(class20.field379);
        class20.field379.setSize(class142.field2585, class119.field2087);
        class20.field379.setVisible(true);
        if (class43.field946 == var2) {
            Insets var3 = class43.field946.getInsets();
            class20.field379.setLocation(var3.left + class129.field2255, class245.field4296 + var3.top);
        } else {
            class20.field379.setLocation(class129.field2255, class245.field4296);
        }
        class20.field379.addFocusListener(this);
        if (arg0 > -80) {
            return;
        }
        class20.field379.requestFocus();
        class143.field2595 = true;
        class240.field4220 = true;
        class61.field1234 = false;
        class188.field3277 = true;
        class149.field2654 = class181.method1244((byte) -82);
    }

    @OriginalMember(owner = "client!oa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1720++;
    }

    @OriginalMember(owner = "client!oa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1731++;
    }

    @OriginalMember(owner = "client!oa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1730++;
        if (class234.field4048 != this || class186.field3256) {
            return;
        }
        class240.field4220 = true;
        if (class135.field2355 && (class181.method1244((byte) -33) - class149.field2654) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class170.field2976 && var2.height >= class231.field3976) {
                class61.field1234 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public abstract void method725(byte arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public abstract void method726(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBIILjava/lang/String;)V")
    public final void method727(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, String arg6) {
        field1741++;
        try {
            class234.field4048 = this;
            class127.field2229 = arg5;
            class119.field2087 = arg1;
            class231.field3976 = arg1;
            class245.field4296 = 0;
            class129.field2255 = 0;
            if (arg3 <= -40) {
                class142.field2585 = arg4;
                class170.field2976 = arg4;
                class43.field946 = new Frame();
                class43.field946.setTitle("Jagex");
                class43.field946.setResizable(true);
                class43.field946.addWindowListener(this);
                class43.field946.setVisible(true);
                class43.field946.toFront();
                Insets var8 = class43.field946.getInsets();
                class43.field946.setSize(class170.field2976 + var8.left + var8.right, class231.field3976 + var8.bottom + var8.top);
                class33.field717 = class268.field4572 = new class67((Applet) null, arg0, arg6, arg2);
                class103 var9 = class268.field4572.method542(this, 0, 1);
                while (var9.field1823 == 0) {
                    class84.method645(1, 10L);
                }
            }
        } catch (Exception var11) {
            class158.method1123((String) null, (byte) -122, var11);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    private final void method728(byte arg0) {
        field1747++;
        long var2 = class181.method1244((byte) -7);
        long var4 = class261.field4466[class137.field2372];
        int var6 = 39 / ((arg0 + 24) / 62);
        class261.field4466[class137.field2372] = var2;
        class137.field2372 = class137.field2372 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var7 = (int) (var2 - var4);
            class222.field3819 = ((var7 >> 1) + 32000) / var7;
        }
        if (class78.field1474++ > 50) {
            class78.field1474 -= 50;
            class240.field4220 = true;
            class20.field379.setSize(class142.field2585, class119.field2087);
            class20.field379.setVisible(true);
            if (class43.field946 != null && class24.field433 == null) {
                Insets var8 = class43.field946.getInsets();
                class20.field379.setLocation(class129.field2255 + var8.left, class245.field4296 + var8.top);
            } else {
                class20.field379.setLocation(class129.field2255, class245.field4296);
            }
        }
        this.method737(-10);
    }

    @OriginalMember(owner = "client!oa", name = "providesignlink", descriptor = "(Laf;)V")
    public static final void providesignlink(class67 arg0) {
        field1745++;
        class268.field4572 = arg0;
        class33.field717 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public static final void method729(boolean arg0) {
        field1721++;
        if (arg0) {
            field1718 = null;
        }
        class111.field1950.method942(0);
    }

    @OriginalMember(owner = "client!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1717++;
        class143.field2595 = true;
        class240.field4220 = true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
    public final void method730(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1722++;
        try {
            if (class234.field4048 == null) {
                class127.field2229 = arg1;
                class129.field2255 = 0;
                class245.field4296 = 0;
                class234.field4048 = this;
                class142.field2585 = arg3;
                class170.field2976 = arg3;
                class119.field2087 = arg0;
                class231.field3976 = arg0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class268.field4572 == null) {
                    class33.field717 = class268.field4572 = new class67(this, arg2, (String) null, 0);
                }
                class103 var7 = class268.field4572.method542(this, 0, 1);
                while (var7.field1823 == 0) {
                    class84.method645(1, 10L);
                }
                if (arg4 > -112) {
                    field1715 = null;
                }
            } else {
                class215.field3738++;
                if (class215.field3738 >= 3) {
                    this.method736("alreadyloaded", true);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class158.method1123((String) null, (byte) -122, var9);
            this.method736("crash", true);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public abstract void method731(int arg0);

    @OriginalMember(owner = "client!oa", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1716++;
        if (class43.field946 == null) {
            return class268.field4572 == null || class268.field4572.field1306 == this ? super.getCodeBase() : class268.field4572.field1306.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "stop", descriptor = "()V")
    public final void stop() {
        field1751++;
        if (class234.field4048 == this && !class186.field3256) {
            class15.field250 = class181.method1244((byte) -66) + 4000L;
        }
    }

    @OriginalMember(owner = "client!oa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    private final void method732(byte arg0) {
        field1748++;
        if (arg0 > -113) {
            field1734 = null;
        }
        long var2 = class114.field2002[class77.field1448];
        long var4 = class181.method1244((byte) -122);
        class114.field2002[class77.field1448] = var4;
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class77.field1448 = class77.field1448 + 1 & 0x1F;
        synchronized (this) {
            class188.field3277 = class143.field2595;
        }
        this.method740(32);
    }

    @OriginalMember(owner = "client!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1725++;
        class143.field2595 = false;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)Z")
    public final boolean method733(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1743++;
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
            }
            if (arg0 >= -22) {
                method735((class95) null, -49, -127, -114, -13, -41);
            }
            this.method736("invalidhost", true);
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1724++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1728++;
    }

    @OriginalMember(owner = "client!oa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1739++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= 0 && arg5 >= 0 && arg7 < 103 && arg5 < 103) {
            if (arg3 == 0) {
                class114 var8 = class53.method471(arg2, arg7, arg5);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2000 >>> 32);
                    if (arg0 == 2) {
                        var8.field1999 = new class218(var9, 2, arg4 + 4, arg2, arg7, arg5, arg6, false, var8.field1999);
                        var8.field1993 = new class218(var9, 2, arg4 + 1 & 0x3, arg2, arg7, arg5, arg6, false, var8.field1993);
                    } else {
                        var8.field1999 = new class218(var9, arg0, arg4, arg2, arg7, arg5, arg6, false, var8.field1999);
                    }
                }
            }
            if (arg3 == 1) {
                class212 var10 = class172.method1192(arg2, arg7, arg5);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3617 >>> 32);
                    if (arg0 == 4 || arg0 == 5) {
                        var10.field3604 = new class218(var11, 4, arg4, arg2, arg7, arg5, arg6, false, var10.field3604);
                    } else if (arg0 == 6) {
                        var10.field3604 = new class218(var11, 4, arg4 + 4, arg2, arg7, arg5, arg6, false, var10.field3604);
                    } else if (arg0 == 7) {
                        var10.field3604 = new class218(var11, 4, (arg4 + 2 & 0x3) + 4, arg2, arg7, arg5, arg6, false, var10.field3604);
                    } else if (arg0 == 8) {
                        var10.field3604 = new class218(var11, 4, arg4 + 4, arg2, arg7, arg5, arg6, false, var10.field3604);
                        var10.field3605 = new class218(var11, 4, (arg4 + 2 & 0x3) + 4, arg2, arg7, arg5, arg6, false, var10.field3605);
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 11) {
                    arg0 = 10;
                }
                class191 var12 = class183.method1254(arg2, arg7, arg5);
                if (var12 != null) {
                    var12.field3318 = new class218((int) (var12.field3314 >>> 32) & Integer.MAX_VALUE, arg0, arg4, arg2, arg7, arg5, arg6, false, var12.field3318);
                }
            }
            if (arg3 == 3) {
                class232 var13 = class33.method354(arg2, arg7, arg5);
                if (var13 != null) {
                    var13.field4012 = new class218(Integer.MAX_VALUE & (int) (var13.field4014 >>> 32), 22, arg4, arg2, arg7, arg5, arg6, false, var13.field4012);
                }
            }
        }
        field1744++;
        if (arg1 != 2) {
            field1750 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqe;IIIII)V")
    public static final void method735(class95 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class158.field2852 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class224.field3852) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class182.field3211 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class35 var14 = class274.field4775[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class99.field1773[var11][var12 + 1][var13] + class99.field1773[var11][var12][var13] + class99.field1773[var11][var12][var13 + 1] + class99.field1773[var11][var12 + 1][var13 + 1]) / 4 - (class99.field1773[arg1][arg2 + 1][arg3] + class99.field1773[arg1][arg2][arg3] + class99.field1773[arg1][arg2][arg3 + 1] + class99.field1773[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class114 var16 = var14.field763;
                                    if (var16 != null) {
                                        if (var16.field1999.method704()) {
                                            arg0.method708(var16.field1999, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1993 != null && var16.field1993.method704()) {
                                            arg0.method708(var16.field1993, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field759; var17++) {
                                        class191 var18 = var14.field755[var17];
                                        if (var18 != null && var18.field3318.method704() && (var18.field3316 == var12 || var7 == var12) && (var18.field3315 == var13 || var9 == var13)) {
                                            int var19 = var18.field3327 + 1 - var18.field3316;
                                            int var20 = var18.field3320 + 1 - var18.field3315;
                                            arg0.method708(var18.field3318, (var18.field3316 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3315 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method736(String arg0, boolean arg1) {
        field1746++;
        if (this.field1729) {
            return;
        }
        this.field1729 = arg1;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!oa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1732++;
        this.destroy();
    }

    @OriginalMember(owner = "client!oa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1740++;
    }

    @OriginalMember(owner = "client!oa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1733++;
        if (class43.field946 == null) {
            return class268.field4572 == null || class268.field4572.field1306 == this ? super.getAppletContext() : class268.field4572.field1306.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1735++;
        if (class234.field4048 == this && !class186.field3256) {
            class15.field250 = class181.method1244((byte) -31);
            class84.method645(1, 5000L);
            class33.field717 = null;
            this.method739((byte) 110, false);
        }
    }

    @OriginalMember(owner = "client!oa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1737++;
        if (class43.field946 == null) {
            return class268.field4572 == null || class268.field4572.field1306 == this ? super.getParameter(arg0) : class268.field4572.field1306.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public abstract void method737(int arg0);

    @OriginalMember(owner = "client!oa", name = "start", descriptor = "()V")
    public final void start() {
        field1723++;
        if (class234.field4048 == this && !class186.field3256) {
            class15.field250 = 0L;
        }
    }

    @OriginalMember(owner = "client!oa", name = "run", descriptor = "()V")
    public final void run() {
        field1749++;
        try {
            if (class67.field1313 != null) {
                String var1 = class67.field1313.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class67.field1305;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method736("wrongjava", true);
                        return;
                    }
                    class196.field3419 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class67.field1305 == null || class67.field1305.equals("1.4.2"))) {
                    this.method736("wrongjava", true);
                    return;
                }
            }
            if (class67.field1305 != null && class67.field1305.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class67.field1305.length() > var3) {
                    char var5 = class67.field1305.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class135.field2355 = true;
                }
            }
            if (class268.field4572.field1306 != null) {
                Method var6 = class67.field1324;
                if (var6 != null) {
                    try {
                        var6.invoke(class268.field4572.field1306, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method724(-83);
            class38.field845 = class187.method1275(class20.field379, true, class119.field2087, class142.field2585);
            this.method726(false);
            class111.field1944 = class244.method1686((byte) 112);
            while (class15.field250 == 0L || class15.field250 > class181.method1244((byte) -33)) {
                class90.field1647 = class111.field1944.method417(class196.field3419, -10006, class177.field3103);
                for (int var7 = 0; var7 < class90.field1647; var7++) {
                    this.method732((byte) -123);
                }
                this.method728((byte) -112);
                class65.method539(class268.field4572, 9884, class20.field379);
            }
        } catch (Exception var10) {
            class158.method1123((String) null, (byte) -122, var10);
            this.method736("crash", true);
        }
        this.method739((byte) 110, true);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public static void method738(int arg0) {
        field1750 = null;
        field1719 = null;
        field1734 = null;
        if (arg0 <= 123) {
            method723(109, -62, (byte) -2, (byte[]) null);
        }
        field1715 = null;
        field1718 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BZ)V")
    private final void method739(byte arg0, boolean arg1) {
        field1736++;
        synchronized (this) {
            if (class186.field3256) {
                return;
            }
            class186.field3256 = true;
        }
        if (class268.field4572.field1306 != null) {
            class268.field4572.field1306.destroy();
        }
        try {
            this.method725((byte) -75);
        } catch (Exception var9) {
        }
        if (class20.field379 != null) {
            try {
                class20.field379.removeFocusListener(this);
                class20.field379.getParent().remove(class20.field379);
            } catch (Exception var8) {
            }
        }
        if (class268.field4572 != null) {
            try {
                class268.field4572.method552((byte) -12);
            } catch (Exception var7) {
            }
        }
        if (arg0 != 110) {
            return;
        }
        this.method731(20);
        if (class43.field946 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public abstract void method740(int arg0);

    @OriginalMember(owner = "client!oa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1742++;
    }
}
