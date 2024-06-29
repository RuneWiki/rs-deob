import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class80 extends Applet implements Runnable, FocusListener {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lo;")
    public static class84 field1699 = class15.method124("(U3", 255);

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lo;")
    public static class84 field1703 = class15.method124("Existing User", 255);

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Lo;")
    public static class84 field1715 = class15.method124("Friends", 255);

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lo;")
    public static class84 field1712 = class15.method124("This computers address has been blocked", 255);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field1698 = 0;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field1721 = 0;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lo;")
    public static class84 field1714 = class15.method124("Imported maps", 255);

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "Lo;")
    public static class84 field1728 = class15.method124(" days ago", 255);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lo;")
    public static class84 field1695 = class15.method124("mapmarker", 255);

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "Lo;")
    public static class84 field1730 = class15.method124("Message @whi@", 255);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Lud;")
    public static class118 field1718;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Lud;")
    public static class118 field1719;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lp;")
    public static class89 field1720;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
    public static boolean field1732;

    @OriginalMember(owner = "client!nb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 3)
    public final AppletContext getAppletContext() {
        field1707++;
        if (class126.field2795 == null) {
            return class118.field2627 == null || class118.field2627.field187 == this ? super.getAppletContext() : class118.field2627.field187.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 19)
    private final synchronized void method583(int arg0) {
        field1697++;
        if (arg0 != -14367) {
            field1718 = null;
        }
        if (class67.field1468) {
            return;
        }
        class67.field1468 = true;
        try {
            class8.method61(-125).removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method153((byte) -81);
        } catch (Exception var4) {
        }
        if (class126.field2795 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class118.field2627 != null) {
            try {
                class118.field2627.method79(0);
            } catch (Exception var2) {
            }
        }
        this.method152(-4700);
    }

    @OriginalMember(owner = "client!nb", name = "providesignlink", descriptor = "(Lbb;)V", line = 74)
    public static final void providesignlink(class9 arg0) {
        field1708++;
        class118.field2627 = arg0;
        class48.field1012 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 83)
    public static void method584(boolean arg0) {
        field1720 = null;
        field1703 = null;
        field1695 = null;
        field1718 = null;
        field1728 = null;
        field1714 = null;
        field1712 = null;
        if (!arg0) {
            field1718 = null;
        }
        field1715 = null;
        field1699 = null;
        field1719 = null;
        field1730 = null;
    }

    @OriginalMember(owner = "client!nb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 106)
    public final String getParameter(String arg0) {
        field1709++;
        if (class126.field2795 == null) {
            return class118.field2627 == null || class118.field2627.field187 == this ? super.getParameter(arg0) : class118.field2627.field187.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 122)
    public final void focusGained(FocusEvent arg0) {
        class55.field1133 = true;
        class1.field5 = true;
        field1704++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V", line = 131)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1724++;
        try {
            if (class117.field2547 == null) {
                class104.field2195 = arg2;
                class50.field1080 = arg3;
                if (arg4 != 22895) {
                    field1730 = null;
                }
                class89.field2018 = arg1;
                class117.field2547 = this;
                if (class118.field2627 == null) {
                    class48.field1012 = class118.field2627 = new class9(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
                }
                class118.field2627.method83(1, this, (byte) 31);
            } else {
                this.method588(arg4 ^ 0x5903, "alreadyloaded");
            }
        } catch (Exception var7) {
            class45.method392((byte) 82, null, var7);
            this.method588(110, "crash");
        }
    }

    @OriginalMember(owner = "client!nb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 162)
    public final void paint(Graphics arg0) {
        field1729++;
        if (class117.field2547 == this && !class67.field1468) {
            class1.field5 = true;
        }
    }

    @OriginalMember(owner = "client!nb", name = "run", descriptor = "()V", line = 177)
    public final void run() {
        field1725++;
        try {
            if (class9.field183 != null) {
                String var1 = class9.field183.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class9.field175;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method588(107, "wrongjava");
                        return;
                    }
                    class74.field1548 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class9.field175 == null || class9.field175.equals("1.4.2"))) {
                    this.method588(124, "wrongjava");
                    return;
                }
            }
            while (true) {
                class30.field593 = class8.method61(-112).getGraphics();
                if (class30.field593 != null) {
                    class35.field696 = class101.method763(class104.field2195, class8.method61(-104), -8, class89.field2018);
                    class8.method61(-106).addFocusListener(this);
                    class8.method61(-121).requestFocus();
                    this.method148(-12527);
                    class106.field2246 = class65.method502(61);
                    class106.field2246.method186(7971);
                    while (class114.field2475 == 0L || System.currentTimeMillis() < class114.field2475) {
                        class28.field556 = class106.field2246.method183((byte) 120, class78.field1664, class74.field1548);
                        for (int var3 = 0; var3 < class28.field556; var3++) {
                            this.method586(-1);
                        }
                        this.method590(24682);
                    }
                    break;
                }
                try {
                    class8.method61(-128).repaint();
                } catch (Exception var5) {
                }
                class113.method873(true, 100L);
            }
        } catch (Exception var6) {
            class45.method392((byte) 87, null, var6);
            this.method588(115, "crash");
        }
        this.method583(-14367);
    }

    @OriginalMember(owner = "client!nb", name = "start", descriptor = "()V", line = 264)
    public final void start() {
        field1710++;
        if (class117.field2547 == this && !class67.field1468) {
            class114.field2475 = 0L;
        }
    }

    @OriginalMember(owner = "client!nb", name = "destroy", descriptor = "()V", line = 275)
    public final void destroy() {
        field1727++;
        if (class117.field2547 == this && !class67.field1468) {
            class114.field2475 = System.currentTimeMillis();
            class113.method873(true, 5000L);
            class48.field1012 = null;
            this.method583(-14367);
        }
    }

    @OriginalMember(owner = "client!nb", name = "stop", descriptor = "()V", line = 295)
    public final void stop() {
        field1713++;
        if (class117.field2547 == this && !class67.field1468) {
            class114.field2475 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "client!nb", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 307)
    public final URL getCodeBase() {
        field1700++;
        if (class126.field2795 == null) {
            return class118.field2627 == null || class118.field2627.field187 == this ? super.getCodeBase() : class118.field2627.field187.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 337)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1705++;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 346)
    private final void method586(int arg0) {
        field1696++;
        long var2 = System.currentTimeMillis();
        long var4 = class116.field2520[class36.field711];
        class116.field2520[class36.field711] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class36.field711 = class36.field711 - arg0 & 0x1F;
        synchronized (this) {
            class116.field2513 = class55.field1133;
        }
        this.method154(true);
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Z", line = 379)
    public final boolean method587(int arg0) {
        if (arg0 != -1) {
            return false;
        }
        field1694++;
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
                this.method588(127, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 417)
    public final void method588(int arg0, String arg1) {
        if (arg0 < 103) {
            field1715 = null;
        }
        field1711++;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!nb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 434)
    public final void focusLost(FocusEvent arg0) {
        field1726++;
        class55.field1133 = false;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZB[BII)V", line = 445)
    public static final void method589(boolean arg0, byte arg1, byte[] arg2, int arg3, int arg4) {
        field1717++;
        if (arg1 >= -60) {
            method584(true);
        }
        if (class127.field2813 == null) {
            return;
        }
        if (class73.field1533 >= 0) {
            class61.field1274 = arg4;
            if (class73.field1533 == 0) {
                class21.field387 = 1;
            } else {
                int var5 = class50.method436(class73.field1533, (byte) 108);
                int var6 = var5 - class122.field2731;
                class21.field387 = (var6 + 3600) / arg4;
                if (class21.field387 < 1) {
                    class21.field387 = 1;
                }
            }
            class30.field600 = arg2;
            class27.field539 = arg0;
            class33.field653 = arg3;
        } else if (class21.field387 == 0) {
            class85.method679(arg0, 0, arg3, arg2);
        } else {
            class30.field600 = arg2;
            class33.field653 = arg3;
            class27.field539 = arg0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V", line = 498)
    private final void method590(int arg0) {
        long var2 = class107.field2282[class128.field2817];
        if (arg0 != 24682) {
            return;
        }
        field1716++;
        long var4 = System.currentTimeMillis();
        class107.field2282[class128.field2817] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class82.field1767 = ((var6 >> 1) + 32000) / var6;
        }
        class128.field2817 = class128.field2817 + 1 & 0x1F;
        this.method145(-110);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lwc;BI)V", line = 523)
    public static final void method591(class127 arg0, byte arg1, int arg2) {
        field1722++;
        if (arg1 != 31) {
            method592(-98);
        }
        while (true) {
            class116 var3 = (class116) class125.field2775.method695((byte) -120);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2512; var5++) {
                if (var3.field2537[var5] != null) {
                    if (var3.field2537[var5].field2091 == 2) {
                        var3.field2523[var5] = -5;
                    }
                    if (var3.field2537[var5].field2091 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2519[var5] != null) {
                    if (var3.field2519[var5].field2091 == 2) {
                        var3.field2523[var5] = -6;
                    }
                    if (var3.field2519[var5].field2091 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method979(1, arg2);
            arg0.method226(-9646, 0);
            int var6 = arg0.field482;
            arg0.method248(var3.field2522, -2147393384);
            for (int var7 = 0; var7 < var3.field2512; var7++) {
                if (var3.field2523[var7] == 0) {
                    try {
                        int var8 = var3.field2526[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2537[var7].field2093;
                            int var13 = var12.getInt(null);
                            arg0.method226(-9646, 0);
                            arg0.method248(var13, -2147393384);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field2537[var7].field2093;
                            var9.setInt(null, var3.field2535[var7]);
                            arg0.method226(-9646, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field2537[var7].field2093;
                            int var11 = var10.getModifiers();
                            arg0.method226(-9646, 0);
                            arg0.method248(var11, arg1 - 2147393415);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2519[var7].field2093;
                            byte[][] var17 = var3.field2527[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method226(-9646, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method226(arg1 ^ 0xFFFFDA4D, 1);
                                arg0.method203(-24628, ((Number) var21).longValue());
                            } else if (var21 instanceof class84) {
                                arg0.method226(arg1 - 9677, 2);
                                arg0.method206((class84) var21, (byte) -63);
                            } else {
                                arg0.method226(-9646, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2519[var7].field2093;
                            int var15 = var14.getModifiers();
                            arg0.method226(-9646, 0);
                            arg0.method248(var15, -2147393384);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method226(-9646, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method226(arg1 - 9677, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method226(arg1 - 9677, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method226(-9646, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method226(-9646, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method226(arg1 - 9677, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method226(-9646, -16);
                    } catch (SecurityException var29) {
                        arg0.method226(-9646, -17);
                    } catch (IOException var30) {
                        arg0.method226(arg1 - 9677, -18);
                    } catch (NullPointerException var31) {
                        arg0.method226(-9646, -19);
                    } catch (Exception var32) {
                        arg0.method226(-9646, -20);
                    } catch (Throwable var33) {
                        arg0.method226(-9646, -21);
                    }
                } else {
                    arg0.method226(-9646, var3.field2523[var7]);
                }
            }
            arg0.method210(3166, var6);
            arg0.method254(-128, arg0.field482 - var6);
            var3.method333(0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)Lqb;", line = 719)
    public static final class96 method592(int arg0) {
        class96 var1 = new class96();
        field1723++;
        var1.field2061 = class51.field1098;
        var1.field2060 = class125.field2768;
        var1.field2059 = class101.field2156[0];
        var1.field2057 = class116.field2543[0];
        var1.field2056 = class78.field1668[0];
        var1.field2062 = class24.field397[0];
        if (arg0 < 27) {
            method584(false);
        }
        var1.field2063 = class25.field432;
        var1.field2058 = class110.field2385[0];
        class112.method864(-104);
        return var1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;ILjava/net/InetAddress;BIII)V", line = 741)
    public final void method593(int arg0, String arg1, int arg2, InetAddress arg3, byte arg4, int arg5, int arg6, int arg7) {
        field1701++;
        if (arg4 != 54) {
            this.init();
        }
        try {
            class89.field2018 = arg6;
            class50.field1080 = arg0;
            class104.field2195 = arg7;
            class117.field2547 = this;
            class126.field2795 = new class60(this, class104.field2195, class89.field2018);
            class48.field1012 = class118.field2627 = new class9(true, null, arg3, arg2, arg1, arg5);
            class118.field2627.method83(1, this, (byte) 31);
        } catch (Exception var10) {
            class45.method392((byte) 120, null, var10);
        }
    }

    @OriginalMember(owner = "client!nb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 777)
    public final URL getDocumentBase() {
        field1702++;
        if (class126.field2795 == null) {
            return class118.field2627 == null || class118.field2627.field187 == this ? super.getDocumentBase() : class118.field2627.field187.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public abstract void method148(int arg0);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
    public abstract void method154(boolean arg0);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public abstract void method145(int arg0);

    @OriginalMember(owner = "client!nb", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public abstract void method153(byte arg0);
}
