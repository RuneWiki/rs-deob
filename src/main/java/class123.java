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

@OriginalClass("client!aba")
public abstract class class123 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "Z")
    private boolean field1996 = false;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "Z")
    private boolean field2009 = false;

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
    public static int field2012 = 1401;

    @OriginalMember(owner = "client!aba", name = "F", descriptor = "F")
    public static float field2023;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!aba", name = "v", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!aba", name = "x", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!aba", name = "y", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!aba", name = "A", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!aba", name = "B", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!aba", name = "C", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!aba", name = "D", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!aba", name = "E", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!aba", name = "G", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!aba", name = "H", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!aba", name = "I", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!aba", name = "J", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!aba", name = "K", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!aba", name = "N", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!aba", name = "O", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!aba", name = "Q", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!aba", name = "U", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!aba", name = "V", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!aba", name = "W", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!aba", name = "X", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!aba", name = "Y", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "Z")
    public static boolean field2006;

    @OriginalMember(owner = "client!aba", name = "L", descriptor = "Z")
    public static boolean field2029;

    @OriginalMember(owner = "client!aba", name = "M", descriptor = "Z")
    public static boolean field2030;

    @OriginalMember(owner = "client!aba", name = "P", descriptor = "Z")
    public static boolean field2033;

    @OriginalMember(owner = "client!aba", name = "R", descriptor = "Z")
    public static boolean field2035;

    @OriginalMember(owner = "client!aba", name = "S", descriptor = "Z")
    public static boolean field2036;

    @OriginalMember(owner = "client!aba", name = "T", descriptor = "Z")
    public static boolean field2037;

    @OriginalMember(owner = "client!aba", name = "Z", descriptor = "Z")
    public static boolean field2043;

    @OriginalMember(owner = "client!aba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2027++;
        if (class107.field1756 != this || class122.field1988) {
            return;
        }
        class73.field1166 = true;
        if (class375.field5199 && class254.method1619(true) - class41.field560 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class521.field7686 && class122.field1985 <= var2.height) {
                class183.field2879 = true;
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V")
    private final void method984(boolean arg0, int arg1) {
        field2024++;
        synchronized (this) {
            if (class122.field1988) {
                return;
            }
            class122.field1988 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class492.field7063 != null) {
            class492.field7063.destroy();
        }
        try {
            this.method715((byte) -56);
        } catch (Exception var9) {
        }
        if (this.field2009) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field2009 = false;
        }
        class388.method2369(true, (byte) -29);
        class294.method1799(-29458);
        if (class126.field2061 != null) {
            try {
                class126.field2061.removeFocusListener(this);
                class126.field2061.getParent().remove(class126.field2061);
            } catch (Exception var7) {
            }
        }
        if (class653.field9220 != null) {
            try {
                class653.field9220.method3956(0);
            } catch (Exception var6) {
            }
        }
        this.method704((byte) 84);
        if (class699.field9906 != null) {
            class699.field9906.setVisible(false);
            class699.field9906.dispose();
            class699.field9906 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
        if (arg1 < 14) {
            this.start();
        }
    }

    @OriginalMember(owner = "client!aba", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2000++;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
    public abstract void method715(byte arg0);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)Z")
    public final boolean method985(boolean arg0) {
        field2014++;
        if (!arg0) {
            this.field2009 = false;
        }
        return class331.method1968("jagmisc", (byte) 76);
    }

    @OriginalMember(owner = "client!aba", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class227.field3378 = true;
        field2022++;
        class73.field1166 = true;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lha;III[Z)Z")
    public static final boolean method986(class427 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class687.field9745 != class340.field4723) {
            int var6 = class621.field8841[arg1].method3861((byte) 111, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class682 var8 = class621.field8841[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method3861((byte) 116, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1370(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1363(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!aba", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class492.field7063 = arg0;
        field1998++;
    }

    @OriginalMember(owner = "client!aba", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2020++;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
    public abstract void method704(byte arg0);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZIILjava/lang/String;IIII)V")
    public final void method987(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class61.field887 = arg2;
            class498.field7410 = null;
            class465.field6689 = arg6;
            class521.field7686 = arg6;
            class240.field3525 = 0;
            class107.field1756 = this;
            class119.field1910 = arg1;
            class597.field8633 = arg7;
            class122.field1985 = arg7;
            class699.field9906 = new Frame();
            class699.field9906.setTitle("Jagex");
            class699.field9906.setResizable(true);
            class699.field9906.addWindowListener(this);
            class699.field9906.setVisible(true);
            class699.field9906.toFront();
            Insets var9 = class699.field9906.getInsets();
            class699.field9906.setSize(class521.field7686 + var9.left + var9.right, class122.field1985 + var9.bottom - -var9.top);
            class493.field7074 = class653.field9220 = new class705(arg5, arg3, arg4, true);
            class614 var10 = class653.field9220.method3968(this, 1, (byte) 13);
            while (var10.field8787 == 0) {
                class564.method3300((byte) -13, 10L);
            }
        } catch (Exception var12) {
            class18.method200(null, var12, arg1 ^ 0x2838);
        }
        field2010++;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(Z)Z")
    public final boolean method988(boolean arg0) {
        field1995++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0) {
                field2006 = true;
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
                this.method992(-85, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    private final void method989(int arg0) {
        field2028++;
        long var2 = class254.method1619(true);
        long var4 = class508.field7567[class18.field269];
        class508.field7567[class18.field269] = var2;
        class18.field269 = class18.field269 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class327.field4548 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != 4000) {
            this.stop();
        }
        if (class308.field4282++ > 50) {
            class73.field1166 = true;
            class308.field4282 -= 50;
            class126.field2061.setSize(class465.field6689, class597.field8633);
            class126.field2061.setVisible(true);
            if (class699.field9906 != null && class35.field490 == null) {
                Insets var7 = class699.field9906.getInsets();
                class126.field2061.setLocation(class240.field3525 + var7.left, class119.field1910 + var7.top);
            } else {
                class126.field2061.setLocation(class240.field3525, class119.field1910);
            }
        }
        this.method711((byte) 93);
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)Ljava/lang/String;")
    public String method695(int arg0) {
        if (arg0 != 50) {
            this.init();
        }
        field2025++;
        return null;
    }

    @OriginalMember(owner = "client!aba", name = "run", descriptor = "()V")
    public final void run() {
        field2015++;
        try {
            if (class705.field9962 != null) {
                String var1 = class705.field9962.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class705.field9987;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method992(-82, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class705.field9987 == null || class705.field9987.equals("1.4.2"))) {
                    this.method992(-17, "wrongjava");
                    return;
                }
            }
            if (class705.field9987 != null && class705.field9987.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class705.field9987.length()) {
                    char var5 = class705.field9987.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
                if (var4 >= 5) {
                    class375.field5199 = true;
                }
            }
            Applet var6 = class107.field1756;
            if (class492.field7063 != null) {
                var6 = class492.field7063;
            }
            Method var7 = class705.field9964;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class476.method2786(24695);
            class166.method1256(-13024);
            this.method708(true);
            this.method699((byte) -88);
            class418.field5949 = class551.method3233((byte) 48);
            while (class379.field5239 == 0L || class379.field5239 > class254.method1619(true)) {
                class453.field6527 = class418.field5949.method1015(class152.field2541, 0);
                for (int var8 = 0; var8 < class453.field6527; var8++) {
                    this.method991(4000);
                }
                this.method989(4000);
                class693.method3909(class653.field9220, class126.field2061, (byte) -85);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class18.method200(this.method695(50), var20, 10296);
            this.method992(-48, "crash");
        } finally {
            Object var13 = null;
            this.method984(true, 49);
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)V")
    public abstract void method711(byte arg0);

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)Z")
    public final boolean method990(int arg0) {
        field2018++;
        if (arg0 != -16914) {
            field2023 = -0.2892268F;
        }
        return class331.method1968("jaclib", (byte) 117);
    }

    @OriginalMember(owner = "client!aba", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1997++;
        if (class699.field9906 == null) {
            return class492.field7063 == null || class492.field7063 == this ? super.getParameter(arg0) : class492.field7063.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2005++;
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)V")
    public abstract void method705(int arg0);

    @OriginalMember(owner = "client!aba", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2004++;
        if (class699.field9906 == null) {
            return class492.field7063 == null || class492.field7063 == this ? super.getAppletContext() : class492.field7063.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "stop", descriptor = "()V")
    public final void stop() {
        field1992++;
        if (class107.field1756 == this && !class122.field1988) {
            class379.field5239 = class254.method1619(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!aba", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1999++;
        if (class107.field1756 == this && !class122.field1988) {
            class379.field5239 = class254.method1619(true);
            class564.method3300((byte) 104, 5000L);
            class493.field7074 = null;
            this.method984(false, 15);
        }
    }

    @OriginalMember(owner = "client!aba", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "(I)V")
    private final void method991(int arg0) {
        field2017++;
        if (arg0 != 4000) {
            return;
        }
        long var2 = class254.method1619(true);
        long var4 = class202.field3119[class234.field3459];
        class202.field3119[class234.field3459] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class234.field3459 = class234.field3459 + 1 & 0x1F;
        synchronized (this) {
            class54.field710 = class227.field3378;
        }
        this.method705(arg0 ^ 0xFFFFF05D);
    }

    @OriginalMember(owner = "client!aba", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1994++;
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(Z)V")
    public synchronized void method708(boolean arg0) {
        if (class126.field2061 != null) {
            class126.field2061.removeFocusListener(this);
            class126.field2061.getParent().setBackground(Color.black);
            class126.field2061.getParent().remove(class126.field2061);
        }
        field2019++;
        Container var2;
        if (class35.field490 != null) {
            var2 = class35.field490;
        } else if (class699.field9906 != null) {
            var2 = class699.field9906;
        } else if (class492.field7063 == null) {
            var2 = class107.field1756;
        } else {
            var2 = class492.field7063;
        }
        var2.setLayout(null);
        class126.field2061 = new class512(this);
        var2.add(class126.field2061);
        class126.field2061.setSize(class465.field6689, class597.field8633);
        class126.field2061.setVisible(true);
        if (class699.field9906 == var2) {
            Insets var3 = class699.field9906.getInsets();
            class126.field2061.setLocation(class240.field3525 + var3.left, var3.top - -class119.field1910);
        } else {
            class126.field2061.setLocation(class240.field3525, class119.field1910);
        }
        class126.field2061.addFocusListener(this);
        class126.field2061.requestFocus();
        class54.field710 = true;
        class227.field3378 = arg0;
        class73.field1166 = true;
        class183.field2879 = false;
        class41.field560 = class254.method1619(arg0);
    }

    @OriginalMember(owner = "client!aba", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2016++;
    }

    @OriginalMember(owner = "client!aba", name = "start", descriptor = "()V")
    public final void start() {
        field1993++;
        if (class107.field1756 == this && !class122.field1988) {
            class379.field5239 = 0L;
        }
    }

    @OriginalMember(owner = "client!aba", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2021++;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method992(int arg0, String arg1) {
        field2013++;
        if (this.field1996) {
            return;
        }
        this.field1996 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 > -13) {
            field2023 = 0.5065851F;
        }
        try {
            class157.method1180((byte) 112, class492.field7063, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!aba", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2003++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILjava/lang/String;IBII)V")
    public final void method993(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2008++;
        try {
            if (class107.field1756 == null) {
                class61.field887 = arg3;
                class597.field8633 = arg6;
                class122.field1985 = arg6;
                class107.field1756 = this;
                class119.field1910 = 0;
                class465.field6689 = arg5;
                class521.field7686 = arg5;
                if (arg4 >= -40) {
                    this.windowDeiconified(null);
                }
                class498.field7410 = class492.field7063;
                class240.field3525 = 0;
                class493.field7074 = class653.field9220 = new class705(arg1, arg2, arg0, class492.field7063 != null);
                class614 var8 = class653.field9220.method3968(this, 1, (byte) 13);
                while (var8.field8787 == 0) {
                    class564.method3300((byte) 127, 10L);
                }
            } else {
                class324.field4518++;
                if (class324.field4518 >= 3) {
                    this.method992(-83, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class18.method200(null, var10, 10296);
            this.method992(-18, "crash");
        }
    }

    @OriginalMember(owner = "client!aba", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2026++;
        if (class699.field9906 == null) {
            return class492.field7063 == null || class492.field7063 == this ? super.getCodeBase() : class492.field7063.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class227.field3378 = false;
        field2011++;
    }

    @OriginalMember(owner = "client!aba", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2002++;
        if (class699.field9906 == null) {
            return class492.field7063 == null || class492.field7063 == this ? super.getDocumentBase() : class492.field7063.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
    public abstract void method699(byte arg0);

    @OriginalMember(owner = "client!aba", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2001++;
    }
}
