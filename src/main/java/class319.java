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

@OriginalClass("client!hk")
public abstract class class319 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "Z")
    private boolean field4975 = false;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!hk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 4)
    public final void windowDeactivated(WindowEvent arg0) {
        field4976++;
    }

    @OriginalMember(owner = "client!hk", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 12)
    public final AppletContext getAppletContext() {
        field4970++;
        if (class161.field2635 == null) {
            return class264.field4183 == null || class264.field4183.field68 == this ? super.getAppletContext() : class264.field4183.field68.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 32)
    public static final void method2219(byte arg0) {
        field4986++;
        int var1 = (class13.field159.field1980 >> 7) + class181.field2925;
        if (arg0 != 4) {
            providesignlink((class6) null);
        }
        class269.field4252 = 0;
        int var2 = (class13.field159.field1944 >> 7) + class24.field351;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class269.field4252 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class269.field4252 = 1;
        }
        if (class269.field4252 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class269.field4252 = 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)Leh;", line = 64)
    public static final class179 method2220(int arg0, byte arg1, int arg2) {
        field4963++;
        class179 var3 = (class179) class295.field4631.method1743((long) arg2 << 32 | (long) arg0, (byte) -117);
        if (var3 == null) {
            var3 = new class179(arg2, arg0);
            class295.field4631.method1750(var3, (byte) 124, var3.field916);
        }
        return arg1 > -30 ? (class179) null : var3;
    }

    @OriginalMember(owner = "client!hk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 90)
    public final void windowClosing(WindowEvent arg0) {
        field4971++;
        this.destroy();
    }

    @OriginalMember(owner = "client!hk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 98)
    public final void focusLost(FocusEvent arg0) {
        class34.field452 = false;
        field4983++;
    }

    @OriginalMember(owner = "client!hk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 108)
    public final void windowDeiconified(WindowEvent arg0) {
        field4957++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZBI)I", line = 118)
    public static final int method2221(int arg0, boolean arg1, byte arg2, int arg3) {
        field4961++;
        class227 var4 = (class227) class164.field2664.method1743((long) arg3, (byte) -103);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = -96 / ((-arg2 - 44) / 53);
        for (int var7 = 0; var7 < var4.field3606.length; var7++) {
            if (var4.field3606[var7] >= 0 && var4.field3606[var7] < class239.field3786) {
                class74 var8 = class31.method198(false, var4.field3606[var7]);
                if (var8.field1004 != null) {
                    class310 var9 = (class310) var8.field1004.method1743((long) arg0, (byte) 104);
                    if (var9 != null) {
                        if (arg1) {
                            var5 += var4.field3604[var7] * var9.field4844;
                        } else {
                            var5 += var9.field4844;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V", line = 166)
    public static final void method2222(byte arg0) {
        field4952++;
        if (class34.field448 > 0) {
            class321.method2246((byte) -128);
            return;
        }
        class44.field603 = class69.field901;
        class69.field901 = null;
        if (arg0 == 5) {
            class173.method1180(40, arg0 + 65275);
        }
    }

    @OriginalMember(owner = "client!hk", name = "destroy", descriptor = "()V", line = 186)
    public final void destroy() {
        field4962++;
        if (class286.field4519 == this && !class77.field1171) {
            class107.field1624 = class304.method2128((byte) -88);
            class20.method128(0, 5000L);
            class238.field3759 = null;
            this.method2234(false, 106);
        }
    }

    @OriginalMember(owner = "client!hk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 202)
    public final synchronized void paint(Graphics arg0) {
        field4954++;
        if (class286.field4519 != this || class77.field1171) {
            return;
        }
        class300.field4697 = true;
        if (class55.field729 && !class186.field2991 && class304.method2128((byte) -72) - class339.field5266 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class71.field910 <= var2.width && var2.height >= class35.field460) {
                class309.field4825 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 222)
    public final void windowIconified(WindowEvent arg0) {
        field4965++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V", line = 236)
    public final void method2223(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4960++;
        if (arg4 >= -81) {
            return;
        }
        try {
            if (class286.field4519 != null) {
                class244.field3881++;
                if (class244.field3881 >= 3) {
                    this.method2227(121, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class28.field398 = 0;
            class16.field193 = arg3;
            class286.field4519 = this;
            class170.field2711 = 0;
            class160.field2601 = arg2;
            class71.field910 = arg2;
            class210.field3432 = arg1;
            class35.field460 = arg1;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class337.field5237 = true;
            } else {
                class337.field5237 = false;
            }
            if (class264.field4183 == null) {
                class238.field3759 = class264.field4183 = new class6(this, arg0, (String) null, 0);
            }
            class217 var7 = class264.field4183.method40(1, this, -82);
            while (var7.field3488 == 0) {
                class20.method128(0, 10L);
            }
            class312.field4856 = (Thread) var7.field3490;
        } catch (Exception var9) {
            class314.method2186((String) null, 123, var9);
            this.method2227(125, "crash");
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLim;)Lib;", line = 291)
    public static final class102 method2224(boolean arg0, class192 arg1) {
        if (arg0) {
            method2219((byte) 33);
        }
        field4967++;
        return new class102(arg1.method1389(97), arg1.method1389(109), arg1.method1389(101), arg1.method1389(111), arg1.method1378(false), arg1.method1399(-1172389784));
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 308)
    public final synchronized void method2225(int arg0) {
        if (class338.field5247 != null) {
            class338.field5247.removeFocusListener(this);
            class338.field5247.getParent().remove(class338.field5247);
        }
        if (arg0 != 0) {
            this.field4975 = true;
        }
        field4968++;
        Container var2;
        if (class113.field1688 != null) {
            var2 = class113.field1688;
        } else if (class161.field2635 == null) {
            var2 = class264.field4183.field68;
        } else {
            var2 = class161.field2635;
        }
        var2.setLayout((LayoutManager) null);
        class338.field5247 = new class131(this);
        var2.add(class338.field5247);
        class338.field5247.setSize(class160.field2601, class210.field3432);
        class338.field5247.setVisible(true);
        if (class161.field2635 == var2) {
            Insets var3 = class161.field2635.getInsets();
            class338.field5247.setLocation(class170.field2711 + var3.left, var3.top - -class28.field398);
        } else {
            class338.field5247.setLocation(class170.field2711, class28.field398);
        }
        class338.field5247.addFocusListener(this);
        class338.field5247.requestFocus();
        class34.field452 = true;
        class300.field4697 = true;
        class309.field4825 = false;
        class254.field4029 = true;
        class339.field5266 = class304.method2128((byte) -77);
    }

    @OriginalMember(owner = "client!hk", name = "stop", descriptor = "()V", line = 357)
    public final void stop() {
        field4953++;
        if (class286.field4519 == this && !class77.field1171) {
            class107.field1624 = class304.method2128((byte) -101) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hk", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 369)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4987++;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V", line = 377)
    public static final void method2226(int arg0) {
        class226.field3589.method1615(99);
        int var1 = 12 % ((arg0 + 61) / 54);
        field4972++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 387)
    public final void method2227(int arg0, String arg1) {
        field4982++;
        if (this.field4975) {
            return;
        }
        this.field4975 = true;
        System.out.println("error_game_" + arg1);
        try {
            class72.method470("loggedout", (byte) -122, class264.field4183.field68);
            if (arg0 <= 120) {
                this.field4975 = false;
            }
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!hk", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 413)
    public final String getParameter(String arg0) {
        field4973++;
        if (class161.field2635 == null) {
            return class264.field4183 == null || class264.field4183.field68 == this ? super.getParameter(arg0) : class264.field4183.field68.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "start", descriptor = "()V", line = 427)
    public final void start() {
        field4956++;
        if (class286.field4519 == this && !class77.field1171) {
            class107.field1624 = 0L;
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V", line = 438)
    private final void method2228(int arg0) {
        field4980++;
        long var2 = class304.method2128((byte) -84);
        long var4 = class149.field2243[class138.field2070];
        class149.field2243[class138.field2070] = var2;
        class138.field2070 = class138.field2070 + arg0 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class44.field604 = ((var6 >> 1) + 32000) / var6;
        }
        if (class176.field2872++ > 50) {
            class176.field2872 -= 50;
            class300.field4697 = true;
            class338.field5247.setSize(class160.field2601, class210.field3432);
            class338.field5247.setVisible(true);
            if (class161.field2635 != null && class113.field1688 == null) {
                Insets var7 = class161.field2635.getInsets();
                class338.field5247.setLocation(class170.field2711 + var7.left, var7.top - -class28.field398);
            } else {
                class338.field5247.setLocation(class170.field2711, class28.field398);
            }
        }
        this.method1909((byte) -26);
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V", line = 478)
    public static final void method2229(int arg0) {
        field4958++;
        class5.field54.method1615(58);
        class308.field4813.method1615(114);
        class189.field3075.method1615(arg0 ^ 0xFFFFD8A3);
        if (arg0 != -10090) {
            method2219((byte) -51);
        }
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V", line = 493)
    private final void method2230(int arg0) {
        long var2 = class304.method2128((byte) -126);
        field4969++;
        long var4 = class198.field3257[class12.field150];
        class198.field3257[class12.field150] = var2;
        if ((long) arg0 != var4 && var2 > var4) {
        }
        class12.field150 = class12.field150 + 1 & 0x1F;
        synchronized (this) {
            class254.field4029 = class34.field452;
        }
        this.method1911(-6);
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)Z", line = 520)
    public final boolean method2231(int arg0) {
        field4977++;
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
                this.method2227(125, "invalidhost");
                int var3 = 23 / ((arg0 + 35) / 62);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "providesignlink", descriptor = "(Lgn;)V", line = 553)
    public static final void providesignlink(class6 arg0) {
        class264.field4183 = arg0;
        class238.field3759 = arg0;
        field4984++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIZIILjava/lang/String;II)V", line = 565)
    public final void method2232(byte arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class210.field3432 = arg6;
            class35.field460 = arg6;
            class28.field398 = 0;
            class160.field2601 = arg3;
            class71.field910 = arg3;
            class286.field4519 = this;
            class16.field193 = arg1;
            class170.field2711 = 0;
            class161.field2635 = new Frame();
            class161.field2635.setTitle("Jagex");
            class161.field2635.setResizable(true);
            class161.field2635.addWindowListener(this);
            class161.field2635.setVisible(true);
            class161.field2635.toFront();
            Insets var9 = class161.field2635.getInsets();
            class161.field2635.setSize(class71.field910 + var9.left + var9.right, var9.top - -var9.bottom + class35.field460);
            class238.field3759 = class264.field4183 = new class6((Applet) null, arg4, arg5, arg7);
            if (arg0 != -97) {
                return;
            }
            class217 var10 = class264.field4183.method40(1, this, -96);
            while (var10.field3488 == 0) {
                class20.method128(0, 10L);
            }
            class312.field4856 = (Thread) var10.field3490;
        } catch (Exception var12) {
            class314.method2186((String) null, 117, var12);
        }
        field4974++;
    }

    @OriginalMember(owner = "client!hk", name = "run", descriptor = "()V", line = 607)
    public final void run() {
        field4959++;
        try {
            if (class6.field72 != null) {
                String var1 = class6.field72.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class6.field61;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2227(124, "wrongjava");
                        return;
                    }
                    class36.field487 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class6.field61 == null || class6.field61.equals("1.4.2"))) {
                    this.method2227(121, "wrongjava");
                    return;
                }
            }
            if (class6.field61 != null && class6.field61.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class6.field61.length() > var3) {
                    char var5 = class6.field61.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class55.field729 = true;
                }
            }
            if (class264.field4183.field68 != null) {
                Method var6 = class6.field80;
                if (var6 != null) {
                    try {
                        var6.invoke(class264.field4183.field68, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class161.method1119(114);
            this.method2225(0);
            class289.field4563 = class26.method178(class338.field5247, -2, class160.field2601, class210.field3432);
            this.method1908(1);
            class90.field1373 = class30.method193(true);
            while (class107.field1624 == 0L || class304.method2128((byte) -73) < class107.field1624) {
                class17.field233 = class90.field1373.method880(class36.field487, class50.field690, 78);
                for (int var8 = 0; var8 < class17.field233; var8++) {
                    this.method2230(0);
                }
                this.method2228(1);
                class15.method95(class264.field4183, class338.field5247, (byte) -97);
            }
        } catch (Exception var11) {
            class314.method2186((String) null, 114, var11);
            this.method2227(124, "crash");
        }
        this.method2234(true, 43);
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)Lfj;", line = 715)
    public static final class254 method2233(int arg0) {
        if (arg0 != 0) {
            method2235((byte) 59);
        }
        class254 var1;
        if (class186.field2991) {
            var1 = new class211(class163.field2659, class113.field1698, class163.field2657[0], class162.field2647[0], class244.field3885[0], class21.field316[0], class3.field20[0], class305.field4754);
        } else {
            var1 = new class123(class163.field2659, class113.field1698, class163.field2657[0], class162.field2647[0], class244.field3885[0], class21.field316[0], class3.field20[0], class305.field4754);
        }
        class17.method115((byte) 98);
        field4966++;
        return var1;
    }

    @OriginalMember(owner = "client!hk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 735)
    public final void windowActivated(WindowEvent arg0) {
        field4985++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V", line = 743)
    private final void method2234(boolean arg0, int arg1) {
        field4979++;
        synchronized (this) {
            if (class77.field1171) {
                return;
            }
            if (arg1 <= 5) {
                this.field4975 = true;
            }
            class77.field1171 = true;
        }
        if (class264.field4183.field68 != null) {
            class264.field4183.field68.destroy();
        }
        try {
            this.method1897((byte) 124);
        } catch (Exception var12) {
        }
        if (class338.field5247 != null) {
            try {
                class338.field5247.removeFocusListener(this);
                class338.field5247.getParent().remove(class338.field5247);
            } catch (Exception var11) {
            }
        }
        if (class264.field4183 != null) {
            try {
                class264.field4183.method38(-30896);
            } catch (Exception var10) {
            }
        }
        this.method1903((byte) -104);
        if (class161.field2635 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!hk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 801)
    public final void windowClosed(WindowEvent arg0) {
        field4955++;
    }

    @OriginalMember(owner = "client!hk", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 808)
    public final URL getDocumentBase() {
        field4950++;
        if (class161.field2635 == null) {
            return class264.field4183 == null || class264.field4183.field68 == this ? super.getDocumentBase() : class264.field4183.field68.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 834)
    public final void windowOpened(WindowEvent arg0) {
        field4964++;
    }

    @OriginalMember(owner = "client!hk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 843)
    public final void focusGained(FocusEvent arg0) {
        class34.field452 = true;
        class300.field4697 = true;
        field4981++;
    }

    @OriginalMember(owner = "client!hk", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 853)
    public final URL getCodeBase() {
        field4978++;
        if (class161.field2635 == null) {
            return class264.field4183 == null || class264.field4183.field68 == this ? super.getCodeBase() : class264.field4183.field68.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(B)V", line = 870)
    public static final void method2235(byte arg0) {
        if (class242.field3841 < 0) {
            class138.field2069 = -1;
            class242.field3841 = 0;
            class206.field3363 = -1;
        }
        if (class240.field3815 < class242.field3841) {
            class138.field2069 = -1;
            class242.field3841 = class240.field3815;
            class206.field3363 = -1;
        }
        if (class231.field3698 < 0) {
            class138.field2069 = -1;
            class206.field3363 = -1;
            class231.field3698 = 0;
        }
        if (class231.field3698 > class331.field5158) {
            class231.field3698 = class331.field5158;
            class138.field2069 = -1;
            class206.field3363 = -1;
        }
        field4951++;
        if (arg0 != -107) {
            method2233(-26);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public abstract void method1908(int arg0);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public abstract void method1909(byte arg0);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public abstract void method1903(byte arg0);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public abstract void method1911(int arg0);

    @OriginalMember(owner = "client!hk", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V")
    public abstract void method1897(byte arg0);
}
