import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class77 extends Applet implements Runnable, FocusListener {

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Llc;")
    public static class69 field1730 = class69.method470((byte) -114, "green:");

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Llc;")
    public static class69 field1736 = class69.method470((byte) -115, "You are not a member)3*6n*6nChoose to subscribe and*6nyou(Wll get loads of extra*6nbenefits and features)3");

    @OriginalMember(owner = "client!me", name = "y", descriptor = "[I")
    public static int[] field1740 = new int[500];

    @OriginalMember(owner = "client!me", name = "G", descriptor = "[I")
    public static int[] field1748 = new int[500];

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lcc;")
    public static class16 field1728;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lda;")
    public static class20 field1734;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "Z")
    public static boolean field1749;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Z")
    public static boolean field1750;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public abstract void method115(int arg0);

    @OriginalMember(owner = "client!me", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1742++;
        if (class47.field982 == null) {
            return class64.field1358 == null || class64.field1358.field2178 == this ? super.getAppletContext() : class64.field1358.field2178.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    private final void method541(int arg0) {
        long var2 = System.currentTimeMillis();
        field1729++;
        long var4 = class107.field2314[class16.field292];
        class107.field2314[class16.field292] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class16.field292 = class16.field292 + 1 & 0x1F;
        if (arg0 != 0) {
            field1748 = null;
        }
        synchronized (this) {
            class43.field858 = class120.field2557;
        }
        this.method117(arg0 ^ 0x17);
    }

    @OriginalMember(owner = "client!me", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1725++;
        if (class82.field1854 == this && !class69.field1519) {
            this.paint(arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1732++;
        if (class47.field982 == null) {
            return class64.field1358 == null || class64.field1358.field2178 == this ? super.getParameter(arg0) : class64.field1358.field2178.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "run", descriptor = "()V")
    public final void run() {
        field1744++;
        try {
            if (class99.field2180 != null) {
                String var1 = class99.field2180.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class99.field2169;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method547(true, "wrongjava");
                        return;
                    }
                    class72.field1599 = 5;
                }
            }
            class16.field318 = class55.method345((byte) 108, class83.method597((byte) -51), class114.field2481, class90.field1959);
            class83.method597((byte) -51).addFocusListener(this);
            class83.method597((byte) -51).requestFocus();
            this.method119(-123);
            class27.field574 = class17.method101(1);
            while (class2.field17 == 0L || System.currentTimeMillis() < class2.field17) {
                int var3 = class27.field574.method63((byte) 98, class63.field1291, class72.field1599);
                for (int var4 = 0; var4 < var3; var4++) {
                    this.method541(0);
                }
                this.method546((byte) -125);
            }
        } catch (Exception var6) {
            class70.method499(null, var6, 40);
            this.method547(true, "crash");
        }
        this.method544(58);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public abstract void method112(boolean arg0);

    @OriginalMember(owner = "client!me", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class120.field2557 = true;
        class62.field1285 = true;
        field1726++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILjava/lang/String;BLjava/net/InetAddress;II)V")
    public final void method542(int arg0, int arg1, int arg2, String arg3, byte arg4, InetAddress arg5, int arg6, int arg7) {
        field1719++;
        try {
            class82.field1854 = this;
            class87.field1917 = arg2;
            if (arg4 != 37) {
                field1734 = null;
            }
            class90.field1959 = arg7;
            class114.field2481 = arg1;
            class47.field982 = new class33(this, class90.field1959, class114.field2481);
            class36.field718 = new Font("Helvetica", 1, 13);
            class94.field2057 = class47.field982.getFontMetrics(class36.field718);
            class128.field2750 = class64.field1358 = new class99(true, null, arg5, arg6, arg3, arg0);
            class24.field509 = class83.method597((byte) -51).getGraphics();
            class64.field1358.method751(1, this, 122);
        } catch (Exception var10) {
            class70.method499(null, var10, 40);
        }
    }

    @OriginalMember(owner = "client!me", name = "providesignlink", descriptor = "(Lqd;)V")
    public static final void providesignlink(class99 arg0) {
        class64.field1358 = arg0;
        class128.field2750 = arg0;
        field1737++;
    }

    @OriginalMember(owner = "client!me", name = "start", descriptor = "()V")
    public final void start() {
        field1722++;
        if (class82.field1854 == this && !class69.field1519) {
            class2.field17 = 0L;
        }
    }

    @OriginalMember(owner = "client!me", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1733++;
        if (class47.field982 == null) {
            return class64.field1358 == null || class64.field1358.field2178 == this ? super.getDocumentBase() : class64.field1358.field2178.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZIII)V")
    public final void method543(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1727++;
        try {
            if (class82.field1854 == null) {
                class82.field1854 = this;
                class90.field1959 = arg4;
                class114.field2481 = arg0;
                if (arg1) {
                    this.method545(true);
                }
                class87.field1917 = arg2;
                if (class64.field1358 == null) {
                    class128.field2750 = class64.field1358 = new class99(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
                }
                class36.field718 = new Font("Helvetica", 1, 13);
                class94.field2057 = class83.method597((byte) -51).getFontMetrics(class36.field718);
                while (true) {
                    class24.field509 = class83.method597((byte) -51).getGraphics();
                    if (class24.field509 != null) {
                        class64.field1358.method751(1, this, 64);
                        return;
                    }
                    try {
                        class83.method597((byte) -51).repaint();
                    } catch (Exception var7) {
                    }
                    class108.method814((byte) 15, 100L);
                }
            } else {
                this.method547(!arg1, "alreadyloaded");
            }
        } catch (Exception var8) {
            class70.method499(null, var8, 40);
            this.method547(true, "crash");
        }
    }

    @OriginalMember(owner = "client!me", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1743++;
        if (class82.field1854 == this && !class69.field1519) {
            class2.field17 = System.currentTimeMillis();
            class108.method814((byte) 15, 5000L);
            class128.field2750 = null;
            this.method544(24);
        }
    }

    @OriginalMember(owner = "client!me", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1738++;
        if (class47.field982 == null) {
            return class64.field1358 == null || class64.field1358.field2178 == this ? super.getCodeBase() : class64.field1358.field2178.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    private final synchronized void method544(int arg0) {
        field1720++;
        if (class69.field1519) {
            return;
        }
        class69.field1519 = true;
        try {
            class83.method597((byte) -51).removeFocusListener(this);
        } catch (Exception var5) {
        }
        if (arg0 < 5) {
            field1748 = null;
        }
        try {
            this.method116((byte) -122);
        } catch (Exception var4) {
        }
        if (class47.field982 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class64.field1358 != null) {
            try {
                class64.field1358.method756(-106);
            } catch (Exception var2) {
            }
        }
        this.method115(0);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)Z")
    public final boolean method545(boolean arg0) {
        field1747++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
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
                this.method547(arg0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1716++;
        if (class82.field1854 == this && !class69.field1519) {
            class62.field1285 = true;
            if (class24.field509 == null) {
                class24.field509 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    private final void method546(byte arg0) {
        field1745++;
        long var2 = class23.field491[class13.field257];
        long var4 = System.currentTimeMillis();
        class23.field491[class13.field257] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class49.field1014 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != -125) {
            field1740 = null;
        }
        class13.field257 = class13.field257 + 1 & 0x1F;
        this.method112(true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method547(boolean arg0, String arg1) {
        System.out.println("error_game_" + arg1);
        if (!arg0) {
            return;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
        field1721++;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public static void method548(int arg0) {
        field1730 = null;
        field1736 = null;
        int var1 = 118 / ((arg0 + 49) / 56);
        field1734 = null;
        field1728 = null;
        field1740 = null;
        field1748 = null;
    }

    @OriginalMember(owner = "client!me", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILkc;BI)Lhc;")
    public static final class45 method549(int arg0, class63 arg1, byte arg2, int arg3) {
        field1739++;
        if (class101.method768(500, arg3, arg1, arg0)) {
            if (arg2 != 59) {
                field1736 = null;
            }
            return class9.method53(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public abstract void method116(byte arg0);

    @OriginalMember(owner = "client!me", name = "stop", descriptor = "()V")
    public final void stop() {
        field1741++;
        if (class82.field1854 == this && !class69.field1519) {
            class2.field17 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)I")
    public static final int method550(int arg0) {
        if (arg0 != 4) {
            method549(-19, null, (byte) 118, 76);
        }
        field1735++;
        return 19;
    }

    @OriginalMember(owner = "client!me", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1717++;
        class120.field2557 = false;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lc;I)V")
    public static final void method551(class13 arg0, int arg1) {
        field1731++;
        int var2 = 0;
        int var3 = -1;
        if (arg0.field256 == 0) {
            var2 = class120.field2562.method945(arg0.field243, arg0.field242, arg0.field250);
        }
        if (arg0.field256 == 1) {
            var2 = class120.field2562.method943(arg0.field243, arg0.field242, arg0.field250);
        }
        int var4 = -60 % ((arg1 - 23) / 34);
        if (arg0.field256 == 2) {
            var2 = class120.field2562.method983(arg0.field243, arg0.field242, arg0.field250);
        }
        if (arg0.field256 == 3) {
            var2 = class120.field2562.method956(arg0.field243, arg0.field242, arg0.field250);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0) {
            int var7 = class120.field2562.method990(arg0.field243, arg0.field242, arg0.field250, var2);
            var6 = var7 >> 6 & 0x3;
            var3 = var2 >> 14 & 0x7FFF;
            var5 = var7 & 0x1F;
        }
        arg0.field255 = var6;
        arg0.field248 = var5;
        arg0.field251 = var3;
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
    public abstract void method117(int arg0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/awt/Graphics;)V")
    public static final void method552(byte arg0, Graphics arg1) {
        field1723++;
        class39.field769.method69(arg1, 4, true, 550);
        if (arg0 < 42) {
            field1746 = -98;
        }
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
    public abstract void method119(int arg0);
}
