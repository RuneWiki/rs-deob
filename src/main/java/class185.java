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

@OriginalClass("client!da")
public abstract class class185 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Z")
    private boolean field2921 = false;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field2910 = 0;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2935 = "Members object";

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Ldf;")
    public static class55 field2906;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Z")
    public static boolean field2941;

    @OriginalMember(owner = "client!da", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2924++;
        if (class110.field1811 == null) {
            return class105.field1684 == null || class105.field1684.field2620 == this ? super.getCodeBase() : class105.field1684.field2620.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIBLjava/lang/String;II)V")
    public final void method1250(boolean arg0, int arg1, int arg2, int arg3, byte arg4, String arg5, int arg6, int arg7) {
        field2920++;
        try {
            class236.field3842 = 0;
            class257.field4094 = this;
            class63.field1029 = arg2;
            class198.field3163 = 0;
            class279.field4423 = arg7;
            class258.field4099 = arg7;
            if (arg4 <= 114) {
                field2935 = null;
            }
            class84.field1326 = arg6;
            class255.field4048 = arg6;
            class110.field1811 = new Frame();
            class110.field1811.setTitle("Jagex");
            class110.field1811.setResizable(true);
            class110.field1811.addWindowListener(this);
            class110.field1811.setVisible(true);
            class110.field1811.toFront();
            Insets var9 = class110.field1811.getInsets();
            class110.field1811.setSize(class255.field4048 + var9.right + var9.left, class258.field4099 + var9.top - -var9.bottom);
            class236.field3855 = class105.field1684 = new class165((Applet) null, arg1, arg5, arg3);
            class163 var10 = class105.field1684.method1133(1, this, (byte) 92);
            while (var10.field2589 == 0) {
                class43.method358(10L, false);
            }
        } catch (Exception var12) {
            class178.method1211((String) null, -109, var12);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public abstract void method1082(byte arg0);

    @OriginalMember(owner = "client!da", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class167.field2654 = false;
        field2923++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method1251(boolean arg0, String arg1) {
        field2917++;
        if (this.field2921) {
            return;
        }
        this.field2921 = true;
        System.out.println("error_game_" + arg1);
        try {
            if (!arg0) {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class255.field4055 <= arg6 && arg0 <= class9.field128 && class161.field2561 <= arg1 && class51.field896 >= arg5) {
            if (arg2 == 1) {
                class75.method528(arg0, arg1, arg3, arg5, arg6, (byte) -12);
            } else {
                class112.method819(arg5, arg2, arg1, 0, arg6, arg0, arg3);
            }
        } else if (arg2 == 1) {
            class82.method594(arg1, arg5, -4490, arg0, arg3, arg6);
        } else {
            class5.method42(arg2, arg6, arg5, 112, arg0, arg1, arg3);
        }
        if (arg4 < 103) {
            field2906 = null;
        }
        field2932++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Z")
    public final boolean method1253(int arg0) {
        field2934++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != -1) {
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
                this.method1251(false, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "start", descriptor = "()V")
    public final void start() {
        field2911++;
        if (class257.field4094 == this && !class175.field2753) {
            class11.field158 = 0L;
        }
    }

    @OriginalMember(owner = "client!da", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2938++;
    }

    @OriginalMember(owner = "client!da", name = "stop", descriptor = "()V")
    public final void stop() {
        field2937++;
        if (class257.field4094 == this && !class175.field2753) {
            class11.field158 = class276.method1861((byte) 122) + 4000L;
        }
    }

    @OriginalMember(owner = "client!da", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2927++;
        if (class110.field1811 == null) {
            return class105.field1684 == null || class105.field1684.field2620 == this ? super.getAppletContext() : class105.field1684.field2620.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class167.field2654 = true;
        field2905++;
        class245.field3923 = true;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method1254(int arg0) {
        int var1 = -17 % ((44 - arg0) / 56);
        field2935 = null;
        field2906 = null;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static final void method1255(int arg0) {
        field2907++;
        if (class176.field2780 > 0) {
            class176.field2780--;
        }
        if (class234.field3820 > 1) {
            class169.field2687 = class66.field1094;
            class234.field3820--;
        }
        if (class109.field1800) {
            class109.field1800 = false;
            class14.method112(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class190.method1301(4080); var1++) {
        }
        if (class273.field4336 != 30) {
            return;
        }
        class256.method1747((byte) -92, 192, class68.field1113);
        Object var2 = class68.field1135.field2266;
        synchronized (class68.field1135.field2266) {
            if (!class143.field2309) {
                class68.field1135.field2272 = 0;
            } else if (class115.field1920 != 0 || class68.field1135.field2272 >= 40) {
                class204.field3273++;
                int var3 = 0;
                class68.field1113.method534((byte) -100, 0);
                class68.field1113.method1548(-494964184, 0);
                int var4 = class68.field1113.field3655;
                for (int var5 = 0; class68.field1135.field2272 > var5 && class68.field1113.field3655 - var4 < 240; var5++) {
                    int var6 = class68.field1135.field2271[var5];
                    var3++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class68.field1135.field2274[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class68.field1135.field2271[var5] == -1 && class68.field1135.field2274[var5] == -1) {
                        var7 = -1;
                        var8 = true;
                        var6 = -1;
                    }
                    if (class180.field2826 != var7 || class167.field2659 != var6) {
                        int var9 = var7 - class180.field2826;
                        class180.field2826 = var7;
                        int var10 = var6 - class167.field2659;
                        class167.field2659 = var6;
                        if (class263.field4193 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class68.field1113.method1554((class263.field4193 << 12) + (var9 << 6) + var10, (byte) 89);
                            class263.field4193 = 0;
                        } else if (class263.field4193 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class68.field1113.method1548(-494964184, class263.field4193 + 128);
                            var9 += 128;
                            class68.field1113.method1554((var9 << 8) + var10, (byte) 89);
                            class263.field4193 = 0;
                        } else if (class263.field4193 < 32) {
                            class68.field1113.method1548(-494964184, class263.field4193 + 192);
                            if (var8) {
                                class68.field1113.method1529((byte) 117, Integer.MIN_VALUE);
                            } else {
                                class68.field1113.method1529((byte) 119, var6 << 16 | var7);
                            }
                            class263.field4193 = 0;
                        } else {
                            class68.field1113.method1554(class263.field4193 + 57344, (byte) 89);
                            if (var8) {
                                class68.field1113.method1529((byte) 125, Integer.MIN_VALUE);
                            } else {
                                class68.field1113.method1529((byte) 123, var6 << 16 | var7);
                            }
                            class263.field4193 = 0;
                        }
                    } else if (class263.field4193 < 2047) {
                        class263.field4193++;
                    }
                }
                class68.field1113.method1509((byte) -70, class68.field1113.field3655 - var4);
                if (var3 < class68.field1135.field2272) {
                    class68.field1135.field2272 -= var3;
                    for (int var11 = 0; var11 < class68.field1135.field2272; var11++) {
                        class68.field1135.field2274[var11] = class68.field1135.field2274[var3 + var11];
                        class68.field1135.field2271[var11] = class68.field1135.field2271[var3 + var11];
                    }
                } else {
                    class68.field1135.field2272 = 0;
                }
            }
        }
        if (class115.field1920 != 0) {
            class180.field2828++;
            int var12 = class235.field3829;
            int var13 = class248.field3953;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            long var14 = (class161.field2574 - class126.field2024) / 50L;
            class126.field2024 = class161.field2574;
            byte var16 = 0;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            int var17 = (int) var14;
            if (class115.field1920 == 2) {
                var16 = 1;
            }
            class68.field1113.method534((byte) 121, 7);
            class68.field1113.method1504((byte) 124, var13 | var12 << 16);
            class68.field1113.method1547(var16 << 15 | var17, (byte) 58);
        }
        if (class100.field1640 > 0) {
            class100.field1640--;
        }
        if (class235.field3836) {
            for (int var18 = 0; var18 < class225.field3732; var18++) {
                int var19 = class52.field911[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class39.field733 = true;
                    break;
                }
            }
        } else if (class73.field1193[96] || class73.field1193[97] || class73.field1193[98] || class73.field1193[99]) {
            class39.field733 = true;
        }
        if (class39.field733 && class100.field1640 <= 0) {
            class100.field1640 = 20;
            class39.field733 = false;
            class68.field1113.method534((byte) -106, 248);
            class259.field4121++;
            class68.field1113.method1554(class199.field3186, (byte) 89);
            class68.field1113.method1547(class122.field1985, (byte) 58);
        }
        if (class56.field963 && !class224.field3706) {
            class224.field3706 = true;
            class68.field1113.method534((byte) -99, 115);
            class68.field1113.method1548(-494964184, 1);
            class21.field355++;
        }
        if (!class56.field963 && class224.field3706) {
            class224.field3706 = false;
            class21.field355++;
            class68.field1113.method534((byte) 78, 115);
            class68.field1113.method1548(-494964184, 0);
        }
        if (!class221.field3679) {
            class68.field1113.method534((byte) -121, 218);
            class126.field2039++;
            class68.field1113.method1546(class211.method1457(0), (byte) -121);
            class221.field3679 = true;
        }
        class26.method233(0);
        if (class273.field4336 != 30) {
            return;
        }
        class77.method541((byte) 53);
        class124.method893((byte) 116);
        class194.method1326((byte) -35);
        class233.field3813++;
        if (class233.field3813 > 750) {
            class14.method112(40);
            return;
        }
        class229.method1609(false);
        class164.method1126(261);
        class176.method1202(78);
        if (class286.field4525 != null) {
            class234.method1633(118);
        }
        for (int var20 = class85.method612(true, (byte) -4); var20 != -1; var20 = class85.method612(false, (byte) -4)) {
            class111.method813(var20, 108);
            class85.field1356[class202.method1393(class176.field2785++, 31)] = var20;
        }
        for (class259 var21 = class289.method1932(-85); var21 != null; var21 = class289.method1932(-80)) {
            int var22 = var21.method1771(-247);
            int var23 = var21.method1768(true);
            if (var22 == 1) {
                class174.field2731[var23] = var21.field4128;
                class135.field2230[class202.method1393(class204.field3265++, 31)] = var23;
            } else if (var22 == 2) {
                class57.field969[var23] = var21.field4116;
                class161.field2559[class202.method1393(class239.field3881++, 31)] = var23;
            } else if (var22 == 3) {
                class36 var24 = class64.method455(var23, 592427152);
                if (!var21.field4116.equals(var24.field595)) {
                    var24.field595 = var21.field4116;
                    class280.method1886(var24, 32);
                }
            } else if (var22 == 4) {
                class36 var25 = class64.method455(var23, 592427152);
                int var26 = var21.field4128;
                int var27 = var21.field4113;
                int var28 = var21.field4114;
                if (var25.field565 != var26 || var25.field598 != var27 || var25.field654 != var28) {
                    var25.field598 = var27;
                    var25.field654 = var28;
                    var25.field565 = var26;
                    class280.method1886(var25, 32);
                }
            } else if (var22 == 5) {
                class36 var29 = class64.method455(var23, 592427152);
                if (var21.field4128 != var29.field664 || var21.field4128 == -1) {
                    var29.field689 = 1;
                    var29.field635 = 0;
                    var29.field664 = var21.field4128;
                    var29.field683 = 0;
                    class280.method1886(var29, 32);
                }
            } else if (var22 == 6) {
                int var30 = var21.field4128;
                int var31 = var30 >> 10 & 0x1F;
                int var32 = var30 >> 5 & 0x1F;
                int var33 = var30 & 0x1F;
                int var34 = (var33 << 3) + ((var31 << 19) + (var32 << 11));
                class36 var35 = class64.method455(var23, 592427152);
                if (var35.field710 != var34) {
                    var35.field710 = var34;
                    class280.method1886(var35, 32);
                }
            } else if (var22 == 7) {
                class36 var36 = class64.method455(var23, 592427152);
                boolean var37 = var21.field4128 == 1;
                if (var36.field667 != var37) {
                    var36.field667 = var37;
                    class280.method1886(var36, 32);
                }
            } else if (var22 == 8) {
                class36 var44 = class64.method455(var23, 592427152);
                if (var21.field4128 != var44.field647 || var21.field4113 != var44.field567 || var21.field4114 != var44.field702) {
                    var44.field647 = var21.field4128;
                    var44.field702 = var21.field4114;
                    if (var44.field583 != -1) {
                        if (var44.field610 > 0) {
                            var44.field702 = var44.field702 * 32 / var44.field610;
                        } else if (var44.field711 > 0) {
                            var44.field702 = var44.field702 * 32 / var44.field711;
                        }
                    }
                    var44.field567 = var21.field4113;
                    class280.method1886(var44, 32);
                }
            } else if (var22 == 9) {
                class36 var43 = class64.method455(var23, 592427152);
                if (var21.field4128 != var43.field583 || var21.field4113 != var43.field655) {
                    var43.field655 = var21.field4113;
                    var43.field583 = var21.field4128;
                    class280.method1886(var43, 32);
                }
            } else if (var22 == 10) {
                class36 var42 = class64.method455(var23, 592427152);
                if (var21.field4128 != var42.field619 || var21.field4113 != var42.field652 || var21.field4114 != var42.field668) {
                    var42.field619 = var21.field4128;
                    var42.field652 = var21.field4113;
                    var42.field668 = var21.field4114;
                    class280.method1886(var42, 32);
                }
            } else if (var22 == 11) {
                class36 var38 = class64.method455(var23, 592427152);
                var38.field719 = 0;
                var38.field607 = var38.field631 = var21.field4113;
                var38.field606 = var38.field695 = var21.field4128;
                var38.field604 = 0;
                class280.method1886(var38, 32);
            } else if (var22 == 12) {
                class36 var39 = class64.method455(var23, 592427152);
                int var40 = var21.field4128;
                if (var39 != null && var39.field709 == 0) {
                    if (var39.field602 - var39.field676 < var40) {
                        var40 = var39.field602 - var39.field676;
                    }
                    if (var40 < 0) {
                        var40 = 0;
                    }
                    if (var39.field571 != var40) {
                        var39.field571 = var40;
                        class280.method1886(var39, 32);
                    }
                }
            } else if (var22 == 13) {
                class36 var41 = class64.method455(var23, 592427152);
                var41.field563 = var21.field4128;
            }
        }
        if (class252.field4019 != 0) {
            class39.field732 += 20;
            if (class39.field732 >= 400) {
                class252.field4019 = 0;
            }
        }
        class287.field4533++;
        if (class201.field3231 != null) {
            class34.field539++;
            if (class34.field539 >= 15) {
                class280.method1886(class201.field3231, 32);
                class201.field3231 = null;
            }
        }
        if (class274.field4345 != null) {
            class280.method1886(class274.field4345, 32);
            if (class241.field3898 > (class48.field859 + 5) || class241.field3898 < class48.field859 - 5 || class284.field4491 + 5 < class109.field1801 || class109.field1801 < (class284.field4491 - 5)) {
                class102.field1669 = true;
            }
            class78.field1246++;
            if (class270.field4259 == 0) {
                if (class102.field1669 && class78.field1246 >= 5) {
                    if (class67.field1105 == class274.field4345 && class229.field3789 != class178.field2804) {
                        class36 var45 = class274.field4345;
                        byte var46 = 0;
                        if (class216.field3524 == 1 && var45.field570 == 206) {
                            var46 = 1;
                        }
                        if (var45.field638[class178.field2804] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1093(var45).method603(0)) {
                            int var49 = class229.field3789;
                            int var50 = class178.field2804;
                            var45.field638[var50] = var45.field638[var49];
                            var45.field714[var50] = var45.field714[var49];
                            var45.field638[var49] = -1;
                            var45.field714[var49] = 0;
                        } else if (var46 == 1) {
                            int var47 = class229.field3789;
                            int var48 = class178.field2804;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var45.method303(var47, 0, var47 - 1);
                                    var47--;
                                } else if (var48 > var47) {
                                    var45.method303(var47, 0, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var45.method303(class229.field3789, 0, class178.field2804);
                        }
                        class68.field1113.method534((byte) 83, 34);
                        class68.field1113.method1508(var46, true);
                        class27.field434++;
                        class68.field1113.method1514(class229.field3789, (byte) -83);
                        class68.field1113.method1554(class178.field2804, (byte) 89);
                        class68.field1113.method1546(class274.field4345.field648, (byte) -114);
                    }
                } else if ((class222.field3683 == 1 || class45.method366((byte) -106, class205.field3291 - 1)) && class205.field3291 > 2) {
                    class180.method1225(22);
                } else if (class205.field3291 > 0) {
                    class179.method1222(15444);
                }
                class274.field4345 = null;
                class34.field539 = 10;
                class115.field1920 = 0;
            }
        }
        class109.field1805 = false;
        class225.field3732 = 0;
        class108.field1787 = null;
        client.field2523 = false;
        class36 var51 = class135.field2168;
        class135.field2168 = null;
        class36 var52 = class285.field4503;
        class285.field4503 = null;
        while (class263.method1790(16) && class225.field3732 < 128) {
            class52.field911[class225.field3732] = class203.field3257;
            class135.field2229[class225.field3732] = class200.field3194;
            class225.field3732++;
        }
        class286.field4525 = null;
        if (class157.field2548 != -1) {
            class206.method1424(-1, class84.field1326, 0, class157.field2548, 0, 0, 0, class279.field4423);
        }
        class66.field1094++;
        while (true) {
            class213 var53;
            class36 var54;
            class36 var55;
            do {
                var53 = (class213) class50.field886.method845((byte) 121);
                if (var53 == null) {
                    while (true) {
                        class213 var56;
                        class36 var57;
                        class36 var58;
                        do {
                            var56 = (class213) class286.field4520.method845((byte) -112);
                            if (var56 == null) {
                                while (true) {
                                    class213 var59;
                                    class36 var60;
                                    class36 var61;
                                    do {
                                        var59 = (class213) class182.field2860.method845((byte) 103);
                                        if (var59 == null) {
                                            if (class286.field4525 == null) {
                                                class167.field2658 = 0;
                                            }
                                            if (client.field2517 != null) {
                                                class184.method1247((byte) 66);
                                            }
                                            if (class144.field2313 > 0 && class73.field1193[82] && class73.field1193[81] && class66.field1096 != 0) {
                                                int var62 = class250.field3980 - class66.field1096;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class241.method1666(class167.field2655.field3321[0] + class214.field3501, var62, class167.field2655.field3340[0] + class50.field884, -2358);
                                            }
                                            if (class144.field2313 > 0 && class73.field1193[82] && class73.field1193[81]) {
                                                if (class32.field498 != -1) {
                                                    class241.method1666(class40.field746 + class214.field3501, class250.field3980, class50.field884 + class32.field498, -2358);
                                                }
                                                class43.field791 = 0;
                                                class51.field891 = 0;
                                            } else if (class51.field891 == 2) {
                                                if (class32.field498 != -1) {
                                                    class131.field2099++;
                                                    class68.field1113.method534((byte) -119, 187);
                                                    class68.field1113.method1547(class40.field746 + class214.field3501, (byte) 58);
                                                    class68.field1113.method1514(class50.field884 + class32.field498, (byte) -119);
                                                    class68.field1113.method1557(class253.field4032, (byte) -92);
                                                    class68.field1113.method1554(class281.field4452, (byte) 89);
                                                    class39.field732 = 0;
                                                    class41.field771 = class248.field3953;
                                                    class184.field2903 = class235.field3829;
                                                    class252.field4019 = 1;
                                                }
                                                class51.field891 = 0;
                                            } else if (class43.field791 == 2) {
                                                if (class32.field498 != -1) {
                                                    class244.field3911++;
                                                    class68.field1113.method534((byte) -102, 153);
                                                    class68.field1113.method1559((byte) 118, class214.field3501 + class40.field746);
                                                    class68.field1113.method1514(class50.field884 + class32.field498, (byte) -109);
                                                    class39.field732 = 0;
                                                    class252.field4019 = 1;
                                                    class41.field771 = class248.field3953;
                                                    class184.field2903 = class235.field3829;
                                                }
                                                class43.field791 = 0;
                                            } else if (class32.field498 != -1 && class51.field891 == 0 && class43.field791 == 0) {
                                                boolean var63 = class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, class40.field746, 0, 0, 0, 11027, 0, 0, true, class32.field498);
                                                if (var63) {
                                                    class184.field2903 = class235.field3829;
                                                    class41.field771 = class248.field3953;
                                                    class252.field4019 = 1;
                                                    class39.field732 = 0;
                                                }
                                            }
                                            class32.field498 = -1;
                                            class45.method368((byte) -33);
                                            if (class135.field2168 != var51) {
                                                if (var51 != null) {
                                                    class280.method1886(var51, 32);
                                                }
                                                if (class135.field2168 != null) {
                                                    class280.method1886(class135.field2168, 32);
                                                }
                                            }
                                            if (class285.field4503 != var52 && class133.field2129 == class124.field2007) {
                                                if (var52 != null) {
                                                    class280.method1886(var52, 32);
                                                }
                                                if (class285.field4503 != null) {
                                                    class280.method1886(class285.field4503, 32);
                                                }
                                            }
                                            if (class285.field4503 == null) {
                                                if (class133.field2129 > 0) {
                                                    class133.field2129--;
                                                }
                                            } else if (class124.field2007 > class133.field2129) {
                                                class133.field2129++;
                                                if (class133.field2129 == class124.field2007) {
                                                    class280.method1886(class285.field4503, 32);
                                                }
                                            }
                                            if (class229.field3786 == 1) {
                                                class173.method1183(-3876);
                                            } else if (class229.field3786 == 2) {
                                                class182.method1235(1);
                                            } else {
                                                class28.method243((byte) -87);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class245.field3921[var64]++;
                                            }
                                            int var65 = class176.method1206(115);
                                            int var66 = class51.method394((byte) -57);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class259.field4111++;
                                                class176.field2780 = 250;
                                                class24.method219(14500, false);
                                                class68.field1113.method534((byte) -106, 40);
                                            }
                                            if (class5.field68 != null && class5.field68.field2589 == 1) {
                                                if (class5.field68.field2594 != null) {
                                                    class287.method1930(class155.field2510, (byte) -73, class110.field1807);
                                                }
                                                class5.field68 = null;
                                                class155.field2510 = null;
                                                class110.field1807 = false;
                                            }
                                            class87.field1393++;
                                            if (arg0 > -42) {
                                                return;
                                            }
                                            class245.field3927++;
                                            if (class245.field3927 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class245.field3927 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    class107.field1775 += class32.field500;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class155.field2503 += class85.field1354;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class48.field866 += class136.field2252;
                                                }
                                            }
                                            if (class87.field1393 > 500) {
                                                class87.field1393 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class87.field1385 += class175.field2737;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class120.field1956 += class215.field3517;
                                                }
                                            }
                                            if (class120.field1956 < -60) {
                                                class215.field3517 = 2;
                                            }
                                            if (class155.field2503 < -40) {
                                                class85.field1354 = 1;
                                            }
                                            if (class48.field866 < -55) {
                                                class136.field2252 = 2;
                                            }
                                            if (class48.field866 > 55) {
                                                class136.field2252 = -2;
                                            }
                                            if (class87.field1385 < -20) {
                                                class175.field2737 = 1;
                                            }
                                            if (class155.field2503 > 40) {
                                                class85.field1354 = -1;
                                            }
                                            if (class107.field1775 < -50) {
                                                class32.field500 = 2;
                                            }
                                            if (class87.field1385 > 10) {
                                                class175.field2737 = -1;
                                            }
                                            if (class120.field1956 > 60) {
                                                class215.field3517 = -2;
                                            }
                                            class152.field2461++;
                                            if (class107.field1775 > 50) {
                                                class32.field500 = -2;
                                            }
                                            if (class152.field2461 > 50) {
                                                class68.field1113.method534((byte) -105, 213);
                                                class125.field2018++;
                                            }
                                            if (class14.field250) {
                                                class7.method55(26);
                                                class14.field250 = false;
                                            }
                                            try {
                                                if (class5.field69 != null && class68.field1113.field3655 > 0) {
                                                    class5.field69.method2(0, class68.field1113.field3653, -120, class68.field1113.field3655);
                                                    class68.field1113.field3655 = 0;
                                                    class152.field2461 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var69) {
                                                class14.method112(40);
                                                return;
                                            }
                                        }
                                        var60 = var59.field3480;
                                        if (var60.field661 < 0) {
                                            break;
                                        }
                                        var61 = class64.method455(var60.field632, 592427152);
                                    } while (var61 == null || var61.field658 == null || var61.field658.length <= var60.field661 || var61.field658[var60.field661] != var60);
                                    class89.method645(-127, var59);
                                }
                            }
                            var57 = var56.field3480;
                            if (var57.field661 < 0) {
                                break;
                            }
                            var58 = class64.method455(var57.field632, 592427152);
                        } while (var58 == null || var58.field658 == null || var58.field658.length <= var57.field661 || var58.field658[var57.field661] != var57);
                        class89.method645(-116, var56);
                    }
                }
                var54 = var53.field3480;
                if (var54.field661 < 0) {
                    break;
                }
                var55 = class64.method455(var54.field632, 592427152);
            } while (var55 == null || var55.field658 == null || var54.field661 >= var55.field658.length || var55.field658[var54.field661] != var54);
            class89.method645(-123, var53);
        }
    }

    @OriginalMember(owner = "client!da", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2933++;
        if (class110.field1811 == null) {
            return class105.field1684 == null || class105.field1684.field2620 == this ? super.getDocumentBase() : class105.field1684.field2620.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2908++;
    }

    @OriginalMember(owner = "client!da", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!da", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2928++;
        this.destroy();
    }

    @OriginalMember(owner = "client!da", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2939++;
        if (class257.field4094 == this && !class175.field2753) {
            class11.field158 = class276.method1861((byte) 122);
            class43.method358(5000L, false);
            class236.field3855 = null;
            this.method1261(121, false);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public abstract void method1090(boolean arg0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    private final void method1256(byte arg0) {
        field2925++;
        long var2 = class7.field81[class238.field3869];
        long var4 = class276.method1861((byte) 122);
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class7.field81[class238.field3869] = var4;
        class238.field3869 = class238.field3869 + 1 & 0x1F;
        synchronized (this) {
            class56.field963 = class167.field2654;
            if (arg0 < 93) {
                field2906 = null;
            }
        }
        this.method1085(112);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    private final void method1257(int arg0) {
        if (arg0 != 2189) {
            return;
        }
        long var2 = class276.method1861((byte) 122);
        long var4 = class26.field422[class10.field146];
        class26.field422[class10.field146] = var2;
        class10.field146 = class10.field146 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class287.field4538 = ((var6 >> 1) + 32000) / var6;
        }
        field2913++;
        if (class182.field2863++ > 50) {
            class182.field2863 -= 50;
            class245.field3923 = true;
            class155.field2511.setSize(class84.field1326, class279.field4423);
            class155.field2511.setVisible(true);
            if (class110.field1811 != null && class77.field1234 == null) {
                Insets var7 = class110.field1811.getInsets();
                class155.field2511.setLocation(var7.left + class236.field3842, class198.field3163 + var7.top);
            } else {
                class155.field2511.setLocation(class236.field3842, class198.field3163);
            }
        }
        this.method1094(true);
    }

    @OriginalMember(owner = "client!da", name = "providesignlink", descriptor = "(Lj;)V")
    public static final void providesignlink(class165 arg0) {
        class105.field1684 = arg0;
        class236.field3855 = arg0;
        field2919++;
    }

    @OriginalMember(owner = "client!da", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2915++;
    }

    @OriginalMember(owner = "client!da", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2926++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Lc;")
    public static final class106 method1258(int arg0, int arg1, int arg2) {
        field2909++;
        if (arg2 != 250) {
            field2910 = -122;
        }
        class106 var3 = new class106();
        for (class55 var4 = (class55) class9.field117.method843(arg2 - 364); var4 != null; var4 = (class55) class9.field117.method852((byte) 123)) {
            if (var4.field949 && var4.method408(arg0, true, arg1)) {
                var3.method774(0, var4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2931++;
        if (class110.field1811 == null) {
            return class105.field1684 == null || class105.field1684.field2620 == this ? super.getParameter(arg0) : class105.field1684.field2620.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
    public final void method1259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2929++;
        try {
            if (class257.field4094 == null) {
                class279.field4423 = arg4;
                class258.field4099 = arg4;
                class198.field3163 = 0;
                class257.field4094 = this;
                class84.field1326 = arg1;
                class255.field4048 = arg1;
                class63.field1029 = arg2;
                if (arg3 >= 115) {
                    class236.field3842 = 0;
                    String var6 = this.getParameter("openwinjs");
                    boolean var10000;
                    if (var6 != null && var6.equals("1")) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                    if (class105.field1684 == null) {
                        class236.field3855 = class105.field1684 = new class165(this, arg0, (String) null, 0);
                    }
                    class163 var7 = class105.field1684.method1133(1, this, (byte) 112);
                    while (var7.field2589 == 0) {
                        class43.method358(10L, false);
                    }
                }
            } else {
                class215.field3512++;
                if (class215.field3512 >= 3) {
                    this.method1251(false, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class178.method1211((String) null, -109, var9);
            this.method1251(false, "crash");
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public final synchronized void method1260(int arg0) {
        if (class155.field2511 != null) {
            class155.field2511.removeFocusListener(this);
            class155.field2511.getParent().remove(class155.field2511);
        }
        Container var2;
        if (class77.field1234 != null) {
            var2 = class77.field1234;
        } else if (class110.field1811 == null) {
            var2 = class105.field1684.field2620;
        } else {
            var2 = class110.field1811;
        }
        field2918++;
        var2.setLayout((LayoutManager) null);
        class155.field2511 = new class231(this);
        var2.add(class155.field2511);
        class155.field2511.setSize(class84.field1326, class279.field4423);
        class155.field2511.setVisible(true);
        if (arg0 != -2) {
            this.field2921 = true;
        }
        if (class110.field1811 == var2) {
            Insets var3 = class110.field1811.getInsets();
            class155.field2511.setLocation(var3.left + class236.field3842, class198.field3163 + var3.top);
        } else {
            class155.field2511.setLocation(class236.field3842, class198.field3163);
        }
        class155.field2511.addFocusListener(this);
        class155.field2511.requestFocus();
        class167.field2654 = true;
        class56.field963 = true;
        class245.field3923 = true;
        class36.field715 = false;
        class170.field2704 = class276.method1861((byte) 122);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public abstract void method1085(int arg0);

    @OriginalMember(owner = "client!da", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2922++;
        if (class257.field4094 != this || class175.field2753) {
            return;
        }
        class245.field3923 = true;
        if (class215.field3510 && (class276.method1861((byte) 122) - class170.field2704) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class255.field4048 <= var2.width && class258.field4099 <= var2.height) {
                class36.field715 = true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
    private final void method1261(int arg0, boolean arg1) {
        field2914++;
        synchronized (this) {
            if (class175.field2753) {
                return;
            }
            class175.field2753 = true;
        }
        if (class105.field1684.field2620 != null) {
            class105.field1684.field2620.destroy();
        }
        try {
            this.method1090(true);
        } catch (Exception var9) {
        }
        if (class155.field2511 != null) {
            try {
                class155.field2511.removeFocusListener(this);
                class155.field2511.getParent().remove(class155.field2511);
            } catch (Exception var8) {
            }
        }
        if (class105.field1684 != null) {
            try {
                class105.field1684.method1145(9);
            } catch (Exception var7) {
            }
        }
        this.method1081(0);
        if (class110.field1811 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
        if (arg0 < 118) {
            this.field2921 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2916++;
    }

    @OriginalMember(owner = "client!da", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2904++;
    }

    @OriginalMember(owner = "client!da", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2936++;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
    public abstract void method1081(int arg0);

    @OriginalMember(owner = "client!da", name = "run", descriptor = "()V")
    public final void run() {
        field2912++;
        try {
            if (class165.field2614 != null) {
                String var1 = class165.field2614.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class165.field2613;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1251(false, "wrongjava");
                        return;
                    }
                    class12.field235 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class165.field2613 == null || class165.field2613.equals("1.4.2"))) {
                    this.method1251(false, "wrongjava");
                    return;
                }
            }
            if (class165.field2613 != null && class165.field2613.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (class165.field2613.length() > var4) {
                    char var5 = class165.field2613.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 - (48 - var5);
                }
                if (var3 >= 5) {
                    class215.field3510 = true;
                }
            }
            if (class105.field1684.field2620 != null) {
                Method var6 = class165.field2625;
                if (var6 != null) {
                    try {
                        var6.invoke(class105.field1684.field2620, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class260.method1777(-119);
            this.method1260(-2);
            class79.field1263 = class144.method990(4096, class155.field2511, class84.field1326, class279.field4423);
            this.method1082((byte) 121);
            class17.field292 = class73.method520((byte) 114);
            while (class11.field158 == 0L || class11.field158 > class276.method1861((byte) 122)) {
                class25.field417 = class17.field292.method402((byte) 85, class41.field769, class12.field235);
                for (int var7 = 0; var7 < class25.field417; var7++) {
                    this.method1256((byte) 117);
                }
                this.method1257(2189);
                class231.method1620((byte) 68, class155.field2511, class105.field1684);
            }
        } catch (Exception var10) {
            class178.method1211((String) null, -123, var10);
            this.method1251(false, "crash");
        }
        this.method1261(124, true);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public abstract void method1094(boolean arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public static final void method1262(int arg0, int arg1) {
        class259 var2 = class213.method1464((byte) -114, arg1, 12);
        if (arg0 < -35) {
            var2.method1772((byte) 122);
            field2930++;
        }
    }
}
