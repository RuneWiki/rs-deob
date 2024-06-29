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

@OriginalClass("client!v")
public abstract class class62 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!v", name = "D", descriptor = "Z")
    private boolean field874 = false;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "[I")
    public static int[] field845 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!v", name = "E", descriptor = "[I")
    public static int[] field875 = new int[1000];

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Ljava/lang/String;")
    public static String field865 = "rating: ";

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Ljava/lang/String;")
    public static String field849 = " ";

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lla;")
    public static class124 field861;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lwe;")
    public static class43 field856;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Z")
    public static boolean field887;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public abstract void method468(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZIILjava/lang/String;III)V")
    public final void method469(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        try {
            class81.field1126 = arg7;
            class279.field4467 = this;
            class107.field1856 = arg5;
            class207.field3337 = arg5;
            class18.field213 = 0;
            class105.field1825 = 0;
            class97.field1469 = arg6;
            class7.field107 = arg6;
            class284.field4537 = new Frame();
            class284.field4537.setTitle("Jagex");
            class284.field4537.setResizable(true);
            class284.field4537.addWindowListener(this);
            class284.field4537.setVisible(true);
            class284.field4537.toFront();
            Insets var9 = class284.field4537.getInsets();
            class284.field4537.setSize(class207.field3337 + var9.left + var9.right, class7.field107 + var9.top + var9.bottom);
            class254.field4068 = class250.field4006 = new class255((Applet) null, arg2, arg4, arg0);
            class137 var10 = class250.field4006.method1679(this, -124, arg3);
            while (var10.field2271 == 0) {
                class208.method1408(-128, 10L);
            }
        } catch (Exception var12) {
            class272.method1837((String) null, 1, var12);
        }
        field879++;
    }

    @OriginalMember(owner = "client!v", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field882++;
        if (class284.field4537 == null) {
            return class250.field4006 == null || class250.field4006.field4090 == this ? super.getAppletContext() : class250.field4006.field4090.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public abstract void method470(int arg0);

    @OriginalMember(owner = "client!v", name = "providesignlink", descriptor = "(Lcb;)V")
    public static final void providesignlink(class255 arg0) {
        class250.field4006 = arg0;
        class254.field4068 = arg0;
        field871++;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public abstract void method471(int arg0);

    @OriginalMember(owner = "client!v", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field864++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public final synchronized void method472(boolean arg0) {
        field876++;
        if (class38.field458 != null) {
            class38.field458.removeFocusListener(this);
            class38.field458.getParent().remove(class38.field458);
        }
        Container var2;
        if (class87.field1188 != null) {
            var2 = class87.field1188;
        } else if (class284.field4537 == null) {
            var2 = class250.field4006.field4090;
        } else {
            var2 = class284.field4537;
        }
        var2.setLayout((LayoutManager) null);
        class38.field458 = new class74(this);
        var2.add(class38.field458);
        class38.field458.setSize(class107.field1856, class97.field1469);
        class38.field458.setVisible(true);
        if (class284.field4537 == var2) {
            Insets var3 = class284.field4537.getInsets();
            class38.field458.setLocation(class105.field1825 + var3.left, var3.top - -class18.field213);
        } else {
            class38.field458.setLocation(class105.field1825, class18.field213);
        }
        class38.field458.addFocusListener(this);
        class38.field458.requestFocus();
        class254.field4065 = true;
        class257.field4113 = true;
        class128.field2143 = true;
        class243.field3899 = arg0;
        class93.field1324 = class182.method1253(20215);
    }

    @OriginalMember(owner = "client!v", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field855++;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    private final void method473(int arg0) {
        field868++;
        long var2 = class182.method1253(20215);
        long var4 = class144.field2329[class76.field1042];
        class144.field2329[class76.field1042] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class130.field2179 = ((var6 >> 1) + 32000) / var6;
        }
        class76.field1042 = class76.field1042 + 1 & 0x1F;
        if (class218.field3496++ > 50) {
            class128.field2143 = true;
            class218.field3496 -= 50;
            class38.field458.setSize(class107.field1856, class97.field1469);
            class38.field458.setVisible(true);
            if (class284.field4537 != null && class87.field1188 == null) {
                Insets var7 = class284.field4537.getInsets();
                class38.field458.setLocation(class105.field1825 + var7.left, class18.field213 + var7.top);
            } else {
                class38.field458.setLocation(class105.field1825, class18.field213);
            }
        }
        if (arg0 == 12173) {
            this.method468(-10);
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    private final void method474(int arg0) {
        field852++;
        long var2 = class127.field2124[class103.field1635];
        long var4 = class182.method1253(arg0 + 19150);
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class127.field2124[class103.field1635] = var4;
        class103.field1635 = class103.field1635 + 1 & 0x1F;
        if (arg0 != 1065) {
            field875 = null;
        }
        synchronized (this) {
            class257.field4113 = class254.field4065;
        }
        this.method471(115);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public abstract void method475(byte arg0);

    @OriginalMember(owner = "client!v", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field859++;
    }

    @OriginalMember(owner = "client!v", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field850++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIIII)V")
    public static final void method476(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field870++;
        if (arg0 != 52) {
            method478(68, -127, 107);
        }
        class283 var5 = class46.method360(10, -84, arg2);
        var5.method1893(0);
        var5.field4528 = arg3;
        var5.field4523 = arg4;
        var5.field4527 = arg1;
    }

    @OriginalMember(owner = "client!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field848++;
        class254.field4065 = true;
        class128.field2143 = true;
    }

    @OriginalMember(owner = "client!v", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field873++;
        this.destroy();
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public abstract void method477(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public static final void method478(int arg0, int arg1, int arg2) {
        field853++;
        class237.field3791 = arg2 - class129.field2149;
        class150.field2407 = class225.field3569 + class73.field1002 + arg0 - arg1;
    }

    @OriginalMember(owner = "client!v", name = "start", descriptor = "()V")
    public final void start() {
        field872++;
        if (class279.field4467 == this && !class10.field149) {
            class106.field1847 = 0L;
        }
    }

    @OriginalMember(owner = "client!v", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field884++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(SI)Z")
    public static final boolean method479(short arg0, int arg1) {
        field851++;
        if (arg0 == 11 || arg0 == 37 || arg0 == 32 || arg0 == 57 || arg0 == 43 || arg0 == 26 || arg0 == 50 || arg0 == 46) {
            return true;
        } else if (arg0 == 16 || arg0 == 33 || arg0 == 1002 || arg0 == 1007) {
            return true;
        } else if (arg0 == 39 || arg0 == 17 || arg0 == 44 || arg0 == 8 || arg0 == 25) {
            return true;
        } else if (arg0 == 45 || arg0 == 47 || arg0 == 19 || arg0 == 35 || arg0 == 38 || arg0 == 18) {
            return true;
        } else if (arg1 == 32000) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field846++;
        if (class279.field4467 != this || class10.field149) {
            return;
        }
        class128.field2143 = true;
        if (class55.field785 && (class182.method1253(20215) - class93.field1324) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class207.field3337 && var2.height >= class7.field107) {
                class243.field3899 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V")
    public static final void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field885++;
        if (arg5 >= -63) {
            return;
        }
        int var7 = class18.method125(-24914, arg6, client.field3617, class156.field2507);
        int var8 = class18.method125(-24914, arg0, client.field3617, class156.field2507);
        int var9 = class18.method125(-24914, arg2, class121.field2042, class58.field817);
        int var10 = class18.method125(-24914, arg3, class121.field2042, class58.field817);
        int var11 = class18.method125(-24914, arg1 + arg6, client.field3617, class156.field2507);
        int var12 = class18.method125(-24914, arg0 - arg1, client.field3617, class156.field2507);
        for (int var13 = var7; var13 < var11; var13++) {
            class168.method1184(128, var10, var9, arg4, class85.field1162[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class168.method1184(128, var10, var9, arg4, class85.field1162[var14]);
        }
        int var15 = class18.method125(-24914, arg1 + arg2, class121.field2042, class58.field817);
        int var16 = class18.method125(-24914, arg3 - arg1, class121.field2042, class58.field817);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class85.field1162[var17];
            class168.method1184(128, var15, var9, arg4, var18);
            class168.method1184(128, var10, var16, arg4, var18);
        }
    }

    @OriginalMember(owner = "client!v", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field881++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!v", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field860++;
    }

    @OriginalMember(owner = "client!v", name = "stop", descriptor = "()V")
    public final void stop() {
        field854++;
        if (class279.field4467 == this && !class10.field149) {
            class106.field1847 = class182.method1253(20215) + 4000L;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public static void method481(byte arg0) {
        field865 = null;
        field861 = null;
        if (arg0 == 51) {
            field849 = null;
            field875 = null;
            field845 = null;
            field856 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field847++;
        class254.field4065 = false;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method482(byte arg0, int arg1, String arg2, String arg3, String arg4) {
        class244.method1604(arg3, arg4, (byte) -101, arg2, -1, arg1);
        int var5 = 115 / ((arg0 + 26) / 57);
        field877++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method483(String arg0, byte arg1) {
        field886++;
        if (this.field874) {
            return;
        }
        this.field874 = true;
        System.out.println("error_game_" + arg0);
        try {
            class27.method184((byte) 105, "loggedout", class250.field4006.field4090);
        } catch (Throwable var4) {
        }
        if (arg1 != 100) {
            field883 = 122;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZZ)V")
    private final void method484(boolean arg0, boolean arg1) {
        field880++;
        synchronized (this) {
            if (class10.field149) {
                return;
            }
            class10.field149 = arg0;
        }
        if (class250.field4006.field4090 != null) {
            class250.field4006.field4090.destroy();
        }
        try {
            this.method475((byte) 62);
        } catch (Exception var9) {
        }
        if (class38.field458 != null) {
            try {
                class38.field458.removeFocusListener(this);
                class38.field458.getParent().remove(class38.field458);
            } catch (Exception var8) {
            }
        }
        if (class250.field4006 != null) {
            try {
                class250.field4006.method1669(false);
            } catch (Exception var7) {
            }
        }
        this.method477(1);
        if (class284.field4537 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!v", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field866++;
        if (class284.field4537 == null) {
            return class250.field4006 == null || class250.field4006.field4090 == this ? super.getParameter(arg0) : class250.field4006.field4090.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(BIIII)V")
    public final void method485(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field862++;
        try {
            if (class279.field4467 == null) {
                class81.field1126 = arg1;
                class18.field213 = 0;
                class279.field4467 = this;
                class97.field1469 = arg4;
                class7.field107 = arg4;
                class105.field1825 = 0;
                int var6 = -113 / ((8 - arg0) / 50);
                class107.field1856 = arg3;
                class207.field3337 = arg3;
                String var7 = this.getParameter("openwinjs");
                boolean var10000;
                if (var7 != null && var7.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class250.field4006 == null) {
                    class254.field4068 = class250.field4006 = new class255(this, arg2, (String) null, 0);
                }
                class137 var8 = class250.field4006.method1679(this, -124, 1);
                while (var8.field2271 == 0) {
                    class208.method1408(-126, 10L);
                }
            } else {
                class81.field1129++;
                if (class81.field1129 >= 3) {
                    this.method483("alreadyloaded", (byte) 100);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var10) {
            class272.method1837((String) null, 1, var10);
            this.method483("crash", (byte) 100);
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z")
    public final boolean method486(int arg0) {
        field858++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 0) {
                field861 = null;
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
                this.method483("invalidhost", (byte) 100);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field863++;
        if (class284.field4537 == null) {
            return class250.field4006 == null || class250.field4006.field4090 == this ? super.getDocumentBase() : class250.field4006.field4090.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field857++;
        if (class284.field4537 == null) {
            return class250.field4006 == null || class250.field4006.field4090 == this ? super.getCodeBase() : class250.field4006.field4090.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "run", descriptor = "()V")
    public final void run() {
        field869++;
        try {
            if (class255.field4069 != null) {
                String var1 = class255.field4069.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class255.field4077;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method483("wrongjava", (byte) 100);
                        return;
                    }
                    class51.field711 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class255.field4077 == null || class255.field4077.equals("1.4.2"))) {
                    this.method483("wrongjava", (byte) 100);
                    return;
                }
            }
            if (class255.field4077 != null && class255.field4077.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class255.field4077.length()) {
                    char var5 = class255.field4077.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
                if (var4 >= 5) {
                    class55.field785 = true;
                }
            }
            if (class250.field4006.field4090 != null) {
                Method var6 = class255.field4089;
                if (var6 != null) {
                    try {
                        var6.invoke(class250.field4006.field4090, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class202.method1356(67);
            this.method472(false);
            class217.field3478 = class178.method1231(class97.field1469, (byte) 0, class107.field1856, class38.field458);
            this.method470(10962);
            class178.field2880 = class46.method355(true);
            while (class106.field1847 == 0L || class106.field1847 > class182.method1253(20215)) {
                class248.field3983 = class178.field2880.method13(class200.field3222, class51.field711, true);
                for (int var7 = 0; var7 < class248.field3983; var7++) {
                    this.method474(1065);
                }
                this.method473(12173);
                class161.method1104(class38.field458, class250.field4006, (byte) 64);
            }
        } catch (Exception var10) {
            class272.method1837((String) null, 1, var10);
            this.method483("crash", (byte) 100);
        }
        this.method484(true, true);
    }

    @OriginalMember(owner = "client!v", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field878++;
        if (class279.field4467 == this && !class10.field149) {
            class106.field1847 = class182.method1253(20215);
            class208.method1408(-3, 5000L);
            class254.field4068 = null;
            this.method484(true, false);
        }
    }
}
