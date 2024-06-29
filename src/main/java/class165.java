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
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class165 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Z")
    private boolean field3218 = false;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Ljd;")
    public static class92 field3236 = class202.method1325((byte) 90, "mapfunction");

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "Ljd;")
    public static class92 field3246 = class202.method1325((byte) 90, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "[I")
    public static int[] field3242 = new int[2000];

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Ljd;")
    public static class92 field3227 = class202.method1325((byte) 90, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Loe;")
    public static class139 field3224 = new class139(30);

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "Ljd;")
    public static class92 field3256 = class202.method1325((byte) 90, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "Ltd;")
    public static class183 field3254;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "Z")
    public static boolean field3257;

    @OriginalMember(owner = "client!rd", name = "providesignlink", descriptor = "(Lrh;)V")
    public static final void providesignlink(class169 arg0) {
        class140.field2817 = arg0;
        class42.field931 = arg0;
        field3232++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lh;Ljd;I)I")
    public static final int method1063(class70 arg0, class92 arg1, int arg2) {
        int var3 = -109 / ((-arg2 - 39) / 61);
        field3249++;
        int var4 = arg0.field1472;
        arg0.method467((byte) 48, arg1.field1838);
        arg0.field1472 += class61.field1270.method1181(arg1.field1856, -85, arg1.field1838, arg0.field1493, arg0.field1472, 0);
        return arg0.field1472 - var4;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZB)V")
    private final void method1064(boolean arg0, byte arg1) {
        field3251++;
        synchronized (this) {
            int var4 = -15 % ((arg1 + 46) / 58);
            if (class213.field4131) {
                return;
            }
            class213.field4131 = true;
        }
        if (class140.field2817.field3312 != null) {
            class140.field2817.field3312.destroy();
        }
        if (class153.field3032 != null) {
            try {
                class153.field3032.removeFocusListener(this);
                Container var5;
                if (class187.field3539 == null) {
                    var5 = class140.field2817.field3312;
                } else {
                    var5 = class187.field3539;
                }
                var5.remove(class153.field3032);
            } catch (Exception var11) {
            }
        }
        try {
            this.method190(-117);
        } catch (Exception var10) {
        }
        if (class140.field2817 != null) {
            try {
                class140.field2817.method1121(-20500);
            } catch (Exception var9) {
            }
        }
        this.method195(-32565);
        if (class187.field3539 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    private final void method1065(byte arg0) {
        field3231++;
        int var2 = -40 / ((arg0 + 29) / 37);
        long var3 = class168.method1118(1);
        long var5 = class159.field3166[class76.field1592];
        class159.field3166[class76.field1592] = var3;
        if (var5 != 0L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class200.field3888 = ((var7 >> 1) + 32000) / var7;
        }
        class76.field1592 = class76.field1592 + 1 & 0x1F;
        if (class209.field4012++ > 50) {
            class10.field363 = true;
            class209.field4012 -= 50;
            class153.field3032.setSize(class114.field2296, class52.field1101);
            class153.field3032.setVisible(true);
            if (class187.field3539 == null) {
                class153.field3032.setLocation(0, 0);
            } else {
                Insets var8 = class187.field3539.getInsets();
                class153.field3032.setLocation(var8.left, var8.top);
            }
        }
        this.method199(9033);
    }

    @OriginalMember(owner = "client!rd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3250++;
        if (class81.field1631 == this && !class213.field4131) {
            class81.field1651 = class168.method1118(1);
            class58.method357(-24534, 5000L);
            class42.field931 = null;
            this.method1064(false, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!rd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3238++;
        if (class187.field3539 == null) {
            return class140.field2817 == null || class140.field2817.field3312 == this ? super.getDocumentBase() : class140.field2817.field3312.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3219++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public abstract void method199(int arg0);

    @OriginalMember(owner = "client!rd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3247++;
    }

    @OriginalMember(owner = "client!rd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3225++;
        if (class187.field3539 == null) {
            return class140.field2817 == null || class140.field2817.field3312 == this ? super.getParameter(arg0) : class140.field2817.field3312.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3229++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1066(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3252++;
        if (class67.field1352 == arg1 && class61.field1260 == arg2 && (class164.field3196 == arg4 || !class115.field2339)) {
            return;
        }
        class67.field1352 = arg1;
        class164.field3196 = arg4;
        if (!class115.field2339) {
            class164.field3196 = 0;
        }
        class61.field1260 = arg2;
        class213.method1385((byte) 126, 25);
        class15.method93((byte) -90, true, class143.field2846);
        int var6 = class210.field4077;
        class210.field4077 = (arg2 - 6) * 8;
        int var7 = class115.field2343;
        class115.field2343 = (arg1 - 6) * 8;
        int var8 = class210.field4077 - var6;
        int var9 = class115.field2343 - var7;
        int var10 = class115.field2343;
        int var11 = class210.field4077;
        for (int var12 = 0; var12 < 32768; var12++) {
            class129 var28 = class107.field2187[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field233[var29] -= var9;
                    var28.field198[var29] -= var8;
                }
                var28.field208 -= var8 * 128;
                var28.field246 -= var9 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class91 var26 = class172.field3347[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field233[var27] -= var9;
                    var26.field198[var27] -= var8;
                }
                var26.field208 -= var8 * 128;
                var26.field246 -= var9 * 128;
            }
        }
        class81.field1639 = arg4;
        class15.field423.method29(arg3, false, arg5, 3);
        byte var14 = 0;
        byte var15 = 1;
        byte var16 = 104;
        if (var9 < 0) {
            var15 = -1;
            var14 = 103;
            var16 = -1;
        }
        byte var17 = 104;
        byte var18 = 0;
        byte var19 = 1;
        if (var8 < 0) {
            var17 = -1;
            var19 = -1;
            var18 = 103;
        }
        for (int var20 = var14; var20 != var16; var20 += var15) {
            for (int var22 = var18; var22 != var17; var22 += var19) {
                int var23 = var9 + var20;
                int var24 = var8 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class136.field2725[var25][var20][var22] = class136.field2725[var25][var23][var24];
                    } else {
                        class136.field2725[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class102 var21 = (class102) class211.field4080.method103(57); var21 != null; var21 = (class102) class211.field4080.method100(-49)) {
            var21.field2102 -= var8;
            var21.field2108 -= var9;
            if (var21.field2108 < 0 || var21.field2102 < 0 || var21.field2108 >= 104 || var21.field2102 >= 104) {
                var21.method1370(-107);
            }
        }
        if (class4.field262 != 0) {
            class193.field3765 -= var8;
            class4.field262 -= var9;
        }
        class115.field2342 = -1;
        class39.field883 = arg0;
        class64.field1308 = 0;
        class115.field2323.method109(65);
        class32.field725.method109(65);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public abstract void method196(byte arg0);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIB)V")
    public final void method1067(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3237++;
        try {
            if (class81.field1631 == null) {
                class81.field1631 = this;
                class114.field2296 = arg3;
                class52.field1101 = arg0;
                class102.field2096 = arg2;
                if (class140.field2817 == null) {
                    class42.field931 = class140.field2817 = new class169(false, this, arg1, null, 0);
                }
                class140.field2817.method1125(this, 1, 17258);
                int var6 = 61 / ((-arg4 - 75) / 43);
            } else {
                class48.field1038++;
                if (class48.field1038 >= 3) {
                    this.method1071((byte) -81, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class164.method1059(null, var8, 75);
            this.method1071((byte) -81, "crash");
        }
    }

    @OriginalMember(owner = "client!rd", name = "stop", descriptor = "()V")
    public final void stop() {
        field3226++;
        if (class81.field1631 == this && !class213.field4131) {
            class81.field1651 = class168.method1118(1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
    public static final boolean method1068(int arg0, int arg1) {
        field3243++;
        if (arg0 > -2) {
            field3224 = null;
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "start", descriptor = "()V")
    public final void start() {
        field3216++;
        if (class81.field1631 == this && !class213.field4131) {
            class81.field1651 = 0L;
        }
    }

    @OriginalMember(owner = "client!rd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3245++;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public final synchronized void method1069(byte arg0) {
        field3235++;
        Container var2;
        if (class187.field3539 == null) {
            var2 = class140.field2817.field3312;
        } else {
            var2 = class187.field3539;
        }
        if (arg0 != -45) {
            return;
        }
        if (class153.field3032 != null) {
            class153.field3032.removeFocusListener(this);
            var2.remove(class153.field3032);
        }
        class153.field3032 = new class119(this);
        var2.add(class153.field3032);
        class153.field3032.setSize(class114.field2296, class52.field1101);
        class153.field3032.setVisible(true);
        if (class187.field3539 == null) {
            class153.field3032.setLocation(0, 0);
        } else {
            Insets var3 = class187.field3539.getInsets();
            class153.field3032.setLocation(var3.left, var3.top);
        }
        class153.field3032.addFocusListener(this);
        class153.field3032.requestFocus();
        class10.field363 = true;
        class70.field1481 = false;
        class9.field335 = class168.method1118(1);
    }

    @OriginalMember(owner = "client!rd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3230++;
        this.destroy();
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)Z")
    public final boolean method1070(int arg0) {
        field3217++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 0) {
                this.init();
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
                this.method1071((byte) -109, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1071(byte arg0, String arg1) {
        field3215++;
        if (this.field3218) {
            return;
        }
        this.field3218 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 > -46) {
            field3254 = null;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!rd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3212++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public abstract void method191(boolean arg0);

    @OriginalMember(owner = "client!rd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class140.field2804 = true;
        field3233++;
        class10.field363 = true;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public abstract void method195(int arg0);

    @OriginalMember(owner = "client!rd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3213++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3221++;
        class140.field2804 = false;
    }

    @OriginalMember(owner = "client!rd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3222++;
        if (class187.field3539 == null) {
            return class140.field2817 == null || class140.field2817.field3312 == this ? super.getCodeBase() : class140.field2817.field3312.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3220++;
        if (class81.field1631 != this || class213.field4131) {
            return;
        }
        class10.field363 = true;
        if (class169.field3309 != null && class169.field3309.startsWith("1.5") && class168.method1118(1) - class9.field335 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class114.field2296 <= var2.width && class52.field1101 <= var2.height) {
                class70.field1481 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static final void method1072(int arg0) {
        if (arg0 >= -78) {
            method1063(null, null, 49);
        }
        client.field672.method923(-103);
        field3234++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZ)V")
    public static final void method1073(int arg0, int arg1, boolean arg2) {
        field3214++;
        class18 var3 = class136.field2725[class81.field1639][arg1][arg0];
        if (arg2) {
            method1066(false, -87, -46, -26, -124, -45);
        }
        if (var3 == null) {
            class40.method259(class81.field1639, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class87 var5 = null;
        for (class87 var6 = (class87) var3.method103(57); var6 != null; var6 = (class87) var3.method100(-49)) {
            class107 var12 = class92.method626((byte) 59, var6.field1725);
            int var13 = var12.field2189;
            if (var12.field2185 == 1) {
                var13 = (var6.field1719 + 1) * var13;
            }
            if (var4 < var13) {
                var4 = var13;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class40.method259(class81.field1639, arg1, arg0);
            return;
        }
        var3.method102((byte) 103, var5);
        class87 var7 = (class87) var3.method103(57);
        class87 var8 = null;
        class87 var9 = null;
        while (var7 != null) {
            if (var5.field1725 != var7.field1725) {
                if (var9 == null) {
                    var9 = var7;
                }
                if (var7.field1725 != var9.field1725 && var8 == null) {
                    var8 = var7;
                }
            }
            var7 = (class87) var3.method100(-49);
        }
        long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class94.method659(class81.field1639, arg1, arg0, class118.method804(arg1 * 128 + 64, class81.field1639, arg0 * 128 + 64, 0), var5, var10, var9, var8);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1074(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class81.field1631 = this;
            class114.field2296 = arg1;
            class52.field1101 = arg4;
            class102.field2096 = arg5;
            class187.field3539 = new Frame();
            class187.field3539.setTitle("Jagex");
            class187.field3539.setResizable(false);
            class187.field3539.addWindowListener(this);
            class187.field3539.setVisible(true);
            class187.field3539.toFront();
            Insets var8 = class187.field3539.getInsets();
            class187.field3539.setSize(var8.right + var8.left + arg1, var8.top + arg4 + var8.bottom);
            class42.field931 = class140.field2817 = new class169(true, null, arg6, arg0, arg3);
            class140.field2817.method1125(this, arg2, arg2 ^ 0x436B);
        } catch (Exception var10) {
            class164.method1059(null, var10, 100);
        }
        field3240++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1075(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        field3248++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 1 + 7 - arg3 - arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg6 - arg2;
        } else {
            int var9 = 81 / ((arg5 - 49) / 46);
            return arg1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3223++;
        if (class187.field3539 == null) {
            return class140.field2817 == null || class140.field2817.field3312 == this ? super.getAppletContext() : class140.field2817.field3312.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public abstract void method190(int arg0);

    @OriginalMember(owner = "client!rd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3244++;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
    private final void method1076(boolean arg0) {
        long var2 = class168.method1118(1);
        long var4 = class197.field3851[class48.field1028];
        class197.field3851[class48.field1028] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class48.field1028 = class48.field1028 + 1 & 0x1F;
        if (!arg0) {
            method1066(true, -27, -56, 30, -40, -120);
        }
        synchronized (this) {
            class207.field3976 = class140.field2804;
        }
        this.method191(false);
        field3228++;
    }

    @OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
    public final void run() {
        field3241++;
        try {
            if (class169.field3301 != null) {
                String var1 = class169.field3301.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class169.field3309;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1071((byte) -106, "wrongjava");
                        return;
                    }
                    class147.field2922 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class169.field3309 == null || class169.field3309.equals("1.4.2"))) {
                    this.method1071((byte) -73, "wrongjava");
                    return;
                }
            }
            if (class140.field2817.field3312 != null) {
                Method var3 = class169.field3303;
                if (var3 != null) {
                    try {
                        var3.invoke(class140.field2817.field3312, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1069((byte) -45);
            class77.field1605 = class206.method1345(class114.field2296, class52.field1101, class153.field3032, (byte) -121);
            this.method196((byte) 16);
            class143.field2836 = class93.method657(true);
            while (class81.field1651 == 0L || class81.field1651 > class168.method1118(1)) {
                class159.field3151 = class143.field2836.method328(true, class147.field2922, class114.field2297);
                for (int var4 = 0; var4 < class159.field3151; var4++) {
                    this.method1076(true);
                }
                this.method1065((byte) -81);
                class137.method917(-98, class153.field3032, class140.field2817);
            }
        } catch (Exception var7) {
            class164.method1059(null, var7, 95);
            this.method1071((byte) -74, "crash");
        }
        this.method1064(true, (byte) 91);
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public static void method1077(int arg0) {
        field3242 = null;
        if (arg0 != 22547) {
            method1075(95, 118, -121, 63, 118, (byte) 102, 58);
        }
        field3254 = null;
        field3227 = null;
        field3256 = null;
        field3246 = null;
        field3224 = null;
        field3236 = null;
    }
}
