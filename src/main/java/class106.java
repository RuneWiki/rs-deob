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

@OriginalClass("client!ji")
public abstract class class106 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Z")
    private boolean field1843 = false;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Lji;")
    public static class106 field1841 = null;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field1830 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Ljf;")
    public static class229 field1824 = class212.method1457((byte) 57, "n");

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Lek;")
    public static class185 field1840;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Z")
    public static boolean field1864;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIZ)V", line = 4)
    public static final void method707(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class170.field2971 = arg1;
        class10.field119 = arg2;
        class281.field4799 = arg3;
        class320.field5411 = new class125[arg0][class170.field2971][class10.field119];
        class16.field256 = new int[arg0][class170.field2971 + 1][class10.field119 + 1];
        if (class108.field1900) {
            class1.field1 = new class37[4][];
        }
        if (arg4) {
            class74.field1401 = new class125[1][class170.field2971][class10.field119];
            class299.field5095 = new int[class170.field2971][class10.field119];
            class242.field4270 = new int[1][class170.field2971 + 1][class10.field119 + 1];
            if (class108.field1900) {
                class321.field5431 = new class37[1][];
            }
        } else {
            class74.field1401 = (class125[][][]) null;
            class299.field5095 = (int[][]) null;
            class242.field4270 = (int[][][]) null;
            class321.field5431 = (class37[][]) null;
        }
        class293.method2034(false);
        class278.field4773 = new class150[500];
        class312.field5247 = 0;
        class16.field250 = new class150[500];
        class184.field3189 = 0;
        class41.field743 = new int[arg0][class170.field2971 + 1][class10.field119 + 1];
        class115.field2072 = new class104[5000];
        class303.field5153 = 0;
        class318.field5372 = new class104[100];
        class160.field2712 = new boolean[class281.field4799 + class281.field4799 + 1][class281.field4799 + class281.field4799 + 1];
        class122.field2161 = new boolean[class281.field4799 + class281.field4799 + 2][class281.field4799 + class281.field4799 + 2];
        class179.field3110 = new byte[arg0][class170.field2971][class10.field119];
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljf;IJIIII)V", line = 49)
    public static final void method708(class229 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6) {
        field1838++;
        class14 var8 = new class14(128);
        var8.method140(10, (byte) 75);
        var8.method125(-25369, (int) (Math.random() * 99999.0D));
        var8.method125(-25369, 523);
        var8.method118(arg2, (byte) -125);
        var8.method100((int) (Math.random() * 9.9999999E7D), arg1 ^ 0xFF00);
        var8.method107((byte) -21, arg0);
        var8.method100((int) (Math.random() * 9.9999999E7D), 65280);
        var8.method125(-25369, class23.field432);
        var8.method140(arg4, (byte) 75);
        var8.method140(arg6, (byte) 75);
        var8.method100((int) (Math.random() * 9.9999999E7D), 65280);
        var8.method125(arg1 ^ 0xFFFF9CE7, arg3);
        var8.method125(-25369, arg5);
        var8.method100((int) (Math.random() * 9.9999999E7D), 65280);
        var8.method115((byte) 23, class168.field2879, class137.field2379);
        class84.field1608.field195 = 0;
        class84.field1608.method140(55, (byte) 75);
        class84.field1608.method140(var8.field195, (byte) 75);
        class84.field1608.method90(false, var8.field195, var8.field174, 0);
        class16.field242 = arg1;
        class161.field2732 = 0;
        class169.field2893 = -3;
        class252.field4409 = 1;
    }

    @OriginalMember(owner = "client!ji", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 84)
    public final void focusLost(FocusEvent arg0) {
        class272.field4656 = false;
        field1829++;
    }

    @OriginalMember(owner = "client!ji", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 96)
    public final AppletContext getAppletContext() {
        field1854++;
        if (class112.field2031 == null) {
            return class215.field3689 == null || class215.field3689.field3461 == this ? super.getAppletContext() : class215.field3689.field3461.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 112)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1833++;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 123)
    private final void method711(int arg0) {
        field1846++;
        long var2 = class153.method1032(125);
        long var4 = class174.field3036[class290.field4966];
        class174.field3036[class290.field4966] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class281.field4818 = ((var6 >> 1) + 32000) / var6;
        }
        class290.field4966 = class290.field4966 + 1 & 0x1F;
        if (class59.field1026++ > 50) {
            class59.field1026 -= 50;
            class35.field660 = true;
            class299.field5100.setSize(class175.field3046, class78.field1429);
            class299.field5100.setVisible(true);
            if (class112.field2031 != null && class155.field2641 == null) {
                Insets var7 = class112.field2031.getInsets();
                class299.field5100.setLocation(class10.field113 + var7.left, var7.top - -class126.field2246);
            } else {
                class299.field5100.setLocation(class10.field113, class126.field2246);
            }
        }
        this.method726(25584);
        if (arg0 < 77) {
            method717((byte) -8);
        }
    }

    @OriginalMember(owner = "client!ji", name = "stop", descriptor = "()V", line = 165)
    public final void stop() {
        field1852++;
        if (field1841 == this && !class161.field2735) {
            class118.field2105 = class153.method1032(105) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 185)
    public static final void method712(int arg0) {
        if (arg0 != 30419) {
            method712(-33);
        }
        field1849++;
        class73.field1392.method226((byte) -89);
    }

    @OriginalMember(owner = "client!ji", name = "providesignlink", descriptor = "(Lkn;)V", line = 197)
    public static final void providesignlink(class198 arg0) {
        field1862++;
        class215.field3689 = arg0;
        class27.field485 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 205)
    public final synchronized void paint(Graphics arg0) {
        field1835++;
        if (field1841 != this || class161.field2735) {
            return;
        }
        class35.field660 = true;
        if (class235.field4066 && !class108.field1900 && (class153.method1032(115) - class162.field2761) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class115.field2067 && var2.height >= class189.field3301) {
                class205.field3568 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjf;)Z", line = 229)
    public static final boolean method713(int arg0, class229 arg1) {
        field1857++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 5449) {
            field1840 = (class185) null;
        }
        for (int var2 = 0; var2 < class113.field2044; var2++) {
            if (arg1.method1653(class74.field1403[var2], false)) {
                return true;
            }
        }
        if (arg1.method1653(class301.field5124.field621, false)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 260)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1837++;
    }

    @OriginalMember(owner = "client!ji", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 269)
    public final void windowDeactivated(WindowEvent arg0) {
        field1839++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 276)
    public final void method715(String arg0, int arg1) {
        field1828++;
        if (this.field1843) {
            return;
        }
        this.field1843 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            if (arg1 >= -51) {
                this.field1843 = true;
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ji", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 298)
    public final String getParameter(String arg0) {
        field1855++;
        if (class112.field2031 == null) {
            return class215.field3689 == null || class215.field3689.field3461 == this ? super.getParameter(arg0) : class215.field3689.field3461.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 314)
    public final URL getCodeBase() {
        field1861++;
        if (class112.field2031 == null) {
            return class215.field3689 == null || class215.field3689.field3461 == this ? super.getCodeBase() : class215.field3689.field3461.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V", line = 338)
    public static void method717(byte arg0) {
        int var1 = -57 / ((45 - arg0) / 47);
        field1824 = null;
        field1840 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lek;Lvm;ZLek;I)V", line = 350)
    public static final void method718(class185 arg0, class77 arg1, boolean arg2, class185 arg3, int arg4) {
        int var5 = 48 % ((2 - arg4) / 49);
        field1853++;
        class264.field4557 = arg3;
        class189.field3291 = arg0;
        class162.field2747 = arg2;
        int var6 = class189.field3291.method1286(false) - 1;
        client.field4467 = class189.field3291.method1268(var6, (byte) 109) + var6 * 256;
        class329.field5598 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIILhg;IJZ)Z", line = 364)
    public static final boolean method719(int arg0, int arg1, int arg2, int arg3, int arg4, class174 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class104.method699(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ji", name = "start", descriptor = "()V", line = 400)
    public final void start() {
        field1860++;
        if (field1841 == this && !class161.field2735) {
            class118.field2105 = 0L;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V", line = 413)
    private final void method720(int arg0, boolean arg1) {
        field1836++;
        synchronized (this) {
            if (class161.field2735) {
                return;
            }
            class161.field2735 = true;
        }
        if (class215.field3689.field3461 != null) {
            class215.field3689.field3461.destroy();
        }
        try {
            this.method709((byte) 104);
        } catch (Exception var12) {
        }
        if (class299.field5100 != null) {
            try {
                class299.field5100.removeFocusListener(this);
                class299.field5100.getParent().remove(class299.field5100);
            } catch (Exception var11) {
            }
        }
        if (arg0 > -126) {
            return;
        }
        if (class215.field3689 != null) {
            try {
                class215.field3689.method1384((byte) 70);
            } catch (Exception var10) {
            }
        }
        this.method716(0);
        if (class112.field2031 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)Z", line = 475)
    public final boolean method721(byte arg0) {
        field1845++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 != -7) {
            field1840 = (class185) null;
        }
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
                this.method715("invalidhost", -64);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V", line = 510)
    private final void method722(int arg0) {
        long var2 = class153.method1032(106);
        long var4 = class151.field2607[class217.field3733];
        if (arg0 != 0) {
            this.getAppletContext();
        }
        if (var4 != 0L && var2 > var4) {
        }
        field1844++;
        class151.field2607[class217.field3733] = var2;
        class217.field3733 = class217.field3733 + 1 & 0x1F;
        synchronized (this) {
            class51.field896 = class272.field4656;
        }
        this.method714((byte) -92);
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)V", line = 541)
    public final synchronized void method723(byte arg0) {
        if (arg0 >= -56) {
            return;
        }
        if (class299.field5100 != null) {
            class299.field5100.removeFocusListener(this);
            class299.field5100.getParent().remove(class299.field5100);
        }
        field1832++;
        Container var2;
        if (class155.field2641 != null) {
            var2 = class155.field2641;
        } else if (class112.field2031 == null) {
            var2 = class215.field3689.field3461;
        } else {
            var2 = class112.field2031;
        }
        var2.setLayout((LayoutManager) null);
        class299.field5100 = new class26(this);
        var2.add(class299.field5100);
        class299.field5100.setSize(class175.field3046, class78.field1429);
        class299.field5100.setVisible(true);
        if (class112.field2031 == var2) {
            Insets var3 = class112.field2031.getInsets();
            class299.field5100.setLocation(class10.field113 + var3.left, class126.field2246 + var3.top);
        } else {
            class299.field5100.setLocation(class10.field113, class126.field2246);
        }
        class299.field5100.addFocusListener(this);
        class299.field5100.requestFocus();
        class51.field896 = true;
        class272.field4656 = true;
        class35.field660 = true;
        class205.field3568 = false;
        class162.field2761 = class153.method1032(127);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIII)V", line = 590)
    public static final void method724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1827++;
        if (arg6 < 128 || arg0 < 128 || arg6 > 13056 || arg0 > 13056) {
            class125.field2216 = -1;
            class97.field1724 = -1;
            return;
        }
        int var8 = class282.method1984((byte) -85, arg0, arg6, class16.field254) - arg3;
        int var9 = arg6 - class97.field1721;
        if (arg1 <= 11) {
            return;
        }
        int var10 = arg0 - class243.field4301;
        int var11 = var8 - class107.field1881;
        int var12 = class227.field3896[class174.field3043];
        int var13 = class227.field3896[class203.field3550];
        int var14 = class227.field3911[class203.field3550];
        int var15 = class227.field3911[class174.field3043];
        int var16 = var9 * var15 + var10 * var12 >> 16;
        int var17 = var10 * var15 - (var9 * var12) >> 16;
        int var19 = var11 * var14 - (var13 * var17) >> 16;
        int var20 = var11 * var13 + var14 * var17 >> 16;
        if (var20 < 50) {
            class97.field1724 = -1;
            class125.field2216 = -1;
        } else if (class108.field1900) {
            int var22 = arg4 * 512 >> 8;
            class97.field1724 = arg2 + (var16 * var22 / var20);
            int var23 = arg7 * 512 >> 8;
            class125.field2216 = var19 * var23 / var20 + arg5;
        } else {
            class125.field2216 = (var19 << 9) / var20 + arg5;
            class97.field1724 = (var16 << 9) / var20 + arg2;
        }
    }

    @OriginalMember(owner = "client!ji", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 653)
    public final void focusGained(FocusEvent arg0) {
        field1825++;
        class272.field4656 = true;
        class35.field660 = true;
    }

    @OriginalMember(owner = "client!ji", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 662)
    public final void windowIconified(WindowEvent arg0) {
        field1826++;
    }

    @OriginalMember(owner = "client!ji", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 669)
    public final void windowClosed(WindowEvent arg0) {
        field1858++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V", line = 676)
    public final void method725(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1859++;
        try {
            if (field1841 != null) {
                class152.field2621++;
                if (class152.field2621 >= 3) {
                    this.method715("alreadyloaded", -92);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class183.field3163 = arg0;
            class126.field2246 = 0;
            class78.field1429 = arg4;
            class189.field3301 = arg4;
            class10.field113 = 0;
            class175.field3046 = arg1;
            class115.field2067 = arg1;
            field1841 = this;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class208.field3608 = true;
            } else {
                class208.field3608 = false;
            }
            if (class215.field3689 == null) {
                class27.field485 = class215.field3689 = new class198(this, arg3, (String) null, 0);
            }
            if (arg2 >= -67) {
                this.method714((byte) -52);
            }
            class231 var7 = class215.field3689.method1373(this, 4, 1);
            while (var7.field4011 == 0) {
                class235.method1675((byte) -22, 10L);
            }
            class290.field4971 = (Thread) var7.field4009;
        } catch (Exception var9) {
            class201.method1407(1, (String) null, var9);
            this.method715("crash", -127);
        }
    }

    @OriginalMember(owner = "client!ji", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 735)
    public final void windowActivated(WindowEvent arg0) {
        field1834++;
    }

    @OriginalMember(owner = "client!ji", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 747)
    public final URL getDocumentBase() {
        field1847++;
        if (class112.field2031 == null) {
            return class215.field3689 == null || class215.field3689.field3461 == this ? super.getDocumentBase() : class215.field3689.field3461.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 766)
    public final void windowDeiconified(WindowEvent arg0) {
        field1848++;
    }

    @OriginalMember(owner = "client!ji", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 774)
    public final void windowOpened(WindowEvent arg0) {
        field1851++;
    }

    @OriginalMember(owner = "client!ji", name = "destroy", descriptor = "()V", line = 784)
    public final void destroy() {
        field1842++;
        if (field1841 == this && !class161.field2735) {
            class118.field2105 = class153.method1032(105);
            class235.method1675((byte) -22, 5000L);
            class27.field485 = null;
            this.method720(-127, false);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/String;IBIII)V", line = 801)
    public final void method727(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        try {
            class175.field3046 = arg2;
            class115.field2067 = arg2;
            class78.field1429 = arg5;
            class189.field3301 = arg5;
            field1841 = this;
            class183.field3163 = arg6;
            if (arg3 >= -79) {
                this.windowIconified((WindowEvent) null);
            }
            class126.field2246 = 0;
            class10.field113 = 0;
            class112.field2031 = new Frame();
            class112.field2031.setTitle("Jagex");
            class112.field2031.setResizable(true);
            class112.field2031.addWindowListener(this);
            class112.field2031.setVisible(true);
            class112.field2031.toFront();
            Insets var8 = class112.field2031.getInsets();
            class112.field2031.setSize(class115.field2067 + var8.left + var8.right, class189.field3301 - (-var8.top + -var8.bottom));
            class27.field485 = class215.field3689 = new class198((Applet) null, arg4, arg1, arg0);
            class231 var9 = class215.field3689.method1373(this, 4, 1);
            while (var9.field4011 == 0) {
                class235.method1675((byte) -22, 10L);
            }
            class290.field4971 = (Thread) var9.field4009;
        } catch (Exception var11) {
            class201.method1407(1, (String) null, var11);
        }
        field1856++;
    }

    @OriginalMember(owner = "client!ji", name = "run", descriptor = "()V", line = 841)
    public final void run() {
        field1850++;
        try {
            if (class198.field3454 != null) {
                String var1 = class198.field3454.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class198.field3457;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method715("wrongjava", -91);
                        return;
                    }
                    class200.field3501 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class198.field3457 == null || class198.field3457.equals("1.4.2"))) {
                    this.method715("wrongjava", -72);
                    return;
                }
            }
            if (class198.field3457 != null && class198.field3457.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class198.field3457.length() > var3) {
                    char var5 = class198.field3457.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class235.field4066 = true;
                }
            }
            if (class215.field3689.field3461 != null) {
                Method var6 = class198.field3470;
                if (var6 != null) {
                    try {
                        var6.invoke(class215.field3689.field3461, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method723((byte) -89);
            class172.field2977 = class102.method687(class175.field3046, class299.field5100, -122, class78.field1429);
            this.method710(-10650);
            class167.field2861 = class146.method1012((byte) 125);
            while (class118.field2105 == 0L || class118.field2105 > class153.method1032(114)) {
                class189.field3303 = class167.field2861.method610(class63.field1084, class200.field3501, 80);
                for (int var8 = 0; var8 < class189.field3303; var8++) {
                    this.method722(0);
                }
                this.method711(90);
                class127.method899(class215.field3689, 105, class299.field5100);
            }
        } catch (Exception var11) {
            class201.method1407(1, (String) null, var11);
            this.method715("crash", -124);
        }
        this.method720(-128, true);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public abstract void method709(byte arg0);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public abstract void method710(int arg0);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public abstract void method714(byte arg0);

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public abstract void method716(int arg0);

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public abstract void method726(int arg0);

    @OriginalMember(owner = "client!ji", name = "init", descriptor = "()V")
    public abstract void init();
}
