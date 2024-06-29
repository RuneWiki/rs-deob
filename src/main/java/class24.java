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

@OriginalClass("client!o")
public abstract class class24 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
    private boolean field249 = false;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
    private boolean field254 = false;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "Lgn;")
    public static class493 field272 = new class493();

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Lpn;")
    public static class523 field287 = new class523("", 14);

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "F")
    public static float field290;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Z")
    public static boolean field294;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Z")
    public static boolean field295;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "[Lat;")
    public static class256[] field288;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Z")
    public final boolean method192(int arg0) {
        int var2 = 9 / ((arg0 + 64) / 60);
        field260++;
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.equals("stellardawn.com") || var3.endsWith(".stellardawn.com")) {
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
                this.method194(127, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    private final void method193(int arg0) {
        field268++;
        if (arg0 != 8101) {
            field272 = null;
        }
        long var2 = class437.method2644(arg0 ^ 0xFFFFE004);
        long var4 = class520.field7645[class516.field7600];
        class520.field7645[class516.field7600] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class516.field7600 = class516.field7600 + 1 & 0x1F;
        synchronized (this) {
            class162.field2279 = class56.field635;
        }
        this.method195((byte) 57);
    }

    @OriginalMember(owner = "client!o", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class56.field635 = true;
        field251++;
        class487.field7145 = true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method194(int arg0, String arg1) {
        field275++;
        if (this.field249) {
            return;
        }
        this.field249 = true;
        if (arg0 <= 125) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            class505.method3017(class498.field7404.field6180, "loggedout", 84);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public abstract void method195(byte arg0);

    @OriginalMember(owner = "client!o", name = "start", descriptor = "()V")
    public final void start() {
        field265++;
        if (class433.field6361 == this && !class216.field3133) {
            class22.field243 = 0L;
        }
    }

    @OriginalMember(owner = "client!o", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field276++;
        if (class245.field3611 == null) {
            return class498.field7404 == null || class498.field7404.field6180 == this ? super.getAppletContext() : class498.field7404.field6180.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public static final void method196() {
        for (int var0 = 0; var0 < class435.field6376; var0++) {
            class431 var1 = class481.field7063[var0];
            class484.method2914(var1);
            class481.field7063[var0] = null;
        }
        class435.field6376 = 0;
    }

    @OriginalMember(owner = "client!o", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public final synchronized void method197(byte arg0) {
        if (class148.field2081 != null) {
            class148.field2081.removeFocusListener(this);
            class148.field2081.getParent().remove(class148.field2081);
        }
        field281++;
        Container var2;
        if (class149.field2112 != null) {
            var2 = class149.field2112;
        } else if (class245.field3611 == null) {
            var2 = class498.field7404.field6180;
        } else {
            var2 = class245.field3611;
        }
        var2.setLayout(null);
        class148.field2081 = new class273(this);
        var2.add(class148.field2081);
        class148.field2081.setSize(class94.field1278, class410.field6100);
        class148.field2081.setVisible(true);
        if (class245.field3611 == var2) {
            Insets var3 = class245.field3611.getInsets();
            class148.field2081.setLocation(class385.field5663 + var3.left, class513.field7566 + var3.top);
        } else {
            class148.field2081.setLocation(class385.field5663, class513.field7566);
        }
        class148.field2081.addFocusListener(this);
        class148.field2081.requestFocus();
        class56.field635 = true;
        if (arg0 >= -32) {
            field288 = null;
        }
        class162.field2279 = true;
        class487.field7145 = true;
        class157.field2233 = false;
        class439.field6525 = class437.method2644(-65);
    }

    @OriginalMember(owner = "client!o", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field282++;
        if (class433.field6361 != this || class216.field3133) {
            return;
        }
        class487.field7145 = true;
        if (class525.field7709 && class437.method2644(-105) - class439.field6525 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class248.field3674 <= var2.width && class333.field4630 <= var2.height) {
                class157.field2233 = true;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field262++;
        if (class245.field3611 == null) {
            return class498.field7404 == null || class498.field7404.field6180 == this ? super.getParameter(arg0) : class498.field7404.field6180.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "stop", descriptor = "()V")
    public final void stop() {
        field284++;
        if (class433.field6361 == this && !class216.field3133) {
            class22.field243 = class437.method2644(-60) + 4000L;
        }
    }

    @OriginalMember(owner = "client!o", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field277++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!o", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field264++;
    }

    @OriginalMember(owner = "client!o", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field253++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IFIII[FIIFII)V")
    public static final void method198(int arg0, float arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        int var11 = arg4 - arg2;
        field280++;
        int var12 = arg6 - arg7;
        int var13 = arg0 - arg10;
        float var14 = arg5[2] * (float) var13 + arg5[1] * (float) var11 + arg5[0] * (float) var12;
        float var15 = arg5[5] * (float) var13 + arg5[3] * (float) var12 + arg5[4] * (float) var11;
        float var16 = arg5[arg3] * (float) var13 + arg5[7] * (float) var11 + arg5[6] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg8 != 1.0F) {
            var17 = arg8 * var17;
        }
        float var18 = var15 + arg1 + 0.5F;
        if (arg9 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg9 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg9 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class444.field6576 = var18;
        class113.field1584 = var17;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZZ)V")
    private final void method199(boolean arg0, boolean arg1) {
        field273++;
        synchronized (this) {
            if (class216.field3133) {
                return;
            }
            class216.field3133 = true;
        }
        if (class498.field7404.field6180 != null) {
            class498.field7404.field6180.destroy();
        }
        try {
            this.method209(109);
        } catch (Exception var11) {
        }
        if (this.field254) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field254 = false;
        }
        class449 var4 = class498.field7404.method2569(class433.field6361.getClass(), arg0);
        while (var4.field6617 == 0) {
            class213.method1462(100L, -5184);
        }
        if (arg0) {
            field290 = -0.70711446F;
        }
        if (class148.field2081 != null) {
            try {
                class148.field2081.removeFocusListener(this);
                class148.field2081.getParent().remove(class148.field2081);
            } catch (Exception var9) {
            }
        }
        if (class498.field7404 != null) {
            try {
                class498.field7404.method2555((byte) -117);
            } catch (Exception var8) {
            }
        }
        this.method203(true);
        if (class245.field3611 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public final void method200(byte arg0) {
        int var2 = -90 % ((arg0 + 26) / 46);
        field258++;
        if (this.field254) {
            return;
        }
        try {
            class449 var3 = class498.field7404.method2559((byte) 72, class433.field6361.getClass());
            while (var3.field6617 == 0) {
                class213.method1462(100L, -5184);
            }
            if (var3.field6613 != null) {
                throw (Throwable) var3.field6613;
            }
            jagmisc.init();
            this.field254 = true;
            class120.field1679 = class374.method2303(-109);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!o", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field274++;
        if (class433.field6361 == this && !class216.field3133) {
            class22.field243 = class437.method2644(-60);
            class213.method1462(5000L, -5184);
            class265.field3909 = null;
            this.method199(false, false);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBIZI)V")
    public static final void method201(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        field257++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class331.field4616 - class464.field6827) * var6 / 100 + class464.field6827;
        if (arg2 != -21) {
            return;
        }
        if (class440.field6539 > var7) {
            var7 = class440.field6539;
        } else if (var7 > class465.field6838) {
            var7 = class465.field6838;
        }
        int var8 = arg5 * var7 * 512 / (arg1 * 334);
        if (class92.field1266 > var8) {
            short var12 = class92.field1266;
            var7 = var12 * 334 * arg1 / (arg5 * 512);
            if (var7 > class465.field6838) {
                var7 = class465.field6838;
                int var13 = arg5 * var7 * 512 / (var12 * 334);
                int var14 = (arg1 - var13) / 2;
                if (arg4) {
                    class225.field3300.method339();
                    class225.field3300.method367(arg3, var14, arg0, (byte) 58, -16777216, arg5);
                    class225.field3300.method367(arg3 + arg1 - var14, var14, arg0, (byte) 58, -16777216, arg5);
                }
                arg3 += var14;
                arg1 -= var14 * 2;
            }
        } else if (class180.field2540 < var8) {
            short var9 = class180.field2540;
            var7 = arg1 * var9 * 334 / (arg5 * 512);
            if (var7 < class440.field6539) {
                var7 = class440.field6539;
                int var10 = var9 * 334 * arg1 / (var7 * 512);
                int var11 = (arg5 - var10) / 2;
                if (arg4) {
                    class225.field3300.method339();
                    class225.field3300.method367(arg3, arg1, arg0, (byte) 58, -16777216, var11);
                    class225.field3300.method367(arg3, arg1, arg0 + arg5 - var11, (byte) 58, -16777216, var11);
                }
                arg5 -= var11 * 2;
                arg0 += var11;
            }
        }
        class314.field4466 = arg5 * var7 / 334;
        class107.field1484 = arg0;
        class4.field70 = (short) arg5;
        class515.field7581 = (short) arg1;
        class107.field1521 = arg3;
    }

    @OriginalMember(owner = "client!o", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class56.field635 = false;
        field285++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI[B)I")
    public static final int method202(byte arg0, int arg1, byte[] arg2) {
        int var3 = -18 % ((-arg0 - 25) / 58);
        field256++;
        return class182.method1286(0, (byte) 102, arg2, arg1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public abstract void method203(boolean arg0);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIB)V")
    public final void method204(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field259++;
        try {
            if (class433.field6361 == null) {
                class513.field7566 = 0;
                class385.field5663 = 0;
                class433.field6361 = this;
                class410.field6100 = arg2;
                class333.field4630 = arg2;
                class66.field848 = arg0;
                if (arg4 > -30) {
                    this.destroy();
                }
                class94.field1278 = arg3;
                class248.field3674 = arg3;
                if (class498.field7404 == null) {
                    class265.field3909 = class498.field7404 = new class419(this, arg1, null, 0);
                }
                class449 var6 = class498.field7404.method2564(127, 1, this);
                while (var6.field6617 == 0) {
                    class213.method1462(10L, -5184);
                }
            } else {
                class402.field5971++;
                if (class402.field5971 >= 3) {
                    this.method194(126, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class194.method1362(var8, null, -82);
            this.method194(126, "crash");
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static final void method205(int arg0) {
        class168.field2378 = arg0;
        for (int var1 = 0; var1 < class241.field3562; var1++) {
            for (int var2 = 0; var2 < class497.field7388; var2++) {
                if (class422.field6240[arg0][var1][var2] == null) {
                    class422.field6240[arg0][var1][var2] = new class148(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field255++;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public abstract void method206(int arg0);

    @OriginalMember(owner = "client!o", name = "run", descriptor = "()V")
    public final void run() {
        field278++;
        try {
            label110: {
                if (class419.field6186 != null) {
                    String var1 = class419.field6186.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class419.field6187;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method194(126, "wrongjava");
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class419.field6187 == null || class419.field6187.equals("1.4.2"))) {
                        this.method194(127, "wrongjava");
                        break label110;
                    }
                }
                if (class419.field6187 != null && class419.field6187.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class419.field6187.length() > var3) {
                        char var5 = class419.field6187.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class525.field7709 = true;
                    }
                }
                if (class498.field7404.field6180 != null) {
                    Method var6 = class419.field6194;
                    if (var6 != null) {
                        try {
                            var6.invoke(class498.field7404.field6180, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class322.method1988((byte) -109);
                class518.method3083(27616);
                this.method197((byte) -97);
                this.method206(-22158);
                class120.field1679 = class374.method2303(-67);
                this.method200((byte) 47);
                while (class22.field243 == 0L || class437.method2644(-65) < class22.field243) {
                    class373.field5540 = class120.field1679.method923(true, class101.field1423);
                    for (int var7 = 0; var7 < class373.field5540; var7++) {
                        this.method193(8101);
                    }
                    this.method214(161363937);
                    class293.method1854(class498.field7404, 93, class148.field2081);
                }
            }
        } catch (Throwable var10) {
            class194.method1362(var10, this.method210((byte) -76), 68);
            this.method194(127, "crash");
        }
        this.method199(false, true);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static final void method207(byte arg0) {
        field271++;
        if (arg0 != -86) {
            return;
        }
        for (int var1 = 0; var1 < class232.field3410; var1++) {
            int var2 = class173.field2454[var1];
            class461 var3 = class250.field3690[var2];
            if (var3 != null) {
                class199.method1401(var3.field6790.field1344, (byte) -10, var3);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZIIILjava/lang/String;II)V")
    public final void method208(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class94.field1278 = arg6;
            class248.field3674 = arg6;
            class513.field7566 = arg4;
            class385.field5663 = 0;
            class66.field848 = arg0;
            class410.field6100 = arg2;
            class333.field4630 = arg2;
            class433.field6361 = this;
            class245.field3611 = new Frame();
            class245.field3611.setTitle("Jagex");
            class245.field3611.setResizable(true);
            class245.field3611.addWindowListener(this);
            class245.field3611.setVisible(true);
            class245.field3611.toFront();
            Insets var9 = class245.field3611.getInsets();
            class245.field3611.setSize(class248.field3674 + var9.right + var9.left, class333.field4630 + var9.bottom + var9.top);
            class265.field3909 = class498.field7404 = new class419(null, arg7, arg5, arg3);
            class449 var10 = class498.field7404.method2564(-118, 1, this);
            while (var10.field6617 == 0) {
                class213.method1462(10L, -5184);
            }
        } catch (Exception var12) {
            class194.method1362(var12, null, 120);
        }
        field250++;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public abstract void method209(int arg0);

    @OriginalMember(owner = "client!o", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field279++;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)Ljava/lang/String;")
    public String method210(byte arg0) {
        field269++;
        if (arg0 != -76) {
            field289 = 50;
        }
        return null;
    }

    @OriginalMember(owner = "client!o", name = "providesignlink", descriptor = "(Let;)V")
    public static final void providesignlink(class419 arg0) {
        field267++;
        class498.field7404 = arg0;
        class265.field3909 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field283++;
        if (class245.field3611 == null) {
            return class498.field7404 == null || class498.field7404.field6180 == this ? super.getDocumentBase() : class498.field7404.field6180.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field263++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
    public static final void method211(int arg0, byte arg1) {
        class63.field750 = arg0;
        if (arg1 != -94) {
            field290 = -0.71957296F;
        }
        field252++;
        class153.field2171.method1105(false);
    }

    @OriginalMember(owner = "client!o", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field261++;
        this.destroy();
    }

    @OriginalMember(owner = "client!o", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field266++;
        if (class245.field3611 == null) {
            return class498.field7404 == null || class498.field7404.field6180 == this ? super.getCodeBase() : class498.field7404.field6180.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public static void method212(int arg0) {
        field272 = null;
        field287 = null;
        field288 = null;
        if (arg0 != 19197) {
            field289 = 83;
        }
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    public abstract void method213(int arg0);

    @OriginalMember(owner = "client!o", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field270++;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
    private final void method214(int arg0) {
        if (arg0 != 161363937) {
            return;
        }
        field286++;
        long var2 = class437.method2644(-60);
        long var4 = class281.field4103[class402.field5972];
        class281.field4103[class402.field5972] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class338.field4691 = ((var6 >> 1) + 32000) / var6;
        }
        class402.field5972 = class402.field5972 + 1 & 0x1F;
        if (class203.field2942++ > 50) {
            class203.field2942 -= 50;
            class487.field7145 = true;
            class148.field2081.setSize(class94.field1278, class410.field6100);
            class148.field2081.setVisible(true);
            if (class245.field3611 != null && class149.field2112 == null) {
                Insets var7 = class245.field3611.getInsets();
                class148.field2081.setLocation(class385.field5663 + var7.left, var7.top - -class513.field7566);
            } else {
                class148.field2081.setLocation(class385.field5663, class513.field7566);
            }
        }
        this.method213(6231);
    }
}
