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

@OriginalClass("client!ue")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Z")
    private boolean field3255 = false;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lrd;")
    public static class117 field3234 = class95.method812("(Y", (byte) 8);

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Lrd;")
    public static class117 field3262 = class95.method812("Verbinde mit Server)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lmb;")
    public static class85 field3244 = new class85(64);

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "Lrd;")
    private static class117 field3270 = class95.method812("Loaded update list", (byte) 8);

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Lrd;")
    public static class117 field3269 = field3270;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "Lrd;")
    public static class117 field3268 = class95.method812("runes", (byte) 8);

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "Lqb;")
    public static class109 field3267 = new class109();

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "[Lrd;")
    public static class117[] field3274 = new class117[20];

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Lrd;")
    public static class117 field3275 = class95.method812(": ", (byte) 8);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lra;")
    public static class114 field3247;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Laf;")
    public static class7 field3273;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Z")
    public static boolean field3276;

    @OriginalMember(owner = "client!ue", name = "providesignlink", descriptor = "(Lba;)V")
    public static final void providesignlink(class9 arg0) {
        class4.field104 = arg0;
        class138.field3313 = arg0;
        field3252++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public abstract void method240(byte arg0);

    @OriginalMember(owner = "client!ue", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3254++;
    }

    @OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3239++;
        class140.field3339 = true;
        class109.field2727 = true;
    }

    @OriginalMember(owner = "client!ue", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3253++;
        if (class99.field2460 != this || class62.field1778) {
            return;
        }
        class109.field2727 = true;
        if (class9.field188 != null && class9.field188.startsWith("1.5") && class105.method875((byte) -80) - class141.field3360 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class94.field2365 <= var2.width && var2.height >= class142.field3391) {
                class56.field1572 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    private final void method1102(boolean arg0) {
        field3246++;
        long var2 = class132.field3171[class111.field2771];
        long var4 = class105.method875((byte) -80);
        class132.field3171[class111.field2771] = var4;
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class111.field2771 = class111.field2771 + 1 & 0x1F;
        synchronized (this) {
            if (arg0) {
                this.method1104(95);
            }
            class96.field2414 = class140.field3339;
        }
        this.method239((byte) -108);
    }

    @OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class140.field3339 = false;
        field3264++;
    }

    @OriginalMember(owner = "client!ue", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3241++;
    }

    @OriginalMember(owner = "client!ue", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3235++;
        if (class26.field768 == null) {
            return class4.field104 == null || class4.field104.field187 == this ? super.getCodeBase() : class4.field104.field187.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public abstract void method239(byte arg0);

    @OriginalMember(owner = "client!ue", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
    public abstract void method246(boolean arg0);

    @OriginalMember(owner = "client!ue", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3272++;
        if (class99.field2460 == this && !class62.field1778) {
            client.field619 = class105.method875((byte) -80);
            class60.method611(5000L, true);
            class138.field3313 = null;
            this.method1109(-1);
        }
    }

    @OriginalMember(owner = "client!ue", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3266++;
        if (class26.field768 == null) {
            return class4.field104 == null || class4.field104.field187 == this ? super.getAppletContext() : class4.field104.field187.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZIIIIIIII)Z")
    public static final boolean method1103(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class94.field2359[var12][var36] = 0;
                class138.field3321[var12][var36] = 99999999;
            }
        }
        class94.field2359[arg7][arg9] = 99;
        field3248++;
        class138.field3321[arg7][arg9] = 0;
        int var13 = arg7;
        int var14 = arg9;
        byte var15 = 0;
        class27.field799[var15] = arg7;
        boolean var16 = false;
        int var37 = var15 + 1;
        class83.field2183[var15] = arg9;
        int var17 = 0;
        int var18 = class27.field799.length;
        int[][] var19 = class18.field461[class120.field2940].field1455;
        while (var37 != var17) {
            var14 = class83.field2183[var17];
            var13 = class27.field799[var17];
            var17 = (var17 + 1) % var18;
            if (arg1 == var13 && arg4 == var14) {
                var16 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class18.field461[class120.field2940].method576(arg1, arg0, arg4, arg5 - 1, arg10 ^ 0xFFFFFFFC, var14, var13)) {
                    var16 = true;
                    break;
                }
                if (arg5 < 10 && class18.field461[class120.field2940].method561(var14, arg5 - 1, arg0, var13, -65, arg4, arg1)) {
                    var16 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg6 != 0 && class18.field461[class120.field2940].method575(58, arg6, arg11, arg4, var13, arg1, var14, arg8)) {
                var16 = true;
                break;
            }
            int var35 = class138.field3321[var13][var14] + 1;
            if (var13 > 0 && class94.field2359[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0) {
                class27.field799[var37] = var13 - 1;
                class83.field2183[var37] = var14;
                class94.field2359[var13 - 1][var14] = 2;
                class138.field3321[var13 - 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && class94.field2359[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0) {
                class27.field799[var37] = var13 + 1;
                class83.field2183[var37] = var14;
                class94.field2359[var13 + 1][var14] = 8;
                class138.field3321[var13 + 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 > 0 && class94.field2359[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class27.field799[var37] = var13;
                class83.field2183[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class94.field2359[var13][var14 - 1] = 1;
                class138.field3321[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class94.field2359[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class27.field799[var37] = var13;
                class83.field2183[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class94.field2359[var13][var14 + 1] = 4;
                class138.field3321[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class94.field2359[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class27.field799[var37] = var13 - 1;
                class83.field2183[var37] = var14 - 1;
                class94.field2359[var13 - 1][var14 - 1] = 3;
                class138.field3321[var13 - 1][var14 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var14 > 0 && class94.field2359[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class27.field799[var37] = var13 + 1;
                class83.field2183[var37] = var14 - 1;
                class94.field2359[var13 + 1][var14 - 1] = 9;
                var37 = (var37 + 1) % var18;
                class138.field3321[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class94.field2359[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class27.field799[var37] = var13 - 1;
                class83.field2183[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class94.field2359[var13 - 1][var14 + 1] = 6;
                class138.field3321[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class94.field2359[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class27.field799[var37] = var13 + 1;
                class83.field2183[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class94.field2359[var13 + 1][var14 + 1] = 12;
                class138.field3321[var13 + 1][var14 + 1] = var35;
            }
        }
        class66.field1875 = 0;
        if (!var16) {
            if (!arg3) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg1 - var22; var23 <= arg1 + var22; var23++) {
                for (int var24 = arg4 - var22; var24 <= arg4 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class138.field3321[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg1 > var23) {
                            var25 = arg1 - var23;
                        } else if (var23 > arg1 + arg11 - 1) {
                            var25 = var23 + 1 - arg11 - arg1;
                        }
                        int var26 = 0;
                        if (arg4 > var24) {
                            var26 = arg4 - var24;
                        } else if (var24 > arg4 + arg6 - 1) {
                            var26 = var24 + 1 - arg4 - arg6;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var21 > var27 || var21 == var27 && class138.field3321[var23][var24] < var20) {
                            var13 = var23;
                            var20 = class138.field3321[var23][var24];
                            var14 = var24;
                            var21 = var27;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg7 == var13 && arg9 == var14) {
                return false;
            }
            class66.field1875 = 1;
        }
        byte var28 = 0;
        class27.field799[var28] = var13;
        int var38 = var28 + 1;
        class83.field2183[var28] = var14;
        int var29;
        int var30 = var29 = class94.field2359[var13][var14];
        while (arg7 != var13 || arg9 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class27.field799[var38] = var13;
                class83.field2183[var38++] = var14;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class94.field2359[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class27.field799[var38];
            int var33 = class83.field2183[var38];
            if (arg2 == 0) {
                class25.field754.method739(false, 73);
                class68.field1927++;
                class25.field754.method162(var31 + var31 + 3, -23339);
            }
            if (arg2 == 1) {
                class25.field754.method739(false, 233);
                class25.field754.method162(var31 + var31 + 14 + 3, -23339);
                class144.field3447++;
            }
            if (arg2 == 2) {
                class95.field2385++;
                class25.field754.method739(false, 83);
                class25.field754.method162(var31 + var31 + 3, -23339);
            }
            class40.field1164 = class27.field799[0];
            class59.field1674 = class83.field2183[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class25.field754.method162(class27.field799[var38] - var32, -23339);
                class25.field754.method123(class83.field2183[var38] - var33, true);
            }
            class25.field754.method116(128, class49.field1435[82] ? 1 : 0);
            class25.field754.method146(class108.field2678 + var33, (byte) 100);
            class25.field754.method164(19877, class95.field2371 + var32);
            return true;
        } else if (~arg2 == arg10) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3250++;
    }

    @OriginalMember(owner = "client!ue", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3256++;
    }

    @OriginalMember(owner = "client!ue", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3238++;
        if (class26.field768 == null) {
            return class4.field104 == null || class4.field104.field187 == this ? super.getDocumentBase() : class4.field104.field187.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
    public final boolean method1104(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field3243++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 > -25) {
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
                this.method1106("invalidhost", 83);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V")
    public final synchronized void method1105(boolean arg0) {
        field3236++;
        Container var2;
        if (class26.field768 == null) {
            var2 = class4.field104.field187;
        } else {
            var2 = class26.field768;
        }
        if (class42.field1216 != null) {
            class42.field1216.removeFocusListener(this);
            var2.remove(class42.field1216);
        }
        class42.field1216 = new class41(this);
        var2.add(class42.field1216);
        class42.field1216.setSize(class94.field2365, class142.field3391);
        class42.field1216.setVisible(arg0);
        if (class26.field768 == null) {
            class42.field1216.setLocation(0, 0);
        } else {
            Insets var3 = class26.field768.getInsets();
            class42.field1216.setLocation(var3.left, var3.top);
        }
        class42.field1216.addFocusListener(this);
        class42.field1216.requestFocus();
        class109.field2727 = true;
        class56.field1572 = false;
        class141.field3360 = class105.method875((byte) -80);
    }

    @OriginalMember(owner = "client!ue", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3265++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1106(String arg0, int arg1) {
        field3259++;
        if (this.field3255) {
            return;
        }
        this.field3255 = true;
        System.out.println("error_game_" + arg0);
        try {
            int var3 = 22 % ((arg1 + 35) / 59);
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "stop", descriptor = "()V")
    public final void stop() {
        field3251++;
        if (class99.field2460 == this && !class62.field1778) {
            client.field619 = class105.method875((byte) -80) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    private final void method1107(int arg0) {
        long var2 = class105.method875((byte) -80);
        long var4 = class35.field1049[class148.field3604];
        class35.field1049[class148.field3604] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class137.field3300 = ((var6 >> 1) + 32000) / var6;
        }
        class148.field3604 = class148.field3604 + 1 & 0x1F;
        if (arg0 < class26.field776++) {
            class26.field776 -= 50;
            class109.field2727 = true;
            class42.field1216.setSize(class94.field2365, class142.field3391);
            class42.field1216.setVisible(true);
            if (class26.field768 == null) {
                class42.field1216.setLocation(0, 0);
            } else {
                Insets var7 = class26.field768.getInsets();
                class42.field1216.setLocation(var7.left, var7.top);
            }
        }
        field3240++;
        this.method245(true);
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(Z)V")
    public abstract void method245(boolean arg0);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
    public final void method1108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3249++;
        try {
            if (class99.field2460 == null) {
                class137.field3302 = arg2;
                class99.field2460 = this;
                class142.field3391 = arg1;
                class94.field2365 = arg0;
                if (class4.field104 == null) {
                    class138.field3313 = class4.field104 = new class9(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
                }
                class4.field104.method66(1, this, true);
                if (arg4 != 0) {
                    field3274 = null;
                }
            } else {
                class23.field663++;
                if (class23.field663 >= 3) {
                    this.method1106("alreadyloaded", -116);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var7) {
            class109.method897(arg4 - 8638, var7, null);
            this.method1106("crash", 55);
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3237++;
    }

    @OriginalMember(owner = "client!ue", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3242++;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    private final synchronized void method1109(int arg0) {
        field3245++;
        if (class62.field1778) {
            return;
        }
        class62.field1778 = true;
        try {
            class42.field1216.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method246(false);
        } catch (Exception var4) {
        }
        if (class26.field768 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class4.field104 != null) {
            try {
                class4.field104.method70((byte) -71);
            } catch (Exception var2) {
            }
        }
        if (arg0 == -1) {
            this.method242(-21);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public static void method1110(byte arg0) {
        field3234 = null;
        field3244 = null;
        field3268 = null;
        field3274 = null;
        field3269 = null;
        field3267 = null;
        field3270 = null;
        if (arg0 > 121) {
            field3275 = null;
            field3247 = null;
            field3262 = null;
            field3273 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public abstract void method242(int arg0);

    @OriginalMember(owner = "client!ue", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3257++;
        if (class26.field768 == null) {
            return class4.field104 == null || class4.field104.field187 == this ? super.getParameter(arg0) : class4.field104.field187.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3260++;
    }

    @OriginalMember(owner = "client!ue", name = "start", descriptor = "()V")
    public final void start() {
        field3263++;
        if (class99.field2460 == this && !class62.field1778) {
            client.field619 = 0L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
    public final void run() {
        field3258++;
        try {
            if (class9.field197 != null) {
                String var1 = class9.field197.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class9.field188;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1106("wrongjava", 26);
                        return;
                    }
                    class121.field2975 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class9.field188 == null || class9.field188.equals("1.4.2"))) {
                    this.method1106("wrongjava", -127);
                    return;
                }
            }
            if (class4.field104.field187 != null) {
                Method var3 = class9.field192;
                if (var3 != null) {
                    try {
                        var3.invoke(class4.field104.field187, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1105(true);
            class101.field2512 = class80.method749(class94.field2365, -325, class142.field3391, class42.field1216);
            this.method240((byte) 69);
            class101.field2501 = class144.method1150(-70);
            class101.field2501.method815(-127);
            while (client.field619 == 0L || class105.method875((byte) -80) < client.field619) {
                class80.field2131 = class101.field2501.method814((byte) 80, class121.field2975, class36.field1057);
                for (int var4 = 0; var4 < class80.field2131; var4++) {
                    this.method1102(false);
                }
                this.method1107(50);
                class38.method457(true, (byte) -65);
            }
        } catch (Exception var7) {
            class109.method897(-8638, var7, null);
            this.method1106("crash", 79);
        }
        this.method1109(-1);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZLjava/lang/String;ILjava/net/InetAddress;III)V")
    public final void method1111(int arg0, boolean arg1, String arg2, int arg3, InetAddress arg4, int arg5, int arg6, int arg7) {
        field3271++;
        try {
            class142.field3391 = arg0;
            class137.field3302 = arg6;
            class99.field2460 = this;
            class94.field2365 = arg5;
            class26.field768 = new Frame();
            class26.field768.setTitle("Jagex");
            class26.field768.setResizable(arg1);
            class26.field768.addWindowListener(this);
            class26.field768.setVisible(true);
            class26.field768.toFront();
            Insets var9 = class26.field768.getInsets();
            class26.field768.setSize(var9.left + arg5 + var9.right, var9.top + arg0 - -var9.bottom);
            class138.field3313 = class4.field104 = new class9(true, null, arg4, arg7, arg2, arg3);
            class4.field104.method66(1, this, true);
        } catch (Exception var11) {
            class109.method897(-8638, var11, null);
        }
    }
}
