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

@OriginalClass("client!uaa")
public abstract class class319 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "Z")
    private boolean field4661 = false;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "Z")
    private boolean field4656 = false;

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "I")
    public static int field4665 = 0;

    @OriginalMember(owner = "client!uaa", name = "N", descriptor = "I")
    public static int field4682 = 50;

    @OriginalMember(owner = "client!uaa", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field4683 = new String[field4682];

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "[I")
    public static int[] field4663 = new int[field4682];

    @OriginalMember(owner = "client!uaa", name = "C", descriptor = "[I")
    public static int[] field4671 = new int[field4682];

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "[I")
    public static int[] field4667 = new int[field4682];

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "[I")
    public static int[] field4655 = new int[field4682];

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "[I")
    public static int[] field4650 = new int[field4682];

    @OriginalMember(owner = "client!uaa", name = "T", descriptor = "[I")
    public static int[] field4688 = new int[field4682];

    @OriginalMember(owner = "client!uaa", name = "S", descriptor = "Lfo;")
    public static class417 field4687 = new class417();

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!uaa", name = "G", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!uaa", name = "H", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!uaa", name = "I", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!uaa", name = "J", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!uaa", name = "K", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!uaa", name = "L", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!uaa", name = "M", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!uaa", name = "P", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!uaa", name = "Q", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!uaa", name = "R", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!uaa", name = "U", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!uaa", name = "W", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!uaa", name = "X", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!uaa", name = "Y", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!uaa", name = "cb", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!uaa", name = "eb", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!uaa", name = "fb", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!uaa", name = "hb", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!uaa", name = "ib", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!uaa", name = "V", descriptor = "Z")
    public static boolean field4690;

    @OriginalMember(owner = "client!uaa", name = "Z", descriptor = "Z")
    public static boolean field4694;

    @OriginalMember(owner = "client!uaa", name = "ab", descriptor = "Z")
    public static boolean field4695;

    @OriginalMember(owner = "client!uaa", name = "bb", descriptor = "Z")
    public static boolean field4696;

    @OriginalMember(owner = "client!uaa", name = "db", descriptor = "Z")
    public static boolean field4698;

    @OriginalMember(owner = "client!uaa", name = "gb", descriptor = "Z")
    public static boolean field4701;

    @OriginalMember(owner = "client!uaa", name = "E", descriptor = "[[I")
    public static int[][] field4673;

    @OriginalMember(owner = "client!uaa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 3)
    public final void windowClosed(WindowEvent arg0) {
        field4681++;
    }

    @OriginalMember(owner = "client!uaa", name = "start", descriptor = "()V", line = 10)
    public final void start() {
        field4662++;
        if (class575.field7958 == this && !class606.field8282) {
            class264.field3630 = 0L;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)Z", line = 22)
    public final boolean method2059(int arg0) {
        field4660++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 < 89) {
                this.getDocumentBase();
            }
            if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
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
                    this.method2063(-17312, "invalidhost");
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 63)
    public final synchronized void paint(Graphics arg0) {
        field4676++;
        if (class575.field7958 != this || class606.field8282) {
            return;
        }
        class569.field7877 = true;
        if (class187.field2297 && class669.method3713(0) - class306.field4117 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class227.field2965 <= var2.width && var2.height >= class649.field9200) {
                class309.field4140 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V", line = 84)
    private final void method2060(int arg0) {
        if (arg0 <= 14) {
            field4650 = null;
        }
        field4664++;
        long var2 = class669.method3713(0);
        long var4 = class476.field6441[class210.field2749];
        class476.field6441[class210.field2749] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class210.field2749 = class210.field2749 + 1 & 0x1F;
        synchronized (this) {
            class594.field8144 = class380.field5449;
        }
        this.method1418(106);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V", line = 116)
    public final synchronized void method2061(boolean arg0) {
        field4643++;
        if (class249.field3351 != null) {
            class249.field3351.removeFocusListener(this);
            class249.field3351.getParent().remove(class249.field3351);
        }
        Container var2;
        if (class463.field6333 != null) {
            var2 = class463.field6333;
        } else if (class250.field3376 != null) {
            var2 = class250.field3376;
        } else if (class372.field5359 == null) {
            var2 = class575.field7958;
        } else {
            var2 = class372.field5359;
        }
        var2.setLayout(null);
        class249.field3351 = new class34(this);
        var2.add(class249.field3351);
        class249.field3351.setSize(class303.field4059, class211.field2763);
        class249.field3351.setVisible(true);
        if (class250.field3376 == var2) {
            Insets var3 = class250.field3376.getInsets();
            class249.field3351.setLocation(class407.field5739 + var3.left, var3.top - -class243.field3276);
        } else {
            class249.field3351.setLocation(class407.field5739, class243.field3276);
        }
        class249.field3351.addFocusListener(this);
        class249.field3351.requestFocus();
        class380.field5449 = true;
        class594.field8144 = true;
        class569.field7877 = true;
        class309.field4140 = arg0;
        class306.field4117 = class669.method3713(0);
    }

    @OriginalMember(owner = "client!uaa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 167)
    public final void focusGained(FocusEvent arg0) {
        field4653++;
        class380.field5449 = true;
        class569.field7877 = true;
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)V", line = 176)
    public static void method2062(int arg0) {
        field4687 = null;
        field4688 = null;
        field4663 = null;
        field4673 = null;
        field4671 = null;
        field4655 = null;
        field4683 = null;
        if (arg0 != -49) {
            field4663 = null;
        }
        field4650 = null;
        field4667 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "destroy", descriptor = "()V", line = 196)
    public final void destroy() {
        field4658++;
        if (class575.field7958 == this && !class606.field8282) {
            class264.field3630 = class669.method3713(0);
            class660.method3668(-1, 5000L);
            class340.field4968 = null;
            this.method2067((byte) 100, false);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 210)
    public final void windowDeiconified(WindowEvent arg0) {
        field4684++;
    }

    @OriginalMember(owner = "client!uaa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 219)
    public final String getParameter(String arg0) {
        field4677++;
        if (class250.field3376 == null) {
            return class372.field5359 == null || class372.field5359 == this ? super.getParameter(arg0) : class372.field5359.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "stop", descriptor = "()V", line = 234)
    public final void stop() {
        field4679++;
        if (class575.field7958 == this && !class606.field8282) {
            class264.field3630 = class669.method3713(0) + 4000L;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 246)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4645++;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 254)
    public final void method2063(int arg0, String arg1) {
        field4659++;
        if (this.field4656 || arg0 != -17312) {
            return;
        }
        this.field4656 = true;
        System.out.println("error_game_" + arg1);
        try {
            class302.method1821(class372.field5359, 10049, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!uaa", name = "run", descriptor = "()V", line = 284)
    public final void run() {
        field4689++;
        try {
            if (class112.field1345 != null) {
                String var1 = class112.field1345.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class112.field1363;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2063(-17312, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class112.field1363 == null || class112.field1363.equals("1.4.2"))) {
                    this.method2063(-17312, "wrongjava");
                    return;
                }
            }
            if (class112.field1363 != null && class112.field1363.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class112.field1363.length() > var3) {
                    char var5 = class112.field1363.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class187.field2297 = true;
                }
            }
            Applet var6 = class575.field7958;
            if (class372.field5359 != null) {
                var6 = class372.field5359;
            }
            Method var7 = class112.field1364;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class675.method3728((byte) 112);
            class91.method506((byte) -116);
            this.method2061(false);
            this.method1420(false);
            class21.field188 = class33.method203(-83);
            while (class264.field3630 == 0L || class669.method3713(0) < class264.field3630) {
                class128.field1627 = class21.field188.method1704(0, class373.field5377);
                for (int var8 = 0; var8 < class128.field1627; var8++) {
                    this.method2060(58);
                }
                this.method2068(false);
                class473.method2658(class249.field3351, (byte) 127, class495.field6687);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class282.method1694(this.method1421(5), (byte) 47, var20);
            this.method2063(-17312, "crash");
        } finally {
            Object var13 = null;
            this.method2067((byte) 18, true);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 409)
    public final void focusLost(FocusEvent arg0) {
        field4672++;
        class380.field5449 = false;
    }

    @OriginalMember(owner = "client!uaa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 417)
    public final void windowActivated(WindowEvent arg0) {
        field4674++;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIBIILjava/lang/String;I)V", line = 425)
    public final void method2064(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5, int arg6) {
        field4657++;
        try {
            if (class575.field7958 == null) {
                class303.field4059 = arg4;
                class227.field2965 = arg4;
                class243.field3276 = 0;
                class407.field5739 = 0;
                class523.field7245 = arg1;
                class157.field1974 = class372.field5359;
                class575.field7958 = this;
                class211.field2763 = arg6;
                class649.field9200 = arg6;
                int var8 = -69 % ((arg2 + 69) / 54);
                class340.field4968 = class495.field6687 = new class112(arg3, arg5, arg0, class372.field5359 != null);
                class280 var9 = class495.field6687.method612(1, this, (byte) -36);
                while (var9.field3773 == 0) {
                    class660.method3668(-1, 10L);
                }
            } else {
                class353.field5159++;
                if (class353.field5159 >= 3) {
                    this.method2063(-17312, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var11) {
            class282.method1694(null, (byte) 47, var11);
            this.method2063(-17312, "crash");
        }
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)Ljava/lang/String;", line = 472)
    public String method1421(int arg0) {
        if (arg0 != 5) {
            this.method2063(45, null);
        }
        field4652++;
        return null;
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)Z", line = 484)
    public final boolean method2065(int arg0) {
        if (arg0 != 5754) {
            this.start();
        }
        field4644++;
        return class552.method3093("jagmisc", arg0 - 5754);
    }

    @OriginalMember(owner = "client!uaa", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 495)
    public static final void provideLoaderApplet(Applet arg0) {
        field4649++;
        class372.field5359 = arg0;
    }

    @OriginalMember(owner = "client!uaa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 510)
    public final void windowDeactivated(WindowEvent arg0) {
        field4646++;
    }

    @OriginalMember(owner = "client!uaa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 520)
    public final URL getDocumentBase() {
        field4680++;
        if (class250.field3376 == null) {
            return class372.field5359 == null || class372.field5359 == this ? super.getDocumentBase() : class372.field5359.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIIIIBILoa;III[[[B)V", line = 534)
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class689 arg8, int arg9, int arg10, int arg11, byte[][][] arg12) {
        field4647++;
        if (arg1 == 0 || arg4 == 0) {
            return;
        }
        if (arg1 == 9) {
            arg1 = 1;
            arg10 = arg10 + 1 & 0x3;
        }
        if (arg1 == 10) {
            arg1 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        if (arg6 > -26) {
            return;
        }
        if (arg1 == 11) {
            arg1 = 8;
            arg10 = arg10 + 3 & 0x3;
        }
        arg8.method2006(arg11, arg7, arg9, arg3, arg2, arg0, arg12[arg1 - 1][arg10], arg4, arg5);
    }

    @OriginalMember(owner = "client!uaa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 579)
    public final URL getCodeBase() {
        field4666++;
        if (class250.field3376 == null) {
            return class372.field5359 == null || class372.field5359 == this ? super.getCodeBase() : class372.field5359.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BZ)V", line = 597)
    private final void method2067(byte arg0, boolean arg1) {
        field4670++;
        synchronized (this) {
            if (class606.field8282) {
                return;
            }
            class606.field8282 = true;
        }
        if (class372.field5359 != null) {
            class372.field5359.destroy();
        }
        try {
            this.method1402(true);
        } catch (Exception var10) {
        }
        if (this.field4661) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field4661 = false;
        }
        class146.method991(true, 68);
        class330.method2117(0);
        if (arg0 <= 0) {
            field4687 = null;
        }
        if (class249.field3351 != null) {
            try {
                class249.field3351.removeFocusListener(this);
                class249.field3351.getParent().remove(class249.field3351);
            } catch (Exception var8) {
            }
        }
        if (class495.field6687 != null) {
            try {
                class495.field6687.method614(-88);
            } catch (Exception var7) {
            }
        }
        this.method1403((byte) -121);
        if (class250.field3376 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(Z)V", line = 677)
    private final void method2068(boolean arg0) {
        field4678++;
        long var2 = class669.method3713(0);
        long var4 = class265.field3645[class551.field7535];
        class265.field3645[class551.field7535] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class59.field826 = ((var6 >> 1) + 32000) / var6;
        }
        class551.field7535 = class551.field7535 + 1 & 0x1F;
        if ((class477.field6452++) > 50) {
            class569.field7877 = true;
            class477.field6452 -= 50;
            class249.field3351.setSize(class303.field4059, class211.field2763);
            class249.field3351.setVisible(true);
            if (class250.field3376 != null && class463.field6333 == null) {
                Insets var7 = class250.field3376.getInsets();
                class249.field3351.setLocation(class407.field5739 + var7.left, class243.field3276 + var7.top);
            } else {
                class249.field3351.setLocation(class407.field5739, class243.field3276);
            }
        }
        if (arg0) {
            field4671 = null;
        }
        this.method1401(-4128);
    }

    @OriginalMember(owner = "client!uaa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 729)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4686++;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IBZI)V", line = 738)
    public static final void method2069(int arg0, byte arg1, boolean arg2, int arg3) {
        field4648++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class129.field1643 = arg2;
        if (arg1 != 82) {
            field4665 = 103;
        }
        class519.field7166 = arg3;
        class553.field7560 = arg0;
    }

    @OriginalMember(owner = "client!uaa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 754)
    public final AppletContext getAppletContext() {
        field4675++;
        if (class250.field3376 == null) {
            return class372.field5359 == null || class372.field5359 == this ? super.getAppletContext() : class372.field5359.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIZIILpea;I[B)Lmm;", line = 774)
    public static final class459 method2070(int arg0, int arg1, boolean arg2, int arg3, int arg4, class641 arg5, int arg6, byte[] arg7) {
        field4685++;
        if (arg6 != -2709) {
            field4671 = null;
        }
        if (!arg5.field8965 && (!class144.method986(arg1, (byte) -110) || !class144.method986(arg4, (byte) -99))) {
            return arg5.field8993 ? new class459(arg5, 34037, arg0, arg1, arg4, arg2, arg7, arg3) : new class459(arg5, arg0, arg1, arg4, class306.method1837((byte) -121, arg1), class306.method1837((byte) -116, arg4), arg7, arg3);
        } else {
            return new class459(arg5, 3553, arg0, arg1, arg4, arg2, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZZIIIILjava/lang/String;I)V", line = 800)
    public final void method2071(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field4654++;
        try {
            class157.field1974 = null;
            class407.field5739 = 0;
            class575.field7958 = this;
            class211.field2763 = arg5;
            class649.field9200 = arg5;
            class523.field7245 = arg7;
            class243.field3276 = 0;
            class303.field4059 = arg2;
            class227.field2965 = arg2;
            class250.field3376 = new Frame();
            class250.field3376.setTitle("Jagex");
            class250.field3376.setResizable(true);
            class250.field3376.addWindowListener(this);
            class250.field3376.setVisible(true);
            class250.field3376.toFront();
            Insets var9 = class250.field3376.getInsets();
            class250.field3376.setSize(class227.field2965 + var9.left + var9.right, class649.field9200 + var9.top + var9.bottom);
            class340.field4968 = class495.field6687 = new class112(arg3, arg6, arg4, true);
            class280 var10 = class495.field6687.method612(1, this, (byte) 89);
            while (var10.field3773 == 0) {
                class660.method3668(-1, 10L);
            }
        } catch (Exception var12) {
            class282.method1694(null, (byte) 47, var12);
        }
        if (arg0) {
            field4667 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 842)
    public final void windowOpened(WindowEvent arg0) {
        field4668++;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)Z", line = 852)
    public final boolean method2072(byte arg0) {
        int var2 = -101 / ((32 - arg0) / 62);
        field4669++;
        return class552.method3093("jaclib", 0);
    }

    @OriginalMember(owner = "client!uaa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 882)
    public final void windowIconified(WindowEvent arg0) {
        field4651++;
    }

    @OriginalMember(owner = "client!uaa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(Z)V")
    public abstract void method1420(boolean arg0);

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)V")
    public abstract void method1418(int arg0);

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(Z)V")
    public abstract void method1402(boolean arg0);

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "(I)V")
    public abstract void method1401(int arg0);

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
    public abstract void method1403(byte arg0);
}
