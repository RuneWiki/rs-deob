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
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class407 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "Z")
    private boolean field5742 = false;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "Z")
    private boolean field5771 = false;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "Lcb;")
    public static class304 field5761 = new class304(5000);

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ar", name = "R", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ar", name = "T", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ar", name = "U", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Ltj;")
    public static class108 field5735;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "Lsp;")
    public static class382 field5764;

    @OriginalMember(owner = "client!ar", name = "S", descriptor = "Z")
    public static boolean field5779;

    @OriginalMember(owner = "client!ar", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field5763++;
    }

    @OriginalMember(owner = "client!ar", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field5738++;
    }

    @OriginalMember(owner = "client!ar", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field5774++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)V")
    private final void method2555(boolean arg0, int arg1) {
        field5749++;
        synchronized (this) {
            if (class135.field2088) {
                return;
            }
            class135.field2088 = true;
        }
        if (class401.field5628.field3154 != null) {
            class401.field5628.field3154.destroy();
        }
        try {
            this.method1187(7);
        } catch (Exception var11) {
        }
        if (this.field5771) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field5771 = false;
        }
        if (arg1 > -57) {
            field5750 = 127;
        }
        class156 var4 = class401.field5628.method1537(class125.field1679.getClass(), -84);
        while (var4.field2298 == 0) {
            class259.method1790((byte) -118, 100L);
        }
        if (class117.field1588 != null) {
            try {
                class117.field1588.removeFocusListener(this);
                class117.field1588.getParent().remove(class117.field1588);
            } catch (Exception var9) {
            }
        }
        if (class401.field5628 != null) {
            try {
                class401.field5628.method1546((byte) -34);
            } catch (Exception var8) {
            }
        }
        this.method1174(4);
        if (class369.field5255 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ar", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field5743++;
        if (class369.field5255 == null) {
            return class401.field5628 == null || class401.field5628.field3154 == this ? super.getParameter(arg0) : class401.field5628.field3154.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public abstract void method1185(int arg0);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
    public static void method2556(boolean arg0) {
        field5764 = null;
        field5761 = null;
        field5735 = null;
        if (arg0) {
            field5751 = 61;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public abstract void method1174(int arg0);

    @OriginalMember(owner = "client!ar", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field5769++;
        if (class125.field1679 != this || class135.field2088) {
            return;
        }
        class240.field3543 = true;
        if (class346.field5007 && (class18.method107(-16145) - class233.field3449) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class261.field3865 <= var2.width && class338.field4901 <= var2.height) {
                class34.field422 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method2557(String arg0, boolean arg1) {
        field5744++;
        if (this.field5742) {
            return;
        }
        this.field5742 = arg1;
        System.out.println("error_game_" + arg0);
        try {
            class348.method2282((byte) -110, "loggedout", class401.field5628.field3154);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method2558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field5739++;
        if (class103.method609(arg8, 1)) {
            class242.method1653(arg0, arg2, arg4, class186.field2657[arg8], arg7, arg5, arg3, -1, 15, arg1);
            if (arg6) {
                method2556(true);
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class353.field5126[var9] = true;
            }
        } else {
            class353.field5126[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!ar", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field5745++;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V")
    public abstract void method1187(int arg0);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public abstract void method1186(byte arg0);

    @OriginalMember(owner = "client!ar", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class223.field3345 = false;
        field5737++;
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)Z")
    public final boolean method2559(int arg0) {
        field5740++;
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
            this.method2557("invalidhost", true);
            if (arg0 != 18) {
                this.windowActivated((WindowEvent) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
    public static final void method2560(int arg0) {
        if (arg0 != -8682) {
            field5764 = null;
        }
        class34.field427 = new class442();
        field5773++;
    }

    @OriginalMember(owner = "client!ar", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method2561(String arg0, int arg1) {
        field5772++;
        long var2 = 0L;
        if (arg1 <= 49) {
            return 110L;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    private final void method2562(byte arg0) {
        if (arg0 != -5) {
            return;
        }
        field5746++;
        long var2 = class18.method107(-16145);
        long var4 = class355.field5141[class207.field2978];
        class355.field5141[class207.field2978] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class97.field1238 = ((var6 >> 1) + 32000) / var6;
        }
        class207.field2978 = class207.field2978 + 1 & 0x1F;
        if (class436.field6234++ > 50) {
            class240.field3543 = true;
            class436.field6234 -= 50;
            class117.field1588.setSize(class24.field307, class316.field4643);
            class117.field1588.setVisible(true);
            if (class369.field5255 != null && class213.field3016 == null) {
                Insets var7 = class369.field5255.getInsets();
                class117.field1588.setLocation(class238.field3520 + var7.left, class19.field251 + var7.top);
            } else {
                class117.field1588.setLocation(class238.field3520, class19.field251);
            }
        }
        this.method1185(arg0 + 50005);
    }

    @OriginalMember(owner = "client!ar", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field5759++;
        if (class369.field5255 == null) {
            return class401.field5628 == null || class401.field5628.field3154 == this ? super.getAppletContext() : class401.field5628.field3154.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)Z")
    public static final boolean method2563(int arg0) throws IOException {
        field5770++;
        if (class199.field2847 == null) {
            return false;
        }
        int var1 = class199.field2847.method1089((byte) -112);
        if (var1 == 0) {
            return false;
        }
        if (class213.field3012 == -1) {
            class199.field2847.method1096(1, class352.field5114.field1851, -1, 0);
            class352.field5114.field1880 = 0;
            class213.field3012 = class352.field5114.method2046((byte) 126);
            var1--;
            class242.field3572 = class327.field4746[class213.field3012];
        }
        if (class242.field3572 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class199.field2847.method1096(1, class352.field5114.field1851, -1, 0);
            class242.field3572 = class352.field5114.field1851[0] & 0xFF;
            var1--;
        }
        if (~class242.field3572 == arg0) {
            if (var1 <= 1) {
                return false;
            }
            class199.field2847.method1096(2, class352.field5114.field1851, arg0 - 2, 0);
            class352.field5114.field1880 = 0;
            var1 -= 2;
            class242.field3572 = class352.field5114.method798(false);
        }
        if (class242.field3572 > var1) {
            return false;
        }
        class352.field5114.field1880 = 0;
        class199.field2847.method1096(class242.field3572, class352.field5114.field1851, arg0 ^ 0xFFFFFFFE, 0);
        class312.field4617 = 0;
        class324.field4719 = class13.field189;
        class13.field189 = class198.field2831;
        class198.field2831 = class213.field3012;
        if (class213.field3012 == 93) {
            if (class213.field3016 != null) {
                class240.method1641(-1, class220.field3168, false, -1, arg0 ^ -3);
            }
            byte[] var2 = new byte[class242.field3572];
            class352.field5114.method2051(var2, (byte) 45, 0, class242.field3572);
            String var3 = class312.method2098(0, 0, class242.field3572, var2);
            class439.method2738(true, class110.field1418 == 1, (byte) -87, class401.field5628, var3);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 66) {
            class386.method2455(false, (byte) -102);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 9) {
            for (int var4 = 0; var4 < class150.field2254.length; var4++) {
                if (class169.field2397[var4] != class150.field2254[var4]) {
                    class150.field2254[var4] = class169.field2397[var4];
                    class394.method2486(var4, -1);
                    class197.field2825[class209.method1483(class320.field4690++, 31)] = var4;
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 96) {
            int var5 = class352.field5114.method815(true);
            int var6 = class352.field5114.method798(false);
            int var7 = class352.field5114.method857(255);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class352.field5114.method822((byte) -13);
            int var9 = class352.field5114.method798(false);
            if (var9 == 65535) {
                var9 = -1;
            }
            if (class359.method2338(-122, var6)) {
                for (int var10 = var9; var10 <= var7; var10++) {
                    long var11 = ((long) var8 << 32) + (long) var10;
                    class83 var13 = (class83) class166.field2374.method1373(var11, 15);
                    class83 var14;
                    if (var13 != null) {
                        var14 = new class83(var5, var13.field1053);
                        var13.method2660((byte) 126);
                    } else if (var10 == -1) {
                        var14 = new class83(var5, class438.method2732(var8, arg0 ^ 0x1).field3214.field1053);
                    } else {
                        var14 = new class83(var5, -1);
                    }
                    class166.field2374.method1376(var14, var11, 93);
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 231) {
            int var15 = class352.field5114.method857(255);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = class352.field5114.method809(false);
            int var17 = class352.field5114.method814((byte) 83);
            int var18 = class352.field5114.method815(true);
            if (class359.method2338(-124, var16)) {
                class240.method1635(-122, var15, var17, var18);
                class409 var19 = class167.method1202(true, var15);
                class135.method1042(128, var19.field5831, var19.field5815, var19.field5821, var17);
                class259.method1794(var19.field5818, (byte) 84, var19.field5861, var19.field5865, var17);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 65) {
            class352.field5114.field1880 += 28;
            if (class352.field5114.method858((byte) 49)) {
                class299.method2014(class352.field5114.field1880 - 28, class352.field5114, 1);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 190) {
            class417.field5994 = class352.field5114.method837(true);
            for (int var20 = 0; var20 < class417.field5994; var20++) {
                class137.field2109[var20] = class352.field5114.method843(arg0 - 89);
                class289.field4207[var20] = class352.field5114.method843(arg0 - 115);
                if (class289.field4207[var20].equals("")) {
                    class289.field4207[var20] = class137.field2109[var20];
                }
                class434.field6200[var20] = class352.field5114.method843(-119);
                class266.field3905[var20] = class352.field5114.method843(-103);
                if (class266.field3905[var20].equals("")) {
                    class266.field3905[var20] = class434.field6200[var20];
                }
                class398.field5595[var20] = false;
            }
            class444.field6344 = class428.field6095;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 198) {
            int var21 = class352.field5114.method822((byte) -13);
            int var22 = class352.field5114.method857(255);
            int var23 = class352.field5114.method814((byte) 83);
            if (class359.method2338(-120, var22)) {
                class253 var24 = (class253) class318.field4662.method1373((long) var23, arg0 + 22);
                class253 var25 = (class253) class318.field4662.method1373((long) var21, 122);
                if (var25 != null) {
                    class102.method596(var24 == null || var24.field3746 != var25.field3746, true, var25, false);
                }
                if (var24 != null) {
                    var24.method2660((byte) 117);
                    class318.field4662.method1376(var24, (long) var21, 111);
                }
                class223 var26 = class438.method2732(var23, 0);
                if (var26 != null) {
                    class245.method1701(var26, (byte) -94);
                }
                class223 var27 = class438.method2732(var21, 0);
                if (var27 != null) {
                    class245.method1701(var27, (byte) -94);
                    class380.method2420(var27, true, 0);
                }
                if (class265.field3898 != -1) {
                    class23.method122(1, -27431, class265.field3898);
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 23) {
            class441.method2745(-24536);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 24) {
            int var28 = class352.field5114.method809(false);
            int var29 = class352.field5114.method814((byte) 83);
            int var30 = class352.field5114.method809(false);
            if (class359.method2338(-123, var30)) {
                class119.method728(true, var29, var28);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 18) {
            int var31 = class352.field5114.method812(arg0 ^ 0x2);
            int var32 = class352.field5114.method809(false);
            byte var33 = class352.field5114.method806(-128);
            if (class359.method2338(-117, var32)) {
                class432.method2700(var31, var33, -50);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 187) {
            int var34 = class352.field5114.method837(true);
            int var35 = class352.field5114.method837(true);
            if (var34 == 255) {
                var35 = -1;
                var34 = -1;
            }
            class153.method1128((byte) 87, var34, var35);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 39) {
            String var36 = class352.field5114.method843(-117);
            int var37 = class352.field5114.method848(255);
            int var38 = class352.field5114.method798(false);
            if (var38 == 65535) {
                var38 = -1;
            }
            int var39 = class352.field5114.method848(255);
            if (var39 >= 1 && var39 <= 8) {
                if (var36.equalsIgnoreCase("null")) {
                    var36 = null;
                }
                class317.field4659[var39 - 1] = var36;
                class223.field3315[var39 - 1] = var38;
                class340.field4920[var39 - 1] = var37 == 0;
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 246) {
            field5750 = class352.field5114.method837(true);
            class429.field6106 = class352.field5114.method810((byte) -6);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 77) {
            int var40 = class352.field5114.method857(arg0 ^ 0xFE);
            int var41 = class352.field5114.method798(false);
            int var42 = class352.field5114.method837(true);
            class446 var43 = class442.field6317[var40];
            if (var43 != null) {
                class377.method2405(var41, -126, var42, var43);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 98) {
            int var44 = class352.field5114.method850(false);
            int var45 = class352.field5114.method812(3);
            int var46 = class352.field5114.method857(255);
            int var47 = class352.field5114.method822((byte) -13);
            if (class359.method2338(-121, var46)) {
                class253 var48 = (class253) class318.field4662.method1373((long) var47, -95);
                if (var48 != null) {
                    class102.method596(var48.field3746 != var45, true, var48, false);
                }
                class91.method541(var47, var45, var44, (byte) 7, false);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 49) {
            int var49 = class352.field5114.method798(false);
            int var50 = class352.field5114.method837(true);
            int var51 = class352.field5114.method837(true);
            int var52 = class352.field5114.method837(true);
            int var53 = class352.field5114.method837(true);
            int var54 = class352.field5114.method798(false);
            if (class359.method2338(-125, var49)) {
                class248.field3704[var50] = true;
                class285.field4144[var50] = var51;
                class355.field5147[var50] = var52;
                class125.field1682[var50] = var53;
                class365.field5225[var50] = var54;
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 148) {
            int var55 = class352.field5114.method798(false);
            int var56 = class352.field5114.method837(true);
            boolean var57 = (var56 & 0x1) == 1;
            class64.method408(var57, var55, (byte) -80);
            int var58 = class352.field5114.method798(false);
            for (int var59 = 0; var59 < var58; var59++) {
                int var60 = class352.field5114.method848(255);
                if (var60 == 255) {
                    var60 = class352.field5114.method814((byte) 83);
                }
                int var61 = class352.field5114.method809(false);
                class427.method2667(var61 - 1, var55, (byte) -28, var60, var57, var59);
            }
            class435.field6213[class209.method1483(class1.field5++, 31)] = var55;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 31) {
            int var62 = class352.field5114.method812(3);
            int var63 = class352.field5114.method857(255);
            int var64 = class352.field5114.method815(true);
            int var65 = class352.field5114.method822((byte) -13);
            if (class359.method2338(-124, var62)) {
                class450.method2798(var63, var64, false, 5, var65);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 118) {
            int var66 = class352.field5114.method798(false);
            int var67 = class352.field5114.method812(3);
            int var68 = class352.field5114.method815(true);
            if (class359.method2338(-121, var66)) {
                class120.method733(var67, var68, arg0 + 16);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 224) {
            int var69 = class352.field5114.method798(false);
            int var70 = class352.field5114.method837(true);
            boolean var71 = (var70 & 0x1) == 1;
            while (class242.field3572 > class352.field5114.field1880) {
                int var72 = class352.field5114.method854(arg0 + 3943);
                int var73 = class352.field5114.method798(false);
                int var74 = 0;
                if (var73 != 0) {
                    var74 = class352.field5114.method837(true);
                    if (var74 == 255) {
                        var74 = class352.field5114.method815(true);
                    }
                }
                class427.method2667(var73 - 1, var69, (byte) -120, var74, var71, var72);
            }
            class435.field6213[class209.method1483(31, class1.field5++)] = var69;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 121) {
            int var75 = class352.field5114.method812(3);
            int var76 = class352.field5114.method815(true);
            class8.method42(-1, var76, var75);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 185) {
            int var77 = class352.field5114.method809(false);
            if (var77 == 65535) {
                var77 = -1;
            }
            int var78 = class352.field5114.method798(false);
            int var79 = class352.field5114.method817(true);
            if (class359.method2338(-121, var78)) {
                class450.method2798(var77, -1, false, 2, var79);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 69) {
            String var80 = class352.field5114.method843(arg0 - 95);
            int var81 = class352.field5114.method798(false);
            String var82 = class23.method126(32767, var81).method394(class352.field5114, 80);
            class186.method1333(arg0 ^ 0x1, 19, (String) null, var82, var80, var81, var80, 0);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 241) {
            int var83 = class352.field5114.method809(false);
            int var84 = class352.field5114.method798(false);
            int var85 = class352.field5114.method857(255);
            int var86 = class352.field5114.method822((byte) -13);
            if ((var86 >> 30) != 0) {
                int var111 = var86 >> 28 & 0x3;
                int var112 = ((var86 & 0xFFFC40A) >> 14) - class306.field4459;
                int var113 = (var86 & 0x3FFF) - class342.field4959;
                if (var112 >= 0 && var113 >= 0 && var112 < class80.field1034 && var113 < class381.field5414) {
                    int var114 = var112 * 128 + 64;
                    int var115 = var113 * 128 + 64;
                    class216 var116 = new class216(var83, 0, class34.field434, var111, var114, class452.method2820(var111, var115, false, var114) - var84, var115, var112, var112, var113, var113);
                    class319.field4666.method2756(-101, new class86(var116));
                }
            } else if ((var86 >> 29) != 0) {
                int var99 = var86 & 0xFFFF;
                class446 var100 = class442.field6317[var99];
                if (var100 != null) {
                    if (var83 == 65535) {
                        var83 = -1;
                    }
                    boolean var101 = true;
                    if (var83 != -1 && var100.field4578 != -1) {
                        if (var100.field4578 == var83) {
                            class135 var106 = class209.method1486(var83, 11);
                            if (var106.field2068 && var106.field2078 != -1) {
                                class183 var107 = class110.method671(-21965, var106.field2078);
                                int var108 = var107.field2592;
                                if (var108 == 0 || var108 == 2) {
                                    var101 = false;
                                } else if (var108 == 1) {
                                    var101 = true;
                                }
                            }
                        } else {
                            class135 var102 = class209.method1486(var83, 11);
                            class135 var103 = class209.method1486(var100.field4578, 11);
                            if (var102.field2078 != -1 && var103.field2078 != -1) {
                                class183 var104 = class110.method671(-21965, var102.field2078);
                                class183 var105 = class110.method671(-21965, var103.field2078);
                                if (var105.field2583 > var104.field2583) {
                                    var101 = false;
                                }
                            }
                        }
                    }
                    if (var101) {
                        var100.field4552 = 0;
                        var100.field4545 = var84;
                        var100.field4586 = 1;
                        var100.field4578 = var83;
                        var100.field4577 = 0;
                        var100.field4518 = class34.field434 + var85;
                        if (var100.field4518 > class34.field434) {
                            var100.field4577 = -1;
                        }
                        if (var100.field4578 != -1 && class34.field434 == var100.field4518) {
                            int var109 = class209.method1486(var100.field4578, 11).field2078;
                            if (var109 != -1) {
                                class183 var110 = class110.method671(-21965, var109);
                                if (var110 != null && var110.field2609 != null) {
                                    class47.method311(var100.field4463, var100.field4466, 0, true, false, var110);
                                }
                            }
                        }
                    }
                }
            } else if ((var86 >> 28) != 0) {
                int var87 = var86 & 0xFFFF;
                class128 var88;
                if (class302.field4417 == var87) {
                    var88 = class181.field2555;
                } else {
                    var88 = class243.field3596[var87];
                }
                if (var88 != null) {
                    if (var83 == 65535) {
                        var83 = -1;
                    }
                    boolean var89 = true;
                    if (var83 != -1 && var88.field4578 != -1) {
                        if (var88.field4578 == var83) {
                            class135 var90 = class209.method1486(var83, arg0 ^ 0xA);
                            if (var90.field2068 && var90.field2078 != -1) {
                                class183 var91 = class110.method671(-21965, var90.field2078);
                                int var92 = var91.field2592;
                                if (var92 == 0 || var92 == 2) {
                                    var89 = false;
                                } else if (var92 == 1) {
                                    var89 = true;
                                }
                            }
                        } else {
                            class135 var93 = class209.method1486(var83, 11);
                            class135 var94 = class209.method1486(var88.field4578, 11);
                            if (var93.field2078 != -1 && var94.field2078 != -1) {
                                class183 var95 = class110.method671(-21965, var93.field2078);
                                class183 var96 = class110.method671(-21965, var94.field2078);
                                if (var95.field2583 < var96.field2583) {
                                    var89 = false;
                                }
                            }
                        }
                    }
                    if (var89) {
                        var88.field4578 = var83;
                        var88.field4586 = 1;
                        var88.field4545 = var84;
                        var88.field4552 = 0;
                        var88.field4577 = 0;
                        var88.field4518 = class34.field434 + var85;
                        if (class34.field434 < var88.field4518) {
                            var88.field4577 = -1;
                        }
                        if (var88.field4578 == 65535) {
                            var88.field4578 = -1;
                        }
                        if (var88.field4578 != -1 && class34.field434 == var88.field4518) {
                            int var97 = class209.method1486(var88.field4578, 11).field2078;
                            if (var97 != -1) {
                                class183 var98 = class110.method671(-21965, var97);
                                if (var98 != null && var98.field2609 != null) {
                                    class47.method311(var88.field4463, var88.field4466, 0, true, class181.field2555 == var88, var98);
                                }
                            }
                        }
                    }
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 204) {
            class158.method1153((byte) 54, class401.field5628, class242.field3572, class352.field5114);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 205) {
            int var117 = class352.field5114.method837(true);
            if (class352.field5114.method837(true) == 0) {
                class135.field2091[var117] = new class218();
            } else {
                class352.field5114.field1880--;
                class135.field2091[var117] = new class218(class352.field5114);
            }
            class213.field3012 = -1;
            class213.field3009 = class428.field6095;
            return true;
        } else if (class213.field3012 == 35) {
            int var118 = class352.field5114.method809(false);
            byte var119 = class352.field5114.method825(105);
            class446.method2783(var119, 125, var118);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 248) {
            int var120 = class352.field5114.method857(255);
            int var121 = class352.field5114.method837(true);
            class8.method42(arg0 ^ 0xFFFFFFFE, var121, var120);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 88) {
            int var122 = class352.field5114.method837(true);
            int var123 = var122 >> 5;
            int var124 = var122 & 0x1F;
            if (var124 == 0) {
                class209.field2990[var123] = null;
                class213.field3012 = -1;
                return true;
            }
            class136 var125 = new class136();
            var125.field2097 = var124;
            var125.field2100 = class352.field5114.method837(true);
            if (var125.field2100 >= 0 && var125.field2100 < class70.field928.length) {
                if (var125.field2097 == 1 || var125.field2097 == 10) {
                    var125.field2101 = class352.field5114.method798(false);
                    class352.field5114.field1880 += 5;
                } else if (var125.field2097 >= 2 && var125.field2097 <= 6) {
                    if (var125.field2097 == 2) {
                        var125.field2095 = 64;
                        var125.field2105 = 64;
                    }
                    if (var125.field2097 == 3) {
                        var125.field2095 = 0;
                        var125.field2105 = 64;
                    }
                    if (var125.field2097 == 4) {
                        var125.field2095 = 128;
                        var125.field2105 = 64;
                    }
                    if (var125.field2097 == 5) {
                        var125.field2095 = 64;
                        var125.field2105 = 0;
                    }
                    if (var125.field2097 == 6) {
                        var125.field2095 = 64;
                        var125.field2105 = 128;
                    }
                    var125.field2097 = 2;
                    var125.field2102 = class352.field5114.method798(false);
                    var125.field2106 = class352.field5114.method798(false);
                    var125.field2098 = class352.field5114.method837(true);
                    var125.field2104 = class352.field5114.method798(false);
                }
                var125.field2099 = class352.field5114.method798(false);
                if (var125.field2099 == 65535) {
                    var125.field2099 = -1;
                }
                class209.field2990[var123] = var125;
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 117) {
            boolean var126 = class352.field5114.method837(true) == 1;
            String var127 = class352.field5114.method843(-97);
            String var128 = class352.field5114.method843(-98);
            int var129 = class352.field5114.method798(false);
            int var130 = class352.field5114.method837(true);
            String var131 = "";
            boolean var132 = false;
            if (var129 > 0) {
                var131 = class352.field5114.method843(arg0 ^ 0xFFFFFFB6);
                var132 = class352.field5114.method837(true) == 1;
            }
            for (int var133 = 0; var133 < class206.field2897; var133++) {
                if (var126) {
                    if (var128.equals(class56.field743[var133])) {
                        class56.field743[var133] = var127;
                        class366.field5231[var133] = var128;
                        var127 = null;
                        break;
                    }
                } else if (var127.equals(class56.field743[var133])) {
                    if (class275.field3973[var133] != var129) {
                        class275.field3973[var133] = var129;
                        if (var129 > 0) {
                            class373.method2391("", -1, 5, 0, var127 + class166.field2367.method2284((byte) -7, class309.field4497), "");
                        }
                        if (var129 == 0) {
                            class373.method2391("", -1, 5, 0, var127 + class425.field6081.method2284((byte) -37, class309.field4497), "");
                        }
                    }
                    class366.field5231[var133] = var128;
                    class64.field881[var133] = var131;
                    class206.field2904[var133] = var130;
                    class15.field236[var133] = var132;
                    var127 = null;
                    break;
                }
            }
            if (var127 != null && class206.field2897 < 200) {
                class56.field743[class206.field2897] = var127;
                class366.field5231[class206.field2897] = var128;
                class275.field3973[class206.field2897] = var129;
                class64.field881[class206.field2897] = var131;
                class206.field2904[class206.field2897] = var130;
                class15.field236[class206.field2897] = var132;
                class206.field2897++;
            }
            class444.field6344 = class428.field6095;
            boolean var134 = false;
            int var135 = class206.field2897;
            while (var135 > 0) {
                boolean var136 = true;
                var135--;
                for (int var137 = 0; var137 < var135; var137++) {
                    if (class275.field3973[var137] != class426.field6087 && class275.field3973[var137 + 1] == class426.field6087 || class275.field3973[var137] == 0 && class275.field3973[var137 + 1] != 0) {
                        int var138 = class275.field3973[var137];
                        class275.field3973[var137] = class275.field3973[var137 + 1];
                        class275.field3973[var137 + 1] = var138;
                        String var139 = class64.field881[var137];
                        class64.field881[var137] = class64.field881[var137 + 1];
                        class64.field881[var137 + 1] = var139;
                        String var140 = class56.field743[var137];
                        class56.field743[var137] = class56.field743[var137 + 1];
                        class56.field743[var137 + 1] = var140;
                        String var141 = class366.field5231[var137];
                        class366.field5231[var137] = class366.field5231[var137 + 1];
                        class366.field5231[var137 + 1] = var141;
                        int var142 = class206.field2904[var137];
                        class206.field2904[var137] = class206.field2904[var137 + 1];
                        class206.field2904[var137 + 1] = var142;
                        boolean var143 = class15.field236[var137];
                        class15.field236[var137] = class15.field236[var137 + 1];
                        var136 = false;
                        class15.field236[var137 + 1] = var143;
                    }
                }
                if (var136) {
                    break;
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 20) {
            class270.field3952 = class352.field5114.method812(3) * 30;
            class105.field1348 = class428.field6095;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 64) {
            int var144 = class352.field5114.method798(false);
            int var145 = class352.field5114.method837(true);
            int var146 = class352.field5114.method837(true);
            int var147 = class352.field5114.method798(false);
            int var148 = class352.field5114.method837(true);
            int var149 = class352.field5114.method837(true);
            if (class359.method2338(-124, var144)) {
                class419.method2640(var145, var149, -1025, var146, var147, var148);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 232) {
            class204.method1429((byte) 116);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 50) {
            class111.method675(class352.field5114.method843(-89), 25920);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 61) {
            int var150 = class352.field5114.method798(false);
            if (var150 == 65535) {
                var150 = -1;
            }
            int var151 = class352.field5114.method837(true);
            int var152 = class352.field5114.method798(false);
            int var153 = class352.field5114.method837(true);
            class24.method132(var152, var153, var151, var150, -1);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 218) {
            boolean var154 = class352.field5114.method837(true) == 1;
            String var155 = class352.field5114.method843(arg0 ^ 0xFFFFFFAC);
            String var156 = var155;
            if (var154) {
                var156 = class352.field5114.method843(-85);
            }
            long var157 = (long) class352.field5114.method798(false);
            long var159 = (long) class352.field5114.method839((byte) -92);
            int var161 = class352.field5114.method837(true);
            int var162 = class352.field5114.method798(false);
            long var163 = (var157 << 32) + var159;
            boolean var165 = false;
            int var166 = 0;
            while (true) {
                if (var166 >= 100) {
                    if (var161 <= 1 && class101.method591(110, var156)) {
                        var165 = true;
                    }
                    break;
                }
                if (class127.field1764[var166] == var163) {
                    var165 = true;
                    break;
                }
                var166++;
            }
            if (!var165 && class102.field1283 == 0) {
                class127.field1764[class242.field3574] = var163;
                class242.field3574 = (class242.field3574 + 1) % 100;
                String var167 = class23.method126(32767, var162).method394(class352.field5114, 80);
                if (var161 == 2) {
                    class186.method1333(0, 18, (String) null, var167, "<img=1>" + var156, var162, "<img=1>" + var155, 0);
                } else if (var161 == 1) {
                    class186.method1333(0, 18, (String) null, var167, "<img=0>" + var156, var162, "<img=0>" + var155, 0);
                } else {
                    class186.method1333(arg0 ^ 0x1, 18, (String) null, var167, var156, var162, var155, 0);
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 193) {
            int var168 = class352.field5114.method809(false);
            int var169 = class352.field5114.method815(true);
            if (class359.method2338(-125, var168)) {
                class450.method2798(2047, 0, false, 5, var169);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 5) {
            class259.field3833 = class352.field5114.method837(true);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 146) {
            field5750 = class352.field5114.method810((byte) -6);
            class429.field6106 = class352.field5114.method837(true);
            for (class413 var170 = (class413) class338.field4904.method1383(-104); var170 != null; var170 = (class413) class338.field4904.method1378((byte) 98)) {
                int var172 = (int) (var170.field6070 & 0x3FFFL);
                int var173 = (int) (var170.field6070 >> 14 & 0x3FFFL);
                int var174 = (int) (var170.field6070 >> 28 & 0x3L);
                if (class158.field2302 == var174 && field5750 <= var172 && var172 < field5750 + 8 && var173 >= class429.field6106 && class429.field6106 + 8 > var173) {
                    var170.method2660((byte) 121);
                    class122.method738(class158.field2302, var172, var173, (byte) -110);
                }
            }
            for (class102 var171 = (class102) class128.field1810.method2752(-115); var171 != null; var171 = (class102) class128.field1810.method2754(-1)) {
                if (field5750 <= var171.field1289 && field5750 + 8 > var171.field1289 && class429.field6106 <= var171.field1285 && (class429.field6106 + 8) > var171.field1285 && class158.field2302 == var171.field1284) {
                    var171.field1292 = 0;
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 70) {
            int var175 = class352.field5114.method857(arg0 ^ 0xFE);
            int var176 = class352.field5114.method814((byte) 83);
            int var177 = class352.field5114.method812(arg0 + 2);
            if (class359.method2338(arg0 - 122, var175)) {
                class432.method2700(var177, var176, arg0 ^ 0xFFFFFFCD);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 255) {
            int var178 = class352.field5114.method848(255);
            int var179 = class352.field5114.method812(3);
            if (var179 == 65535) {
                var179 = -1;
            }
            class134.method1032(var179, (byte) 72, var178);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 43) {
            int var180 = class352.field5114.method839((byte) -92);
            int var181 = class352.field5114.method812(3);
            if (var181 == 65535) {
                var181 = -1;
            }
            int var182 = class352.field5114.method848(arg0 ^ 0xFE);
            class24.method131(var182, var181, -11494, var180);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 12) {
            int var183 = class352.field5114.method798(false);
            String var184 = class352.field5114.method843(-104);
            Object[] var185 = new Object[var184.length() + 1];
            for (int var186 = var184.length() - 1; var186 >= 0; var186--) {
                if (var184.charAt(var186) == 's') {
                    var185[var186 + 1] = class352.field5114.method843(-115);
                } else {
                    var185[var186 + 1] = Integer.valueOf(class352.field5114.method815(true));
                }
            }
            var185[0] = Integer.valueOf(class352.field5114.method815(true));
            if (class359.method2338(-124, var183)) {
                class79 var187 = new class79();
                var187.field1028 = var185;
                class424.method2655(var187);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 72) {
            int var188 = class352.field5114.method809(false);
            int var189 = class352.field5114.method815(true);
            int var190 = class352.field5114.method798(false);
            int var191 = class352.field5114.method812(3);
            int var192 = class352.field5114.method812(3);
            if (class359.method2338(-124, var191)) {
                class135.method1042(128, var190, var188, var192, var189);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 27) {
            int var193 = class352.field5114.method812(3);
            int var194 = class352.field5114.method817(true);
            int var195 = class352.field5114.method809(false);
            int var196 = class352.field5114.method857(255);
            if (class359.method2338(arg0 - 122, var193)) {
                class403.method2521(arg0 ^ 0xFFFFFFC4, var194, (var195 << 16) + var196);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 25) {
            int var197 = class352.field5114.method798(false);
            int var198 = class352.field5114.method798(false);
            int var199 = class352.field5114.method798(false);
            int var200 = class352.field5114.method798(false);
            if (class359.method2338(-119, var197) && class186.field2657[var198] != null) {
                for (int var201 = var199; var201 < var200; var201++) {
                    int var202 = class352.field5114.method839((byte) -92);
                    if (class186.field2657[var198].length > var201 && class186.field2657[var198][var201] != null) {
                        class186.field2657[var198][var201].field3207 = var202;
                    }
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 68) {
            boolean var203 = class352.field5114.method837(true) == 1;
            String var204 = class352.field5114.method843(-78);
            String var205 = var204;
            if (var203) {
                var205 = class352.field5114.method843(-93);
            }
            long var206 = class352.field5114.method804(893309448);
            long var208 = (long) class352.field5114.method798(false);
            long var210 = (long) class352.field5114.method839((byte) -92);
            int var212 = class352.field5114.method837(true);
            long var213 = (var208 << 32) + var210;
            boolean var215 = false;
            int var216 = 0;
            while (true) {
                if (var216 >= 100) {
                    if (var212 <= 1) {
                        if (!(!class138.field2117 || class335.field4874) || class148.field2211) {
                            var215 = true;
                        } else if (class101.method591(arg0 ^ 0x73, var205)) {
                            var215 = true;
                        }
                    }
                    break;
                }
                if (class127.field1764[var216] == var213) {
                    var215 = true;
                    break;
                }
                var216++;
            }
            if (!var215 && class102.field1283 == 0) {
                class127.field1764[class242.field3574] = var213;
                class242.field3574 = (class242.field3574 + 1) % 100;
                String var217 = class169.method1209(class64.method410(false, class353.method2308(29367, class352.field5114)), 73);
                if (var212 == 2 || var212 == 3) {
                    class186.method1333(0, 9, class141.method1065((byte) -125, var206), var217, "<img=1>" + var205, -1, "<img=1>" + var204, 0);
                } else if (var212 == 1) {
                    class186.method1333(arg0 ^ 0x1, 9, class141.method1065((byte) -100, var206), var217, "<img=0>" + var205, -1, "<img=0>" + var204, 0);
                } else {
                    class186.method1333(arg0 ^ 0x1, 9, class141.method1065((byte) 68, var206), var217, var205, -1, var204, 0);
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 144) {
            int var218 = class352.field5114.method798(false);
            if (var218 == 65535) {
                var218 = -1;
            }
            int var219 = class352.field5114.method822((byte) -13);
            int var220 = (var219 & 0x39A911C4) >> 28;
            int var221 = var219 >> 14 & 0x3FFF;
            int var222 = var219 & 0x3FFF;
            int var223 = class352.field5114.method848(255);
            int var224 = var223 >> 2;
            int var225 = var223 & 0x3;
            int var226 = class278.field4002[var224];
            int var227 = var221 - class306.field4459;
            int var228 = var222 - class342.field4959;
            class371.method2384(false, var228, var224, var225, var220, var218, var226, var227);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 71) {
            class357.field5161 = class352.field5114.method837(true);
            class105.field1348 = class428.field6095;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 38) {
            int var229 = class352.field5114.method800(-17096);
            int var230 = class352.field5114.method817(true);
            int var231 = class352.field5114.method798(false);
            if (class359.method2338(-128, var231)) {
                class40.method268(true, var229, var230);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 14) {
            int var232 = class352.field5114.method850(false);
            int var233 = class352.field5114.method815(true);
            int var234 = class352.field5114.method857(arg0 + 254);
            if (class359.method2338(-118, var234)) {
                class429.method2676(true, var233, var232);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 113) {
            int var235 = class352.field5114.method812(3);
            if (var235 == 65535) {
                var235 = -1;
            }
            int var236 = class352.field5114.method857(255);
            int var237 = class352.field5114.method812(3);
            int var238 = class352.field5114.method814((byte) 83);
            int var239 = class352.field5114.method809(false);
            if (var239 == 65535) {
                var239 = -1;
            }
            if (class359.method2338(-127, var237)) {
                for (int var240 = var235; var240 <= var239; var240++) {
                    long var241 = ((long) var238 << 32) + (long) var240;
                    class83 var243 = (class83) class166.field2374.method1373(var241, -96);
                    class83 var244;
                    if (var243 != null) {
                        var244 = new class83(var243.field1055, var236);
                        var243.method2660((byte) 121);
                    } else if (var240 == -1) {
                        var244 = new class83(class438.method2732(var238, 0).field3214.field1055, var236);
                    } else {
                        var244 = new class83(0, var236);
                    }
                    class166.field2374.method1376(var244, var241, 121);
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 73) {
            int var245 = class352.field5114.method798(false);
            int var246 = class352.field5114.method810((byte) -6);
            int var247 = class352.field5114.method798(false);
            if (class359.method2338(-117, var245)) {
                if (var246 == 2) {
                    class296.method2002(-128);
                }
                class265.field3898 = var247;
                class445.method2776((byte) 114, var247);
                class378.method2411((byte) 80, false);
                class424.method2657(class265.field3898);
                for (int var248 = 0; var248 < 100; var248++) {
                    class353.field5126[var248] = true;
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 191) {
            class429.field6106 = class352.field5114.method810((byte) -6);
            field5750 = class352.field5114.method850(false);
            while (class352.field5114.field1880 < class242.field3572) {
                class213.field3012 = class352.field5114.method837(true);
                class429.method2673(64);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 237) {
            class352.field5093 = class352.field5114.method837(true);
            class58.field769 = class352.field5114.method837(true);
            class108.field1412 = class352.field5114.method837(true);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 197) {
            String var249 = class352.field5114.method843(-88);
            int var250 = class352.field5114.method798(false);
            int var251 = class352.field5114.method809(false);
            if (class359.method2338(-125, var251)) {
                class432.method2696(var250, var249, true);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 156) {
            int var252 = class352.field5114.method822((byte) -13);
            int var253 = class352.field5114.method809(false);
            if (var253 == 65535) {
                var253 = -1;
            }
            int var254 = class352.field5114.method812(3);
            if (class359.method2338(-119, var254)) {
                class436.method2721(var253, 5, var252);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 56) {
            class199.field2843 = class352.field5114.method844(698527688);
            class213.field3012 = -1;
            class105.field1348 = class428.field6095;
            return true;
        } else if (class213.field3012 == 60) {
            int var255 = class352.field5114.method798(false);
            int var256 = class352.field5114.method837(true);
            int var257 = class352.field5114.method837(true);
            int var258 = class352.field5114.method798(false);
            int var259 = class352.field5114.method837(true);
            int var260 = class352.field5114.method837(true);
            if (class359.method2338(-123, var255)) {
                class30.method166(var259, var256, var258, arg0 - 127, var257, true, var260);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 110) {
            int var261 = class352.field5114.method809(false);
            int var262 = class352.field5114.method798(false);
            int var263 = class352.field5114.method815(true);
            int var264 = class352.field5114.method809(false);
            int var265 = class352.field5114.method857(arg0 ^ 0xFE);
            if (class359.method2338(arg0 - 121, var265)) {
                class450.method2798(var262 | var261 << 16, var264, false, 7, var263);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 153) {
            for (int var266 = 0; var266 < class243.field3596.length; var266++) {
                if (class243.field3596[var266] != null) {
                    class243.field3596[var266].field4558 = -1;
                }
            }
            for (int var267 = 0; var267 < class442.field6317.length; var267++) {
                if (class442.field6317[var267] != null) {
                    class442.field6317[var267].field4558 = -1;
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 89) {
            int var268 = class352.field5114.method812(3);
            int var269 = class352.field5114.method798(false);
            if (var269 == 65535) {
                var269 = -1;
            }
            int var270 = class352.field5114.method817(true);
            if (class359.method2338(-120, var268)) {
                class450.method2798(var269, -1, false, 1, var270);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 162) {
            class30.method167(16726);
            class320.field4690 += 32;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 186) {
            String var271 = class352.field5114.method843(-101);
            String var272 = class169.method1209(class64.method410(false, class353.method2308(29367, class352.field5114)), -105);
            class373.method2391(var271, arg0 - 2, 6, 0, var272, var271);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 79) {
            int var273 = class352.field5114.method798(false);
            int var274 = class352.field5114.method812(3);
            String var275 = class352.field5114.method843(-83);
            if (class359.method2338(-120, var274)) {
                class432.method2696(var273, var275, true);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 216) {
            class386.method2455(true, (byte) -102);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 207) {
            int var276 = class352.field5114.method798(false);
            if (class359.method2338(-127, var276)) {
                class62.method401(-25247);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 239) {
            int var277 = class352.field5114.method822((byte) -13);
            int var278 = class352.field5114.method812(3);
            class446.method2783(var277, arg0 ^ 0x53, var278);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 223) {
            int var279 = class352.field5114.method810((byte) -6);
            int var280 = class352.field5114.method810((byte) -6);
            int var281 = class352.field5114.method810((byte) -6);
            class158.field2302 = var279 >> 1;
            class181.field2555.method779(arg0 ^ 0xFFFFFFFC, class158.field2302, var280, (var279 & 0x1) == 1, var281);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 134) {
            int var282 = class352.field5114.method815(true);
            class397.field5588 = class401.field5628.method1530(var282, 3);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 4) {
            int var283 = class352.field5114.method837(true);
            boolean var284 = (var283 & 0x1) == 1;
            String var285 = class352.field5114.method843(-98);
            String var286 = class352.field5114.method843(arg0 ^ 0xFFFFFF8F);
            if (var286.equals("")) {
                var286 = var285;
            }
            String var287 = class352.field5114.method843(-81);
            String var288 = class352.field5114.method843(-87);
            if (var288.equals("")) {
                var288 = var287;
            }
            if (var284) {
                for (int var289 = 0; var289 < class417.field5994; var289++) {
                    if (class289.field4207[var289].equals(var288)) {
                        class137.field2109[var289] = var285;
                        class289.field4207[var289] = var286;
                        class434.field6200[var289] = var287;
                        class266.field3905[var289] = var288;
                        break;
                    }
                }
            } else {
                class137.field2109[class417.field5994] = var285;
                class289.field4207[class417.field5994] = var286;
                class434.field6200[class417.field5994] = var287;
                class266.field3905[class417.field5994] = var288;
                class398.field5595[class417.field5994] = class209.method1483(var283, 2) == 2;
                class417.field5994++;
            }
            class213.field3012 = -1;
            class444.field6344 = class428.field6095;
            return true;
        } else if (class213.field3012 == 221) {
            class401.field5626 = class428.field6095;
            if (class242.field3572 == 0) {
                class428.field6093 = null;
                class384.field5442 = null;
                class213.field3012 = -1;
                class224.field3349 = 0;
                class408.field5790 = null;
                return true;
            }
            class408.field5790 = class352.field5114.method843(-108);
            boolean var290 = class352.field5114.method837(true) == 1;
            if (var290) {
                class352.field5114.method843(-107);
            }
            long var291 = class352.field5114.method804(893309448);
            class384.field5442 = class228.method1586(var291, (byte) -80);
            class92.field1181 = class352.field5114.method823((byte) 109);
            int var293 = class352.field5114.method837(true);
            if (var293 == 255) {
                class213.field3012 = -1;
                return true;
            }
            class224.field3349 = var293;
            class296[] var294 = new class296[100];
            for (int var295 = 0; var295 < class224.field3349; var295++) {
                var294[var295] = new class296();
                var294[var295].field4281 = class352.field5114.method843(-127);
                boolean var301 = class352.field5114.method837(true) == 1;
                if (var301) {
                    var294[var295].field4273 = class352.field5114.method843(arg0 ^ 0xFFFFFFA3);
                } else {
                    var294[var295].field4273 = var294[var295].field4281;
                }
                var294[var295].field4280 = class352.field5114.method798(false);
                var294[var295].field4276 = class352.field5114.method823((byte) 114);
                var294[var295].field4279 = class352.field5114.method843(-77);
                if (var294[var295].field4273.equals(class181.field2555.field1790)) {
                    class382.field5423 = var294[var295].field4276;
                }
            }
            boolean var296 = false;
            int var297 = class224.field3349;
            while (var297 > 0) {
                boolean var298 = true;
                var297--;
                for (int var299 = 0; var299 < var297; var299++) {
                    if (var294[var299].field4281.compareTo(var294[var299 + 1].field4281) > 0) {
                        class296 var300 = var294[var299];
                        var294[var299] = var294[var299 + 1];
                        var294[var299 + 1] = var300;
                        var298 = false;
                    }
                }
                if (var298) {
                    break;
                }
            }
            class213.field3012 = -1;
            class428.field6093 = var294;
            return true;
        } else if (class213.field3012 == 208) {
            int var302 = class352.field5114.method798(false);
            int var303 = class352.field5114.method815(true);
            if (class359.method2338(-120, var302)) {
                class253 var304 = (class253) class318.field4662.method1373((long) var303, -117);
                if (var304 != null) {
                    class102.method596(true, true, var304, false);
                }
                if (class85.field1096 != null) {
                    class245.method1701(class85.field1096, (byte) -94);
                    class85.field1096 = null;
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 115) {
            if (class242.field3572 == 0) {
                class26.field318 = class3.field26.method2284((byte) -46, class309.field4497);
            } else {
                class26.field318 = class352.field5114.method843(-115);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 135) {
            boolean var305 = class352.field5114.method837(true) == 1;
            String var306 = class352.field5114.method843(-93);
            String var307 = var306;
            if (var305) {
                var307 = class352.field5114.method843(-95);
            }
            long var308 = class352.field5114.method804(arg0 ^ 0x353ED209);
            long var310 = (long) class352.field5114.method798(false);
            long var312 = (long) class352.field5114.method839((byte) -92);
            int var314 = class352.field5114.method837(true);
            int var315 = class352.field5114.method798(false);
            long var316 = (var310 << 32) + var312;
            boolean var318 = false;
            int var319 = 0;
            while (true) {
                if (var319 >= 100) {
                    if (var314 <= 1 && class101.method591(98, var307)) {
                        var318 = true;
                    }
                    break;
                }
                if (class127.field1764[var319] == var316) {
                    var318 = true;
                    break;
                }
                var319++;
            }
            if (!var318 && class102.field1283 == 0) {
                class127.field1764[class242.field3574] = var316;
                class242.field3574 = (class242.field3574 + 1) % 100;
                String var320 = class23.method126(32767, var315).method394(class352.field5114, 80);
                if (var314 == 2) {
                    class186.method1333(arg0 - 1, 20, class141.method1065((byte) -94, var308), var320, "<img=1>" + var307, var315, "<img=1>" + var306, 0);
                } else if (var314 == 1) {
                    class186.method1333(0, 20, class141.method1065((byte) 64, var308), var320, "<img=0>" + var307, var315, "<img=0>" + var306, 0);
                } else {
                    class186.method1333(0, 20, class141.method1065((byte) -86, var308), var320, var307, var315, var306, 0);
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 206) {
            int var321 = class352.field5114.method817(true);
            int var322 = class352.field5114.method812(3);
            int var323 = class352.field5114.method844(698527688);
            int var324 = class352.field5114.method824(false);
            if (class359.method2338(-127, var322)) {
                class127.method770(arg0 + 10, var323, var321, var324);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 94) {
            int var325 = class352.field5114.method822((byte) -13);
            int var326 = class352.field5114.method857(255);
            if (class359.method2338(-126, var326)) {
                class450.method2798(-1, -1, false, 3, var325);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 101) {
            class120.field1623 = class352.field5114.method837(true);
            class213.field3012 = -1;
            class444.field6344 = class428.field6095;
            return true;
        } else if (class213.field3012 == 109) {
            String var327 = class352.field5114.method843(-98);
            boolean var328 = class352.field5114.method837(true) == 1;
            String var329;
            if (var328) {
                var329 = class352.field5114.method843(-77);
            } else {
                var329 = var327;
            }
            int var330 = class352.field5114.method798(false);
            byte var331 = class352.field5114.method823((byte) 110);
            boolean var332 = false;
            if (var331 == -128) {
                var332 = true;
            }
            if (var332) {
                if (class224.field3349 == 0) {
                    class213.field3012 = -1;
                    return true;
                }
                boolean var333 = false;
                int var334;
                for (var334 = 0; var334 < class224.field3349 && (!class428.field6093[var334].field4273.equals(var329) || class428.field6093[var334].field4280 != var330); var334++) {
                }
                if (class224.field3349 > var334) {
                    while (var334 < class224.field3349 - 1) {
                        class428.field6093[var334] = class428.field6093[var334 + 1];
                        var334++;
                    }
                    class224.field3349--;
                    class428.field6093[class224.field3349] = null;
                }
            } else {
                String var335 = class352.field5114.method843(-108);
                class296 var336 = new class296();
                var336.field4273 = var329;
                var336.field4279 = var335;
                var336.field4281 = var327;
                var336.field4280 = var330;
                var336.field4276 = var331;
                int var337;
                for (var337 = class224.field3349 - 1; var337 >= 0; var337--) {
                    int var338 = class428.field6093[var337].field4273.compareTo(var336.field4273);
                    if (var338 == 0) {
                        class428.field6093[var337].field4280 = var330;
                        class428.field6093[var337].field4276 = var331;
                        class428.field6093[var337].field4279 = var335;
                        if (var329.equals(class181.field2555.field1790)) {
                            class382.field5423 = var331;
                        }
                        class213.field3012 = -1;
                        class401.field5626 = class428.field6095;
                        return true;
                    }
                    if (var338 < 0) {
                        break;
                    }
                }
                if (class224.field3349 >= class428.field6093.length) {
                    class213.field3012 = -1;
                    return true;
                }
                for (int var339 = class224.field3349 - 1; var339 > var337; var339--) {
                    class428.field6093[var339 + 1] = class428.field6093[var339];
                }
                if (class224.field3349 == 0) {
                    class428.field6093 = new class296[100];
                }
                class428.field6093[var337 + 1] = var336;
                class224.field3349++;
                if (var329.equals(class181.field2555.field1790)) {
                    class382.field5423 = var331;
                }
            }
            class401.field5626 = class428.field6095;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 104) {
            int var340 = class352.field5114.method798(false);
            int var341 = class352.field5114.method817(true);
            String var342 = class352.field5114.method843(-116);
            if (class359.method2338(arg0 - 129, var340)) {
                class40.method259(var342, (byte) -106, var341);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 6) {
            int var343 = class352.field5114.method857(255);
            int var344 = class352.field5114.method850(false);
            boolean var345 = (var344 & 0x1) == 1;
            class127.method772(-110, var343, var345);
            class435.field6213[class209.method1483(31, class1.field5++)] = var343;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 139 || class213.field3012 == 106 || class213.field3012 == 177 || class213.field3012 == 214 || class213.field3012 == 55 || class213.field3012 == 155 || class213.field3012 == 67 || class213.field3012 == 130 || class213.field3012 == 188 || class213.field3012 == 225 || class213.field3012 == 62 || class213.field3012 == 160 || class213.field3012 == 13 || class213.field3012 == 111 || class213.field3012 == 165) {
            class429.method2673(64);
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 107) {
            int var346 = class352.field5114.method854(3944);
            int var347 = class352.field5114.method815(true);
            int var348 = class352.field5114.method837(true);
            String var349 = "";
            String var350 = var349;
            if ((var348 & 0x1) != 0) {
                var349 = class352.field5114.method843(-95);
                if ((var348 & 0x2) == 0) {
                    var350 = var349;
                } else {
                    var350 = class352.field5114.method843(-124);
                }
            }
            String var351 = class352.field5114.method843(-75);
            if (var346 == 99) {
                class295.method1999((byte) -115, var351);
            } else if (var350.equals("") || !class101.method591(101, var350)) {
                class373.method2391(var350, -1, var346, var347, var351, var349);
            } else {
                class213.field3012 = -1;
                return true;
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 105) {
            int var352 = class352.field5114.method848(255);
            int var353 = class352.field5114.method809(false);
            if (class359.method2338(-120, var353)) {
                class20.field264 = var352;
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 59) {
            int var354 = class352.field5114.method809(false);
            int var355 = class352.field5114.method812(3);
            int var356 = class352.field5114.method812(3);
            if (class359.method2338(-126, var355)) {
                class137.method1049(arg0 ^ 0xFFFFFFFE, 0, var354, var356);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 54) {
            if (class265.field3898 != -1) {
                class23.method122(0, -27431, class265.field3898);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 195) {
            boolean var357 = class352.field5114.method837(true) == 1;
            String var358 = class352.field5114.method843(-85);
            String var359 = var358;
            if (var357) {
                var359 = class352.field5114.method843(arg0 ^ 0xFFFFFF8A);
            }
            long var360 = (long) class352.field5114.method798(false);
            long var362 = (long) class352.field5114.method839((byte) -92);
            int var364 = class352.field5114.method837(true);
            long var365 = (var360 << 32) + var362;
            boolean var367 = false;
            int var368 = 0;
            while (true) {
                if (var368 >= 100) {
                    if (var364 <= 1) {
                        if (!(!class138.field2117 || class335.field4874) || class148.field2211) {
                            var367 = true;
                        } else if (class101.method591(94, var359)) {
                            var367 = true;
                        }
                    }
                    break;
                }
                if (class127.field1764[var368] == var365) {
                    var367 = true;
                    break;
                }
                var368++;
            }
            if (!var367 && class102.field1283 == 0) {
                class127.field1764[class242.field3574] = var365;
                class242.field3574 = (class242.field3574 + 1) % 100;
                String var369 = class169.method1209(class64.method410(false, class353.method2308(arg0 ^ 0x72B6, class352.field5114)), 64);
                if (var364 == 2) {
                    class186.method1333(0, 7, (String) null, var369, "<img=1>" + var359, -1, "<img=1>" + var358, 0);
                } else if (var364 == 1) {
                    class186.method1333(0, 7, (String) null, var369, "<img=0>" + var359, -1, "<img=0>" + var358, 0);
                } else {
                    class186.method1333(0, 3, (String) null, var369, var359, -1, var358, 0);
                }
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 124) {
            int var370 = class352.field5114.method837(true);
            int var371 = class352.field5114.method822((byte) -13);
            int var372 = class352.field5114.method848(255);
            class448.field6396[var370] = var371;
            class276.field3978[var370] = var372;
            class435.field6211[var370] = 1;
            int var373 = class9.field119[var370] - 1;
            for (int var374 = 0; var374 < var373; var374++) {
                if (class310.field4498[var374] <= var371) {
                    class435.field6211[var370] = var374 + 2;
                }
            }
            class297.field4329[class209.method1483(31, class355.field5140++)] = var370;
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 42) {
            class185.method1327((byte) 64);
            class213.field3012 = -1;
            return false;
        } else if (class213.field3012 == 169) {
            int var375 = class352.field5114.method798(false);
            if (class359.method2338(-127, var375)) {
                class119.method730(13888);
            }
            class213.field3012 = -1;
            return true;
        } else if (class213.field3012 == 236) {
            int var376 = class352.field5114.method857(255);
            int var377 = class352.field5114.method814((byte) 83);
            int var378 = class352.field5114.method812(arg0 ^ 0x2);
            if (class359.method2338(arg0 - 126, var378)) {
                class426.method2665(var376, 6, var377);
            }
            class213.field3012 = -1;
            return true;
        } else {
            class334.method2191(true, "T1 - " + class213.field3012 + "," + class13.field189 + "," + class324.field4719 + " - " + class242.field3572, (Throwable) null);
            class185.method1327((byte) 64);
            return true;
        }
    }

    @OriginalMember(owner = "client!ar", name = "run", descriptor = "()V")
    public final void run() {
        field5775++;
        try {
            label116: {
                if (class219.field3143 != null) {
                    String var1 = class219.field3143.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class219.field3144;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2557("wrongjava", true);
                            break label116;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class219.field3144 == null || class219.field3144.equals("1.4.2"))) {
                        this.method2557("wrongjava", true);
                        break label116;
                    }
                }
                if (class219.field3144 != null && class219.field3144.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class219.field3144.length() > var3) {
                        char var5 = class219.field3144.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class346.field5007 = true;
                    }
                }
                if (class401.field5628.field3154 != null) {
                    Method var6 = class219.field3158;
                    if (var6 != null) {
                        try {
                            var6.invoke(class401.field5628.field3154, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class57.method372(-28908);
                class79.method467((byte) -44);
                this.method2566(65535);
                this.method1172(2);
                class70.field933 = class221.method1557((byte) 124);
                this.method2564((byte) 83);
                while (class397.field5589 == 0L || class18.method107(-16145) < class397.field5589) {
                    class355.field5144 = class70.field933.method194(class390.field5488, 81);
                    for (int var7 = 0; var7 < class355.field5144; var7++) {
                        this.method2569(0);
                    }
                    this.method2562((byte) -5);
                    class129.method792(class117.field1588, class401.field5628, 25);
                }
            }
        } catch (Exception var10) {
            class334.method2191(true, (String) null, var10);
            this.method2557("crash", true);
        }
        this.method2555(true, -125);
    }

    @OriginalMember(owner = "client!ar", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5768++;
        class223.field3345 = true;
        class240.field3543 = true;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V")
    public final void method2564(byte arg0) {
        field5767++;
        if (!this.field5771) {
            try {
                class156 var2 = class401.field5628.method1547(0, class125.field1679.getClass());
                while (var2.field2298 == 0) {
                    class259.method1790((byte) -92, 100L);
                }
                if (var2.field2295 != null) {
                    throw (Throwable) var2.field2295;
                }
                jagmisc.init();
                this.field5771 = true;
                class70.field933 = class221.method1557((byte) 124);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != 83) {
            this.field5771 = false;
        }
    }

    @OriginalMember(owner = "client!ar", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field5765++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;ZIIIIZI)V")
    public final void method2565(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field5758++;
        try {
            class19.field251 = 0;
            class238.field3520 = 0;
            class24.field307 = arg7;
            class261.field3865 = arg7;
            class316.field4643 = arg4;
            class338.field4901 = arg4;
            class233.field3443 = arg2;
            class125.field1679 = this;
            class369.field5255 = new Frame();
            class369.field5255.setTitle("Jagex");
            class369.field5255.setResizable(arg6);
            class369.field5255.addWindowListener(this);
            class369.field5255.setVisible(true);
            class369.field5255.toFront();
            Insets var9 = class369.field5255.getInsets();
            class369.field5255.setSize(class261.field3865 + var9.left + var9.right, class338.field4901 - -var9.bottom + var9.top);
            class138.field2116 = class401.field5628 = new class219((Applet) null, arg3, arg0, arg5);
            class156 var10 = class401.field5628.method1538(1, 56, this);
            while (var10.field2298 == 0) {
                class259.method1790((byte) -106, 10L);
            }
        } catch (Exception var12) {
            class334.method2191(arg6, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!ar", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field5766++;
        if (class369.field5255 == null) {
            return class401.field5628 == null || class401.field5628.field3154 == this ? super.getCodeBase() : class401.field5628.field3154.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V")
    public final synchronized void method2566(int arg0) {
        field5747++;
        if (class117.field1588 != null) {
            class117.field1588.removeFocusListener(this);
            class117.field1588.getParent().remove(class117.field1588);
        }
        Container var2;
        if (class213.field3016 != null) {
            var2 = class213.field3016;
        } else if (class369.field5255 == null) {
            var2 = class401.field5628.field3154;
        } else {
            var2 = class369.field5255;
        }
        var2.setLayout((LayoutManager) null);
        class117.field1588 = new class411(this);
        var2.add(class117.field1588);
        class117.field1588.setSize(class24.field307, class316.field4643);
        class117.field1588.setVisible(true);
        if (class369.field5255 == var2) {
            Insets var3 = class369.field5255.getInsets();
            class117.field1588.setLocation(var3.left + class238.field3520, class19.field251 + var3.top);
        } else {
            class117.field1588.setLocation(class238.field3520, class19.field251);
        }
        class117.field1588.addFocusListener(this);
        class117.field1588.requestFocus();
        class223.field3345 = true;
        class111.field1437 = true;
        class240.field3543 = true;
        class34.field422 = false;
        class233.field3449 = class18.method107(-16145);
        if (arg0 != 65535) {
            field5735 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)V")
    public static final void method2567(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            class423.field6035 = null;
        }
        class122.field1639 = 99;
        class10.field130 = new byte[arg1][class80.field1034][class381.field5414];
        class267.field3914 = new int[class381.field5414];
        class415.field5929 = new int[class381.field5414];
        class284.field4138 = new byte[arg1][class80.field1034 + 1][class381.field5414 + 1];
        if (arg0 != -1863581283) {
            method2556(false);
        }
        class296.field4284 = new int[5];
        class207.field2975 = new int[arg1][class80.field1034 + 1][class381.field5414 + 1];
        field5752++;
        class127.field1762 = new int[class381.field5414];
        class214.field3049 = new byte[arg1][class80.field1034][class381.field5414];
        class336.field4877 = new byte[arg1][class80.field1034][class381.field5414];
        class246.field3678 = new byte[arg1][class80.field1034][class381.field5414];
        class209.field2993 = new int[class381.field5414];
        class247.field3701 = new int[class381.field5414];
    }

    @OriginalMember(owner = "client!ar", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field5748++;
    }

    @OriginalMember(owner = "client!ar", name = "stop", descriptor = "()V")
    public final void stop() {
        field5736++;
        if (class125.field1679 == this && !class135.field2088) {
            class397.field5589 = class18.method107(-16145) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ar", name = "providesignlink", descriptor = "(Lml;)V")
    public static final void providesignlink(class219 arg0) {
        field5776++;
        class401.field5628 = arg0;
        class138.field2116 = arg0;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)Z")
    public static final boolean method2568(boolean arg0) {
        for (int var1 = class180.field2546; var1 < class243.field3603; var1++) {
            class74[][] var2 = class385.field5449[var1];
            for (int var3 = -class150.field2249; var3 <= 0; var3++) {
                int var4 = class65.field891 + var3;
                int var5 = class65.field891 - var3;
                if (var4 >= class25.field308 || var5 < class183.field2589) {
                    for (int var6 = -class150.field2249; var6 <= 0; var6++) {
                        int var7 = class333.field4842 + var6;
                        int var8 = class333.field4842 - var6;
                        if (var4 >= class25.field308) {
                            if (var7 >= class28.field353) {
                                class74 var9 = var2[var4][var7];
                                if (var9 != null && var9.field972) {
                                    class429.field6099 = arg0;
                                    class312.field4615.method1912(var9, false);
                                    class312.field4615.method1913(true);
                                }
                            }
                            if (var8 < class441.field6306) {
                                class74 var10 = var2[var4][var8];
                                if (var10 != null && var10.field972) {
                                    class429.field6099 = arg0;
                                    class312.field4615.method1912(var10, false);
                                    class312.field4615.method1913(true);
                                }
                            }
                        }
                        if (var5 < class183.field2589) {
                            if (var7 >= class28.field353) {
                                class74 var11 = var2[var5][var7];
                                if (var11 != null && var11.field972) {
                                    class429.field6099 = arg0;
                                    class312.field4615.method1912(var11, false);
                                    class312.field4615.method1913(true);
                                }
                            }
                            if (var8 < class441.field6306) {
                                class74 var12 = var2[var5][var8];
                                if (var12 != null && var12.field972) {
                                    class429.field6099 = arg0;
                                    class312.field4615.method1912(var12, false);
                                    class312.field4615.method1913(true);
                                }
                            }
                        }
                        if (class450.field6440 == 0) {
                            if (class369.field5257) {
                                class312.field4615.method1915(24, (byte) -19);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V")
    private final void method2569(int arg0) {
        field5757++;
        long var2 = class18.method107(-16145);
        long var4 = class235.field3464[class353.field5121];
        class235.field3464[class353.field5121] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class353.field5121 = class353.field5121 + 1 & 0x1F;
        synchronized (this) {
            class111.field1437 = class223.field3345;
            if (arg0 != 0) {
                this.windowDeactivated((WindowEvent) null);
            }
        }
        this.method1186((byte) 44);
    }

    @OriginalMember(owner = "client!ar", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field5762++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lfa;I)V")
    public static final void method2570(class128 arg0, int arg1) {
        field5754++;
        if (arg1 != 0) {
            method2560(-56);
        }
        class13 var2 = (class13) class96.field1233.method1373((long) arg0.field4514, arg1 + 120);
        if (var2 == null) {
            class376.method2402(arg0.field4601[0], (class446) null, class158.field2302, (class282) null, true, arg0, 0, arg0.field4595[0]);
        } else {
            var2.method71(true);
        }
    }

    @OriginalMember(owner = "client!ar", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field5760++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ar", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field5756++;
        if (class125.field1679 == this && !class135.field2088) {
            class397.field5589 = class18.method107(-16145);
            class259.method1790((byte) -104, 5000L);
            class138.field2116 = null;
            this.method2555(false, -85);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIZ)V")
    public final void method2571(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5755++;
        try {
            if (class125.field1679 == null) {
                class238.field3520 = 0;
                class19.field251 = 0;
                class233.field3443 = arg2;
                class125.field1679 = this;
                class24.field307 = arg3;
                class261.field3865 = arg3;
                class316.field4643 = arg0;
                class338.field4901 = arg0;
                if (!arg4) {
                    if (class401.field5628 == null) {
                        class138.field2116 = class401.field5628 = new class219(this, arg1, (String) null, 0);
                    }
                    class156 var6 = class401.field5628.method1538(1, 99, this);
                    while (var6.field2298 == 0) {
                        class259.method1790((byte) -71, 10L);
                    }
                }
            } else {
                class229.field3399++;
                if (class229.field3399 >= 3) {
                    this.method2557("alreadyloaded", !arg4);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class334.method2191(true, (String) null, var8);
            this.method2557("crash", true);
        }
    }

    @OriginalMember(owner = "client!ar", name = "start", descriptor = "()V")
    public final void start() {
        field5741++;
        if (class125.field1679 == this && !class135.field2088) {
            class397.field5589 = 0L;
        }
    }

    @OriginalMember(owner = "client!ar", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field5753++;
        if (class369.field5255 == null) {
            return class401.field5628 == null || class401.field5628.field3154 == this ? super.getDocumentBase() : class401.field5628.field3154.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "(I)V")
    public abstract void method1172(int arg0);
}
