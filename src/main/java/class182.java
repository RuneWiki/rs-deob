import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class182 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "Z")
    private boolean field2304 = false;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "Z")
    private boolean field2317 = false;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "Lfd;")
    public static class194 field2311 = null;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field2309 = new String[200];

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field2320 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lhl;")
    public static class59 field2291;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "Z")
    public static boolean field2322;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Z")
    public static boolean field2323;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "Z")
    public static boolean field2324;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "Z")
    public static boolean field2325;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
    public static boolean field2326;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[[I")
    public static int[][] field2305;

    @OriginalMember(owner = "client!hh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6)
    public final void windowClosed(WindowEvent arg0) {
        field2321++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 13)
    public final synchronized void method963(int arg0) {
        if (class38.field391 != null) {
            class38.field391.removeFocusListener(this);
            class38.field391.getParent().remove(class38.field391);
        }
        field2287++;
        Container var2;
        if (class171.field2153 != null) {
            var2 = class171.field2153;
        } else if (class213.field2888 == null) {
            var2 = class159.field2055.field6532;
        } else {
            var2 = class213.field2888;
        }
        var2.setLayout((LayoutManager) null);
        class38.field391 = new class139(this);
        var2.add(class38.field391);
        class38.field391.setSize(class333.field4423, class337.field4496);
        class38.field391.setVisible(true);
        if (class213.field2888 == var2) {
            Insets var3 = class213.field2888.getInsets();
            class38.field391.setLocation(class373.field5207 + var3.left, var3.top - -class266.field3626);
        } else {
            class38.field391.setLocation(class373.field5207, class266.field3626);
        }
        class38.field391.addFocusListener(this);
        class38.field391.requestFocus();
        class359.field5086 = true;
        class58.field609 = true;
        class213.field2886 = true;
        if (arg0 != 0) {
            this.method978(-35);
        }
        class14.field128 = false;
        class187.field2359 = class442.method2730(25207);
    }

    @OriginalMember(owner = "client!hh", name = "providesignlink", descriptor = "(Llh;)V", line = 62)
    public static final void providesignlink(class450 arg0) {
        class159.field2055 = arg0;
        class291.field3958 = arg0;
        field2316++;
    }

    @OriginalMember(owner = "client!hh", name = "stop", descriptor = "()V", line = 70)
    public final void stop() {
        field2307++;
        if (class166.field2112 == this && !class227.field3105) {
            class382.field5438 = class442.method2730(25207) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "destroy", descriptor = "()V", line = 82)
    public final void destroy() {
        field2312++;
        if (class166.field2112 == this && !class227.field3105) {
            class382.field5438 = class442.method2730(25207);
            class370.method2235(5000L, 10);
            class291.field3958 = null;
            this.method972(12, false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "run", descriptor = "()V", line = 99)
    public final void run() {
        field2310++;
        try {
            label114: {
                if (class450.field6535 != null) {
                    String var1 = class450.field6535.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class450.field6541;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method973("wrongjava", 300);
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class450.field6541 == null || class450.field6541.equals("1.4.2"))) {
                        this.method973("wrongjava", 300);
                        break label114;
                    }
                }
                if (class450.field6541 != null && class450.field6541.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class450.field6541.length() > var3) {
                        char var5 = class450.field6541.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class315.field4216 = true;
                    }
                }
                if (class159.field2055.field6532 != null) {
                    Method var6 = class450.field6551;
                    if (var6 != null) {
                        try {
                            var6.invoke(class159.field2055.field6532, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class279.method1542(1);
                this.method963(0);
                this.method962((byte) -86);
                class327.field4354 = class374.method2250(-99);
                this.method974(100);
                while (class382.field5438 == 0L || class382.field5438 > class442.method2730(25207)) {
                    class185.field2351 = class327.field4354.method136(1, class250.field3434);
                    for (int var7 = 0; var7 < class185.field2351; var7++) {
                        this.method976(6);
                    }
                    this.method966(9313);
                    class411.method2559(class159.field2055, 127, class38.field391);
                }
            }
        } catch (Exception var10) {
            class254.method1439(22292, var10, (String) null);
            this.method973("crash", 300);
        }
        this.method972(12, true);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 214)
    private final void method966(int arg0) {
        field2292++;
        long var2 = class442.method2730(25207);
        long var4 = class2.field18[class274.field3696];
        class2.field18[class274.field3696] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class452.field6584 = ((var6 >> 1) + 32000) / var6;
        }
        class274.field3696 = class274.field3696 + 1 & 0x1F;
        if ((class155.field1958++) > 50) {
            class213.field2886 = true;
            class155.field1958 -= 50;
            class38.field391.setSize(class333.field4423, class337.field4496);
            class38.field391.setVisible(true);
            if (class213.field2888 != null && class171.field2153 == null) {
                Insets var7 = class213.field2888.getInsets();
                class38.field391.setLocation(var7.left + class373.field5207, class266.field3626 + var7.top);
            } else {
                class38.field391.setLocation(class373.field5207, class266.field3626);
            }
        }
        if (arg0 != 9313) {
            field2291 = null;
        }
        this.method964((byte) -8);
    }

    @OriginalMember(owner = "client!hh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 265)
    public final void windowIconified(WindowEvent arg0) {
        field2288++;
    }

    @OriginalMember(owner = "client!hh", name = "start", descriptor = "()V", line = 273)
    public final void start() {
        field2293++;
        if (class166.field2112 == this && !class227.field3105) {
            class382.field5438 = 0L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 287)
    public final void windowActivated(WindowEvent arg0) {
        field2318++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/awt/Color;ZLjava/awt/Color;ILjava/awt/Color;Ljava/lang/String;)V", line = 299)
    public static final void method968(int arg0, Color arg1, boolean arg2, Color arg3, int arg4, Color arg5, String arg6) {
        field2302++;
        try {
            if (arg4 != -26) {
                method975(12);
            }
            Graphics var7 = class38.field391.getGraphics();
            if (class40.field406 == null) {
                class40.field406 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class333.field4423, class337.field4496);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class335.field4451 == null) {
                    class335.field4451 = class38.field391.createImage(304, 34);
                }
                Graphics var8 = class335.field4451.getGraphics();
                var8.setColor(arg1);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg5);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var8.setFont(class40.field406);
                var8.setColor(arg3);
                var8.drawString(arg6, (304 - (arg6.length() * 6)) / 2, 22);
                var7.drawImage(class335.field4451, class333.field4423 / 2 - 152, class337.field4496 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class333.field4423 / 2 - 152;
                int var10 = class337.field4496 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + (var9 + 2), var10 - -2, 300 - (arg0 * 3), 30);
                var7.setFont(class40.field406);
                var7.setColor(arg3);
                var7.drawString(arg6, var9 + ((304 - arg6.length() * 6) / 2), var10 + 22);
            }
            if (class114.field1410 != null) {
                var7.setFont(class40.field406);
                var7.setColor(arg3);
                var7.drawString(class114.field1410, class333.field4423 / 2 - class114.field1410.length() * 6 / 2, class337.field4496 / 2 + -26);
            }
        } catch (Exception var12) {
            class38.field391.repaint();
        }
    }

    @OriginalMember(owner = "client!hh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 379)
    public final void windowDeiconified(WindowEvent arg0) {
        field2303++;
    }

    @OriginalMember(owner = "client!hh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 387)
    public final synchronized void paint(Graphics arg0) {
        field2301++;
        if (class166.field2112 != this || class227.field3105) {
            return;
        }
        class213.field2886 = true;
        if (class315.field4216 && (class442.method2730(25207) - class187.field2359) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class154.field1947 && var2.height >= class216.field2894) {
                class14.field128 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 410)
    public final String getParameter(String arg0) {
        field2285++;
        if (class213.field2888 == null) {
            return class159.field2055 == null || class159.field2055.field6532 == this ? super.getParameter(arg0) : class159.field2055.field6532.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 428)
    public final void focusLost(FocusEvent arg0) {
        field2315++;
        class359.field5086 = false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BI)Lml;", line = 437)
    public static final class451 method969(byte[] arg0, int arg1) {
        field2290++;
        class451 var2 = new class451();
        class250 var3 = new class250(arg0);
        var3.field3389 = var3.field3406.length - 2;
        int var4 = var3.method1374(-2);
        int var5 = var3.field3406.length - var4 - 2 - 12;
        var3.field3389 = var5;
        int var6 = var3.method1359(arg1 ^ 0x6473);
        var2.field6559 = var3.method1374(-2);
        var2.field6557 = var3.method1374(arg1 - 25742);
        var2.field6562 = var3.method1374(-2);
        var2.field6558 = var3.method1374(arg1 ^ 0xFFFF9B72);
        int var7 = var3.method1350(31351);
        if (var7 > 0) {
            var2.field6560 = new class58[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1374(arg1 - 25742);
                class58 var10 = new class58(class322.method1853(117, var9));
                var2.field6560[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1359(255);
                    int var12 = var3.method1359(255);
                    var10.method314((long) var11, new class310(var12), arg1 - 18661);
                }
            }
        }
        if (arg1 != 25740) {
            return null;
        }
        var3.field3389 = 0;
        var2.field6563 = var3.method1353(-98);
        var2.field6566 = new String[var6];
        var2.field6555 = new int[var6];
        var2.field6565 = new int[var6];
        int var13 = 0;
        while (var3.field3389 < var5) {
            int var14 = var3.method1374(-2);
            if (var14 == 3) {
                var2.field6566[var13] = var3.method1349(-1754884856).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field6555[var13] = var3.method1350(31351);
            } else {
                var2.field6555[var13] = var3.method1359(255);
            }
            var2.field6565[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 516)
    public final AppletContext getAppletContext() {
        field2297++;
        if (class213.field2888 == null) {
            return class159.field2055 == null || class159.field2055.field6532 == this ? super.getAppletContext() : class159.field2055.field6532.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;IIIIZZI)V", line = 533)
    public final void method970(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field2296++;
        try {
            class373.field5207 = 0;
            class266.field3626 = 0;
            class337.field4496 = arg4;
            class216.field2894 = arg4;
            class436.field6381 = arg1;
            class333.field4423 = arg3;
            class154.field1947 = arg3;
            class166.field2112 = this;
            class213.field2888 = new Frame();
            class213.field2888.setTitle("Jagex");
            class213.field2888.setResizable(arg6);
            class213.field2888.addWindowListener(this);
            class213.field2888.setVisible(true);
            class213.field2888.toFront();
            Insets var9 = class213.field2888.getInsets();
            class213.field2888.setSize(class154.field1947 + var9.left + var9.right, var9.top + var9.bottom + class216.field2894);
            class291.field3958 = class159.field2055 = new class450((Applet) null, arg7, arg0, arg2);
            class304 var10 = class159.field2055.method2788(this, 1, 24);
            while (var10.field4123 == 0) {
                class370.method2235(10L, 10);
            }
        } catch (Exception var12) {
            class254.method1439(22292, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIBI)V", line = 572)
    public final void method971(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2299++;
        try {
            if (class166.field2112 == null) {
                class436.field6381 = arg2;
                class266.field3626 = 0;
                class337.field4496 = arg1;
                class216.field2894 = arg1;
                class166.field2112 = this;
                if (arg3 == -96) {
                    class333.field4423 = arg0;
                    class154.field1947 = arg0;
                    class373.field5207 = 0;
                    if (class159.field2055 == null) {
                        class291.field3958 = class159.field2055 = new class450(this, arg4, (String) null, 0);
                    }
                    class304 var6 = class159.field2055.method2788(this, 1, 47);
                    while (var6.field4123 == 0) {
                        class370.method2235(10L, 10);
                    }
                }
            } else {
                class294.field3994++;
                if (class294.field3994 >= 3) {
                    this.method973("alreadyloaded", 300);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class254.method1439(arg3 + 22388, var8, (String) null);
            this.method973("crash", 300);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V", line = 622)
    private final void method972(int arg0, boolean arg1) {
        field2294++;
        synchronized (this) {
            if (class227.field3105) {
                return;
            }
            class227.field3105 = true;
        }
        if (class159.field2055.field6532 != null) {
            class159.field2055.field6532.destroy();
        }
        try {
            this.method978(-27214);
        } catch (Exception var11) {
        }
        if (this.field2304) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field2304 = false;
        }
        if (arg0 != 12) {
            this.getCodeBase();
        }
        class304 var4 = class159.field2055.method2794(arg0 + 188, class166.field2112.getClass());
        while (var4.field4123 == 0) {
            class370.method2235(100L, arg0 - 2);
        }
        if (class38.field391 != null) {
            try {
                class38.field391.removeFocusListener(this);
                class38.field391.getParent().remove(class38.field391);
            } catch (Exception var9) {
            }
        }
        if (class159.field2055 != null) {
            try {
                class159.field2055.method2789((byte) 108);
            } catch (Exception var8) {
            }
        }
        this.method967(-113);
        if (class213.field2888 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 703)
    public final void method973(String arg0, int arg1) {
        field2283++;
        if (arg1 != 300 || this.field2317) {
            return;
        }
        this.field2317 = true;
        System.out.println("error_game_" + arg0);
        try {
            class245.method1313(class159.field2055.field6532, (byte) 125, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 729)
    public final URL getCodeBase() {
        field2308++;
        if (class213.field2888 == null) {
            return class159.field2055 == null || class159.field2055.field6532 == this ? super.getCodeBase() : class159.field2055.field6532.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 744)
    public final void method974(int arg0) {
        if (arg0 != 100) {
            return;
        }
        field2289++;
        if (this.field2304) {
            return;
        }
        try {
            class304 var2 = class159.field2055.method2795(class166.field2112.getClass(), arg0 ^ 0x71);
            while (var2.field4123 == 0) {
                class370.method2235(100L, 10);
            }
            if (var2.field4126 != null) {
                throw (Throwable) var2.field4126;
            }
            jagmisc.init();
            this.field2304 = true;
            class327.field4354 = class374.method2250(62);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 775)
    public final URL getDocumentBase() {
        field2286++;
        if (class213.field2888 == null) {
            return class159.field2055 == null || class159.field2055.field6532 == this ? super.getDocumentBase() : class159.field2055.field6532.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 790)
    public final void windowDeactivated(WindowEvent arg0) {
        field2300++;
    }

    @OriginalMember(owner = "client!hh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 799)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2298++;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V", line = 815)
    public static void method975(int arg0) {
        field2311 = null;
        field2305 = null;
        field2291 = null;
        field2309 = null;
        if (arg0 != -51) {
            method968(-4, (Color) null, true, (Color) null, 111, (Color) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 828)
    public final void focusGained(FocusEvent arg0) {
        class359.field5086 = true;
        field2284++;
        class213.field2886 = true;
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V", line = 843)
    private final void method976(int arg0) {
        field2306++;
        long var2 = class442.method2730(25207);
        long var4 = class436.field6374[class416.field5989];
        class436.field6374[class416.field5989] = var2;
        class416.field5989 = class416.field5989 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class58.field609 = class359.field5086;
            if (arg0 != 6) {
                this.windowClosing((WindowEvent) null);
            }
        }
        this.method965(true);
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)Z", line = 876)
    public final boolean method977(int arg0) {
        int var2 = -7 % ((arg0 - 69) / 34);
        field2313++;
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.equals("stellardawn.com") || var3.endsWith(".stellardawn.com")) {
            return true;
        } else if (var3.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var3.length() > 0 && var3.charAt(var3.length() - 1) >= '0' && var3.charAt(var3.length() - 1) <= '9') {
                var3 = var3.substring(0, var3.length() - 1);
            }
            if (var3.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method973("invalidhost", 300);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 916)
    public final void windowOpened(WindowEvent arg0) {
        field2295++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lwc;", line = 927)
    public static final class367 method979(int arg0, int arg1) {
        if (arg0 <= 19) {
            providesignlink((class450) null);
        }
        field2314++;
        return (class367) class106.field1305.method308((long) arg1, (byte) -93);
    }

    @OriginalMember(owner = "client!hh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 938)
    public final void update(Graphics arg0) {
        field2319++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public abstract void method962(byte arg0);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public abstract void method964(byte arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public abstract void method965(boolean arg0);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public abstract void method967(int arg0);

    @OriginalMember(owner = "client!hh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V")
    public abstract void method978(int arg0);
}
