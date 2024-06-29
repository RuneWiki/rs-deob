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

@OriginalClass("client!jl")
public abstract class class245 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Z")
    private boolean field3347 = false;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "Z")
    private boolean field3357 = false;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "Z")
    public static boolean field3361;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "Z")
    public static boolean field3364;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "Z")
    public static boolean field3367;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "Z")
    public static boolean field3368;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "Z")
    public static boolean field3369;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "Z")
    public static boolean field3371;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "Z")
    public static boolean field3372;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "Z")
    public static boolean field3374;

    @OriginalMember(owner = "client!jl", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void update(Graphics arg0) {
        field3327++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 11)
    private final void method1512(int arg0) {
        field3332++;
        long var2 = class577.method3295((byte) 15);
        long var4 = class693.field9878[class209.field2946];
        class693.field9878[class209.field2946] = var2;
        boolean var10000;
        if ((long) arg0 == var4 || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class209.field2946 = class209.field2946 + 1 & 0x1F;
        synchronized (this) {
            class556.field7487 = class5.field36;
        }
        this.method1526(126);
    }

    @OriginalMember(owner = "client!jl", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 39)
    public final URL getCodeBase() {
        field3349++;
        if (class130.field1868 == null) {
            return class59.field668 == null || class59.field668 == this ? super.getCodeBase() : class59.field668.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 53)
    public static final void method1513(int arg0) {
        field3345++;
        class533.field7214 = arg0;
        class289.field3961 = -1;
        class525.field7124 = -1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V", line = 64)
    public final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6) {
        field3358++;
        if (arg5) {
            this.field3347 = true;
        }
        try {
            if (class356.field4728 == null) {
                class201.field2847 = arg2;
                class26.field332 = class59.field668;
                class340.field4553 = arg0;
                class595.field8319 = arg0;
                class703.field9949 = 0;
                class222.field3096 = arg1;
                class148.field2192 = arg1;
                class356.field4728 = this;
                class323.field4401 = 0;
                class51.field596 = class543.field7374 = new class105(arg3, arg6, arg4, class59.field668 != null);
                class70 var8 = class543.field7374.method757((byte) 112, 1, this);
                while (var8.field948 == 0) {
                    class519.method2960(-109, 10L);
                }
            } else {
                class668.field9390++;
                if (class668.field9390 >= 3) {
                    this.method1524(0, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class413.method2400(null, var10, (byte) -62);
            this.method1524(0, "crash");
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)Z", line = 110)
    public final boolean method1515(int arg0) {
        field3356++;
        if (arg0 != 31579) {
            this.method1522(-53);
        }
        return class28.method266(true, "jagmisc");
    }

    @OriginalMember(owner = "client!jl", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 122)
    public static final void provideLoaderApplet(Applet arg0) {
        class59.field668 = arg0;
        field3329++;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V", line = 133)
    public synchronized void method1518(int arg0) {
        if (class611.field8473 != null) {
            class611.field8473.removeFocusListener(this);
            class611.field8473.getParent().setBackground(Color.black);
            class611.field8473.getParent().remove(class611.field8473);
        }
        field3340++;
        Container var2;
        if (class54.field613 != null) {
            var2 = class54.field613;
        } else if (class130.field1868 != null) {
            var2 = class130.field1868;
        } else if (class59.field668 == null) {
            var2 = class356.field4728;
        } else {
            var2 = class59.field668;
        }
        var2.setLayout(null);
        class611.field8473 = new class656(this);
        var2.add(class611.field8473);
        class611.field8473.setSize(class222.field3096, class340.field4553);
        class611.field8473.setVisible(true);
        if (class130.field1868 == var2) {
            Insets var3 = class130.field1868.getInsets();
            class611.field8473.setLocation(class323.field4401 + var3.left, var3.top - -class703.field9949);
        } else {
            class611.field8473.setLocation(class323.field4401, class703.field9949);
        }
        class611.field8473.addFocusListener(this);
        class611.field8473.requestFocus();
        if (arg0 != 0) {
            this.destroy();
        }
        class5.field36 = true;
        class556.field7487 = true;
        class262.field3554 = true;
        class529.field7170 = false;
        class403.field5670 = class577.method3295((byte) 15);
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)I", line = 185)
    public static final int method1519(int arg0) {
        field3341++;
        if (class705.field9965 == 0) {
            class154.field2240.method1102(new class31("jaclib"), 49);
            if (class154.field2240.method1101((byte) -93).method301(arg0 ^ 0x6DCE) != 100) {
                return 1;
            }
            if (!((class31) class154.field2240.method1101((byte) -93)).method298((byte) 70)) {
                class647.field8937.method1521(-1);
            }
            class705.field9965 = 1;
        }
        if (class705.field9965 == 1) {
            class2.field7 = class154.method1098((byte) 117);
            class154.field2231.method1102(new class542(class609.field8459), 72);
            class154.field2241.method1102(new class31("jaggl"), 113);
            class154.field2242.method1102(new class31("jagdx"), 120);
            class154.field2243.method1102(new class31("jagmisc"), 109);
            class154.field2244.method1102(new class31("sw3d"), 120);
            class154.field2245.method1102(new class31("hw3d"), arg0 ^ 0x75);
            class154.field2246.method1102(new class542(class605.field8413), 88);
            class154.field2247.method1102(new class542(class507.field6953), 114);
            class154.field2248.method1102(new class542(class565.field7749), 111);
            class154.field2249.method1102(new class542(class523.field7097), 61);
            class154.field2250.method1102(new class542(class341.field4579), arg0 ^ 0x1D);
            class154.field2251.method1102(new class542(class630.field8745), 83);
            class154.field2252.method1102(new class542(class697.field9899), 108);
            class154.field2253.method1102(new class542(class314.field4343), 102);
            class154.field2254.method1102(new class542(class84.field1250), arg0 ^ 0x6F);
            class154.field2255.method1102(new class542(class13.field137), 59);
            class154.field2256.method1102(new class542(class69.field932), 59);
            class154.field2257.method1102(new class542(class589.field8274), 90);
            class154.field2258.method1102(new class542(class360.field4757), arg0 + 24);
            class154.field2259.method1102(new class542(class426.field5969), 92);
            class154.field2260.method1102(new class279(class378.field5060, "huffman"), 93);
            class154.field2261.method1102(new class542(class402.field5641), arg0 + 15);
            class154.field2262.method1102(new class542(class221.field3091), 63);
            class154.field2263.method1102(new class542(class55.field627), 120);
            class154.field2264.method1102(new class123(class114.field1580, "details"), 45);
            for (int var1 = 0; var1 < class2.field7.length; var1++) {
                if (class2.field7[var1].method1101((byte) -93) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class154[] var3 = class2.field7;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class154 var5 = var3[var4];
                int var6 = var5.method1100((byte) -108);
                int var7 = var5.method1101((byte) -93).method301(28158);
                var2 += var6 * var7 / 100;
            }
            class705.field9965 = 2;
            class655.field9109 = var2;
        }
        if (class2.field7 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class154[] var11 = class2.field7;
        if (arg0 != 48) {
            return 83;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            class154 var16 = var11[var12];
            int var17 = var16.method1100((byte) -108);
            int var18 = var16.method1101((byte) -93).method301(arg0 ^ 0x6DCE);
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class31) class154.field2243.method1101((byte) -93)).method298((byte) 70)) {
                class647.field8937.method1515(arg0 + 31531);
            }
            class2.field7 = null;
        }
        int var13 = var9 - class655.field9109;
        int var14 = var8 - class655.field9109;
        int var15 = var14 <= 0 ? 100 : var13 * 100 / var14;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!jl", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 326)
    public final void windowClosed(WindowEvent arg0) {
        field3331++;
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)Z", line = 334)
    public final boolean method1520(int arg0) {
        field3351++;
        if (arg0 != -1) {
            this.field3347 = true;
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
                this.method1524(0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "(I)Z", line = 373)
    public final boolean method1521(int arg0) {
        field3338++;
        if (arg0 != -1) {
            provideLoaderApplet(null);
        }
        return class28.method266(true, "jaclib");
    }

    @OriginalMember(owner = "client!jl", name = "destroy", descriptor = "()V", line = 384)
    public final void destroy() {
        field3355++;
        if (class356.field4728 == this && !class562.field7598) {
            class543.field7379 = class577.method3295((byte) 15);
            class519.method2960(-72, 5000L);
            class51.field596 = null;
            this.method1529(false, 99);
        }
    }

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "(I)Ljava/lang/String;", line = 399)
    public String method1522(int arg0) {
        if (arg0 >= -76) {
            return null;
        } else {
            field3346++;
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILjava/lang/String;IBIZ)V", line = 415)
    public final void method1523(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5, int arg6, boolean arg7) {
        try {
            class222.field3096 = arg2;
            class148.field2192 = arg2;
            class356.field4728 = this;
            class323.field4401 = 0;
            class26.field332 = null;
            class703.field9949 = 0;
            class340.field4553 = arg0;
            class595.field8319 = arg0;
            class201.field2847 = arg4;
            class130.field1868 = new Frame();
            class130.field1868.setTitle("Jagex");
            class130.field1868.setResizable(true);
            class130.field1868.addWindowListener(this);
            class130.field1868.setVisible(true);
            class130.field1868.toFront();
            Insets var9 = class130.field1868.getInsets();
            class130.field1868.setSize(class148.field2192 + var9.right + var9.left, class595.field8319 + var9.bottom + var9.top);
            int var10 = -67 % ((56 - arg5) / 39);
            class51.field596 = class543.field7374 = new class105(arg1, arg3, arg6, true);
            class70 var11 = class543.field7374.method757((byte) 105, 1, this);
            while (var11.field948 == 0) {
                class519.method2960(-42, 10L);
            }
        } catch (Exception var13) {
            class413.method2400(null, var13, (byte) -43);
        }
        field3343++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;)V", line = 456)
    public final void method1524(int arg0, String arg1) {
        field3326++;
        if (arg0 != 0) {
            this.method1522(-127);
        }
        if (this.field3347) {
            return;
        }
        this.field3347 = true;
        System.out.println("error_game_" + arg1);
        try {
            class204.method1329((byte) -57, class59.field668, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "(I)V", line = 483)
    private final void method1525(int arg0) {
        field3330++;
        long var2 = class577.method3295((byte) 15);
        long var4 = class90.field1292[class543.field7376];
        class90.field1292[class543.field7376] = var2;
        class543.field7376 = class543.field7376 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class131.field1883 = ((var6 >> 1) + 32000) / var6;
        }
        if (class163.field2336++ > 50) {
            class163.field2336 -= 50;
            class262.field3554 = true;
            class611.field8473.setSize(class222.field3096, class340.field4553);
            class611.field8473.setVisible(true);
            if (class130.field1868 != null && class54.field613 == null) {
                Insets var7 = class130.field1868.getInsets();
                class611.field8473.setLocation(var7.left + class323.field4401, class703.field9949 + var7.top);
            } else {
                class611.field8473.setLocation(class323.field4401, class703.field9949);
            }
        }
        if (arg0 == -1710411295) {
            this.method1516((byte) -128);
        }
    }

    @OriginalMember(owner = "client!jl", name = "stop", descriptor = "()V", line = 528)
    public final void stop() {
        field3342++;
        if (class356.field4728 == this && !class562.field7598) {
            class543.field7379 = class577.method3295((byte) 15) + 4000L;
        }
    }

    @OriginalMember(owner = "client!jl", name = "start", descriptor = "()V", line = 539)
    public final void start() {
        field3336++;
        if (class356.field4728 == this && !class562.field7598) {
            class543.field7379 = 0L;
        }
    }

    @OriginalMember(owner = "client!jl", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 552)
    public final void windowIconified(WindowEvent arg0) {
        field3360++;
    }

    @OriginalMember(owner = "client!jl", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 564)
    public final void windowClosing(WindowEvent arg0) {
        field3337++;
        this.destroy();
    }

    @OriginalMember(owner = "client!jl", name = "run", descriptor = "()V", line = 576)
    public final void run() {
        field3359++;
        try {
            if (class105.field1477 != null) {
                String var1 = class105.field1477.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class105.field1480;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1524(0, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class105.field1480 == null || class105.field1480.equals("1.4.2"))) {
                    this.method1524(0, "wrongjava");
                    return;
                }
            }
            if (class105.field1480 != null && class105.field1480.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class105.field1480.length()) {
                    char var5 = class105.field1480.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class127.field1825 = true;
                }
            }
            Applet var6 = class356.field4728;
            if (class59.field668 != null) {
                var6 = class59.field668;
            }
            Method var7 = class105.field1459;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class567.method3243(true);
            class63.method519(58);
            this.method1518(0);
            this.method1528(108);
            class541.field7317 = class577.method3296((byte) 94);
            while (class543.field7379 == 0L || class577.method3295((byte) 15) < class543.field7379) {
                class631.field8752 = class541.field7317.method281(-84, class99.field1386);
                for (int var8 = 0; var8 < class631.field8752; var8++) {
                    this.method1512(0);
                }
                this.method1525(-1710411295);
                class95.method697(false, class611.field8473, class543.field7374);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class413.method2400(this.method1522(-110), var20, (byte) -56);
            this.method1524(0, "crash");
        } finally {
            Object var13 = null;
            this.method1529(true, 99);
        }
    }

    @OriginalMember(owner = "client!jl", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 697)
    public final URL getDocumentBase() {
        field3353++;
        if (class130.field1868 == null) {
            return class59.field668 == null || class59.field668 == this ? super.getDocumentBase() : class59.field668.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 718)
    public final synchronized void paint(Graphics arg0) {
        field3334++;
        if (class356.field4728 != this || class562.field7598) {
            return;
        }
        class262.field3554 = true;
        if (class127.field1825 && class577.method3295((byte) 15) - class403.field5670 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class148.field2192 <= var2.width && var2.height >= class595.field8319) {
                class529.field7170 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 742)
    public final void windowDeactivated(WindowEvent arg0) {
        field3339++;
    }

    @OriginalMember(owner = "client!jl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 750)
    public final void focusGained(FocusEvent arg0) {
        field3344++;
        class5.field36 = true;
        class262.field3554 = true;
    }

    @OriginalMember(owner = "client!jl", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 759)
    public final void windowOpened(WindowEvent arg0) {
        field3352++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V", line = 767)
    private final void method1529(boolean arg0, int arg1) {
        field3328++;
        synchronized (this) {
            if (class562.field7598) {
                return;
            }
            class562.field7598 = true;
            if (arg1 != 99) {
                this.destroy();
            }
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class59.field668 != null) {
            class59.field668.destroy();
        }
        try {
            this.method1517(0);
        } catch (Exception var9) {
        }
        if (this.field3357) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field3357 = false;
        }
        class429.method2462(true, (byte) 98);
        class127.method907((byte) -100);
        if (class611.field8473 != null) {
            try {
                class611.field8473.removeFocusListener(this);
                class611.field8473.getParent().remove(class611.field8473);
            } catch (Exception var7) {
            }
        }
        if (class543.field7374 != null) {
            try {
                class543.field7374.method767(-3642);
            } catch (Exception var6) {
            }
        }
        this.method1527(-111);
        if (class130.field1868 != null) {
            class130.field1868.setVisible(false);
            class130.field1868.dispose();
            class130.field1868 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!jl", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 842)
    public final void windowActivated(WindowEvent arg0) {
        field3335++;
    }

    @OriginalMember(owner = "client!jl", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 850)
    public final AppletContext getAppletContext() {
        field3333++;
        if (class130.field1868 == null) {
            return class59.field668 == null || class59.field668 == this ? super.getAppletContext() : class59.field668.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 867)
    public final void focusLost(FocusEvent arg0) {
        class5.field36 = false;
        field3348++;
    }

    @OriginalMember(owner = "client!jl", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 883)
    public final void windowDeiconified(WindowEvent arg0) {
        field3354++;
    }

    @OriginalMember(owner = "client!jl", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 896)
    public final String getParameter(String arg0) {
        field3350++;
        if (class130.field1868 == null) {
            return class59.field668 == null || class59.field668 == this ? super.getParameter(arg0) : class59.field668.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public abstract void method1516(byte arg0);

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public abstract void method1517(int arg0);

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "(I)V")
    public abstract void method1526(int arg0);

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "(I)V")
    public abstract void method1527(int arg0);

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "(I)V")
    public abstract void method1528(int arg0);

    @OriginalMember(owner = "client!jl", name = "init", descriptor = "()V")
    public abstract void init();
}
