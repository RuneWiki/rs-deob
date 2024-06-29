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

@OriginalClass("client!ld")
public abstract class class274 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Z")
    private boolean field4495 = false;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field4484 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lok;")
    public static class41 field4466 = class137.method956("<br>", 45);

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lok;")
    public static class41 field4493 = class137.method956(" ", 45);

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "Lok;")
    public static class41 field4496 = class137.method956("Hierhin gehen", 45);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "Z")
    public static boolean field4502;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "Z")
    public static boolean field4503;

    @OriginalMember(owner = "client!ld", name = "run", descriptor = "()V", line = 7)
    public final void run() {
        field4499++;
        try {
            if (class211.field3399 != null) {
                String var1 = class211.field3399.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class211.field3394;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1938("wrongjava", (byte) -127);
                        return;
                    }
                    class30.field436 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class211.field3394 == null || class211.field3394.equals("1.4.2"))) {
                    this.method1938("wrongjava", (byte) 109);
                    return;
                }
            }
            if (class211.field3394 != null && class211.field3394.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class211.field3394.length()) {
                    char var5 = class211.field3394.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class41.field626 = true;
                }
            }
            if (class138.field2065.field3390 != null) {
                Method var6 = class211.field3402;
                if (var6 != null) {
                    try {
                        var6.invoke(class138.field2065.field3390, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method1951((byte) 125);
            class217.field3485 = class213.method1509(class188.field3055, class283.field4602, 0, class14.field182);
            this.method1950(20972);
            class203.field3281 = class305.method2099(35);
            while (class86.field1251 == 0L || class86.field1251 > class247.method1762(19166)) {
                class301.field4879 = class203.field3281.method489(class117.field1705, class30.field436, -69);
                for (int var8 = 0; var8 < class301.field4879; var8++) {
                    this.method1936(101);
                }
                this.method1933((byte) 23);
                class28.method185(class283.field4602, class138.field2065, (byte) 96);
            }
        } catch (Exception var11) {
            class104.method719((String) null, var11, false);
            this.method1938("crash", (byte) 79);
        }
        this.method1946(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 116)
    private final void method1933(byte arg0) {
        field4482++;
        long var2 = class247.method1762(19166);
        long var4 = class175.field2842[class68.field1028];
        class175.field2842[class68.field1028] = var2;
        class68.field1028 = class68.field1028 + 1 & 0x1F;
        if (arg0 != 23) {
            return;
        }
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class186.field3043 = ((var6 >> 1) + 32000) / var6;
        }
        if (class125.field1868++ > 50) {
            class101.field1437 = true;
            class125.field1868 -= 50;
            class283.field4602.setSize(class188.field3055, class14.field182);
            class283.field4602.setVisible(true);
            if (class238.field3817 != null && class55.field803 == null) {
                Insets var7 = class238.field3817.getInsets();
                class283.field4602.setLocation(class144.field2195 + var7.left, class60.field871 + var7.top);
            } else {
                class283.field4602.setLocation(class144.field2195, class60.field871);
            }
        }
        this.method1949(false);
    }

    @OriginalMember(owner = "client!ld", name = "start", descriptor = "()V", line = 157)
    public final void start() {
        field4480++;
        if (class30.field443 == this && !class177.field2880) {
            class86.field1251 = 0L;
        }
    }

    @OriginalMember(owner = "client!ld", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 168)
    public final void windowClosed(WindowEvent arg0) {
        field4475++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIB)V", line = 177)
    public static final void method1934(int arg0, int arg1, byte arg2) {
        int var3 = -99 % ((arg2 + 70) / 37);
        if (arg0 == 4 && !class27.field393) {
            arg1 = 2;
            arg0 = 2;
        }
        field4491++;
        if (class208.field3368 != arg0) {
            if (class226.field3610) {
                return;
            }
            if (class208.field3368 != 0) {
                class109.field1530[class208.field3368].method152();
            }
            if (arg0 != 0) {
                class99 var4 = class109.field1530[arg0];
                var4.method150();
                var4.method155(arg1);
            }
            class208.field3368 = arg0;
            class218.field3490 = arg1;
        } else if (arg0 != 0 && class218.field3490 != arg1) {
            class109.field1530[arg0].method155(arg1);
            class218.field3490 = arg1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 223)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4472++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILwb;Lmh;Lmh;Z)V", line = 235)
    public static final void method1935(int arg0, class82 arg1, class65 arg2, class65 arg3, boolean arg4) {
        field4489++;
        class26.field385 = arg3;
        class317.field5364 = arg4;
        class5.field60 = arg2;
        int var5 = class5.field60.method477((byte) 126) - 1;
        class213.field3435 = class5.field60.method481(arg0 ^ 0xFFFF8563, var5) + var5 * 256;
        class289.field4695 = arg1;
        if (arg0 != -14718) {
            method1939(-68);
        }
    }

    @OriginalMember(owner = "client!ld", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 255)
    public final AppletContext getAppletContext() {
        field4465++;
        if (class238.field3817 == null) {
            return class138.field2065 == null || class138.field2065.field3390 == this ? super.getAppletContext() : class138.field2065.field3390.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "stop", descriptor = "()V", line = 271)
    public final void stop() {
        field4494++;
        if (class30.field443 == this && !class177.field2880) {
            class86.field1251 = class247.method1762(19166) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 283)
    private final void method1936(int arg0) {
        long var2 = class247.method1762(19166);
        field4500++;
        long var4 = class43.field687[class164.field2604];
        class43.field687[class164.field2604] = var2;
        int var6 = -85 / ((arg0 - 22) / 45);
        class164.field2604 = class164.field2604 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
        }
        synchronized (this) {
            class301.field4880 = class124.field1838;
        }
        this.method1947(110);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V", line = 310)
    public final void method1937(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4485++;
        try {
            if (class30.field443 != null) {
                class38.field588++;
                if (class38.field588 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1938("alreadyloaded", (byte) -104);
                return;
            }
            class144.field2195 = 0;
            class188.field3055 = arg1;
            class3.field39 = arg1;
            class69.field1042 = arg2;
            if (arg4 > -31) {
                this.field4495 = true;
            }
            class60.field871 = 0;
            class30.field443 = this;
            class14.field182 = arg3;
            class98.field1434 = arg3;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class153.field2447 = true;
            } else {
                class153.field2447 = false;
            }
            if (class138.field2065 == null) {
                class27.field397 = class138.field2065 = new class211(this, arg0, (String) null, 0);
            }
            class182 var7 = class138.field2065.method1479(this, 85, 1);
            while (var7.field2948 == 0) {
                class300.method2068(125, 10L);
            }
            class164.field2603 = (Thread) var7.field2945;
        } catch (Exception var9) {
            class104.method719((String) null, var9, false);
            this.method1938("crash", (byte) -93);
        }
    }

    @OriginalMember(owner = "client!ld", name = "destroy", descriptor = "()V", line = 365)
    public final void destroy() {
        field4469++;
        if (class30.field443 == this && !class177.field2880) {
            class86.field1251 = class247.method1762(19166);
            class300.method2068(125, 5000L);
            class27.field397 = null;
            this.method1946(0, false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 382)
    public final void method1938(String arg0, byte arg1) {
        field4463++;
        int var3 = 50 / ((-arg1 - 11) / 58);
        if (this.field4495) {
            return;
        }
        this.field4495 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 404)
    public static final void method1939(int arg0) {
        field4492++;
        class65.field997 = 0;
        class85.field1239 = 0;
        class59.method416((byte) -91);
        class307.method2138(1);
        class13.method59(false);
        class180.method1294(0);
        for (int var1 = 0; var1 < class65.field997; var1++) {
            int var2 = class239.field3834[var1];
            if (class18.field234 != class246.field3955[var2].field4294) {
                if (class246.field3955[var2].field3903 > 0) {
                    class119.method853(class246.field3955[var2], (byte) -65);
                }
                class246.field3955[var2] = null;
            }
        }
        if (class1.field7 != class164.field2597.field1640) {
            throw new RuntimeException("gpp1 pos:" + class164.field2597.field1640 + " psize:" + class1.field7);
        }
        for (int var3 = 0; var3 < class85.field1248; var3++) {
            if (class246.field3955[class118.field1737[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class85.field1248);
            }
        }
        int var4 = 28 / ((arg0 + 39) / 47);
    }

    @OriginalMember(owner = "client!ld", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 460)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4486++;
    }

    @OriginalMember(owner = "client!ld", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 468)
    public final void windowActivated(WindowEvent arg0) {
        field4497++;
    }

    @OriginalMember(owner = "client!ld", name = "providesignlink", descriptor = "(Lag;)V", line = 477)
    public static final void providesignlink(class211 arg0) {
        class138.field2065 = arg0;
        class27.field397 = arg0;
        field4467++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)I", line = 498)
    public static final int method1942(byte arg0, int arg1) {
        field4476++;
        if (arg1 < 0) {
            return 0;
        } else if (arg0 == -92) {
            class306 var2 = (class306) class186.field3031.method617((long) arg1, false);
            if (var2 == null) {
                return class149.method1033((byte) 0, arg1).field1950;
            }
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field5125.length; var4++) {
                if (var2.field5125[var4] == -1) {
                    var3++;
                }
            }
            return var3 + class149.method1033((byte) 0, arg1).field1950 - var2.field5125.length;
        } else {
            return 107;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZII)V", line = 535)
    public static final void method1943(int arg0, boolean arg1, int arg2, int arg3) {
        field4481++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg3 != -58) {
            field4466 = (class41) null;
        }
        class213.field3430 = arg2;
        class112.field1656 = arg1;
        class202.field3240 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 553)
    public final void windowOpened(WindowEvent arg0) {
        field4479++;
    }

    @OriginalMember(owner = "client!ld", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 569)
    public final void windowDeactivated(WindowEvent arg0) {
        field4487++;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 578)
    public static void method1944(int arg0) {
        if (arg0 == 0) {
            field4466 = null;
            field4496 = null;
            field4493 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 590)
    public final void windowIconified(WindowEvent arg0) {
        field4477++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 603)
    public final void method1945(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field4470++;
        try {
            class69.field1042 = arg0;
            class188.field3055 = arg4;
            class3.field39 = arg4;
            class144.field2195 = 0;
            class60.field871 = arg3;
            class30.field443 = this;
            class14.field182 = arg1;
            class98.field1434 = arg1;
            class238.field3817 = new Frame();
            class238.field3817.setTitle("Jagex");
            class238.field3817.setResizable(true);
            class238.field3817.addWindowListener(this);
            class238.field3817.setVisible(true);
            class238.field3817.toFront();
            Insets var8 = class238.field3817.getInsets();
            class238.field3817.setSize(class3.field39 + var8.left + var8.right, class98.field1434 - (-var8.top - var8.bottom));
            class27.field397 = class138.field2065 = new class211((Applet) null, arg5, arg2, arg6);
            class182 var9 = class138.field2065.method1479(this, 93, 1);
            while (var9.field2948 == 0) {
                class300.method2068(arg3 + 127, 10L);
            }
            class164.field2603 = (Thread) var9.field2945;
        } catch (Exception var11) {
            class104.method719((String) null, var11, false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 640)
    public final void focusLost(FocusEvent arg0) {
        field4474++;
        class124.field1838 = false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V", line = 648)
    private final void method1946(int arg0, boolean arg1) {
        field4490++;
        synchronized (this) {
            if (arg0 != 0) {
                this.field4495 = true;
            }
            if (class177.field2880) {
                return;
            }
            class177.field2880 = true;
        }
        if (class138.field2065.field3390 != null) {
            class138.field2065.field3390.destroy();
        }
        try {
            this.method1941((byte) 101);
        } catch (Exception var12) {
        }
        if (class283.field4602 != null) {
            try {
                class283.field4602.removeFocusListener(this);
                class283.field4602.getParent().remove(class283.field4602);
            } catch (Exception var11) {
            }
        }
        if (class138.field2065 != null) {
            try {
                class138.field2065.method1481(108);
            } catch (Exception var10) {
            }
        }
        this.method1940(31280);
        if (class238.field3817 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ld", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 713)
    public final URL getCodeBase() {
        field4498++;
        if (class238.field3817 == null) {
            return class138.field2065 == null || class138.field2065.field3390 == this ? super.getCodeBase() : class138.field2065.field3390.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 727)
    public final String getParameter(String arg0) {
        field4483++;
        if (class238.field3817 == null) {
            return class138.field2065 == null || class138.field2065.field3390 == this ? super.getParameter(arg0) : class138.field2065.field3390.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 745)
    public final void focusGained(FocusEvent arg0) {
        class124.field1838 = true;
        field4478++;
        class101.field1437 = true;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)Z", line = 762)
    public final boolean method1948(boolean arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field4501++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (!arg0) {
                this.method1936(-30);
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
                this.method1938("invalidhost", (byte) 97);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 799)
    public final synchronized void paint(Graphics arg0) {
        field4464++;
        if (class30.field443 != this || class177.field2880) {
            return;
        }
        class101.field1437 = true;
        if (class41.field626 && !class166.field2625 && (class247.method1762(19166) - class156.field2475) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class3.field39 && class98.field1434 <= var2.height) {
                class85.field1224 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 821)
    public final URL getDocumentBase() {
        field4473++;
        if (class238.field3817 == null) {
            return class138.field2065 == null || class138.field2065.field3390 == this ? super.getDocumentBase() : class138.field2065.field3390.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 839)
    public final void windowDeiconified(WindowEvent arg0) {
        field4488++;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V", line = 851)
    public final synchronized void method1951(byte arg0) {
        if (class283.field4602 != null) {
            class283.field4602.removeFocusListener(this);
            class283.field4602.getParent().remove(class283.field4602);
        }
        Container var2;
        if (class55.field803 != null) {
            var2 = class55.field803;
        } else if (class238.field3817 == null) {
            var2 = class138.field2065.field3390;
        } else {
            var2 = class238.field3817;
        }
        field4471++;
        var2.setLayout((LayoutManager) null);
        class283.field4602 = new class15(this);
        var2.add(class283.field4602);
        class283.field4602.setSize(class188.field3055, class14.field182);
        class283.field4602.setVisible(true);
        if (class238.field3817 == var2) {
            Insets var3 = class238.field3817.getInsets();
            class283.field4602.setLocation(var3.left + class144.field2195, class60.field871 + var3.top);
        } else {
            class283.field4602.setLocation(class144.field2195, class60.field871);
        }
        class283.field4602.addFocusListener(this);
        class283.field4602.requestFocus();
        class124.field1838 = true;
        class101.field1437 = true;
        class85.field1224 = false;
        class301.field4880 = true;
        if (arg0 <= 86) {
            field4484 = 17;
        }
        class156.field2475 = class247.method1762(19166);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public abstract void method1940(int arg0);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public abstract void method1941(byte arg0);

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
    public abstract void method1947(int arg0);

    @OriginalMember(owner = "client!ld", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
    public abstract void method1949(boolean arg0);

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
    public abstract void method1950(int arg0);
}
