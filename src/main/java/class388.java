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
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class388 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Z")
    private boolean field5457 = false;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "Z")
    private boolean field5472 = false;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field5464 = 0;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field5479 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Z")
    public static boolean field5489;

    @OriginalMember(owner = "client!og", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 7)
    public final void windowActivated(WindowEvent arg0) {
        field5459++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILdn;)V", line = 20)
    public static final void method2475(int arg0, class302 arg1) {
        field5465++;
        if (!class435.field6270) {
            arg1.method2594((byte) -22);
            if (arg0 == 0) {
                class208.field2958--;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 38)
    public final void focusGained(FocusEvent arg0) {
        field5449++;
        class229.field3242 = true;
        class146.field1799 = true;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 47)
    public final void method2476(String arg0, int arg1) {
        field5476++;
        if (arg1 != 9329 || this.field5472) {
            return;
        }
        this.field5472 = true;
        System.out.println("error_game_" + arg0);
        try {
            class368.method2348(class14.field185.field2685, arg1 - 9448, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!og", name = "run", descriptor = "()V", line = 76)
    public final void run() {
        field5469++;
        try {
            label114: {
                if (class185.field2681 != null) {
                    String var1 = class185.field2681.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class185.field2677;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2476("wrongjava", 9329);
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class185.field2677 == null || class185.field2677.equals("1.4.2"))) {
                        this.method2476("wrongjava", 9329);
                        break label114;
                    }
                }
                if (class185.field2677 != null && class185.field2677.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class185.field2677.length()) {
                        char var5 = class185.field2677.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var5 - (48 - var4 * 10);
                    }
                    if (var4 >= 5) {
                        class419.field5988 = true;
                    }
                }
                if (class14.field185.field2685 != null) {
                    Method var6 = class185.field2692;
                    if (var6 != null) {
                        try {
                            var6.invoke(class14.field185.field2685, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class87.method469(-31);
                class435.method2729(0);
                this.method2479(false);
                this.method1098(2268);
                class97.field1172 = class374.method2385((byte) 46);
                this.method2482(-1);
                while (class439.field6283 == 0L || class439.field6283 > class175.method1195(89)) {
                    class46.field555 = class97.field1172.method401((byte) -51, class152.field1875);
                    for (int var7 = 0; var7 < class46.field555; var7++) {
                        this.method2489(false);
                    }
                    this.method2478(-4);
                    class215.method1447(class402.field5767, class14.field185, (byte) -59);
                }
            }
        } catch (Exception var10) {
            class422.method2663((String) null, var10, -101);
            this.method2476("crash", 9329);
        }
        this.method2488(-50, true);
    }

    @OriginalMember(owner = "client!og", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 193)
    public final AppletContext getAppletContext() {
        field5470++;
        if (class272.field3857 == null) {
            return class14.field185 == null || class14.field185.field2685 == this ? super.getAppletContext() : class14.field185.field2685.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V", line = 209)
    public static final void method2477(int arg0) {
        field5453++;
        if (arg0 != 25041) {
            method2480('I', -10);
        }
        if (class433.field6226) {
            return;
        }
        class225.field3160 = true;
        if (class374.field5254) {
            class292.field4085 = (float) ((int) class292.field4085 - 17 & 0xFFFFFFF0);
        } else {
            class117.field1433 += (-12.0F - class117.field1433) / 2.0F;
        }
        class433.field6226 = true;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V", line = 233)
    private final void method2478(int arg0) {
        field5485++;
        if (arg0 != -4) {
            return;
        }
        long var2 = class175.method1195(arg0 ^ 0xFFFFFFE0);
        long var4 = class400.field5716[class421.field6014];
        class400.field5716[class421.field6014] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class98.field1195 = ((var6 >> 1) + 32000) / var6;
        }
        class421.field6014 = class421.field6014 + 1 & 0x1F;
        if ((class123.field1518++) > 50) {
            class123.field1518 -= 50;
            class146.field1799 = true;
            class402.field5767.setSize(class330.field4671, class105.field1259);
            class402.field5767.setVisible(true);
            if (class272.field3857 != null && class255.field3680 == null) {
                Insets var7 = class272.field3857.getInsets();
                class402.field5767.setLocation(class323.field4601 + var7.left, class338.field4800 + var7.top);
            } else {
                class402.field5767.setLocation(class323.field4601, class338.field4800);
            }
        }
        this.method1100(true);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V", line = 279)
    public final synchronized void method2479(boolean arg0) {
        field5456++;
        if (class402.field5767 != null) {
            class402.field5767.removeFocusListener(this);
            class402.field5767.getParent().remove(class402.field5767);
        }
        Container var2;
        if (class255.field3680 != null) {
            var2 = class255.field3680;
        } else if (class272.field3857 == null) {
            var2 = class14.field185.field2685;
        } else {
            var2 = class272.field3857;
        }
        var2.setLayout((LayoutManager) null);
        class402.field5767 = new class286(this);
        var2.add(class402.field5767);
        class402.field5767.setSize(class330.field4671, class105.field1259);
        class402.field5767.setVisible(true);
        if (class272.field3857 == var2) {
            Insets var3 = class272.field3857.getInsets();
            class402.field5767.setLocation(class323.field4601 + var3.left, var3.top - -class338.field4800);
        } else {
            class402.field5767.setLocation(class323.field4601, class338.field4800);
        }
        class402.field5767.addFocusListener(this);
        class402.field5767.requestFocus();
        class229.field3242 = true;
        class452.field6477 = true;
        class146.field1799 = true;
        class406.field5859 = arg0;
        class323.field4598 = class175.method1195(31);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(CI)Z", line = 327)
    public static final boolean method2480(char arg0, int arg1) {
        int var2 = -99 / ((arg1 + 39) / 50);
        field5448++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!og", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 337)
    public final void windowDeactivated(WindowEvent arg0) {
        field5486++;
    }

    @OriginalMember(owner = "client!og", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 344)
    public final void windowDeiconified(WindowEvent arg0) {
        field5475++;
    }

    @OriginalMember(owner = "client!og", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 351)
    public final synchronized void paint(Graphics arg0) {
        field5460++;
        if (class121.field1495 != this || class299.field4192) {
            return;
        }
        class146.field1799 = true;
        if (class419.field5988 && (class175.method1195(91) - class323.field4598) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class410.field5896 && var2.height >= class282.field3988) {
                class406.field5859 = true;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "destroy", descriptor = "()V", line = 373)
    public final void destroy() {
        field5477++;
        if (class121.field1495 == this && !class299.field4192) {
            class439.field6283 = class175.method1195(45);
            class150.method907(5000L, (byte) -32);
            class178.field2431 = null;
            this.method2488(-20, false);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILjava/lang/String;IIZII)V", line = 389)
    public final void method2481(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field5478++;
        try {
            class338.field4800 = 0;
            class337.field4794 = arg6;
            class323.field4601 = 0;
            class330.field4671 = arg3;
            class410.field5896 = arg3;
            class105.field1259 = arg1;
            class282.field3988 = arg1;
            class121.field1495 = this;
            class272.field3857 = new Frame();
            class272.field3857.setTitle("Jagex");
            class272.field3857.setResizable(true);
            class272.field3857.addWindowListener(this);
            if (arg4 != -11617) {
                this.windowIconified((WindowEvent) null);
            }
            class272.field3857.setVisible(true);
            class272.field3857.toFront();
            Insets var9 = class272.field3857.getInsets();
            class272.field3857.setSize(class410.field5896 + var9.left + var9.right, class282.field3988 + var9.top + var9.bottom);
            class178.field2431 = class14.field185 = new class185((Applet) null, arg7, arg2, arg0);
            class315 var10 = class14.field185.method1276(this, 1, (byte) -107);
            while (var10.field4498 == 0) {
                class150.method907(10L, (byte) -32);
            }
        } catch (Exception var12) {
            class422.method2663((String) null, var12, arg4 + 11543);
        }
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V", line = 430)
    public final void method2482(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field5482++;
        if (this.field5457) {
            return;
        }
        try {
            class315 var2 = class14.field185.method1257(class121.field1495.getClass(), -121);
            while (var2.field4498 == 0) {
                class150.method907(100L, (byte) -32);
            }
            if (var2.field4497 != null) {
                throw (Throwable) var2.field4497;
            }
            jagmisc.init();
            this.field5457 = true;
            class97.field1172 = class374.method2385((byte) 76);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!og", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 461)
    public final void windowOpened(WindowEvent arg0) {
        field5484++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZZ)V", line = 468)
    public static final void method2483(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class415.field5953 = arg1;
        class299.field4190 = arg2;
        class76.field898 = arg3;
        class276.field3922 = new class193[arg0][class415.field5953][class299.field4190];
        class98.field1191 = new class327[arg0];
        if (arg4) {
            class370.field5218 = new class193[1][class415.field5953][class299.field4190];
            class87.field992 = new int[class415.field5953][class299.field4190];
            class399.field5693 = new class327[1];
        } else {
            class370.field5218 = null;
            class87.field992 = null;
            class399.field5693 = null;
        }
        if (arg5) {
            class229.field3232 = new int[arg0][arg1][arg2];
            class266.field3800 = new class12[255];
            class229.field3244 = new boolean[255];
            class75.field886 = 0;
        } else {
            class229.field3232 = null;
            class266.field3800 = null;
            class229.field3244 = null;
            class75.field886 = 0;
        }
        class203.method1350(false);
        class374.field5252 = new class265[500];
        class422.field6022 = 0;
        class392.field5534 = new class265[500];
        class339.field4809 = 0;
        class389.field5494 = new int[arg0][class415.field5953 + 1][class299.field4190 + 1];
        class97.field1168 = new class233[5000];
        class244.field3466 = 0;
        class29.field357 = new boolean[class76.field898 + class76.field898 + 1][class76.field898 + class76.field898 + 1];
        class337.field4793 = new boolean[class76.field898 + class76.field898 + 2][class76.field898 + class76.field898 + 2];
        class144.field1782 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V", line = 515)
    public final void method2484(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5468++;
        try {
            if (class121.field1495 == null) {
                class337.field4794 = arg0;
                class338.field4800 = 0;
                class121.field1495 = this;
                class330.field4671 = arg1;
                class410.field5896 = arg1;
                class105.field1259 = arg2;
                class282.field3988 = arg2;
                class323.field4601 = arg4;
                if (class14.field185 == null) {
                    class178.field2431 = class14.field185 = new class185(this, arg3, (String) null, 0);
                }
                class315 var6 = class14.field185.method1276(this, 1, (byte) 71);
                while (var6.field4498 == 0) {
                    class150.method907(10L, (byte) -32);
                }
            } else {
                class245.field3473++;
                if (class245.field3473 >= 3) {
                    this.method2476("alreadyloaded", arg4 ^ 0x2471);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class422.method2663((String) null, var8, -97);
            this.method2476("crash", arg4 ^ 0x2471);
        }
    }

    @OriginalMember(owner = "client!og", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 561)
    public final void windowClosed(WindowEvent arg0) {
        field5473++;
    }

    @OriginalMember(owner = "client!og", name = "providesignlink", descriptor = "(Lrd;)V", line = 569)
    public static final void providesignlink(class185 arg0) {
        class14.field185 = arg0;
        class178.field2431 = arg0;
        field5450++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)I", line = 578)
    public static final int method2485(int arg0, boolean arg1) {
        if (arg1) {
            method2485(-55, true);
        }
        field5483++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!og", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 596)
    public final URL getDocumentBase() {
        field5471++;
        if (class272.field3857 == null) {
            return class14.field185 == null || class14.field185.field2685 == this ? super.getDocumentBase() : class14.field185.field2685.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 614)
    public final void windowClosing(WindowEvent arg0) {
        field5461++;
        this.destroy();
    }

    @OriginalMember(owner = "client!og", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 623)
    public final String getParameter(String arg0) {
        field5452++;
        if (class272.field3857 == null) {
            return class14.field185 == null || class14.field185.field2685 == this ? super.getParameter(arg0) : class14.field185.field2685.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Z", line = 643)
    public final boolean method2486(byte arg0) {
        field5454++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != 106) {
                this.field5457 = true;
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
                this.method2476("invalidhost", arg0 ^ 0x241B);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "stop", descriptor = "()V", line = 682)
    public final void stop() {
        field5462++;
        if (class121.field1495 == this && !class299.field4192) {
            class439.field6283 = class175.method1195(73) + 4000L;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 694)
    public static final Object method2487(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 != 16293) {
            return null;
        }
        field5455++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class292.field4088) {
            try {
                class95 var3 = (class95) Class.forName("km").getDeclaredConstructor().newInstance();
                var3.method529(arg1 ^ 0x19F6, arg0);
                return var3;
            } catch (Throwable var4) {
                class292.field4088 = true;
            }
        }
        return arg2 ? class409.method2615(114, arg0) : arg0;
    }

    @OriginalMember(owner = "client!og", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 729)
    public final void update(Graphics arg0) {
        field5474++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!og", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 745)
    public final URL getCodeBase() {
        field5467++;
        if (class272.field3857 == null) {
            return class14.field185 == null || class14.field185.field2685 == this ? super.getCodeBase() : class14.field185.field2685.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 760)
    public final void focusLost(FocusEvent arg0) {
        field5458++;
        class229.field3242 = false;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IZ)V", line = 768)
    private final void method2488(int arg0, boolean arg1) {
        field5451++;
        synchronized (this) {
            if (class299.field4192) {
                return;
            }
            class299.field4192 = true;
        }
        if (class14.field185.field2685 != null) {
            class14.field185.field2685.destroy();
        }
        try {
            this.method1105(1401);
        } catch (Exception var11) {
        }
        if (this.field5457) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field5457 = false;
        }
        class315 var4 = class14.field185.method1267(class121.field1495.getClass(), (byte) -103);
        while (var4.field4498 == 0) {
            class150.method907(100L, (byte) -32);
        }
        if (arg0 >= -17) {
            this.field5472 = true;
        }
        if (class402.field5767 != null) {
            try {
                class402.field5767.removeFocusListener(this);
                class402.field5767.getParent().remove(class402.field5767);
            } catch (Exception var9) {
            }
        }
        if (class14.field185 != null) {
            try {
                class14.field185.method1258(-99);
            } catch (Exception var8) {
            }
        }
        this.method1116(11147);
        if (class272.field3857 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!og", name = "start", descriptor = "()V", line = 851)
    public final void start() {
        field5480++;
        if (class121.field1495 == this && !class299.field4192) {
            class439.field6283 = 0L;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)V", line = 869)
    private final void method2489(boolean arg0) {
        field5466++;
        long var2 = class175.method1195(123);
        long var4 = class54.field650[class2.field13];
        class54.field650[class2.field13] = var2;
        class2.field13 = class2.field13 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class452.field6477 = class229.field3242;
            if (arg0) {
                this.method2486((byte) 127);
            }
        }
        this.method1107(11);
    }

    @OriginalMember(owner = "client!og", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 900)
    public final void windowIconified(WindowEvent arg0) {
        field5463++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public abstract void method1100(boolean arg0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public abstract void method1098(int arg0);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public abstract void method1105(int arg0);

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public abstract void method1116(int arg0);

    @OriginalMember(owner = "client!og", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    public abstract void method1107(int arg0);
}
