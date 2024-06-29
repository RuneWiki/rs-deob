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

@OriginalClass("client!oaa")
public abstract class class305 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "Z")
    private boolean field4388 = false;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "Z")
    private boolean field4396 = false;

    @OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
    public static int field4403 = 1;

    @OriginalMember(owner = "client!oaa", name = "D", descriptor = "Lsw;")
    public static class787 field4404 = new class787(4);

    @OriginalMember(owner = "client!oaa", name = "N", descriptor = "Ljw;")
    public static class581 field4414 = new class581(39, -1);

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!oaa", name = "J", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!oaa", name = "K", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!oaa", name = "L", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!oaa", name = "M", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!oaa", name = "O", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!oaa", name = "P", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!oaa", name = "Q", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!oaa", name = "V", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!oaa", name = "W", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!oaa", name = "X", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!oaa", name = "ab", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!oaa", name = "fb", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!oaa", name = "gb", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!oaa", name = "R", descriptor = "Z")
    public static boolean field4418;

    @OriginalMember(owner = "client!oaa", name = "S", descriptor = "Z")
    public static boolean field4419;

    @OriginalMember(owner = "client!oaa", name = "T", descriptor = "Z")
    public static boolean field4420;

    @OriginalMember(owner = "client!oaa", name = "U", descriptor = "Z")
    public static boolean field4421;

    @OriginalMember(owner = "client!oaa", name = "Y", descriptor = "Z")
    public static boolean field4425;

    @OriginalMember(owner = "client!oaa", name = "Z", descriptor = "Z")
    public static boolean field4426;

    @OriginalMember(owner = "client!oaa", name = "bb", descriptor = "Z")
    public static boolean field4428;

    @OriginalMember(owner = "client!oaa", name = "cb", descriptor = "Z")
    public static boolean field4429;

    @OriginalMember(owner = "client!oaa", name = "db", descriptor = "Z")
    public static boolean field4430;

    @OriginalMember(owner = "client!oaa", name = "eb", descriptor = "Z")
    public static boolean field4431;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIILjava/lang/String;ZI)V", line = 3)
    public final void method1918(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, boolean arg6, int arg7) {
        try {
            class605.field8212 = null;
            class239.field3220 = arg0;
            class132.field1960 = arg1;
            class593.field8019 = arg7;
            class482.field6666 = arg7;
            class189.field2512 = this;
            class140.field2048 = arg2;
            class655.field9076 = arg2;
            class719.field10029 = 0;
            class388.field5642 = new Frame();
            class388.field5642.setTitle("Jagex");
            class388.field5642.setResizable(true);
            class388.field5642.addWindowListener(this);
            class388.field5642.setVisible(true);
            class388.field5642.toFront();
            Insets var9 = class388.field5642.getInsets();
            class388.field5642.setSize(class482.field6666 + var9.left + var9.right, var9.top + var9.bottom + class655.field9076);
            class642.field8903 = class730.field10124 = new class70(arg4, arg5, arg3, true);
            class615 var10 = class730.field10124.method623(this, 1, arg0 ^ 0xFFFFE9BF);
            while (var10.field8321 == 0) {
                class438.method2636(true, 10L);
            }
        } catch (Exception var12) {
            class664.method3681((byte) -125, null, var12);
        }
        field4383++;
    }

    @OriginalMember(owner = "client!oaa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 42)
    public final synchronized void paint(Graphics arg0) {
        field4380++;
        if (class189.field2512 != this || class632.field8833) {
            return;
        }
        class237.field3206 = true;
        if (class303.field4363 && class302.method1910(0) - class419.field6023 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class482.field6666 <= var2.width && var2.height >= class655.field9076) {
                class303.field4367 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 64)
    public final void windowClosed(WindowEvent arg0) {
        field4389++;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Ljava/lang/String;", line = 71)
    public String method1919(int arg0) {
        if (arg0 <= 29) {
            return null;
        } else {
            field4392++;
            return null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 90)
    public final void focusGained(FocusEvent arg0) {
        class269.field3969 = true;
        field4410++;
        class237.field3206 = true;
    }

    @OriginalMember(owner = "client!oaa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 101)
    public final void focusLost(FocusEvent arg0) {
        class269.field3969 = false;
        field4384++;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V", line = 109)
    private final void method1921(int arg0) {
        field4412++;
        long var2 = class302.method1910(arg0 ^ arg0);
        long var4 = class516.field7060[class452.field6293];
        class516.field7060[class452.field6293] = var2;
        class452.field6293 = class452.field6293 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class549.field7446 = ((var6 >> 1) + 32000) / var6;
        }
        if (class493.field6830++ > 50) {
            class493.field6830 -= 50;
            class237.field3206 = true;
            class706.field9894.setSize(class593.field8019, class140.field2048);
            class706.field9894.setVisible(true);
            if (class388.field5642 != null && class632.field8832 == null) {
                Insets var7 = class388.field5642.getInsets();
                class706.field9894.setLocation(class719.field10029 + var7.left, class239.field3220 + var7.top);
            } else {
                class706.field9894.setLocation(class719.field10029, class239.field3220);
            }
        }
        this.method1927((byte) -88);
    }

    @OriginalMember(owner = "client!oaa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 149)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4413++;
    }

    @OriginalMember(owner = "client!oaa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 157)
    public final URL getCodeBase() {
        field4379++;
        if (class388.field5642 == null) {
            return class735.field10183 == null || class735.field10183 == this ? super.getCodeBase() : class735.field10183.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 172)
    public static final void provideLoaderApplet(Applet arg0) {
        class735.field10183 = arg0;
        field4398++;
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)Z", line = 181)
    public final boolean method1922(int arg0) {
        if (arg0 == -1) {
            field4399++;
            return class295.method1877(104, "jagtheora");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "stop", descriptor = "()V", line = 196)
    public final void stop() {
        field4397++;
        if (class189.field2512 == this && !class632.field8833) {
            class84.field1177 = class302.method1910(0) + 4000L;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 207)
    public final URL getDocumentBase() {
        field4408++;
        if (class388.field5642 == null) {
            return class735.field10183 == null || class735.field10183 == this ? super.getDocumentBase() : class735.field10183.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)V", line = 221)
    private final void method1923(int arg0) {
        if (arg0 != 22054) {
            field4403 = 0;
        }
        field4394++;
        long var2 = class302.method1910(arg0 - 22054);
        long var4 = class535.field7290[class620.field8363];
        class535.field7290[class620.field8363] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class620.field8363 = class620.field8363 + 1 & 0x1F;
        synchronized (this) {
            class59.field807 = class269.field3969;
        }
        this.method1925(arg0 - 21960);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V", line = 255)
    public static void method1924(byte arg0) {
        field4404 = null;
        field4414 = null;
        if (arg0 != -69) {
            field4403 = 17;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 271)
    public final AppletContext getAppletContext() {
        field4377++;
        if (class388.field5642 == null) {
            return class735.field10183 == null || class735.field10183 == this ? super.getAppletContext() : class735.field10183.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V", line = 287)
    public final void method1926(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4406++;
        try {
            if (!arg6) {
                if (class189.field2512 == null) {
                    class593.field8019 = arg0;
                    class482.field6666 = arg0;
                    class132.field1960 = arg2;
                    class189.field2512 = this;
                    class239.field3220 = 0;
                    class719.field10029 = 0;
                    class605.field8212 = class735.field10183;
                    class140.field2048 = arg5;
                    class655.field9076 = arg5;
                    class642.field8903 = class730.field10124 = new class70(arg3, arg1, arg4, class735.field10183 != null);
                    class615 var8 = class730.field10124.method623(this, 1, -5697);
                    while (var8.field8321 == 0) {
                        class438.method2636(!arg6, 10L);
                    }
                } else {
                    class87.field1221++;
                    if (class87.field1221 >= 3) {
                        this.method1937(-98, "alreadyloaded");
                    } else {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    }
                }
            }
        } catch (Throwable var10) {
            class664.method3681((byte) 124, null, var10);
            this.method1937(-128, "crash");
        }
    }

    @OriginalMember(owner = "client!oaa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 334)
    public final void windowDeiconified(WindowEvent arg0) {
        field4400++;
    }

    @OriginalMember(owner = "client!oaa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 344)
    public final void windowDeactivated(WindowEvent arg0) {
        field4407++;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(B)V", line = 357)
    public synchronized void method1928(byte arg0) {
        if (class706.field9894 != null) {
            class706.field9894.removeFocusListener(this);
            class706.field9894.getParent().setBackground(Color.black);
            class706.field9894.getParent().remove(class706.field9894);
        }
        field4386++;
        Container var2;
        if (class632.field8832 != null) {
            var2 = class632.field8832;
        } else if (class388.field5642 != null) {
            var2 = class388.field5642;
        } else if (class735.field10183 == null) {
            var2 = class189.field2512;
        } else {
            var2 = class735.field10183;
        }
        var2.setLayout(null);
        class706.field9894 = new class716(this);
        var2.add(class706.field9894);
        class706.field9894.setSize(class593.field8019, class140.field2048);
        class706.field9894.setVisible(true);
        if (class388.field5642 == var2) {
            Insets var3 = class388.field5642.getInsets();
            class706.field9894.setLocation(var3.left + class719.field10029, var3.top - -class239.field3220);
        } else {
            class706.field9894.setLocation(class719.field10029, class239.field3220);
        }
        class706.field9894.addFocusListener(this);
        class706.field9894.requestFocus();
        class269.field3969 = true;
        class59.field807 = true;
        class237.field3206 = true;
        class303.field4367 = false;
        if (arg0 < 47) {
            this.method1928((byte) -101);
        }
        class419.field6023 = class302.method1910(0);
    }

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "(I)Z", line = 411)
    public final boolean method1929(int arg0) {
        int var2 = 10 / ((-arg0 - 7) / 63);
        field4409++;
        return class295.method1877(106, "jagmisc");
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZI)V", line = 423)
    private final void method1930(boolean arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field4405++;
        synchronized (this) {
            if (class632.field8833) {
                return;
            }
            class632.field8833 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class735.field10183 != null) {
            class735.field10183.destroy();
        }
        try {
            this.method1920(-38);
        } catch (Exception var9) {
        }
        if (this.field4388) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field4388 = false;
        }
        class552.method3120(-14, true);
        class54.method394((byte) -28);
        if (class706.field9894 != null) {
            try {
                class706.field9894.removeFocusListener(this);
                class706.field9894.getParent().remove(class706.field9894);
            } catch (Exception var7) {
            }
        }
        if (class730.field10124 != null) {
            try {
                class730.field10124.method616(-128);
            } catch (Exception var6) {
            }
        }
        this.method1938((byte) 122);
        if (class388.field5642 != null) {
            class388.field5642.setVisible(false);
            class388.field5642.dispose();
            class388.field5642 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(B)Z", line = 498)
    public final boolean method1931(byte arg0) {
        field4382++;
        if (arg0 >= -20) {
            field4414 = null;
        }
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
            } else {
                this.method1937(-91, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 537)
    public final void windowOpened(WindowEvent arg0) {
        field4411++;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)[Lib;", line = 545)
    public static final class164[] method1932(boolean arg0) {
        field4375++;
        return arg0 ? new class164[] { class197.field2634, class739.field10203, class469.field6504, class165.field2232, class324.field4724, class176.field2349, class447.field6265 } : null;
    }

    @OriginalMember(owner = "client!oaa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 557)
    public final void windowActivated(WindowEvent arg0) {
        field4381++;
    }

    @OriginalMember(owner = "client!oaa", name = "start", descriptor = "()V", line = 564)
    public final void start() {
        field4391++;
        if (class189.field2512 == this && !class632.field8833) {
            class84.field1177 = 0L;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "run", descriptor = "()V", line = 579)
    public final void run() {
        field4376++;
        try {
            if (class70.field998 != null) {
                String var1 = class70.field998.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class70.field986;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1937(-124, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class70.field986 == null || class70.field986.equals("1.4.2"))) {
                    this.method1937(-88, "wrongjava");
                    return;
                }
            }
            if (class70.field986 != null && class70.field986.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class70.field986.length() > var3) {
                    char var5 = class70.field986.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class303.field4363 = true;
                }
            }
            Applet var6 = class189.field2512;
            if (class735.field10183 != null) {
                var6 = class735.field10183;
            }
            Method var7 = class70.field993;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class562.method3153(56);
            class103.method798(-1358116690);
            this.method1928((byte) 74);
            this.method1933(-23014);
            class89.field1236 = class320.method2034((byte) 90);
            while (class84.field1177 == 0L || class302.method1910(0) < class84.field1177) {
                class79.field1126 = class89.field1236.method3244(15841, class362.field5285);
                for (int var8 = 0; var8 < class79.field1126; var8++) {
                    this.method1923(22054);
                }
                this.method1921(0);
                class189.method1311(class706.field9894, class730.field10124, 28569);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class664.method3681((byte) -74, this.method1919(96), var20);
            this.method1937(-98, "crash");
        } finally {
            Object var13 = null;
            this.method1930(true, 0);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "destroy", descriptor = "()V", line = 702)
    public final void destroy() {
        field4387++;
        if (class189.field2512 == this && !class632.field8833) {
            class84.field1177 = class302.method1910(0);
            class438.method2636(true, 5000L);
            class642.field8903 = null;
            this.method1930(false, 0);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 718)
    public final String getParameter(String arg0) {
        field4393++;
        if (class388.field5642 == null) {
            return class735.field10183 == null || class735.field10183 == this ? super.getParameter(arg0) : class735.field10183.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBI)V", line = 733)
    public static final void method1934(int arg0, byte arg1, int arg2) {
        if (arg1 <= 67) {
            field4403 = -65;
        }
        field4401++;
        class16 var3 = class94.method753(18, 13175, (long) arg2 << 32 | (long) arg0);
        var3.method118(585134072);
    }

    @OriginalMember(owner = "client!oaa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 746)
    public final void windowIconified(WindowEvent arg0) {
        field4402++;
    }

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "(I)Z", line = 755)
    public final boolean method1935(int arg0) {
        field4378++;
        return arg0 == 31 ? class295.method1877(72, "jaclib") : true;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)Z", line = 775)
    public static final boolean method1936(int arg0, int arg1, int arg2) {
        field4390++;
        if (arg2 != 13085) {
            field4404 = null;
        }
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!oaa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 788)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4395++;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 797)
    public final void method1937(int arg0, String arg1) {
        field4385++;
        if (this.field4396) {
            return;
        }
        this.field4396 = true;
        System.out.println("error_game_" + arg1);
        try {
            class623.method3414(class735.field10183, "loggedout", (byte) 119);
        } catch (Throwable var4) {
        }
        if (arg0 <= -83) {
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
    public abstract void method1920(int arg0);

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)V")
    public abstract void method1925(int arg0);

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)V")
    public abstract void method1927(byte arg0);

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "(I)V")
    public abstract void method1933(int arg0);

    @OriginalMember(owner = "client!oaa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(B)V")
    public abstract void method1938(byte arg0);
}
