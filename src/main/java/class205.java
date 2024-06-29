import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class205 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Z")
    private boolean field3477 = false;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lmh;")
    public static class62 field3455 = class201.method1405(true, "(U2");

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
    public static boolean field3453 = false;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "[Lmh;")
    public static class62[] field3473 = new class62[8];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "Lgg;")
    public static class126 field3480;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lhi;")
    public static class26 field3463;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "Z")
    public static boolean field3484;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Z")
    public static boolean field3485;

    @OriginalMember(owner = "client!cc", name = "providesignlink", descriptor = "(Lgi;)V", line = 6)
    public static final void providesignlink(class285 arg0) {
        class193.field3246 = arg0;
        class161.field2609 = arg0;
        field3462++;
    }

    @OriginalMember(owner = "client!cc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 18)
    public final String getParameter(String arg0) {
        field3470++;
        if (class216.field3686 == null) {
            return class193.field3246 == null || class193.field3246.field4878 == this ? super.getParameter(arg0) : class193.field3246.field4878.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "run", descriptor = "()V", line = 35)
    public final void run() {
        field3475++;
        try {
            if (class285.field4880 != null) {
                String var1 = class285.field4880.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class285.field4869;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1438(true, "wrongjava");
                        return;
                    }
                    class174.field2807 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class285.field4869 == null || class285.field4869.equals("1.4.2"))) {
                    this.method1438(true, "wrongjava");
                    return;
                }
            }
            if (class193.field3246.field4878 != null) {
                Method var3 = class285.field4888;
                if (var3 != null) {
                    try {
                        var3.invoke(class193.field3246.field4878, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method1442((byte) -88);
            this.method1431(107);
            class272.field4626 = class278.method1899(-6930);
            while (class32.field446 == 0L || class32.field446 > class293.method1985((byte) -71)) {
                class56.field815 = class272.field4626.method41(class174.field2807, class271.field4603, (byte) -30);
                for (int var5 = 0; var5 < class56.field815; var5++) {
                    this.method1439(true);
                }
                this.method1436((byte) -51);
                class102.method807(24777, class243.field4132, class193.field3246);
            }
        } catch (Exception var8) {
            class235.method1659(var8, (String) null, -28677);
            this.method1438(true, "crash");
        }
        this.method1432(-100, true);
    }

    @OriginalMember(owner = "client!cc", name = "destroy", descriptor = "()V", line = 117)
    public final void destroy() {
        field3450++;
        if (class119.field1999 == this && !class192.field3235) {
            class32.field446 = class293.method1985((byte) -71);
            class99.method792(-1, 5000L);
            class161.field2609 = null;
            this.method1432(-125, false);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V", line = 132)
    public static final void method1425(int arg0, long[] arg1, Object[] arg2, int arg3, int arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method1425(var6 - 1, arg1, arg2, arg3, 45);
            method1425(arg0, arg1, arg2, var6 + 1, 109);
        }
        if (arg4 <= 36) {
            field3473 = (class62[]) null;
        }
        field3447++;
    }

    @OriginalMember(owner = "client!cc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 193)
    public final synchronized void paint(Graphics arg0) {
        field3449++;
        if (class119.field1999 == this && !class192.field3235) {
            class226.field3930 = true;
            if (class285.field4869 != null && class285.field4869.startsWith("1.5")) {
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 222)
    public final void windowDeiconified(WindowEvent arg0) {
        field3468++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 231)
    public final void method1426(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field3464++;
        try {
            class60.field878 = arg0;
            class229.field3977 = arg0;
            class309.field5296 = 0;
            class306.field5258 = arg5;
            class90.field1421 = arg5;
            class119.field1999 = this;
            class296.field5061 = arg1;
            class116.field1942 = arg4;
            class216.field3686 = new Frame();
            class216.field3686.setTitle("Jagex");
            class216.field3686.setResizable(true);
            class216.field3686.addWindowListener(this);
            class216.field3686.setVisible(true);
            class216.field3686.toFront();
            Insets var8 = class216.field3686.getInsets();
            class216.field3686.setSize(var8.right + var8.left + class90.field1421, var8.top - -var8.bottom + class229.field3977);
            class161.field2609 = class193.field3246 = new class285(true, (Applet) null, arg6, arg3, arg2);
            class193.field3246.method1954(5, 0, this);
        } catch (Exception var10) {
            class235.method1659(var10, (String) null, -28677);
        }
    }

    @OriginalMember(owner = "client!cc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 264)
    public final URL getCodeBase() {
        field3452++;
        if (class216.field3686 == null) {
            return class193.field3246 == null || class193.field3246.field4878 == this ? super.getCodeBase() : class193.field3246.field4878.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)[F", line = 281)
    public static final float[] method1427(int arg0) {
        int var1 = 98 % ((arg0 - 26) / 36);
        field3444++;
        float var2 = class179.method1254() + class179.method1260();
        int var3 = class179.method1255();
        class196.field3315[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFF67) >> 8) / 255.0F;
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class196.field3315[2] = class73.field1119[2] * var6 * var7 * var2;
        class196.field3315[1] = class73.field1119[1] * var4 * var7 * var2;
        class196.field3315[0] = class73.field1119[0] * var5 * var7 * var2;
        return class196.field3315;
    }

    @OriginalMember(owner = "client!cc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 306)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3456++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIZ)V", line = 314)
    public static final void method1428(int arg0, int arg1, int arg2, boolean arg3) {
        field3446++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class198.field3347 = arg0;
        class75.field1219 = arg3;
        if (arg2 != 3) {
            providesignlink((class285) null);
        }
        class151.field2393 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z", line = 331)
    public final boolean method1429(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field3469++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != -1) {
                field3480 = (class126) null;
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
                this.method1438(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBII)V", line = 367)
    public final void method1430(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3481++;
        try {
            if (class119.field1999 != null) {
                class191.field3071++;
                if (class191.field3071 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1438(true, "alreadyloaded");
                return;
            }
            if (arg2 < 113) {
                return;
            }
            class119.field1999 = this;
            class60.field878 = arg0;
            class229.field3977 = arg0;
            class309.field5296 = 0;
            class296.field5061 = arg1;
            class116.field1942 = 0;
            class306.field5258 = arg3;
            class90.field1421 = arg3;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class2.field26 = true;
            } else {
                class2.field26 = false;
            }
            if (class193.field3246 == null) {
                class161.field2609 = class193.field3246 = new class285(false, this, arg4, (String) null, 0);
            }
            class193.field3246.method1954(5, 0, this);
        } catch (Exception var8) {
            class235.method1659(var8, (String) null, -28677);
            this.method1438(true, "crash");
        }
    }

    @OriginalMember(owner = "client!cc", name = "stop", descriptor = "()V", line = 419)
    public final void stop() {
        field3458++;
        if (class119.field1999 == this && !class192.field3235) {
            class32.field446 = class293.method1985((byte) -71) + 4000L;
        }
    }

    @OriginalMember(owner = "client!cc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 430)
    public final void windowIconified(WindowEvent arg0) {
        field3442++;
    }

    @OriginalMember(owner = "client!cc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 439)
    public final URL getDocumentBase() {
        field3461++;
        if (class216.field3686 == null) {
            return class193.field3246 == null || class193.field3246.field4878 == this ? super.getDocumentBase() : class193.field3246.field4878.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V", line = 453)
    private final void method1432(int arg0, boolean arg1) {
        field3474++;
        synchronized (this) {
            if (class192.field3235) {
                return;
            }
            class192.field3235 = true;
        }
        if (class193.field3246.field4878 != null) {
            class193.field3246.field4878.destroy();
        }
        try {
            this.method1433(30);
        } catch (Exception var12) {
        }
        if (class243.field4132 != null) {
            try {
                class243.field4132.removeFocusListener(this);
                class243.field4132.getParent().remove(class243.field4132);
            } catch (Exception var11) {
            }
        }
        if (arg0 >= -47) {
            return;
        }
        if (class193.field3246 != null) {
            try {
                class193.field3246.method1952((byte) -117);
            } catch (Exception var10) {
            }
        }
        this.method1443((byte) 122);
        if (class216.field3686 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!cc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 526)
    public final void windowClosed(WindowEvent arg0) {
        field3482++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V", line = 533)
    public final void method1435(int arg0, String arg1, String arg2) {
        field3459++;
        if (this.field3477) {
            return;
        }
        int var4 = 92 / ((-arg0 - 9) / 60);
        this.field3477 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws?" + arg2), "_top");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V", line = 561)
    private final void method1436(byte arg0) {
        field3465++;
        if (arg0 != -51) {
            return;
        }
        long var2 = class293.method1985((byte) -71);
        long var4 = class31.field429[class21.field217];
        class31.field429[class21.field217] = var2;
        class21.field217 = class21.field217 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class191.field3070 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class293.field4980++) > 50) {
            class226.field3930 = true;
            class293.field4980 -= 50;
            class243.field4132.setSize(class306.field5258, class60.field878);
            class243.field4132.setVisible(true);
            if (class216.field3686 != null && class212.field3569 == null) {
                Insets var7 = class216.field3686.getInsets();
                class243.field4132.setLocation(var7.left + class309.field5296, class116.field1942 + var7.top);
            } else {
                class243.field4132.setLocation(class309.field5296, class116.field1942);
            }
        }
        this.method1440(122);
    }

    @OriginalMember(owner = "client!cc", name = "start", descriptor = "()V", line = 605)
    public final void start() {
        field3471++;
        if (class119.field1999 == this && !class192.field3235) {
            class32.field446 = 0L;
        }
    }

    @OriginalMember(owner = "client!cc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 620)
    public final void focusGained(FocusEvent arg0) {
        field3457++;
        class241.field4111 = true;
        class226.field3930 = true;
    }

    @OriginalMember(owner = "client!cc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 631)
    public final void windowOpened(WindowEvent arg0) {
        field3460++;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 641)
    public static void method1437(int arg0) {
        field3473 = null;
        field3480 = null;
        field3455 = null;
        if (arg0 == 0) {
            field3463 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 655)
    public final void method1438(boolean arg0, String arg1) {
        field3448++;
        if (this.field3477) {
            return;
        }
        this.field3477 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!cc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 685)
    public final void focusLost(FocusEvent arg0) {
        class241.field4111 = false;
        field3451++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 694)
    private final void method1439(boolean arg0) {
        long var2 = class293.method1985((byte) -71);
        field3479++;
        long var4 = class134.field2186[class214.field3638];
        if (var4 != 0L && var2 > var4) {
        }
        class134.field2186[class214.field3638] = var2;
        class214.field3638 = class214.field3638 + 1 & 0x1F;
        synchronized (this) {
            class74.field1170 = class241.field4111;
        }
        if (!arg0) {
            this.method1429(4);
        }
        this.method1434((byte) 113);
    }

    @OriginalMember(owner = "client!cc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 725)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3467++;
    }

    @OriginalMember(owner = "client!cc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 734)
    public final void windowActivated(WindowEvent arg0) {
        field3445++;
    }

    @OriginalMember(owner = "client!cc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 745)
    public final void windowDeactivated(WindowEvent arg0) {
        field3478++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 756)
    public static final int method1441(int arg0, int arg1) {
        if (arg0 == 1) {
            field3443++;
            return arg1 >> 18 & 0x7;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V", line = 773)
    public final synchronized void method1442(byte arg0) {
        if (class243.field4132 != null) {
            class243.field4132.removeFocusListener(this);
            class243.field4132.getParent().remove(class243.field4132);
        }
        field3466++;
        Container var2;
        if (class212.field3569 != null) {
            var2 = class212.field3569;
        } else if (class216.field3686 == null) {
            var2 = class193.field3246.field4878;
        } else {
            var2 = class216.field3686;
        }
        var2.setLayout((LayoutManager) null);
        if (arg0 > -8) {
            return;
        }
        class243.field4132 = new class50(this);
        class243.field4132.setIgnoreRepaint(true);
        var2.add(class243.field4132);
        class243.field4132.setSize(class306.field5258, class60.field878);
        class243.field4132.setVisible(true);
        if (class216.field3686 == var2) {
            Insets var3 = class216.field3686.getInsets();
            class243.field4132.setLocation(var3.left + class309.field5296, var3.top - -class116.field1942);
        } else {
            class243.field4132.setLocation(class309.field5296, class116.field1942);
        }
        class243.field4132.addFocusListener(this);
        class243.field4132.requestFocus();
        class74.field1170 = true;
        class241.field4111 = true;
        class226.field3930 = true;
        class163.field2648 = false;
        class120.field2013 = class293.method1985((byte) -71);
    }

    @OriginalMember(owner = "client!cc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 826)
    public final AppletContext getAppletContext() {
        field3472++;
        if (class216.field3686 == null) {
            return class193.field3246 == null || class193.field3246.field4878 == this ? super.getAppletContext() : class193.field3246.field4878.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public abstract void method1431(int arg0);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public abstract void method1433(int arg0);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public abstract void method1434(byte arg0);

    @OriginalMember(owner = "client!cc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
    public abstract void method1440(int arg0);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
    public abstract void method1443(byte arg0);
}
