import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class44 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Z")
    private boolean field955 = false;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lvc;")
    public static class137 field957 = class45.method325("Fehler beim Laden Ihres Spielcharakters)3", -46);

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "Lvc;")
    public static class137 field979 = class45.method325("Lade Titelbild )2 ", -46);

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field981 = -1;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field973 = 0;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "Lvc;")
    public static class137 field984 = class45.method325("Hidden)2", -46);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Lvd;")
    public static class138 field965;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Ljava/awt/Frame;")
    public static Frame field963;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "Z")
    public static boolean field986;

    @OriginalMember(owner = "client!ga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field975++;
        if (field963 == null) {
            return class131.field3048 == null || class131.field3048.field1116 == this ? super.getDocumentBase() : class131.field3048.field1116.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field944++;
        class21.field424 = false;
    }

    @OriginalMember(owner = "client!ga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field970++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static final void method303(boolean arg0) {
        field954++;
        try {
            if (arg0) {
                field981 = -22;
            }
            Graphics var1 = class124.field2871.getGraphics();
            class84.field1903.method61(550, var1, 4, (byte) -36);
        } catch (Exception var2) {
            class124.field2871.repaint();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public abstract void method186(byte arg0);

    @OriginalMember(owner = "client!ga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field982++;
    }

    @OriginalMember(owner = "client!ga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field946++;
    }

    @OriginalMember(owner = "client!ga", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ga", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field972++;
        if (class72.field1531 == this && !class100.field2345) {
            class2.field33 = class60.method432(true);
            class28.method219(true, 5000L);
            class49.field1103 = null;
            this.method310(false);
        }
    }

    @OriginalMember(owner = "client!ga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field964++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public abstract void method191(int arg0);

    @OriginalMember(owner = "client!ga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field948++;
        if (class72.field1531 != this || class100.field2345) {
            return;
        }
        class86.field2058 = true;
        if (class50.field1115 != null && class50.field1115.startsWith("1.5") && class60.method432(true) - class106.field2480 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class23.field528 && class32.field688 <= var2.height) {
                class64.field1351 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field949++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    private final void method304(int arg0) {
        long var2 = class132.field3070[class58.field1228];
        field952++;
        long var4 = class60.method432(true);
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 != 1000) {
            return;
        }
        class132.field3070[class58.field1228] = var4;
        class58.field1228 = class58.field1228 + 1 & 0x1F;
        synchronized (this) {
            class83.field1868 = class21.field424;
        }
        this.method194(arg0 ^ 0xFFFFF7E0);
    }

    @OriginalMember(owner = "client!ga", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field977++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public static final void method305(byte arg0) {
        int var1 = -4 / (arg0 / 47);
        field950++;
        if (class98.field2272 == null) {
            return;
        }
        class85 var2 = class98.field2272;
        class85 var3 = class86.method638(var2, 255);
        if (var3 == null) {
            class98.field2272 = null;
            return;
        }
        class108.field2520++;
        int[] var4 = class39.method289(2567, var3);
        int[] var5 = class39.method289(2567, var2);
        int var6 = class32.field693 - class53.field1180;
        int var7 = class126.field2956 - class82.field1837;
        if (var7 <= var2.field1935 && var7 >= -var2.field1935 && var6 <= var2.field1935 && -var2.field1935 <= var6 && !class125.field2913) {
            var7 = 0;
            var6 = 0;
        } else if (class108.field2520 > var2.field1941 || class125.field2913) {
            class125.field2913 = true;
        } else {
            var6 = 0;
            var7 = 0;
        }
        int var8 = var7 + var5[0] - var4[0];
        int var9 = var5[1] + var6 - var4[1];
        if (var9 < 0) {
            var9 = 0;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        if (var3.field1929 < var8 + var2.field1929) {
            var8 = var3.field1929 - var2.field1929;
        }
        if (var9 + var2.field1975 > var3.field1975) {
            var9 = var3.field1975 - var2.field1975;
        }
        if (class98.field2272.field1946 != null && class125.field2913) {
            class63.method461(var9, null, var2.field1946, 0, (byte) 91, var8, var2);
        }
        if (class131.field3049 != 0) {
            return;
        }
        if (class125.field2913) {
            int var10 = class126.field2956 - var4[0];
            if (var10 < 0) {
                var10 = 0;
            }
            if (var3.field1929 - 1 < var10) {
                var10 = var3.field1929 - 1;
            }
            int var11 = class32.field693 - var4[1];
            if (var11 < 0) {
                var11 = 0;
            }
            if (var3.field1975 - 1 < var11) {
                var11 = var3.field1975 - 1;
            }
            class85 var12 = class108.method786((byte) 104, var3, var2, var10, var11);
            if (class98.field2272.field1962 != null) {
                class63.method461(var9, var12, var2.field1962, 0, (byte) 67, var8, var2);
            }
            if (var12 != null && class111.method858(var2, (byte) -87) != null) {
                class84.field1885++;
                class72.field1527.method845(112, 100);
                class72.field1527.method793(var2.field1920, (byte) 73);
                class72.field1527.method823(var12.field1920, -68);
                class72.field1527.method828(var12.field1910, 35);
                class72.field1527.method817(-2770, var2.field1910);
            }
        } else {
            if (class98.field2272.field1968 != null) {
                class63.method461(var9, null, var2.field1968, 0, (byte) 122, var8, var2);
            }
            if ((client.field498 == 1 || class83.method604(class59.field1270 - 1, 117)) && class59.field1270 > 2) {
                class22.method200(-5);
            } else if (class59.field1270 > 0) {
                class23.method207(class59.field1270 - 1, 0);
            }
        }
        class98.field2272 = null;
        return;
    }

    @OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
    public final void run() {
        field959++;
        try {
            if (class50.field1124 != null) {
                String var1 = class50.field1124.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class50.field1115;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method318("wrongjava", 0);
                        return;
                    }
                    class110.field2609 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class50.field1115 == null || class50.field1115.equals("1.4.2"))) {
                    this.method318("wrongjava", 0);
                    return;
                }
            }
            if (class131.field3048.field1116 != null) {
                Method var3 = class50.field1114;
                if (var3 != null) {
                    try {
                        var3.invoke(class131.field3048.field1116, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method317(2616);
            class126.field2927 = method311(class23.field528, -118, class32.field688, class124.field2871);
            this.method191(40000);
            class84.field1906 = class132.method966((byte) -62);
            class84.field1906.method23(true);
            while (class2.field33 == 0L || class2.field33 > class60.method432(true)) {
                class124.field2867 = class84.field1906.method30(class110.field2609, true, class7.field151);
                for (int var4 = 0; var4 < class124.field2867; var4++) {
                    this.method304(1000);
                }
                this.method308(false);
            }
        } catch (Exception var7) {
            class110.method850((byte) -106, null, var7);
            this.method318("crash", 0);
        }
        this.method310(false);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;IZIIILjava/net/InetAddress;I)V")
    public final void method306(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, InetAddress arg6, int arg7) {
        field971++;
        try {
            class72.field1531 = this;
            class32.field688 = arg4;
            class23.field528 = arg3;
            class46.field1025 = arg5;
            field963 = new Frame();
            field963.setTitle("Jagex");
            field963.setResizable(false);
            field963.addWindowListener(this);
            field963.setVisible(arg2);
            field963.toFront();
            Insets var9 = field963.getInsets();
            field963.setSize(arg3 + var9.left + var9.right, var9.top + arg4 + var9.bottom);
            class49.field1103 = class131.field3048 = new class50(true, null, arg6, arg1, arg0, arg7);
            class131.field3048.method358(this, 1, 0);
        } catch (Exception var11) {
            class110.method850((byte) 124, null, var11);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public abstract void method192(int arg0);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)Z")
    public final boolean method307(int arg0) {
        field966++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = 2 % ((arg0 + 15) / 48);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method318("invalidhost", 0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    private final void method308(boolean arg0) {
        field958++;
        long var2 = class60.method432(true);
        long var4 = class102.field2365[class134.field3120];
        class102.field2365[class134.field3120] = var2;
        if (arg0) {
            return;
        }
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class82.field1839 = ((var6 >> 1) + 32000) / var6;
        }
        class134.field3120 = class134.field3120 + 1 & 0x1F;
        if (class85.field2034++ > 50) {
            class86.field2058 = true;
            class85.field2034 -= 50;
            class124.field2871.setSize(class23.field528, class32.field688);
            class124.field2871.setVisible(true);
            if (field963 == null) {
                class124.field2871.setLocation(0, 0);
            } else {
                Insets var7 = field963.getInsets();
                class124.field2871.setLocation(var7.left, var7.top);
            }
        }
        this.method186((byte) 113);
    }

    @OriginalMember(owner = "client!ga", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field969++;
        if (field963 == null) {
            return class131.field3048 == null || class131.field3048.field1116 == this ? super.getCodeBase() : class131.field3048.field1116.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[Lme;IIIIIBII)Z")
    public static final boolean method309(int arg0, class85[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        class62.method455(arg5, arg9, arg6, arg3);
        field978++;
        boolean var10 = true;
        if (arg7 > -126) {
            method309(-22, null, -59, 24, -120, -77, -59, (byte) -105, 49, 69);
        }
        for (int var11 = 0; var11 < arg1.length; var11++) {
            class85 var12 = arg1[var11];
            if (var12 != null && (var12.field1945 == arg0 || arg0 == -1412584499 && class98.field2272 == var12)) {
                if (var12.field1914 > 0) {
                    class30.method228(23787, var12);
                }
                int var13 = var12.field2007 + arg9 - arg4;
                int var14 = var12.field1926;
                int var15 = var12.field1985 + arg5 - arg8;
                if (class98.field2272 == var12) {
                    if (arg0 != -1412584499 && !var12.field1999) {
                        class126.field2947 = arg4;
                        class46.field1023 = arg1;
                        class39.field870 = arg8;
                        continue;
                    }
                    class85 var16 = class86.method638(var12, 255);
                    if (var16 == null) {
                        class98.field2272 = null;
                    } else {
                        int[] var17 = class39.method289(2567, var16);
                        int[] var18 = class39.method289(2567, var12);
                        if (!var12.field1999) {
                            var14 = 128;
                        }
                        int var19 = class126.field2956 - class82.field1837;
                        int var20 = class32.field693 - class53.field1180;
                        if (var19 <= var12.field1935 && -var12.field1935 <= var19 && var12.field1935 >= var20 && var20 >= -var12.field1935 && !class125.field2913) {
                            var19 = 0;
                            var20 = 0;
                        } else if (var12.field1941 < class108.field2520 || class125.field2913) {
                            class125.field2913 = true;
                        } else {
                            var19 = 0;
                            var20 = 0;
                        }
                        int var21 = var18[0] + var19 - var17[0];
                        int var22 = var18[1] + var20 - var17[1];
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var12.field1929 + var21 > var16.field1929) {
                            var21 = var16.field1929 - var12.field1929;
                        }
                        var15 = var17[0] + var21;
                        if (var12.field1975 + var22 > var16.field1975) {
                            var22 = var16.field1975 - var12.field1975;
                        }
                        var13 = var17[1] + var22;
                    }
                }
                if ((!var12.field1967 || class62.field1333 >= var15 && var13 <= class62.field1334 && class62.field1332 <= var12.field1929 + var15 && var12.field1975 + var13 >= class62.field1330) && (!var12.field1967 || !class8.method58(var12, 1792))) {
                    if (var12.field1952 == 0) {
                        if (!var12.field1967 && class8.method58(var12, 1792) && !class12.method75(arg2, (byte) -45, var11)) {
                            continue;
                        }
                        if (!var12.field1967) {
                            if (var12.field1927 > var12.field1993 - var12.field1975) {
                                var12.field1927 = var12.field1993 - var12.field1975;
                            }
                            if (var12.field1927 < 0) {
                                var12.field1927 = 0;
                            }
                        }
                        var10 &= method309(var12.field1910, arg1, arg2, var12.field1975 + var13, var12.field1927, var15, var12.field1929 + var15, (byte) -127, var12.field1932, var13);
                        if (var12.field1980 != null) {
                            var10 &= method309(var12.field1910, var12.field1980, arg2, var13 + var12.field1975, var12.field1927, var15, var15 + var12.field1929, (byte) -128, var12.field1932, var13);
                        }
                        class62.method455(arg5, arg9, arg6, arg3);
                        if (var12.field1975 < var12.field1993 && !var12.field1967) {
                            class114.method887(-7519, var12.field1975, var15 + var12.field1929, var12.field1927, var12.field1993, var13);
                        }
                    }
                    if (var12.field1952 != 1) {
                        if (var12.field1952 == 2) {
                            int var23 = 0;
                            for (int var24 = 0; var24 < var12.field1975; var24++) {
                                for (int var25 = 0; var25 < var12.field1929; var25++) {
                                    int var26 = (var12.field1933 + 32) * var25 + var15;
                                    int var27 = var13 + (var12.field2019 + 32) * var24;
                                    if (var23 < 20) {
                                        var26 += var12.field1965[var23];
                                        var27 += var12.field2014[var23];
                                    }
                                    if (var12.field2008[var23] > 0) {
                                        int var28 = var12.field2008[var23] - 1;
                                        boolean var29 = false;
                                        boolean var30 = false;
                                        if (class62.field1332 - 32 < var26 && var26 < class62.field1333 && var27 > class62.field1330 - 32 && var27 < class62.field1334 || class89.field2134 != 0 && class38.field841 == var23) {
                                            class138 var31;
                                            if (class98.field2288 == 1 && class111.field2647 == var23 && class139.field3228 == var12.field1910) {
                                                var31 = method313((byte) 25, 2, false, 0, var28, var12.field1921[var23]);
                                            } else {
                                                var31 = method313((byte) 25, 1, false, 3153952, var28, var12.field1921[var23]);
                                            }
                                            if (var31 == null) {
                                                var10 = false;
                                            } else if (class89.field2134 != 0 && class38.field841 == var23 && class131.field3052 == var12.field1910) {
                                                int var32 = class126.field2956 - class40.field907;
                                                int var33 = class32.field693 - class69.field1443;
                                                if (var33 < 5 && var33 > -5) {
                                                    var33 = 0;
                                                }
                                                if (var32 < 5 && var32 > -5) {
                                                    var32 = 0;
                                                }
                                                if (class24.field575 < 5) {
                                                    var33 = 0;
                                                    var32 = 0;
                                                }
                                                var31.method1056(var26 + var32, var27 + var33, 128);
                                                if (arg0 != -1) {
                                                    class85 var34 = arg1[arg0 & 0xFFFF];
                                                    if (class62.field1330 > var27 + var33 && var34.field1927 > 0) {
                                                        int var35 = (class62.field1330 - var33 - var27) * class69.field1438 / 3;
                                                        if (class69.field1438 * 10 < var35) {
                                                            var35 = class69.field1438 * 10;
                                                        }
                                                        if (var34.field1927 < var35) {
                                                            var35 = var34.field1927;
                                                        }
                                                        var34.field1927 -= var35;
                                                        class69.field1443 += var35;
                                                    }
                                                    if (class62.field1334 < var33 + var27 + 32 && var34.field1927 < var34.field1993 - var34.field1975) {
                                                        int var36 = (var27 + var33 + 32 - class62.field1334) * class69.field1438 / 3;
                                                        if (class69.field1438 * 10 < var36) {
                                                            var36 = class69.field1438 * 10;
                                                        }
                                                        if (var34.field1993 - var34.field1975 - var34.field1927 < var36) {
                                                            var36 = var34.field1993 - var34.field1975 - var34.field1927;
                                                        }
                                                        class69.field1443 -= var36;
                                                        var34.field1927 += var36;
                                                    }
                                                }
                                            } else if (class58.field1249 != 0 && class25.field593 == var23 && class126.field2965 == var12.field1910) {
                                                var31.method1056(var26, var27, 128);
                                            } else {
                                                var31.method1048(var26, var27);
                                            }
                                        }
                                    } else if (var12.field1954 != null && var23 < 20) {
                                        class138 var37 = var12.method622(var23, 1);
                                        if (var37 != null) {
                                            var37.method1048(var26, var27);
                                        } else if (class82.field1850) {
                                            var10 = false;
                                        }
                                    }
                                    var23++;
                                }
                            }
                        } else if (var12.field1952 == 3) {
                            int var38;
                            if (class10.method64(var12, 0)) {
                                var38 = var12.field1915;
                                if (class12.method75(arg2, (byte) -75, var11) && var12.field2012 != 0) {
                                    var38 = var12.field2012;
                                }
                            } else {
                                var38 = var12.field1931;
                                if (class12.method75(arg2, (byte) 91, var11) && var12.field1947 != 0) {
                                    var38 = var12.field1947;
                                }
                            }
                            if (var14 == 0) {
                                if (var12.field1974) {
                                    class62.method454(var15, var13, var12.field1929, var12.field1975, var38);
                                } else {
                                    class62.method457(var15, var13, var12.field1929, var12.field1975, var38);
                                }
                            } else if (var12.field1974) {
                                class62.method456(var15, var13, var12.field1929, var12.field1975, var38, 256 - (var14 & 0xFF));
                            } else {
                                class62.method448(var15, var13, var12.field1929, var12.field1975, var38, 256 - (var14 & 0xFF));
                            }
                        } else if (var12.field1952 == 4) {
                            class145 var39 = var12.method625(-12863);
                            if (var39 != null) {
                                class137 var40 = var12.field1963;
                                int var41;
                                if (class10.method64(var12, 0)) {
                                    var41 = var12.field1915;
                                    if (class12.method75(arg2, (byte) 92, var11) && var12.field2012 != 0) {
                                        var41 = var12.field2012;
                                    }
                                    if (var12.field2029.method997(-114) > 0) {
                                        var40 = var12.field2029;
                                    }
                                } else {
                                    var41 = var12.field1931;
                                    if (class12.method75(arg2, (byte) 66, var11) && var12.field1947 != 0) {
                                        var41 = var12.field1947;
                                    }
                                }
                                if (var12.field1967 && var12.field1982 != -1) {
                                    class141 var42 = class39.method286((byte) 123, var12.field1982);
                                    var40 = var42.field3316;
                                    if (var40 == null) {
                                        var40 = class36.field797;
                                    }
                                    if ((var42.field3271 == 1 || var12.field1960 != 1) && var12.field1960 != -1) {
                                        var40 = class88.method666(-24, new class137[] { var40, class29.field651, class45.method320(-5, var12.field1960) });
                                    }
                                }
                                if (class105.field2433 == var12.field1910 && class36.field785 == var12.field1920) {
                                    var40 = class75.field1684;
                                    var41 = var12.field1931;
                                }
                                if (class62.field1335 == 479) {
                                    if (var41 == 16776960) {
                                        var41 = 255;
                                    }
                                    if (var41 == 49152) {
                                        var41 = 16777215;
                                    }
                                }
                                class137 var43 = class25.method214(var12, var40, 0);
                                var39.method1134(var43, var15, var13, var12.field1929, var12.field1975, var41, var12.field2004, var12.field1990, var12.field1973, var12.field1911);
                            } else if (class82.field1850) {
                                var10 = false;
                            }
                        } else if (var12.field1952 == 5) {
                            if (var12.field1967) {
                                class138 var44;
                                if (var12.field1982 == -1) {
                                    var44 = var12.method615(false, (byte) 75);
                                } else {
                                    var44 = method313((byte) 25, var12.field1958, false, var12.field1989, var12.field1982, var12.field1960);
                                }
                                if (var44 != null) {
                                    int var45 = var44.field3193;
                                    int var46 = var44.field3197;
                                    if (var12.field2006) {
                                        int[] var48 = new int[4];
                                        class62.method449(var48);
                                        int var49 = var15;
                                        if (var48[0] > var15) {
                                            var49 = var48[0];
                                        }
                                        int var50 = var12.field1929 + var15;
                                        int var51 = var13 + var12.field1975;
                                        if (var50 > var48[2]) {
                                            var50 = var48[2];
                                        }
                                        int var52 = var13;
                                        if (var48[3] < var51) {
                                            var51 = var48[3];
                                        }
                                        if (var13 < var48[1]) {
                                            var52 = var48[1];
                                        }
                                        class62.method455(var49, var52, var50, var51);
                                        int var53 = (var46 + var12.field1929 - 1) / var46;
                                        int var54 = (var12.field1975 + var45 - 1) / var45;
                                        for (int var55 = 0; var55 < var53; var55++) {
                                            for (int var56 = 0; var56 < var54; var56++) {
                                                if (var12.field2033 != 0) {
                                                    var44.method1051(var46 * var55 + var15 + var46 / 2, var45 * var56 + var45 / 2 + var13, var12.field2033, 4096);
                                                } else if (var14 == 0) {
                                                    var44.method1048(var15 + var46 * var55, var45 * var56 + var13);
                                                } else {
                                                    var44.method1056(var46 * var55 + var15, var45 * var56 + var13, 256 - (var14 & 0xFF));
                                                }
                                            }
                                        }
                                        class62.method443(var48);
                                    } else {
                                        int var47 = var12.field1929 * 4096 / var46;
                                        if (var12.field2033 != 0) {
                                            var44.method1051(var12.field1929 / 2 + var15, var13 - -(var12.field1975 / 2), var12.field2033, var47);
                                        } else if (var14 != 0) {
                                            var44.method1053(var15, var13, var12.field1929, var12.field1975, 256 - (var14 & 0xFF));
                                        } else if (var12.field1929 == var46 && var12.field1975 == var45) {
                                            var44.method1048(var15, var13);
                                        } else {
                                            var44.method1054(var15, var13, var12.field1929, var12.field1975);
                                        }
                                    }
                                } else if (class82.field1850) {
                                    var10 = false;
                                }
                            } else {
                                class138 var57 = var12.method615(class10.method64(var12, 0), (byte) 75);
                                if (var57 != null) {
                                    var57.method1048(var15, var13);
                                } else if (class82.field1850) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field1952 == 6) {
                            boolean var58 = class10.method64(var12, 0);
                            int var59;
                            if (var58) {
                                var59 = var12.field2021;
                            } else {
                                var59 = var12.field1949;
                            }
                            Object var60 = null;
                            class14 var61;
                            if (var12.field1916 == 5) {
                                if (var12.field2010 == 0) {
                                    var61 = class36.field784.method400(-1, -513, null, null, -1);
                                } else {
                                    var61 = class104.field2412.method38(true);
                                }
                            } else if (var59 == -1) {
                                var61 = var12.method620(-7919, class104.field2412.field2891, -1, var58, null);
                                if (var61 == null && class82.field1850) {
                                    var10 = false;
                                }
                            } else {
                                class143 var62 = class68.method481(0, var59);
                                var61 = var12.method620(-7919, class104.field2412.field2891, var12.field1917, var58, var62);
                                if (var61 == null && class82.field1850) {
                                    var10 = false;
                                }
                            }
                            int var63 = 0;
                            if (var12.field1982 != -1) {
                                class141 var64 = class39.method286((byte) 111, var12.field1982);
                                if (var64 != null) {
                                    class141 var65 = var64.method1087(-17227, var12.field1960);
                                    var61 = var65.method1078(-98, 1);
                                    if (var61 != null) {
                                        var63 = var61.field2395 / 2;
                                    }
                                }
                            }
                            class97.method701(var12.field1929 / 2 + var15, var12.field1975 / 2 + var13);
                            int var66 = class97.field2257[var12.field2035] * var12.field1994 >> 16;
                            int var67 = class97.field2258[var12.field2035] * var12.field1994 >> 16;
                            if (var61 != null) {
                                if (var12.field1967) {
                                    var61.method91();
                                    if (var12.field2022) {
                                        var61.method106(0, var12.field1991, var12.field1979, var12.field2035, var12.field1942, var63 + var12.field2000 + var67, var12.field2000 + var66, var12.field1994);
                                    } else {
                                        var61.method109(0, var12.field1991, var12.field1979, var12.field2035, var12.field1942, var63 + var67 + var12.field2000, var66 - -var12.field2000);
                                    }
                                } else {
                                    var61.method109(0, var12.field1991, 0, var12.field2035, 0, var67, var66);
                                }
                            }
                            class97.method702();
                        } else {
                            if (var12.field1952 == 7) {
                                class145 var68 = var12.method625(-12863);
                                if (var68 == null) {
                                    if (class82.field1850) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var69 = 0;
                                for (int var70 = 0; var70 < var12.field1975; var70++) {
                                    for (int var71 = 0; var71 < var12.field1929; var71++) {
                                        if (var12.field2008[var69] > 0) {
                                            class141 var72 = class39.method286((byte) -40, var12.field2008[var69] - 1);
                                            class137 var73 = var72.field3316;
                                            if (var73 == null) {
                                                var73 = class36.field797;
                                            }
                                            if (var72.field3271 == 1 || var12.field1921[var69] != 1) {
                                                var73 = class88.method666(-91, new class137[] { var73, class29.field651, class45.method320(-5, var12.field1921[var69]) });
                                            }
                                            int var74 = (var12.field1933 + 115) * var71 + var15;
                                            int var75 = (var12.field2019 + 12) * var70 + var13;
                                            if (var12.field1990 == 0) {
                                                var68.method1147(var73, var74, var75, var12.field1931, var12.field2004);
                                            } else if (var12.field1990 == 1) {
                                                var68.method1138(var73, var12.field1929 / 2 + var74, var75, var12.field1931, var12.field2004);
                                            } else {
                                                var68.method1140(var73, var12.field1929 + var74 - 1, var75, var12.field1931, var12.field2004);
                                            }
                                        }
                                        var69++;
                                    }
                                }
                            }
                            if (var12.field1952 == 8 && class58.method399((byte) 6, arg2, var11) && class82.field1854 == class11.field227) {
                                int var76 = 0;
                                class145 var77 = class75.field1695;
                                int var78 = 0;
                                class137 var79 = var12.field1963;
                                class137 var80 = class25.method214(var12, var79, 0);
                                while (var80.method997(-120) > 0) {
                                    int var88 = var80.method1003(class109.field2559, (byte) -119);
                                    class137 var89;
                                    if (var88 == -1) {
                                        var89 = var80;
                                        var80 = class45.field999;
                                    } else {
                                        var89 = var80.method1013(var88, 0, (byte) 76);
                                        var80 = var80.method1035(1, var88 + 2);
                                    }
                                    int var90 = var77.method1129(var89);
                                    var76 += var77.field3452 + 1;
                                    if (var90 > var78) {
                                        var78 = var90;
                                    }
                                }
                                var78 += 6;
                                int var81 = var15 + var12.field1929 - var78 - 5;
                                var76 += 7;
                                int var82 = var12.field1975 + var13 + 5;
                                if (var76 + var82 > arg3) {
                                    var82 = arg3 - var76;
                                }
                                if (var15 + 5 > var81) {
                                    var81 = var15 + 5;
                                }
                                if (arg6 < var78 + var81) {
                                    var81 = arg6 - var78;
                                }
                                class62.method454(var81, var82, var78, var76, 16777120);
                                class62.method457(var81, var82, var78, var76, 0);
                                class137 var83 = var12.field1963;
                                int var84 = var77.field3452 + var82 + 2;
                                class137 var85 = class25.method214(var12, var83, 0);
                                while (var85.method997(111) > 0) {
                                    int var86 = var85.method1003(class109.field2559, (byte) -108);
                                    class137 var87;
                                    if (var86 == -1) {
                                        var87 = var85;
                                        var85 = class45.field999;
                                    } else {
                                        var87 = var85.method1013(var86, 0, (byte) 120);
                                        var85 = var85.method1035(1, var86 + 2);
                                    }
                                    var77.method1147(var87, var81 + 3, var84, 0, false);
                                    var84 += var77.field3452 + 1;
                                }
                            }
                            if (var12.field1952 == 9) {
                                if (var12.field1964 == 1) {
                                    class62.method450(var15, var13, var12.field1929 + var15, var13 - -var12.field1975, var12.field1931);
                                } else {
                                    int var91 = var12.field1929 >= 0 ? var12.field1929 : -var12.field1929;
                                    int var92 = var12.field1975 < 0 ? -var12.field1975 : var12.field1975;
                                    int var93 = var91;
                                    if (var91 < var92) {
                                        var93 = var92;
                                    }
                                    if (var93 != 0) {
                                        int var94 = (var12.field1929 << 16) / var93;
                                        int var95 = (var12.field1975 << 16) / var93;
                                        if (var94 >= var95) {
                                            var94 = -var94;
                                        } else {
                                            var95 = -var95;
                                        }
                                        int var96 = var12.field1964 * var95 >> 17;
                                        int var97 = var12.field1964 * var94 >> 17;
                                        int var98 = var15 + var96;
                                        int var99 = var12.field1964 * var94 + 1 >> 17;
                                        int var100 = var12.field1964 * var95 + 1 >> 17;
                                        int var101 = var15 - var100;
                                        int var102 = var12.field1929 + var15 - var100;
                                        int var103 = var13 + var97;
                                        int var104 = var13 - var99;
                                        int var105 = var13 + var12.field1975 - var99;
                                        int var106 = var12.field1975 + var13 + var97;
                                        int var107 = var15 + var96 + var12.field1929;
                                        class97.method704(var98, var101, var102);
                                        class97.method703(var103, var104, var105, var98, var101, var102, var12.field1931);
                                        class97.method704(var98, var102, var107);
                                        class97.method703(var103, var105, var106, var98, var102, var107, var12.field1931);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)V")
    private final synchronized void method310(boolean arg0) {
        field976++;
        if (class100.field2345) {
            return;
        }
        class100.field2345 = true;
        try {
            if (arg0) {
                method314(47);
            }
            class124.field2871.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method195(false);
        } catch (Exception var4) {
        }
        if (field963 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class131.field3048 != null) {
            try {
                class131.field3048.method366(7904);
            } catch (Exception var2) {
            }
        }
        this.method192(120);
    }

    @OriginalMember(owner = "client!ga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field968++;
        if (field963 == null) {
            return class131.field3048 == null || class131.field3048.field1116 == this ? super.getParameter(arg0) : class131.field3048.field1116.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class21.field424 = true;
        class86.field2058 = true;
        field940++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILjava/awt/Component;)Loa;")
    public static final class93 method311(int arg0, int arg1, int arg2, Component arg3) {
        field943++;
        try {
            if (arg1 >= -103) {
                providesignlink(null);
            }
            Class var4 = Class.forName("ba");
            class93 var5 = (class93) var4.getDeclaredConstructor().newInstance();
            var5.method60(arg3, 87, arg2, arg0);
            return var5;
        } catch (Throwable var7) {
            class40 var6 = new class40();
            var6.method60(arg3, 98, arg2, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field942++;
    }

    @OriginalMember(owner = "client!ga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field941++;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    public abstract void method194(int arg0);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZBLfc;IIII)V")
    public static final void method312(boolean arg0, byte arg1, class39 arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) ((arg6 << arg4) + arg3);
        field974++;
        class38 var9 = (class38) class116.field2752.method867(var7, false);
        if (var9 != null) {
            return;
        }
        class38 var10 = (class38) class103.field2397.method867(var7, false);
        if (var10 != null) {
            return;
        }
        class38 var11 = (class38) class45.field988.method867(var7, false);
        if (var11 == null) {
            if (!arg0) {
                class38 var12 = (class38) class72.field1536.method867(var7, false);
                if (var12 != null) {
                    return;
                }
            }
            class38 var13 = new class38();
            var13.field832 = arg2;
            var13.field839 = arg1;
            var13.field845 = arg5;
            if (arg0) {
                class116.field2752.method873(var7, 123, var13);
                class137.field3136++;
            } else {
                class32.field680.method54(var13, arg4 ^ 0xECCF1EB0);
                class45.field988.method873(var7, 120, var13);
                class11.field237++;
            }
        } else if (arg0) {
            var11.method923(10);
            class116.field2752.method873(var7, 121, var11);
            class11.field237--;
            class137.field3136++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(Z)V")
    public abstract void method195(boolean arg0);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BIZIII)Lvd;")
    private static final class138 method313(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        long var6 = ((long) arg1 << 38) + ((long) arg3 << 40) + ((long) arg5 << 16) + (long) arg4;
        field951++;
        if (!arg2) {
            class138 var8 = (class138) class34.field726.method758(var6, (byte) -87);
            if (var8 != null) {
                return var8;
            }
        }
        class141 var9 = class39.method286((byte) -31, arg4);
        if (arg5 > 1 && var9.field3303 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field3263[var11] <= arg5 && var9.field3263[var11] != 0) {
                    var10 = var9.field3303[var11];
                }
            }
            if (var10 != -1) {
                var9 = class39.method286((byte) 116, var10);
            }
        }
        class14 var12 = var9.method1078(arg0 ^ 0xFFFFFFD2, 1);
        if (var12 == null) {
            return null;
        }
        class138 var13 = null;
        if (var9.field3313 != -1) {
            var13 = method313((byte) 25, 1, true, 0, var9.field3302, 10);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class62.field1336;
        int var15 = class62.field1335;
        int[] var16 = class62.field1331;
        int var17 = class62.field1332;
        int var18 = class62.field1333;
        int var19 = class62.field1330;
        int var20 = class62.field1334;
        int[] var21 = class97.method694();
        int var22 = class97.field2252;
        int var23 = class97.field2251;
        if (arg0 != 25) {
            return null;
        }
        class138 var24 = new class138(36, 32);
        class62.method445(var24.field3195, 36, 32);
        class127.field2983 = class97.method693(class127.field2983);
        class62.method454(0, 0, 36, 32, 0);
        class97.field2264 = false;
        class97.method701(16, 16);
        int var25 = var9.field3306;
        if (arg2) {
            var25 = (int) ((double) var25 * 1.5D);
        } else if (arg1 == 2) {
            var25 = (int) ((double) var25 * 1.04D);
        }
        int var26 = class97.field2258[var9.field3272] * var25 >> 16;
        int var27 = class97.field2257[var9.field3272] * var25 >> 16;
        var12.method91();
        var12.method109(0, var9.field3320, var9.field3275, var9.field3272, var9.field3264, var12.field2395 / 2 + var26 + var9.field3284, var9.field3284 + var27);
        if (arg1 >= 1) {
            var24.method1041(1);
        }
        if (arg1 >= 2) {
            var24.method1041(16777215);
        }
        if (arg3 != 0) {
            var24.method1038(arg3);
        }
        class62.method445(var24.field3195, 36, 32);
        if (var9.field3313 != -1) {
            var13.method1048(0, 0);
        }
        if (!arg2 && (var9.field3271 == 1 || arg5 != 1) && arg5 != -1) {
            class119.field2773.method1131(class71.method495(arg5, (byte) -16), 1, 10, 1);
            class119.field2773.method1131(class71.method495(arg5, (byte) -16), 0, 9, 16776960);
        }
        if (!arg2) {
            class34.field726.method760(var24, arg0 - 25, var6);
        }
        class62.method445(var16, var15, var14);
        class62.method455(var17, var19, var18, var20);
        class97.method693(var21);
        class97.field2251 = var23;
        class97.field2252 = var22;
        class97.method702();
        class97.field2264 = true;
        return var24;
    }

    @OriginalMember(owner = "client!ga", name = "stop", descriptor = "()V")
    public final void stop() {
        field956++;
        if (class72.field1531 == this && !class100.field2345) {
            class2.field33 = class60.method432(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    public static final void method314(int arg0) {
        if (arg0 >= -68) {
            method315(-58);
        }
        class73 var1 = (class73) class2.field44.method726(0);
        field980++;
        while (var1 != null) {
            if (var1.field1550 == -1) {
                var1.field1541 = 0;
                class122.method916(var1, 256);
            } else {
                var1.method776(0);
            }
            var1 = (class73) class2.field44.method731((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
    public static void method315(int arg0) {
        if (arg0 != -6) {
            method305((byte) 38);
        }
        field965 = null;
        field979 = null;
        field984 = null;
        field957 = null;
        field963 = null;
    }

    @OriginalMember(owner = "client!ga", name = "providesignlink", descriptor = "(Lha;)V")
    public static final void providesignlink(class50 arg0) {
        field945++;
        class131.field3048 = arg0;
        class49.field1103 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field967++;
        if (field963 == null) {
            return class131.field3048 == null || class131.field3048.field1116 == this ? super.getAppletContext() : class131.field3048.field1116.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZII)V")
    public final void method316(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field960++;
        try {
            if (class72.field1531 != null) {
                class99.field2309++;
                if (class99.field2309 >= 3) {
                    this.method318("alreadyloaded", 0);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            } else if (!arg2) {
                class23.field528 = arg0;
                class46.field1025 = arg1;
                class72.field1531 = this;
                class32.field688 = arg3;
                if (class131.field3048 == null) {
                    class49.field1103 = class131.field3048 = new class50(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
                }
                class131.field3048.method358(this, 1, 0);
            }
        } catch (Exception var7) {
            class110.method850((byte) -101, null, var7);
            this.method318("crash", 0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "start", descriptor = "()V")
    public final void start() {
        field983++;
        if (class72.field1531 == this && !class100.field2345) {
            class2.field33 = 0L;
        }
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
    public final synchronized void method317(int arg0) {
        if (arg0 != 2616) {
            this.windowDeiconified(null);
        }
        field961++;
        Container var2;
        if (field963 == null) {
            var2 = class131.field3048.field1116;
        } else {
            var2 = field963;
        }
        if (class124.field2871 != null) {
            class124.field2871.removeFocusListener(this);
            var2.remove(class124.field2871);
        }
        class124.field2871 = new class30(this);
        var2.add(class124.field2871);
        class124.field2871.setSize(class23.field528, class32.field688);
        class124.field2871.setVisible(true);
        if (field963 == null) {
            class124.field2871.setLocation(0, 0);
        } else {
            Insets var3 = field963.getInsets();
            class124.field2871.setLocation(var3.left, var3.top);
        }
        class124.field2871.addFocusListener(this);
        class124.field2871.requestFocus();
        class86.field2058 = true;
        class64.field1351 = false;
        class106.field2480 = class60.method432(true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method318(String arg0, int arg1) {
        field962++;
        if (arg1 != 0 || this.field955) {
            return;
        }
        this.field955 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var3) {
        }
    }
}
