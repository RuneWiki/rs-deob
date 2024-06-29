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

@OriginalClass("client!l")
public abstract class class327 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
    private boolean field5226 = false;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
    private boolean field5244 = false;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Z")
    public static boolean field5233 = true;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Z")
    public static boolean field5234 = false;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field5237 = 0;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "[I")
    public static int[] field5239 = new int[50];

    @OriginalMember(owner = "client!l", name = "I", descriptor = "[I")
    public static int[] field5260 = new int[128];

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lnk;")
    public static class16 field5227;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "Z")
    public static boolean field5265;

    @OriginalMember(owner = "client!l", name = "destroy", descriptor = "()V", line = 5)
    public final void destroy() {
        field5250++;
        if (class323.field5141 == this && !class226.field3415) {
            class218.field3271 = class9.method57(-14133);
            class19.method140(5000L, 16711680);
            class5.field54 = null;
            this.method2265((byte) 89, false);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BZ)V", line = 25)
    private final void method2265(byte arg0, boolean arg1) {
        field5264++;
        synchronized (this) {
            if (class226.field3415) {
                return;
            }
            class226.field3415 = true;
        }
        if (class156.field2451.field254 != null) {
            class156.field2451.field254.destroy();
        }
        try {
            this.method2023((byte) -106);
            if (arg0 < 28) {
                method2273((byte) 34, -73);
            }
        } catch (Exception var14) {
        }
        if (this.field5244) {
            try {
                jagmisc.quit();
            } catch (Throwable var13) {
            }
            this.field5244 = false;
        }
        class156.field2451.method160(class323.field5141.getClass(), 11);
        if (class328.field5287 != null) {
            try {
                class328.field5287.removeFocusListener(this);
                class328.field5287.getParent().remove(class328.field5287);
            } catch (Exception var12) {
            }
        }
        if (class156.field2451 != null) {
            try {
                class156.field2451.method163(-104);
            } catch (Exception var11) {
            }
        }
        this.method2012(-1);
        if (class231.field3498 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 102)
    public final void method2266(String arg0, int arg1) {
        field5252++;
        if (this.field5226) {
            return;
        }
        this.field5226 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != -15309) {
                return;
            }
            class198.method1380((byte) 121, "loggedout", class156.field2451.field254);
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!l", name = "providesignlink", descriptor = "(Lrj;)V", line = 128)
    public static final void providesignlink(class22 arg0) {
        field5262++;
        class156.field2451 = arg0;
        class5.field54 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 136)
    public final void windowDeiconified(WindowEvent arg0) {
        field5251++;
    }

    @OriginalMember(owner = "client!l", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 146)
    public final void windowDeactivated(WindowEvent arg0) {
        field5256++;
    }

    @OriginalMember(owner = "client!l", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 153)
    public final URL getCodeBase() {
        field5238++;
        if (class231.field3498 == null) {
            return class156.field2451 == null || class156.field2451.field254 == this ? super.getCodeBase() : class156.field2451.field254.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 170)
    public final void focusLost(FocusEvent arg0) {
        field5243++;
        class111.field1548 = false;
    }

    @OriginalMember(owner = "client!l", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 181)
    public final void windowIconified(WindowEvent arg0) {
        field5240++;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 189)
    private final void method2267(int arg0) {
        field5236++;
        long var2 = class9.method57(-14133);
        long var4 = class355.field5651[class322.field5002];
        class355.field5651[class322.field5002] = var2;
        class322.field5002 = class322.field5002 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
        }
        synchronized (this) {
            class282.field4500 = class111.field1548;
        }
        this.method2022((byte) -118);
        if (arg0 <= 48) {
            field5239 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Z", line = 220)
    public final boolean method2268(int arg0) {
        field5229++;
        if (arg0 != 0) {
            field5237 = 57;
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
                this.method2266("invalidhost", -15309);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 254)
    public final void windowClosed(WindowEvent arg0) {
        field5253++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V", line = 261)
    public final void method2269(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5254++;
        try {
            if (class323.field5141 != null) {
                class38.field429++;
                if (class38.field429 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method2266("alreadyloaded", -15309);
                return;
            }
            class165.field2546 = arg3;
            class56.field670 = arg3;
            int var6 = -83 % ((arg1 - 41) / 60);
            class95.field1307 = arg4;
            class168.field2580 = arg4;
            class107.field1473 = 0;
            class323.field5141 = this;
            class24.field287 = arg0;
            class258.field4076 = 0;
            String var7 = this.getParameter("openwinjs");
            if (var7 != null && var7.equals("1")) {
                class189.field2844 = true;
            } else {
                class189.field2844 = false;
            }
            if (class156.field2451 == null) {
                class5.field54 = class156.field2451 = new class22(this, arg2, (String) null, 0);
            }
            class153 var8 = class156.field2451.method155(1, this, -3);
            while (var8.field2419 == 0) {
                class19.method140(10L, 16711680);
            }
            class73.field909 = (Thread) var8.field2421;
        } catch (Exception var10) {
            class27.method198(var10, (byte) 62, (String) null);
            this.method2266("crash", -15309);
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 318)
    public static void method2270(int arg0) {
        if (arg0 == 29821) {
            field5227 = null;
            field5260 = null;
            field5239 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 331)
    public final void method2271(int arg0) {
        field5231++;
        if (arg0 != 14580) {
            this.getDocumentBase();
        }
        if (this.field5244) {
            return;
        }
        try {
            class153 var2 = class156.field2451.method162(true, class323.field5141.getClass());
            while (var2.field2419 == 0) {
                class19.method140(100L, arg0 + 16697100);
            }
            if (var2.field2421 != null) {
                throw (Throwable) var2.field2421;
            }
            jagmisc.init();
            this.field5244 = true;
            class45.field517 = class102.method647((byte) 123);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V", line = 362)
    public final synchronized void method2272(int arg0) {
        if (class328.field5287 != null) {
            class328.field5287.removeFocusListener(this);
            class328.field5287.getParent().remove(class328.field5287);
        }
        field5230++;
        Container var2;
        if (class80.field1065 != null) {
            var2 = class80.field1065;
        } else if (class231.field3498 == null) {
            var2 = class156.field2451.field254;
        } else {
            var2 = class231.field3498;
        }
        var2.setLayout((LayoutManager) null);
        class328.field5287 = new class174(this);
        var2.add(class328.field5287);
        class328.field5287.setSize(class165.field2546, class95.field1307);
        class328.field5287.setVisible(true);
        if (class231.field3498 == var2) {
            Insets var3 = class231.field3498.getInsets();
            class328.field5287.setLocation(class107.field1473 + var3.left, class258.field4076 + var3.top);
        } else {
            class328.field5287.setLocation(class107.field1473, class258.field4076);
        }
        class328.field5287.addFocusListener(this);
        class328.field5287.requestFocus();
        class282.field4500 = true;
        int var4 = 64 % ((arg0 + 7) / 36);
        class111.field1548 = true;
        class237.field3646 = true;
        class345.field5475 = false;
        class174.field2634 = class9.method57(-14133);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Ljh;", line = 414)
    public static final class299 method2273(byte arg0, int arg1) {
        field5261++;
        class299 var2 = (class299) class290.field4561.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class107.field1476.method100(arg1, 0, (byte) -107);
        class299 var4 = new class299(var3);
        var4.method1700(class55.field647, (int[]) null);
        int var5 = -13 / ((73 - arg0) / 51);
        class290.field4561.method377((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 438)
    public final void windowOpened(WindowEvent arg0) {
        field5241++;
    }

    @OriginalMember(owner = "client!l", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 457)
    public final URL getDocumentBase() {
        field5245++;
        if (class231.field3498 == null) {
            return class156.field2451 == null || class156.field2451.field254 == this ? super.getDocumentBase() : class156.field2451.field254.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 474)
    public final AppletContext getAppletContext() {
        field5235++;
        if (class231.field3498 == null) {
            return class156.field2451 == null || class156.field2451.field254 == this ? super.getAppletContext() : class156.field2451.field254.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 489)
    private final void method2274(int arg0) {
        field5257++;
        long var2 = class9.method57(arg0 ^ 0xFFFFC8F9);
        long var4 = class304.field4736[class187.field2826];
        class304.field4736[class187.field2826] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class14.field141 = ((var6 >> 1) + 32000) / var6;
        }
        class187.field2826 = class187.field2826 + 1 & 0x1F;
        if (class323.field5085++ > arg0) {
            class323.field5085 -= 50;
            class237.field3646 = true;
            class328.field5287.setSize(class165.field2546, class95.field1307);
            class328.field5287.setVisible(true);
            if (class231.field3498 != null && class80.field1065 == null) {
                Insets var7 = class231.field3498.getInsets();
                class328.field5287.setLocation(var7.left + class107.field1473, class258.field4076 + var7.top);
            } else {
                class328.field5287.setLocation(class107.field1473, class258.field4076);
            }
        }
        this.method2010(arg0 ^ 0x2A);
    }

    @OriginalMember(owner = "client!l", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 533)
    public final synchronized void paint(Graphics arg0) {
        field5228++;
        if (class323.field5141 != this || class226.field3415) {
            return;
        }
        class237.field3646 = true;
        if (class290.field4567 && !class272.field4317 && class9.method57(-14133) - class174.field2634 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class56.field670 <= var2.width && class168.field2580 <= var2.height) {
                class345.field5475 = true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 557)
    public static final void method2275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class2.field22 >= arg2 && arg3 >= class244.field3844) {
            boolean var6;
            if (arg1 < class337.field5389) {
                arg1 = class337.field5389;
                var6 = false;
            } else if (arg1 <= class344.field5460) {
                var6 = true;
            } else {
                arg1 = class344.field5460;
                var6 = false;
            }
            boolean var7;
            if (class337.field5389 > arg0) {
                var7 = false;
                arg0 = class337.field5389;
            } else if (class344.field5460 >= arg0) {
                var7 = true;
            } else {
                var7 = false;
                arg0 = class344.field5460;
            }
            if (class244.field3844 <= arg2) {
                class278.method1986(arg1, class347.field5501[arg2++], arg4, arg0, (byte) -119);
            } else {
                arg2 = class244.field3844;
            }
            if (arg3 > class2.field22) {
                arg3 = class2.field22;
            } else {
                class278.method1986(arg1, class347.field5501[arg3--], arg4, arg0, (byte) -124);
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg3; var8++) {
                    int[] var9 = class347.field5501[var8];
                    var9[arg1] = var9[arg0] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg3; var11++) {
                    class347.field5501[var11][arg1] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg3; var10++) {
                    class347.field5501[var10][arg0] = arg4;
                }
            }
        }
        field5263++;
        int var12 = -108 % ((39 - arg5) / 43);
    }

    @OriginalMember(owner = "client!l", name = "start", descriptor = "()V", line = 661)
    public final void start() {
        field5259++;
        if (class323.field5141 == this && !class226.field3415) {
            class218.field3271 = 0L;
        }
    }

    @OriginalMember(owner = "client!l", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 674)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field5255++;
    }

    @OriginalMember(owner = "client!l", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 684)
    public final void windowActivated(WindowEvent arg0) {
        field5232++;
    }

    @OriginalMember(owner = "client!l", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 691)
    public final String getParameter(String arg0) {
        field5242++;
        if (class231.field3498 == null) {
            return class156.field2451 == null || class156.field2451.field254 == this ? super.getParameter(arg0) : class156.field2451.field254.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 709)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5248++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZBIIIILjava/lang/String;I)V", line = 728)
    public final void method2276(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            class107.field1473 = 0;
            if (arg1 != 83) {
                field5237 = -22;
            }
            class24.field287 = arg2;
            class323.field5141 = this;
            class258.field4076 = 0;
            class95.field1307 = arg5;
            class168.field2580 = arg5;
            class165.field2546 = arg4;
            class56.field670 = arg4;
            class231.field3498 = new Frame();
            class231.field3498.setTitle("Jagex");
            class231.field3498.setResizable(true);
            class231.field3498.addWindowListener(this);
            class231.field3498.setVisible(true);
            class231.field3498.toFront();
            Insets var9 = class231.field3498.getInsets();
            class231.field3498.setSize(var9.right + var9.left + class56.field670, class168.field2580 + var9.bottom + var9.top);
            class5.field54 = class156.field2451 = new class22((Applet) null, arg3, arg6, arg7);
            class153 var10 = class156.field2451.method155(1, this, -3);
            while (var10.field2419 == 0) {
                class19.method140(10L, arg1 ^ 0xFF0053);
            }
            class73.field909 = (Thread) var10.field2421;
        } catch (Exception var12) {
            class27.method198(var12, (byte) 62, (String) null);
        }
        field5247++;
    }

    @OriginalMember(owner = "client!l", name = "run", descriptor = "()V", line = 769)
    public final void run() {
        field5258++;
        try {
            if (class22.field249 != null) {
                String var1 = class22.field249.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class22.field248;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2266("wrongjava", -15309);
                        return;
                    }
                    class45.field511 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class22.field248 == null || class22.field248.equals("1.4.2"))) {
                    this.method2266("wrongjava", -15309);
                    return;
                }
            }
            if (class22.field248 != null && class22.field248.startsWith("1.")) {
                int var3 = 0;
                for (int var4 = 2; class22.field248.length() > var4; var4++) {
                    char var5 = class22.field248.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3 = -(-var5 - var3 * 10) - 48;
                }
                if (var3 >= 5) {
                    class290.field4567 = true;
                }
            }
            if (class156.field2451.field254 != null) {
                Method var6 = class22.field265;
                if (var6 != null) {
                    try {
                        var6.invoke(class156.field2451.field254, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class279.method1994(true);
            this.method2272(88);
            class10.field107 = class138.method946(64, class328.field5287, class95.field1307, class165.field2546);
            this.method2017((byte) -50);
            class45.field517 = class102.method647((byte) 123);
            this.method2271(14580);
            while (class218.field3271 == 0L || class9.method57(-14133) < class218.field3271) {
                class250.field3957 = class45.field517.method248(class45.field511, (byte) 124, class292.field4593);
                for (int var8 = 0; var8 < class250.field3957; var8++) {
                    this.method2267(127);
                }
                this.method2274(50);
                class27.method201(0, class156.field2451, class328.field5287);
            }
        } catch (Exception var11) {
            class27.method198(var11, (byte) 62, (String) null);
            this.method2266("crash", -15309);
        }
        this.method2265((byte) 60, true);
    }

    @OriginalMember(owner = "client!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 885)
    public final void focusGained(FocusEvent arg0) {
        field5246++;
        class111.field1548 = true;
        class237.field3646 = true;
    }

    @OriginalMember(owner = "client!l", name = "stop", descriptor = "()V", line = 894)
    public final void stop() {
        field5249++;
        if (class323.field5141 == this && !class226.field3415) {
            class218.field3271 = class9.method57(-14133) + 4000L;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public abstract void method2017(byte arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public abstract void method2010(int arg0);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
    public abstract void method2012(int arg0);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public abstract void method2022(byte arg0);

    @OriginalMember(owner = "client!l", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public abstract void method2023(byte arg0);
}
