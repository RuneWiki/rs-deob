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
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class64 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "Z")
    private boolean field1643 = false;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[J")
    public static long[] field1604 = new long[32];

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "La;")
    public static class1 field1608 = null;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "La;")
    public static class1 field1614 = class113.method934(-11538, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "[I")
    public static int[] field1602 = new int[5];

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "La;")
    public static class1 field1635 = class113.method934(-11538, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "La;")
    public static class1 field1621 = class113.method934(-11538, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "La;")
    public static class1 field1634 = class113.method934(-11538, "null");

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "La;")
    public static class1 field1625 = class113.method934(-11538, "Hier klicken)1 um fortzufahren)3)3)3");

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "La;")
    public static class1 field1628 = class113.method934(-11538, "null");

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Le;")
    public static class25 field1601;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "Z")
    public static boolean field1646;

    @OriginalMember(owner = "client!kd", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        field1619++;
        try {
            if (class69.field1717 != null) {
                String var1 = class69.field1717.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class69.field1721;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method623((byte) 114, "wrongjava");
                        return;
                    }
                    class22.field686 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class69.field1721 == null || class69.field1721.equals("1.4.2"))) {
                    this.method623((byte) 27, "wrongjava");
                    return;
                }
            }
            if (class39.field1072.field1722 != null) {
                Method var3 = class69.field1706;
                if (var3 != null) {
                    try {
                        var3.invoke(class39.field1072.field1722, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method631((byte) 121);
            class4.field188 = class104.method878(class95.field2375, class23.field712, class122.field3052, -4875);
            this.method291(true);
            class70.field1750 = class109.method912((byte) 47);
            class70.field1750.method574(-10115);
            while (class11.field370 == 0L || class103.method872(1) < class11.field370) {
                class22.field682 = class70.field1750.method576(class81.field2052, class22.field686, 9799);
                for (int var4 = 0; var4 < class22.field682; var4++) {
                    this.method628(true);
                }
                this.method625((byte) 88);
            }
        } catch (Exception var7) {
            class11.method215(null, (byte) -121, var7);
            this.method623((byte) 62, "crash");
        }
        this.method618(118);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 88)
    private final synchronized void method618(int arg0) {
        field1627++;
        if (class36.field973) {
            return;
        }
        if (arg0 <= 86) {
            field1614 = null;
        }
        class36.field973 = true;
        try {
            class122.field3052.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method287(0);
        } catch (Exception var4) {
        }
        if (class75.field1862 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class39.field1072 != null) {
            try {
                class39.field1072.method650(0);
            } catch (Exception var2) {
            }
        }
        this.method289(28065);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 144)
    public static void method619(boolean arg0) {
        field1635 = null;
        field1608 = null;
        field1634 = null;
        field1628 = null;
        field1604 = null;
        field1614 = null;
        field1601 = null;
        field1621 = null;
        field1602 = null;
        field1625 = null;
        if (arg0) {
            field1604 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "stop", descriptor = "()V", line = 164)
    public final void stop() {
        field1622++;
        if (class6.field231 == this && !class36.field973) {
            class11.field370 = class103.method872(1) + 4000L;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V", line = 177)
    public static final void method620(boolean arg0, int arg1) {
        if (arg1 != 24041) {
            field1628 = null;
        }
        field1638++;
        if (class112.field2772 == null) {
            return;
        }
        try {
            class8 var2 = new class8(4);
            var2.method142(arg0 ? 2 : 3, (byte) -128);
            var2.method154(0, 13723);
            class112.field2772.method1019(4, (byte) -19, 0, var2.field285);
        } catch (IOException var4) {
            try {
                class112.field2772.method1018(-18);
            } catch (Exception var3) {
            }
            class112.field2772 = null;
            class16.field526++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII[Lqd;II)V", line = 206)
    public static final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class100[] arg7, int arg8, int arg9) {
        if (arg6 != 1) {
            providesignlink(null);
        }
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class100 var11 = arg7[var10];
            if (var11 != null && (var11.field2492 == 0 || var11.field2497) && var11 != null && var11.field2457 == arg5 && (!var11.field2559 || class36.field954)) {
                int var12 = var11.field2465 + arg4;
                int var13 = var11.field2505 + arg0;
                if (!var11.field2503) {
                    var13 -= arg9;
                }
                int var14 = var11.field2452 + var13;
                int var15 = arg0 >= var13 ? arg0 : var13;
                if (!var11.field2503) {
                    var12 -= arg2;
                }
                int var16 = var12 + var11.field2501;
                int var17 = arg4 < var12 ? var12 : arg4;
                int var18 = arg1 > var14 ? var14 : arg1;
                int var19 = var16 < arg8 ? var16 : arg8;
                if (var11.field2492 == 0) {
                    method621(var15, var18, var11.field2555, arg3, var17, var10, 1, arg7, var19, var11.field2540);
                    if (var11.field2522 != null) {
                        method621(var15, var18, var11.field2555, arg3, var17, var11.field2498, 1, var11.field2522, var19, var11.field2540);
                    }
                }
                if (var11.field2497) {
                    boolean var20;
                    if (class24.field742 >= var17 && var15 <= class102.field2571 && var19 > class24.field742 && var18 > class102.field2571) {
                        var20 = true;
                    } else {
                        var20 = false;
                    }
                    boolean var21 = false;
                    if (class28.field802 == 1 && var20) {
                        var21 = true;
                    }
                    boolean var22 = false;
                    if (var11.field2547 != -1 && var21 && class17.field549 == null) {
                        class12.field420 = class24.field742;
                        class17.field549 = var11;
                        class97.field2395 = class102.field2571;
                    }
                    if (class122.field3053 == 1 && var17 <= class112.field2765 && class1.field14 >= var15 && class112.field2765 < var19 && class1.field14 < var18) {
                        var22 = true;
                    }
                    if (class17.field549 != null) {
                        var21 = false;
                        var20 = false;
                        var22 = false;
                    }
                    if (!var11.field2539 && var22 && (arg3 & 0x1) != 0) {
                        var11.field2539 = true;
                        if (var11.field2490 != null) {
                            class86.method757(var11.field2490, 0, class1.field14 - var13, var11, class112.field2765 - var12, false);
                        }
                    }
                    if (var11.field2539 && var21 && (arg3 & 0x4) != 0 && var11.field2556 != null) {
                        class86.method757(var11.field2556, 0, class102.field2571 - var13, var11, class24.field742 - var12, false);
                    }
                    if (var11.field2539 && !var21 && (arg3 & 0x2) != 0) {
                        var11.field2539 = false;
                        if (var11.field2516 != null) {
                            class86.method757(var11.field2516, 0, class102.field2571 - var13, var11, class24.field742 - var12, false);
                        }
                    }
                    if (var21 && (arg3 & 0x8) != 0 && var11.field2453 != null) {
                        class86.method757(var11.field2453, 0, class102.field2571 - var13, var11, class24.field742 - var12, false);
                    }
                    if (!var11.field2491 && var20 && (arg3 & 0x10) != 0) {
                        var11.field2491 = true;
                        if (var11.field2467 != null) {
                            class86.method757(var11.field2467, 0, class102.field2571 - var13, var11, class24.field742 - var12, false);
                        }
                    }
                    if (var11.field2491 && var20 && (arg3 & 0x40) != 0 && var11.field2489 != null) {
                        class86.method757(var11.field2489, 0, class102.field2571 - var13, var11, class24.field742 - var12, false);
                    }
                    if (var11.field2491 && !var20 && (arg3 & 0x20) != 0) {
                        var11.field2491 = false;
                        if (var11.field2481 != null) {
                            class86.method757(var11.field2481, 0, class102.field2571 - var13, var11, class24.field742 - var12, false);
                        }
                    }
                    if (var11.field2521 != null && (arg3 & 0x80) != 0) {
                        class86.method757(var11.field2521, 0, 0, var11, 0, false);
                    }
                    if (class82.field2066 == class47.field1239 && var11.field2459 != null && (arg3 & 0x100) != 0) {
                        class86.method757(var11.field2459, 0, 0, var11, 0, false);
                    }
                }
            }
        }
        field1644++;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z", line = 379)
    public final boolean method622(int arg0) {
        field1637++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (arg0 != 31) {
            return false;
        } else if (var2.endsWith("jagex.com")) {
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
                this.method623((byte) 113, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 414)
    public final void windowOpened(WindowEvent arg0) {
        field1615++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;)V", line = 421)
    public final void method623(byte arg0, String arg1) {
        field1605++;
        if (this.field1643) {
            return;
        }
        this.field1643 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
        if (arg0 <= 26) {
            this.method624((byte) 96, 68, 28, 85, -56);
        }
    }

    @OriginalMember(owner = "client!kd", name = "start", descriptor = "()V", line = 442)
    public final void start() {
        field1633++;
        if (class6.field231 == this && !class36.field973) {
            class11.field370 = 0L;
        }
    }

    @OriginalMember(owner = "client!kd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 460)
    public final void focusLost(FocusEvent arg0) {
        class105.field2634 = false;
        field1603++;
    }

    @OriginalMember(owner = "client!kd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 469)
    public final synchronized void paint(Graphics arg0) {
        field1636++;
        if (class6.field231 != this || class36.field973) {
            return;
        }
        class97.field2405 = true;
        if (class69.field1721 != null && class69.field1721.startsWith("1.5") && class103.method872(1) - class6.field226 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class23.field712 <= var2.width && var2.height >= class95.field2375) {
                class133.field3245 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "destroy", descriptor = "()V", line = 501)
    public final void destroy() {
        field1642++;
        if (class6.field231 == this && !class36.field973) {
            class11.field370 = class103.method872(1);
            class86.method756(5000L, -123);
            class80.field2029 = null;
            this.method618(121);
        }
    }

    @OriginalMember(owner = "client!kd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 516)
    public final void focusGained(FocusEvent arg0) {
        class105.field2634 = true;
        class97.field2405 = true;
        field1611++;
    }

    @OriginalMember(owner = "client!kd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 525)
    public final URL getDocumentBase() {
        field1606++;
        if (class75.field1862 == null) {
            return class39.field1072 == null || class39.field1072.field1722 == this ? super.getDocumentBase() : class39.field1072.field1722.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIIII)V", line = 540)
    public final void method624(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1612++;
        try {
            if (class6.field231 != null) {
                this.method623((byte) 74, "alreadyloaded");
                return;
            }
            class23.field712 = arg3;
            class81.field2041 = arg1;
            class95.field2375 = arg2;
            class6.field231 = this;
            if (class39.field1072 == null) {
                class80.field2029 = class39.field1072 = new class69(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
            }
            class39.field1072.method659(1, 0, this);
        } catch (Exception var7) {
            class11.method215(null, (byte) -126, var7);
            this.method623((byte) 31, "crash");
        }
        if (arg0 != 120) {
            this.windowActivated(null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 583)
    public final void windowIconified(WindowEvent arg0) {
        field1623++;
    }

    @OriginalMember(owner = "client!kd", name = "providesignlink", descriptor = "(Llc;)V", line = 590)
    public static final void providesignlink(class69 arg0) {
        class39.field1072 = arg0;
        class80.field2029 = arg0;
        field1630++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 600)
    private final void method625(byte arg0) {
        field1616++;
        if (arg0 != 88) {
            return;
        }
        long var2 = class103.method872(1);
        long var4 = field1604[class67.field1659];
        field1604[class67.field1659] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class105.field2638 = ((var6 >> 1) + 32000) / var6;
        }
        class67.field1659 = class67.field1659 + 1 & 0x1F;
        if (class82.field2078++ > 50) {
            class82.field2078 -= 50;
            class97.field2405 = true;
            class122.field3052.setSize(class23.field712, class95.field2375);
            class122.field3052.setVisible(true);
            if (class75.field1862 == null) {
                class122.field3052.setLocation(0, 0);
            } else {
                Insets var7 = class75.field1862.getInsets();
                class122.field3052.setLocation(var7.left, var7.top);
            }
        }
        this.method284(arg0 - 210);
    }

    @OriginalMember(owner = "client!kd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 644)
    public final AppletContext getAppletContext() {
        field1624++;
        if (class75.field1862 == null) {
            return class39.field1072 == null || class39.field1072.field1722 == this ? super.getAppletContext() : class39.field1072.field1722.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I", line = 662)
    public static int method626(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V", line = 671)
    public static final void method627(long arg0, int arg1) {
        field1613++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        int var4 = -18 % ((arg1 - 69) / 44);
        while (class59.field1495 > var3) {
            if (class117.field2932[var3] == arg0) {
                class106.field2677++;
                class59.field1495--;
                class39.field1056 = true;
                for (int var5 = var3; var5 < class59.field1495; var5++) {
                    class119.field2954[var5] = class119.field2954[var5 + 1];
                    class73.field1791[var5] = class73.field1791[var5 + 1];
                    class117.field2932[var5] = class117.field2932[var5 + 1];
                }
                class70.field1729.method416(11453, 255);
                class70.field1729.method158(arg0, false);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V", line = 713)
    private final void method628(boolean arg0) {
        field1610++;
        long var2 = class103.method872(1);
        long var4 = class133.field3284[class122.field3051];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class133.field3284[class122.field3051] = var2;
        class122.field3051 = class122.field3051 + 1 & 0x1F;
        synchronized (this) {
            class48.field1279 = class105.field2634;
        }
        this.method280(-22636);
        if (!arg0) {
            this.windowIconified(null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/net/InetAddress;II)V", line = 743)
    public final void method629(String arg0, int arg1, int arg2, int arg3, int arg4, InetAddress arg5, int arg6, int arg7) {
        try {
            class81.field2041 = arg6;
            class23.field712 = arg7;
            class6.field231 = this;
            int var9 = 33 % ((39 - arg1) / 52);
            class95.field2375 = arg3;
            class75.field1862 = new Frame();
            class75.field1862.setTitle("Jagex");
            class75.field1862.setResizable(false);
            class75.field1862.addWindowListener(this);
            class75.field1862.setVisible(true);
            class75.field1862.toFront();
            Insets var10 = class75.field1862.getInsets();
            class75.field1862.setSize(arg7 + var10.left + var10.right, var10.top + var10.bottom + arg3);
            class80.field2029 = class39.field1072 = new class69(true, null, arg5, arg4, arg0, arg2);
            class39.field1072.method659(1, 0, this);
        } catch (Exception var12) {
            class11.method215(null, (byte) -127, var12);
        }
        field1617++;
    }

    @OriginalMember(owner = "client!kd", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 777)
    public final URL getCodeBase() {
        field1640++;
        if (class75.field1862 == null) {
            return class39.field1072 == null || class39.field1072.field1722 == this ? super.getCodeBase() : class39.field1072.field1722.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 794)
    public final void update(Graphics arg0) {
        field1641++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 807)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1609++;
    }

    @OriginalMember(owner = "client!kd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 815)
    public final String getParameter(String arg0) {
        field1626++;
        if (class75.field1862 == null) {
            return class39.field1072 == null || class39.field1072.field1722 == this ? super.getParameter(arg0) : class39.field1072.field1722.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 837)
    public final void windowDeactivated(WindowEvent arg0) {
        field1629++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIZI)I", line = 847)
    public static final int method630(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1639++;
        if (arg3) {
            int var5 = 65536 - class27.field779[arg4 * 1024 / arg1] >> 1;
            return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V", line = 872)
    public final synchronized void method631(byte arg0) {
        field1618++;
        Container var2;
        if (class75.field1862 == null) {
            var2 = class39.field1072.field1722;
        } else {
            var2 = class75.field1862;
        }
        if (class122.field3052 != null) {
            class122.field3052.removeFocusListener(this);
            var2.remove(class122.field3052);
        }
        class122.field3052 = new class62(this);
        var2.add(class122.field3052);
        class122.field3052.setSize(class23.field712, class95.field2375);
        class122.field3052.setVisible(true);
        if (class75.field1862 == null) {
            class122.field3052.setLocation(0, 0);
        } else {
            Insets var3 = class75.field1862.getInsets();
            class122.field3052.setLocation(var3.left, var3.top);
        }
        class122.field3052.addFocusListener(this);
        if (arg0 < 85) {
            this.run();
        }
        class122.field3052.requestFocus();
        class97.field2405 = true;
        class133.field3245 = false;
        class6.field226 = class103.method872(1);
    }

    @OriginalMember(owner = "client!kd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 923)
    public final void windowDeiconified(WindowEvent arg0) {
        field1620++;
    }

    @OriginalMember(owner = "client!kd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 934)
    public final void windowClosed(WindowEvent arg0) {
        field1632++;
    }

    @OriginalMember(owner = "client!kd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 941)
    public final void windowActivated(WindowEvent arg0) {
        field1607++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public abstract void method289(int arg0);

    @OriginalMember(owner = "client!kd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public abstract void method280(int arg0);

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
    public abstract void method287(int arg0);

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
    public abstract void method291(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public abstract void method284(int arg0);
}
