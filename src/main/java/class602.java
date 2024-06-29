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

@OriginalClass("client!fj")
public abstract class class602 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Z")
    private boolean field8546 = false;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "Z")
    private boolean field8563 = false;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "[Li;")
    public static class251[] field8567;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "S")
    public static short field8570;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "Liu;")
    public static class517 field8568;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "Z")
    public static boolean field8573;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "Z")
    public static boolean field8574;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "Z")
    public static boolean field8576;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "Z")
    public static boolean field8577;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "Z")
    public static boolean field8580;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "Z")
    public static boolean field8581;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "[I")
    public static int[] field8572;

    static {
        new class567("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field8567 = new class251[16];
        field8569 = 0;
        field8570 = 32767;
        field8568 = new class517(39, -2);
        field8571 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V", line = 4)
    public static final void method3416(int arg0, int arg1, byte arg2) {
        field8562++;
        if (arg2 != 12) {
            providesignlink(null);
        }
        if (class212.field3102 < class212.field3108) {
            class212.field3102 = (float) ((double) class212.field3102 / 30.0D + (double) class212.field3102);
            if (class212.field3108 < class212.field3102) {
                class212.field3102 = class212.field3108;
            }
            class173.method1192(arg2 + 588394974);
            class212.field3104 = (int) class212.field3102 >> 1;
            class212.field3101 = class593.method3389((byte) 118, class212.field3104);
        } else if (class212.field3102 > class212.field3108) {
            class212.field3102 = (float) ((double) class212.field3102 - (double) class212.field3102 / 30.0D);
            if (class212.field3108 > class212.field3102) {
                class212.field3102 = class212.field3108;
            }
            class173.method1192(588394986);
            class212.field3104 = (int) class212.field3102 >> 1;
            class212.field3101 = class593.method3389((byte) 120, class212.field3104);
        }
        if (class469.field6762 != -1 && class378.field5562 != -1) {
            int var3 = class469.field6762 - class274.field4008;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class378.field5562 - class119.field1915;
            class274.field4008 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class469.field6762 = -1;
                class378.field5562 = -1;
            }
            class119.field1915 += var4;
            class173.method1192(arg2 ^ 0x231231E6);
        }
        if (class62.field856 > 0) {
            class608.field8634--;
            if (class608.field8634 == 0) {
                class608.field8634 = 100;
                class62.field856--;
            }
        } else {
            class454.field6570 = -1;
            class47.field663 = -1;
        }
        if (!class181.field2621 || class97.field1694 == null) {
            return;
        }
        for (class345 var5 = (class345) class97.field1694.method427(true); var5 != null; var5 = (class345) class97.field1694.method420(false)) {
            class192 var6 = class212.field3095.method70(var5.field4939.field2298, 88);
            if (var5.method2097(-7491, arg0, arg1)) {
                if (var6.field2763 != null) {
                    if (var6.field2763[4] != null) {
                        class366.method2209(-1, 0, 1002, -1, true, (long) var5.field4939.field2298, arg2 ^ 0xFFFFFFF3, var6.field2769, var6.field2763[4], false, var6.field2732);
                    }
                    if (var6.field2763[3] != null) {
                        class366.method2209(-1, 0, 1008, -1, true, (long) var5.field4939.field2298, -1, var6.field2769, var6.field2763[3], false, var6.field2732);
                    }
                    if (var6.field2763[2] != null) {
                        class366.method2209(-1, 0, 1009, -1, true, (long) var5.field4939.field2298, -1, var6.field2769, var6.field2763[2], false, var6.field2732);
                    }
                    if (var6.field2763[1] != null) {
                        class366.method2209(-1, 0, 1011, -1, true, (long) var5.field4939.field2298, -1, var6.field2769, var6.field2763[1], false, var6.field2732);
                    }
                    if (var6.field2763[0] != null) {
                        class366.method2209(-1, 0, 1001, -1, true, (long) var5.field4939.field2298, arg2 ^ 0xFFFFFFF3, var6.field2769, var6.field2763[0], false, var6.field2732);
                    }
                }
                if (!var5.field4939.field2301) {
                    var5.field4939.field2301 = true;
                    class30.method283(class275.field4023, var5.field4939.field2298, var6.field2769);
                }
                if (var5.field4939.field2301) {
                    class30.method283(class445.field6492, var5.field4939.field2298, var6.field2769);
                }
            } else if (var5.field4939.field2301) {
                var5.field4939.field2301 = false;
                class30.method283(class515.field7120, var5.field4939.field2298, var6.field2769);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 141)
    public final URL getCodeBase() {
        field8534++;
        if (class327.field4718 == null) {
            return class270.field3976 == null || class270.field3976.field549 == this ? super.getCodeBase() : class270.field3976.field549.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V", line = 158)
    private final void method3417(int arg0, boolean arg1) {
        field8554++;
        synchronized (this) {
            if (arg0 > -7) {
                field8572 = null;
            }
            if (class117.field1902) {
                return;
            }
            class117.field1902 = true;
        }
        if (class270.field3976.field549 != null) {
            class270.field3976.field549.destroy();
        }
        try {
            this.method3426(false);
        } catch (Exception var10) {
        }
        if (this.field8546) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field8546 = false;
        }
        class124.method985((byte) -126, true);
        class641.method3694(0);
        if (class474.field6795 != null) {
            try {
                class474.field6795.removeFocusListener(this);
                class474.field6795.getParent().remove(class474.field6795);
            } catch (Exception var8) {
            }
        }
        if (class270.field3976 != null) {
            try {
                class270.field3976.method360(0);
            } catch (Exception var7) {
            }
        }
        this.method3419(true);
        if (class327.field4718 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!fj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 235)
    public final AppletContext getAppletContext() {
        field8538++;
        if (class327.field4718 == null) {
            return class270.field3976 == null || class270.field3976.field549 == this ? super.getAppletContext() : class270.field3976.field549.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 250)
    public final void method3418(String arg0, int arg1) {
        field8540++;
        if (this.field8563) {
            return;
        }
        this.field8563 = true;
        System.out.println("error_game_" + arg0);
        try {
            class630.method3564(class270.field3976.field549, "loggedout", (byte) -102);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg1 != 4095) {
            field8572 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 277)
    public final URL getDocumentBase() {
        field8560++;
        if (class327.field4718 == null) {
            return class270.field3976 == null || class270.field3976.field549 == this ? super.getDocumentBase() : class270.field3976.field549.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIB)Ljava/lang/String;", line = 302)
    public static final String method3420(int arg0, int arg1, byte arg2) {
        field8553++;
        int var3 = -83 % ((-arg2 - 22) / 55);
        int var4 = arg0 - arg1;
        if (var4 < -9) {
            return "<col=ff0000>";
        } else if (var4 < -6) {
            return "<col=ff3000>";
        } else if (var4 < -3) {
            return "<col=ff7000>";
        } else if (var4 < 0) {
            return "<col=ffb000>";
        } else if (var4 > 9) {
            return "<col=00ff00>";
        } else if (var4 > 6) {
            return "<col=40ff00>";
        } else if (var4 > 3) {
            return "<col=80ff00>";
        } else if (var4 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!fj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 344)
    public final void windowActivated(WindowEvent arg0) {
        field8552++;
    }

    @OriginalMember(owner = "client!fj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 351)
    public final synchronized void paint(Graphics arg0) {
        field8557++;
        if (class308.field4468 != this || class117.field1902) {
            return;
        }
        class17.field258 = true;
        if (class263.field3835 && (class508.method2860(false) - class634.field9221) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class416.field6134 && class638.field9262 <= var2.height) {
                class183.field2633 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Ljava/lang/String;", line = 373)
    public String method3421(byte arg0) {
        field8533++;
        if (arg0 != 36) {
            this.field8563 = false;
        }
        return null;
    }

    @OriginalMember(owner = "client!fj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 386)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field8551++;
    }

    @OriginalMember(owner = "client!fj", name = "destroy", descriptor = "()V", line = 395)
    public final void destroy() {
        field8549++;
        if (class308.field4468 == this && !class117.field1902) {
            class47.field650 = class508.method2860(false);
            class210.method1342(-110, 5000L);
            class167.field2446 = null;
            this.method3417(-33, false);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V", line = 409)
    private final void method3423(byte arg0) {
        field8547++;
        long var2 = class508.method2860(false);
        long var4 = class340.field4887[class161.field2399];
        class340.field4887[class161.field2399] = var2;
        class161.field2399 = class161.field2399 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class437.field6388 = ((var6 >> 1) + 32000) / var6;
        }
        if (class139.field2196++ > 50) {
            class17.field258 = true;
            class139.field2196 -= 50;
            class474.field6795.setSize(class68.field1285, class442.field6464);
            class474.field6795.setVisible(true);
            if (class327.field4718 != null && class443.field6474 == null) {
                Insets var7 = class327.field4718.getInsets();
                class474.field6795.setLocation(var7.left + class335.field4800, class39.field516 + var7.top);
            } else {
                class474.field6795.setLocation(class335.field4800, class39.field516);
            }
        }
        this.method3431(false);
        if (arg0 < 63) {
            this.windowIconified(null);
        }
    }

    @OriginalMember(owner = "client!fj", name = "providesignlink", descriptor = "(Lae;)V", line = 453)
    public static final void providesignlink(class40 arg0) {
        class270.field3976 = arg0;
        class167.field2446 = arg0;
        field8537++;
    }

    @OriginalMember(owner = "client!fj", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 461)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field8564++;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V", line = 470)
    public static final void method3424(byte arg0) {
        class234.field3444.method2406(arg0 ^ 0xFFFFFFF7);
        field8531++;
        if (arg0 != 123) {
            providesignlink(null);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Z", line = 482)
    public final boolean method3425(int arg0) {
        field8550++;
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
                this.method3418("invalidhost", arg0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 515)
    public final void windowDeiconified(WindowEvent arg0) {
        field8565++;
    }

    @OriginalMember(owner = "client!fj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 522)
    public final void windowOpened(WindowEvent arg0) {
        field8548++;
    }

    @OriginalMember(owner = "client!fj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 529)
    public final String getParameter(String arg0) {
        field8543++;
        if (class327.field4718 == null) {
            return class270.field3976 == null || class270.field3976.field549 == this ? super.getParameter(arg0) : class270.field3976.field549.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)Z", line = 547)
    public final boolean method3427(int arg0) {
        field8544++;
        return arg0 >= -126 ? true : class8.method31(false, "jaclib");
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIZI[[[Lbr;I)Z", line = 559)
    public static final boolean method3428(boolean arg0, int arg1, boolean arg2, int arg3, class184[][][] arg4, int arg5) {
        field8561++;
        byte var6 = arg0 ? 1 : (byte) (class79.field1432 & 0xFF);
        if (class338.field4854[class545.field7583][arg1][arg3] == var6) {
            return false;
        } else if ((class104.field1755[class545.field7583][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg2) {
                method3436(-9);
            }
            class473.field6784[var7] = arg1;
            int var8 = 0;
            int var35 = var7 + 1;
            class619.field8733[var7] = arg3;
            class338.field4854[class545.field7583][arg1][arg3] = var6;
            while (var35 != var8) {
                int var9 = class473.field6784[var8] & 0xFFFF;
                int var10 = (class473.field6784[var8] & 0xFF20FC) >> 16;
                int var11 = class473.field6784[var8] >> 24 & 0xFF;
                int var12 = class619.field8733[var8] & 0xFFFF;
                int var13 = (class619.field8733[var8] & 0xFF4F3A) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class104.field1755[class545.field7583][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class545.field7583 + 1; var16 <= 3; var16++) {
                    if ((class104.field1755[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field2669 != null) {
                                int var20 = class188.method1257(var10, -12746);
                                if (arg4[var16][var9][var12].field2669.field5149 == var20 || arg4[var16][var9][var12].field2653 != null && arg4[var16][var9][var12].field2653.field5149 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class188.method1257(var11, -12746);
                                    if (arg4[var16][var9][var12].field2669.field5149 == var21 || arg4[var16][var9][var12].field2653 != null && arg4[var16][var9][var12].field2653.field5149 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class188.method1257(var13, -12746);
                                    if (arg4[var16][var9][var12].field2669.field5149 == var22 || arg4[var16][var9][var12].field2653 != null && arg4[var16][var9][var12].field2653.field5149 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class184 var23 = arg4[var16][var9][var12];
                            if (var23.field2675 != null) {
                                for (class277 var24 = var23.field2675; var24 != null; var24 = var24.field4045) {
                                    class360 var25 = var24.field4044;
                                    if (var25 instanceof class231) {
                                        class231 var26 = (class231) var25;
                                        int var27 = var26.method269(-13265);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method258((byte) -36);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class184 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field2675 != null) {
                            for (class277 var31 = var30.field2675; var31 != null; var31 = var31.field4045) {
                                class360 var32 = var31.field4044;
                                if (var32.field5119 != var32.field5117 || var32.field5113 != var32.field5107) {
                                    for (int var33 = var32.field5117; var33 <= var32.field5119; var33++) {
                                        for (int var34 = var32.field5113; var34 <= var32.field5107; var34++) {
                                            class338.field4854[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class338.field4854[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class88.field1594[class545.field7583 + 1].method694(var9, var12);
                    if (class493.field6923[arg5] < var17) {
                        class493.field6923[arg5] = var17;
                    }
                    int var18 = var9 << 7;
                    if (class612.field8693[arg5] > var18) {
                        class612.field8693[arg5] = var18;
                    } else if (var18 > class321.field4652[arg5]) {
                        class321.field4652[arg5] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class443.field6475[arg5]) {
                        class443.field6475[arg5] = var19;
                    } else if (var19 > class78.field1414[arg5]) {
                        class78.field1414[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class338.field4854[class545.field7583][var9 - 1][var12] != var6) {
                        class473.field6784[var35] = class188.method1258(class188.method1258(1179648, var9 - 1), -754974720);
                        class619.field8733[var35] = class188.method1258(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class338.field4854[class545.field7583][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class66.field990 > var12) {
                        if ((var9 - 1) >= 0 && class338.field4854[class545.field7583][var9 - 1][var12] != var6 && (class104.field1755[class545.field7583][var9][var12] & 0x4) == 0 && (class104.field1755[class545.field7583][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class473.field6784[var35] = class188.method1258(1375731712, class188.method1258(1179648, var9 - 1));
                            class619.field8733[var35] = class188.method1258(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class338.field4854[class545.field7583][var9 - 1][var12] = var6;
                        }
                        if (class338.field4854[class545.field7583][var9][var12] != var6) {
                            class473.field6784[var35] = class188.method1258(class188.method1258(5373952, var9), 318767104);
                            class619.field8733[var35] = class188.method1258(var12, 5439488);
                            class338.field4854[class545.field7583][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class146.field2247 && class338.field4854[class545.field7583][var9 + 1][var12] != var6 && (class104.field1755[class545.field7583][var9][var12] & 0x4) == 0 && (class104.field1755[class545.field7583][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class473.field6784[var35] = class188.method1258(-1845493760, class188.method1258(5373952, var9 + 1));
                            class619.field8733[var35] = class188.method1258(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class338.field4854[class545.field7583][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class146.field2247 && class338.field4854[class545.field7583][var9 + 1][var12] != var6) {
                        class473.field6784[var35] = class188.method1258(1392508928, class188.method1258(var9 + 1, 9568256));
                        class619.field8733[var35] = class188.method1258(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class338.field4854[class545.field7583][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class338.field4854[class545.field7583][var9 - 1][var12] != var6 && (class104.field1755[class545.field7583][var9][var12] & 0x4) == 0 && (class104.field1755[class545.field7583][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class473.field6784[var35] = class188.method1258(class188.method1258(13762560, var9 - 1), 301989888);
                            class619.field8733[var35] = class188.method1258(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class338.field4854[class545.field7583][var9 - 1][var12] = var6;
                        }
                        if (class338.field4854[class545.field7583][var9][var12] != var6) {
                            class473.field6784[var35] = class188.method1258(-1828716544, class188.method1258(13762560, var9));
                            class619.field8733[var35] = class188.method1258(13828096, var12);
                            class338.field4854[class545.field7583][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class146.field2247 > (var9 + 1) && class338.field4854[class545.field7583][var9 + 1][var12] != var6 && (class104.field1755[class545.field7583][var9][var12] & 0x4) == 0 && (class104.field1755[class545.field7583][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class473.field6784[var35] = class188.method1258(class188.method1258(9568256, var9 + 1), -771751936);
                            class619.field8733[var35] = class188.method1258(9633792, var12);
                            class338.field4854[class545.field7583][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class493.field6923[arg5] != -1000000) {
                class493.field6923[arg5] += 10;
                class612.field8693[arg5] -= 50;
                class321.field4652[arg5] += 50;
                class78.field1414[arg5] += 50;
                class443.field6475[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V", line = 880)
    private final void method3429(byte arg0) {
        field8536++;
        long var2 = class508.method2860(false);
        long var4 = class54.field780[class376.field5521];
        class54.field780[class376.field5521] = var2;
        class376.field5521 = class376.field5521 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class497.field6973 = class295.field4256;
        }
        this.method3432(true);
        if (arg0 <= 54) {
            field8567 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIZILjava/lang/String;ZI)V", line = 915)
    public final void method3430(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5, boolean arg6, int arg7) {
        try {
            class335.field4800 = 0;
            class384.field5719 = arg2;
            class308.field4468 = this;
            class39.field516 = 0;
            class68.field1285 = arg0;
            class416.field6134 = arg0;
            class442.field6464 = arg1;
            class638.field9262 = arg1;
            class327.field4718 = new Frame();
            class327.field4718.setTitle("Jagex");
            class327.field4718.setResizable(arg3);
            class327.field4718.addWindowListener(this);
            class327.field4718.setVisible(true);
            class327.field4718.toFront();
            Insets var9 = class327.field4718.getInsets();
            class327.field4718.setSize(var9.right + var9.left + class416.field6134, class638.field9262 + var9.top + var9.bottom);
            class167.field2446 = class270.field3976 = new class40(null, arg7, arg5, arg4);
            class329 var10 = class270.field3976.method353(this, 1, false);
            while (var10.field4739 == 0) {
                class210.method1342(-104, 10L);
            }
        } catch (Exception var12) {
            class593.method3390(null, var12, 0);
        }
        field8542++;
    }

    @OriginalMember(owner = "client!fj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 956)
    public final void focusGained(FocusEvent arg0) {
        field8555++;
        class295.field4256 = true;
        class17.field258 = true;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)Z", line = 974)
    public final boolean method3433(int arg0) {
        field8541++;
        if (arg0 <= 35) {
            this.method3432(false);
        }
        return class8.method31(false, "jagmisc");
    }

    @OriginalMember(owner = "client!fj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 985)
    public final void windowIconified(WindowEvent arg0) {
        field8556++;
    }

    @OriginalMember(owner = "client!fj", name = "stop", descriptor = "()V", line = 992)
    public final void stop() {
        field8530++;
        if (class308.field4468 == this && !class117.field1902) {
            class47.field650 = class508.method2860(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!fj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1007)
    public final void focusLost(FocusEvent arg0) {
        class295.field4256 = false;
        field8539++;
    }

    @OriginalMember(owner = "client!fj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1016)
    public final void windowDeactivated(WindowEvent arg0) {
        field8559++;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V", line = 1029)
    public final synchronized void method3434(int arg0) {
        field8558++;
        if (class474.field6795 != null) {
            class474.field6795.removeFocusListener(this);
            class474.field6795.getParent().remove(class474.field6795);
        }
        Container var2;
        if (class443.field6474 != null) {
            var2 = class443.field6474;
        } else if (class327.field4718 == null) {
            var2 = class270.field3976.field549;
        } else {
            var2 = class327.field4718;
        }
        var2.setLayout(null);
        class474.field6795 = new class335(this);
        var2.add(class474.field6795);
        class474.field6795.setSize(class68.field1285, class442.field6464);
        class474.field6795.setVisible(true);
        if (arg0 > -25) {
            return;
        }
        if (class327.field4718 == var2) {
            Insets var3 = class327.field4718.getInsets();
            class474.field6795.setLocation(class335.field4800 + var3.left, var3.top - -class39.field516);
        } else {
            class474.field6795.setLocation(class335.field4800, class39.field516);
        }
        class474.field6795.addFocusListener(this);
        class474.field6795.requestFocus();
        class497.field6973 = true;
        class295.field4256 = true;
        class17.field258 = true;
        class183.field2633 = false;
        class634.field9221 = class508.method2860(false);
    }

    @OriginalMember(owner = "client!fj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1076)
    public final void windowClosed(WindowEvent arg0) {
        field8535++;
    }

    @OriginalMember(owner = "client!fj", name = "run", descriptor = "()V", line = 1085)
    public final void run() {
        try {
            label108: {
                if (class40.field560 != null) {
                    String var1 = class40.field560.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class40.field562;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method3418("wrongjava", 4095);
                            break label108;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class40.field562 == null || class40.field562.equals("1.4.2"))) {
                        this.method3418("wrongjava", 4095);
                        break label108;
                    }
                }
                if (class40.field562 != null && class40.field562.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class40.field562.length()) {
                        char var5 = class40.field562.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class263.field3835 = true;
                    }
                }
                if (class270.field3976.field549 != null) {
                    Method var6 = class40.field567;
                    if (var6 != null) {
                        try {
                            var6.invoke(class270.field3976.field549, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class581.method3326(-31);
                class260.method1652(1009);
                this.method3434(-116);
                this.method3422(2969);
                class258.field3749 = class99.method856(0);
                while (class47.field650 == 0L || class508.method2860(false) < class47.field650) {
                    class24.field328 = class258.field3749.method718(class232.field3419, -112);
                    for (int var7 = 0; var7 < class24.field328; var7++) {
                        this.method3429((byte) 82);
                    }
                    this.method3423((byte) 77);
                    class153.method1091(class270.field3976, class474.field6795, -102);
                }
            }
        } catch (Throwable var10) {
            class593.method3390(this.method3421((byte) 36), var10, 0);
            this.method3418("crash", 4095);
        }
        field8566++;
        this.method3417(-127, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V", line = 1212)
    public final void method3435(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8532++;
        if (arg3 <= 30) {
            field8571 = 39;
        }
        try {
            if (class308.field4468 == null) {
                class39.field516 = 0;
                class442.field6464 = arg1;
                class638.field9262 = arg1;
                class335.field4800 = 0;
                class384.field5719 = arg2;
                class308.field4468 = this;
                class68.field1285 = arg0;
                class416.field6134 = arg0;
                if (class270.field3976 == null) {
                    class167.field2446 = class270.field3976 = new class40(this, arg4, null, 0);
                }
                class329 var6 = class270.field3976.method353(this, 1, false);
                while (var6.field4739 == 0) {
                    class210.method1342(-30, 10L);
                }
            } else {
                class549.field7783++;
                if (class549.field7783 >= 3) {
                    this.method3418("alreadyloaded", 4095);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class593.method3390(null, var8, 0);
            this.method3418("crash", 4095);
        }
    }

    @OriginalMember(owner = "client!fj", name = "start", descriptor = "()V", line = 1261)
    public final void start() {
        field8545++;
        if (class308.field4468 == this && !class117.field1902) {
            class47.field650 = 0L;
        }
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V", line = 1278)
    public static void method3436(int arg0) {
        if (arg0 == 32763) {
            field8568 = null;
            field8567 = null;
            field8572 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public abstract void method3419(boolean arg0);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public abstract void method3422(int arg0);

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    public abstract void method3426(boolean arg0);

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(Z)V")
    public abstract void method3431(boolean arg0);

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(Z)V")
    public abstract void method3432(boolean arg0);

    @OriginalMember(owner = "client!fj", name = "init", descriptor = "()V")
    public abstract void init();
}
