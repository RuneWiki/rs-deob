import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!gd")
public abstract class class358 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Z")
    private boolean field5746 = false;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Z")
    private boolean field5769 = false;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "[Ljava/lang/String;")
    private static final String[] field5798 = new String[] { method2971(method2970("Vcd~aEW+ke\\b>|v\u0019")), method2971(method2970("_r&u")), method2971(method2970("J)d7y")), method2971(method2970("Vcdiv^q#}a}h+}aCF:ihTsb")), method2971(method2970("Vcd]E\u0019")), method2971(method2970("[f-mlTh8x")), method2971(method2970("Vcd~aEC%zq\\b$mFPt/1")), method2971(method2970("Vcdnm_c%nKAb$|`\u0019")), method2971(method2970("VcdO,")), method2971(method2970("Vcd}aBs8v}\u0019")), method2971(method2970("VcdQE\u0019")), method2971(method2970("]h-~aUh?m")), method2971(method2970("VcdPE\u0019")), method2971(method2970("ns%i")), method2971(method2970("\u001fp9")), method2971(method2970("Tu8vvn`+tan")), method2971(method2970("VcdltUf>|,")), method2971(method2970("Vcdnm_c%nG]h9|`\u0019")), method2971(method2970("Vcdnm_c%n@Tn)vjXa#|`\u0019")), method2971(method2970("Vcdnm_c%nMRh$pbXb.1")), method2971(method2970("Fu%wc[f<x")), method2971(method2970("\u0000)~76")), method2971(method2970("\u0000)x")), method2971(method2970("\u0000){")), method2971(method2970("\u0000)x7")), method2971(method2970("Pw:ua")), method2971(method2970("Vcdkq_/")), method2971(method2970("Ru+jl")), method2971(method2970("Xe'")), method2971(method2970("\u0000)")), method2971(method2970("\u0000){7")), method2971(method2970("Br$")), method2971(method2970("VcdjpPu>1")), method2971(method2970("Vcd\u007fkRr9^eXi/},")), method2971(method2970("Vcd^,")), method2971(method2970("Vcd~aEF:ihTs\tvjEb2m,")), method2971(method2970("VcdRE\u0019")), method2971(method2970("VcdVE\u0019")), method2971(method2970("Vcd\\E\u0019")), method2971(method2970("Bs/uhPu.xs_))vi")), method2971(method2970("\u00005}74\u001f7d(")), method2971(method2970("\u001ft>|h]f8}eFidzk\\")), method2971(method2970("\u0000>x75\u0007?d(*")), method2971(method2970("\u001fu?waBd+ia\u001fd%t")), method2971(method2970("Xi<xhXc\"vwE")), method2971(method2970("[f-||\u001fd%t")), method2971(method2970("\u001fm+~aI))vi")), method2971(method2970("Cr$|wRf:|*Rh'")), method2971(method2970("VcdieXi>1")), method2971(method2970("Vcd\u007fkRr9UkBsb")), method2971(method2970("{f-||")), method2971(method2970("VcdWE\u0019")), method2971(method2970("bo?m`^p$9g^j:uaEbj4$Rk/xj\u000b")), method2971(method2970("Vcd^E\u0019")), method2971(method2970("bo?m`^p$9wEf8m$\u001c')uaPip")), method2971(method2970("VcdTE\u0019")), method2971(method2970("Vcdnm_c%nG]h9pjV/")), method2971(method2970("Vcdjp^wb")), method2971(method2970("Vcdnm_c%nERs#oeEb.1")), method2971(method2970("VcdUE\u0019")), method2971(method2970("[f)umS")), method2971(method2970("[f-tmBd")), method2971(method2970("VcdSE\u0019")), method2971(method2970("Vcdnm_c%n@Tf)mmGf>|`\u0019")), method2971(method2970("nt/ub")), method2971(method2970("Pk8|eU~&veUb.")), method2971(method2970("Vcd_E\u0019")) };

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Llb;")
    public static class570 field5764 = new class570();

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lpe;")
    public static class636 field5778 = new class636(11, 0, 1, 2);

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Z")
    public static boolean field5781;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Z")
    public static boolean field5782;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "Z")
    public static boolean field5787;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Z")
    public static boolean field5788;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "Z")
    public static boolean field5789;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Z")
    public static boolean field5790;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "Z")
    public static boolean field5793;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Z")
    public static boolean field5795;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Z")
    public static boolean field5796;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Z")
    public static boolean field5797;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(B)V")
    public static void method2958(byte arg0) {
        try {
            field5764 = null;
            if (arg0 != -124) {
                provideLoaderApplet(null);
            }
            field5778 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5798[55] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)Ljava/lang/String;")
    public String method2714(int arg0) {
        try {
            if (arg0 != 16383) {
                this.method2720((byte) -97);
            }
            field5751++;
            return null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        try {
            field5753++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[63] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2959(int arg0, String arg1) {
        try {
            field5763++;
            if (!this.field5746) {
                this.field5746 = true;
                System.out.println(field5798[15] + arg1);
                try {
                    if (arg0 < 122) {
                        return;
                    }
                    class470.method3617((byte) -113, class476.field7255, field5798[11]);
                } catch (Throwable var5) {
                }
                try {
                    this.getAppletContext().showDocument(new URL(this.getCodeBase(), field5798[15] + arg1 + field5798[14]), field5798[13]);
                } catch (Exception var4) {
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5798[12] + arg0 + ',' + (arg1 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        try {
            field5755++;
            if (class517.field7660 == null) {
                return class476.field7255 == null || class476.field7255 == this ? super.getAppletContext() : class476.field7255.getAppletContext();
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5798[35] + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field5761++;
            try {
                if (class61.field814 != null) {
                    String var1 = class61.field814.toLowerCase();
                    if (var1.indexOf(field5798[31]) != -1 || var1.indexOf(field5798[25]) != -1) {
                        String var2 = class61.field803;
                        if (var2.equals(field5798[23]) || var2.startsWith(field5798[30]) || var2.equals(field5798[22]) || var2.startsWith(field5798[24])) {
                            this.method2959(127, field5798[20]);
                            return;
                        }
                    } else if (var1.indexOf(field5798[28]) != -1 && (class61.field803 == null || class61.field803.equals(field5798[21]))) {
                        this.method2959(123, field5798[20]);
                        return;
                    }
                }
                if (class61.field803 != null && class61.field803.startsWith(field5798[29])) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class61.field803.length()) {
                        char var5 = class61.field803.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + (var5 - '0');
                        var3++;
                    }
                    if (var4 >= 5) {
                        class64.field892 = true;
                    }
                }
                Applet var6 = class540.field7955;
                if (class476.field7255 != null) {
                    var6 = class476.field7255;
                }
                Method var7 = class61.field791;
                if (var7 != null) {
                    try {
                        var7.invoke(var6, Boolean.TRUE);
                    } catch (Throwable var20) {
                    }
                }
                class145.method1335((byte) -108);
                class780.method5601(0);
                this.method2708(58);
                this.method2716(76);
                class748.field11042 = class588.method4320(123);
                while (client.field5165 == 0L || client.field5165 > class712.method5167(-2334)) {
                    class715.field10351 = class748.field11042.method4773((byte) 91, class404.field6405);
                    for (int var8 = 0; var8 < class715.field10351; var8++) {
                        this.method2964((byte) 93);
                    }
                    this.method2960(50);
                    class225.method1980(class393.field6256, class442.field6902, -38);
                }
            } catch (ThreadDeath var21) {
                throw var21;
            } catch (Throwable var22) {
                class622.method4544(var22, this.method2714(16383), true);
                this.method2959(126, field5798[27]);
            } finally {
                Object var14 = null;
                this.method2966(0, true);
            }
        } catch (RuntimeException var24) {
            throw class590.method4333(var24, field5798[26] + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field5773++;
        if (class517.field7660 == null) {
            return class476.field7255 == null || class476.field7255 == this ? super.getCodeBase() : class476.field7255.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
    private final void method2960(int arg0) {
        try {
            field5750++;
            long var2 = class712.method5167(-2334);
            long var4 = class71.field997[class87.field1302];
            class71.field997[class87.field1302] = var2;
            class87.field1302 = class87.field1302 + 1 & 0x1F;
            if (var4 != 0L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class43.field481 = ((var6 >> 1) + 32000) / var6;
            }
            if (arg0 < class369.field5985++) {
                class369.field5985 -= 50;
                class47.field544 = true;
                class442.field6902.setSize(class64.field881, class333.field5444);
                class442.field6902.setVisible(true);
                if (class517.field7660 != null && class82.field1247 == null) {
                    Insets var7 = class517.field7660.getInsets();
                    class442.field6902.setLocation(class687.field9928 + var7.left, class250.field3835 + var7.top);
                } else {
                    class442.field6902.setLocation(class687.field9928, class250.field3835);
                }
            }
            this.method2718((byte) -5);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5798[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        try {
            class710.field10282 = false;
            field5757++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[49] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        try {
            field5777++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[17] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        try {
            field5771++;
            class476.field7255 = arg0;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5798[3] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public abstract void method2718(byte arg0);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(B)V")
    public abstract void method2720(byte arg0);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public abstract void method2699(byte arg0);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Z")
    public final boolean method2961(int arg0) {
        try {
            field5747++;
            if (arg0 != -4) {
                this.field5769 = true;
            }
            return class259.method2177((byte) -72, field5798[60]);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[59] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Z")
    public final boolean method2962(int arg0) {
        try {
            field5759++;
            return arg0 == 0 ? class259.method2177((byte) -72, field5798[61]) : false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[62] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "stop", descriptor = "()V")
    public final void stop() {
        try {
            field5760++;
            if (class540.field7955 == this && !class213.field3361) {
                client.field5165 = class712.method5167(-2334) + 4000L;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5798[57] + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        try {
            field5766++;
            if (class517.field7660 == null) {
                return class476.field7255 == null || class476.field7255 == this ? super.getParameter(arg0) : class476.field7255.getParameter(arg0);
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[0] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method2963(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field5748++;
            try {
                if (class540.field7955 == null) {
                    class400.field6326 = class476.field7255;
                    class64.field881 = arg4;
                    class413.field6568 = arg4;
                    class333.field5444 = arg2;
                    class464.field7131 = arg2;
                    class413.field6572 = arg6;
                    class540.field7955 = this;
                    class687.field9928 = 0;
                    class250.field3835 = 0;
                    class53.field664 = class393.field6256 = new class61(arg1, arg0, arg3, class476.field7255 != null);
                    class218 var8 = class393.field6256.method643(this, 1, 22);
                    while (var8.field3402 == 0) {
                        class524.method3918(-4, 10L);
                    }
                    if (arg5 != -1) {
                        this.windowOpened(null);
                    }
                } else {
                    class386.field6187++;
                    if (class386.field6187 >= 3) {
                        this.method2959(125, field5798[65]);
                    } else {
                        this.getAppletContext().showDocument(this.getDocumentBase(), field5798[64]);
                    }
                }
            } catch (Throwable var11) {
                class622.method4544(var11, null, true);
                this.method2959(125, field5798[27]);
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field5798[66] + (arg0 == null ? field5798[1] : field5798[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    private final void method2964(byte arg0) {
        try {
            field5742++;
            long var2 = class712.method5167(-2334);
            long var4 = class449.field6973[class572.field8279];
            class449.field6973[class572.field8279] = var2;
            boolean var10000;
            if (var4 == 0L || var2 <= var4) {
                var10000 = false;
            } else {
                var10000 = true;
            }
            class572.field8279 = class572.field8279 + 1 & 0x1F;
            synchronized (this) {
                class198.field3143 = class710.field10282;
            }
            if (arg0 == 93) {
                this.method2699((byte) 25);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5798[37] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
    public abstract void method2701(byte arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
    public final boolean method2965(int arg0) {
        try {
            field5762++;
            if (arg0 != 0) {
                field5778 = null;
            }
            return class259.method2177((byte) -72, field5798[5]);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    private final void method2966(int arg0, boolean arg1) {
        try {
            field5770++;
            synchronized (this) {
                if (class213.field3361) {
                    return;
                }
                class213.field3361 = true;
            }
            System.out.println(field5798[54] + arg1);
            if (class476.field7255 != null) {
                class476.field7255.destroy();
            }
            try {
                this.method2701((byte) -68);
            } catch (Exception var10) {
            }
            if (this.field5769) {
                try {
                    jagmisc.quit();
                } catch (Throwable var9) {
                }
                this.field5769 = false;
            }
            class377.method3101(arg0, true);
            client.method2712(-13055);
            if (class442.field6902 != null) {
                try {
                    class442.field6902.removeFocusListener(this);
                    class442.field6902.getParent().remove(class442.field6902);
                } catch (Exception var8) {
                }
            }
            if (class393.field6256 != null) {
                try {
                    class393.field6256.method632(arg0 + 124);
                } catch (Exception var7) {
                }
            }
            this.method2720((byte) 71);
            if (class517.field7660 != null) {
                class517.field7660.setVisible(false);
                class517.field7660.dispose();
                class517.field7660 = null;
            }
            System.out.println(field5798[52] + arg1);
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field5798[53] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        try {
            field5752++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[18] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        try {
            field5776++;
            if (class540.field7955 == this && !class213.field3361) {
                client.field5165 = class712.method5167(-2334);
                class524.method3918(-4, 5000L);
                class53.field664 = null;
                this.method2966(0, false);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5798[9] + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public abstract void method2716(int arg0);

    @OriginalMember(owner = "client!gd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        try {
            field5743++;
            if (class540.field7955 == this && !class213.field3361) {
                class47.field544 = true;
                if (class64.field892 && (class712.method5167(-2334) - class223.field3500) > 1000L) {
                    Rectangle var2 = arg0.getClipBounds();
                    if (var2 == null || var2.width >= class413.field6568 && var2.height >= class464.field7131) {
                        class586.field8497 = true;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5798[48] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        try {
            field5774++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[19] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        try {
            field5744++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[7] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        try {
            field5749++;
            this.destroy();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[56] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "start", descriptor = "()V")
    public final void start() {
        try {
            field5756++;
            if (class540.field7955 == this && !class213.field3361) {
                client.field5165 = 0L;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5798[32] + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public synchronized void method2708(int arg0) {
        try {
            field5758++;
            if (class442.field6902 != null) {
                class442.field6902.removeFocusListener(this);
                class442.field6902.getParent().setBackground(Color.black);
                class442.field6902.getParent().remove(class442.field6902);
            }
            if (arg0 < 57) {
                this.getDocumentBase();
            }
            Container var2;
            if (class82.field1247 != null) {
                var2 = class82.field1247;
            } else if (class517.field7660 != null) {
                var2 = class517.field7660;
            } else if (class476.field7255 == null) {
                var2 = class540.field7955;
            } else {
                var2 = class476.field7255;
            }
            var2.setLayout(null);
            class442.field6902 = new class327(this);
            var2.add(class442.field6902);
            class442.field6902.setSize(class64.field881, class333.field5444);
            class442.field6902.setVisible(true);
            if (class517.field7660 == var2) {
                Insets var3 = class517.field7660.getInsets();
                class442.field6902.setLocation(var3.left + class687.field9928, var3.top - -class250.field3835);
            } else {
                class442.field6902.setLocation(class687.field9928, class250.field3835);
            }
            class442.field6902.addFocusListener(this);
            class442.field6902.requestFocus();
            class198.field3143 = true;
            class710.field10282 = true;
            class47.field544 = true;
            class586.field8497 = false;
            class223.field3500 = class712.method5167(-2334);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5798[34] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        try {
            field5745++;
            this.paint(arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[16] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        try {
            field5772++;
            class710.field10282 = true;
            class47.field544 = true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[33] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        try {
            field5768++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5798[58] + (arg0 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIBIIILjava/lang/String;)V")
    public final void method2967(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, String arg7) {
        try {
            try {
                class64.field881 = arg6;
                class413.field6568 = arg6;
                class250.field3835 = 0;
                class413.field6572 = arg2;
                class333.field5444 = arg0;
                class464.field7131 = arg0;
                class400.field6326 = null;
                class540.field7955 = this;
                class687.field9928 = 0;
                class517.field7660 = new Frame();
                class517.field7660.setTitle(field5798[50]);
                class517.field7660.setResizable(true);
                class517.field7660.addWindowListener(this);
                class517.field7660.setVisible(true);
                class517.field7660.toFront();
                if (arg3 < 3) {
                    return;
                }
                Insets var9 = class517.field7660.getInsets();
                class517.field7660.setSize(class413.field6568 + var9.left + var9.right, class464.field7131 - (-var9.top + -var9.bottom));
                class53.field664 = class393.field6256 = new class61(arg5, arg7, arg4, true);
                class218 var10 = class393.field6256.method643(this, 1, 22);
                while (var10.field3402 == 0) {
                    class524.method3918(-4, 10L);
                }
            } catch (Exception var13) {
                class622.method4544(var13, null, true);
            }
            field5765++;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field5798[51] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field5798[1] : field5798[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        try {
            field5767++;
            if (class517.field7660 == null) {
                return class476.field7255 == null || class476.field7255 == this ? super.getDocumentBase() : class476.field7255.getDocumentBase();
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5798[6] + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Z")
    public final boolean method2968(byte arg0) {
        try {
            field5775++;
            String var2 = this.getDocumentBase().getHost().toLowerCase();
            if (var2.equals(field5798[45]) || var2.endsWith(field5798[46])) {
                return true;
            } else if (var2.equals(field5798[47]) || var2.endsWith(field5798[43])) {
                return true;
            } else {
                if (arg0 <= 44) {
                    field5778 = null;
                }
                if (var2.equals(field5798[39]) || var2.endsWith(field5798[41])) {
                    return true;
                } else if (var2.endsWith(field5798[40])) {
                    return true;
                } else {
                    while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                        var2 = var2.substring(0, var2.length() - 1);
                    }
                    if (var2.endsWith(field5798[42])) {
                        return true;
                    } else {
                        this.method2959(125, field5798[44]);
                        return false;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5798[38] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(B)V")
    public static final void method2969(byte arg0) {
        try {
            field5754++;
            if (arg0 == 104 && class116.field1694 != null) {
                class116.field1694 = null;
                class481.method3669(class270.field4346, class541.field7977, class452.field6990, class630.field9060, arg0 - 104);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5798[36] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2970(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2971(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
