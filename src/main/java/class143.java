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
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class143 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Z")
    private boolean field3469 = false;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Lqf;")
    public static class117 field3486 = class72.method514(111, "null");

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lqf;")
    public static class117 field3480 = class72.method514(107, "sl_arrows");

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Leb;")
    public static class31 field3474 = new class31(260);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Lqf;")
    public static class117 field3506 = class72.method514(124, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Lqf;")
    public static class117 field3500 = class72.method514(125, "null");

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Lqf;")
    public static class117 field3508 = class72.method514(113, "::errortest");

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!v", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3507++;
    }

    @OriginalMember(owner = "client!v", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3470++;
    }

    @OriginalMember(owner = "client!v", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3472++;
        if (class90.field2195 == null) {
            return class44.field873 == null || class44.field873.field3267 == this ? super.getParameter(arg0) : class44.field873.field3267.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public abstract void method169(int arg0);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    private final synchronized void method1146(int arg0) {
        field3498++;
        if (class48.field1002) {
            return;
        }
        class48.field1002 = true;
        if (arg0 <= 68) {
            field3480 = null;
        }
        try {
            class3.field64.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method174((byte) -27);
        } catch (Exception var4) {
        }
        if (class90.field2195 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class44.field873 != null) {
            try {
                class44.field873.method1064(0);
            } catch (Exception var2) {
            }
        }
        this.method176(9);
    }

    @OriginalMember(owner = "client!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3484++;
        class87.field2002 = true;
        class42.field823 = true;
    }

    @OriginalMember(owner = "client!v", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3471++;
        if (class90.field2195 == null) {
            return class44.field873 == null || class44.field873.field3267 == this ? super.getCodeBase() : class44.field873.field3267.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3482++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Z")
    public final boolean method1147(byte arg0) {
        field3477++;
        if (arg0 != -91) {
            method1150(40, null, null, 104);
        }
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
            } else {
                this.method1149(-99, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public static final void method1148(int arg0, int arg1, int arg2) {
        field3467++;
        class42 var3 = class50.method376(arg2, (byte) -98);
        int var4 = var3.field822;
        int var5 = var3.field827;
        int var6 = 70 % ((arg0 - 5) / 60);
        int var7 = var3.field846;
        int var8 = class87.field2005[var4 - var7];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var7;
        class23.field461[var5] = class96.method763(class16.method135(class23.field461[var5], ~var9), class16.method135(var9, arg1 << var7));
    }

    @OriginalMember(owner = "client!v", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3490++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1149(int arg0, String arg1) {
        if (arg0 >= -69) {
            method1156((byte) 115);
        }
        field3464++;
        if (this.field3469) {
            return;
        }
        this.field3469 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!v", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3476++;
        if (class64.field1290 == this && !class48.field1002) {
            class22.field423 = class122.method977(false);
            class148.method1183(0, 5000L);
            class90.field2200 = null;
            this.method1146(87);
        }
    }

    @OriginalMember(owner = "client!v", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3502++;
    }

    @OriginalMember(owner = "client!v", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3485++;
        if (class90.field2195 == null) {
            return class44.field873 == null || class44.field873.field3267 == this ? super.getAppletContext() : class44.field873.field3267.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3494++;
        if (class90.field2195 == null) {
            return class44.field873 == null || class44.field873.field3267 == this ? super.getDocumentBase() : class44.field873.field3267.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BLca;I)V")
    public static final void method1150(int arg0, byte[] arg1, class16 arg2, int arg3) {
        class124 var4 = new class124();
        var4.field2929 = arg0;
        var4.field2927 = arg1;
        var4.field2914 = arg2;
        var4.field1495 = arg3;
        class5 var5 = class34.field710;
        synchronized (class34.field710) {
            class34.field710.method22(var4, (byte) 39);
        }
        field3487++;
        class75.method543(-103);
    }

    @OriginalMember(owner = "client!v", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public final synchronized void method1151(int arg0) {
        field3479++;
        Container var2;
        if (class90.field2195 == null) {
            var2 = class44.field873.field3267;
        } else {
            var2 = class90.field2195;
        }
        if (class3.field64 != null) {
            class3.field64.removeFocusListener(this);
            var2.remove(class3.field64);
        }
        class3.field64 = new class68(this);
        var2.add(class3.field64);
        if (arg0 != 0) {
            return;
        }
        class3.field64.setSize(class141.field3348, class28.field562);
        class3.field64.setVisible(true);
        if (class90.field2195 == null) {
            class3.field64.setLocation(0, 0);
        } else {
            Insets var3 = class90.field2195.getInsets();
            class3.field64.setLocation(var3.left, var3.top);
        }
        class3.field64.addFocusListener(this);
        class3.field64.requestFocus();
        class42.field823 = true;
        class13.field186 = false;
        class68.field1430 = class122.method977(false);
    }

    @OriginalMember(owner = "client!v", name = "providesignlink", descriptor = "(Lu;)V")
    public static final void providesignlink(class137 arg0) {
        field3481++;
        class44.field873 = arg0;
        class90.field2200 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public abstract void method174(byte arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IJ)V")
    public static final void method1152(int arg0, long arg1) {
        field3475++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class128.field3029; var3++) {
            if (class134.field3195[var3] == arg1) {
                class139.field3310 = true;
                class128.field3029--;
                for (int var4 = var3; var4 < class128.field3029; var4++) {
                    class134.field3195[var4] = class134.field3195[var4 + 1];
                }
                class99.field2373.method961(80, -1198);
                class78.field1769++;
                class99.field2373.method606(arg1, (byte) 126);
                break;
            }
        }
        if (arg0 != 1) {
            method1152(-6, -19L);
        }
    }

    @OriginalMember(owner = "client!v", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3503++;
        if (class64.field1290 != this || class48.field1002) {
            return;
        }
        class42.field823 = true;
        if (class137.field3273 != null && class137.field3273.startsWith("1.5") && class122.method977(false) - class68.field1430 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class141.field3348 <= var2.width && var2.height >= class28.field562) {
                class13.field186 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public static final void method1153(int arg0) {
        field3501++;
        class8.field129.method536(arg0 - 12387);
        if (arg0 != 12289) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class85.field1930[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class81.field1844[var2] = 0L;
        }
        class77.field1729 = 0;
    }

    @OriginalMember(owner = "client!v", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3495++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JZ)V")
    public static final void method1154(long arg0, boolean arg1) {
        field3493++;
        if (arg0 == 0L) {
            return;
        }
        if (!arg1) {
            method1158(-77);
        }
        for (int var3 = 0; var3 < class75.field1651; var3++) {
            if (class101.field2439[var3] == arg0) {
                class75.field1651--;
                class139.field3310 = true;
                for (int var4 = var3; var4 < class75.field1651; var4++) {
                    class67.field1401[var4] = class67.field1401[var4 + 1];
                    class50.field1063[var4] = class50.field1063[var4 + 1];
                    class101.field2439[var4] = class101.field2439[var4 + 1];
                    class31.field660[var4] = class31.field660[var4 + 1];
                }
                class114.field2709++;
                class97.field2362 += 32;
                class99.field2373.method961(93, -1198);
                class99.field2373.method606(arg0, (byte) 124);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3465++;
    }

    @OriginalMember(owner = "client!v", name = "run", descriptor = "()V")
    public final void run() {
        field3478++;
        try {
            if (class137.field3263 != null) {
                String var1 = class137.field3263.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class137.field3273;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1149(-92, "wrongjava");
                        return;
                    }
                    class41.field815 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class137.field3273 == null || class137.field3273.equals("1.4.2"))) {
                    this.method1149(-76, "wrongjava");
                    return;
                }
            }
            if (class44.field873.field3267 != null) {
                Method var3 = class137.field3269;
                if (var3 != null) {
                    try {
                        var3.invoke(class44.field873.field3267, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1151(0);
            class36.field753 = class52.method390((byte) -126, class3.field64, class141.field3348, class28.field562);
            this.method172((byte) 39);
            class8.field129 = class102.method789((byte) -62);
            class8.field129.method536(-115);
            while (class22.field423 == 0L || class22.field423 > class122.method977(false)) {
                class77.field1729 = class8.field129.method535(1772870664, class124.field2920, class41.field815);
                for (int var4 = 0; var4 < class77.field1729; var4++) {
                    this.method1155((byte) -111);
                }
                this.method1161(-24717);
                class18.method147(class3.field64, 50, class44.field873);
            }
        } catch (Exception var7) {
            class105.method803((byte) -99, var7, null);
            this.method1149(-79, "crash");
        }
        this.method1146(82);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    private final void method1155(byte arg0) {
        if (arg0 > -14) {
            field3480 = null;
        }
        long var2 = class122.method977(false);
        field3509++;
        long var4 = class81.field1844[class129.field3053];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class81.field1844[class129.field3053] = var2;
        class129.field3053 = class129.field3053 + 1 & 0x1F;
        synchronized (this) {
            class18.field291 = class87.field2002;
        }
        this.method173(10);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static final void method1156(byte arg0) {
        if (arg0 >= -53) {
            method1163(-43, -109, null, null, -78, null);
        }
        field3474.method250((byte) -54);
        field3466++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method1157(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3483++;
        try {
            class28.field562 = arg0;
            class141.field3348 = arg2;
            class64.field1290 = this;
            class16.field244 = arg5;
            class90.field2195 = new Frame();
            class90.field2195.setTitle("Jagex");
            class90.field2195.setResizable(false);
            class90.field2195.addWindowListener(this);
            class90.field2195.setVisible(true);
            class90.field2195.toFront();
            Insets var8 = class90.field2195.getInsets();
            class90.field2195.setSize(var8.left + arg2 + var8.right, var8.top + var8.bottom + arg0);
            class90.field2200 = class44.field873 = new class137(true, null, arg6, arg1, arg4);
            if (arg3 != 13044) {
                method1162(-106);
            }
            class44.field873.method1066(this, -23553, 1);
        } catch (Exception var10) {
            class105.method803((byte) -54, var10, null);
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public static void method1158(int arg0) {
        field3486 = null;
        if (arg0 > -105) {
            field3506 = null;
        }
        field3508 = null;
        field3506 = null;
        field3500 = null;
        field3480 = null;
        field3474 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
    public final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3505++;
        try {
            if (class64.field1290 != null) {
                class77.field1714++;
                if (class77.field1714 >= 3) {
                    this.method1149(-77, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class141.field3348 = arg4;
            class16.field244 = arg1;
            class64.field1290 = this;
            class28.field562 = arg3;
            if (class44.field873 == null) {
                class90.field2200 = class44.field873 = new class137(false, this, arg2, null, 0);
            }
            class44.field873.method1066(this, -23553, 1);
        } catch (Exception var7) {
            class105.method803((byte) -102, var7, null);
            this.method1149(arg0 ^ 0xFFFF8F27, "crash");
        }
        if (arg0 != 28818) {
            field3508 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILmf;)I")
    public static final int method1160(int arg0, int arg1, class89 arg2) {
        field3491++;
        if (arg2.field2101 == null || arg2.field2101.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg2.field2101[arg1];
            int var4 = arg0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var3[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var4;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 1) {
                    var7 = class82.field1880[var3[var5++]];
                }
                if (var8 == 2) {
                    var7 = class42.field826[var3[var5++]];
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 3) {
                    var7 = class4.field66[var3[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class89 var12 = class104.method801(var11, -76);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class27.method206(var13, (byte) 90).field1581 || class146.field3569)) {
                        for (int var14 = 0; var14 < var12.field2161.length; var14++) {
                            if (var13 + 1 == var12.field2161[var14]) {
                                var7 += var12.field2088[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class23.field461[var3[var5++]];
                }
                if (var8 == 6) {
                    var7 = class8.field124[class42.field826[var3[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class23.field461[var3[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class141.field3395.field339;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class126.field2978[var15]) {
                            var7 += class42.field826[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class89 var18 = class104.method801(var17, -105);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class27.method206(var19, (byte) 90).field1581 || class146.field3569)) {
                        for (int var20 = 0; var20 < var18.field2161.length; var20++) {
                            if (var19 + 1 == var18.field2161[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class22.field420;
                }
                if (var8 == 12) {
                    var7 = class153.field3768;
                }
                if (var8 == 13) {
                    int var21 = class23.field461[var3[var5++]];
                    int var22 = var3[var5++];
                    var7 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var5++];
                    var7 = class44.method306((byte) 84, var23);
                }
                if (var8 == 18) {
                    var7 = (class141.field3395.field1998 >> 7) + class133.field3153;
                }
                if (var8 == 19) {
                    var7 = (class141.field3395.field1960 >> 7) + class19.field312;
                }
                if (var8 == 20) {
                    var7 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var7;
                    }
                    if (var6 == 1) {
                        var4 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var4 /= var7;
                    }
                    if (var6 == 3) {
                        var4 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public abstract void method172(byte arg0);

    @OriginalMember(owner = "client!v", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3497++;
    }

    @OriginalMember(owner = "client!v", name = "stop", descriptor = "()V")
    public final void stop() {
        field3496++;
        if (class64.field1290 == this && !class48.field1002) {
            class22.field423 = class122.method977(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public abstract void method176(int arg0);

    @OriginalMember(owner = "client!v", name = "start", descriptor = "()V")
    public final void start() {
        field3492++;
        if (class64.field1290 == this && !class48.field1002) {
            class22.field423 = 0L;
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
    private final void method1161(int arg0) {
        field3473++;
        long var2 = class122.method977(false);
        long var4 = class85.field1930[class58.field1191];
        class85.field1930[class58.field1191] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class15.field221 = ((var6 >> 1) + 32000) / var6;
        }
        class58.field1191 = class58.field1191 + 1 & 0x1F;
        if (class144.field3518++ > 50) {
            class42.field823 = true;
            class144.field3518 -= 50;
            class3.field64.setSize(class141.field3348, class28.field562);
            class3.field64.setVisible(true);
            if (class90.field2195 == null) {
                class3.field64.setLocation(0, 0);
            } else {
                Insets var7 = class90.field2195.getInsets();
                class3.field64.setLocation(var7.left, var7.top);
            }
        }
        this.method169(-19);
        if (arg0 != -24717) {
            field3486 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)I")
    public static final int method1162(int arg0) {
        field3468++;
        int var1 = 93 / ((38 - arg0) / 55);
        return class15.field208++;
    }

    @OriginalMember(owner = "client!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class87.field2002 = false;
        field3489++;
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
    public abstract void method173(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[BLqb;I[Ltd;)V")
    public static final void method1163(int arg0, int arg1, byte[] arg2, class113 arg3, int arg4, class135[] arg5) {
        if (arg1 != -21078) {
            field3474 = null;
        }
        field3488++;
        int var6 = -1;
        class77 var7 = new class77(arg2);
        while (true) {
            int var8 = var7.method582(-122);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method582(79);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var7.method570((byte) 123);
                int var14 = var9 >> 6 & 0x3F;
                int var15 = var13 >> 2;
                int var16 = arg0 + var14;
                int var17 = arg4 + var11;
                int var18 = var13 & 0x3;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var19 = var12;
                    if ((class73.field1606[1][var16][var17] & 0x2) == 2) {
                        var19 = var12 - 1;
                    }
                    class135 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg5[var19];
                    }
                    class124.method983(var18, var17, arg3, var16, var6, var20, var15, (byte) 87, var12);
                }
            }
        }
    }
}
