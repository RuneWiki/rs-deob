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

@OriginalClass("client!oh")
public abstract class class14 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "Z")
    private boolean field306 = false;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lsg;")
    private static class30 field282 = class167.method1221((byte) 33, "Oct");

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lsg;")
    private static class30 field287 = class167.method1221((byte) 33, "Dec");

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lsg;")
    private static class30 field279 = class167.method1221((byte) 33, "May");

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Lsg;")
    private static class30 field275 = class167.method1221((byte) 33, "Nov");

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "Lsg;")
    private static class30 field292 = class167.method1221((byte) 33, "Jan");

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "[Z")
    public static boolean[] field288 = new boolean[100];

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "Lsg;")
    private static class30 field290 = class167.method1221((byte) 33, "Feb");

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Lsg;")
    private static class30 field277 = class167.method1221((byte) 33, "Sep");

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lsg;")
    private static class30 field265 = class167.method1221((byte) 33, "Mar");

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "[I")
    public static int[] field296 = new int[100];

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lsg;")
    private static class30 field262 = class167.method1221((byte) 33, "Aug");

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Lsg;")
    private static class30 field278 = class167.method1221((byte) 33, "Jun");

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lsg;")
    private static class30 field264 = class167.method1221((byte) 33, "Jul");

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "Lsg;")
    private static class30 field307 = class167.method1221((byte) 33, "Apr");

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "[Lsg;")
    public static class30[] field285 = new class30[] { field292, field290, field265, field307, field279, field278, field264, field262, field277, field282, field275, field287 };

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field308 = 1;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "Llk;")
    public static class232 field303 = new class232(100);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lud;")
    public static class235 field274;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "Z")
    public static boolean field315;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "Z")
    public static boolean field316;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "[Lbj;")
    public static class44[] field281;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[[[B")
    public static byte[][][] field272;

    @OriginalMember(owner = "client!oh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class1.field17 = true;
        field286++;
        class164.field3043 = true;
    }

    @OriginalMember(owner = "client!oh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field300++;
        this.destroy();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    private final void method138(byte arg0) {
        field266++;
        long var2 = class111.method874(30351);
        long var4 = class67.field1473[class25.field476];
        if (arg0 > -117) {
            field288 = null;
        }
        class67.field1473[class25.field476] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class136.field2656 = ((var6 >> 1) + 32000) / var6;
        }
        class25.field476 = class25.field476 + 1 & 0x1F;
        if ((class211.field3814++) > 50) {
            class211.field3814 -= 50;
            class164.field3043 = true;
            class224.field4021.setSize(class15.field324, class238.field4238);
            class224.field4021.setVisible(true);
            if (class261.field4614 != null && class259.field4569 == null) {
                Insets var7 = class261.field4614.getInsets();
                class224.field4021.setLocation(class80.field1724 + var7.left, class40.field1005 + var7.top);
            } else {
                class224.field4021.setLocation(class80.field1724, class40.field1005);
            }
        }
        this.method141(-2);
    }

    @OriginalMember(owner = "client!oh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class1.field17 = false;
        field271++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BZ)V")
    private final void method139(byte arg0, boolean arg1) {
        field280++;
        synchronized (this) {
            if (arg0 > -12) {
                this.update((Graphics) null);
            }
            if (class134.field2619) {
                return;
            }
            class134.field2619 = true;
        }
        if (class190.field3452.field1449 != null) {
            class190.field3452.field1449.destroy();
        }
        try {
            this.method143(5200);
        } catch (Exception var9) {
        }
        if (class224.field4021 != null) {
            try {
                class224.field4021.removeFocusListener(this);
                class224.field4021.getParent().remove(class224.field4021);
            } catch (Exception var8) {
            }
        }
        if (class190.field3452 != null) {
            try {
                class190.field3452.method593((byte) -37);
            } catch (Exception var7) {
            }
        }
        this.method147(-9769);
        if (class261.field4614 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!oh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field301++;
        if (class261.field4614 == null) {
            return class190.field3452 == null || class190.field3452.field1449 == this ? super.getDocumentBase() : class190.field3452.field1449.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "stop", descriptor = "()V")
    public final void stop() {
        field312++;
        if (class135.field2643 == this && !class134.field2619) {
            class49.field1112 = class111.method874(30351) + 4000L;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public final synchronized void method140(byte arg0) {
        if (class224.field4021 != null) {
            class224.field4021.removeFocusListener(this);
            class224.field4021.getParent().remove(class224.field4021);
        }
        field276++;
        if (arg0 != 36) {
            field290 = null;
        }
        Container var2;
        if (class259.field4569 != null) {
            var2 = class259.field4569;
        } else if (class261.field4614 == null) {
            var2 = class190.field3452.field1449;
        } else {
            var2 = class261.field4614;
        }
        var2.setLayout((LayoutManager) null);
        class224.field4021 = new class233(this);
        var2.add(class224.field4021);
        class224.field4021.setSize(class15.field324, class238.field4238);
        class224.field4021.setVisible(true);
        if (class261.field4614 == var2) {
            Insets var3 = class261.field4614.getInsets();
            class224.field4021.setLocation(class80.field1724 + var3.left, class40.field1005 + var3.top);
        } else {
            class224.field4021.setLocation(class80.field1724, class40.field1005);
        }
        class224.field4021.addFocusListener(this);
        class224.field4021.requestFocus();
        class1.field17 = true;
        class116.field2286 = true;
        class164.field3043 = true;
        class275.field4803 = false;
        class144.field2778 = class111.method874(30351);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public abstract void method141(int arg0);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIBI)V")
    public final void method142(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field298++;
        try {
            if (class135.field2643 == null) {
                class238.field4238 = arg2;
                class93.field1885 = arg2;
                class135.field2643 = this;
                int var6 = 73 / ((52 - arg3) / 43);
                class40.field1005 = 0;
                class141.field2731 = arg0;
                class80.field1724 = 0;
                class15.field324 = arg1;
                class222.field3988 = arg1;
                String var7 = this.getParameter("openwinjs");
                boolean var10000;
                if (var7 != null && var7.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class190.field3452 == null) {
                    class16.field330 = class190.field3452 = new class66(this, arg4, (String) null, 0);
                }
                class27 var8 = class190.field3452.method592(this, -33, 1);
                while (var8.field493 == 0) {
                    class160.method1191(10L, 0);
                }
            } else {
                class251.field4441++;
                if (class251.field4441 >= 3) {
                    this.method154((byte) -49, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var10) {
            class93.method751(var10, (String) null, -24);
            this.method154((byte) -49, "crash");
        }
    }

    @OriginalMember(owner = "client!oh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field305++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public abstract void method143(int arg0);

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public abstract void method144(int arg0);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Z")
    public static final boolean method145(int arg0, int arg1) {
        field291++;
        int var2 = 124 / ((25 - arg0) / 35);
        return (arg1 & 0x59F71D) >> 22 != 0;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)Z")
    public final boolean method146(int arg0) {
        field268++;
        int var2 = 4 % ((-arg0 - 71) / 32);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var3.length() > 0 && var3.charAt(var3.length() - 1) >= '0' && var3.charAt(var3.length() - 1) <= '9') {
                var3 = var3.substring(0, var3.length() - 1);
            }
            if (var3.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method154((byte) -49, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field302++;
        if (class135.field2643 != this || class134.field2619) {
            return;
        }
        class164.field3043 = true;
        if (class116.field2284 && (class111.method874(30351) - class144.field2778) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class222.field3988 <= var2.width && class93.field1885 <= var2.height) {
                class275.field4803 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field304++;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!oh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field267++;
        if (class261.field4614 == null) {
            return class190.field3452 == null || class190.field3452.field1449 == this ? super.getParameter(arg0) : class190.field3452.field1449.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field261++;
        if (class135.field2643 == this && !class134.field2619) {
            class49.field1112 = class111.method874(30351);
            class160.method1191(5000L, 0);
            class16.field330 = null;
            this.method139((byte) -63, false);
        }
    }

    @OriginalMember(owner = "client!oh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field313++;
        if (class261.field4614 == null) {
            return class190.field3452 == null || class190.field3452.field1449 == this ? super.getCodeBase() : class190.field3452.field1449.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field284++;
    }

    @OriginalMember(owner = "client!oh", name = "start", descriptor = "()V")
    public final void start() {
        field283++;
        if (class135.field2643 == this && !class134.field2619) {
            class49.field1112 = 0L;
        }
    }

    @OriginalMember(owner = "client!oh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!oh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field310++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIII[Ldl;IIII)V")
    public static final void method148(byte arg0, int arg1, int arg2, int arg3, int arg4, class31[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field269++;
        class188.method1355(arg3, arg8, arg2, arg1);
        class213.method1528();
        if (arg0 != -96) {
            method145(-51, 94);
        }
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class31 var11 = arg5[var10];
            if (var11 != null && (var11.field798 == arg9 || arg9 == -1412584499 && class166.field3053 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class9.field170[class80.field1731] = var11.field755 + arg6;
                    field296[class80.field1731] = var11.field665 + arg7;
                    class256.field4509[class80.field1731] = var11.field728;
                    class110.field2211[class80.field1731] = var11.field670;
                    var12 = class80.field1731++;
                } else {
                    var12 = arg4;
                }
                var11.field781 = var12;
                var11.field756 = class133.field2617;
                if (!var11.field671 || !client.method1497(var11)) {
                    if (var11.field664 > 0) {
                        class96.method791(var11, -94);
                    }
                    int var13 = var11.field755 + arg6;
                    int var14 = var11.field665 + arg7;
                    int var15 = var11.field793;
                    if (class96.field1959 && (client.method1498(var11) != 0 || var11.field655 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class166.field3053 == var11) {
                        if (arg9 != -1412584499 && !var11.field686) {
                            class183.field3376 = arg7;
                            class243.field4350 = arg6;
                            class244.field4363 = arg5;
                            continue;
                        }
                        if (!var11.field686) {
                            var15 = 128;
                        }
                        if (class138.field2711 && class49.field1114) {
                            int var16 = class104.field2095;
                            int var17 = var16 - class77.field1687;
                            int var18 = class23.field440;
                            if (class157.field2951 > var17) {
                                var17 = class157.field2951;
                            }
                            if ((var11.field670 + var17) > (class157.field2951 + class172.field3212.field670)) {
                                var17 = class157.field2951 + class172.field3212.field670 - var11.field670;
                            }
                            int var19 = var18 - class64.field1420;
                            var14 = var17;
                            if (class193.field3496 > var19) {
                                var19 = class193.field3496;
                            }
                            if (var19 + var11.field728 > class193.field3496 + class172.field3212.field728) {
                                var19 = class193.field3496 + class172.field3212.field728 - var11.field728;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field655 == 2) {
                        var21 = arg8;
                        var25 = arg1;
                        var20 = arg3;
                        var24 = arg2;
                    } else {
                        var20 = arg3 < var13 ? var13 : arg3;
                        var21 = arg8 < var14 ? var14 : arg8;
                        int var22 = var11.field728 + var13;
                        int var23 = var14 + var11.field670;
                        if (var11.field655 == 9) {
                            var23++;
                            var22++;
                        }
                        var24 = arg2 <= var22 ? arg2 : var22;
                        var25 = arg1 <= var23 ? arg1 : var23;
                    }
                    if (!var11.field671 || var24 > var20 && var25 > var21) {
                        if (var11.field664 != 0) {
                            if (var11.field664 == 1337) {
                                class150.field2846 = var13;
                                class130.field2558 = var11;
                                class168.field3135 = var14;
                                class32.method324(var11.field664 == 1403, var11.field728, var11.field670, var13, (byte) 120, var14);
                                class188.method1355(arg3, arg8, arg2, arg1);
                                continue;
                            }
                            if (var11.field664 == 1338) {
                                if (var11.method307(0)) {
                                    class29.method245(var11, var12, var13, arg0 ^ 0x10EE, var14);
                                    class188.method1355(arg3, arg8, arg2, arg1);
                                }
                                continue;
                            }
                            if (var11.field664 == 1339) {
                                if (var11.method307(0)) {
                                    class243.method1715(var11, var12, arg0 ^ 0xFFFFFFA2, var14, var13);
                                    class188.method1355(arg3, arg8, arg2, arg1);
                                }
                                continue;
                            }
                            if (var11.field664 == 1400) {
                                class250.method1749(var13, var11.field670, arg0 + 96, var11.field728, var14);
                                field288[var12] = true;
                                class210.field3769[var12] = true;
                                class188.method1355(arg3, arg8, arg2, arg1);
                                continue;
                            }
                            if (var11.field664 == 1401) {
                                client.method1490(var13, var11.field670, 122, var11.field728, var14);
                                field288[var12] = true;
                                class210.field3769[var12] = true;
                                class188.method1355(arg3, arg8, arg2, arg1);
                                continue;
                            }
                            if (var11.field664 == 1402) {
                                class121.method922(var13, (byte) 89, var14);
                                field288[var12] = true;
                                class210.field3769[var12] = true;
                                continue;
                            }
                            if (var11.field664 == 1405) {
                                if (!class197.field3570) {
                                    continue;
                                }
                                int var26 = var11.field728 + var13;
                                int var27 = var14 + 15;
                                class232.field4126.method1458(class160.method1188(new class30[] { class53.field1188, class73.method675(-117, class136.field2656) }, 0), var26, var27, 16776960, -1);
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = 16776960;
                                int var115 = var27 + 15;
                                int var30 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                if (var30 > 65536) {
                                    var29 = 16711680;
                                }
                                class232.field4126.method1458(class160.method1188(new class30[] { class253.field4466, class73.method675(-1, var30), class216.field3942 }, 0), var26, var115, var29, -1);
                                int var31 = 16776960;
                                var27 = var115 + 15;
                                int var32 = 0;
                                int var33 = 0;
                                int var34 = 0;
                                for (int var35 = 0; var35 < 27; var35++) {
                                    var32 += class119.field2334[var35].method1790(arg0 + 96);
                                    var33 += class119.field2334[var35].method1784(false);
                                    var34 += class119.field2334[var35].method1791((byte) 26);
                                }
                                int var36 = var33 * 10000 / var32;
                                int var37 = var34 * 100 / var32;
                                class30 var38 = class160.method1188(new class30[] { class222.field3993, class191.method1383((long) var36, 0, true, arg0 ^ 0x5D, 2), class64.field1421, class73.method675(-10, var37), class277.field4825 }, 0);
                                class191.field3476.method1458(var38, var26, var27, var31, -1);
                                field288[var12] = true;
                                var27 += 12;
                                class210.field3769[var12] = true;
                                continue;
                            }
                        }
                        if (!class94.field1890) {
                            if (var11.field655 == 0 && var11.field649 && class5.field77 >= var20 && class219.field3960 >= var21 && var24 > class5.field77 && var25 > class219.field3960 && !class96.field1959) {
                                class30.field602[0] = 1007;
                                class52.field1165 = 1;
                                class167.field3078[0] = class22.field416;
                                class48.field1088[0] = class55.field1203;
                            }
                            if (class5.field77 >= var20 && var21 <= class219.field3960 && class5.field77 < var24 && var25 > class219.field3960) {
                                class94.method766(class5.field77 - var13, -var14 + class219.field3960, var11, 24);
                            }
                        }
                        if (var11.field655 == 0) {
                            if (!var11.field671 && client.method1497(var11) && class259.field4592 != var11) {
                                continue;
                            }
                            if (!var11.field671) {
                                if ((var11.field743 - var11.field670) < var11.field736) {
                                    var11.field736 = var11.field743 - var11.field670;
                                }
                                if (var11.field736 < 0) {
                                    var11.field736 = 0;
                                }
                            }
                            method148((byte) -96, var25, var24, var20, var12, arg5, var13 - var11.field734, var14 - var11.field736, var21, var11.field638);
                            if (var11.field732 != null) {
                                method148((byte) -96, var25, var24, var20, var12, var11.field732, var13 - var11.field734, -var11.field736 + var14, var21, var11.field638);
                            }
                            class180 var39 = (class180) class143.field2762.method1168(-3, (long) var11.field638);
                            if (var39 != null) {
                                if (var39.field3336 == 0 && !class94.field1890 && var20 <= class5.field77 && var21 <= class219.field3960 && var24 > class5.field77 && class219.field3960 < var25 && !class96.field1959) {
                                    class30.field602[0] = 1007;
                                    class167.field3078[0] = class22.field416;
                                    class48.field1088[0] = class55.field1203;
                                    class52.field1165 = 1;
                                }
                                class17.method172(var20, false, var12, var14, var25, var13, var24, var39.field3335, var21);
                            }
                            class188.method1355(arg3, arg8, arg2, arg1);
                            class213.method1528();
                        }
                        if (class195.field3508[var12] || class126.field2461 > 1) {
                            if (var11.field655 == 0 && !var11.field671 && var11.field743 > var11.field670) {
                                class87.method728(var11.field670, var11.field736, 16, var14, var11.field728 + var13, var11.field743);
                            }
                            if (var11.field655 != 1) {
                                if (var11.field655 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field682; var41++) {
                                        for (int var42 = 0; var42 < var11.field660; var42++) {
                                            int var43 = (var11.field782 + 32) * var42 + var13;
                                            int var44 = (var11.field771 + 32) * var41 + var14;
                                            if (var40 < 20) {
                                                var44 += var11.field767[var40];
                                                var43 += var11.field650[var40];
                                            }
                                            if (var11.field806[var40] > 0) {
                                                boolean var45 = false;
                                                boolean var46 = false;
                                                int var47 = var11.field806[var40] - 1;
                                                if ((var43 + 32) > arg3 && var43 < arg2 && var44 + 32 > arg8 && arg1 > var44 || class157.field2967 == var11 && class123.field2418 == var40) {
                                                    class44 var48;
                                                    if (class132.field2607 == 1 && class236.field4225 == var40 && class174.field3253 == var11.field638) {
                                                        var48 = class2.method15(2, var47, var11.field656, 0, var11.field708[var40], -2010447821);
                                                    } else {
                                                        var48 = class2.method15(1, var47, var11.field656, 3153952, var11.field708[var40], -2010447821);
                                                    }
                                                    if (class213.field3860) {
                                                        field288[var12] = true;
                                                    }
                                                    if (var48 == null) {
                                                        class254.method1771(var11, 8);
                                                    } else if (class157.field2967 == var11 && class123.field2418 == var40) {
                                                        int var49 = class104.field2095 - class141.field2722;
                                                        int var50 = class23.field440 - class222.field3991;
                                                        if (var49 < 5 && var49 > -5) {
                                                            var49 = 0;
                                                        }
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (class205.field3676 < 5) {
                                                            var49 = 0;
                                                            var50 = 0;
                                                        }
                                                        var48.method453(var43 + var50, var44 + var49, 128);
                                                        if (arg9 != -1) {
                                                            class31 var51 = arg5[arg9 & 0xFFFF];
                                                            int var52 = class188.field3435;
                                                            int var53 = class188.field3432;
                                                            if (var44 + var49 < var53 && var51.field736 > 0) {
                                                                int var54 = (var53 - var49 - var44) * class195.field3517 / 3;
                                                                if ((class195.field3517 * 10) < var54) {
                                                                    var54 = class195.field3517 * 10;
                                                                }
                                                                if (var54 > var51.field736) {
                                                                    var54 = var51.field736;
                                                                }
                                                                class141.field2722 += var54;
                                                                var51.field736 -= var54;
                                                                class254.method1771(var51, 8);
                                                            }
                                                            if (var52 < var44 + var49 + 32 && var51.field743 - var51.field670 > var51.field736) {
                                                                int var55 = (var49 + var44 + 32 - var52) * class195.field3517 / 3;
                                                                if (class195.field3517 * 10 < var55) {
                                                                    var55 = class195.field3517 * 10;
                                                                }
                                                                if (var51.field743 - var51.field736 - var51.field670 < var55) {
                                                                    var55 = var51.field743 - var51.field736 - var51.field670;
                                                                }
                                                                class141.field2722 -= var55;
                                                                var51.field736 += var55;
                                                                class254.method1771(var51, 8);
                                                            }
                                                        }
                                                    } else if (class168.field3106 == var11 && class71.field1614 == var40) {
                                                        var48.method453(var43, var44, 128);
                                                    } else {
                                                        var48.method446(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field663 != null && var40 < 20) {
                                                class44 var56 = var11.method310(0, var40);
                                                if (var56 != null) {
                                                    var56.method446(var43, var44);
                                                } else if (class104.field2086) {
                                                    class254.method1771(var11, 8);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field655 == 3) {
                                    int var57;
                                    if (class179.method1307(-1651, var11)) {
                                        var57 = var11.field667;
                                        if (class259.field4592 == var11 && var11.field681 != 0) {
                                            var57 = var11.field681;
                                        }
                                    } else {
                                        var57 = var11.field703;
                                        if (class259.field4592 == var11 && var11.field643 != 0) {
                                            var57 = var11.field643;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field701) {
                                            class188.method1361(var13, var14, var11.field728, var11.field670, var57);
                                        } else {
                                            class188.method1354(var13, var14, var11.field728, var11.field670, var57);
                                        }
                                    } else if (var11.field701) {
                                        class188.method1359(var13, var14, var11.field728, var11.field670, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class188.method1350(var13, var14, var11.field728, var11.field670, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field655 == 4) {
                                    class206 var58 = var11.method314(class100.field2039, (byte) 81);
                                    if (var58 != null) {
                                        class30 var59 = var11.field799;
                                        int var60;
                                        if (class179.method1307(-1651, var11)) {
                                            var60 = var11.field667;
                                            if (class259.field4592 == var11 && var11.field681 != 0) {
                                                var60 = var11.field681;
                                            }
                                            if (var11.field729.method249(-36) > 0) {
                                                var59 = var11.field729;
                                            }
                                        } else {
                                            var60 = var11.field703;
                                            if (class259.field4592 == var11 && var11.field643 != 0) {
                                                var60 = var11.field643;
                                            }
                                        }
                                        if (var11.field671 && var11.field651 != -1) {
                                            class168 var61 = class201.method1425(85, var11.field651);
                                            var59 = var61.field3162;
                                            if (var59 == null) {
                                                var59 = class129.field2536;
                                            }
                                            if ((var61.field3097 == 1 || var11.field683 != 1) && var11.field683 != -1) {
                                                var59 = class160.method1188(new class30[] { class104.field2098, var59, class91.field1847, class15.method156(var11.field683, -46) }, 0);
                                            }
                                        }
                                        if (class263.field4661 == var11) {
                                            var60 = var11.field703;
                                            var59 = class224.field4018;
                                        }
                                        if (!var11.field671) {
                                            var59 = class99.method810(arg0 ^ 0x6A6C, var59, var11);
                                        }
                                        var58.method1467(var59, var13, var14, var11.field728, var11.field670, var60, var11.field684 ? 0 : -1, var11.field690, var11.field696, var11.field644);
                                    } else if (class104.field2086) {
                                        class254.method1771(var11, arg0 ^ 0xFFFFFFA8);
                                    }
                                } else if (var11.field655 == 5) {
                                    if (var11.field671) {
                                        class44 var62;
                                        if (var11.field651 == -1) {
                                            var62 = var11.method315(-112, false);
                                        } else {
                                            var62 = class2.method15(var11.field752, var11.field651, var11.field656, var11.field737, var11.field683, -2010447821);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field1045;
                                            int var64 = var62.field1042;
                                            if (var11.field700) {
                                                int var65 = (var11.field728 + var63 - 1) / var63;
                                                int var66 = (var11.field670 + var64 - 1) / var64;
                                                class188.method1369(var13, var14, var11.field728 + var13, var14 - -var11.field670);
                                                for (int var67 = 0; var67 < var65; var67++) {
                                                    for (int var68 = 0; var68 < var66; var68++) {
                                                        if (var11.field691 != 0) {
                                                            var62.method457(4096, var13 + (var63 * var67) + (var63 / 2), var11.field691, -10351, var64 / 2 + var64 * var68 + var14);
                                                        } else if (var15 == 0) {
                                                            var62.method446(var63 * var67 + var13, var64 * var68 + var14);
                                                        } else {
                                                            var62.method453(var63 * var67 + var13, var14 - -(var64 * var68), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class188.method1355(arg3, arg8, arg2, arg1);
                                            } else {
                                                int var69 = var11.field728 * 4096 / var63;
                                                if (var11.field691 != 0) {
                                                    var62.method457(var69, var11.field728 / 2 + var13, var11.field691, -10351, var11.field670 / 2 + var14);
                                                } else if (var15 != 0) {
                                                    var62.method456(var13, var14, var11.field728, var11.field670, 256 - (var15 & 0xFF));
                                                } else if (var11.field728 == var63 && var11.field670 == var64) {
                                                    var62.method446(var13, var14);
                                                } else {
                                                    var62.method449(var13, var14, var11.field728, var11.field670);
                                                }
                                            }
                                        } else if (class104.field2086) {
                                            class254.method1771(var11, 8);
                                        }
                                    } else {
                                        class44 var70 = var11.method315(112, class179.method1307(-1651, var11));
                                        if (var70 != null) {
                                            var70.method446(var13, var14);
                                        } else if (class104.field2086) {
                                            class254.method1771(var11, 8);
                                        }
                                    }
                                } else if (var11.field655 == 6) {
                                    boolean var71 = class179.method1307(-1651, var11);
                                    int var72;
                                    if (var71) {
                                        var72 = var11.field777;
                                    } else {
                                        var72 = var11.field778;
                                    }
                                    class217 var73 = null;
                                    int var74 = 0;
                                    if (var11.field651 != -1) {
                                        class168 var75 = class201.method1425(101, var11.field651);
                                        if (var75 != null) {
                                            class168 var76 = var75.method1243(var11.field683, 119);
                                            class138 var77 = var72 == -1 ? null : class193.method1396(-30590, var72);
                                            var73 = var76.method1236(var77, var11.field738, 1, (byte) 75);
                                            if (var73 == null) {
                                                class254.method1771(var11, 8);
                                            } else {
                                                var74 = -var73.method22() / 2;
                                            }
                                        }
                                    } else if (var11.field792 == 5) {
                                        if (var11.field715 == -1) {
                                            var73 = class185.field3380.method1330((class138) null, -1, (class138) null, false, -1);
                                        } else {
                                            int var79 = var11.field715 & 0x7FF;
                                            if (class249.field4405 == var79) {
                                                var79 = 2047;
                                            }
                                            class120 var80 = class75.field1670[var79];
                                            class138 var81 = var72 == -1 ? null : class193.method1396(-30590, var72);
                                            if (var80 != null && (int) var80.field2349.method297((byte) -45) << 11 == (var11.field715 & 0xFFFFF800)) {
                                                var73 = var80.field2343.method1330((class138) null, var11.field738, var81, false, 0);
                                            }
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var11.method313(var71, (class138) null, class247.field4394.field2343, 0, -1);
                                        if (var73 == null && class104.field2086) {
                                            class254.method1771(var11, 8);
                                        }
                                    } else {
                                        class138 var78 = class193.method1396(-30590, var72);
                                        var73 = var11.method313(var71, var78, class247.field4394.field2343, arg0 ^ 0xFFFFFFA0, var11.field738);
                                        if (var73 == null && class104.field2086) {
                                            class254.method1771(var11, 8);
                                        }
                                    }
                                    if (var73 != null) {
                                        int var82;
                                        if (var11.field693 > 0) {
                                            var82 = (var11.field728 << 8) / var11.field693;
                                        } else {
                                            var82 = 256;
                                        }
                                        int var83 = (var11.field735 * var82 >> 8) + var11.field728 / 2 + var13;
                                        int var84;
                                        if (var11.field766 > 0) {
                                            var84 = (var11.field670 << 8) / var11.field766;
                                        } else {
                                            var84 = 256;
                                        }
                                        int var85 = (var11.field680 * var84 >> 8) + var11.field670 / 2 + var14;
                                        class213.method1535(var83, var85);
                                        int var86 = class213.field3849[var11.field685] * var11.field652 >> 16;
                                        int var87 = class213.field3846[var11.field685] * var11.field652 >> 16;
                                        if (!var11.field671) {
                                            var73.method1550(0, var11.field639, 0, var11.field685, 0, var86, var87);
                                        } else if (var11.field658) {
                                            ((class214) var73).method1541(0, var11.field639, var11.field776, var11.field685, var11.field633, var11.field794 + var86 + var74, var11.field794 + var87, var11.field652);
                                        } else {
                                            var73.method1550(0, var11.field639, var11.field776, var11.field685, var11.field633, var74 + var11.field794 + var86, var87 - -var11.field794);
                                        }
                                        class213.method1529();
                                    }
                                } else {
                                    if (var11.field655 == 7) {
                                        class206 var88 = var11.method314(class100.field2039, (byte) 81);
                                        if (var88 == null) {
                                            if (class104.field2086) {
                                                class254.method1771(var11, arg0 + 104);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var90 < var11.field682; var90++) {
                                            for (int var91 = 0; var91 < var11.field660; var91++) {
                                                if (var11.field806[var89] > 0) {
                                                    class168 var92 = class201.method1425(97, var11.field806[var89] - 1);
                                                    class30 var93;
                                                    if (var92.field3097 != 1 && var11.field708[var89] == 1) {
                                                        var93 = class160.method1188(new class30[] { class104.field2098, var92.field3162, class276.field4817 }, 0);
                                                    } else {
                                                        var93 = class160.method1188(new class30[] { class104.field2098, var92.field3162, class91.field1847, class15.method156(var11.field708[var89], 126) }, 0);
                                                    }
                                                    int var94 = (var11.field782 + 115) * var91 + var13;
                                                    int var95 = (var11.field771 + 12) * var90 + var14;
                                                    if (var11.field690 == 0) {
                                                        var88.method1450(var93, var94, var95, var11.field703, var11.field684 ? 0 : -1);
                                                    } else if (var11.field690 == 1) {
                                                        var88.method1472(var93, var94 + 57, var95, var11.field703, var11.field684 ? 0 : -1);
                                                    } else {
                                                        var88.method1458(var93, var94 + 114, var95, var11.field703, var11.field684 ? 0 : -1);
                                                    }
                                                }
                                                var89++;
                                            }
                                        }
                                    }
                                    if (var11.field655 == 8 && class256.field4523 == var11 && class55.field1222 == class255.field4503) {
                                        int var96 = 0;
                                        int var97 = 0;
                                        class206 var98 = class232.field4126;
                                        class30 var99 = var11.field799;
                                        class30 var100 = class99.method810(arg0 ^ 0x6A6C, var99, var11);
                                        while (var100.method249(-37) > 0) {
                                            int var108 = var100.method255(true, class269.field4734);
                                            class30 var109;
                                            if (var108 == -1) {
                                                var109 = var100;
                                                var100 = class55.field1203;
                                            } else {
                                                var109 = var100.method274(var108, 0, (byte) 11);
                                                var100 = var100.method260((byte) 20, var108 + 4);
                                            }
                                            int var110 = var98.method1456(var109);
                                            var96 += var98.field3701 + 1;
                                            if (var97 < var110) {
                                                var97 = var110;
                                            }
                                        }
                                        var96 += 7;
                                        var97 += 6;
                                        int var101 = var14 - (-var11.field670 - 5);
                                        int var102 = var11.field728 + var13 - var97 - 5;
                                        if (arg1 < (var101 + var96)) {
                                            var101 = arg1 - var96;
                                        }
                                        if ((var13 + 5) > var102) {
                                            var102 = var13 + 5;
                                        }
                                        if (arg2 < (var97 + var102)) {
                                            var102 = arg2 - var97;
                                        }
                                        class188.method1361(var102, var101, var97, var96, 16777120);
                                        class188.method1354(var102, var101, var97, var96, 0);
                                        int var103 = var101 - (-var98.field3701 - 2);
                                        class30 var104 = var11.field799;
                                        class30 var105 = class99.method810(arg0 ^ 0x6A6C, var104, var11);
                                        while (var105.method249(-70) > 0) {
                                            int var106 = var105.method255(true, class269.field4734);
                                            class30 var107;
                                            if (var106 == -1) {
                                                var107 = var105;
                                                var105 = class55.field1203;
                                            } else {
                                                var107 = var105.method274(var106, 0, (byte) 82);
                                                var105 = var105.method260((byte) -101, var106 + 4);
                                            }
                                            var98.method1450(var107, var102 + 3, var103, 0, -1);
                                            var103 += var98.field3701 + 1;
                                        }
                                    }
                                    if (var11.field655 == 9) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (var11.field717) {
                                            var114 = var11.field728 + var13;
                                            var111 = var13;
                                            var113 = var14 + var11.field670;
                                            var112 = var14;
                                        } else {
                                            var111 = var13;
                                            var112 = var11.field670 + var14;
                                            var113 = var14;
                                            var114 = var13 + var11.field728;
                                        }
                                        if (var11.field757 == 1) {
                                            class188.method1348(var111, var113, var114, var112, var11.field703);
                                        } else {
                                            class188.method1366(var111, var113, var114, var112, var11.field703, var11.field757);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public abstract void method149(boolean arg0);

    @OriginalMember(owner = "client!oh", name = "run", descriptor = "()V")
    public final void run() {
        field263++;
        try {
            if (class66.field1444 != null) {
                String var1 = class66.field1444.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class66.field1461;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method154((byte) -49, "wrongjava");
                        return;
                    }
                    class58.field1266 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class66.field1461 == null || class66.field1461.equals("1.4.2"))) {
                    this.method154((byte) -49, "wrongjava");
                    return;
                }
            }
            if (class66.field1461 != null && class66.field1461.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class66.field1461.length()) {
                    char var5 = class66.field1461.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 - (48 - var5);
                }
                if (var4 >= 5) {
                    class116.field2284 = true;
                }
            }
            if (class190.field3452.field1449 != null) {
                Method var6 = class66.field1463;
                if (var6 != null) {
                    try {
                        var6.invoke(class190.field3452.field1449, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method140((byte) 36);
            class149.field2838 = class132.method1002(class224.field4021, -128, class15.field324, class238.field4238);
            this.method144(20);
            class191.field3473 = class231.method1641(false);
            while (class49.field1112 == 0L || class49.field1112 > class111.method874(30351)) {
                class209.field3754 = class191.field3473.method550(class24.field465, -128, class58.field1266);
                for (int var7 = 0; var7 < class209.field3754; var7++) {
                    this.method151(69);
                }
                this.method138((byte) -119);
                class65.method587(class224.field4021, 126, class190.field3452);
            }
        } catch (Exception var10) {
            class93.method751(var10, (String) null, 19);
            this.method154((byte) -49, "crash");
        }
        this.method139((byte) -95, true);
    }

    @OriginalMember(owner = "client!oh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field299++;
        if (class261.field4614 == null) {
            return class190.field3452 == null || class190.field3452.field1449 == this ? super.getAppletContext() : class190.field3452.field1449.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field293++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
    public static final void method150(int arg0, int arg1) {
        field311++;
        if (arg1 == -1 || !class1.method9(arg1, (byte) -13)) {
            return;
        }
        class31[] var2 = class259.field4572[arg1];
        if (arg0 != -1) {
            method150(-105, 42);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class31 var4 = var2[var3];
            if (var4.field661 != null) {
                class183 var5 = new class183();
                var5.field3363 = var4.field661;
                var5.field3369 = var4;
                class8.method61(2000000, var5, (byte) 13);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field295++;
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    private final void method151(int arg0) {
        field314++;
        long var2 = class111.method874(30351);
        if (arg0 <= 55) {
            return;
        }
        long var4 = class57.field1250[class11.field202];
        class57.field1250[class11.field202] = var2;
        class11.field202 = class11.field202 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class116.field2286 = class1.field17;
        }
        this.method149(true);
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V")
    public static void method152(int arg0) {
        field307 = null;
        field277 = null;
        field265 = null;
        field272 = null;
        field275 = null;
        field262 = null;
        field279 = null;
        field290 = null;
        field296 = null;
        field292 = null;
        field264 = null;
        field282 = null;
        field303 = null;
        field288 = null;
        field278 = null;
        field274 = null;
        field287 = null;
        field285 = null;
        int var1 = -82 % ((44 - arg0) / 61);
        field281 = null;
    }

    @OriginalMember(owner = "client!oh", name = "providesignlink", descriptor = "(Lbi;)V")
    public static final void providesignlink(class66 arg0) {
        field297++;
        class190.field3452 = arg0;
        class16.field330 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIIIILjava/lang/String;)V")
    public final void method153(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field289++;
        try {
            class135.field2643 = this;
            class141.field2731 = arg0;
            class40.field1005 = 0;
            class15.field324 = arg4;
            class222.field3988 = arg4;
            class80.field1724 = 0;
            class238.field4238 = arg3;
            class93.field1885 = arg3;
            class261.field4614 = new Frame();
            class261.field4614.setTitle("Jagex");
            class261.field4614.setResizable(true);
            class261.field4614.addWindowListener(this);
            class261.field4614.setVisible(arg1);
            class261.field4614.toFront();
            Insets var8 = class261.field4614.getInsets();
            class261.field4614.setSize(class222.field3988 + var8.left + var8.right, class93.field1885 + var8.top + var8.bottom);
            class16.field330 = class190.field3452 = new class66((Applet) null, arg2, arg6, arg5);
            class27 var9 = class190.field3452.method592(this, -20, 1);
            while (var9.field493 == 0) {
                class160.method1191(10L, 0);
            }
        } catch (Exception var11) {
            class93.method751(var11, (String) null, -121);
        }
    }

    @OriginalMember(owner = "client!oh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field309++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method154(byte arg0, String arg1) {
        field294++;
        if (this.field306) {
            return;
        }
        if (arg0 != -49) {
            field274 = null;
        }
        this.field306 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }
}
