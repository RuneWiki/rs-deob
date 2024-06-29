import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "Z")
    private boolean field2026 = false;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "Z")
    private boolean field2043 = false;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "[[I")
    public static int[][] field2023 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "[I")
    public static int[] field2022 = new int[5];

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "Z")
    public static boolean field2055;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "Z")
    public static boolean field2056;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "Z")
    public static boolean field2057;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "Z")
    public static boolean field2058;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "[Laq;")
    public static class385[] field2027;

    static {
        new class112("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }

    @OriginalMember(owner = "client!uo", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 7)
    public final void focusLost(FocusEvent arg0) {
        class487.field6868 = false;
        field2033++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 17)
    public static void method885(int arg0) {
        if (arg0 != -30081) {
            field2027 = null;
        }
        field2022 = null;
        field2027 = null;
        field2023 = null;
    }

    @OriginalMember(owner = "client!uo", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 30)
    public final void focusGained(FocusEvent arg0) {
        class487.field6868 = true;
        field2016++;
        class280.field3857 = true;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 39)
    private final void method886(byte arg0) {
        field2025++;
        long var2 = class193.method1237(-9581);
        long var4 = class137.field1943[class96.field1371];
        if (arg0 >= -44) {
            this.field2043 = false;
        }
        class137.field1943[class96.field1371] = var2;
        class96.field1371 = class96.field1371 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class126.field1735 = ((var6 >> 1) + 32000) / var6;
        }
        if (class280.field3858++ > 50) {
            class280.field3858 -= 50;
            class280.field3857 = true;
            class138.field1965.setSize(class67.field987, class371.field5248);
            class138.field1965.setVisible(true);
            if (class240.field3384 != null && class90.field1344 == null) {
                Insets var7 = class240.field3384.getInsets();
                class138.field1965.setLocation(class335.field4600 + var7.left, class192.field2743 + var7.top);
            } else {
                class138.field1965.setLocation(class335.field4600, class192.field2743);
            }
        }
        this.method901((byte) 5);
    }

    @OriginalMember(owner = "client!uo", name = "run", descriptor = "()V", line = 82)
    public final void run() {
        field2046++;
        try {
            label110: {
                if (class14.field221 != null) {
                    String var1 = class14.field221.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class14.field220;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method896("wrongjava", false);
                            break label110;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class14.field220 == null || class14.field220.equals("1.4.2"))) {
                        this.method896("wrongjava", false);
                        break label110;
                    }
                }
                if (class14.field220 != null && class14.field220.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class14.field220.length() > var3) {
                        char var5 = class14.field220.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class477.field6743 = true;
                    }
                }
                if (class343.field4703.field234 != null) {
                    Method var6 = class14.field240;
                    if (var6 != null) {
                        try {
                            var6.invoke(class343.field4703.field234, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class392.method2343(-122);
                class154.method936((byte) -112);
                this.method892(7);
                this.method888(-120);
                class292.field4007 = class294.method1823(940);
                this.method889(-1);
                while (class344.field4711 == 0L || class193.method1237(-9581) < class344.field4711) {
                    class199.field2850 = class292.field4007.method1569((byte) 112, class130.field1832);
                    for (int var7 = 0; var7 < class199.field2850; var7++) {
                        this.method890(16302);
                    }
                    this.method886((byte) -111);
                    method895(class343.field4703, -102, class138.field1965);
                }
            }
        } catch (Exception var10) {
            class181.method1190((byte) 120, (String) null, var10);
            this.method896("crash", false);
        }
        this.method894((byte) -15, true);
    }

    @OriginalMember(owner = "client!uo", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 199)
    public final URL getCodeBase() {
        field2032++;
        if (class240.field3384 == null) {
            return class343.field4703 == null || class343.field4703.field234 == this ? super.getCodeBase() : class343.field4703.field234.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIII)V", line = 213)
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2053++;
        if (arg4 < 128 || arg7 < 128 || arg4 > (class200.field2875 * 128 - 256) || (class422.field5811 * 128 - 256) < arg7) {
            class460.field6483[0] = class460.field6483[1] = -1;
            return;
        }
        int var10 = class418.method2441(arg7, arg2, arg4, -16778) - arg6;
        class126.field1740.method1380(arg9, arg3, 0);
        class338.field4636.method1071(class126.field1740);
        class338.field4636.method1095(arg4, var10, arg7, class460.field6483);
        class126.field1740.method1380(-arg9, 0, 0);
        class338.field4636.method1071(class126.field1740);
    }

    @OriginalMember(owner = "client!uo", name = "providesignlink", descriptor = "(Ldq;)V", line = 235)
    public static final void providesignlink(class14 arg0) {
        field2030++;
        class343.field4703 = arg0;
        class133.field1876 = arg0;
    }

    @OriginalMember(owner = "client!uo", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 243)
    public final URL getDocumentBase() {
        field2037++;
        if (class240.field3384 == null) {
            return class343.field4703 == null || class343.field4703.field234 == this ? super.getDocumentBase() : class343.field4703.field234.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V", line = 258)
    public final void method889(int arg0) {
        field2034++;
        if (!this.field2043) {
            try {
                class420 var2 = class343.field4703.method140(class479.field6768.getClass(), 28191);
                while (var2.field5789 == 0) {
                    class258.method1603(arg0 - 648, 100L);
                }
                if (var2.field5791 != null) {
                    throw (Throwable) var2.field5791;
                }
                jagmisc.init();
                this.field2043 = true;
                class292.field4007 = class294.method1823(940);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != -1) {
            this.paint((Graphics) null);
        }
    }

    @OriginalMember(owner = "client!uo", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 288)
    public final void windowClosing(WindowEvent arg0) {
        field2045++;
        this.destroy();
    }

    @OriginalMember(owner = "client!uo", name = "destroy", descriptor = "()V", line = 296)
    public final void destroy() {
        field2021++;
        if (class479.field6768 == this && !class109.field1543) {
            class344.field4711 = class193.method1237(-9581);
            class258.method1603(-649, 5000L);
            class133.field1876 = null;
            this.method894((byte) -15, false);
        }
    }

    @OriginalMember(owner = "client!uo", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 313)
    public final void windowIconified(WindowEvent arg0) {
        field2052++;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V", line = 323)
    private final void method890(int arg0) {
        if (arg0 != 16302) {
            this.windowDeactivated((WindowEvent) null);
        }
        field2020++;
        long var2 = class193.method1237(-9581);
        long var4 = class99.field1400[class310.field4238];
        class99.field1400[class310.field4238] = var2;
        class310.field4238 = class310.field4238 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class332.field4550 = class487.field6868;
        }
        this.method893(1);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIII)V", line = 354)
    public final void method891(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 4394) {
            return;
        }
        field2041++;
        try {
            if (class479.field6768 == null) {
                class248.field3486 = arg3;
                class371.field5248 = arg2;
                class77.field1166 = arg2;
                class335.field4600 = 0;
                class192.field2743 = 0;
                class67.field987 = arg4;
                class3.field28 = arg4;
                class479.field6768 = this;
                if (class343.field4703 == null) {
                    class133.field1876 = class343.field4703 = new class14(this, arg1, (String) null, 0);
                }
                class420 var6 = class343.field4703.method115(this, (byte) 76, 1);
                while (var6.field5789 == 0) {
                    class258.method1603(arg0 - 5043, 10L);
                }
            } else {
                class11.field200++;
                if (class11.field200 >= 3) {
                    this.method896("alreadyloaded", false);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class181.method1190((byte) -23, (String) null, var8);
            this.method896("crash", false);
        }
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V", line = 402)
    public final synchronized void method892(int arg0) {
        if (class138.field1965 != null) {
            class138.field1965.removeFocusListener(this);
            class138.field1965.getParent().remove(class138.field1965);
        }
        if (arg0 < 2) {
            field2047 = -46;
        }
        field2039++;
        Container var2;
        if (class90.field1344 != null) {
            var2 = class90.field1344;
        } else if (class240.field3384 == null) {
            var2 = class343.field4703.field234;
        } else {
            var2 = class240.field3384;
        }
        var2.setLayout((LayoutManager) null);
        class138.field1965 = new class371(this);
        var2.add(class138.field1965);
        class138.field1965.setSize(class67.field987, class371.field5248);
        class138.field1965.setVisible(true);
        if (class240.field3384 == var2) {
            Insets var3 = class240.field3384.getInsets();
            class138.field1965.setLocation(class335.field4600 + var3.left, class192.field2743 + var3.top);
        } else {
            class138.field1965.setLocation(class335.field4600, class192.field2743);
        }
        class138.field1965.addFocusListener(this);
        class138.field1965.requestFocus();
        class332.field4550 = true;
        class487.field6868 = true;
        class280.field3857 = true;
        class79.field1194 = false;
        class474.field6641 = class193.method1237(-9581);
    }

    @OriginalMember(owner = "client!uo", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 458)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2044++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BZ)V", line = 466)
    private final void method894(byte arg0, boolean arg1) {
        field2019++;
        synchronized (this) {
            if (class109.field1543) {
                return;
            }
            class109.field1543 = true;
        }
        if (class343.field4703.field234 != null) {
            class343.field4703.field234.destroy();
        }
        try {
            this.method897(arg0 + 31419);
        } catch (Exception var11) {
        }
        if (this.field2043) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field2043 = false;
        }
        class420 var4 = class343.field4703.method136(class479.field6768.getClass(), true);
        while (var4.field5789 == 0) {
            class258.method1603(-649, 100L);
        }
        if (class138.field1965 != null) {
            try {
                class138.field1965.removeFocusListener(this);
                class138.field1965.getParent().remove(class138.field1965);
            } catch (Exception var9) {
            }
        }
        if (class343.field4703 != null) {
            try {
                class343.field4703.method124((byte) -107);
            } catch (Exception var8) {
            }
        }
        this.method900((byte) 64);
        if (class240.field3384 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
        if (arg0 != -15) {
            this.method899((byte) -57);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ldq;ILjava/lang/Object;)V", line = 550)
    public static final void method895(class14 arg0, int arg1, Object arg2) {
        field2024++;
        if (arg0.field239 == null) {
            return;
        }
        if (arg1 >= -5) {
            field2047 = -81;
        }
        for (int var3 = 0; var3 < 50 && arg0.field239.peekEvent() != null; var3++) {
            class258.method1603(-649, 1L);
        }
        if (arg2 != null) {
            arg0.field239.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 576)
    public final void method896(String arg0, boolean arg1) {
        field2050++;
        if (this.field2026) {
            return;
        }
        this.field2026 = true;
        System.out.println("error_game_" + arg0);
        try {
            class207.method1299(class343.field4703.field234, 19639, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg1) {
            field2022 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 604)
    public final AppletContext getAppletContext() {
        field2031++;
        if (class240.field3384 == null) {
            return class343.field4703 == null || class343.field4703.field234 == this ? super.getAppletContext() : class343.field4703.field234.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 637)
    public final void windowClosed(WindowEvent arg0) {
        field2038++;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V", line = 644)
    public static final void method898(byte arg0) {
        field2017++;
        if (arg0 != 65) {
            method898((byte) 13);
        }
        class235.field3326.method656(116);
    }

    @OriginalMember(owner = "client!uo", name = "start", descriptor = "()V", line = 656)
    public final void start() {
        field2036++;
        if (class479.field6768 == this && !class109.field1543) {
            class344.field4711 = 0L;
        }
    }

    @OriginalMember(owner = "client!uo", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 667)
    public final void windowDeiconified(WindowEvent arg0) {
        field2028++;
    }

    @OriginalMember(owner = "client!uo", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 676)
    public final String getParameter(String arg0) {
        field2042++;
        if (class240.field3384 == null) {
            return class343.field4703 == null || class343.field4703.field234 == this ? super.getParameter(arg0) : class343.field4703.field234.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)Z", line = 695)
    public final boolean method899(byte arg0) {
        field2035++;
        int var2 = -121 % (arg0 / 63);
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
                this.method896("invalidhost", false);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 731)
    public final synchronized void paint(Graphics arg0) {
        field2029++;
        if (class479.field6768 != this || class109.field1543) {
            return;
        }
        class280.field3857 = true;
        if (class477.field6743 && class193.method1237(-9581) - class474.field6641 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class3.field28 && class77.field1166 <= var2.height) {
                class79.field1194 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "stop", descriptor = "()V", line = 756)
    public final void stop() {
        field2049++;
        if (class479.field6768 == this && !class109.field1543) {
            class344.field4711 = class193.method1237(-9581) + 4000L;
        }
    }

    @OriginalMember(owner = "client!uo", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 772)
    public final void windowActivated(WindowEvent arg0) {
        field2040++;
    }

    @OriginalMember(owner = "client!uo", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 781)
    public final void windowDeactivated(WindowEvent arg0) {
        field2048++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILjava/lang/String;ZIIII)V", line = 793)
    public final void method902(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class192.field2743 = 0;
            class479.field6768 = this;
            if (arg6 != 50) {
                method898((byte) 38);
            }
            class371.field5248 = arg1;
            class77.field1166 = arg1;
            class67.field987 = arg5;
            class3.field28 = arg5;
            class335.field4600 = 0;
            class248.field3486 = arg7;
            class240.field3384 = new Frame();
            class240.field3384.setTitle("Jagex");
            class240.field3384.setResizable(true);
            class240.field3384.addWindowListener(this);
            class240.field3384.setVisible(true);
            class240.field3384.toFront();
            Insets var9 = class240.field3384.getInsets();
            class240.field3384.setSize(var9.right + var9.left + class3.field28, class77.field1166 + var9.top + var9.bottom);
            class133.field1876 = class343.field4703 = new class14((Applet) null, arg0, arg2, arg4);
            class420 var10 = class343.field4703.method115(this, (byte) 76, 1);
            while (var10.field5789 == 0) {
                class258.method1603(-649, 10L);
            }
        } catch (Exception var12) {
            class181.method1190((byte) 116, (String) null, var12);
        }
        field2018++;
    }

    @OriginalMember(owner = "client!uo", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 834)
    public final void windowOpened(WindowEvent arg0) {
        field2054++;
    }

    @OriginalMember(owner = "client!uo", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public abstract void method888(int arg0);

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)V")
    public abstract void method893(int arg0);

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
    public abstract void method897(int arg0);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V")
    public abstract void method900(byte arg0);

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)V")
    public abstract void method901(byte arg0);
}
