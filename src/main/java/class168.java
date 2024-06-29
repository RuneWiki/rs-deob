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

@OriginalClass("client!ub")
public abstract class class168 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Z")
    private boolean field2759 = false;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Lw;")
    public static class37 field2773 = new class37();

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Lvf;")
    public static class30 field2778 = new class30(5000);

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "Lrc;")
    public static class9 field2783 = new class9(16);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Z")
    public static boolean field2789;

    @OriginalMember(owner = "client!ub", name = "providesignlink", descriptor = "(Lvb;)V")
    public static final void providesignlink(class131 arg0) {
        field2758++;
        class127.field2238 = arg0;
        class5.field61 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field2778 = null;
        if (arg0 > 10) {
            field2773 = null;
            field2783 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    private final void method1126(int arg0) {
        field2761++;
        long var2 = class108.field1933[class152.field2543];
        long var4 = class232.method1544((byte) -100);
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class108.field1933[class152.field2543] = var4;
        class152.field2543 = class152.field2543 + 1 & 0x1F;
        synchronized (this) {
            class95.field1643 = class240.field3948;
        }
        if (arg0 != -9370) {
            this.getDocumentBase();
        }
        this.method1138((byte) -102);
    }

    @OriginalMember(owner = "client!ub", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2772++;
        if (class270.field4349 == null) {
            return class127.field2238 == null || class127.field2238.field2294 == this ? super.getDocumentBase() : class127.field2238.field2294.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1127(byte arg0, String arg1) {
        field2753++;
        if (this.field2759) {
            return;
        }
        this.field2759 = true;
        if (arg0 != 104) {
            field2773 = null;
        }
        System.out.println("error_game_" + arg1);
        try {
            class94.method604(class127.field2238.field2294, "loggedout", 27972);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ub", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2776++;
        if (class270.field4349 == null) {
            return class127.field2238 == null || class127.field2238.field2294 == this ? super.getAppletContext() : class127.field2238.field2294.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class240.field3948 = true;
        class229.field3857 = true;
        field2755++;
    }

    @OriginalMember(owner = "client!ub", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2765++;
    }

    @OriginalMember(owner = "client!ub", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2760++;
    }

    @OriginalMember(owner = "client!ub", name = "stop", descriptor = "()V")
    public final void stop() {
        field2762++;
        if (class69.field1130 == this && !class186.field3017) {
            class276.field4417 = class232.method1544((byte) -74) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    private final void method1128(int arg0) {
        field2768++;
        long var2 = class232.method1544((byte) -110);
        long var4 = class173.field2849[class231.field3868];
        class173.field2849[class231.field3868] = var2;
        class231.field3868 = class231.field3868 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class179.field2952 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class285.field4509++) > 50) {
            class229.field3857 = true;
            class285.field4509 -= 50;
            class118.field2099.setSize(class267.field4324, class4.field38);
            class118.field2099.setVisible(true);
            if (class270.field4349 != null && class85.field1534 == null) {
                Insets var7 = class270.field4349.getInsets();
                class118.field2099.setLocation(class72.field1189 + var7.left, class231.field3870 + var7.top);
            } else {
                class118.field2099.setLocation(class72.field1189, class231.field3870);
            }
        }
        if (arg0 != -5090) {
            this.windowDeactivated((WindowEvent) null);
        }
        this.method1131(2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Z")
    public final boolean method1129(boolean arg0) {
        field2786++;
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
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else if (arg0) {
                return true;
            } else {
                this.method1127((byte) 104, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2784++;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public abstract void method1130(int arg0);

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public abstract void method1131(int arg0);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZIB)V")
    public static final void method1132(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field2781++;
        if (class110.method766(-13786, arg3)) {
            class139.method978(class115.field2068[arg3], arg1, false, -1, arg2, arg0);
            if (arg4 != -127) {
                field2778 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIIII)V")
    public final void method1133(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -80) {
            return;
        }
        field2785++;
        try {
            if (class69.field1130 == null) {
                class267.field4324 = arg3;
                class132.field2302 = arg3;
                class231.field3870 = 0;
                class69.field1130 = this;
                class72.field1189 = 0;
                class237.field3901 = arg4;
                class4.field38 = arg2;
                class42.field623 = arg2;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class127.field2238 == null) {
                    class5.field61 = class127.field2238 = new class131(this, arg1, (String) null, 0);
                }
                class174 var7 = class127.field2238.method917(1, (byte) 122, this);
                while (var7.field2857 == 0) {
                    class245.method1636(false, 10L);
                }
            } else {
                class146.field2493++;
                if (class146.field2493 >= 3) {
                    this.method1127((byte) 104, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class254.method1684(125, var9, (String) null);
            this.method1127((byte) 104, "crash");
        }
    }

    @OriginalMember(owner = "client!ub", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2767++;
    }

    @OriginalMember(owner = "client!ub", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2788++;
    }

    @OriginalMember(owner = "client!ub", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2771++;
    }

    @OriginalMember(owner = "client!ub", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2757++;
        if (class270.field4349 == null) {
            return class127.field2238 == null || class127.field2238.field2294 == this ? super.getParameter(arg0) : class127.field2238.field2294.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        class91.field1609.method58(0);
        if (arg0 != -2) {
            field2773 = null;
        }
        field2766++;
    }

    @OriginalMember(owner = "client!ub", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2756++;
        if (class270.field4349 == null) {
            return class127.field2238 == null || class127.field2238.field2294 == this ? super.getCodeBase() : class127.field2238.field2294.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
    public final synchronized void method1135(int arg0) {
        field2763++;
        if (class118.field2099 != null) {
            class118.field2099.removeFocusListener(this);
            class118.field2099.getParent().remove(class118.field2099);
        }
        Container var2;
        if (class85.field1534 != null) {
            var2 = class85.field1534;
        } else if (class270.field4349 == null) {
            var2 = class127.field2238.field2294;
        } else {
            var2 = class270.field4349;
        }
        var2.setLayout((LayoutManager) null);
        class118.field2099 = new class115(this);
        var2.add(class118.field2099);
        class118.field2099.setSize(class267.field4324, class4.field38);
        if (arg0 != 0) {
            field2783 = null;
        }
        class118.field2099.setVisible(true);
        if (class270.field4349 == var2) {
            Insets var3 = class270.field4349.getInsets();
            class118.field2099.setLocation(class72.field1189 + var3.left, class231.field3870 + var3.top);
        } else {
            class118.field2099.setLocation(class72.field1189, class231.field3870);
        }
        class118.field2099.addFocusListener(this);
        class118.field2099.requestFocus();
        class95.field1643 = true;
        class240.field3948 = true;
        class229.field3857 = true;
        class107.field1911 = false;
        class93.field1640 = class232.method1544((byte) -119);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public abstract void method1136(byte arg0);

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
    public abstract void method1137(int arg0);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public abstract void method1138(byte arg0);

    @OriginalMember(owner = "client!ub", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2777++;
        class240.field3948 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILdl;)V")
    public static final void method1139(int arg0, int arg1, int arg2, class46 arg3) {
        if (arg3.field649 == 1) {
            class55.field958++;
            class37.method247(0L, arg3.field667, "", 10032, 0, -1, (short) 19, arg3.field786);
        }
        if (arg3.field649 == 2 && !class76.field1241) {
            String var4 = client.method1925(arg3, false);
            if (var4 != null) {
                class37.field568++;
                class37.method247(0L, var4, "<col=00ff00>" + arg3.field743, 10032, -1, -1, (short) 3, arg3.field786);
            }
        }
        field2780++;
        if (arg3.field649 == 3) {
            class37.method247(0L, class165.field2709, "", arg0 ^ 0x2726, 0, -1, (short) 42, arg3.field786);
            class285.field4513++;
        }
        if (arg3.field649 == 4) {
            class37.method247(0L, arg3.field667, "", 10032, 0, -1, (short) 49, arg3.field786);
            class50.field853++;
        }
        if (arg3.field649 == 5) {
            class37.method247(0L, arg3.field667, "", arg0 + 10010, 0, -1, (short) 50, arg3.field786);
            class27.field404++;
        }
        if (arg0 != 22) {
            return;
        }
        if (arg3.field649 == 6 && class139.field2404 == null) {
            class37.method247(0L, arg3.field667, "", 10032, -1, -1, (short) 22, arg3.field786);
            class105.field1875++;
        }
        if (arg3.field812 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field696; var6++) {
                for (int var7 = 0; var7 < arg3.field688; var7++) {
                    int var8 = (arg3.field805 + 32) * var7;
                    int var9 = (arg3.field810 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg3.field779[var5];
                        var9 += arg3.field791[var5];
                    }
                    if (arg1 >= var8 && var9 <= arg2 && var8 + 32 > arg1 && var9 + 32 > arg2) {
                        class167.field2721 = var5;
                        class276.field4411 = arg3;
                        if (arg3.field774[var5] > 0) {
                            class192 var10 = client.method1922(arg3);
                            class199 var11 = class203.method1346(-1, arg3.field774[var5] - 1);
                            if (class183.field2976 == 1 && var10.method1259(-475686027)) {
                                if (class76.field1239 != arg3.field786 || class175.field2867 != var5) {
                                    class29.field435++;
                                    class37.method247((long) var11.field3273, class45.field631, class258.field4208 + " -> <col=ff9040>" + var11.field3216, 10032, var5, -1, (short) 2, arg3.field786);
                                }
                            } else if (class76.field1241 && var10.method1259(-475686027)) {
                                class2 var12 = class183.field2983 == -1 ? null : class119.method816(class183.field2983, (byte) 87);
                                if ((class176.field2898 & 0x10) != 0 && (var12 == null || var11.method1321((byte) 124, var12.field25, class183.field2983) != var12.field25)) {
                                    class199.field3225++;
                                    class37.method247((long) var11.field3273, class6.field67, class253.field4145 + " -> <col=ff9040>" + var11.field3216, 10032, var5, class158.field2640, (short) 10, arg3.field786);
                                }
                            } else {
                                String[] var13 = var11.field3221;
                                class191.field3092++;
                                if (class29.field433) {
                                    var13 = class285.method1903(var13, false);
                                }
                                if (var10.method1259(-475686027)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class208.field3539++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 24;
                                            } else {
                                                var15 = 39;
                                            }
                                            class37.method247((long) var11.field3273, var13[var14], "<col=ff9040>" + var11.field3216, 10032, var5, -1, var15, arg3.field786);
                                        }
                                    }
                                }
                                if (var10.method1262(4278)) {
                                    class37.method247((long) var11.field3273, class45.field631, "<col=ff9040>" + var11.field3216, arg0 + 10010, var5, class256.field4179, (short) 46, arg3.field786);
                                    class207.field3461++;
                                }
                                if (var10.method1259(-475686027) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class144.field2463++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 4;
                                            }
                                            if (var16 == 1) {
                                                var17 = 9;
                                            }
                                            if (var16 == 2) {
                                                var17 = 44;
                                            }
                                            class37.method247((long) var11.field3273, var13[var16], "<col=ff9040>" + var11.field3216, arg0 + 10010, var5, -1, var17, arg3.field786);
                                        }
                                    }
                                }
                                String[] var18 = arg3.field712;
                                if (class29.field433) {
                                    var18 = class285.method1903(var18, false);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class155.field2589++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 40;
                                            }
                                            if (var19 == 1) {
                                                var20 = 48;
                                            }
                                            if (var19 == 2) {
                                                var20 = 29;
                                            }
                                            if (var19 == 3) {
                                                var20 = 13;
                                            }
                                            if (var19 == 4) {
                                                var20 = 25;
                                            }
                                            class37.method247((long) var11.field3273, var18[var19], "<col=ff9040>" + var11.field3216, arg0 ^ 0x2726, var5, -1, var20, arg3.field786);
                                        }
                                    }
                                }
                                class37.method247((long) var11.field3273, class277.field4436, "<col=ff9040>" + var11.field3216, 10032, var5, class293.field4678, (short) 1007, arg3.field786);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field734) {
            return;
        }
        if (!class76.field1241) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class115.method805(72, arg3, var21);
                if (var25 != null) {
                    class37.method247((long) (var21 + 1), var25, arg3.field699, arg0 ^ 0x2726, arg3.field704, class294.method1978(arg3, (byte) -109, var21), (short) 1001, arg3.field786);
                    class187.field3024++;
                }
            }
            String var22 = client.method1925(arg3, false);
            if (var22 != null) {
                class37.method247(0L, var22, arg3.field699, 10032, arg3.field704, -1, (short) 3, arg3.field786);
                class37.field568++;
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class115.method805(-89, arg3, var23);
                if (var24 != null) {
                    class37.method247((long) (var23 + 1), var24, arg3.field699, arg0 ^ 0x2726, arg3.field704, class294.method1978(arg3, (byte) -109, var23), (short) 26, arg3.field786);
                    class187.field3024++;
                }
            }
            if (client.method1922(arg3).method1254((byte) 12)) {
                if (arg3.field807 == null) {
                    class37.method247(0L, class228.field3839, "", 10032, arg3.field704, -1, (short) 22, arg3.field786);
                } else {
                    class37.method247(0L, arg3.field807, "", 10032, arg3.field704, -1, (short) 22, arg3.field786);
                }
                class105.field1875++;
                return;
            }
            return;
        }
        if (client.method1922(arg3).method1260((byte) 125) && (class176.field2898 & 0x20) != 0) {
            class37.method247(0L, class6.field67, class253.field4145 + " -> " + arg3.field699, 10032, arg3.field704, class158.field2640, (short) 45, arg3.field786);
            class103.field1821++;
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2752++;
        if (class69.field1130 == this && !class186.field3017) {
            class276.field4417 = class232.method1544((byte) -87);
            class245.method1636(false, 5000L);
            class5.field61 = null;
            this.method1140(false, -51);
        }
    }

    @OriginalMember(owner = "client!ub", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2774++;
    }

    @OriginalMember(owner = "client!ub", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2775++;
        if (class69.field1130 != this || class186.field3017) {
            return;
        }
        class229.field3857 = true;
        if (class184.field2992 && class232.method1544((byte) -88) - class93.field1640 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class132.field2302 <= var2.width && class42.field623 <= var2.height) {
                class107.field1911 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
    public final void run() {
        field2754++;
        try {
            if (class131.field2292 != null) {
                String var1 = class131.field2292.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class131.field2285;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1127((byte) 104, "wrongjava");
                        return;
                    }
                    class47.field824 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class131.field2285 == null || class131.field2285.equals("1.4.2"))) {
                    this.method1127((byte) 104, "wrongjava");
                    return;
                }
            }
            if (class131.field2285 != null && class131.field2285.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class131.field2285.length() > var3) {
                    char var5 = class131.field2285.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class184.field2992 = true;
                }
            }
            if (class127.field2238.field2294 != null) {
                Method var6 = class131.field2299;
                if (var6 != null) {
                    try {
                        var6.invoke(class127.field2238.field2294, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class273.method1794((byte) 112);
            this.method1135(0);
            class240.field3944 = class213.method1421(class118.field2099, class267.field4324, class4.field38, (byte) -85);
            this.method1136((byte) 117);
            class256.field4177 = class252.method1673(100);
            while (class276.field4417 == 0L || class232.method1544((byte) -102) < class276.field4417) {
                class246.field4042 = class256.field4177.method427(class79.field1356, (byte) 51, class47.field824);
                for (int var7 = 0; var7 < class246.field4042; var7++) {
                    this.method1126(-9370);
                }
                this.method1128(-5090);
                class151.method1034(class127.field2238, true, class118.field2099);
            }
        } catch (Exception var10) {
            class254.method1684(-93, var10, (String) null);
            this.method1127((byte) 104, "crash");
        }
        this.method1140(true, -51);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
    private final void method1140(boolean arg0, int arg1) {
        field2779++;
        synchronized (this) {
            if (class186.field3017) {
                return;
            }
            if (arg1 != -51) {
                this.field2759 = false;
            }
            class186.field3017 = true;
        }
        if (class127.field2238.field2294 != null) {
            class127.field2238.field2294.destroy();
        }
        try {
            this.method1130(-6);
        } catch (Exception var9) {
        }
        if (class118.field2099 != null) {
            try {
                class118.field2099.removeFocusListener(this);
                class118.field2099.getParent().remove(class118.field2099);
            } catch (Exception var8) {
            }
        }
        if (class127.field2238 != null) {
            try {
                class127.field2238.method918(14931);
            } catch (Exception var7) {
            }
        }
        this.method1137(-1);
        if (class270.field4349 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ub", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2769++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILjava/lang/String;IIIIZ)V")
    public final void method1141(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        try {
            class4.field38 = arg3;
            class42.field623 = arg3;
            class237.field3901 = arg4;
            class72.field1189 = 0;
            class267.field4324 = arg6;
            class132.field2302 = arg6;
            class69.field1130 = this;
            class231.field3870 = 0;
            class270.field4349 = new Frame();
            class270.field4349.setTitle("Jagex");
            if (arg7) {
                this.paint((Graphics) null);
            }
            class270.field4349.setResizable(true);
            class270.field4349.addWindowListener(this);
            class270.field4349.setVisible(true);
            class270.field4349.toFront();
            Insets var9 = class270.field4349.getInsets();
            class270.field4349.setSize(class132.field2302 + var9.left + var9.right, class42.field623 + var9.top + var9.bottom);
            class5.field61 = class127.field2238 = new class131((Applet) null, arg1, arg2, arg5);
            class174 var10 = class127.field2238.method917(1, (byte) 120, this);
            while (var10.field2857 == 0) {
                class245.method1636(false, 10L);
            }
        } catch (Exception var12) {
            class254.method1684(123, var12, (String) null);
        }
        field2764++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    public static final int method1142(int arg0, int arg1) {
        field2782++;
        if (arg0 != 6607) {
            field2787 = -8;
        }
        int var2 = (arg1 & 0xC3) >> 6;
        int var3 = arg1 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ub", name = "start", descriptor = "()V")
    public final void start() {
        field2770++;
        if (class69.field1130 == this && !class186.field3017) {
            class276.field4417 = 0L;
        }
    }
}
