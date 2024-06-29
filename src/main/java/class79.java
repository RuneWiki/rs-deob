import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URL;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class79 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
    private boolean field1099 = false;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1111 = Calendar.getInstance();

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Lej;")
    public static class204 field1126 = new class204(30);

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Luf;")
    public static class168 field1129 = class148.method1019(-1720, " <col=00ff80>");

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Z")
    public static boolean field1133 = false;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "[Luf;")
    public static class168[] field1131 = new class168[8];

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1132 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "Luf;")
    public static class168 field1135 = class148.method1019(-1720, "Weiter");

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Ldk;")
    public static class241 field1128;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "[[[Lsb;")
    public static class127[][][] field1130;

    @OriginalMember(owner = "client!ne", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 7)
    public final void windowActivated(WindowEvent arg0) {
        field1120++;
    }

    @OriginalMember(owner = "client!ne", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 22)
    public final URL getDocumentBase() {
        field1095++;
        if (class283.field4782 == null) {
            return class51.field622 == null || class51.field622.field1000 == this ? super.getDocumentBase() : class51.field622.field1000.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "start", descriptor = "()V", line = 39)
    public final void start() {
        field1110++;
        if (class71.field949 == this && !class23.field284) {
            class70.field933 = 0L;
        }
    }

    @OriginalMember(owner = "client!ne", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 52)
    public final void windowIconified(WindowEvent arg0) {
        field1097++;
    }

    @OriginalMember(owner = "client!ne", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 65)
    public final void focusLost(FocusEvent arg0) {
        field1106++;
        class96.field1534 = false;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 77)
    public static void method470(int arg0) {
        field1128 = null;
        field1129 = null;
        field1111 = null;
        field1126 = null;
        field1135 = null;
        field1130 = (class127[][][]) null;
        field1131 = null;
        field1132 = null;
        if (arg0 != 64) {
            providesignlink((class75) null);
        }
    }

    @OriginalMember(owner = "client!ne", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 96)
    public final URL getCodeBase() {
        field1104++;
        if (class283.field4782 == null) {
            return class51.field622 == null || class51.field622.field1000 == this ? super.getCodeBase() : class51.field622.field1000.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 112)
    private final void method471(int arg0) {
        field1102++;
        int var2 = 124 / ((arg0 + 27) / 43);
        long var3 = class194.method1368((byte) -103);
        long var5 = class275.field4632[class187.field2959];
        class275.field4632[class187.field2959] = var3;
        class187.field2959 = class187.field2959 + 1 & 0x1F;
        if (var5 != 0L && var5 >= var3) {
        }
        synchronized (this) {
            client.field4935 = class96.field1534;
        }
        this.method469(false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BZ)V", line = 143)
    public static final void method472(byte arg0, boolean arg1) {
        field1112++;
        byte var2;
        byte[][] var3;
        if (arg1) {
            var2 = 1;
            var3 = class28.field356;
        } else {
            var2 = 4;
            var3 = class151.field2336;
        }
        if (arg0 >= -25) {
            providesignlink((class75) null);
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class303.field5104[var5] >> 8) * 64 - class182.field2916;
            int var7 = (class303.field5104[var5] & 0xFF) * 64 - class276.field4641;
            byte[] var8 = var3[var5];
            if (var8 != null) {
                class254.method1750((byte) -125);
                class285.method1970(var8, arg1, var7, var6, class144.field2221 * 8 - 48, (class282.field4739 + -6) * 8, (byte) -65, class140.field2176);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class303.field5104[var9] >> 8) * 64 - class182.field2916;
            int var11 = (class303.field5104[var9] & 0xFF) * 64 - class276.field4641;
            byte[] var12 = var3[var9];
            if (var12 == null && class144.field2221 < 800) {
                class254.method1750((byte) -32);
                for (int var13 = 0; var13 < var2; var13++) {
                    class294.method2022(var13, 64, 64, 23229, var11, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V", line = 217)
    public final void method473(byte arg0, String arg1, String arg2) {
        if (arg0 != -66) {
            return;
        }
        field1125++;
        if (this.field1099) {
            return;
        }
        this.field1099 = true;
        System.out.println("error_game_" + arg2);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg2 + ".ws?" + arg1), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLdk;Ldk;)V", line = 240)
    public static final void method474(byte arg0, class241 arg1, class241 arg2) {
        int var3 = -83 / ((84 - arg0) / 35);
        field1114++;
        class224.field3615 = arg1;
        class18.field209 = arg2;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V", line = 254)
    public final synchronized void method475(boolean arg0) {
        field1122++;
        if (class189.field3023 != null) {
            class189.field3023.removeFocusListener(this);
            class189.field3023.getParent().remove(class189.field3023);
        }
        Container var2;
        if (class8.field98 != null) {
            var2 = class8.field98;
        } else if (class283.field4782 == null) {
            var2 = class51.field622.field1000;
        } else {
            var2 = class283.field4782;
        }
        var2.setLayout((LayoutManager) null);
        class189.field3023 = new class211(this);
        class189.field3023.setIgnoreRepaint(true);
        var2.add(class189.field3023);
        class189.field3023.setSize(class14.field142, class299.field5069);
        class189.field3023.setVisible(true);
        if (class283.field4782 == var2) {
            Insets var3 = class283.field4782.getInsets();
            class189.field3023.setLocation(class27.field346 + var3.left, var3.top - -class117.field1822);
        } else {
            class189.field3023.setLocation(class27.field346, class117.field1822);
        }
        class189.field3023.addFocusListener(this);
        class189.field3023.requestFocus();
        client.field4935 = true;
        class96.field1534 = arg0;
        class227.field3683 = true;
        class103.field1602 = false;
        class182.field2920 = class194.method1368((byte) -111);
    }

    @OriginalMember(owner = "client!ne", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 302)
    public final void windowClosed(WindowEvent arg0) {
        field1118++;
    }

    @OriginalMember(owner = "client!ne", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 315)
    public final AppletContext getAppletContext() {
        field1115++;
        if (class283.field4782 == null) {
            return class51.field622 == null || class51.field622.field1000 == this ? super.getAppletContext() : class51.field622.field1000.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 335)
    public final void focusGained(FocusEvent arg0) {
        field1103++;
        class96.field1534 = true;
        class227.field3683 = true;
    }

    @OriginalMember(owner = "client!ne", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 344)
    public final void windowDeiconified(WindowEvent arg0) {
        field1091++;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V", line = 352)
    private final void method477(boolean arg0) {
        if (!arg0) {
            field1126 = (class204) null;
        }
        field1100++;
        long var2 = class194.method1368((byte) -109);
        long var4 = class111.field1741[class197.field3260];
        class111.field1741[class197.field3260] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class99.field1553 = ((var6 >> 1) + 32000) / var6;
        }
        class197.field3260 = class197.field3260 + 1 & 0x1F;
        if (class6.field73++ > 50) {
            class6.field73 -= 50;
            class227.field3683 = true;
            class189.field3023.setSize(class14.field142, class299.field5069);
            class189.field3023.setVisible(true);
            if (class283.field4782 != null && class8.field98 == null) {
                Insets var7 = class283.field4782.getInsets();
                class189.field3023.setLocation(class27.field346 + var7.left, class117.field1822 + var7.top);
            } else {
                class189.field3023.setLocation(class27.field346, class117.field1822);
            }
        }
        this.method481((byte) -81);
    }

    @OriginalMember(owner = "client!ne", name = "stop", descriptor = "()V", line = 394)
    public final void stop() {
        field1108++;
        if (class71.field949 == this && !class23.field284) {
            class70.field933 = class194.method1368((byte) -105) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ne", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 407)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1092++;
    }

    @OriginalMember(owner = "client!ne", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 416)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1123++;
    }

    @OriginalMember(owner = "client!ne", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 427)
    public final void windowDeactivated(WindowEvent arg0) {
        field1116++;
    }

    @OriginalMember(owner = "client!ne", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 435)
    public final String getParameter(String arg0) {
        field1089++;
        if (class283.field4782 == null) {
            return class51.field622 == null || class51.field622.field1000 == this ? super.getParameter(arg0) : class51.field622.field1000.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 455)
    public final void method478(String arg0, int arg1) {
        field1117++;
        if (this.field1099) {
            return;
        }
        this.field1099 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            if (arg1 > -57) {
                this.windowIconified((WindowEvent) null);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(BZ)V", line = 479)
    private final void method479(byte arg0, boolean arg1) {
        field1093++;
        if (arg0 != 39) {
            return;
        }
        synchronized (this) {
            if (class23.field284) {
                return;
            }
            class23.field284 = true;
        }
        if (class51.field622.field1000 != null) {
            class51.field622.field1000.destroy();
        }
        try {
            this.method476(-22024);
        } catch (Exception var12) {
        }
        if (class189.field3023 != null) {
            try {
                class189.field3023.removeFocusListener(this);
                class189.field3023.getParent().remove(class189.field3023);
            } catch (Exception var11) {
            }
        }
        if (class51.field622 != null) {
            try {
                class51.field622.method431(0);
            } catch (Exception var10) {
            }
        }
        this.method484(false);
        if (class283.field4782 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ne", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 540)
    public final synchronized void paint(Graphics arg0) {
        field1096++;
        if (class71.field949 == this && !class23.field284) {
            class227.field3683 = true;
            if (class75.field1002 != null && class75.field1002.startsWith("1.5")) {
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 567)
    public final void method480(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1088++;
        try {
            if (class71.field949 != null) {
                class297.field5030++;
                if (class297.field5030 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method478("alreadyloaded", -100);
                return;
            }
            class136.field2119 = arg2;
            class14.field142 = arg3;
            class196.field3240 = arg3;
            class27.field346 = 0;
            class299.field5069 = arg4;
            class197.field3264 = arg4;
            class71.field949 = this;
            class117.field1822 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class297.field5019 = true;
            } else {
                class297.field5019 = false;
            }
            if (class51.field622 == null) {
                class140.field2156 = class51.field622 = new class75(false, this, arg0, (String) null, 0);
            }
            if (arg1 != 3) {
                field1129 = (class168) null;
            }
            class51.field622.method429(this, 0, 5);
        } catch (Exception var8) {
            class43.method234(var8, -15954, (String) null);
            this.method478("crash", arg1 ^ 0xFFFFFF8B);
        }
    }

    @OriginalMember(owner = "client!ne", name = "destroy", descriptor = "()V", line = 619)
    public final void destroy() {
        field1121++;
        if (class71.field949 == this && !class23.field284) {
            class70.field933 = class194.method1368((byte) -1);
            class300.method2054(10, 5000L);
            class140.field2156 = null;
            this.method479((byte) 39, false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "providesignlink", descriptor = "(Lcj;)V", line = 637)
    public static final void providesignlink(class75 arg0) {
        field1090++;
        class51.field622 = arg0;
        class140.field2156 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 646)
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        try {
            class71.field949 = this;
            class117.field1822 = 0;
            class136.field2119 = arg2;
            class27.field346 = 0;
            if (arg0 >= -76) {
                this.start();
            }
            class299.field5069 = arg5;
            class197.field3264 = arg5;
            class14.field142 = arg3;
            class196.field3240 = arg3;
            class283.field4782 = new Frame();
            class283.field4782.setTitle("Jagex");
            class283.field4782.setResizable(true);
            class283.field4782.addWindowListener(this);
            class283.field4782.setVisible(true);
            class283.field4782.toFront();
            Insets var8 = class283.field4782.getInsets();
            class283.field4782.setSize(class196.field3240 + var8.left + var8.right, class197.field3264 - -var8.top + var8.bottom);
            class140.field2156 = class51.field622 = new class75(true, (Applet) null, arg4, arg6, arg1);
            class51.field622.method429(this, 0, 5);
        } catch (Exception var10) {
            class43.method234(var10, -15954, (String) null);
        }
        field1105++;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Z", line = 684)
    public final boolean method483(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1119++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 0) {
                method474((byte) 41, (class241) null, (class241) null);
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
                this.method478("invalidhost", arg0 - 72);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZLfj;BIII)V", line = 721)
    public static final void method485(int arg0, boolean arg1, class283 arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1101++;
        long var7 = (long) ((arg6 << 16) + arg4);
        int var9 = -81 % ((-arg5 - 8) / 53);
        class221 var10 = (class221) class143.field2199.method493(var7, 109);
        if (var10 != null) {
            return;
        }
        class221 var11 = (class221) class65.field869.method493(var7, 70);
        if (var11 != null) {
            return;
        }
        class221 var12 = (class221) class272.field4578.method493(var7, 58);
        if (var12 == null) {
            if (!arg1) {
                class221 var13 = (class221) class206.field3383.method493(var7, 99);
                if (var13 != null) {
                    return;
                }
            }
            class221 var14 = new class221();
            var14.field3584 = arg0;
            var14.field3587 = arg2;
            var14.field3590 = arg3;
            if (arg1) {
                class143.field2199.method490(var14, var7, true);
                class43.field527++;
            } else {
                class5.field71.method1890(var14, false);
                class272.field4578.method490(var14, var7, true);
                class189.field3007++;
            }
        } else if (arg1) {
            var12.method1464((byte) 84);
            class143.field2199.method490(var12, var7, true);
            class43.field527++;
            class189.field3007--;
        }
    }

    @OriginalMember(owner = "client!ne", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 784)
    public final void windowOpened(WindowEvent arg0) {
        field1094++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Lok;", line = 791)
    public static final class40 method486(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class40 var4 = var3.field1979;
            var3.field1979 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "run", descriptor = "()V", line = 802)
    public final void run() {
        field1098++;
        try {
            if (class75.field989 != null) {
                String var1 = class75.field989.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class75.field1002;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method478("wrongjava", -71);
                        return;
                    }
                    class123.field1902 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class75.field1002 == null || class75.field1002.equals("1.4.2"))) {
                    this.method478("wrongjava", -120);
                    return;
                }
            }
            if (class51.field622.field1000 != null) {
                Method var3 = class75.field1009;
                if (var3 != null) {
                    try {
                        var3.invoke(class51.field622.field1000, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method475(true);
            this.method468(4);
            class78.field1068 = class300.method2053(false);
            while (class70.field933 == 0L || class194.method1368((byte) 114) < class70.field933) {
                class60.field790 = class78.field1068.method37(true, class54.field675, class123.field1902);
                for (int var5 = 0; var5 < class60.field790; var5++) {
                    this.method471(-83);
                }
                this.method477(true);
                class279.method1928((byte) 125, class51.field622, class189.field3023);
            }
        } catch (Exception var8) {
            class43.method234(var8, -15954, (String) null);
            this.method478("crash", -76);
        }
        this.method479((byte) 39, true);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(Z)V", line = 891)
    public static final void method487(boolean arg0) {
        if (arg0) {
            return;
        }
        field1107++;
        int var1 = class20.field242;
        int var2 = class131.field2031;
        int var3 = field1124;
        int var4 = 6116423;
        int var5 = class110.field1727;
        class228.method1560(var1, var2, var3, var5, var4);
        class228.method1560(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class228.method1558(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        class102.field1588.method193(class217.field3548, var1 + 3, var2 + 14, var4, -1);
        int var6 = class262.field4442;
        int var7 = class155.field2457;
        for (int var8 = 0; var8 < class22.field275; var8++) {
            int var9 = (class22.field275 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < (var1 + var3) && var7 > var9 - 13 && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            class102.field1588.method193(class142.method979(var8, true), var1 + 3, var9, var10, 0);
        }
        class193.method1361(class131.field2031, class20.field242, class110.field1727, field1124, !arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public abstract void method468(int arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public abstract void method469(boolean arg0);

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public abstract void method476(int arg0);

    @OriginalMember(owner = "client!ne", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public abstract void method481(byte arg0);

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(Z)V")
    public abstract void method484(boolean arg0);
}
