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

@OriginalClass("client!od")
public abstract class class29 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Z")
    private boolean field407 = false;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Z")
    private boolean field419 = false;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field393 = 127;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lcg;")
    public static class49 field405;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "Z")
    public static boolean field424;

    @OriginalMember(owner = "client!od", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 4)
    public final void windowClosing(WindowEvent arg0) {
        field417++;
        this.destroy();
    }

    @OriginalMember(owner = "client!od", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 16)
    public final void windowClosed(WindowEvent arg0) {
        field421++;
    }

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V", line = 26)
    public final void run() {
        field400++;
        try {
            if (class59.field919 != null) {
                String var1 = class59.field919.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class59.field904;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method263("wrongjava", false);
                        return;
                    }
                    class341.field5439 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class59.field904 == null || class59.field904.equals("1.4.2"))) {
                    this.method263("wrongjava", false);
                    return;
                }
            }
            if (class59.field904 != null && class59.field904.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class59.field904.length() > var3) {
                    char var5 = class59.field904.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class21.field324 = true;
                }
            }
            if (class85.field1369.field910 != null) {
                Method var6 = class59.field923;
                if (var6 != null) {
                    try {
                        var6.invoke(class85.field1369.field910, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class143.method1154(118);
            this.method268((byte) 96);
            class256.field4119 = class204.method1528(class313.field4973, (byte) 96, class188.field3152, class42.field616);
            this.method269((byte) 75);
            class146.field2637 = class257.method1785(120);
            this.method271((byte) -92);
            while (class295.field4709 == 0L || class295.field4709 > class306.method2102(-289)) {
                class287.field4585 = class146.field2637.method819(class341.field5439, class347.field5536, -114);
                for (int var8 = 0; var8 < class287.field4585; var8++) {
                    this.method274(-127);
                }
                this.method266(-85);
                class322.method2215(class85.field1369, class42.field616, (byte) 115);
            }
        } catch (Exception var11) {
            class88.method775(var11, (String) null, true);
            this.method263("crash", false);
        }
        this.method262(true, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 137)
    public static void method260(int arg0) {
        if (arg0 != -5256) {
            field393 = -105;
        }
        field405 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V", line = 147)
    public final void method261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field397++;
        try {
            if (class53.field828 != null) {
                class156.field2776++;
                if (class156.field2776 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method263("alreadyloaded", false);
                return;
            }
            class188.field3152 = arg0;
            class213.field3589 = arg0;
            class53.field828 = this;
            class12.field146 = 0;
            if (arg1 < 92) {
                this.field419 = false;
            }
            class313.field4973 = arg2;
            class56.field864 = arg2;
            class328.field5223 = arg4;
            class101.field1628 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class90.field1429 = true;
            } else {
                class90.field1429 = false;
            }
            if (class85.field1369 == null) {
                class180.field3042 = class85.field1369 = new class59(this, arg3, (String) null, 0);
            }
            class45 var7 = class85.field1369.method551((byte) 117, this, 1);
            while (var7.field709 == 0) {
                class142.method1149(10L, (byte) 126);
            }
            class316.field5001 = (Thread) var7.field712;
        } catch (Exception var9) {
            class88.method775(var9, (String) null, true);
            this.method263("crash", false);
        }
    }

    @OriginalMember(owner = "client!od", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 204)
    public final void windowActivated(WindowEvent arg0) {
        field399++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V", line = 211)
    private final void method262(boolean arg0, int arg1) {
        field410++;
        synchronized (this) {
            if (class270.field4311) {
                return;
            }
            class270.field4311 = true;
        }
        if (class85.field1369.field910 != null) {
            class85.field1369.field910.destroy();
        }
        try {
            this.method270(arg1 ^ 0x1B);
        } catch (Exception var14) {
        }
        if (this.field407) {
            try {
                jagmisc.quit();
            } catch (Throwable var13) {
            }
            this.field407 = false;
        }
        class85.field1369.method540(class53.field828.getClass(), arg1 ^ 0x8);
        if (class42.field616 != null) {
            try {
                class42.field616.removeFocusListener(this);
                class42.field616.getParent().remove(class42.field616);
            } catch (Exception var12) {
            }
        }
        if (class85.field1369 != null) {
            try {
                class85.field1369.method550(18);
            } catch (Exception var11) {
            }
        }
        this.method264(-18679);
        if (class271.field4321 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        if (arg1 != 0) {
            this.field407 = false;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!od", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 285)
    public final URL getDocumentBase() {
        field390++;
        if (class271.field4321 == null) {
            return class85.field1369 == null || class85.field1369.field910 == this ? super.getDocumentBase() : class85.field1369.field910.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 301)
    public final void focusGained(FocusEvent arg0) {
        field402++;
        class41.field608 = true;
        class57.field890 = true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 312)
    public final void method263(String arg0, boolean arg1) {
        field398++;
        if (this.field419 || arg1) {
            return;
        }
        this.field419 = true;
        System.out.println("error_game_" + arg0);
        try {
            class251.method1754("loggedout", (byte) -104, class85.field1369.field910);
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!od", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 339)
    public final AppletContext getAppletContext() {
        field413++;
        if (class271.field4321 == null) {
            return class85.field1369 == null || class85.field1369.field910 == this ? super.getAppletContext() : class85.field1369.field910.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "start", descriptor = "()V", line = 358)
    public final void start() {
        field406++;
        if (class53.field828 == this && !class270.field4311) {
            class295.field4709 = 0L;
        }
    }

    @OriginalMember(owner = "client!od", name = "destroy", descriptor = "()V", line = 371)
    public final void destroy() {
        field394++;
        if (class53.field828 == this && !class270.field4311) {
            class295.field4709 = class306.method2102(-289);
            class142.method1149(5000L, (byte) 126);
            class180.field3042 = null;
            this.method262(false, 0);
        }
    }

    @OriginalMember(owner = "client!od", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 388)
    public final String getParameter(String arg0) {
        field403++;
        if (class271.field4321 == null) {
            return class85.field1369 == null || class85.field1369.field910 == this ? super.getParameter(arg0) : class85.field1369.field910.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 403)
    private final void method266(int arg0) {
        long var2 = class306.method2102(-289);
        field412++;
        long var4 = class227.field3816[class339.field5424];
        class227.field3816[class339.field5424] = var2;
        class339.field5424 = class339.field5424 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class104.field1747 = ((var6 >> 1) + 32000) / var6;
        }
        if (class36.field530++ > 50) {
            class57.field890 = true;
            class36.field530 -= 50;
            class42.field616.setSize(class313.field4973, class188.field3152);
            class42.field616.setVisible(true);
            if (class271.field4321 != null && class120.field2076 == null) {
                Insets var7 = class271.field4321.getInsets();
                class42.field616.setLocation(class101.field1628 + var7.left, class12.field146 + var7.top);
            } else {
                class42.field616.setLocation(class101.field1628, class12.field146);
            }
        }
        int var8 = 9 % ((67 - arg0) / 38);
        this.method265(0);
    }

    @OriginalMember(owner = "client!od", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 448)
    public final URL getCodeBase() {
        field404++;
        if (class271.field4321 == null) {
            return class85.field1369 == null || class85.field1369.field910 == this ? super.getCodeBase() : class85.field1369.field910.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)Z", line = 465)
    public final boolean method267(int arg0) {
        field395++;
        if (arg0 != 0) {
            return false;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method263("invalidhost", false);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 500)
    public final synchronized void method268(byte arg0) {
        if (class42.field616 != null) {
            class42.field616.removeFocusListener(this);
            class42.field616.getParent().remove(class42.field616);
        }
        field409++;
        Container var2;
        if (class120.field2076 != null) {
            var2 = class120.field2076;
        } else if (class271.field4321 == null) {
            var2 = class85.field1369.field910;
        } else {
            var2 = class271.field4321;
        }
        int var3 = 15 % ((arg0 - 41) / 53);
        var2.setLayout((LayoutManager) null);
        class42.field616 = new class356(this);
        var2.add(class42.field616);
        class42.field616.setSize(class313.field4973, class188.field3152);
        class42.field616.setVisible(true);
        if (class271.field4321 == var2) {
            Insets var4 = class271.field4321.getInsets();
            class42.field616.setLocation(class101.field1628 + var4.left, var4.top - -class12.field146);
        } else {
            class42.field616.setLocation(class101.field1628, class12.field146);
        }
        class42.field616.addFocusListener(this);
        class42.field616.requestFocus();
        class287.field4575 = true;
        class41.field608 = true;
        class57.field890 = true;
        class175.field2985 = false;
        class50.field780 = class306.method2102(-289);
    }

    @OriginalMember(owner = "client!od", name = "stop", descriptor = "()V", line = 553)
    public final void stop() {
        field418++;
        if (class53.field828 == this && !class270.field4311) {
            class295.field4709 = class306.method2102(-289) + 4000L;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V", line = 566)
    public final void method271(byte arg0) {
        field392++;
        if (arg0 != -92 || this.field407) {
            return;
        }
        try {
            class45 var2 = class85.field1369.method549(class53.field828.getClass(), arg0 + 136);
            while (var2.field709 == 0) {
                class142.method1149(100L, (byte) 125);
            }
            if (var2.field712 != null) {
                throw (Throwable) var2.field712;
            }
            jagmisc.init();
            this.field407 = true;
            class146.field2637 = class257.method1785(108);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!od", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 600)
    public final void focusLost(FocusEvent arg0) {
        field401++;
        class41.field608 = false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Lqb;[[F[[BB[[F[[F[[BI[[B[[BI[[I)V", line = 612)
    public static final void method272(class114[] arg0, float[][] arg1, byte[][] arg2, byte arg3, float[][] arg4, float[][] arg5, byte[][] arg6, int arg7, byte[][] arg8, byte[][] arg9, int arg10, int[][] arg11) {
        if (arg3 != -109) {
            method272((class114[]) null, (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte) -45, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), -118, (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), -86, (int[][]) ((int[][]) null));
        }
        for (int var12 = 0; var12 < arg7; var12++) {
            class114 var13 = arg0[var12];
            if (var13.field1914 == arg10) {
                class281 var14 = new class281();
                int var15 = 0;
                int var16 = (var13.field1920 >> 7) + var13.field1913;
                int var17 = (var13.field1906 >> 7) - var13.field1913;
                int var18 = (var13.field1920 >> 7) - var13.field1913;
                if (var18 < 0) {
                    var15 -= var18;
                    var18 = 0;
                }
                if (var16 > 103) {
                    var16 = 103;
                }
                for (int var19 = var18; var19 <= var16; var19++) {
                    short var20 = var13.field1909[var15];
                    int var21 = (var20 >> 8) + var17;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg2[var23][var19] & 0xFF;
                        int var25 = arg9[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var25 == 0) {
                            if (var24 == 0) {
                                continue;
                            }
                            class354 var27 = class300.method2076(var24 - 1, -44);
                            if (var27.field5588 == -1) {
                                continue;
                            }
                            if (arg6[var23][var19] != 0) {
                                int[] var28 = class214.field3592[arg6[var23][var19]];
                                var14.field4451 += (var28.length >> 1) * 3 - 6;
                                var14.field4448 += var28.length >> 1;
                                continue;
                            }
                        } else if (var24 != 0) {
                            class354 var29 = class300.method2076(var24 - 1, arg3 + 60);
                            if (var29.field5588 == -1) {
                                byte var30 = arg6[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class98.field1594[var30];
                                    var14.field4451 += (var31.length >> 1) * 3 - 6;
                                    var14.field4448 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg6[var23][var19];
                            if (var32 != 0) {
                                var26 = true;
                            }
                        }
                        class241 var33 = class105.method901(arg10, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field3936 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var38 = null;
                                int var39 = (int) (var33.field3936 >> 20) & 0x3;
                                if ((var39 & 0x1) == 0) {
                                    boolean var40 = var23 + 1 <= var22;
                                    boolean var41 = var21 <= (var23 - 1);
                                    if (!var41 && var19 + 1 <= var16) {
                                        short var42 = var13.field1909[var15 + 1];
                                        int var43 = var17 + (var42 >> 8);
                                        int var44 = (var42 & 0xFF) + var43;
                                        var41 = var23 > var43 && var44 > var23;
                                    }
                                    if (!var40 && var18 <= var19 - 1) {
                                        short var45 = var13.field1909[var15 - 1];
                                        int var46 = (var45 >> 8) + var17;
                                        int var47 = var46 + (var45 & 0xFF);
                                        var40 = var46 < var23 && var47 > var23;
                                    }
                                    if (var41 && var40) {
                                        var38 = class214.field3592[0];
                                    } else if (var41) {
                                        var38 = class214.field3592[1];
                                    } else if (var40) {
                                        var38 = class214.field3592[1];
                                    }
                                } else {
                                    boolean var48 = var21 <= (var23 - 1);
                                    if (!var48 && var18 <= var19 - 1) {
                                        short var49 = var13.field1909[var15 - 1];
                                        int var50 = var17 + (var49 >> 8);
                                        int var51 = var50 + (var49 & 0xFF);
                                        var48 = var23 > var50 && var23 < var51;
                                    }
                                    boolean var52 = var22 >= var23 + 1;
                                    if (!var52 && var16 >= var19 + 1) {
                                        short var53 = var13.field1909[var15 + 1];
                                        int var54 = var17 + (var53 >> 8);
                                        int var55 = (var53 & 0xFF) + var54;
                                        var52 = var23 > var54 && var23 < var55;
                                    }
                                    if (var48 && var52) {
                                        var38 = class214.field3592[0];
                                    } else if (var48) {
                                        var38 = class214.field3592[1];
                                    } else if (var52) {
                                        var38 = class214.field3592[1];
                                    }
                                }
                                if (var38 != null) {
                                    var14.field4451 += ((var38.length >> 1) - 2) * 3;
                                    var14.field4448 += var38.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var35 = class98.field1594[arg6[var23][var19]];
                            int[] var36 = class214.field3592[arg6[var23][var19]];
                            var14.field4451 += ((var36.length >> 1) - 2) * 3;
                            var14.field4451 += ((var35.length >> 1) - 2) * 3;
                            var14.field4448 += var36.length >> 1;
                            var14.field4448 += var35.length >> 1;
                        } else {
                            int[] var37 = class214.field3592[0];
                            var14.field4451 += (var37.length >> 1) * 3 - 6;
                            var14.field4448 += var37.length >> 1;
                        }
                    }
                    var15++;
                }
                int var56 = 0;
                var14.method1921();
                if ((var13.field1920 >> 7) - var13.field1913 < 0) {
                    var56 -= (var13.field1920 >> 7) - var13.field1913;
                }
                for (int var57 = var18; var57 <= var16; var57++) {
                    short var58 = var13.field1909[var56];
                    int var59 = (var58 >> 8) + var17;
                    int var60 = (var58 & 0xFF) + (var59 - 1);
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg8[var61][var57];
                        boolean var63 = false;
                        int var64 = arg9[var61][var57] & 0xFF;
                        int var65 = arg2[var61][var57] & 0xFF;
                        if (var64 == 0) {
                            if (var65 == 0) {
                                continue;
                            }
                            class354 var66 = class300.method2076(var65 - 1, -54);
                            if (var66.field5588 == -1) {
                                continue;
                            }
                            if (arg6[var61][var57] != 0) {
                                class259.method1799(arg11, var13, arg4, arg8[var61][var57], arg1, var57, true, var14, var61, arg5, class214.field3592[arg6[var61][var57]]);
                                continue;
                            }
                        } else if (var65 != 0) {
                            class354 var67 = class300.method2076(var65 - 1, -122);
                            if (var67.field5588 == -1) {
                                class259.method1799(arg11, var13, arg4, arg8[var61][var57], arg1, var57, true, var14, var61, arg5, class98.field1594[arg6[var61][var57]]);
                                continue;
                            }
                            byte var68 = arg6[var61][var57];
                            if (var68 != 0) {
                                var63 = true;
                            }
                        }
                        class241 var69 = class105.method901(arg10, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field3936 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field3936 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var59 <= var61 - 1;
                                    boolean var82 = var61 + 1 <= var60;
                                    if (!var81 && var16 >= (var57 + 1)) {
                                        short var83 = var13.field1909[var56 + 1];
                                        int var84 = (var83 >> 8) + var17;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var84 < var61 && var85 > var61;
                                    }
                                    if (!var82 && var18 <= var57 - 1) {
                                        short var86 = var13.field1909[var56 - 1];
                                        int var87 = (var86 >> 8) + var17;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var61 > var87 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var71 = class214.field3592[0];
                                    } else if (var81) {
                                        var62 = 1;
                                        var71 = class214.field3592[1];
                                    } else if (var82) {
                                        var62 = 3;
                                        var71 = class214.field3592[1];
                                    }
                                } else {
                                    boolean var73 = var61 - 1 >= var59;
                                    if (!var73 && var57 - 1 >= var18) {
                                        short var74 = var13.field1909[var56 - 1];
                                        int var75 = var17 + (var74 >> 8);
                                        int var76 = (var74 & 0xFF) + var75;
                                        var73 = var75 < var61 && var76 > var61;
                                    }
                                    boolean var77 = var60 >= var61 + 1;
                                    if (!var77 && var57 + 1 <= var16) {
                                        short var78 = var13.field1909[var56 + 1];
                                        int var79 = (var78 >> 8) + var17;
                                        int var80 = var79 + (var78 & 0xFF);
                                        var77 = var61 > var79 && var61 < var80;
                                    }
                                    if (var73 && var77) {
                                        var71 = class214.field3592[0];
                                    } else if (var73) {
                                        var71 = class214.field3592[1];
                                        var62 = 0;
                                    } else if (var77) {
                                        var71 = class214.field3592[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class259.method1799(arg11, var13, arg4, var62, arg1, var57, true, var14, var61, arg5, var71);
                                }
                                continue;
                            }
                        }
                        if (var63) {
                            class259.method1799(arg11, var13, arg4, arg8[var61][var57], arg1, var57, true, var14, var61, arg5, class98.field1594[arg6[var61][var57]]);
                            class259.method1799(arg11, var13, arg4, arg8[var61][var57], arg1, var57, true, var14, var61, arg5, class214.field3592[arg6[var61][var57]]);
                        } else {
                            class259.method1799(arg11, var13, arg4, var62, arg1, var57, true, var14, var61, arg5, class214.field3592[0]);
                        }
                    }
                    var56++;
                }
                if (var14.field4459 > 0 && var14.field4447 > 0) {
                    var14.method1920();
                    var13.field1918 = var14;
                }
            }
        }
        field416++;
    }

    @OriginalMember(owner = "client!od", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 1141)
    public final synchronized void paint(Graphics arg0) {
        field391++;
        if (class53.field828 != this || class270.field4311) {
            return;
        }
        class57.field890 = true;
        if (class21.field324 && !class43.field680 && (class306.method2102(-289) - class50.field780) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class56.field864 <= var2.width && class213.field3589 <= var2.height) {
                class175.field2985 = true;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1164)
    public final void update(Graphics arg0) {
        field408++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!od", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1172)
    public final void windowIconified(WindowEvent arg0) {
        field415++;
    }

    @OriginalMember(owner = "client!od", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1180)
    public final void windowOpened(WindowEvent arg0) {
        field411++;
    }

    @OriginalMember(owner = "client!od", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1193)
    public final void windowDeiconified(WindowEvent arg0) {
        field414++;
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V", line = 1203)
    private final void method274(int arg0) {
        field389++;
        long var2 = class306.method2102(-289);
        long var4 = class282.field4471[class42.field625];
        if (arg0 >= -120) {
            this.method270(-122);
        }
        if (var4 != 0L && var2 > var4) {
        }
        class282.field4471[class42.field625] = var2;
        class42.field625 = class42.field625 + 1 & 0x1F;
        synchronized (this) {
            class287.field4575 = class41.field608;
        }
        this.method273((byte) 81);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZZILjava/lang/String;)V", line = 1233)
    public final void method275(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, String arg7) {
        field420++;
        try {
            class328.field5223 = arg3;
            class53.field828 = this;
            class188.field3152 = arg1;
            class213.field3589 = arg1;
            class101.field1628 = 0;
            class12.field146 = 0;
            class313.field4973 = arg0;
            class56.field864 = arg0;
            class271.field4321 = new Frame();
            class271.field4321.setTitle("Jagex");
            class271.field4321.setResizable(arg4);
            class271.field4321.addWindowListener(this);
            class271.field4321.setVisible(true);
            class271.field4321.toFront();
            Insets var9 = class271.field4321.getInsets();
            class271.field4321.setSize(class56.field864 + var9.left + var9.right, var9.top + var9.bottom + class213.field3589);
            class180.field3042 = class85.field1369 = new class59((Applet) null, arg6, arg7, arg2);
            class45 var10 = class85.field1369.method551((byte) 121, this, 1);
            while (var10.field709 == 0) {
                class142.method1149(10L, (byte) 127);
            }
            class316.field5001 = (Thread) var10.field712;
        } catch (Exception var12) {
            class88.method775(var12, (String) null, true);
        }
    }

    @OriginalMember(owner = "client!od", name = "providesignlink", descriptor = "(Lwe;)V", line = 1281)
    public static final void providesignlink(class59 arg0) {
        class85.field1369 = arg0;
        class180.field3042 = arg0;
        field388++;
    }

    @OriginalMember(owner = "client!od", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1295)
    public final void windowDeactivated(WindowEvent arg0) {
        field396++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public abstract void method264(int arg0);

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public abstract void method269(byte arg0);

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!od", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
    public abstract void method273(byte arg0);
}
