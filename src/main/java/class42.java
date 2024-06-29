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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class42 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Z")
    private boolean field1034 = false;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[Lfd;")
    public static class39[] field1016 = new class39[4];

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lkc;")
    public static class67 field1018 = class19.method144(" )2> @yel@", 93);

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[I")
    public static int[] field1027 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Lkc;")
    public static class67 field1038 = class19.method144("scape main", 102);

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "Lkc;")
    public static class67 field1041 = class19.method144("Empf-=nger:", 115);

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Z")
    public static boolean field1043 = false;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field1049 = 0;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field1024 = 50;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "Lkc;")
    private static class67 field1048 = class19.method144("Unexpected server response", 119);

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Lkc;")
    public static class67 field1022 = field1048;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "Lkc;")
    public static class67 field1053 = class19.method144("blinken3:", 83);

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "La;")
    public static class1 field1029 = new class1();

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "Z")
    public static boolean field1062;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "[[B")
    public static byte[][] field1061;

    @OriginalMember(owner = "client!ga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 3)
    public final void windowDeiconified(WindowEvent arg0) {
        field1059++;
    }

    @OriginalMember(owner = "client!ga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 11)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1050++;
    }

    @OriginalMember(owner = "client!ga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 22)
    public final URL getDocumentBase() {
        field1056++;
        if (class18.field358 == null) {
            return class83.field1966 == null || class83.field1966.field314 == this ? super.getDocumentBase() : class83.field1966.field314.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 38)
    public final String getParameter(String arg0) {
        field1055++;
        if (class18.field358 == null) {
            return class83.field1966 == null || class83.field1966.field314 == this ? super.getParameter(arg0) : class83.field1966.field314.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 54)
    public final void windowActivated(WindowEvent arg0) {
        field1052++;
    }

    @OriginalMember(owner = "client!ga", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 62)
    public final URL getCodeBase() {
        field1044++;
        if (class18.field358 == null) {
            return class83.field1966 == null || class83.field1966.field314 == this ? super.getCodeBase() : class83.field1966.field314.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "destroy", descriptor = "()V", line = 78)
    public final void destroy() {
        field1057++;
        if (class84.field1977 == this && !class127.field2969) {
            class20.field399 = class82.method644(0);
            class84.method653(5000L, (byte) 124);
            class134.field3193 = null;
            this.method361(-113);
        }
    }

    @OriginalMember(owner = "client!ga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 93)
    public final synchronized void paint(Graphics arg0) {
        field1021++;
        if (class84.field1977 != this || class127.field2969) {
            return;
        }
        class130.field3045 = true;
        if (class15.field323 != null && class15.field323.startsWith("1.5") && class82.method644(0) - class108.field2448 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class65.field1522 && var2.height >= class49.field1176) {
                class32.field690 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 119)
    public final void windowDeactivated(WindowEvent arg0) {
        field1014++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 127)
    public static final void method357(int arg0) {
        field1058++;
        if (arg0 != 28210) {
            field1018 = null;
        }
        class114.field2687.method939((byte) -53);
    }

    @OriginalMember(owner = "client!ga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 139)
    public final void windowOpened(WindowEvent arg0) {
        field1031++;
    }

    @OriginalMember(owner = "client!ga", name = "providesignlink", descriptor = "(Lc;)V", line = 146)
    public static final void providesignlink(class15 arg0) {
        field1042++;
        class83.field1966 = arg0;
        class134.field3193 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V", line = 154)
    public final void method358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1035++;
        try {
            if (class84.field1977 == null) {
                class127.field2977 = arg4;
                if (arg2 > -81) {
                    this.method363((byte) 14);
                }
                class49.field1176 = arg1;
                class65.field1522 = arg3;
                class84.field1977 = this;
                if (class83.field1966 == null) {
                    class134.field3193 = class83.field1966 = new class15(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
                }
                class83.field1966.method130(1, this, -10870);
            } else {
                class82.field1949++;
                if (class82.field1949 >= 3) {
                    this.method366("alreadyloaded", (byte) -71);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var7) {
            class109.method832(84, var7, null);
            this.method366("crash", (byte) -76);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLjava/lang/String;IIIILjava/net/InetAddress;I)V", line = 193)
    public final void method359(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, InetAddress arg6, int arg7) {
        field1060++;
        try {
            class84.field1977 = this;
            class49.field1176 = arg3;
            class127.field2977 = arg4;
            class65.field1522 = arg7;
            class18.field358 = new Frame();
            class18.field358.setTitle("Jagex");
            class18.field358.setResizable(arg0);
            class18.field358.addWindowListener(this);
            class18.field358.setVisible(true);
            class18.field358.toFront();
            Insets var9 = class18.field358.getInsets();
            class18.field358.setSize(var9.left + arg7 + var9.right, arg3 - -var9.bottom + var9.top);
            class134.field3193 = class83.field1966 = new class15(true, null, arg6, arg2, arg1, arg5);
            class83.field1966.method130(1, this, -10870);
        } catch (Exception var11) {
            class109.method832(67, var11, null);
        }
    }

    @OriginalMember(owner = "client!ga", name = "stop", descriptor = "()V", line = 221)
    public final void stop() {
        field1037++;
        if (class84.field1977 == this && !class127.field2969) {
            class20.field399 = class82.method644(0) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 234)
    public final AppletContext getAppletContext() {
        field1028++;
        if (class18.field358 == null) {
            return class83.field1966 == null || class83.field1966.field314 == this ? super.getAppletContext() : class83.field1966.field314.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 250)
    public final synchronized void method360(int arg0) {
        field1040++;
        Container var2;
        if (class18.field358 == null) {
            var2 = class83.field1966.field314;
        } else {
            var2 = class18.field358;
        }
        if (class129.field3020 != null) {
            class129.field3020.removeFocusListener(this);
            var2.remove(class129.field3020);
        }
        class129.field3020 = new class126(this);
        var2.add(class129.field3020);
        class129.field3020.setSize(class65.field1522, class49.field1176);
        class129.field3020.setVisible(true);
        if (class18.field358 == null) {
            class129.field3020.setLocation(0, 0);
        } else {
            Insets var3 = class18.field358.getInsets();
            class129.field3020.setLocation(var3.left, var3.top);
        }
        class129.field3020.addFocusListener(this);
        class129.field3020.requestFocus();
        if (arg0 != 0) {
            field1041 = null;
        }
        class130.field3045 = true;
        class32.field690 = false;
        class108.field2448 = class82.method644(0);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 297)
    private final synchronized void method361(int arg0) {
        field1030++;
        if (class127.field2969) {
            return;
        }
        class127.field2969 = true;
        try {
            class129.field3020.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method171((byte) 100);
        } catch (Exception var4) {
        }
        if (class18.field358 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (arg0 >= -16) {
            this.method362((byte) 22);
        }
        if (class83.field1966 != null) {
            try {
                class83.field1966.method124((byte) -101);
            } catch (Exception var2) {
            }
        }
        this.method176((byte) 79);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 346)
    private final void method362(byte arg0) {
        field1026++;
        long var2 = class82.method644(arg0 ^ 0xFFFFFFBA);
        long var4 = class31.field669[class38.field873];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class31.field669[class38.field873] = var2;
        class38.field873 = class38.field873 + 1 & 0x1F;
        synchronized (this) {
            class125.field2920 = class126.field2951;
            if (arg0 != -70) {
                this.windowActivated(null);
            }
        }
        this.method167((byte) 123);
    }

    @OriginalMember(owner = "client!ga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 376)
    public final void windowIconified(WindowEvent arg0) {
        field1046++;
    }

    @OriginalMember(owner = "client!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 383)
    public final void focusLost(FocusEvent arg0) {
        class126.field2951 = false;
        field1032++;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)Z", line = 397)
    public final boolean method363(byte arg0) {
        field1015++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        int var3 = 81 / ((59 - arg0) / 53);
        if (var2.endsWith("jagex.com")) {
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
                this.method366("invalidhost", (byte) -81);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V", line = 430)
    public static final void method364(int arg0) {
        field1051++;
        class135.field3228.method939((byte) -53);
        client.field464.method20(0, 0);
        if (arg0 <= -97) {
            class135.field3233 = class105.method799(class135.field3233);
        }
    }

    @OriginalMember(owner = "client!ga", name = "start", descriptor = "()V", line = 445)
    public final void start() {
        field1033++;
        if (class84.field1977 == this && !class127.field2969) {
            class20.field399 = 0L;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z", line = 462)
    public static final boolean method365(int arg0, int arg1) {
        field1023++;
        if (class121.field2858[arg1]) {
            return true;
        } else if (class111.field2549.method29(0, arg1)) {
            int var2 = class111.field2549.method45(-114, arg1);
            if (var2 == 0) {
                class121.field2858[arg1] = true;
                return true;
            }
            if (class54.field1305[arg1] == null) {
                class54.field1305[arg1] = new class33[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class54.field1305[arg1][var3] == null) {
                    byte[] var4 = class111.field2549.method27(var3, true, arg1);
                    if (var4 != null) {
                        class54.field1305[arg1][var3] = new class33();
                        class54.field1305[arg1][var3].field740 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class54.field1305[arg1][var3].method279(-73, new class140(var4));
                        } else {
                            class54.field1305[arg1][var3].method287(new class140(var4), (byte) 112);
                        }
                    }
                }
            }
            class121.field2858[arg1] = true;
            if (arg0 < 73) {
                field1022 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 520)
    public final void method366(String arg0, byte arg1) {
        if (arg1 > -64) {
            field1041 = null;
        }
        field1020++;
        if (this.field1034) {
            return;
        }
        this.field1034 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ga", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 541)
    public final void update(Graphics arg0) {
        field1012++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ga", name = "run", descriptor = "()V", line = 555)
    public final void run() {
        field1017++;
        try {
            if (class15.field325 != null) {
                String var1 = class15.field325.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class15.field323;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method366("wrongjava", (byte) -101);
                        return;
                    }
                    class48.field1151 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class15.field323 == null || class15.field323.equals("1.4.2"))) {
                    this.method366("wrongjava", (byte) -95);
                    return;
                }
            }
            if (class83.field1966.field314 != null) {
                Method var3 = class15.field315;
                if (var3 != null) {
                    try {
                        var3.invoke(class83.field1966.field314, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method360(0);
            class81.field1940 = class49.method401((byte) -16, class65.field1522, class49.field1176, class129.field3020);
            this.method165(-1);
            class83.field1963 = class121.method947(false);
            class83.field1963.method432((byte) -92);
            while (class20.field399 == 0L || class20.field399 > class82.method644(0)) {
                class82.field1955 = class83.field1963.method431(-271, class78.field1859, class48.field1151);
                for (int var4 = 0; var4 < class82.field1955; var4++) {
                    this.method362((byte) -70);
                }
                this.method367(-75);
            }
        } catch (Exception var7) {
            class109.method832(112, var7, null);
            this.method366("crash", (byte) -116);
        }
        this.method361(-24);
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V", line = 636)
    private final void method367(int arg0) {
        field1013++;
        long var2 = class82.method644(0);
        long var4 = class80.field1907[class106.field2430];
        class80.field1907[class106.field2430] = var2;
        class106.field2430 = class106.field2430 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class4.field86 = ((var6 >> 1) + 32000) / var6;
        }
        if (class128.field3004++ > 50) {
            class128.field3004 -= 50;
            class130.field3045 = true;
            class129.field3020.setSize(class65.field1522, class49.field1176);
            class129.field3020.setVisible(true);
            if (class18.field358 == null) {
                class129.field3020.setLocation(0, 0);
            } else {
                Insets var7 = class18.field358.getInsets();
                class129.field3020.setLocation(var7.left, var7.top);
            }
        }
        this.method169(0);
        if (arg0 >= -52) {
            this.windowDeactivated(null);
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V", line = 691)
    public static final void method368(int arg0) {
        class45.field1105 = false;
        int var1 = 105 / ((arg0 + 18) / 62);
        field1025++;
        class113.field2616 = false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILqc;II)V", line = 708)
    public static final void method369(int arg0, int arg1, class103 arg2, int arg3, int arg4) {
        if (arg0 != -27697) {
            method365(5, -55);
        }
        field1045++;
        if (class69.field1640 == arg2 || class55.field1323 >= 400) {
            return;
        }
        class67 var5;
        if (arg2.field2304 == 0) {
            var5 = class63.method479(new class67[] { arg2.field2329, class20.method157((byte) 93, arg2.field2320, class69.field1640.field2320), class138.field3301, class7.field177, class71.method586(arg0 + 27800, arg2.field2320), class18.field354 }, 0);
        } else {
            var5 = class63.method479(new class67[] { arg2.field2329, class138.field3301, class49.field1178, class71.method586(arg0 ^ 0xFFFF93A8, arg2.field2304), class18.field354 }, 0);
        }
        if (class25.field535 == 1) {
            class29.field605++;
            class44.method379(13, arg4, arg1, class63.method479(new class67[] { class96.field2168, class141.field3399, var5 }, 0), arg3, class34.field832, (byte) 106);
        } else if (!class70.field1674) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class58.field1372[var6] != null) {
                    class101.field2277++;
                    int var7 = 0;
                    short var8 = 0;
                    if (class58.field1372[var6].method535(class4.field59, (byte) 119)) {
                        if (arg2.field2320 > class69.field1640.field2320) {
                            var8 = 2000;
                        }
                        if (class69.field1640.field2303 != 0 && arg2.field2303 != 0) {
                            if (class69.field1640.field2303 == arg2.field2303) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class82.field1960[var6]) {
                        var8 = 2000;
                    }
                    if (var6 == 0) {
                        var7 = var8 + 32;
                    }
                    if (var6 == 1) {
                        var7 = var8 + 7;
                    }
                    if (var6 == 2) {
                        var7 = var8 + 17;
                    }
                    if (var6 == 3) {
                        var7 = var8 + 36;
                    }
                    if (var6 == 4) {
                        var7 = var8 + 42;
                    }
                    class44.method379(var7, arg4, arg1, class63.method479(new class67[] { class46.field1120, var5 }, arg0 ^ 0xFFFF93CF), arg3, class58.field1372[var6], (byte) 45);
                }
            }
        } else if ((class106.field2423 & 0x8) == 8) {
            class93.field2130++;
            class44.method379(41, arg4, arg1, class63.method479(new class67[] { class90.field2068, class141.field3399, var5 }, 0), arg3, class69.field1652, (byte) 72);
        }
        for (int var9 = 0; var9 < class55.field1323; var9++) {
            if (class69.field1650[var9] == 18) {
                class109.field2471[var9] = class63.method479(new class67[] { class30.field636, class108.field2447, class46.field1120, var5 }, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 848)
    public final void windowClosed(WindowEvent arg0) {
        field1039++;
    }

    @OriginalMember(owner = "client!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 855)
    public final void focusGained(FocusEvent arg0) {
        class126.field2951 = true;
        field1047++;
        class130.field3045 = true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V", line = 864)
    public static void method370(boolean arg0) {
        field1027 = null;
        field1041 = null;
        field1029 = null;
        field1016 = null;
        field1038 = null;
        field1048 = null;
        if (arg0) {
            field1061 = null;
            field1018 = null;
            field1053 = null;
            field1022 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public abstract void method171(byte arg0);

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
    public abstract void method176(byte arg0);

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    public abstract void method169(int arg0);

    @OriginalMember(owner = "client!ga", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)V")
    public abstract void method167(byte arg0);

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
    public abstract void method165(int arg0);
}
