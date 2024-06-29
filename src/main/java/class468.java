import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!sr")
public abstract class class468 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "Z")
    private boolean field6169 = false;

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "Z")
    private boolean field6170 = false;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
    public static int field6163 = 0;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "Leba;")
    public static class550 field6144 = new class550(91, 3);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!sr", name = "P", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!sr", name = "R", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!sr", name = "T", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!sr", name = "U", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!sr", name = "V", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!sr", name = "W", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!sr", name = "X", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!sr", name = "Y", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!sr", name = "N", descriptor = "Z")
    public static boolean field6175;

    @OriginalMember(owner = "client!sr", name = "O", descriptor = "Z")
    public static boolean field6176;

    @OriginalMember(owner = "client!sr", name = "Q", descriptor = "Z")
    public static boolean field6178;

    @OriginalMember(owner = "client!sr", name = "S", descriptor = "Z")
    public static boolean field6180;

    @OriginalMember(owner = "client!sr", name = "Z", descriptor = "Z")
    public static boolean field6187;

    @OriginalMember(owner = "client!sr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field6157++;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Z")
    public final boolean method2602(int arg0) {
        field6150++;
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
            }
            if (arg0 != -1) {
                this.field6169 = false;
            }
            this.method2614("invalidhost", (byte) -20);
            return false;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public abstract void method2603(byte arg0);

    @OriginalMember(owner = "client!sr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field6146++;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
    public abstract void method2604(int arg0);

    @OriginalMember(owner = "client!sr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field6156++;
        if (class190.field2630 == null) {
            return class516.field7178 == null || class516.field7178 == this ? super.getCodeBase() : class516.field7178.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class429.field5776 = true;
        field6159++;
        class340.field4575 = true;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
    public static void method2605(byte arg0) {
        field6144 = null;
        if (arg0 != 53) {
            method2605((byte) -13);
        }
    }

    @OriginalMember(owner = "client!sr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field6149++;
        if (class27.field400 != this || class370.field4863) {
            return;
        }
        class340.field4575 = true;
        if (class347.field4629 && (class529.method2982((byte) -69) - class271.field3539) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class455.field5994 && var2.height >= class246.field3213) {
                class58.field737 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)Ljava/lang/String;")
    public String method2606(int arg0) {
        field6168++;
        if (arg0 != 0) {
            this.field6169 = true;
        }
        return null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIZLr;)Lre;")
    public static final class633 method2607(int arg0, int arg1, boolean arg2, class562 arg3) {
        field6154++;
        if (arg0 == -1) {
            return null;
        }
        if (class600.field8341 != null) {
            for (int var4 = 0; var4 < class600.field8341.length; var4++) {
                if (class600.field8341[var4] == arg0) {
                    return class421.field5524[var4];
                }
            }
        }
        if (arg1 != 10735) {
            method2607(-123, 21, true, null);
        }
        class633 var5 = (class633) class323.field4357.method2176(arg1 - 10863, (long) arg0);
        if (var5 != null) {
            if (arg2 && var5.field8761 == null) {
                class658 var6 = class77.method422(class418.field5501, arg0, (byte) -125);
                if (var6 == null) {
                    return null;
                }
                var5.field8761 = var6;
            }
            return var5;
        }
        class92[] var7 = class92.method513(class6.field62, arg0);
        if (var7 == null) {
            return null;
        }
        class658 var8 = class77.method422(class418.field5501, arg0, (byte) -125);
        if (var8 == null) {
            return null;
        }
        class633 var9;
        if (arg2) {
            var9 = new class633(arg3.method1130(var8, var7, true), var8);
        } else {
            var9 = new class633(arg3.method1130(var8, var7, true));
        }
        class323.field4357.method2174(var9, (long) arg0, (byte) 124);
        return var9;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBIILjava/lang/String;II)V")
    public final void method2608(int arg0, byte arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field6162++;
        try {
            if (class27.field400 == null) {
                class628.field8692 = 0;
                class204.field2738 = class516.field7178;
                class399.field5301 = arg5;
                class455.field5994 = arg5;
                class27.field400 = this;
                class646.field8936 = 0;
                class60.field750 = arg3;
                class246.field3213 = arg3;
                class613.field8496 = arg2;
                if (arg1 > -70) {
                    field6144 = null;
                }
                class520.field7208 = class312.field4206 = new class388(arg0, arg4, arg6, class516.field7178 != null);
                class661 var8 = class312.field4206.method2220(this, 1, (byte) 117);
                while (var8.field9420 == 0) {
                    class588.method3253(0, 10L);
                }
            } else {
                class538.field7375++;
                if (class538.field7375 >= 3) {
                    this.method2614("alreadyloaded", (byte) -20);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class91.method499(null, var10, (byte) 5);
            this.method2614("crash", (byte) -20);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
    private final void method2609(boolean arg0) {
        field6171++;
        long var2 = class529.method2982((byte) -69);
        long var4 = class451.field5952[class204.field2740];
        class451.field5952[class204.field2740] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class204.field2740 = class204.field2740 + 1 & 0x1F;
        synchronized (this) {
            if (!arg0) {
                field6144 = null;
            }
            class327.field4400 = class429.field5776;
        }
        this.method2604(-125);
    }

    @OriginalMember(owner = "client!sr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field6161++;
    }

    @OriginalMember(owner = "client!sr", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field6138++;
        if (class27.field400 == this && !class370.field4863) {
            class47.field561 = class529.method2982((byte) -69);
            class588.method3253(0, 5000L);
            class520.field7208 = null;
            this.method2612((byte) 101, false);
        }
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
    public synchronized void method2610(int arg0) {
        if (class583.field7996 != null) {
            class583.field7996.removeFocusListener(this);
            class583.field7996.getParent().setBackground(Color.black);
            class583.field7996.getParent().remove(class583.field7996);
        }
        field6137++;
        Container var2;
        if (class529.field7314 != null) {
            var2 = class529.field7314;
        } else if (class190.field2630 != null) {
            var2 = class190.field2630;
        } else if (class516.field7178 == null) {
            var2 = class27.field400;
        } else {
            var2 = class516.field7178;
        }
        var2.setLayout(null);
        if (arg0 != 96) {
            this.field6170 = false;
        }
        class583.field7996 = new class315(this);
        var2.add(class583.field7996);
        class583.field7996.setSize(class399.field5301, class60.field750);
        class583.field7996.setVisible(true);
        if (class190.field2630 == var2) {
            Insets var3 = class190.field2630.getInsets();
            class583.field7996.setLocation(class646.field8936 + var3.left, class628.field8692 + var3.top);
        } else {
            class583.field7996.setLocation(class646.field8936, class628.field8692);
        }
        class583.field7996.addFocusListener(this);
        class583.field7996.requestFocus();
        class429.field5776 = true;
        class327.field4400 = true;
        class340.field4575 = true;
        class58.field737 = false;
        class271.field3539 = class529.method2982((byte) -69);
    }

    @OriginalMember(owner = "client!sr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field6143++;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z[FI)[F")
    public static final float[] method2611(boolean arg0, float[] arg1, int arg2) {
        if (arg0) {
            provideLoaderApplet(null);
        }
        field6151++;
        float[] var3 = new float[arg2];
        class2.method6(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BZ)V")
    private final void method2612(byte arg0, boolean arg1) {
        field6147++;
        synchronized (this) {
            if (class370.field4863) {
                return;
            }
            class370.field4863 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class516.field7178 != null) {
            class516.field7178.destroy();
        }
        try {
            this.method2617((byte) -116);
        } catch (Exception var9) {
        }
        if (this.field6169) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field6169 = false;
        }
        class69.method383(arg0 ^ 0x65, true);
        class591.method3269((byte) 106);
        if (arg0 != 101) {
            field6144 = null;
        }
        if (class583.field7996 != null) {
            try {
                class583.field7996.removeFocusListener(this);
                class583.field7996.getParent().remove(class583.field7996);
            } catch (Exception var7) {
            }
        }
        if (class312.field4206 != null) {
            try {
                class312.field4206.method2223(-85);
            } catch (Exception var6) {
            }
        }
        this.method2616(81);
        if (class190.field2630 != null) {
            class190.field2630.setVisible(false);
            class190.field2630.dispose();
            class190.field2630 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!sr", name = "run", descriptor = "()V")
    public final void run() {
        field6164++;
        try {
            if (class388.field5180 != null) {
                String var1 = class388.field5180.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class388.field5174;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2614("wrongjava", (byte) -20);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class388.field5174 == null || class388.field5174.equals("1.4.2"))) {
                    this.method2614("wrongjava", (byte) -20);
                    return;
                }
            }
            if (class388.field5174 != null && class388.field5174.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class388.field5174.length() > var3) {
                    char var5 = class388.field5174.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = -(-var5 - var4 * 10) - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class347.field4629 = true;
                }
            }
            Applet var6 = class27.field400;
            if (class516.field7178 != null) {
                var6 = class516.field7178;
            }
            Method var7 = class388.field5173;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class140.method790(94);
            class660.method3773(false);
            this.method2610(96);
            this.method2603((byte) -44);
            class618.field8581 = class53.method314(2047);
            while (class47.field561 == 0L || class47.field561 > class529.method2982((byte) -69)) {
                class310.field4190 = class618.field8581.method248(-120, class149.field2000);
                for (int var8 = 0; var8 < class310.field4190; var8++) {
                    this.method2609(true);
                }
                this.method2615(50);
                class333.method1965(class312.field4206, class583.field7996, false);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class91.method499(this.method2606(0), var20, (byte) 119);
            this.method2614("crash", (byte) -20);
        } finally {
            Object var13 = null;
            this.method2612((byte) 101, true);
        }
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)V")
    public abstract void method2613(int arg0);

    @OriginalMember(owner = "client!sr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field6139++;
        if (class190.field2630 == null) {
            return class516.field7178 == null || class516.field7178 == this ? super.getDocumentBase() : class516.field7178.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method2614(String arg0, byte arg1) {
        field6140++;
        if (arg1 != -20) {
            this.method2617((byte) 22);
        }
        if (this.field6170) {
            return;
        }
        this.field6170 = true;
        System.out.println("error_game_" + arg0);
        try {
            class507.method2883(class516.field7178, arg1 ^ 0x1074, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!sr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field6145++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!sr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field6165++;
    }

    @OriginalMember(owner = "client!sr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field6166++;
    }

    @OriginalMember(owner = "client!sr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field6172++;
    }

    @OriginalMember(owner = "client!sr", name = "start", descriptor = "()V")
    public final void start() {
        field6152++;
        if (class27.field400 == this && !class370.field4863) {
            class47.field561 = 0L;
        }
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V")
    private final void method2615(int arg0) {
        field6160++;
        long var2 = class529.method2982((byte) -69);
        long var4 = class311.field4197[class372.field4950];
        class311.field4197[class372.field4950] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class91.field1119 = ((var6 >> 1) + 32000) / var6;
        }
        class372.field4950 = class372.field4950 + 1 & 0x1F;
        if (arg0 < class11.field147++) {
            class11.field147 -= 50;
            class340.field4575 = true;
            class583.field7996.setSize(class399.field5301, class60.field750);
            class583.field7996.setVisible(true);
            if (class190.field2630 != null && class529.field7314 == null) {
                Insets var7 = class190.field2630.getInsets();
                class583.field7996.setLocation(class646.field8936 + var7.left, var7.top - -class628.field8692);
            } else {
                class583.field7996.setLocation(class646.field8936, class628.field8692);
            }
        }
        this.method2613(7969);
    }

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)V")
    public abstract void method2616(int arg0);

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)V")
    public abstract void method2617(byte arg0);

    @OriginalMember(owner = "client!sr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field6155++;
        if (class190.field2630 == null) {
            return class516.field7178 == null || class516.field7178 == this ? super.getAppletContext() : class516.field7178.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(B)Z")
    public final boolean method2618(byte arg0) {
        if (arg0 > -17) {
            field6144 = null;
        }
        field6158++;
        return class324.method1882("jaclib", 75);
    }

    @OriginalMember(owner = "client!sr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field6148++;
        if (class190.field2630 == null) {
            return class516.field7178 == null || class516.field7178 == this ? super.getParameter(arg0) : class516.field7178.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(B)Z")
    public final boolean method2619(byte arg0) {
        if (arg0 != 13) {
            field6144 = null;
        }
        field6141++;
        return class324.method1882("jagmisc", -80);
    }

    @OriginalMember(owner = "client!sr", name = "stop", descriptor = "()V")
    public final void stop() {
        field6167++;
        if (class27.field400 == this && !class370.field4863) {
            class47.field561 = class529.method2982((byte) -69) + 4000L;
        }
    }

    @OriginalMember(owner = "client!sr", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        field6136++;
        class516.field7178 = arg0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBILjava/lang/String;ZII)V")
    public final void method2620(int arg0, int arg1, byte arg2, int arg3, String arg4, boolean arg5, int arg6, int arg7) {
        field6142++;
        try {
            class204.field2738 = null;
            if (arg2 < 41) {
                this.field6170 = false;
            }
            class613.field8496 = arg0;
            class628.field8692 = 0;
            class60.field750 = arg7;
            class246.field3213 = arg7;
            class399.field5301 = arg1;
            class455.field5994 = arg1;
            class27.field400 = this;
            class646.field8936 = 0;
            class190.field2630 = new Frame();
            class190.field2630.setTitle("Jagex");
            class190.field2630.setResizable(true);
            class190.field2630.addWindowListener(this);
            class190.field2630.setVisible(true);
            class190.field2630.toFront();
            Insets var9 = class190.field2630.getInsets();
            class190.field2630.setSize(var9.right + var9.left + class455.field5994, class246.field3213 + var9.top + var9.bottom);
            class520.field7208 = class312.field4206 = new class388(arg6, arg4, arg3, true);
            class661 var10 = class312.field4206.method2220(this, 1, (byte) 107);
            while (var10.field9420 == 0) {
                class588.method3253(0, 10L);
            }
        } catch (Exception var12) {
            class91.method499(null, var12, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!sr", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!sr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class429.field5776 = false;
        field6153++;
    }
}
