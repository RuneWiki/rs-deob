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

@OriginalClass("client!h")
public abstract class class49 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Z")
    private boolean field1118 = false;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Ltd;")
    public static class136 field1117 = class145.method1172("sl_flags", 45);

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Ltd;")
    public static class136 field1126 = null;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Ldb;")
    public static class24 field1093;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Lmd;")
    public static class87 field1128;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Z")
    public static boolean field1133;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public abstract void method172(int arg0);

    @OriginalMember(owner = "client!h", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1121++;
    }

    @OriginalMember(owner = "client!h", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1129++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public abstract void method173(byte arg0);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    private final void method409(int arg0) {
        field1130++;
        long var2 = class27.method233((byte) 127);
        long var4 = class93.field2198[class152.field3480];
        class93.field2198[class152.field3480] = var2;
        class152.field3480 = class152.field3480 + arg0 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class40.field938 = ((var6 >> 1) + 32000) / var6;
        }
        if (class3.field62++ > 50) {
            class12.field224 = true;
            class3.field62 -= 50;
            class14.field279.setSize(class91.field2160, class93.field2184);
            class14.field279.setVisible(true);
            if (class63.field1357 == null) {
                class14.field279.setLocation(0, 0);
            } else {
                Insets var7 = class63.field1357.getInsets();
                class14.field279.setLocation(var7.left, var7.top);
            }
        }
        this.method172(2);
    }

    @OriginalMember(owner = "client!h", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1132++;
        if (class104.field2476 != this || class71.field1507) {
            return;
        }
        class12.field224 = true;
        if (class22.field480 != null && class22.field480.startsWith("1.5") && class27.method233((byte) 104) - class39.field909 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class91.field2160 <= var2.width && var2.height >= class93.field2184) {
                class84.field1981 = true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    private final synchronized void method410(int arg0) {
        field1120++;
        if (class71.field1507) {
            return;
        }
        class71.field1507 = true;
        try {
            class14.field279.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method169(-103);
        } catch (Exception var4) {
        }
        if (class63.field1357 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class44.field1010 != null) {
            try {
                class44.field1010.method181(arg0 ^ 0xFFFFE082);
            } catch (Exception var2) {
            }
        }
        if (arg0 == -7982) {
            this.method173((byte) 104);
        }
    }

    @OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
    public final void run() {
        field1127++;
        try {
            if (class22.field472 != null) {
                String var1 = class22.field472.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class22.field480;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method418((byte) -53, "wrongjava");
                        return;
                    }
                    class80.field1837 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class22.field480 == null || class22.field480.equals("1.4.2"))) {
                    this.method418((byte) -53, "wrongjava");
                    return;
                }
            }
            if (class44.field1010.field476 != null) {
                Method var3 = class22.field478;
                if (var3 != null) {
                    try {
                        var3.invoke(class44.field1010.field476, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method420(0);
            class12.field219 = class27.method235(class14.field279, class93.field2184, class91.field2160, 1);
            this.method176((byte) -63);
            class19.field401 = class135.method1087((byte) 100);
            while (client.field458 == 0L || class27.method233((byte) 111) < client.field458) {
                class121.field2814 = class19.field401.method340(class80.field1837, class1.field5, false);
                for (int var4 = 0; var4 < class121.field2814; var4++) {
                    this.method412((byte) 95);
                }
                this.method409(1);
                class2.method17(class14.field279, class44.field1010, -1);
            }
        } catch (Exception var7) {
            class53.method433(var7, false, null);
            this.method418((byte) -53, "crash");
        }
        this.method410(-7982);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Z")
    public final boolean method411(boolean arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1119++;
        if (arg0) {
            return false;
        } else if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
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
                this.method418((byte) -53, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1123++;
        if (class63.field1357 == null) {
            return class44.field1010 == null || class44.field1010.field476 == this ? super.getDocumentBase() : class44.field1010.field476.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1095++;
    }

    @OriginalMember(owner = "client!h", name = "start", descriptor = "()V")
    public final void start() {
        field1098++;
        if (class104.field2476 == this && !class71.field1507) {
            client.field458 = 0L;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    private final void method412(byte arg0) {
        if (arg0 <= 69) {
            return;
        }
        field1104++;
        long var2 = class27.method233((byte) -37);
        long var4 = class63.field1353[class74.field1586];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class63.field1353[class74.field1586] = var2;
        class74.field1586 = class74.field1586 + 1 & 0x1F;
        synchronized (this) {
            class47.field1086 = class152.field3484;
        }
        this.method171(19110);
    }

    @OriginalMember(owner = "client!h", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1105++;
        if (class104.field2476 == this && !class71.field1507) {
            client.field458 = class27.method233((byte) 116);
            class9.method42(0, 5000L);
            class43.field992 = null;
            this.method410(-7982);
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public static void method413(int arg0) {
        if (arg0 < 88) {
            field1094 = -90;
        }
        field1117 = null;
        field1128 = null;
        field1093 = null;
        field1126 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public final void method414(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1101++;
        try {
            if (class104.field2476 == null) {
                class93.field2184 = arg0;
                class2.field29 = arg3;
                class91.field2160 = arg1;
                class104.field2476 = this;
                if (class44.field1010 == null) {
                    class43.field992 = class44.field1010 = new class22(false, this, arg2, null, 0);
                }
                if (arg4 < -10) {
                    class44.field1010.method185(0, this, 1);
                }
            } else {
                class153.field3492++;
                if (class153.field3492 >= 3) {
                    this.method418((byte) -53, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class53.method433(var7, false, null);
            this.method418((byte) -53, "crash");
        }
    }

    @OriginalMember(owner = "client!h", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1107++;
    }

    @OriginalMember(owner = "client!h", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1111++;
        if (class63.field1357 == null) {
            return class44.field1010 == null || class44.field1010.field476 == this ? super.getCodeBase() : class44.field1010.field476.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1109++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!h", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1097++;
        class152.field3484 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method415(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field1108++;
        try {
            class2.field29 = arg5;
            class91.field2160 = arg2;
            class93.field2184 = arg4;
            class104.field2476 = this;
            class63.field1357 = new Frame();
            class63.field1357.setTitle("Jagex");
            class63.field1357.setResizable(false);
            class63.field1357.addWindowListener(this);
            class63.field1357.setVisible(true);
            class63.field1357.toFront();
            Insets var8 = class63.field1357.getInsets();
            class63.field1357.setSize(var8.left + arg2 + var8.right, var8.top + var8.bottom + arg4);
            class43.field992 = class44.field1010 = new class22(true, null, arg0, arg3, arg6);
            class44.field1010.method185(arg1 ^ arg1, this, 1);
        } catch (Exception var10) {
            class53.method433(var10, false, null);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLpd;IZZII)V")
    public static final void method416(byte arg0, class108 arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field1103++;
        long var7 = (long) ((arg6 << 16) + arg5);
        class77 var9 = (class77) class80.field1870.method109(85, var7);
        if (var9 != null) {
            return;
        }
        class77 var10 = (class77) class128.field3085.method109(43, var7);
        if (!arg4) {
            method413(36);
        }
        if (var10 != null) {
            return;
        }
        class77 var11 = (class77) class41.field964.method109(96, var7);
        if (var11 == null) {
            if (!arg3) {
                class77 var12 = (class77) class13.field250.method109(35, var7);
                if (var12 != null) {
                    return;
                }
            }
            class77 var13 = new class77();
            var13.field1773 = arg0;
            var13.field1738 = arg2;
            var13.field1749 = arg1;
            if (arg3) {
                class80.field1870.method112(var13, (byte) 3, var7);
                class80.field1828++;
            } else {
                class54.field1199.method156(-30773, var13);
                class41.field964.method112(var13, (byte) 3, var7);
                class77.field1769++;
            }
        } else if (arg3) {
            var11.method1171(true);
            class80.field1870.method112(var11, (byte) 3, var7);
            class77.field1769--;
            class80.field1828++;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public abstract void method171(int arg0);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
    public abstract void method176(byte arg0);

    @OriginalMember(owner = "client!h", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!h", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1113++;
    }

    @OriginalMember(owner = "client!h", name = "stop", descriptor = "()V")
    public final void stop() {
        field1110++;
        if (class104.field2476 == this && !class71.field1507) {
            client.field458 = class27.method233((byte) 126) + 4000L;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)I")
    public static final int method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1112++;
        int var7 = arg5 & 0x3;
        if ((arg4 & arg3) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg6;
        } else {
            return 7 + 1 - arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!h", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1131++;
        if (class63.field1357 == null) {
            return class44.field1010 == null || class44.field1010.field476 == this ? super.getAppletContext() : class44.field1010.field476.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1102++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method418(byte arg0, String arg1) {
        field1099++;
        if (this.field1118) {
            return;
        }
        this.field1118 = true;
        if (arg0 != -53) {
            return;
        }
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)Z")
    public static final boolean method419(int arg0, byte arg1) {
        field1116++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            int var2 = -60 / ((arg1 + 81) / 44);
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
    public final synchronized void method420(int arg0) {
        Container var2;
        if (class63.field1357 == null) {
            var2 = class44.field1010.field476;
        } else {
            var2 = class63.field1357;
        }
        field1122++;
        if (arg0 != 0) {
            this.getDocumentBase();
        }
        if (class14.field279 != null) {
            class14.field279.removeFocusListener(this);
            var2.remove(class14.field279);
        }
        class14.field279 = new class4(this);
        var2.add(class14.field279);
        class14.field279.setSize(class91.field2160, class93.field2184);
        class14.field279.setVisible(true);
        if (class63.field1357 == null) {
            class14.field279.setLocation(0, 0);
        } else {
            Insets var3 = class63.field1357.getInsets();
            class14.field279.setLocation(var3.left, var3.top);
        }
        class14.field279.addFocusListener(this);
        class14.field279.requestFocus();
        class12.field224 = true;
        class84.field1981 = false;
        class39.field909 = class27.method233((byte) 121);
    }

    @OriginalMember(owner = "client!h", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1114++;
    }

    @OriginalMember(owner = "client!h", name = "providesignlink", descriptor = "(Ld;)V")
    public static final void providesignlink(class22 arg0) {
        field1106++;
        class44.field1010 = arg0;
        class43.field992 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public abstract void method169(int arg0);

    @OriginalMember(owner = "client!h", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class152.field3484 = true;
        field1100++;
        class12.field224 = true;
    }

    @OriginalMember(owner = "client!h", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1096++;
        if (class63.field1357 == null) {
            return class44.field1010 == null || class44.field1010.field476 == this ? super.getParameter(arg0) : class44.field1010.field476.getParameter(arg0);
        } else {
            return null;
        }
    }
}
