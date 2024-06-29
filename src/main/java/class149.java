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

@OriginalClass("client!rd")
public abstract class class149 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
    private boolean field2126 = false;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
    public static int[] field2128 = new int[32];

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field2144 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Lve;")
    public static class233 field2150;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Z")
    public static boolean field2159;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method993(int arg0) {
        if (arg0 == 2047) {
            class138.field1995.method421((byte) 82);
            field2145++;
            class184.field2620 = 1;
            class154.field2255 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;ZIIIIB)V")
    public final void method994(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2148++;
        try {
            class110.field1593 = this;
            class23.field294 = 0;
            class250.field3813 = arg5;
            class191.field2735 = arg5;
            class290.field4581 = 0;
            int var9 = -35 / ((4 - arg7) / 33);
            class60.field913 = arg3;
            class214.field3080 = arg4;
            class286.field4545 = arg4;
            class282.field4503 = new Frame();
            class282.field4503.setTitle("Jagex");
            class282.field4503.setResizable(true);
            class282.field4503.addWindowListener(this);
            class282.field4503.setVisible(true);
            class282.field4503.toFront();
            Insets var10 = class282.field4503.getInsets();
            class282.field4503.setSize(class286.field4545 + var10.right + var10.left, class191.field2735 + var10.bottom - -var10.top);
            class277.field4434 = class163.field2378 = new class83((Applet) null, arg6, arg1, arg0);
            class239 var11 = class163.field2378.method553(this, false, 1);
            while (var11.field3588 == 0) {
                class98.method660(10L, -126);
            }
        } catch (Exception var13) {
            class37.method259(99, (String) null, var13);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public abstract void method995(int arg0);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public abstract void method996(byte arg0);

    @OriginalMember(owner = "client!rd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2138++;
        if (class110.field1593 == this && !class206.field2986) {
            class25.field346 = class287.method1928(27332);
            class98.method660(5000L, -83);
            class277.field4434 = null;
            this.method1006(true, false);
        }
    }

    @OriginalMember(owner = "client!rd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2134++;
        if (class282.field4503 == null) {
            return class163.field2378 == null || class163.field2378.field1273 == this ? super.getAppletContext() : class163.field2378.field1273.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2140++;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    private final void method997(byte arg0) {
        field2130++;
        int var2 = -120 % ((-arg0 - 27) / 60);
        long var3 = class287.method1928(27332);
        long var5 = class260.field3927[class262.field3951];
        class260.field3927[class262.field3951] = var3;
        class262.field3951 = class262.field3951 + 1 & 0x1F;
        if (var5 != 0L && var3 > var5) {
            int var7 = (int) (var3 - var5);
            class33.field483 = ((var7 >> 1) + 32000) / var7;
        }
        if ((class32.field475++) > 50) {
            client.field3297 = true;
            class32.field475 -= 50;
            class80.field1247.setSize(class214.field3080, class250.field3813);
            class80.field1247.setVisible(true);
            if (class282.field4503 != null && class166.field2415 == null) {
                Insets var8 = class282.field4503.getInsets();
                class80.field1247.setLocation(class290.field4581 + var8.left, class23.field294 + var8.top);
            } else {
                class80.field1247.setLocation(class290.field4581, class23.field294);
            }
        }
        this.method999((byte) 109);
    }

    @OriginalMember(owner = "client!rd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2153++;
    }

    @OriginalMember(owner = "client!rd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2123++;
    }

    @OriginalMember(owner = "client!rd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2157++;
        class261.field3939 = false;
    }

    @OriginalMember(owner = "client!rd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rd", name = "stop", descriptor = "()V")
    public final void stop() {
        field2133++;
        if (class110.field1593 == this && !class206.field2986) {
            class25.field346 = class287.method1928(27332) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2124++;
        if (class110.field1593 != this || class206.field2986) {
            return;
        }
        client.field3297 = true;
        if (class289.field4572 && (class287.method1928(27332) - class194.field2793) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class286.field4545 <= var2.width && var2.height >= class191.field2735) {
                class248.field3729 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2155++;
        if (class282.field4503 == null) {
            return class163.field2378 == null || class163.field2378.field1273 == this ? super.getCodeBase() : class163.field2378.field1273.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)V")
    public static final void method998(boolean arg0, boolean arg1) {
        class217.field3209 = arg1;
        if (class217.field3209) {
            int var2 = class68.field1071.method783(103);
            class68.field1071.method521(-96);
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class68.field1071.method531((byte) -128, 1);
                        if (var24 == 1) {
                            class155.field2273[var3][var22][var23] = class68.field1071.method531((byte) 96, 26);
                        } else {
                            class155.field2273[var3][var22][var23] = -1;
                        }
                    }
                }
            }
            class68.field1071.method532(1730730147);
            int var4 = (class7.field140 - class68.field1071.field1673) / 16;
            class25.field335 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class25.field335[var5][var21] = class68.field1071.method735((byte) -59);
                }
            }
            int var6 = class68.field1071.method746((byte) -102);
            int var7 = class68.field1071.method746((byte) -101);
            int var8 = class68.field1071.method756(-29901);
            int var9 = class68.field1071.method756(-29901);
            class283.field4511 = new int[var4];
            class272.field4319 = null;
            class77.field1194 = null;
            class263.field3961 = new byte[var4][];
            class75.field1170 = new int[var4];
            class255.field3870 = new byte[var4][];
            class55.field842 = new int[var4];
            class23.field303 = new int[var4];
            class115.field1701 = new int[var4];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class155.field2273[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 0x3FF;
                            int var16 = (var14 & 0x3FFD) >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class23.field303[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class23.field303[var10] = var17;
                                int var19 = (var17 & 0xFFC3) >> 8;
                                int var20 = var17 & 0xFF;
                                class75.field1170[var10] = class136.field1971.method1522(7233, "m" + var19 + "_" + var20);
                                class115.field1701[var10] = class136.field1971.method1522(7233, "l" + var19 + "_" + var20);
                                class55.field842[var10] = class136.field1971.method1522(7233, "um" + var19 + "_" + var20);
                                class283.field4511[var10] = class136.field1971.method1522(7233, "ul" + var19 + "_" + var20);
                                var10++;
                            }
                        }
                    }
                }
            }
            class271.method1823(var9, var7, var6, var2, 0, var8, false);
        } else {
            int var25 = class68.field1071.method782(false);
            int var26 = class68.field1071.method733(false);
            int var27 = class68.field1071.method733(false);
            int var28 = class68.field1071.method756(-29901);
            int var29 = (class7.field140 - class68.field1071.field1673) / 16;
            class25.field335 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class25.field335[var30][var37] = class68.field1071.method759((byte) 99);
                }
            }
            int var31 = class68.field1071.method757(-1380156360);
            class115.field1701 = new int[var29];
            class263.field3961 = new byte[var29][];
            class55.field842 = new int[var29];
            class77.field1194 = null;
            class255.field3870 = new byte[var29][];
            boolean var32 = false;
            if ((var28 / 8 == 48 || var28 / 8 == 49) && var31 / 8 == 48) {
                var32 = true;
            }
            class272.field4319 = null;
            if ((var28 / 8) == 48 && (var31 / 8) == 148) {
                var32 = true;
            }
            class75.field1170 = new int[var29];
            class23.field303 = new int[var29];
            class283.field4511 = new int[var29];
            int var33 = 0;
            for (int var34 = (var28 - 6) / 8; var34 <= (var28 + 6) / 8; var34++) {
                for (int var35 = (var31 - 6) / 8; var35 <= ((var31 + 6) / 8); var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var32 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class23.field303[var33] = var36;
                        class75.field1170[var33] = -1;
                        class115.field1701[var33] = -1;
                        class55.field842[var33] = -1;
                        class283.field4511[var33] = -1;
                    } else {
                        class23.field303[var33] = var36;
                        class75.field1170[var33] = class136.field1971.method1522(7233, "m" + var34 + "_" + var35);
                        class115.field1701[var33] = class136.field1971.method1522(7233, "l" + var34 + "_" + var35);
                        class55.field842[var33] = class136.field1971.method1522(7233, "um" + var34 + "_" + var35);
                        class283.field4511[var33] = class136.field1971.method1522(7233, "ul" + var34 + "_" + var35);
                    }
                    var33++;
                }
            }
            class271.method1823(var27, var28, var26, var25, 0, var31, false);
        }
        if (!arg0) {
            field2143++;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public abstract void method999(byte arg0);

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public final synchronized void method1000(int arg0) {
        if (class80.field1247 != null) {
            class80.field1247.removeFocusListener(this);
            class80.field1247.getParent().remove(class80.field1247);
        }
        Container var2;
        if (class166.field2415 != null) {
            var2 = class166.field2415;
        } else if (class282.field4503 == null) {
            var2 = class163.field2378.field1273;
        } else {
            var2 = class282.field4503;
        }
        field2141++;
        if (arg0 != 0) {
            return;
        }
        var2.setLayout((LayoutManager) null);
        class80.field1247 = new class212(this);
        var2.add(class80.field1247);
        class80.field1247.setSize(class214.field3080, class250.field3813);
        class80.field1247.setVisible(true);
        if (class282.field4503 == var2) {
            Insets var3 = class282.field4503.getInsets();
            class80.field1247.setLocation(class290.field4581 + var3.left, class23.field294 + var3.top);
        } else {
            class80.field1247.setLocation(class290.field4581, class23.field294);
        }
        class80.field1247.addFocusListener(this);
        class80.field1247.requestFocus();
        class261.field3939 = true;
        class162.field2347 = true;
        client.field3297 = true;
        class248.field3729 = false;
        class194.field2793 = class287.method1928(27332);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static void method1001(int arg0) {
        field2128 = null;
        field2150 = null;
        if (arg0 != 0) {
            method993(-79);
        }
    }

    @OriginalMember(owner = "client!rd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2121++;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
    public abstract void method1002(byte arg0);

    @OriginalMember(owner = "client!rd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2154++;
    }

    @OriginalMember(owner = "client!rd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2142++;
        if (class282.field4503 == null) {
            return class163.field2378 == null || class163.field2378.field1273 == this ? super.getParameter(arg0) : class163.field2378.field1273.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2129++;
        if (class282.field4503 == null) {
            return class163.field2378 == null || class163.field2378.field1273 == this ? super.getDocumentBase() : class163.field2378.field1273.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)Z")
    public final boolean method1003(int arg0) {
        field2127++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 < 92) {
            this.init();
        }
        if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method1007("invalidhost", -2764);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
    public final void method1004(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2131++;
        try {
            if (class110.field1593 == null) {
                class250.field3813 = arg2;
                class191.field2735 = arg2;
                if (arg0 != -30430) {
                    this.method999((byte) 71);
                }
                class110.field1593 = this;
                class214.field3080 = arg4;
                class286.field4545 = arg4;
                class290.field4581 = 0;
                class60.field913 = arg3;
                class23.field294 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class163.field2378 == null) {
                    class277.field4434 = class163.field2378 = new class83(this, arg1, (String) null, 0);
                }
                class239 var7 = class163.field2378.method553(this, false, 1);
                while (var7.field3588 == 0) {
                    class98.method660(10L, -87);
                }
            } else {
                class89.field1356++;
                if (class89.field1356 >= 3) {
                    this.method1007("alreadyloaded", -2764);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class37.method259(82, (String) null, var9);
            this.method1007("crash", -2764);
        }
    }

    @OriginalMember(owner = "client!rd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2151++;
    }

    @OriginalMember(owner = "client!rd", name = "providesignlink", descriptor = "(Lca;)V")
    public static final void providesignlink(class83 arg0) {
        class163.field2378 = arg0;
        class277.field4434 = arg0;
        field2146++;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public abstract void method1005(int arg0);

    @OriginalMember(owner = "client!rd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2156++;
        class261.field3939 = true;
        client.field3297 = true;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(ZZ)V")
    private final void method1006(boolean arg0, boolean arg1) {
        field2152++;
        synchronized (this) {
            if (class206.field2986) {
                return;
            }
            class206.field2986 = arg0;
        }
        if (class163.field2378.field1273 != null) {
            class163.field2378.field1273.destroy();
        }
        try {
            this.method996((byte) 123);
        } catch (Exception var9) {
        }
        if (class80.field1247 != null) {
            try {
                class80.field1247.removeFocusListener(this);
                class80.field1247.getParent().remove(class80.field1247);
            } catch (Exception var8) {
            }
        }
        if (class163.field2378 != null) {
            try {
                class163.field2378.method562(111);
            } catch (Exception var7) {
            }
        }
        this.method1002((byte) 127);
        if (class282.field4503 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!rd", name = "start", descriptor = "()V")
    public final void start() {
        field2136++;
        if (class110.field1593 == this && !class206.field2986) {
            class25.field346 = 0L;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1007(String arg0, int arg1) {
        field2132++;
        if (this.field2126) {
            return;
        }
        this.field2126 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            if (arg1 != -2764) {
                this.windowActivated((WindowEvent) null);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V")
    private final void method1008(byte arg0) {
        field2149++;
        long var2 = class43.field615[class262.field3953];
        long var4 = class287.method1928(27332);
        class43.field615[class262.field3953] = var4;
        class262.field3953 = class262.field3953 + 1 & 0x1F;
        synchronized (this) {
            class162.field2347 = class261.field3939;
        }
        if (arg0 != 67) {
            return;
        }
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        this.method995(-11721);
    }

    @OriginalMember(owner = "client!rd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2137++;
    }

    @OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
    public final void run() {
        field2147++;
        try {
            if (class83.field1279 != null) {
                String var1 = class83.field1279.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class83.field1272;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1007("wrongjava", -2764);
                        return;
                    }
                    class145.field2079 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class83.field1272 == null || class83.field1272.equals("1.4.2"))) {
                    this.method1007("wrongjava", -2764);
                    return;
                }
            }
            if (class83.field1272 != null && class83.field1272.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class83.field1272.length() > var3) {
                    char var5 = class83.field1272.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class289.field4572 = true;
                }
            }
            if (class163.field2378.field1273 != null) {
                Method var6 = class83.field1289;
                if (var6 != null) {
                    try {
                        var6.invoke(class163.field2378.field1273, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class145.method971(20879);
            this.method1000(0);
            class251.field3828 = class151.method1020(class80.field1247, class214.field3080, (byte) 119, class250.field3813);
            this.method1005(-125);
            class176.field2505 = class148.method991((byte) -86);
            while (class25.field346 == 0L || class25.field346 > class287.method1928(27332)) {
                class161.field2331 = class176.field2505.method207(class86.field1337, class145.field2079, 0);
                for (int var7 = 0; var7 < class161.field2331; var7++) {
                    this.method1008((byte) 67);
                }
                this.method997((byte) 45);
                class17.method129(class80.field1247, class163.field2378, -128);
            }
        } catch (Exception var10) {
            class37.method259(-34, (String) null, var10);
            this.method1007("crash", -2764);
        }
        this.method1006(true, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([Lha;II)V")
    public static final void method1009(class267[] arg0, int arg1, int arg2) {
        field2122++;
        for (int var3 = arg2; var3 < arg0.length; var3++) {
            class267 var4 = arg0[var3];
            if (var4 != null && var4.field4139 == arg1 && (!var4.field4039 || !client.method1428(var4))) {
                if (var4.field4149 == 0) {
                    if (!var4.field4039 && client.method1428(var4) && class250.field3790 != var4) {
                        continue;
                    }
                    method1009(arg0, var4.field4113, 0);
                    if (var4.field4160 != null) {
                        method1009(var4.field4160, var4.field4113, 0);
                    }
                    class261 var5 = (class261) class128.field1874.method1218((long) var4.field4113, 110);
                    if (var5 != null) {
                        class31.method226(var5.field3940, 117);
                    }
                }
                if (var4.field4149 == 6) {
                    if (var4.field4120 != -1 || var4.field4086 != -1) {
                        boolean var6 = class283.method1903(var4, arg2 + 124);
                        int var7;
                        if (var6) {
                            var7 = var4.field4086;
                        } else {
                            var7 = var4.field4120;
                        }
                        if (var7 != -1) {
                            class196 var8 = class70.method478(var7, false);
                            if (var8 != null) {
                                var4.field4126 += class38.field566;
                                while (var4.field4126 > var8.field2825[var4.field4115]) {
                                    var4.field4126 -= var8.field2825[var4.field4115];
                                    var4.field4115++;
                                    if (var8.field2818.length <= var4.field4115) {
                                        var4.field4115 -= var8.field2815;
                                        if (var4.field4115 < 0 || var8.field2818.length <= var4.field4115) {
                                            var4.field4115 = 0;
                                        }
                                    }
                                    var4.field4190 = var4.field4115 + 1;
                                    if (var4.field4190 >= var8.field2818.length) {
                                        var4.field4190 -= var8.field2815;
                                        if (var4.field4190 < 0 || var4.field4190 >= var8.field2818.length) {
                                            var4.field4190 = -1;
                                        }
                                    }
                                    class217.method1396(false, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4162 != 0 && !var4.field4039) {
                        int var9 = var4.field4162 << 16 >> 16;
                        int var10 = var4.field4162 >> 16;
                        int var11 = class38.field566 * var10;
                        int var12 = class38.field566 * var9;
                        var4.field4155 = var4.field4155 + var12 & 0x7FF;
                        var4.field4097 = var4.field4097 + var11 & 0x7FF;
                        class217.method1396(false, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2139++;
        this.destroy();
    }
}
