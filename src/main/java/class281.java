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

@OriginalClass("client!ss")
public abstract class class281 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Z")
    private boolean field3634 = false;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "Z")
    private boolean field3657 = false;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Lcq;")
    public static class72 field3640 = new class72("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ss", name = "Q", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ss", name = "R", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "Z")
    public static boolean field3674;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "[I")
    public static int[] field3671;

    @OriginalMember(owner = "client!ss", name = "start", descriptor = "()V")
    public final void start() {
        field3667++;
        if (class129.field1431 == this && !class414.field5679) {
            class285.field3729 = 0L;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public final void method1756(int arg0) {
        field3654++;
        if (!this.field3634) {
            try {
                class315 var2 = class401.field5525.method2730(87, class129.field1431.getClass());
                while (var2.field4244 == 0) {
                    class219.method1330(100L, true);
                }
                if (var2.field4243 != null) {
                    throw (Throwable) var2.field4243;
                }
                jagmisc.init();
                this.field3634 = true;
                class89.field1027 = class335.method2149((byte) -57);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != 0) {
            field3664 = 108;
        }
    }

    @OriginalMember(owner = "client!ss", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3639++;
        if (class129.field1431 != this || class414.field5679) {
            return;
        }
        class422.field5790 = true;
        if (class278.field3604 && class164.method1038(8635) - class40.field483 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class283.field3693 && class450.field6290 <= var2.height) {
                class198.field2337 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public abstract void method1757(int arg0);

    @OriginalMember(owner = "client!ss", name = "providesignlink", descriptor = "(Lnh;)V")
    public static final void providesignlink(class441 arg0) {
        field3655++;
        class401.field5525 = arg0;
        class431.field5880 = arg0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1758(String arg0, int arg1) {
        field3670++;
        if (arg1 != 0 || this.field3657) {
            return;
        }
        this.field3657 = true;
        System.out.println("error_game_" + arg0);
        try {
            class443.method2743(class401.field5525.field6077, arg1 - 24425, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZLjava/lang/String;IIIII)V")
    public final void method1759(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class39.field457 = arg4;
            class283.field3693 = arg4;
            class28.field315 = arg6;
            class450.field6290 = arg6;
            class52.field613 = arg3;
            class236.field3104 = 0;
            class129.field1431 = this;
            if (arg7 != 100) {
                this.windowOpened((WindowEvent) null);
            }
            class398.field5402 = 0;
            class167.field1942 = new Frame();
            class167.field1942.setTitle("Jagex");
            class167.field1942.setResizable(true);
            class167.field1942.addWindowListener(this);
            class167.field1942.setVisible(true);
            class167.field1942.toFront();
            Insets var9 = class167.field1942.getInsets();
            class167.field1942.setSize(class283.field3693 + var9.left + var9.right, class450.field6290 + var9.top + var9.bottom);
            class431.field5880 = class401.field5525 = new class441((Applet) null, arg0, arg2, arg5);
            class315 var10 = class401.field5525.method2733(arg7 - 100, this, 1);
            while (var10.field4244 == 0) {
                class219.method1330(10L, true);
            }
        } catch (Exception var12) {
            class402.method2510((String) null, var12, -29832);
        }
        field3635++;
    }

    @OriginalMember(owner = "client!ss", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3651++;
    }

    @OriginalMember(owner = "client!ss", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3636++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public abstract void method1760(byte arg0);

    @OriginalMember(owner = "client!ss", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3653++;
    }

    @OriginalMember(owner = "client!ss", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3669++;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
    public final synchronized void method1761(byte arg0) {
        field3646++;
        if (class357.field4845 != null) {
            class357.field4845.removeFocusListener(this);
            class357.field4845.getParent().remove(class357.field4845);
        }
        Container var2;
        if (class53.field620 != null) {
            var2 = class53.field620;
        } else if (class167.field1942 == null) {
            var2 = class401.field5525.field6077;
        } else {
            var2 = class167.field1942;
        }
        var2.setLayout((LayoutManager) null);
        class357.field4845 = new class274(this);
        var2.add(class357.field4845);
        class357.field4845.setSize(class39.field457, class28.field315);
        class357.field4845.setVisible(true);
        if (class167.field1942 == var2) {
            Insets var3 = class167.field1942.getInsets();
            class357.field4845.setLocation(var3.left + class398.field5402, class236.field3104 + var3.top);
        } else {
            class357.field4845.setLocation(class398.field5402, class236.field3104);
        }
        class357.field4845.addFocusListener(this);
        if (arg0 <= 69) {
            return;
        }
        class357.field4845.requestFocus();
        class178.field2084 = true;
        class352.field4798 = true;
        class422.field5790 = true;
        class198.field2337 = false;
        class40.field483 = class164.method1038(8635);
    }

    @OriginalMember(owner = "client!ss", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3650++;
        if (class167.field1942 == null) {
            return class401.field5525 == null || class401.field5525.field6077 == this ? super.getDocumentBase() : class401.field5525.field6077.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3642++;
        class352.field4798 = true;
        class422.field5790 = true;
    }

    @OriginalMember(owner = "client!ss", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3638++;
        if (class167.field1942 == null) {
            return class401.field5525 == null || class401.field5525.field6077 == this ? super.getCodeBase() : class401.field5525.field6077.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3649++;
    }

    @OriginalMember(owner = "client!ss", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3645++;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    private final void method1762(boolean arg0) {
        field3661++;
        long var2 = class164.method1038(8635);
        long var4 = class340.field4641[class116.field1332];
        class340.field4641[class116.field1332] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class116.field1332 = class116.field1332 + 1 & 0x1F;
        synchronized (this) {
            class178.field2084 = class352.field4798;
            if (arg0) {
                this.stop();
            }
        }
        this.method1757(7341);
    }

    @OriginalMember(owner = "client!ss", name = "run", descriptor = "()V")
    public final void run() {
        field3647++;
        try {
            label114: {
                if (class441.field6076 != null) {
                    String var1 = class441.field6076.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class441.field6078;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1758("wrongjava", 0);
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class441.field6078 == null || class441.field6078.equals("1.4.2"))) {
                        this.method1758("wrongjava", 0);
                        break label114;
                    }
                }
                if (class441.field6078 != null && class441.field6078.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class441.field6078.length() > var3) {
                        char var5 = class441.field6078.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class278.field3604 = true;
                    }
                }
                if (class401.field5525.field6077 != null) {
                    Method var6 = class441.field6095;
                    if (var6 != null) {
                        try {
                            var6.invoke(class401.field5525.field6077, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class173.method1087(false);
                class141.method906(false);
                this.method1761((byte) 89);
                this.method1774(-1);
                class89.field1027 = class335.method2149((byte) -57);
                this.method1756(0);
                while (class285.field3729 == 0L || class285.field3729 > class164.method1038(8635)) {
                    class202.field2380 = class89.field1027.method1985((byte) 105, class68.field820);
                    for (int var7 = 0; var7 < class202.field2380; var7++) {
                        this.method1762(false);
                    }
                    this.method1764(545416641);
                    class54.method304(class357.field4845, class401.field5525, 1001);
                }
            }
        } catch (Exception var10) {
            class402.method2510((String) null, var10, -29832);
            this.method1758("crash", 0);
        }
        this.method1766(true, (byte) 8);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZII[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1763(boolean arg0, int arg1, int arg2, String[] arg3) {
        field3641++;
        if (arg0) {
            return null;
        } else if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)V")
    private final void method1764(int arg0) {
        if (arg0 != 545416641) {
            field3671 = null;
        }
        field3656++;
        long var2 = class164.method1038(arg0 - 545408006);
        long var4 = class6.field42[class316.field4247];
        class6.field42[class316.field4247] = var2;
        class316.field4247 = class316.field4247 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class335.field4570 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class354.field4821++) > 50) {
            class422.field5790 = true;
            class354.field4821 -= 50;
            class357.field4845.setSize(class39.field457, class28.field315);
            class357.field4845.setVisible(true);
            if (class167.field1942 != null && class53.field620 == null) {
                Insets var7 = class167.field1942.getInsets();
                class357.field4845.setLocation(class398.field5402 + var7.left, class236.field3104 + var7.top);
            } else {
                class357.field4845.setLocation(class398.field5402, class236.field3104);
            }
        }
        this.method1768(-25402);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIBII)V")
    public final void method1765(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3659++;
        try {
            if (class129.field1431 == null) {
                class52.field613 = arg3;
                if (arg2 <= 39) {
                    field3664 = -97;
                }
                class28.field315 = arg0;
                class450.field6290 = arg0;
                class236.field3104 = 0;
                class398.field5402 = 0;
                class129.field1431 = this;
                class39.field457 = arg1;
                class283.field3693 = arg1;
                if (class401.field5525 == null) {
                    class431.field5880 = class401.field5525 = new class441(this, arg4, (String) null, 0);
                }
                class315 var6 = class401.field5525.method2733(0, this, 1);
                while (var6.field4244 == 0) {
                    class219.method1330(10L, true);
                }
            } else {
                class433.field5918++;
                if (class433.field5918 >= 3) {
                    this.method1758("alreadyloaded", 0);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class402.method2510((String) null, var8, -29832);
            this.method1758("crash", 0);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZB)V")
    private final void method1766(boolean arg0, byte arg1) {
        field3658++;
        synchronized (this) {
            if (class414.field5679) {
                return;
            }
            class414.field5679 = true;
        }
        if (class401.field5525.field6077 != null) {
            class401.field5525.field6077.destroy();
        }
        try {
            this.method1770(0);
        } catch (Exception var12) {
        }
        if (this.field3634) {
            try {
                jagmisc.quit();
            } catch (Throwable var11) {
            }
            this.field3634 = false;
        }
        class315 var4 = class401.field5525.method2715(class129.field1431.getClass(), true);
        while (var4.field4244 == 0) {
            class219.method1330(100L, true);
        }
        if (class357.field4845 != null) {
            try {
                class357.field4845.removeFocusListener(this);
                class357.field4845.getParent().remove(class357.field4845);
            } catch (Exception var10) {
            }
        }
        int var5 = 59 / ((-arg1 - 72) / 45);
        if (class401.field5525 != null) {
            try {
                class401.field5525.method2732((byte) 124);
            } catch (Exception var9) {
            }
        }
        this.method1760((byte) -22);
        if (class167.field1942 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ss", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3633++;
        class352.field4798 = false;
    }

    @OriginalMember(owner = "client!ss", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZBI)V")
    public static final void method1767(boolean arg0, byte arg1, int arg2) {
        field3666++;
        if (arg1 >= -68) {
            method1771(-72);
        }
        class391 var3 = class70.method415(Integer.MIN_VALUE, arg2, arg0);
        if (var3 != null) {
            var3.method263(false);
        }
    }

    @OriginalMember(owner = "client!ss", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3663++;
        if (class167.field1942 == null) {
            return class401.field5525 == null || class401.field5525.field6077 == this ? super.getParameter(arg0) : class401.field5525.field6077.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3637++;
        if (class167.field1942 == null) {
            return class401.field5525 == null || class401.field5525.field6077 == this ? super.getAppletContext() : class401.field5525.field6077.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "stop", descriptor = "()V")
    public final void stop() {
        field3668++;
        if (class129.field1431 == this && !class414.field5679) {
            class285.field3729 = class164.method1038(8635) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(I)V")
    public abstract void method1768(int arg0);

    @OriginalMember(owner = "client!ss", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3648++;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)Z")
    public final boolean method1769(boolean arg0) {
        field3652++;
        if (!arg0) {
            field3640 = null;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
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
                this.method1758("invalidhost", 0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V")
    public abstract void method1770(int arg0);

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)Lkb;")
    public static final class122 method1771(int arg0) {
        field3660++;
        if (arg0 != -51) {
            return null;
        }
        try {
            return (class122) Class.forName("o").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "(I)V")
    public static void method1772(int arg0) {
        if (arg0 > -75) {
            method1772(-58);
        }
        field3640 = null;
        field3671 = null;
    }

    @OriginalMember(owner = "client!ss", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3643++;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
    public static final void method1773(byte arg0) {
        class68.field818 = -1;
        class62.field768 = null;
        field3665++;
        if (arg0 != -122) {
            method1767(false, (byte) 103, -125);
        }
    }

    @OriginalMember(owner = "client!ss", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3662++;
        if (class129.field1431 == this && !class414.field5679) {
            class285.field3729 = class164.method1038(8635);
            class219.method1330(5000L, true);
            class431.field5880 = null;
            this.method1766(false, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)V")
    public abstract void method1774(int arg0);
}
