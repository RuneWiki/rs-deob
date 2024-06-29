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

@OriginalClass("client!fe")
public abstract class class234 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Z")
    private boolean field4077 = false;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field4082 = -1;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field4080 = 0;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Z")
    public static boolean field4104 = true;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Ldf;")
    private static class51 field4096 = class46.method233("wishes to trade with you)3", 100);

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Ldf;")
    public static class51 field4091 = field4096;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field4088 = 1;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Ldf;")
    public static class51 field4108 = class46.method233("hitbar_default", 100);

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "Z")
    public static boolean field4111 = false;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field4095 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "Z")
    public static boolean field4113;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Z")
    public static boolean field4114;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "Z")
    public static boolean field4115;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[[B")
    public static byte[][] field4071;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZB)V")
    private final void method1622(boolean arg0, byte arg1) {
        field4110++;
        synchronized (this) {
            if (class163.field2669) {
                return;
            }
            class163.field2669 = true;
        }
        if (class25.field376.field3999 != null) {
            class25.field376.field3999.destroy();
        }
        try {
            this.method1049(arg1 ^ 0xFFFFFFF6);
        } catch (Exception var9) {
        }
        if (class31.field452 != null) {
            try {
                class31.field452.removeFocusListener(this);
                class31.field452.getParent().remove(class31.field452);
            } catch (Exception var8) {
            }
        }
        if (class25.field376 != null) {
            try {
                class25.field376.method1575(arg1 ^ 0x1D43);
            } catch (Exception var7) {
            }
        }
        this.method1057(arg1 + 131);
        if (class131.field2193 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (arg1 != -14) {
            field4071 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!fe", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4074++;
        if (class255.field4451 == this && !class163.field2669) {
            class123.field2091 = class7.method31((byte) -88);
            class147.method1066(5000L, 0);
            class216.field3750 = null;
            this.method1622(false, (byte) -14);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public abstract void method1057(int arg0);

    @OriginalMember(owner = "client!fe", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4085++;
        if (class131.field2193 == null) {
            return class25.field376 == null || class25.field376.field3999 == this ? super.getDocumentBase() : class25.field376.field3999.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lu;ILu;Lu;)V")
    public static final void method1623(class111 arg0, int arg1, class111 arg2, class111 arg3) {
        class204.field3420 = arg0;
        if (arg1 != 0) {
            field4104 = true;
        }
        class44.field704 = arg3;
        field4073++;
        class171.field2798 = arg2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public abstract void method1055(boolean arg0);

    @OriginalMember(owner = "client!fe", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4081++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIIIII)V")
    public static final void method1624(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class97 var6 = class27.field395[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class98 var7 = var6.field1618;
        if (var7 != null) {
            int var8 = var7.field1635;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class199 var10 = var6.field1619;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3333;
        int var12 = var10.field3335;
        int var13 = var10.field3337;
        int var14 = var10.field3339;
        int[] var15 = class40.field629[var11];
        int[] var16 = class262.field4590[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4097++;
    }

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
    public final void run() {
        field4112++;
        try {
            if (class229.field4003 != null) {
                String var1 = class229.field4003.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class229.field3986;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1626("wrongjava", (byte) 75);
                        return;
                    }
                    class27.field387 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class229.field3986 == null || class229.field3986.equals("1.4.2"))) {
                    this.method1626("wrongjava", (byte) 75);
                    return;
                }
            }
            if (class25.field376.field3999 != null) {
                Method var3 = class229.field4000;
                if (var3 != null) {
                    try {
                        var3.invoke(class25.field376.field3999, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1631(0);
            class192.field3209 = class90.method681(class95.field1578, class76.field1230, class31.field452, (byte) -124);
            this.method1055(true);
            class63.field1031 = class151.method1090(0);
            while (class123.field2091 == 0L || class123.field2091 > class7.method31((byte) -88)) {
                class164.field2684 = class63.field1031.method833(class27.field387, -5999, class27.field390);
                for (int var4 = 0; var4 < class164.field2684; var4++) {
                    this.method1632((byte) 57);
                }
                this.method1627(true);
                class145.method1040(1001, class25.field376, class31.field452);
            }
        } catch (Exception var7) {
            class89.method674(var7, (String) null, 95);
            this.method1626("crash", (byte) 75);
        }
        this.method1622(true, (byte) -14);
    }

    @OriginalMember(owner = "client!fe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class98.field1647 = true;
        field4076++;
        class119.field1990 = true;
    }

    @OriginalMember(owner = "client!fe", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field4102++;
        this.destroy();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
    public static final boolean method1625(int arg0, int arg1) {
        field4089++;
        if (arg0 <= 23) {
            field4095 = 77;
        }
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1626(String arg0, byte arg1) {
        field4098++;
        if (arg1 != 75) {
            this.method1057(61);
        }
        if (this.field4077) {
            return;
        }
        this.field4077 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
    private final void method1627(boolean arg0) {
        field4105++;
        long var2 = class7.method31((byte) -88);
        long var4 = class12.field187[class48.field762];
        class12.field187[class48.field762] = var2;
        if (!arg0) {
            return;
        }
        class48.field762 = class48.field762 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class135.field2247 = ((var6 >> 1) + 32000) / var6;
        }
        if (class52.field877++ > 50) {
            class119.field1990 = true;
            class52.field877 -= 50;
            class31.field452.setSize(class95.field1578, class76.field1230);
            class31.field452.setVisible(true);
            if (class131.field2193 != null && class195.field3265 == null) {
                Insets var7 = class131.field2193.getInsets();
                class31.field452.setLocation(var7.left + class242.field4196, class218.field3808 + var7.top);
            } else {
                class31.field452.setLocation(class242.field4196, class218.field3808);
            }
        }
        this.method1054((byte) 7);
    }

    @OriginalMember(owner = "client!fe", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4083++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public abstract void method1054(byte arg0);

    @OriginalMember(owner = "client!fe", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4101++;
        if (class131.field2193 == null) {
            return class25.field376 == null || class25.field376.field3999 == this ? super.getParameter(arg0) : class25.field376.field3999.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4103++;
    }

    @OriginalMember(owner = "client!fe", name = "stop", descriptor = "()V")
    public final void stop() {
        field4072++;
        if (class255.field4451 == this && !class163.field2669) {
            class123.field2091 = class7.method31((byte) -88) + 4000L;
        }
    }

    @OriginalMember(owner = "client!fe", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4075++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIBI)V")
    public final void method1628(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4087++;
        try {
            if (class255.field4451 == null) {
                class255.field4451 = this;
                class218.field3808 = 0;
                class95.field1578 = arg2;
                class27.field397 = arg2;
                class124.field2106 = arg1;
                class242.field4196 = 0;
                class76.field1230 = arg4;
                class140.field2352 = arg4;
                if (arg3 > 54) {
                    String var6 = this.getParameter("openwinjs");
                    boolean var10000;
                    if (var6 != null && var6.equals("1")) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                    if (class25.field376 == null) {
                        class216.field3750 = class25.field376 = new class229(false, this, arg0, (String) null, 0);
                    }
                    class25.field376.method1570(this, -28437, 1);
                }
            } else {
                class24.field363++;
                if (class24.field363 >= 3) {
                    this.method1626("alreadyloaded", (byte) 75);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class89.method674(var8, (String) null, 95);
            this.method1626("crash", (byte) 75);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I")
    public static final int method1629(byte arg0) {
        if (arg0 > -81) {
            field4095 = -63;
        }
        field4106++;
        return 16;
    }

    @OriginalMember(owner = "client!fe", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4070++;
        if (class131.field2193 == null) {
            return class25.field376 == null || class25.field376.field3999 == this ? super.getCodeBase() : class25.field376.field3999.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "providesignlink", descriptor = "(Lsc;)V")
    public static final void providesignlink(class229 arg0) {
        class25.field376 = arg0;
        class216.field3750 = arg0;
        field4093++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public abstract void method1059(int arg0);

    @OriginalMember(owner = "client!fe", name = "start", descriptor = "()V")
    public final void start() {
        field4109++;
        if (class255.field4451 == this && !class163.field2669) {
            class123.field2091 = 0L;
        }
    }

    @OriginalMember(owner = "client!fe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class98.field1647 = false;
        field4094++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method1630(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field4100++;
        try {
            class242.field4196 = arg1;
            class124.field2106 = arg0;
            class76.field1230 = arg3;
            class140.field2352 = arg3;
            class218.field3808 = 0;
            class95.field1578 = arg2;
            class27.field397 = arg2;
            class255.field4451 = this;
            class131.field2193 = new Frame();
            class131.field2193.setTitle("Jagex");
            class131.field2193.setResizable(true);
            class131.field2193.addWindowListener(this);
            class131.field2193.setVisible(true);
            class131.field2193.toFront();
            Insets var8 = class131.field2193.getInsets();
            class131.field2193.setSize(class27.field397 + var8.left + var8.right, class140.field2352 - -var8.top + var8.bottom);
            class216.field3750 = class25.field376 = new class229(true, (Applet) null, arg4, arg5, arg6);
            class25.field376.method1570(this, arg1 ^ 0xFFFF90EB, 1);
        } catch (Exception var10) {
            class89.method674(var10, (String) null, 95);
        }
    }

    @OriginalMember(owner = "client!fe", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4092++;
        if (class131.field2193 == null) {
            return class25.field376 == null || class25.field376.field3999 == this ? super.getAppletContext() : class25.field376.field3999.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4086++;
        if (class255.field4451 != this || class163.field2669) {
            return;
        }
        class119.field1990 = true;
        if (class229.field3986 != null && class229.field3986.startsWith("1.5") && (class7.method31((byte) -88) - class245.field4259) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class27.field397 && var2.height >= class140.field2352) {
                class6.field65 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public final synchronized void method1631(int arg0) {
        field4090++;
        if (class31.field452 != null) {
            class31.field452.removeFocusListener(this);
            class31.field452.getParent().remove(class31.field452);
        }
        Container var2;
        if (class195.field3265 != null) {
            var2 = class195.field3265;
        } else if (class131.field2193 == null) {
            var2 = class25.field376.field3999;
        } else {
            var2 = class131.field2193;
        }
        var2.setLayout((LayoutManager) null);
        class31.field452 = new class122(this);
        var2.add(class31.field452);
        class31.field452.setSize(class95.field1578, class76.field1230);
        class31.field452.setVisible(true);
        if (class131.field2193 == var2) {
            Insets var3 = class131.field2193.getInsets();
            class31.field452.setLocation(var3.left + class242.field4196, class218.field3808 + var3.top);
        } else {
            class31.field452.setLocation(class242.field4196, class218.field3808);
        }
        class31.field452.addFocusListener(this);
        if (arg0 != 0) {
            return;
        }
        class31.field452.requestFocus();
        class255.field4450 = true;
        class98.field1647 = true;
        class119.field1990 = true;
        class6.field65 = false;
        class245.field4259 = class7.method31((byte) -88);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public abstract void method1049(int arg0);

    @OriginalMember(owner = "client!fe", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4084++;
    }

    @OriginalMember(owner = "client!fe", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    private final void method1632(byte arg0) {
        long var2 = class7.method31((byte) -88);
        long var4 = class240.field4174[class264.field4630];
        if (arg0 != 57) {
            return;
        }
        field4099++;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class240.field4174[class264.field4630] = var2;
        class264.field4630 = class264.field4630 + 1 & 0x1F;
        synchronized (this) {
            class255.field4450 = class98.field1647;
        }
        this.method1059(81);
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)Z")
    public final boolean method1633(int arg0) {
        field4078++;
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
                int var3 = -103 % ((arg0 - 63) / 35);
                this.method1626("invalidhost", (byte) 75);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
    public static void method1634(int arg0) {
        field4108 = null;
        field4071 = null;
        field4091 = null;
        if (arg0 == 0) {
            field4096 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4107++;
    }
}
