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

@OriginalClass("client!vb")
public abstract class class50 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "Z")
    private boolean field826 = false;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "Z")
    public static boolean field829;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Z")
    public static boolean field830;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
    public static int[] field814;

    @OriginalMember(owner = "client!vb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 4)
    public final void windowOpened(WindowEvent arg0) {
        field810++;
    }

    @OriginalMember(owner = "client!vb", name = "start", descriptor = "()V", line = 16)
    public final void start() {
        field806++;
        if (class212.field3613 == this && !class29.field400) {
            class40.field633 = 0L;
        }
    }

    @OriginalMember(owner = "client!vb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 35)
    public final String getParameter(String arg0) {
        field796++;
        if (class211.field3601 == null) {
            return class210.field3585 == null || class210.field3585.field2072 == this ? super.getParameter(arg0) : class210.field3585.field2072.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 49)
    public final void focusGained(FocusEvent arg0) {
        class276.field4748 = true;
        field807++;
        class233.field3944 = true;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V", line = 59)
    public final void method357(String arg0, int arg1, String arg2) {
        field816++;
        if (this.field826) {
            return;
        }
        this.field826 = true;
        System.out.println("error_game_" + arg2);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg2 + ".ws?" + arg0), "_top");
            if (arg1 != 5000) {
                field803 = 17;
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!vb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 82)
    public final synchronized void paint(Graphics arg0) {
        field818++;
        if (class212.field3613 == this && !class29.field400) {
            class233.field3944 = true;
            if (class124.field2066 != null && class124.field2066.startsWith("1.5")) {
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 113)
    public final synchronized void method358(byte arg0) {
        if (class237.field3991 != null) {
            class237.field3991.removeFocusListener(this);
            class237.field3991.getParent().remove(class237.field3991);
        }
        field799++;
        Container var2;
        if (class299.field5117 != null) {
            var2 = class299.field5117;
        } else if (class211.field3601 == null) {
            var2 = class210.field3585.field2072;
        } else {
            var2 = class211.field3601;
        }
        var2.setLayout((LayoutManager) null);
        class237.field3991 = new class99(this);
        class237.field3991.setIgnoreRepaint(true);
        var2.add(class237.field3991);
        class237.field3991.setSize(class188.field3141, class244.field4111);
        class237.field3991.setVisible(true);
        if (class211.field3601 == var2) {
            Insets var3 = class211.field3601.getInsets();
            class237.field3991.setLocation(class98.field1620 + var3.left, class111.field1896 + var3.top);
        } else {
            class237.field3991.setLocation(class98.field1620, class111.field1896);
        }
        class237.field3991.addFocusListener(this);
        class237.field3991.requestFocus();
        class276.field4748 = true;
        class233.field3944 = true;
        class310.field5294 = true;
        class17.field220 = false;
        class304.field5201 = class78.method669(2047);
        if (arg0 >= -43) {
            this.windowClosed((WindowEvent) null);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 164)
    private final void method359(int arg0) {
        long var2 = class235.field3973[class260.field4355];
        int var4 = -39 / ((arg0 + 35) / 63);
        field812++;
        long var5 = class78.method669(2047);
        class235.field3973[class260.field4355] = var5;
        if (var2 != 0L && var5 > var2) {
            int var7 = (int) (var5 - var2);
            class61.field1082 = ((var7 >> 1) + 32000) / var7;
        }
        class260.field4355 = class260.field4355 + 1 & 0x1F;
        if (class286.field4927++ > 50) {
            class233.field3944 = true;
            class286.field4927 -= 50;
            class237.field3991.setSize(class188.field3141, class244.field4111);
            class237.field3991.setVisible(true);
            if (class211.field3601 != null && class299.field5117 == null) {
                Insets var8 = class211.field3601.getInsets();
                class237.field3991.setLocation(var8.left + class98.field1620, class111.field1896 + var8.top);
            } else {
                class237.field3991.setLocation(class98.field1620, class111.field1896);
            }
        }
        this.method364((byte) -115);
    }

    @OriginalMember(owner = "client!vb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 203)
    public final void windowDeiconified(WindowEvent arg0) {
        field817++;
    }

    @OriginalMember(owner = "client!vb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 210)
    public final void windowActivated(WindowEvent arg0) {
        field795++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 224)
    public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        try {
            class212.field3613 = this;
            class98.field1620 = 0;
            class111.field1896 = 0;
            class244.field4111 = arg4;
            class113.field1924 = arg4;
            class279.field4836 = arg2;
            class188.field3141 = arg1;
            class275.field4739 = arg1;
            class211.field3601 = new Frame();
            class211.field3601.setTitle("Jagex");
            class211.field3601.setResizable(true);
            class211.field3601.addWindowListener(this);
            class211.field3601.setVisible(true);
            class211.field3601.toFront();
            Insets var8 = class211.field3601.getInsets();
            class211.field3601.setSize(class275.field4739 + var8.left + var8.right, var8.top + var8.bottom + class113.field1924);
            class126.field2193 = class210.field3585 = new class124(true, (Applet) null, arg5, arg6, arg3);
            class210.field3585.method947(0, this, 5);
        } catch (Exception var10) {
            class17.method100(var10, -14020, (String) null);
        }
        if (arg0 >= -77) {
            this.method364((byte) -49);
        }
        field808++;
    }

    @OriginalMember(owner = "client!vb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 259)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field801++;
    }

    @OriginalMember(owner = "client!vb", name = "destroy", descriptor = "()V", line = 267)
    public final void destroy() {
        field824++;
        if (class212.field3613 == this && !class29.field400) {
            class40.field633 = class78.method669(2047);
            class235.method1708(123, 5000L);
            class126.field2193 = null;
            this.method369(false, -117);
        }
    }

    @OriginalMember(owner = "client!vb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 282)
    public final void windowDeactivated(WindowEvent arg0) {
        field800++;
    }

    @OriginalMember(owner = "client!vb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 290)
    public final void windowIconified(WindowEvent arg0) {
        field815++;
    }

    @OriginalMember(owner = "client!vb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 300)
    public final void windowClosed(WindowEvent arg0) {
        field811++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V", line = 307)
    public final void method363(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field819++;
        try {
            if (class212.field3613 != null) {
                class287.field4938++;
                if (class287.field4938 >= 3) {
                    this.method365(false, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class188.field3141 = arg0;
            class275.field4739 = arg0;
            class111.field1896 = 0;
            class98.field1620 = 0;
            class244.field4111 = arg4;
            class113.field1924 = arg4;
            class212.field3613 = this;
            class279.field4836 = arg2;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class136.field2327 = true;
            } else {
                class136.field2327 = false;
            }
            if (class210.field3585 == null) {
                class126.field2193 = class210.field3585 = new class124(false, this, arg3, (String) null, 0);
            }
            class210.field3585.method947(0, this, 5);
            int var7 = 53 % ((-arg1 - 37) / 32);
        } catch (Exception var9) {
            class17.method100(var9, -14020, (String) null);
            this.method365(false, "crash");
        }
    }

    @OriginalMember(owner = "client!vb", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 357)
    public final URL getCodeBase() {
        field802++;
        if (class211.field3601 == null) {
            return class210.field3585 == null || class210.field3585.field2072 == this ? super.getCodeBase() : class210.field3585.field2072.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 377)
    public final void method365(boolean arg0, String arg1) {
        field804++;
        if (this.field826) {
            return;
        }
        this.field826 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
        if (arg0) {
            this.method357((String) null, 104, (String) null);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 406)
    private final void method366(int arg0) {
        long var2 = class78.method669(2047);
        field797++;
        long var4 = class158.field2720[class14.field185];
        if (var4 != 0L && var2 <= var4) {
        }
        class158.field2720[class14.field185] = var2;
        class14.field185 = class14.field185 + 1 & 0x1F;
        synchronized (this) {
            class310.field5294 = class276.field4748;
        }
        this.method360((byte) 8);
        int var8 = -86 % ((60 - arg0) / 52);
    }

    @OriginalMember(owner = "client!vb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 434)
    public final AppletContext getAppletContext() {
        field827++;
        if (class211.field3601 == null) {
            return class210.field3585 == null || class210.field3585.field2072 == this ? super.getAppletContext() : class210.field3585.field2072.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "providesignlink", descriptor = "(Lcl;)V", line = 456)
    public static final void providesignlink(class124 arg0) {
        class210.field3585 = arg0;
        class126.field2193 = arg0;
        field798++;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)Z", line = 468)
    public final boolean method368(int arg0) {
        field809++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            if (arg0 != 1) {
                this.field826 = false;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method365(false, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)V", line = 504)
    private final void method369(boolean arg0, int arg1) {
        field805++;
        synchronized (this) {
            if (class29.field400) {
                return;
            }
            class29.field400 = true;
        }
        if (class210.field3585.field2072 != null) {
            class210.field3585.field2072.destroy();
        }
        try {
            this.method362(73);
            if (arg1 > -109) {
                field814 = (int[]) null;
            }
        } catch (Exception var12) {
        }
        if (class237.field3991 != null) {
            try {
                class237.field3991.removeFocusListener(this);
                class237.field3991.getParent().remove(class237.field3991);
            } catch (Exception var11) {
            }
        }
        if (class210.field3585 != null) {
            try {
                class210.field3585.method951(20485);
            } catch (Exception var10) {
            }
        }
        this.method367(127);
        if (class211.field3601 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)Z", line = 566)
    public static final boolean method370(byte arg0) {
        field825++;
        class32 var1 = class13.field171;
        synchronized (class13.field171) {
            if (class195.field3279 == class190.field3172) {
                return false;
            }
            class152.field2617 = class150.field2584[class190.field3172];
            class78.field1340 = class19.field264[class190.field3172];
            if (arg0 != -23) {
                providesignlink((class124) null);
            }
            class190.field3172 = class190.field3172 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 586)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field820++;
    }

    @OriginalMember(owner = "client!vb", name = "stop", descriptor = "()V", line = 594)
    public final void stop() {
        field823++;
        if (class212.field3613 == this && !class29.field400) {
            class40.field633 = class78.method669(2047) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 608)
    public final URL getDocumentBase() {
        field813++;
        if (class211.field3601 == null) {
            return class210.field3585 == null || class210.field3585.field2072 == this ? super.getDocumentBase() : class210.field3585.field2072.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 624)
    public final void focusLost(FocusEvent arg0) {
        field821++;
        class276.field4748 = false;
    }

    @OriginalMember(owner = "client!vb", name = "run", descriptor = "()V", line = 633)
    public final void run() {
        field822++;
        try {
            if (class124.field2080 != null) {
                String var1 = class124.field2080.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class124.field2066;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method365(false, "wrongjava");
                        return;
                    }
                    class206.field3481 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class124.field2066 == null || class124.field2066.equals("1.4.2"))) {
                    this.method365(false, "wrongjava");
                    return;
                }
            }
            if (class210.field3585.field2072 != null) {
                Method var3 = class124.field2086;
                if (var3 != null) {
                    try {
                        var3.invoke(class210.field3585.field2072, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method358((byte) -69);
            this.method356((byte) -62);
            class195.field3277 = class162.method1217(-1087515668);
            while (class40.field633 == 0L || class78.method669(2047) < class40.field633) {
                class294.field5060 = class195.field3277.method1230(-116, class206.field3481, class121.field2045);
                for (int var5 = 0; var5 < class294.field5060; var5++) {
                    this.method366(-69);
                }
                this.method359(56);
                class3.method16(class210.field3585, class237.field3991, (byte) -102);
            }
        } catch (Exception var8) {
            class17.method100(var8, -14020, (String) null);
            this.method365(false, "crash");
        }
        this.method369(true, -128);
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V", line = 714)
    public static void method371(int arg0) {
        if (arg0 != 11420) {
            field803 = -29;
        }
        field814 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public abstract void method356(byte arg0);

    @OriginalMember(owner = "client!vb", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
    public abstract void method360(byte arg0);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public abstract void method362(int arg0);

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
    public abstract void method364(byte arg0);

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
    public abstract void method367(int arg0);
}
