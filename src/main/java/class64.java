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

@OriginalClass("client!cd")
public abstract class class64 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Z")
    private boolean field1208 = false;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lmh;")
    private static class128 field1230 = class22.method156(126, "Loaded textures");

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Lmh;")
    private static class128 field1227 = class22.method156(127, "Please remove ");

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
    public static boolean field1205 = false;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "Lmh;")
    public static class128 field1243 = field1227;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lmh;")
    public static class128 field1219 = field1230;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Lmh;")
    public static class128 field1240 = field1227;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Ldj;")
    public static class314 field1222;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
    public static int[] field1214;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 8)
    private final void method422(int arg0) {
        long var2 = class71.method470(true);
        field1232++;
        long var4 = class241.field4116[class137.field2349];
        class241.field4116[class137.field2349] = var2;
        class137.field2349 = class137.field2349 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class307.field5219 = ((var6 >> 1) + 32000) / var6;
        }
        if (class147.field2518++ > 50) {
            class284.field4886 = true;
            class147.field2518 -= 50;
            class203.field3589.setSize(class199.field3465, class16.field420);
            class203.field3589.setVisible(true);
            if (class200.field3483 != null && class114.field1924 == null) {
                Insets var7 = class200.field3483.getInsets();
                class203.field3589.setLocation(class309.field5249 + var7.left, class170.field2968 + var7.top);
            } else {
                class203.field3589.setLocation(class309.field5249, class170.field2968);
            }
        }
        if (arg0 != 64) {
            field1227 = (class128) null;
        }
        this.method431((byte) -30);
    }

    @OriginalMember(owner = "client!cd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 52)
    public final void windowDeiconified(WindowEvent arg0) {
        field1228++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Z", line = 59)
    public final boolean method425(int arg0) {
        field1213++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 >= -77) {
                field1205 = false;
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
                this.method432("invalidhost", -123);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 97)
    public final String getParameter(String arg0) {
        field1207++;
        if (class200.field3483 == null) {
            return class288.field4925 == null || class288.field4925.field4677 == this ? super.getParameter(arg0) : class288.field4925.field4677.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 114)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1231++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V", line = 129)
    public static final void method426(byte arg0, int arg1) {
        int var2 = -59 % ((arg1 - 61) / 49);
        if (class31.field684 == null) {
            class31.field684 = new byte[4][104][104];
        }
        field1235++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    class31.field684[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIB)I", line = 164)
    public static final int method427(int arg0, int arg1, int arg2, byte arg3) {
        field1211++;
        if (class250.field4334 == null) {
            return 0;
        }
        if (arg3 < 91) {
            providesignlink((class270) null);
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class301.field5117[1][var5][var4] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg0 & 0x7F;
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var7) * class250.field4334[var6][var5][var4] + class250.field4334[var6][var5 + 1][var4] * var7 >> 7;
        int var10 = (128 - var7) * class250.field4334[var6][var5][var4 + 1] + (class250.field4334[var6][var5 + 1][var4 + 1] * var7) >> 7;
        return (128 - var8) * var9 + (var8 * var10) >> 7;
    }

    @OriginalMember(owner = "client!cd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 201)
    public final void focusGained(FocusEvent arg0) {
        field1216++;
        class252.field4352 = true;
        class284.field4886 = true;
    }

    @OriginalMember(owner = "client!cd", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 211)
    public final URL getCodeBase() {
        field1225++;
        if (class200.field3483 == null) {
            return class288.field4925 == null || class288.field4925.field4677 == this ? super.getCodeBase() : class288.field4925.field4677.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLac;I[[I[[FIZ[[FIIBB[[FIII)V", line = 235)
    public static final void method428(byte arg0, class154 arg1, int arg2, int[][] arg3, float[][] arg4, int arg5, boolean arg6, float[][] arg7, int arg8, int arg9, byte arg10, byte arg11, float[][] arg12, int arg13, int arg14, int arg15) {
        int var16 = (arg9 << 8) + 255;
        int var17 = (arg13 << 8) + 255;
        field1239++;
        int var18 = (arg2 << 8) + 255;
        int var19 = (arg14 << 8) + 255;
        if (arg11 > -19) {
            field1244 = 2;
        }
        int[] var20 = class313.field5285[arg0];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class42.method285((byte) 107, false, arg1, var17, var16, var19, arg4, var20[var23 - (-var23 - 1)], (int[][]) null, arg3, arg12, var20[var23 + var23], var18, 0.0F, arg7, arg10, arg5, arg8);
        }
        if (arg6) {
            if (arg0 == 1) {
                int var42 = class42.method285((byte) 123, true, arg1, var17, var16, var19, arg4, 128, (int[][]) null, arg3, arg12, 64, var18, 0.0F, arg7, arg10, arg5, arg8);
                int var43 = class42.method285((byte) 113, true, arg1, var17, var16, var19, arg4, 64, (int[][]) null, arg3, arg12, 128, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21 = new int[] { var43, var42, var22[2], var42, var22[0], var22[2] };
            } else if (arg0 == 2) {
                var21 = new int[6];
                int var40 = class42.method285((byte) 113, true, arg1, var17, var16, var19, arg4, 128, (int[][]) null, arg3, arg12, 128, var18, 0.0F, arg7, arg10, arg5, arg8);
                int var41 = class42.method285((byte) 105, true, arg1, var17, var16, var19, arg4, 0, (int[][]) null, arg3, arg12, 64, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[2] = var40;
                var21[0] = var22[0];
                var21[5] = var22[0];
                var21[3] = var40;
                var21[1] = var41;
                var21[4] = var22[1];
            } else if (arg0 == 3) {
                var21 = new int[6];
                int var38 = class42.method285((byte) 109, true, arg1, var17, var16, var19, arg4, 128, (int[][]) null, arg3, arg12, 0, var18, 0.0F, arg7, arg10, arg5, arg8);
                int var39 = class42.method285((byte) 106, true, arg1, var17, var16, var19, arg4, 0, (int[][]) null, arg3, arg12, 64, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[0] = var22[2];
                var21[2] = var38;
                var21[5] = var22[2];
                var21[1] = var22[1];
                var21[3] = var38;
                var21[4] = var39;
            } else if (arg0 == 4) {
                var21 = new int[3];
                int var37 = class42.method285((byte) 117, true, arg1, var17, var16, var19, arg4, 128, (int[][]) null, arg3, arg12, 0, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[0] = var22[3];
                var21[1] = var37;
                var21[2] = var22[0];
            } else if (arg0 == 5) {
                var21 = new int[3];
                int var25 = class42.method285((byte) 109, true, arg1, var17, var16, var19, arg4, 128, (int[][]) null, arg3, arg12, 128, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[0] = var22[2];
                var21[2] = var22[3];
                var21[1] = var25;
            } else if (arg0 == 6) {
                var21 = new int[6];
                int var26 = class42.method285((byte) 109, true, arg1, var17, var16, var19, arg4, 0, (int[][]) null, arg3, arg12, 128, var18, 0.0F, arg7, arg10, arg5, arg8);
                int var27 = class42.method285((byte) 118, true, arg1, var17, var16, var19, arg4, 128, (int[][]) null, arg3, arg12, 128, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[1] = var26;
                var21[2] = var27;
                var21[0] = var22[3];
                var21[4] = var22[0];
                var21[3] = var27;
                var21[5] = var22[3];
            } else if (arg0 == 7) {
                int var28 = class42.method285((byte) 124, true, arg1, var17, var16, var19, arg4, 128, (int[][]) null, arg3, arg12, 0, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21 = new int[6];
                int var29 = class42.method285((byte) 122, true, arg1, var17, var16, var19, arg4, 0, (int[][]) null, arg3, arg12, 128, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[3] = var28;
                var21[2] = var28;
                var21[4] = var22[2];
                var21[0] = var22[1];
                var21[1] = var29;
                var21[5] = var22[1];
            } else if (arg0 == 8) {
                int var30 = class42.method285((byte) 106, true, arg1, var17, var16, var19, arg4, 0, (int[][]) null, arg3, arg12, 0, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21 = new int[] { var22[3], var30, var22[4] };
            } else if (arg0 == 9) {
                var21 = new int[15];
                int var34 = class42.method285((byte) 104, true, arg1, var17, var16, var19, arg4, 64, (int[][]) null, arg3, arg12, 128, var18, 0.0F, arg7, arg10, arg5, arg8);
                int var35 = class42.method285((byte) 118, true, arg1, var17, var16, var19, arg4, 32, (int[][]) null, arg3, arg12, 96, var18, 0.0F, arg7, arg10, arg5, arg8);
                int var36 = class42.method285((byte) 116, true, arg1, var17, var16, var19, arg4, 0, (int[][]) null, arg3, arg12, 64, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[2] = var22[4];
                var21[0] = var35;
                var21[4] = var22[4];
                var21[3] = var35;
                var21[9] = var35;
                var21[8] = var22[2];
                var21[6] = var35;
                var21[14] = var36;
                var21[1] = var34;
                var21[13] = var22[1];
                var21[10] = var22[2];
                var21[11] = var22[1];
                var21[12] = var35;
                var21[5] = var22[3];
                var21[7] = var22[3];
            } else if (arg0 == 10) {
                var21 = new int[9];
                int var31 = class42.method285((byte) 107, true, arg1, var17, var16, var19, arg4, 128, (int[][]) null, arg3, arg12, 0, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[4] = var31;
                var21[5] = var22[4];
                var21[6] = var22[4];
                var21[0] = var22[2];
                var21[7] = var31;
                var21[8] = var22[0];
                var21[1] = var31;
                var21[2] = var22[3];
                var21[3] = var22[3];
            } else if (arg0 == 11) {
                var21 = new int[12];
                int var32 = class42.method285((byte) 112, true, arg1, var17, var16, var19, arg4, 64, (int[][]) null, arg3, arg12, 0, var18, 0.0F, arg7, arg10, arg5, arg8);
                int var33 = class42.method285((byte) 117, true, arg1, var17, var16, var19, arg4, 64, (int[][]) null, arg3, arg12, 128, var18, 0.0F, arg7, arg10, arg5, arg8);
                var21[8] = var32;
                var21[5] = var32;
                var21[0] = var22[3];
                var21[2] = var22[0];
                var21[7] = var33;
                var21[11] = var33;
                var21[3] = var22[3];
                var21[4] = var22[2];
                var21[6] = var22[2];
                var21[9] = var22[2];
                var21[1] = var32;
                var21[10] = var22[1];
            }
        }
        arg1.method1025(arg15, arg8, arg5, var22, var21, false);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 510)
    public final synchronized void method429(int arg0) {
        if (class203.field3589 != null) {
            class203.field3589.removeFocusListener(this);
            class203.field3589.getParent().remove(class203.field3589);
        }
        field1236++;
        Container var2;
        if (class114.field1924 != null) {
            var2 = class114.field1924;
        } else if (class200.field3483 == null) {
            var2 = class288.field4925.field4677;
        } else {
            var2 = class200.field3483;
        }
        var2.setLayout((LayoutManager) null);
        class203.field3589 = new class121(this);
        var2.add(class203.field3589);
        class203.field3589.setSize(class199.field3465, class16.field420);
        class203.field3589.setVisible(true);
        if (class200.field3483 == var2) {
            Insets var3 = class200.field3483.getInsets();
            class203.field3589.setLocation(class309.field5249 + var3.left, class170.field2968 + var3.top);
        } else {
            class203.field3589.setLocation(class309.field5249, class170.field2968);
        }
        class203.field3589.addFocusListener(this);
        class203.field3589.requestFocus();
        class157.field2695 = true;
        if (arg0 == -6537) {
            class252.field4352 = true;
            class284.field4886 = true;
            class167.field2872 = false;
            class303.field5141 = class71.method470(true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 560)
    public final void focusLost(FocusEvent arg0) {
        class252.field4352 = false;
        field1209++;
    }

    @OriginalMember(owner = "client!cd", name = "start", descriptor = "()V", line = 569)
    public final void start() {
        field1221++;
        if (class106.field1810 == this && !class289.field4940) {
            class66.field1266 = 0L;
        }
    }

    @OriginalMember(owner = "client!cd", name = "stop", descriptor = "()V", line = 587)
    public final void stop() {
        field1210++;
        if (class106.field1810 == this && !class289.field4940) {
            class66.field1266 = class71.method470(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)V", line = 598)
    private final void method430(int arg0, boolean arg1) {
        field1234++;
        synchronized (this) {
            if (arg0 != 0) {
                this.windowDeactivated((WindowEvent) null);
            }
            if (class289.field4940) {
                return;
            }
            class289.field4940 = true;
        }
        if (class288.field4925.field4677 != null) {
            class288.field4925.field4677.destroy();
        }
        try {
            this.method423((byte) 101);
        } catch (Exception var12) {
        }
        if (class203.field3589 != null) {
            try {
                class203.field3589.removeFocusListener(this);
                class203.field3589.getParent().remove(class203.field3589);
            } catch (Exception var11) {
            }
        }
        if (class288.field4925 != null) {
            try {
                class288.field4925.method1896(arg0 ^ 0x7);
            } catch (Exception var10) {
            }
        }
        this.method438((byte) -11);
        if (class200.field3483 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 663)
    public final void method432(String arg0, int arg1) {
        field1220++;
        if (this.field1208) {
            return;
        }
        this.field1208 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
        if (arg1 >= -75) {
            this.windowIconified((WindowEvent) null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 685)
    public final void windowActivated(WindowEvent arg0) {
        field1217++;
    }

    @OriginalMember(owner = "client!cd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 692)
    public final void windowClosing(WindowEvent arg0) {
        field1242++;
        this.destroy();
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 700)
    public static void method433(int arg0) {
        field1214 = null;
        field1230 = null;
        field1240 = null;
        field1243 = null;
        if (arg0 > -47) {
            field1230 = (class128) null;
        }
        field1219 = null;
        field1227 = null;
        field1222 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V", line = 718)
    public static final void method434(int arg0, byte arg1) {
        if (arg1 > -38) {
            field1230 = (class128) null;
        }
        field1233++;
        class275.field4769--;
        if (class275.field4769 == arg0) {
            return;
        }
        class224.method1542(class283.field4868, arg0 + 1, class283.field4868, arg0, class275.field4769 - arg0);
        class224.method1542(class210.field3725, arg0 + 1, class210.field3725, arg0, class275.field4769 - arg0);
        class224.method1544(class117.field1979, arg0 + 1, class117.field1979, arg0, class275.field4769 - arg0);
        class224.method1539(class1.field22, arg0 + 1, class1.field22, arg0, class275.field4769 - arg0);
        class224.method1540(class267.field4635, arg0 + 1, class267.field4635, arg0, class275.field4769 - arg0);
        class224.method1540(class309.field5251, arg0 + 1, class309.field5251, arg0, class275.field4769 - arg0);
    }

    @OriginalMember(owner = "client!cd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 740)
    public final void windowOpened(WindowEvent arg0) {
        field1215++;
    }

    @OriginalMember(owner = "client!cd", name = "destroy", descriptor = "()V", line = 747)
    public final void destroy() {
        field1238++;
        if (class106.field1810 == this && !class289.field4940) {
            class66.field1266 = class71.method470(true);
            class177.method1213(0, 5000L);
            class10.field352 = null;
            this.method430(0, false);
        }
    }

    @OriginalMember(owner = "client!cd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 762)
    public final void windowDeactivated(WindowEvent arg0) {
        field1224++;
    }

    @OriginalMember(owner = "client!cd", name = "providesignlink", descriptor = "(Lcb;)V", line = 771)
    public static final void providesignlink(class270 arg0) {
        class288.field4925 = arg0;
        class10.field352 = arg0;
        field1212++;
    }

    @OriginalMember(owner = "client!cd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 779)
    public final void windowClosed(WindowEvent arg0) {
        field1226++;
    }

    @OriginalMember(owner = "client!cd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 792)
    public final AppletContext getAppletContext() {
        field1206++;
        if (class200.field3483 == null) {
            return class288.field4925 == null || class288.field4925.field4677 == this ? super.getAppletContext() : class288.field4925.field4677.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 809)
    public final synchronized void paint(Graphics arg0) {
        field1241++;
        if (class106.field1810 != this || class289.field4940) {
            return;
        }
        class284.field4886 = true;
        if (class315.field5346 && !class247.field4247 && (class71.method470(true) - class303.field5141) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class196.field3431 && var2.height >= class57.field1090) {
                class167.field2872 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 842)
    public final URL getDocumentBase() {
        field1218++;
        if (class200.field3483 == null) {
            return class288.field4925 == null || class288.field4925.field4677 == this ? super.getDocumentBase() : class288.field4925.field4677.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 866)
    public final void windowIconified(WindowEvent arg0) {
        field1229++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILjava/lang/String;IIBI)V", line = 878)
    public final void method436(int arg0, int arg1, String arg2, int arg3, int arg4, byte arg5, int arg6) {
        try {
            class106.field1810 = this;
            class152.field2620 = arg1;
            class309.field5249 = 0;
            class170.field2968 = 0;
            class16.field420 = arg4;
            class57.field1090 = arg4;
            class199.field3465 = arg6;
            class196.field3431 = arg6;
            class200.field3483 = new Frame();
            class200.field3483.setTitle("Jagex");
            class200.field3483.setResizable(true);
            class200.field3483.addWindowListener(this);
            class200.field3483.setVisible(true);
            class200.field3483.toFront();
            Insets var8 = class200.field3483.getInsets();
            class200.field3483.setSize(var8.right + var8.left + class196.field3431, var8.top + var8.bottom + class57.field1090);
            class10.field352 = class288.field4925 = new class270((Applet) null, arg3, arg2, arg0);
            class23 var9 = class288.field4925.method1904((byte) -125, 1, this);
            while (var9.field560 == 0) {
                class177.method1213(0, 10L);
            }
            class28.field592 = (Thread) var9.field562;
        } catch (Exception var11) {
            class79.method506((byte) -51, (String) null, var11);
        }
        if (arg5 >= 19) {
            field1223++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V", line = 917)
    public final void run() {
        field1204++;
        try {
            if (class270.field4685 != null) {
                String var1 = class270.field4685.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class270.field4671;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method432("wrongjava", -93);
                        return;
                    }
                    class297.field5072 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class270.field4671 == null || class270.field4671.equals("1.4.2"))) {
                    this.method432("wrongjava", -77);
                    return;
                }
            }
            if (class270.field4671 != null && class270.field4671.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class270.field4671.length()) {
                    char var5 = class270.field4671.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = -(-var5 - var4 * 10) - 48;
                }
                if (var4 >= 5) {
                    class315.field5346 = true;
                }
            }
            if (class288.field4925.field4677 != null) {
                Method var6 = class270.field4689;
                if (var6 != null) {
                    try {
                        var6.invoke(class288.field4925.field4677, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method429(-6537);
            class4.field76 = class199.method1379(class16.field420, -98, class199.field3465, class203.field3589);
            this.method424((byte) -114);
            class110.field1861 = class22.method152((byte) 49);
            while (class66.field1266 == 0L || class71.method470(true) < class66.field1266) {
                class259.field4460 = class110.field1861.method338(class3.field53, -3, class297.field5072);
                for (int var8 = 0; var8 < class259.field4460; var8++) {
                    this.method437((byte) 125);
                }
                this.method422(64);
                class295.method2016(0, class288.field4925, class203.field3589);
            }
        } catch (Exception var11) {
            class79.method506((byte) -51, (String) null, var11);
            this.method432("crash", -81);
        }
        this.method430(0, true);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V", line = 1024)
    private final void method437(byte arg0) {
        field1245++;
        long var2 = class71.method470(true);
        long var4 = class139.field2372[class299.field5098];
        class139.field2372[class299.field5098] = var2;
        class299.field5098 = class299.field5098 + 1 & 0x1F;
        if (var4 != 0L && var2 <= var4) {
        }
        synchronized (this) {
            class157.field2695 = class252.field4352;
        }
        this.method435(10);
        int var8 = 18 % ((arg0 + 44) / 50);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIBI)V", line = 1056)
    public final void method439(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1237++;
        try {
            if (class106.field1810 != null) {
                class9.field196++;
                if (class9.field196 >= 3) {
                    this.method432("alreadyloaded", -105);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class106.field1810 = this;
            class170.field2968 = 0;
            class16.field420 = arg2;
            class57.field1090 = arg2;
            class309.field5249 = 0;
            class199.field3465 = arg0;
            class196.field3431 = arg0;
            class152.field2620 = arg1;
            int var6 = -102 / ((37 - arg3) / 52);
            String var7 = this.getParameter("openwinjs");
            if (var7 != null && var7.equals("1")) {
                class3.field71 = true;
            } else {
                class3.field71 = false;
            }
            if (class288.field4925 == null) {
                class10.field352 = class288.field4925 = new class270(this, arg4, (String) null, 0);
            }
            class23 var8 = class288.field4925.method1904((byte) -112, 1, this);
            while (var8.field560 == 0) {
                class177.method1213(0, 10L);
            }
            class28.field592 = (Thread) var8.field562;
        } catch (Exception var10) {
            class79.method506((byte) -51, (String) null, var10);
            this.method432("crash", -76);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public abstract void method423(byte arg0);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public abstract void method424(byte arg0);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public abstract void method431(byte arg0);

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public abstract void method435(int arg0);

    @OriginalMember(owner = "client!cd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)V")
    public abstract void method438(byte arg0);
}
