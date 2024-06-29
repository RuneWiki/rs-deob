import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class51 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Z")
    private boolean field1239 = false;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "[J")
    public static long[] field1235 = new long[100];

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lhb;")
    public static class44 field1230 = class102.method810("p11_full", -28606);

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lhb;")
    private static class44 field1248 = class102.method810("Accept challenge", -28606);

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Lhb;")
    public static class44 field1253 = field1248;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Lhb;")
    public static class44 field1258 = class102.method810("::noclip", -28606);

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Lhb;")
    public static class44 field1274 = class102.method810("", -28606);

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "Lhb;")
    public static class44 field1255 = field1274;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Lhb;")
    public static class44 field1261 = field1274;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lhb;")
    public static class44 field1238 = field1274;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lhb;")
    public static class44 field1232 = field1274;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lhb;")
    public static class44 field1234 = field1274;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "Z")
    public static boolean field1275 = false;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Lhb;")
    public static class44 field1257 = field1274;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lfc;")
    public static class34 field1256 = new class34(64);

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lhb;")
    private static class44 field1276 = class102.method810("Press (Wrecover a locked account(W on front page)3", -28606);

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lhb;")
    public static class44 field1277 = class102.method810("Angreifen", -28606);

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "Lhb;")
    public static class44 field1281 = field1276;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lhb;")
    public static class44 field1278 = class102.method810("welle:", -28606);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Ltd;")
    public static class116 field1243;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lne;")
    public static class83 field1280;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "Z")
    public static boolean field1283;

    @OriginalMember(owner = "client!ic", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6)
    public final void windowActivated(WindowEvent arg0) {
        field1270++;
    }

    @OriginalMember(owner = "client!ic", name = "start", descriptor = "()V", line = 14)
    public final void start() {
        field1227++;
        if (class36.field871 == this && !class117.field2851) {
            class18.field359 = 0L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 27)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1229++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[B)Z", line = 35)
    public static final boolean method481(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = 50 / ((-arg2 - 28) / 61);
        field1236++;
        boolean var5 = true;
        int var6 = -1;
        class131 var7 = new class131(arg3);
        label54: while (true) {
            int var8 = var7.method1019(174545128);
            if (var8 == 0) {
                return var5;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var7.method1019(174545128);
                    if (var12 == 0) {
                        continue label54;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 >> 6 & 0x3F;
                    int var14 = var9 & 0x3F;
                    int var15 = var7.method971(true) >> 2;
                    int var16 = arg1 + var13;
                    int var17 = arg0 + var14;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class57 var18 = class130.method965(var6, -123);
                        if (var15 != 22 || !class81.field2085 || var18.field1460 != 0 || var18.field1496) {
                            if (!var18.method529(-14240)) {
                                var5 = false;
                                class80.field2025++;
                            }
                            var10 = true;
                        }
                    }
                }
                int var11 = var7.method1019(174545128);
                if (var11 == 0) {
                    break;
                }
                var7.method971(true);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 121)
    public final URL getDocumentBase() {
        field1265++;
        if (class49.field1209 == null) {
            return class103.field2626 == null || class103.field2626.field1431 == this ? super.getDocumentBase() : class103.field2626.field1431.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V", line = 135)
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1228++;
        try {
            if (class36.field871 == null) {
                class27.field612 = arg2;
                class93.field2352 = arg1;
                if (arg3 != -30735) {
                    this.method484(-8);
                }
                client.field391 = arg0;
                class36.field871 = this;
                if (class103.field2626 == null) {
                    class40.field903 = class103.field2626 = new class56(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
                }
                class103.field2626.method524(1, this, (byte) 43);
            } else {
                this.method485((byte) -123, "alreadyloaded");
            }
        } catch (Exception var7) {
            client.method132(null, var7, (byte) 68);
            this.method485((byte) -123, "crash");
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lpb;Led;I[BII)V", line = 176)
    public static final void method483(class92[] arg0, class29 arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field1237++;
        class131 var6 = new class131(arg3);
        int var7 = 102 % ((-arg2 - 68) / 51);
        int var8 = -1;
        while (true) {
            int var9 = var6.method1019(174545128);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var6.method1019(174545128);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var6.method971(true);
                int var13 = var10 >> 12;
                int var14 = var10 >> 6 & 0x3F;
                int var15 = var12 >> 2;
                int var16 = var10 & 0x3F;
                int var17 = var12 & 0x3;
                int var18 = arg4 + var14;
                int var19 = var16 + arg5;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var13;
                    class92 var21 = null;
                    if ((class104.field2668[1][var18][var19] & 0x2) == 2) {
                        var20 = var13 - 1;
                    }
                    if (var20 >= 0) {
                        var21 = arg0[var20];
                    }
                    class97.method768(var19, var13, var8, var15, var17, var18, 1, var21, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 248)
    private final void method484(int arg0) {
        field1267++;
        long var2 = System.currentTimeMillis();
        long var4 = class81.field2086[class80.field2017];
        class81.field2086[class80.field2017] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 != -13936) {
            return;
        }
        class80.field2017 = class80.field2017 + 1 & 0x1F;
        synchronized (this) {
            class74.field1889 = class43.field1030;
        }
        this.method134(arg0 ^ 0xFFFFC9E1);
    }

    @OriginalMember(owner = "client!ic", name = "providesignlink", descriptor = "(Ljb;)V", line = 277)
    public static final void providesignlink(class56 arg0) {
        field1251++;
        class103.field2626 = arg0;
        class40.field903 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/lang/String;)V", line = 285)
    public final void method485(byte arg0, String arg1) {
        field1269++;
        if (this.field1239) {
            return;
        }
        this.field1239 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
        if (arg0 != -123) {
            field1279 = -44;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 309)
    private final synchronized void method486(int arg0) {
        if (arg0 < 113) {
            field1230 = null;
        }
        field1244++;
        if (class117.field2851) {
            return;
        }
        class117.field2851 = true;
        try {
            class22.field483.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method138((byte) 106);
        } catch (Exception var4) {
        }
        if (class49.field1209 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class103.field2626 != null) {
            try {
                class103.field2626.method520(-10577);
            } catch (Exception var2) {
            }
        }
        this.method131(-6);
    }

    @OriginalMember(owner = "client!ic", name = "stop", descriptor = "()V", line = 369)
    public final void stop() {
        field1254++;
        if (class36.field871 == this && !class117.field2851) {
            class18.field359 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 384)
    public final AppletContext getAppletContext() {
        field1264++;
        if (class49.field1209 == null) {
            return class103.field2626 == null || class103.field2626.field1431 == this ? super.getAppletContext() : class103.field2626.field1431.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 399)
    public final void windowDeactivated(WindowEvent arg0) {
        field1252++;
    }

    @OriginalMember(owner = "client!ic", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 411)
    public final synchronized void paint(Graphics arg0) {
        field1273++;
        if (class36.field871 != this || class117.field2851) {
            return;
        }
        class104.field2665 = true;
        if (class56.field1437 != null && class56.field1437.startsWith("1.5") && System.currentTimeMillis() - class92.field2319 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class27.field612 <= var2.width && var2.height >= client.field391) {
                class90.field2309 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 438)
    public final URL getCodeBase() {
        field1259++;
        if (class49.field1209 == null) {
            return class103.field2626 == null || class103.field2626.field1431 == this ? super.getCodeBase() : class103.field2626.field1431.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 460)
    public final String getParameter(String arg0) {
        field1231++;
        if (class49.field1209 == null) {
            return class103.field2626 == null || class103.field2626.field1431 == this ? super.getParameter(arg0) : class103.field2626.field1431.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 486)
    public final void windowOpened(WindowEvent arg0) {
        field1245++;
    }

    @OriginalMember(owner = "client!ic", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 498)
    public final void focusGained(FocusEvent arg0) {
        class43.field1030 = true;
        class104.field2665 = true;
        field1266++;
    }

    @OriginalMember(owner = "client!ic", name = "destroy", descriptor = "()V", line = 514)
    public final void destroy() {
        field1250++;
        if (class36.field871 == this && !class117.field2851) {
            class18.field359 = System.currentTimeMillis();
            class47.method447((byte) -101, 5000L);
            class40.field903 = null;
            this.method486(122);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 528)
    public static void method487(boolean arg0) {
        field1261 = null;
        field1280 = null;
        field1256 = null;
        field1258 = null;
        field1276 = null;
        field1248 = null;
        field1234 = null;
        field1281 = null;
        if (arg0) {
            return;
        }
        field1230 = null;
        field1235 = null;
        field1232 = null;
        field1278 = null;
        field1243 = null;
        field1255 = null;
        field1274 = null;
        field1238 = null;
        field1253 = null;
        field1277 = null;
        field1257 = null;
    }

    @OriginalMember(owner = "client!ic", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 556)
    public final void windowIconified(WindowEvent arg0) {
        field1262++;
    }

    @OriginalMember(owner = "client!ic", name = "run", descriptor = "()V", line = 563)
    public final void run() {
        field1263++;
        try {
            if (class56.field1423 != null) {
                String var1 = class56.field1423.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class56.field1437;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method485((byte) -123, "wrongjava");
                        return;
                    }
                    class28.field660 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class56.field1437 == null || class56.field1437.equals("1.4.2"))) {
                    this.method485((byte) -123, "wrongjava");
                    return;
                }
            }
            this.method491(-98);
            class1.field20 = class11.method80((byte) 90, class22.field483, class27.field612, client.field391);
            this.method140((byte) 11);
            class14.field276 = class131.method1010(false);
            class14.field276.method72(0);
            while (class18.field359 == 0L || class18.field359 > System.currentTimeMillis()) {
                class81.field2084 = class14.field276.method73(class28.field660, 0, class81.field2072);
                for (int var3 = 0; var3 < class81.field2084; var3++) {
                    this.method484(-13936);
                }
                this.method488(true);
            }
        } catch (Exception var5) {
            client.method132(null, var5, (byte) 68);
            this.method485((byte) -123, "crash");
        }
        this.method486(120);
    }

    @OriginalMember(owner = "client!ic", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 629)
    public final void focusLost(FocusEvent arg0) {
        class43.field1030 = false;
        field1247++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V", line = 639)
    private final void method488(boolean arg0) {
        field1241++;
        long var2 = System.currentTimeMillis();
        long var4 = class113.field2785[class125.field3022];
        class113.field2785[class125.field3022] = var2;
        class125.field3022 = class125.field3022 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class81.field2089 = ((var6 >> 1) + 32000) / var6;
        }
        if (class127.field3066++ > 50) {
            class127.field3066 -= 50;
            class104.field2665 = true;
            class22.field483.setSize(class27.field612, client.field391);
            class22.field483.setVisible(true);
            if (class49.field1209 == null) {
                class22.field483.setLocation(0, 0);
            } else {
                Insets var7 = class49.field1209.getInsets();
                class22.field483.setLocation(var7.left, var7.top);
            }
        }
        if (!arg0) {
            field1256 = null;
        }
        this.method141((byte) 9);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)Z", line = 681)
    public final boolean method489(int arg0) {
        field1260++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 != -1) {
            field1238 = null;
        }
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
                this.method485((byte) -123, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/net/InetAddress;IILjava/lang/String;III)V", line = 715)
    public final void method490(int arg0, InetAddress arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field1249++;
        try {
            class27.field612 = arg2;
            client.field391 = arg6;
            class93.field2352 = arg0;
            class36.field871 = this;
            class49.field1209 = new Frame();
            class49.field1209.setTitle("Jagex");
            if (arg7 != -8796) {
                this.method131(117);
            }
            class49.field1209.setResizable(false);
            class49.field1209.addWindowListener(this);
            class49.field1209.setVisible(true);
            class49.field1209.toFront();
            Insets var9 = class49.field1209.getInsets();
            class49.field1209.setSize(var9.left + arg2 + var9.right, var9.top + arg6 + var9.bottom);
            class40.field903 = class103.field2626 = new class56(true, null, arg1, arg3, arg4, arg5);
            class103.field2626.method524(1, this, (byte) 43);
        } catch (Exception var11) {
            client.method132(null, var11, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V", line = 756)
    public final synchronized void method491(int arg0) {
        field1272++;
        Container var2;
        if (class49.field1209 == null) {
            var2 = class103.field2626.field1431;
        } else {
            var2 = class49.field1209;
        }
        if (class22.field483 != null) {
            class22.field483.removeFocusListener(this);
            var2.remove(class22.field483);
        }
        class22.field483 = new class101(this);
        var2.add(class22.field483);
        class22.field483.setSize(class27.field612, client.field391);
        if (arg0 > -87) {
            this.method131(-128);
        }
        class22.field483.setVisible(true);
        if (class49.field1209 == null) {
            class22.field483.setLocation(0, 0);
        } else {
            Insets var3 = class49.field1209.getInsets();
            class22.field483.setLocation(var3.left, var3.top);
        }
        class22.field483.addFocusListener(this);
        class22.field483.requestFocus();
        class104.field2665 = true;
        class90.field2309 = false;
        class92.field2319 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!ic", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 804)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1233++;
    }

    @OriginalMember(owner = "client!ic", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 837)
    public final void windowClosed(WindowEvent arg0) {
        field1246++;
    }

    @OriginalMember(owner = "client!ic", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 859)
    public final void windowDeiconified(WindowEvent arg0) {
        field1271++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public abstract void method140(byte arg0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public abstract void method138(byte arg0);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public abstract void method141(byte arg0);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public abstract void method134(int arg0);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public abstract void method131(int arg0);

    @OriginalMember(owner = "client!ic", name = "init", descriptor = "()V")
    public abstract void init();
}
