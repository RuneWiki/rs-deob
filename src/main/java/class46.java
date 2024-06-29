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

@OriginalClass("client!hd")
public abstract class class46 extends Applet implements Runnable, FocusListener {

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lec;")
    public static class28 field1034 = class28.method210(-46, "mapfunction");

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lec;")
    public static class28 field1033 = class28.method210(-46, "scrollbar");

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
    public static int[] field1017 = new int[500];

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Lec;")
    public static class28 field1038 = class28.method210(-46, " is already on your friend list");

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lec;")
    public static class28 field1027 = class28.method210(-46, "Connection lost");

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "Lec;")
    public static class28 field1051 = class28.method210(-46, "Loading title screen )2 ");

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Lec;")
    public static class28 field1049 = class28.method210(-46, "Loaded gamescreen");

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "[[I")
    public static int[][] field1053 = new int[104][104];

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Lec;")
    public static class28 field1039 = class28.method210(-46, "(U4");

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "Lbb;")
    public static class9 field1044;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Z")
    public static boolean field1054;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Z")
    public static boolean field1055;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public abstract void method117(int arg0);

    @OriginalMember(owner = "client!hd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1016++;
        if (class126.field2727 == null) {
            return class30.field652 == null || class30.field652.field1871 == this ? super.getAppletContext() : class30.field652.field1871.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)Lec;")
    public static final class28 method365(int arg0, long arg1) {
        field1046++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = client.field396[(int) (var8 - arg1 * 37L)];
            }
            if (arg0 >= -58) {
                return null;
            } else {
                class28 var7 = new class28();
                var7.field628 = var6;
                var7.field606 = var6.length;
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1030++;
        if (class126.field2727 == null) {
            return class30.field652 == null || class30.field652.field1871 == this ? super.getParameter(arg0) : class30.field652.field1871.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public abstract void method120(byte arg0);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    private final void method366(int arg0) {
        field1043++;
        long var2 = class74.field1629[class15.field291];
        long var4 = System.currentTimeMillis();
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 <= 23) {
            this.method368((byte) 62);
        }
        class74.field1629[class15.field291] = var4;
        class15.field291 = class15.field291 + 1 & 0x1F;
        synchronized (this) {
            class86.field1924 = class20.field449;
        }
        this.method120((byte) -91);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIZI)V")
    public final void method367(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1020++;
        try {
            if (class118.field2509 == null) {
                class126.field2726 = arg2;
                class118.field2509 = this;
                class94.field2077 = arg4;
                class56.field1286 = arg1;
                if (class30.field652 == null) {
                    class96.field2147 = class30.field652 = new class82(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
                }
                if (!arg3) {
                    providesignlink(null);
                }
                class45.field958 = new Font("Helvetica", 1, 13);
                class62.field1392 = class94.method677((byte) 6).getFontMetrics(class45.field958);
                while (true) {
                    class117.field2493 = class94.method677((byte) 6).getGraphics();
                    if (class117.field2493 != null) {
                        class30.field652.method617(this, -10172, 1);
                        return;
                    }
                    try {
                        class94.method677((byte) 6).repaint();
                    } catch (Exception var7) {
                    }
                    class31.method247(100L, (byte) 123);
                }
            } else {
                this.method374((byte) 22, "alreadyloaded");
            }
        } catch (Exception var8) {
            class119.method884(32, var8, null);
            this.method374((byte) 22, "crash");
        }
    }

    @OriginalMember(owner = "client!hd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hd", name = "run", descriptor = "()V")
    public final void run() {
        field1035++;
        try {
            if (class82.field1867 != null) {
                String var1 = class82.field1867.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class82.field1879;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method374((byte) 22, "wrongjava");
                        return;
                    }
                    class14.field249 = 5;
                }
            }
            class90.field1984 = class21.method152(class56.field1286, class94.method677((byte) 6), 8065, class126.field2726);
            class94.method677((byte) 6).addFocusListener(this);
            class94.method677((byte) 6).requestFocus();
            this.method125(1);
            class43.field941 = class72.method563(false);
            while (class62.field1383 == 0L || System.currentTimeMillis() < class62.field1383) {
                int var3 = class43.field941.method30(class66.field1517, class14.field249, 105);
                for (int var4 = 0; var4 < var3; var4++) {
                    this.method366(103);
                }
                this.method369((byte) -127);
            }
        } catch (Exception var6) {
            class119.method884(32, var6, null);
            this.method374((byte) 22, "crash");
        }
        this.method375(122);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Z")
    public final boolean method368(byte arg0) {
        field1021++;
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
            }
            this.method374((byte) 22, "invalidhost");
            if (arg0 != 82) {
                field1017 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    private final void method369(byte arg0) {
        field1052++;
        long var2 = System.currentTimeMillis();
        long var4 = class12.field210[class42.field908];
        class12.field210[class42.field908] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class94.field2073 = ((var6 >> 1) + 32000) / var6;
        }
        class42.field908 = class42.field908 + 1 & 0x1F;
        this.method117(-2);
        int var7 = -44 % ((4 - arg0) / 61);
    }

    @OriginalMember(owner = "client!hd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1036++;
        if (class126.field2727 == null) {
            return class30.field652 == null || class30.field652.field1871 == this ? super.getDocumentBase() : class30.field652.field1871.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class20.field449 = false;
        field1018++;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
    public static void method370(byte arg0) {
        if (arg0 <= 99) {
            method370((byte) 11);
        }
        field1033 = null;
        field1034 = null;
        field1027 = null;
        field1044 = null;
        field1053 = null;
        field1017 = null;
        field1049 = null;
        field1051 = null;
        field1038 = null;
        field1039 = null;
    }

    @OriginalMember(owner = "client!hd", name = "providesignlink", descriptor = "(Lnd;)V")
    public static final void providesignlink(class82 arg0) {
        class30.field652 = arg0;
        class96.field2147 = arg0;
        field1042++;
    }

    @OriginalMember(owner = "client!hd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1019++;
        if (class118.field2509 == this && !class25.field535) {
            this.paint(arg0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "stop", descriptor = "()V")
    public final void stop() {
        field1024++;
        if (class118.field2509 == this && !class25.field535) {
            class62.field1383 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V")
    public static final void method371(byte arg0) {
        field1048++;
        class122.field2656 = null;
        if (arg0 != 7) {
            field1031 = -71;
        }
    }

    @OriginalMember(owner = "client!hd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1023++;
        if (class118.field2509 == this && !class25.field535) {
            class62.field1383 = System.currentTimeMillis();
            class31.method247(5000L, (byte) 123);
            this.method375(114);
        }
    }

    @OriginalMember(owner = "client!hd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class20.field449 = true;
        field1045++;
        class117.field2492 = true;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static final void method372(int arg0) {
        field1022++;
        class72.field1597++;
        class72.method567(-1351, true);
        class96.method688(-1, true);
        class72.method567(-1351, false);
        class96.method688(-1, false);
        class48.method386((byte) -124);
        class61.method495(128);
        if (!class61.field1360) {
            int var1 = class57.field1306 + class122.field2663 & 0x7FF;
            int var2 = class25.field558;
            if (var2 < class96.field2141 / 256) {
                var2 = class96.field2141 / 256;
            }
            if (class23.field526[4] && var2 < class42.field909[4] + 128) {
                var2 = class42.field909[4] + 128;
            }
            class117.method846(class18.method107(class37.field848.field1501, class37.field848.field1446, -2049, class122.field2657) - 50, class50.field1177, var1, var2 * 3 + 600, class57.field1310, true, var2);
        }
        int var3;
        if (class61.field1360) {
            var3 = class49.method398((byte) 54);
        } else {
            var3 = class3.method11(73);
        }
        int var4 = class64.field1423;
        int var5 = class88.field1966;
        int var6 = class12.field196;
        int var7 = class4.field72;
        int var8 = class94.field2079;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class23.field526[var9]) {
                int var10 = (int) (Math.random() * (double) (class109.field2291[var9] * 2 + 1) + Math.sin((double) class14.field264[var9] / 100.0D * (double) class40.field859[var9]) * (double) class42.field909[var9] - (double) class109.field2291[var9]);
                if (var9 == 4) {
                    class4.field72 += var10;
                    if (class4.field72 < 128) {
                        class4.field72 = 128;
                    }
                    if (class4.field72 > 383) {
                        class4.field72 = 383;
                    }
                }
                if (var9 == 2) {
                    class94.field2079 += var10;
                }
                if (var9 == 0) {
                    class88.field1966 += var10;
                }
                if (var9 == 1) {
                    class64.field1423 += var10;
                }
                if (var9 == 3) {
                    class12.field196 = class12.field196 + var10 & 0x7FF;
                }
            }
        }
        class22.method157(109);
        class33.field750 = 0;
        class33.field757 = true;
        class33.field742 = class88.field1960 - 4;
        class33.field732 = class23.field530 - 4;
        class120.method906();
        class11.field179.method787(class88.field1966, class64.field1423, class94.field2079, class4.field72, class12.field196, var3);
        class11.field179.method769();
        class2.method4(117);
        class112.method821(false);
        ((class3) class60.field1331).method13(class12.field197, (byte) 79);
        if (arg0 != -9951) {
            method365(-108, 41L);
        }
        class125.method962(arg0 + 9924);
        if (class88.field1947 && class93.field2057.method397(true, false, false) == 0) {
            class88.field1947 = false;
        }
        if (class88.field1947) {
            class22.method157(-62);
            class120.method906();
            class124.method958((byte) 62, class8.field149, null, false);
        }
        class61.method497(class117.field2493, 0);
        class64.field1423 = var4;
        class12.field196 = var6;
        class94.field2079 = var8;
        class88.field1966 = var5;
        class4.field72 = var7;
    }

    @OriginalMember(owner = "client!hd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1050++;
        if (class126.field2727 == null) {
            return class30.field652 == null || class30.field652.field1871 == this ? super.getCodeBase() : class30.field652.field1871.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public static final void method373(int arg0) {
        field1037++;
        class88.field1963.method659(1000);
        if (arg0 != 0) {
            field1039 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "start", descriptor = "()V")
    public final void start() {
        field1028++;
        if (class118.field2509 == this && !class25.field535) {
            class62.field1383 = 0L;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(B)V")
    public abstract void method113(byte arg0);

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
    public abstract void method115(int arg0);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method374(byte arg0, String arg1) {
        if (arg0 != 22) {
            this.method115(-127);
        }
        field1047++;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    private final synchronized void method375(int arg0) {
        field1026++;
        if (class25.field535) {
            return;
        }
        class25.field535 = true;
        try {
            class94.method677((byte) 6).removeFocusListener(this);
            if (arg0 < 100) {
                this.focusGained(null);
            }
        } catch (Exception var5) {
        }
        try {
            this.method113((byte) 119);
        } catch (Exception var4) {
        }
        if (class126.field2727 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class30.field652 != null) {
            try {
                class30.field652.method621(94);
            } catch (Exception var2) {
            }
        }
        this.method115(-21200);
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public abstract void method125(int arg0);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/lang/String;ILjava/net/InetAddress;IBII)V")
    public final void method376(int arg0, String arg1, int arg2, InetAddress arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1041++;
        try {
            class126.field2726 = arg4;
            class56.field1286 = arg6;
            if (arg5 >= -90) {
                this.method125(-86);
            }
            class94.field2077 = arg2;
            class118.field2509 = this;
            class126.field2727 = new class14(this, class126.field2726, class56.field1286);
            class45.field958 = new Font("Helvetica", 1, 13);
            class62.field1392 = class126.field2727.getFontMetrics(class45.field958);
            class96.field2147 = class30.field652 = new class82(true, null, arg3, arg0, arg1, arg7);
            class117.field2493 = class94.method677((byte) 6).getGraphics();
            class30.field652.method617(this, -10172, 1);
        } catch (Exception var10) {
            class119.method884(32, var10, null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1029++;
        if (class118.field2509 == this && !class25.field535) {
            class117.field2492 = true;
            if (class117.field2493 == null) {
                class117.field2493 = arg0;
            }
        }
    }
}
