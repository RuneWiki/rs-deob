import jagex3.jagmisc.jagmisc;
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
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class class507 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "Z")
    private boolean field7181 = false;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "Z")
    private boolean field7188 = false;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field7166 = -1;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "Llu;")
    public static class610 field7177 = new class610(76, 2);

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "[[I")
    public static int[][] field7198 = new int[128][128];

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "Z")
    public static boolean field7199 = false;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "Z")
    public static boolean field7200;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "Z")
    public static boolean field7201;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "Z")
    public static boolean field7203;

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "Z")
    public static boolean field7204;

    @OriginalMember(owner = "client!ot", name = "V", descriptor = "Z")
    public static boolean field7207;

    @OriginalMember(owner = "client!ot", name = "W", descriptor = "Z")
    public static boolean field7208;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIZII)V", line = 7)
    public final void method3004(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field7179++;
        try {
            if (class25.field261 == null) {
                class104.field1513 = 0;
                class587.field8700 = 0;
                class25.field261 = this;
                class390.field5380 = arg1;
                class47.field562 = arg0;
                class625.field9202 = arg0;
                if (arg2) {
                    field7199 = false;
                }
                class165.field2605 = arg4;
                class384.field5289 = arg4;
                if (class442.field5896 == null) {
                    class580.field8537 = class442.field5896 = new class331(this, arg3, null, 0);
                }
                class21 var6 = class442.field5896.method2004(1406, 1, this);
                while (var6.field202 == 0) {
                    class236.method1513(true, 10L);
                }
            } else {
                class30.field336++;
                if (class30.field336 >= 3) {
                    this.method3011(-110, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class378.method2255(var8, null, -71);
            this.method3011(-124, "crash");
        }
    }

    @OriginalMember(owner = "client!ot", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 54)
    public final void windowOpened(WindowEvent arg0) {
        field7189++;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIIIILjava/lang/String;II)V", line = 63)
    public final void method3005(boolean arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class47.field562 = arg4;
            class625.field9202 = arg4;
            class587.field8700 = 0;
            class104.field1513 = arg1;
            class165.field2605 = arg7;
            class384.field5289 = arg7;
            class25.field261 = this;
            class390.field5380 = arg2;
            class390.field5382 = new Frame();
            class390.field5382.setTitle("Jagex");
            class390.field5382.setResizable(true);
            class390.field5382.addWindowListener(this);
            class390.field5382.setVisible(true);
            class390.field5382.toFront();
            Insets var9 = class390.field5382.getInsets();
            class390.field5382.setSize(class384.field5289 + var9.left + var9.right, class625.field9202 + var9.bottom + var9.top);
            class580.field8537 = class442.field5896 = new class331(null, arg6, arg5, arg3);
            class21 var10 = class442.field5896.method2004(arg1 ^ 0x57E, 1, this);
            while (var10.field202 == 0) {
                class236.method1513(true, 10L);
            }
        } catch (Exception var12) {
            class378.method2255(var12, null, arg1 + 99);
        }
        field7197++;
    }

    @OriginalMember(owner = "client!ot", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 102)
    public final String getParameter(String arg0) {
        field7163++;
        if (class390.field5382 == null) {
            return class442.field5896 == null || class442.field5896.field4568 == this ? super.getParameter(arg0) : class442.field5896.field4568.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 122)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field7182++;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lkda;BZLjava/lang/String;)Llk;", line = 132)
    public static final class504 method3006(class328 arg0, byte arg1, boolean arg2, String arg3) {
        int var4 = 116 % ((-arg1 - 78) / 33);
        field7194++;
        int var5 = arg0.method1967(-1, arg3);
        if (var5 == -1) {
            return new class504(0);
        }
        int[] var6 = arg0.method1994(-78, var5);
        class504 var7 = new class504(var6.length);
        int var8 = 0;
        int var9 = 0;
        while (true) {
            while (var7.field7138 > var8) {
                class148 var10 = new class148(arg0.method1966(var6[var9++], var5, true));
                int var11 = var10.method1026(-917302120);
                int var12 = var10.method1045(true);
                int var13 = var10.method1032((byte) -33);
                if (!arg2 && var13 == 1) {
                    var7.field7138--;
                } else {
                    var7.field7136[var8] = var11;
                    var7.field7140[var8] = var12;
                    var8++;
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 185)
    public final synchronized void method3007(int arg0) {
        field7192++;
        if (class79.field1069 != null) {
            class79.field1069.removeFocusListener(this);
            class79.field1069.getParent().remove(class79.field1069);
        }
        Container var2;
        if (class99.field1448 != null) {
            var2 = class99.field1448;
        } else if (class390.field5382 == null) {
            var2 = class442.field5896.field4568;
        } else {
            var2 = class390.field5382;
        }
        var2.setLayout(null);
        class79.field1069 = new class375(this);
        var2.add(class79.field1069);
        class79.field1069.setSize(class165.field2605, class47.field562);
        class79.field1069.setVisible(true);
        if (class390.field5382 == var2) {
            Insets var3 = class390.field5382.getInsets();
            class79.field1069.setLocation(class104.field1513 + var3.left, class587.field8700 + var3.top);
        } else {
            class79.field1069.setLocation(class104.field1513, class587.field8700);
        }
        class79.field1069.addFocusListener(this);
        class79.field1069.requestFocus();
        class105.field1516 = true;
        class137.field1962 = true;
        class551.field8214 = true;
        class641.field9341 = false;
        if (arg0 != -1) {
            this.method3013((byte) 4);
        }
        class368.field5078 = class598.method3538(true);
    }

    @OriginalMember(owner = "client!ot", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 233)
    public final void windowIconified(WindowEvent arg0) {
        field7168++;
    }

    @OriginalMember(owner = "client!ot", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 240)
    public final AppletContext getAppletContext() {
        field7175++;
        if (class390.field5382 == null) {
            return class442.field5896 == null || class442.field5896.field4568 == this ? super.getAppletContext() : class442.field5896.field4568.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZ)V", line = 254)
    private final void method3008(int arg0, boolean arg1) {
        field7167++;
        synchronized (this) {
            if (class635.field9294) {
                return;
            }
            class635.field9294 = true;
        }
        if (arg0 != -31827) {
            this.getCodeBase();
        }
        if (class442.field5896.field4568 != null) {
            class442.field5896.field4568.destroy();
        }
        try {
            this.method1601((byte) 116);
        } catch (Exception var10) {
        }
        if (this.field7181) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field7181 = false;
        }
        class292.method1796(0, true);
        class405.method2385((byte) -74);
        if (class79.field1069 != null) {
            try {
                class79.field1069.removeFocusListener(this);
                class79.field1069.getParent().remove(class79.field1069);
            } catch (Exception var8) {
            }
        }
        if (class442.field5896 != null) {
            try {
                class442.field5896.method1999(arg0 + 31728);
            } catch (Exception var7) {
            }
        }
        this.method1612(false);
        if (class390.field5382 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V", line = 330)
    private final void method3009(boolean arg0) {
        field7178++;
        long var2 = class598.method3538(arg0);
        long var4 = class402.field5503[class113.field1597];
        class402.field5503[class113.field1597] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class113.field1597 = class113.field1597 + 1 & 0x1F;
        synchronized (this) {
            class105.field1516 = class137.field1962;
        }
        this.method1617((byte) 118);
    }

    @OriginalMember(owner = "client!ot", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 361)
    public final void windowActivated(WindowEvent arg0) {
        field7196++;
    }

    @OriginalMember(owner = "client!ot", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 369)
    public final URL getDocumentBase() {
        field7195++;
        if (class390.field5382 == null) {
            return class442.field5896 == null || class442.field5896.field4568 == this ? super.getDocumentBase() : class442.field5896.field4568.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "providesignlink", descriptor = "(Llp;)V", line = 390)
    public static final void providesignlink(class331 arg0) {
        field7172++;
        class442.field5896 = arg0;
        class580.field8537 = arg0;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)Z", line = 399)
    public final boolean method3010(int arg0) {
        field7174++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != -24371) {
                this.windowClosing(null);
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
                this.method3011(-90, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 435)
    public final void windowDeactivated(WindowEvent arg0) {
        field7176++;
    }

    @OriginalMember(owner = "client!ot", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 446)
    public final void windowDeiconified(WindowEvent arg0) {
        field7171++;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILjava/lang/String;)V", line = 454)
    public final void method3011(int arg0, String arg1) {
        field7190++;
        if (this.field7188) {
            return;
        }
        this.field7188 = true;
        System.out.println("error_game_" + arg1);
        try {
            class640.method3702(class442.field5896.field4568, (byte) 60, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            if (arg0 >= -84) {
                field7198 = null;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ot", name = "run", descriptor = "()V", line = 481)
    public final void run() {
        try {
            label107: {
                if (class331.field4572 != null) {
                    String var1 = class331.field4572.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class331.field4562;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method3011(-108, "wrongjava");
                            break label107;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class331.field4562 == null || class331.field4562.equals("1.4.2"))) {
                        this.method3011(-113, "wrongjava");
                        break label107;
                    }
                }
                if (class331.field4562 != null && class331.field4562.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class331.field4562.length() > var3) {
                        char var5 = class331.field4562.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 - (48 - var5);
                        var3++;
                    }
                    if (var4 >= 5) {
                        class50.field590 = true;
                    }
                }
                if (class442.field5896.field4568 != null) {
                    Method var6 = class331.field4579;
                    if (var6 != null) {
                        try {
                            var6.invoke(class442.field5896.field4568, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class14.method102(-1);
                class436.method2544(0);
                this.method3007(-1);
                this.method1602((byte) 32);
                class114.field1605 = class170.method1207(110);
                while (class467.field6578 == 0L || class598.method3538(true) < class467.field6578) {
                    class86.field1234 = class114.field1605.method2116(class391.field5386, (byte) 75);
                    for (int var7 = 0; var7 < class86.field1234; var7++) {
                        this.method3009(true);
                    }
                    this.method3013((byte) 87);
                    class369.method2213((byte) 103, class442.field5896, class79.field1069);
                }
            }
        } catch (Throwable var10) {
            class378.method2255(var10, this.method1613((byte) 124), 117);
            this.method3011(-88, "crash");
        }
        field7165++;
        this.method3008(-31827, true);
    }

    @OriginalMember(owner = "client!ot", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 597)
    public final synchronized void paint(Graphics arg0) {
        field7183++;
        if (class25.field261 != this || class635.field9294) {
            return;
        }
        class551.field8214 = true;
        if (class50.field590 && class598.method3538(true) - class368.field5078 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class384.field5289 && class625.field9202 <= var2.height) {
                class641.field9341 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)Z", line = 620)
    public final boolean method3012(byte arg0) {
        if (arg0 <= 77) {
            this.windowDeactivated(null);
        }
        field7185++;
        return class230.method1488(78, "jagmisc");
    }

    @OriginalMember(owner = "client!ot", name = "stop", descriptor = "()V", line = 632)
    public final void stop() {
        field7180++;
        if (class25.field261 == this && !class635.field9294) {
            class467.field6578 = class598.method3538(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ot", name = "destroy", descriptor = "()V", line = 645)
    public final void destroy() {
        field7186++;
        if (class25.field261 == this && !class635.field9294) {
            class467.field6578 = class598.method3538(true);
            class236.method1513(true, 5000L);
            class580.field8537 = null;
            this.method3008(-31827, false);
        }
    }

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(B)Ljava/lang/String;", line = 660)
    public String method1613(byte arg0) {
        if (arg0 <= 111) {
            this.focusLost(null);
        }
        field7170++;
        return null;
    }

    @OriginalMember(owner = "client!ot", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 681)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field7169++;
    }

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "(B)V", line = 703)
    private final void method3013(byte arg0) {
        field7193++;
        long var2 = class598.method3538(true);
        long var4 = class45.field546[class465.field6537];
        class45.field546[class465.field6537] = var2;
        if (arg0 <= 80) {
            return;
        }
        class465.field6537 = class465.field6537 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class36.field422 = ((var6 >> 1) + 32000) / var6;
        }
        if (class479.field6804++ > 50) {
            class479.field6804 -= 50;
            class551.field8214 = true;
            class79.field1069.setSize(class165.field2605, class47.field562);
            class79.field1069.setVisible(true);
            if (class390.field5382 != null && class99.field1448 == null) {
                Insets var7 = class390.field5382.getInsets();
                class79.field1069.setLocation(var7.left + class104.field1513, class587.field8700 + var7.top);
            } else {
                class79.field1069.setLocation(class104.field1513, class587.field8700);
            }
        }
        this.method1606(true);
    }

    @OriginalMember(owner = "client!ot", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 747)
    public final void focusGained(FocusEvent arg0) {
        field7161++;
        class137.field1962 = true;
        class551.field8214 = true;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lgw;I)V", line = 756)
    public static final void method3014(class148 arg0, int arg1) {
        field7173++;
        byte[] var2 = new byte[24];
        int var3 = -94 % ((24 - arg1) / 43);
        if (class9.field103 != null) {
            try {
                class9.field103.method3253((byte) 127, 0L);
                class9.field103.method3262(8, var2);
                int var4;
                for (var4 = 0; var4 < 24 && var2[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1030(var2, 24, (byte) -3, 0);
    }

    @OriginalMember(owner = "client!ot", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 799)
    public final void windowClosed(WindowEvent arg0) {
        field7187++;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)Z", line = 808)
    public final boolean method3015(int arg0) {
        field7184++;
        if (arg0 != -6058) {
            this.method3015(119);
        }
        return class230.method1488(80, "jaclib");
    }

    @OriginalMember(owner = "client!ot", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 819)
    public final void focusLost(FocusEvent arg0) {
        field7162++;
        class137.field1962 = false;
    }

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "(B)V", line = 828)
    public static void method3016(byte arg0) {
        if (arg0 < 0) {
            providesignlink(null);
        }
        field7198 = null;
        field7177 = null;
    }

    @OriginalMember(owner = "client!ot", name = "start", descriptor = "()V", line = 839)
    public final void start() {
        field7191++;
        if (class25.field261 == this && !class635.field9294) {
            class467.field6578 = 0L;
        }
    }

    @OriginalMember(owner = "client!ot", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 850)
    public final URL getCodeBase() {
        field7164++;
        if (class390.field5382 == null) {
            return class442.field5896 == null || class442.field5896.field4568 == this ? super.getCodeBase() : class442.field5896.field4568.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public abstract void method1617(byte arg0);

    @OriginalMember(owner = "client!ot", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
    public abstract void method1601(byte arg0);

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)V")
    public abstract void method1606(boolean arg0);

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "(B)V")
    public abstract void method1602(byte arg0);

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(Z)V")
    public abstract void method1612(boolean arg0);
}
