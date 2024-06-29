import java.applet.Applet;
import java.applet.AppletContext;
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

@OriginalClass("client!qc")
public abstract class class99 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Z")
    private boolean field1444 = false;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Lrg;")
    public static class326 field1438 = null;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1427 = "Please wait...";

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "[I")
    public static int[] field1441 = new int[25];

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field1442 = 0;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "[Lqi;")
    public static class234[] field1445 = new class234[32768];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "J")
    public static long field1451;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lwg;")
    public static class322 field1429;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[Lem;")
    public static class260[] field1416;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I", line = 13)
    public static final int method671(String arg0, int arg1, int arg2, String arg3) {
        int var4 = arg0.length();
        field1436++;
        int var5 = arg3.length();
        int var6 = 0;
        char var7 = 0;
        int var8 = 0;
        char var9 = 0;
        while ((var6 - var7) < var4 || var8 - var9 < var5) {
            if ((var6 - var7) >= var4) {
                return -1;
            }
            if ((var8 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var8++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var7 = class89.method601((byte) -110, var22);
            var9 = class89.method601((byte) -108, var24);
            char var26 = class138.method1024(arg2, var22, -506);
            char var27 = class138.method1024(arg2, var24, -506);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class295.method2108(var28, arg2, (byte) -5) - class295.method2108(var29, arg2, (byte) -5);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg2 == 2) {
                var13 = var4 - var11 - 1;
                var12 = var5 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class295.method2108(var16, arg2, (byte) -5) - class295.method2108(var17, arg2, (byte) -5);
                }
            }
        }
        int var18 = var4 - var5;
        if (var18 != 0) {
            return var18;
        } else if (arg1 == -7972) {
            for (int var19 = 0; var19 < var10; var19++) {
                char var20 = arg0.charAt(var19);
                char var21 = arg3.charAt(var19);
                if (var20 != var21) {
                    return class295.method2108(var20, arg2, (byte) -5) - class295.method2108(var21, arg2, (byte) -5);
                }
            }
            return 0;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Z", line = 136)
    public final boolean method672(boolean arg0) {
        field1426++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else if (arg0) {
                return false;
            } else {
                this.method685(-59, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 172)
    public final void windowDeactivated(WindowEvent arg0) {
        field1448++;
    }

    @OriginalMember(owner = "client!qc", name = "providesignlink", descriptor = "(Ljh;)V", line = 179)
    public static final void providesignlink(class124 arg0) {
        field1431++;
        class14.field159 = arg0;
        class175.field2899 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 192)
    public final void windowClosed(WindowEvent arg0) {
        field1413++;
    }

    @OriginalMember(owner = "client!qc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 200)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1417++;
    }

    @OriginalMember(owner = "client!qc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 220)
    public final void windowActivated(WindowEvent arg0) {
        field1434++;
    }

    @OriginalMember(owner = "client!qc", name = "start", descriptor = "()V", line = 228)
    public final void start() {
        field1423++;
        if (class265.field4289 == this && !class287.field4595) {
            class149.field2316 = 0L;
        }
    }

    @OriginalMember(owner = "client!qc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 240)
    public final void windowOpened(WindowEvent arg0) {
        field1419++;
    }

    @OriginalMember(owner = "client!qc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 249)
    public final AppletContext getAppletContext() {
        field1437++;
        if (class278.field4482 == null) {
            return class14.field159 == null || class14.field159.field1951 == this ? super.getAppletContext() : class14.field159.field1951.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V", line = 264)
    public static void method675(boolean arg0) {
        if (arg0) {
            method675(false);
        }
        field1416 = null;
        field1429 = null;
        field1427 = null;
        field1445 = null;
        field1441 = null;
        field1438 = null;
    }

    @OriginalMember(owner = "client!qc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 280)
    public final void focusLost(FocusEvent arg0) {
        field1422++;
        class217.field3524 = false;
    }

    @OriginalMember(owner = "client!qc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 288)
    public final URL getCodeBase() {
        field1430++;
        if (class278.field4482 == null) {
            return class14.field159 == null || class14.field159.field1951 == this ? super.getCodeBase() : class14.field159.field1951.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "stop", descriptor = "()V", line = 303)
    public final void stop() {
        field1449++;
        if (class265.field4289 == this && !class287.field4595) {
            class149.field2316 = class283.method2038((byte) 126) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 315)
    public final synchronized void paint(Graphics arg0) {
        field1435++;
        if (class265.field4289 != this || class287.field4595) {
            return;
        }
        class182.field3010 = true;
        if (class139.field2192 && !class232.field3690 && class283.method2038((byte) 124) - class79.field1110 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class55.field780 && var2.height >= class88.field1221) {
                class129.field2013 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 340)
    public final synchronized void method676(int arg0) {
        field1433++;
        if (class94.field1290 != null) {
            class94.field1290.removeFocusListener(this);
            class94.field1290.getParent().remove(class94.field1290);
        }
        Container var2;
        if (class204.field3362 != null) {
            var2 = class204.field3362;
        } else if (class278.field4482 == null) {
            var2 = class14.field159.field1951;
        } else {
            var2 = class278.field4482;
        }
        var2.setLayout((LayoutManager) null);
        class94.field1290 = new class261(this);
        var2.add(class94.field1290);
        class94.field1290.setSize(class133.field2095, class20.field276);
        class94.field1290.setVisible(true);
        if (class278.field4482 == var2) {
            Insets var3 = class278.field4482.getInsets();
            class94.field1290.setLocation(class36.field481 + var3.left, class46.field641 + var3.top);
        } else {
            class94.field1290.setLocation(class36.field481, class46.field641);
        }
        class94.field1290.addFocusListener(this);
        class94.field1290.requestFocus();
        class217.field3524 = true;
        class182.field3010 = true;
        if (arg0 < 53) {
            this.method678(true);
        }
        class129.field2013 = false;
        class101.field1469 = true;
        class79.field1110 = class283.method2038((byte) 126);
    }

    @OriginalMember(owner = "client!qc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 389)
    public final URL getDocumentBase() {
        field1428++;
        if (class278.field4482 == null) {
            return class14.field159 == null || class14.field159.field1951 == this ? super.getDocumentBase() : class14.field159.field1951.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/String;IZ)I", line = 404)
    public static final int method677(int arg0, String arg1, int arg2, boolean arg3) {
        field1439++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (arg2 != 50) {
            field1441 = (int[]) null;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!qc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 485)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1450++;
    }

    @OriginalMember(owner = "client!qc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 495)
    public final void windowDeiconified(WindowEvent arg0) {
        field1414++;
    }

    @OriginalMember(owner = "client!qc", name = "destroy", descriptor = "()V", line = 502)
    public final void destroy() {
        field1440++;
        if (class265.field4289 == this && !class287.field4595) {
            class149.field2316 = class283.method2038((byte) 123);
            class121.method867((byte) 58, 5000L);
            class175.field2899 = null;
            this.method679(false, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZB)V", line = 520)
    private final void method679(boolean arg0, byte arg1) {
        if (arg1 >= -50) {
            return;
        }
        field1432++;
        synchronized (this) {
            if (class287.field4595) {
                return;
            }
            class287.field4595 = true;
        }
        if (class14.field159.field1951 != null) {
            class14.field159.field1951.destroy();
        }
        try {
            this.method674(93);
        } catch (Exception var12) {
        }
        if (class94.field1290 != null) {
            try {
                class94.field1290.removeFocusListener(this);
                class94.field1290.getParent().remove(class94.field1290);
            } catch (Exception var11) {
            }
        }
        if (class14.field159 != null) {
            try {
                class14.field159.method891(true);
            } catch (Exception var10) {
            }
        }
        this.method678(false);
        if (class278.field4482 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V", line = 581)
    public final void method680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1412++;
        try {
            if (class265.field4289 != null) {
                class322.field4999++;
                if (class322.field4999 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method685(-104, "alreadyloaded");
                return;
            }
            class36.field481 = 0;
            class133.field2095 = arg2;
            class55.field780 = arg2;
            class46.field641 = 0;
            class265.field4289 = this;
            class286.field4582 = arg3;
            class20.field276 = arg0;
            class88.field1221 = arg0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class110.field1634 = true;
            } else {
                class110.field1634 = false;
            }
            if (class14.field159 == null) {
                class175.field2899 = class14.field159 = new class124(this, arg4, (String) null, 0);
            }
            if (arg1 < 81) {
                field1438 = (class326) null;
            }
            class161 var7 = class14.field159.method898(this, (byte) -107, 1);
            while (var7.field2661 == 0) {
                class121.method867((byte) 42, 10L);
            }
            class258.field4136 = (Thread) var7.field2664;
        } catch (Exception var9) {
            class26.method152(var9, (String) null, -126);
            this.method685(-104, "crash");
        }
    }

    @OriginalMember(owner = "client!qc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 637)
    public final String getParameter(String arg0) {
        field1421++;
        if (class278.field4482 == null) {
            return class14.field159 == null || class14.field159.field1951 == this ? super.getParameter(arg0) : class14.field159.field1951.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZIIBILjava/lang/String;)V", line = 665)
    public final void method682(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, String arg7) {
        try {
            class46.field641 = 0;
            class286.field4582 = arg1;
            class133.field2095 = arg3;
            class55.field780 = arg3;
            class36.field481 = 0;
            class265.field4289 = this;
            class20.field276 = arg0;
            class88.field1221 = arg0;
            if (arg5 != 28) {
                return;
            }
            class278.field4482 = new Frame();
            class278.field4482.setTitle("Jagex");
            class278.field4482.setResizable(true);
            class278.field4482.addWindowListener(this);
            class278.field4482.setVisible(true);
            class278.field4482.toFront();
            Insets var9 = class278.field4482.getInsets();
            class278.field4482.setSize(var9.right + var9.left + class55.field780, class88.field1221 + var9.top + var9.bottom);
            class175.field2899 = class14.field159 = new class124((Applet) null, arg4, arg7, arg6);
            class161 var10 = class14.field159.method898(this, (byte) -53, 1);
            while (var10.field2661 == 0) {
                class121.method867((byte) -90, 10L);
            }
            class258.field4136 = (Thread) var10.field2664;
        } catch (Exception var12) {
            class26.method152(var12, (String) null, arg5 - 82);
        }
        field1425++;
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V", line = 707)
    private final void method684(int arg0) {
        long var2 = class283.method2038((byte) 123);
        field1411++;
        int var4 = -47 / ((arg0 - 47) / 42);
        long var5 = class65.field943[class39.field495];
        class65.field943[class39.field495] = var2;
        if (var5 != 0L && var2 > var5) {
            int var7 = (int) (var2 - var5);
            class145.field2257 = ((var7 >> 1) + 32000) / var7;
        }
        class39.field495 = class39.field495 + 1 & 0x1F;
        if ((class128.field1999++) > 50) {
            class182.field3010 = true;
            class128.field1999 -= 50;
            class94.field1290.setSize(class133.field2095, class20.field276);
            class94.field1290.setVisible(true);
            if (class278.field4482 != null && class204.field3362 == null) {
                Insets var8 = class278.field4482.getInsets();
                class94.field1290.setLocation(class36.field481 + var8.left, var8.top - -class46.field641);
            } else {
                class94.field1290.setLocation(class36.field481, class46.field641);
            }
        }
        this.method681(-16209);
    }

    @OriginalMember(owner = "client!qc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 751)
    public final void windowIconified(WindowEvent arg0) {
        field1418++;
    }

    @OriginalMember(owner = "client!qc", name = "run", descriptor = "()V", line = 759)
    public final void run() {
        field1420++;
        try {
            if (class124.field1947 != null) {
                String var1 = class124.field1947.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class124.field1930;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method685(-74, "wrongjava");
                        return;
                    }
                    class156.field2417 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class124.field1930 == null || class124.field1930.equals("1.4.2"))) {
                    this.method685(-62, "wrongjava");
                    return;
                }
            }
            if (class124.field1930 != null && class124.field1930.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class124.field1930.length()) {
                    char var5 = class124.field1930.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class139.field2192 = true;
                }
            }
            if (class14.field159.field1951 != null) {
                Method var6 = class124.field1948;
                if (var6 != null) {
                    try {
                        var6.invoke(class14.field159.field1951, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class224.method1593(-78);
            this.method676(92);
            class8.field120 = class210.method1518(class94.field1290, 61, class20.field276, class133.field2095);
            this.method673((byte) -123);
            class106.field1579 = class184.method1381(false);
            while (class149.field2316 == 0L || class283.method2038((byte) 125) < class149.field2316) {
                class142.field2231 = class106.field1579.method163(0, class156.field2417, class94.field1286);
                for (int var8 = 0; var8 < class142.field2231; var8++) {
                    this.method686((byte) -113);
                }
                this.method684(92);
                class300.method2137(class94.field1290, (byte) -61, class14.field159);
            }
        } catch (Exception var11) {
            class26.method152(var11, (String) null, -107);
            this.method685(-97, "crash");
        }
        this.method679(true, (byte) -63);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/String;)V", line = 872)
    public final void method685(int arg0, String arg1) {
        field1424++;
        if (this.field1444) {
            return;
        }
        this.field1444 = true;
        System.out.println("error_game_" + arg1);
        try {
            if (arg0 >= -40) {
                field1443 = -66;
            }
            class308.method2181("loggedout", 32627, class14.field159.field1951);
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 908)
    private final void method686(byte arg0) {
        field1447++;
        long var2 = class283.method2038((byte) 123);
        long var4 = class295.field4679[class193.field3148];
        class295.field4679[class193.field3148] = var2;
        class193.field3148 = class193.field3148 + 1 & 0x1F;
        synchronized (this) {
            class101.field1469 = class217.field3524;
            if (arg0 != -113) {
                method671((String) null, -118, -41, (String) null);
            }
        }
        this.method683(arg0 ^ 0xFFFFFF8F);
        if (var4 != 0L && var4 >= var2) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 941)
    public final void focusGained(FocusEvent arg0) {
        field1415++;
        class217.field3524 = true;
        class182.field3010 = true;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public abstract void method673(byte arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public abstract void method674(int arg0);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V")
    public abstract void method678(boolean arg0);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public abstract void method681(int arg0);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public abstract void method683(int arg0);

    @OriginalMember(owner = "client!qc", name = "init", descriptor = "()V")
    public abstract void init();
}
