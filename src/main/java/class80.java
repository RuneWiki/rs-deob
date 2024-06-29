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

@OriginalClass("client!vl")
public abstract class class80 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Z")
    private boolean field1527 = false;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Z")
    public static boolean field1525 = true;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "[J")
    public static long[] field1556 = new long[32];

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "Lth;")
    public static class86 field1537;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "Z")
    public static boolean field1557;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "Z")
    public static boolean field1558;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([I[ILqb;[II)V", line = 9)
    public static final void method662(int[] arg0, int[] arg1, class102 arg2, int[] arg3, int arg4) {
        field1534++;
        int var5 = 69 / ((arg4 - 28) / 57);
        for (int var6 = 0; var6 < arg1.length; var6++) {
            int var7 = arg1[var6];
            int var8 = arg0[var6];
            int var9 = arg3[var6];
            for (int var10 = 0; var8 != 0 && arg2.field87.length > var10; var10++) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg2.field87[var10] = null;
                    } else {
                        class182 var11 = class131.method1033((byte) -82, var7);
                        int var12 = var11.field3317;
                        class266 var13 = arg2.field87[var10];
                        if (var13 != null) {
                            if (var13.field4783 == var7) {
                                if (var12 == 0) {
                                    var13 = arg2.field87[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field4791 = var9;
                                    var13.field4796 = 0;
                                    var13.field4787 = 1;
                                    var13.field4793 = 0;
                                    var13.field4789 = 0;
                                    class194.method1460(false, arg2.field86, 0, var11, arg2.field79, (byte) 100);
                                } else if (var12 == 2) {
                                    var13.field4793 = 0;
                                }
                            } else if (var11.field3321 >= class131.method1033((byte) -82, var13.field4783).field3321) {
                                var13 = arg2.field87[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class266 var14 = arg2.field87[var10] = new class266();
                            var14.field4783 = var7;
                            var14.field4789 = 0;
                            var14.field4796 = 0;
                            var14.field4791 = var9;
                            var14.field4787 = 1;
                            var14.field4793 = 0;
                            class194.method1460(false, arg2.field86, 0, var11, arg2.field79, (byte) 103);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 103)
    public final String getParameter(String arg0) {
        field1530++;
        if (class5.field115 == null) {
            return class110.field2022 == null || class110.field2022.field5418 == this ? super.getParameter(arg0) : class110.field2022.field5418.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIZIILjava/lang/String;)V", line = 122)
    public final void method663(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, String arg7) {
        try {
            class178.field3227 = this;
            class221.field3899 = arg3;
            class113.field2082 = arg3;
            class252.field4496 = 0;
            class176.field3150 = arg2;
            class105.field1985 = arg2;
            class52.field1091 = arg5;
            class90.field1703 = arg1;
            class5.field115 = new Frame();
            class5.field115.setTitle("Jagex");
            class5.field115.setResizable(true);
            class5.field115.addWindowListener(this);
            class5.field115.setVisible(true);
            class5.field115.toFront();
            Insets var9 = class5.field115.getInsets();
            class5.field115.setSize(class113.field2082 + var9.left + var9.right, class105.field1985 + var9.bottom + var9.top);
            class77.field1492 = class110.field2022 = new class305((Applet) null, arg0, arg7, arg6);
            class206 var10 = class110.field2022.method2163(this, 1, 7159);
            while (var10.field3655 == 0) {
                class204.method1510(10L, 1);
            }
            class236.field4115 = (Thread) var10.field3657;
        } catch (Exception var12) {
            class94.method792(var12, (byte) -115, (String) null);
        }
        field1533++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 162)
    private final void method664(int arg0) {
        field1541++;
        long var2 = class249.field4448[class239.field4188];
        long var4 = class127.method1015(21504);
        class249.field4448[class239.field4188] = var4;
        if (var2 != 0L && var4 > var2) {
        }
        class239.field4188 = class239.field4188 + 1 & 0x1F;
        synchronized (this) {
            class149.field2727 = class13.field410;
            if (arg0 != 0) {
                field1536 = -96;
            }
        }
        this.method677((byte) -57);
    }

    @OriginalMember(owner = "client!vl", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 195)
    public final AppletContext getAppletContext() {
        field1550++;
        if (class5.field115 == null) {
            return class110.field2022 == null || class110.field2022.field5418 == this ? super.getAppletContext() : class110.field2022.field5418.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 213)
    public final URL getDocumentBase() {
        field1539++;
        if (class5.field115 == null) {
            return class110.field2022 == null || class110.field2022.field5418 == this ? super.getDocumentBase() : class110.field2022.field5418.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 228)
    public final void focusGained(FocusEvent arg0) {
        field1532++;
        class13.field410 = true;
        class52.field1097 = true;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILud;)V", line = 238)
    public static final void method666(int arg0, class279 arg1) {
        class159.field2894 = arg1;
        field1554++;
        if (class110.field2022.field5418 == null) {
            return;
        }
        try {
            class279 var2 = class286.field5094.method1972((byte) -125, class110.field2022.field5418);
            class279 var3 = class157.field2852.method1972((byte) -125, class110.field2022.field5418);
            class279 var4 = class115.method929(new class279[] { var2, class59.field1236, arg1, class131.field2401, var3 }, (byte) 60);
            class279 var5;
            if (arg0 == ~arg1.method1984(8)) {
                var5 = class115.method929(new class279[] { var4, class71.field1402 }, (byte) 60);
            } else {
                var5 = class115.method929(new class279[] { var4, class99.field1855, class165.method1286(class127.method1015(21504) + 94608000000L, 103), class103.field1936, class254.method1816(true, 94608000L) }, (byte) 60);
            }
            class115.method929(new class279[] { class271.field4838, var5, class18.field553 }, (byte) 60).method1975(11386, class110.field2022.field5418);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!vl", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 271)
    public final void windowIconified(WindowEvent arg0) {
        field1528++;
    }

    @OriginalMember(owner = "client!vl", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 282)
    public final void windowClosed(WindowEvent arg0) {
        field1540++;
    }

    @OriginalMember(owner = "client!vl", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 289)
    public final URL getCodeBase() {
        field1538++;
        if (class5.field115 == null) {
            return class110.field2022 == null || class110.field2022.field5418 == this ? super.getCodeBase() : class110.field2022.field5418.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 304)
    public final void windowOpened(WindowEvent arg0) {
        field1531++;
    }

    @OriginalMember(owner = "client!vl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 311)
    public final void focusLost(FocusEvent arg0) {
        field1522++;
        class13.field410 = false;
    }

    @OriginalMember(owner = "client!vl", name = "providesignlink", descriptor = "(Lbd;)V", line = 321)
    public static final void providesignlink(class305 arg0) {
        field1535++;
        class110.field2022 = arg0;
        class77.field1492 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 331)
    public final void update(Graphics arg0) {
        field1548++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZB)V", line = 340)
    private final void method667(boolean arg0, byte arg1) {
        field1542++;
        synchronized (this) {
            if (class102.field1899) {
                return;
            }
            class102.field1899 = true;
        }
        if (class110.field2022.field5418 != null) {
            class110.field2022.field5418.destroy();
        }
        try {
            this.method665(true);
        } catch (Exception var12) {
        }
        if (arg1 != -68) {
            this.focusLost((FocusEvent) null);
        }
        if (class132.field2419 != null) {
            try {
                class132.field2419.removeFocusListener(this);
                class132.field2419.getParent().remove(class132.field2419);
            } catch (Exception var11) {
            }
        }
        if (class110.field2022 != null) {
            try {
                class110.field2022.method2162(-21496);
            } catch (Exception var10) {
            }
        }
        this.method670(0);
        if (class5.field115 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!vl", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 400)
    public final void windowActivated(WindowEvent arg0) {
        field1521++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIBII)V", line = 407)
    public final void method668(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1526++;
        try {
            if (class178.field3227 != null) {
                class285.field5086++;
                if (class285.field5086 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method672(10, "alreadyloaded");
                return;
            }
            class178.field3227 = this;
            class52.field1091 = arg0;
            class176.field3150 = arg3;
            class105.field1985 = arg3;
            class221.field3899 = arg4;
            class113.field2082 = arg4;
            class90.field1703 = 0;
            if (arg2 < 54) {
                return;
            }
            class252.field4496 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class84.field1592 = true;
            } else {
                class84.field1592 = false;
            }
            if (class110.field2022 == null) {
                class77.field1492 = class110.field2022 = new class305(this, arg1, (String) null, 0);
            }
            class206 var7 = class110.field2022.method2163(this, 1, 7159);
            while (var7.field3655 == 0) {
                class204.method1510(10L, 1);
            }
            class236.field4115 = (Thread) var7.field3657;
        } catch (Exception var9) {
            class94.method792(var9, (byte) -115, (String) null);
            this.method672(10, "crash");
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 470)
    public static void method671(byte arg0) {
        if (arg0 != 91) {
            field1537 = (class86) null;
        }
        field1556 = null;
        field1537 = null;
    }

    @OriginalMember(owner = "client!vl", name = "destroy", descriptor = "()V", line = 482)
    public final void destroy() {
        field1543++;
        if (class178.field3227 == this && !class102.field1899) {
            class154.field2788 = class127.method1015(21504);
            class204.method1510(5000L, 1);
            class77.field1492 = null;
            this.method667(false, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!vl", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 498)
    public final void windowDeiconified(WindowEvent arg0) {
        field1529++;
    }

    @OriginalMember(owner = "client!vl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 505)
    public final synchronized void paint(Graphics arg0) {
        field1545++;
        if (class178.field3227 != this || class102.field1899) {
            return;
        }
        class52.field1097 = true;
        if (class273.field4857 && !class97.field1824 && (class127.method1015(21504) - class50.field1024) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class113.field2082 && class105.field1985 <= var2.height) {
                class43.field897 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "run", descriptor = "()V", line = 531)
    public final void run() {
        field1549++;
        try {
            if (class305.field5424 != null) {
                String var1 = class305.field5424.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class305.field5413;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method672(10, "wrongjava");
                        return;
                    }
                    class195.field3507 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class305.field5413 == null || class305.field5413.equals("1.4.2"))) {
                    this.method672(10, "wrongjava");
                    return;
                }
            }
            if (class305.field5413 != null && class305.field5413.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class305.field5413.length()) {
                    char var5 = class305.field5413.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class273.field4857 = true;
                }
            }
            if (class110.field2022.field5418 != null) {
                Method var6 = class305.field5426;
                if (var6 != null) {
                    try {
                        var6.invoke(class110.field2022.field5418, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class309.method2201((byte) -80);
            this.method674(5);
            class250.field4455 = class165.method1287(class132.field2419, class176.field3150, class221.field3899, -4);
            this.method669(0);
            class39.field860 = class248.method1776(-16211);
            while (class154.field2788 == 0L || class154.field2788 > class127.method1015(21504)) {
                class284.field5076 = class39.field860.method256(class309.field5487, true, class195.field3507);
                for (int var8 = 0; var8 < class284.field5076; var8++) {
                    this.method664(0);
                }
                this.method676(false);
                class53.method443(class132.field2419, (byte) 62, class110.field2022);
            }
        } catch (Exception var11) {
            class94.method792(var11, (byte) -115, (String) null);
            this.method672(10, "crash");
        }
        this.method667(true, (byte) -68);
    }

    @OriginalMember(owner = "client!vl", name = "start", descriptor = "()V", line = 643)
    public final void start() {
        field1544++;
        if (class178.field3227 == this && !class102.field1899) {
            class154.field2788 = 0L;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/String;)V", line = 656)
    public final void method672(int arg0, String arg1) {
        field1552++;
        if (this.field1527) {
            return;
        }
        if (arg0 != 10) {
            field1523 = -14;
        }
        this.field1527 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!vl", name = "stop", descriptor = "()V", line = 682)
    public final void stop() {
        field1547++;
        if (class178.field3227 == this && !class102.field1899) {
            class154.field2788 = class127.method1015(21504) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vl", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 701)
    public final void windowDeactivated(WindowEvent arg0) {
        field1551++;
    }

    @OriginalMember(owner = "client!vl", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1555++;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 718)
    public final synchronized void method674(int arg0) {
        if (class132.field2419 != null) {
            class132.field2419.removeFocusListener(this);
            class132.field2419.getParent().remove(class132.field2419);
        }
        Container var2;
        if (class120.field2159 != null) {
            var2 = class120.field2159;
        } else if (class5.field115 == null) {
            var2 = class110.field2022.field5418;
        } else {
            var2 = class5.field115;
        }
        var2.setLayout((LayoutManager) null);
        class132.field2419 = new class172(this);
        var2.add(class132.field2419);
        field1546++;
        class132.field2419.setSize(class221.field3899, class176.field3150);
        if (arg0 != 5) {
            field1537 = (class86) null;
        }
        class132.field2419.setVisible(true);
        if (class5.field115 == var2) {
            Insets var3 = class5.field115.getInsets();
            class132.field2419.setLocation(class90.field1703 + var3.left, class252.field4496 + var3.top);
        } else {
            class132.field2419.setLocation(class90.field1703, class252.field4496);
        }
        class132.field2419.addFocusListener(this);
        class132.field2419.requestFocus();
        class13.field410 = true;
        class149.field2727 = true;
        class52.field1097 = true;
        class43.field897 = false;
        class50.field1024 = class127.method1015(21504);
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Z", line = 765)
    public final boolean method675(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1524++;
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
            if (arg0 != 5) {
                this.update((Graphics) null);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method672(10, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V", line = 799)
    private final void method676(boolean arg0) {
        field1553++;
        long var2 = class127.method1015(21504);
        long var4 = field1556[class102.field1898];
        field1556[class102.field1898] = var2;
        class102.field1898 = class102.field1898 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class318.field5584 = ((var6 >> 1) + 32000) / var6;
        }
        if (class135.field2455++ > 50) {
            class52.field1097 = true;
            class135.field2455 -= 50;
            class132.field2419.setSize(class221.field3899, class176.field3150);
            class132.field2419.setVisible(true);
            if (class5.field115 != null && class120.field2159 == null) {
                Insets var7 = class5.field115.getInsets();
                class132.field2419.setLocation(class90.field1703 + var7.left, var7.top - -class252.field4496);
            } else {
                class132.field2419.setLocation(class90.field1703, class252.field4496);
            }
        }
        if (arg0) {
            field1525 = true;
        }
        this.method673((byte) -127);
    }

    @OriginalMember(owner = "client!vl", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
    public abstract void method665(boolean arg0);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public abstract void method669(int arg0);

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
    public abstract void method670(int arg0);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V")
    public abstract void method673(byte arg0);

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V")
    public abstract void method677(byte arg0);
}
