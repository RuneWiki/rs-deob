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

@OriginalClass("client!va")
public abstract class class34 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Z")
    private boolean field773 = false;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Ljd;")
    private static class86 field763 = class122.method868(" is already on your ignore list)3", true);

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Ljd;")
    public static class86 field776 = field763;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "[J")
    public static long[] field783 = new long[32];

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method248(String arg0, int arg1) throws ClassNotFoundException {
        field782++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg1 != 1) {
                field763 = null;
            }
            if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBILjava/lang/String;I)V")
    public final void method249(int arg0, int arg1, int arg2, byte arg3, int arg4, String arg5, int arg6) {
        field769++;
        if (arg3 <= 11) {
            field776 = null;
        }
        try {
            class213.field3858 = 0;
            class248.field4414 = arg4;
            class200.field3571 = arg4;
            class4.field53 = arg1;
            class255.field4540 = arg1;
            class13.field407 = arg6;
            class168.field3112 = this;
            class183.field3263 = 0;
            class138.field2627 = new Frame();
            class138.field2627.setTitle("Jagex");
            class138.field2627.setResizable(true);
            class138.field2627.addWindowListener(this);
            class138.field2627.setVisible(true);
            class138.field2627.toFront();
            Insets var8 = class138.field2627.getInsets();
            class138.field2627.setSize(class255.field4540 + var8.left + var8.right, class200.field3571 + var8.top + var8.bottom);
            class66.field1303 = class157.field2954 = new class254((Applet) null, arg2, arg5, arg0);
            class26 var9 = class157.field2954.method1724(true, 1, this);
            while (var9.field613 == 0) {
                class91.method677(0, 10L);
            }
        } catch (Exception var11) {
            class143.method1018(var11, (String) null, 40);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method250(int arg0) {
        field783 = null;
        if (arg0 != 31) {
            field784 = 84;
        }
        field776 = null;
        field763 = null;
    }

    @OriginalMember(owner = "client!va", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field789++;
        if (class138.field2627 == null) {
            return class157.field2954 == null || class157.field2954.field4514 == this ? super.getAppletContext() : class157.field2954.field4514.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    private final void method251(boolean arg0) {
        field780++;
        long var2 = class253.method1711((byte) -73);
        long var4 = class173.field3176[class109.field2084];
        class173.field3176[class109.field2084] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class109.field2084 = class109.field2084 + 1 & 0x1F;
        synchronized (this) {
            class228.field4130 = class162.field3042;
        }
        this.method257(arg0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[I)[I")
    public static final int[] method252(int arg0, int[] arg1) {
        field775++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            int var3 = 27 / ((arg0 - 79) / 35);
            class250.method1693(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    private final void method253(int arg0) {
        field771++;
        long var2 = class253.method1711((byte) -124);
        long var4 = field783[class68.field1340];
        if (arg0 >= -83) {
            return;
        }
        field783[class68.field1340] = var2;
        class68.field1340 = class68.field1340 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class97.field1929 = ((var6 >> 1) + 32000) / var6;
        }
        if (class258.field4591++ > 50) {
            class136.field2603 = true;
            class258.field4591 -= 50;
            class50.field1057.setSize(class4.field53, class248.field4414);
            class50.field1057.setVisible(true);
            if (class138.field2627 != null && class88.field1746 == null) {
                Insets var7 = class138.field2627.getInsets();
                class50.field1057.setLocation(class183.field3263 + var7.left, var7.top - -class213.field3858);
            } else {
                class50.field1057.setLocation(class183.field3263, class213.field3858);
            }
        }
        this.method254(29);
    }

    @OriginalMember(owner = "client!va", name = "stop", descriptor = "()V")
    public final void stop() {
        field756++;
        if (class168.field3112 == this && !class87.field1721) {
            class228.field4144 = class253.method1711((byte) -99) + 4000L;
        }
    }

    @OriginalMember(owner = "client!va", name = "providesignlink", descriptor = "(Lof;)V")
    public static final void providesignlink(class254 arg0) {
        class157.field2954 = arg0;
        class66.field1303 = arg0;
        field765++;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public abstract void method254(int arg0);

    @OriginalMember(owner = "client!va", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field757++;
    }

    @OriginalMember(owner = "client!va", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field778++;
        class162.field3042 = true;
        class136.field2603 = true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Lal;")
    public static final class221 method255(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4435;
    }

    @OriginalMember(owner = "client!va", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field787++;
    }

    @OriginalMember(owner = "client!va", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
    private final void method256(boolean arg0, int arg1) {
        field767++;
        synchronized (this) {
            if (arg1 != -1) {
                return;
            }
            if (class87.field1721) {
                return;
            }
            class87.field1721 = true;
        }
        if (class157.field2954.field4514 != null) {
            class157.field2954.field4514.destroy();
        }
        try {
            this.method258(5);
        } catch (Exception var11) {
        }
        if (class50.field1057 != null) {
            try {
                class50.field1057.removeFocusListener(this);
                class50.field1057.getParent().remove(class50.field1057);
            } catch (Exception var10) {
            }
        }
        if (class157.field2954 != null) {
            try {
                class157.field2954.method1721((byte) 102);
            } catch (Exception var9) {
            }
        }
        this.method266(1338);
        if (class138.field2627 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!va", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field786++;
    }

    @OriginalMember(owner = "client!va", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field761++;
        if (class138.field2627 == null) {
            return class157.field2954 == null || class157.field2954.field4514 == this ? super.getParameter(arg0) : class157.field2954.field4514.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field768++;
        if (class168.field3112 == this && !class87.field1721) {
            class228.field4144 = class253.method1711((byte) -46);
            class91.method677(0, 5000L);
            class66.field1303 = null;
            this.method256(false, -1);
        }
    }

    @OriginalMember(owner = "client!va", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field772++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public abstract void method257(boolean arg0);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public abstract void method258(int arg0);

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)Z")
    public final boolean method259(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field754++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 <= 123) {
                field776 = null;
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
                this.method260("invalidhost", -58);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field785++;
    }

    @OriginalMember(owner = "client!va", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field779++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public final void method260(String arg0, int arg1) {
        field774++;
        if (this.field773) {
            return;
        }
        this.field773 = true;
        if (arg1 != -58) {
            return;
        }
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!va", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field781++;
        if (class138.field2627 == null) {
            return class157.field2954 == null || class157.field2954.field4514 == this ? super.getCodeBase() : class157.field2954.field4514.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field760++;
        if (class168.field3112 != this || class87.field1721) {
            return;
        }
        class136.field2603 = true;
        if (class188.field3329 && (class253.method1711((byte) -95) - class233.field4214) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class255.field4540 && class200.field3571 <= var2.height) {
                class144.field2739 = true;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field766++;
        if (class138.field2627 == null) {
            return class157.field2954 == null || class157.field2954.field4514 == this ? super.getDocumentBase() : class157.field2954.field4514.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIILeh;Leh;IIIIJ)V")
    public static final void method261(int arg0, int arg1, int arg2, int arg3, class80 arg4, class80 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class258 var12 = new class258();
        var12.field4576 = arg10;
        var12.field4587 = arg1 * 128 + 64;
        var12.field4582 = arg2 * 128 + 64;
        var12.field4584 = arg3;
        var12.field4590 = arg4;
        var12.field4583 = arg5;
        var12.field4577 = arg6;
        var12.field4579 = arg7;
        var12.field4572 = arg8;
        var12.field4575 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class248.field4406[var13][arg1][arg2] == null) {
                class248.field4406[var13][arg1][arg2] = new class249(var13, arg1, arg2);
            }
        }
        class248.field4406[arg0][arg1][arg2].field4433 = var12;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
    public final void method262(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field770++;
        if (arg0 != 14896) {
            field763 = null;
        }
        try {
            if (class168.field3112 == null) {
                class213.field3858 = 0;
                class248.field4414 = arg2;
                class200.field3571 = arg2;
                class168.field3112 = this;
                class13.field407 = arg1;
                class183.field3263 = 0;
                class4.field53 = arg3;
                class255.field4540 = arg3;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class157.field2954 == null) {
                    class66.field1303 = class157.field2954 = new class254(this, arg4, (String) null, 0);
                }
                class26 var7 = class157.field2954.method1724(true, 1, this);
                while (var7.field613 == 0) {
                    class91.method677(0, 10L);
                }
            } else {
                class27.field626++;
                if (class27.field626 >= 3) {
                    this.method260("alreadyloaded", arg0 - 14954);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class143.method1018(var9, (String) null, 37);
            this.method260("crash", -58);
        }
    }

    @OriginalMember(owner = "client!va", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field788++;
    }

    @OriginalMember(owner = "client!va", name = "start", descriptor = "()V")
    public final void start() {
        field777++;
        if (class168.field3112 == this && !class87.field1721) {
            class228.field4144 = 0L;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
    public static final void method263(int arg0, boolean arg1) {
        field759++;
        class214.field3867 = arg1;
        if (class214.field3867) {
            int var15 = class168.field3102.method1413(arg0 ^ 0x2B3B);
            int var16 = class168.field3102.method1401(2080652896);
            int var17 = class168.field3102.method1410(-128);
            int var18 = class168.field3102.method1389((byte) 42);
            int var19 = class168.field3102.method1410(-104);
            class168.field3102.method1358((byte) 27);
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class168.field3102.method1352(1, arg0 - 33);
                        if (var37 == 1) {
                            class181.field3257[var20][var35][var36] = class168.field3102.method1352(26, class177.method1249(arg0, -24));
                        } else {
                            class181.field3257[var20][var35][var36] = -1;
                        }
                    }
                }
            }
            class168.field3102.method1359(121);
            int var21 = (class112.field2143 - class168.field3102.field3565) / 16;
            class171.field3165 = new int[var21][4];
            for (int var22 = 0; var22 < var21; var22++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class171.field3165[var22][var34] = class168.field3102.method1414(-16777216);
                }
            }
            class168.field3103 = new int[var21];
            class164.field3086 = new byte[var21][];
            class117.field2260 = null;
            class257.field4569 = null;
            class51.field1073 = new byte[var21][];
            class238.field4295 = new int[var21];
            class84.field1641 = new int[var21];
            class48.field1037 = new int[var21];
            class169.field3116 = new int[var21];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class181.field3257[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = (var27 & 0xFFC1E1) >> 14;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class168.field3103[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class168.field3103[var23] = var30;
                                int var32 = var30 >> 8 & 0xFF;
                                int var33 = var30 & 0xFF;
                                class48.field1037[var23] = class149.field2777.method1079(-101, class109.method783(2, new class86[] { class111.field2119, class4.method26(false, var32), class67.field1319, class4.method26(false, var33) }));
                                class84.field1641[var23] = class149.field2777.method1079(-60, class109.method783(2, new class86[] { class234.field4222, class4.method26(false, var32), class67.field1319, class4.method26(false, var33) }));
                                class169.field3116[var23] = class149.field2777.method1079(-26, class109.method783(2, new class86[] { class194.field3471, class4.method26(false, var32), class67.field1319, class4.method26(false, var33) }));
                                class238.field4295[var23] = class149.field2777.method1079(-40, class109.method783(class177.method1249(arg0, -60), new class86[] { class171.field3156, class4.method26(false, var32), class67.field1319, class4.method26(false, var33) }));
                                var23++;
                            }
                        }
                    }
                }
            }
            class184.method1271(var19, -110, var18, var17, false, var15, var16);
        } else {
            int var2 = class168.field3102.method1389((byte) 40);
            int var3 = class168.field3102.method1401(2080652896);
            int var4 = class168.field3102.method1410(-82);
            int var5 = class168.field3102.method1383(116);
            int var6 = (class112.field2143 - class168.field3102.field3565) / 16;
            class171.field3165 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class171.field3165[var7][var14] = class168.field3102.method1386(-4603);
                }
            }
            int var8 = class168.field3102.method1413(-11011);
            class84.field1641 = new int[var6];
            class238.field4295 = new int[var6];
            boolean var9 = false;
            class257.field4569 = null;
            if ((var8 / 8 == 48 || (var8 / 8) == 49) && (var3 / 8) == 48) {
                var9 = true;
            }
            class168.field3103 = new int[var6];
            class51.field1073 = new byte[var6][];
            class169.field3116 = new int[var6];
            class164.field3086 = new byte[var6][];
            class48.field1037 = new int[var6];
            class117.field2260 = null;
            int var10 = 0;
            if ((var8 / 8) == 48 && (var3 / 8) == 148) {
                var9 = true;
            }
            for (int var11 = (var8 - 6) / 8; var11 <= ((var8 + 6) / 8); var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= ((var3 + 6) / 8); var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (var9 && var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || !(var11 != 49 || var12 != 47)) {
                        class168.field3103[var10] = var13;
                        class48.field1037[var10] = -1;
                        class84.field1641[var10] = -1;
                        class169.field3116[var10] = -1;
                        class238.field4295[var10] = -1;
                    } else {
                        class168.field3103[var10] = var13;
                        class48.field1037[var10] = class149.field2777.method1079(class177.method1249(arg0, 119), class109.method783(2, new class86[] { class111.field2119, class4.method26(false, var11), class67.field1319, class4.method26(false, var12) }));
                        class84.field1641[var10] = class149.field2777.method1079(-35, class109.method783(2, new class86[] { class234.field4222, class4.method26(false, var11), class67.field1319, class4.method26(false, var12) }));
                        class169.field3116[var10] = class149.field2777.method1079(-53, class109.method783(2, new class86[] { class194.field3471, class4.method26(false, var11), class67.field1319, class4.method26(false, var12) }));
                        class238.field4295[var10] = class149.field2777.method1079(class177.method1249(arg0, 121), class109.method783(2, new class86[] { class171.field3156, class4.method26(false, var11), class67.field1319, class4.method26(false, var12) }));
                    }
                    var10++;
                }
            }
            class184.method1271(var3, -114, var2, var8, false, var4, var5);
        }
        if (arg0 != -58) {
            providesignlink((class254) null);
        }
    }

    @OriginalMember(owner = "client!va", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class162.field3042 = false;
        field758++;
    }

    @OriginalMember(owner = "client!va", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field764++;
    }

    @OriginalMember(owner = "client!va", name = "run", descriptor = "()V")
    public final void run() {
        field755++;
        try {
            if (class254.field4513 != null) {
                String var1 = class254.field4513.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class254.field4510;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method260("wrongjava", -58);
                        return;
                    }
                    class69.field1404 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class254.field4510 == null || class254.field4510.equals("1.4.2"))) {
                    this.method260("wrongjava", -58);
                    return;
                }
            }
            if (class254.field4510 != null && class254.field4510.startsWith("1.")) {
                int var3 = 0;
                for (int var4 = 2; class254.field4510.length() > var4; var4++) {
                    char var5 = class254.field4510.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class188.field3329 = true;
                }
            }
            if (class157.field2954.field4514 != null) {
                Method var6 = class254.field4526;
                if (var6 != null) {
                    try {
                        var6.invoke(class157.field2954.field4514, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method264(-124);
            class107.field2055 = class102.method734(class50.field1057, (byte) 108, class248.field4414, class4.field53);
            this.method265(24);
            class135.field2588 = class258.method1746(-25672);
            while (class228.field4144 == 0L || class228.field4144 > class253.method1711((byte) -29)) {
                class274.field4812 = class135.field2588.method23((byte) -53, class69.field1395, class69.field1404);
                for (int var7 = 0; var7 < class274.field4812; var7++) {
                    this.method251(false);
                }
                this.method253(-95);
                class97.method705(class50.field1057, class157.field2954, -4367);
            }
        } catch (Exception var10) {
            class143.method1018(var10, (String) null, 92);
            this.method260("crash", -58);
        }
        this.method256(true, -1);
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
    public final synchronized void method264(int arg0) {
        if (class50.field1057 != null) {
            class50.field1057.removeFocusListener(this);
            class50.field1057.getParent().remove(class50.field1057);
        }
        int var2 = 38 / ((arg0 + 74) / 40);
        Container var3;
        if (class88.field1746 != null) {
            var3 = class88.field1746;
        } else if (class138.field2627 == null) {
            var3 = class157.field2954.field4514;
        } else {
            var3 = class138.field2627;
        }
        var3.setLayout((LayoutManager) null);
        field762++;
        class50.field1057 = new class247(this);
        var3.add(class50.field1057);
        class50.field1057.setSize(class4.field53, class248.field4414);
        class50.field1057.setVisible(true);
        if (class138.field2627 == var3) {
            Insets var4 = class138.field2627.getInsets();
            class50.field1057.setLocation(var4.left + class183.field3263, class213.field3858 + var4.top);
        } else {
            class50.field1057.setLocation(class183.field3263, class213.field3858);
        }
        class50.field1057.addFocusListener(this);
        class50.field1057.requestFocus();
        class162.field3042 = true;
        class136.field2603 = true;
        class228.field4130 = true;
        class144.field2739 = false;
        class233.field4214 = class253.method1711((byte) -112);
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V")
    public abstract void method266(int arg0);
}
