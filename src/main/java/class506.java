import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class506 extends class372 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Ldm;")
    private class46 field7066 = new class46();

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Ldm;")
    private class46 field7083 = new class46();

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Z")
    private boolean field7084;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lej;")
    public static class104 field7054 = new class104("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    private int field7053;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    private int field7058;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    private int field7070;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    private int field7077;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    private int field7079;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    private int field7081;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lha;")
    public static class52 field7057;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "Ljava/awt/Component;")
    private Component field7085;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
    public final boolean method2150(int arg0) {
        field7076++;
        if (arg0 != 6244) {
            this.field7077 = 5;
        }
        return (this.field7058 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
    public final synchronized void method2146(byte arg0) {
        this.field7058 = this.field7079;
        field7051++;
        this.field7053 = this.field7081;
        this.field7070 = this.field7077;
        class46 var2 = this.field7066;
        this.field7066 = this.field7083;
        this.field7083 = var2;
        if (arg0 > -1) {
            this.field7085 = null;
        }
        this.field7083.method465(true);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2926(Component arg0, int arg1) {
        field7059++;
        if (arg1 < 92) {
            method2932(24, -121, 4, 42, -105, (byte) 5, -119, 73, 92, 1);
        }
        this.method2934(7934);
        this.field7085 = arg0;
        this.field7085.addMouseListener(this);
        this.field7085.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
    public final boolean method2155(boolean arg0) {
        if (arg0) {
            this.field7084 = false;
        }
        field7073++;
        return (this.field7058 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2930(arg0.getY(), arg0.getX(), 1183);
        field7086++;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)I")
    public final int method2152(int arg0) {
        if (arg0 == 0) {
            field7074++;
            return this.field7053;
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)I")
    public final int method2153(byte arg0) {
        int var2 = -8 / ((25 - arg0) / 52);
        field7068++;
        return this.field7070;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIZ)V")
    private final void method2927(int arg0, int arg1, int arg2, boolean arg3) {
        field7065++;
        class139 var5 = new class139();
        var5.field2170 = arg2;
        var5.field2172 = arg1;
        var5.field2166 = arg0;
        var5.field2165 = class488.method2835(30160);
        this.field7083.method463(var5, -111);
        if (!arg3) {
            this.method2930(-59, -28, -120);
        }
    }

    @OriginalMember(owner = "client!ia", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field7075++;
        int var2 = this.method2933(1, arg0);
        if ((var2 & this.field7079) == 0) {
            var2 = this.field7079;
        }
        if ((var2 & 0x1) != 0) {
            this.method2927(arg0.getX(), arg0.getY(), 3, true);
        }
        if ((var2 & 0x4) != 0) {
            this.method2927(arg0.getX(), arg0.getY(), 5, true);
        }
        if ((var2 & 0x2) != 0) {
            this.method2927(arg0.getX(), arg0.getY(), 4, true);
        }
        this.field7079 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public static void method2928(int arg0) {
        field7057 = null;
        field7054 = null;
        if (arg0 != -2) {
            field7057 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2930(arg0.getY(), arg0.getX(), 1183);
        field7069++;
    }

    @OriginalMember(owner = "client!ia", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field7078++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[Lmc;IIIIII)V")
    public static final void method2929(int arg0, int arg1, int arg2, class114[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class69.field1165.method1308(arg7, arg9, arg2, arg8);
        field7052++;
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class114 var11 = arg3[var10];
            if (var11 != null && (var11.field1897 == arg1 || arg1 == -1412584499 && class137.field2159 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class564.field7815[class628.field9187].setBounds(var11.field1767 + arg0, var11.field1814 + arg6, var11.field1853, var11.field1769);
                    var12 = class628.field9187++;
                } else {
                    var12 = arg4;
                }
                var11.field1871 = class405.field5763;
                var11.field1768 = var12;
                if (!client.method1554(var11)) {
                    if (var11.field1901 != 0) {
                        class22.method254(var11, arg5 ^ 0x2A);
                    }
                    int var13 = var11.field1767 + arg0;
                    int var14 = var11.field1814 + arg6;
                    int var15 = var11.field1913;
                    if (class168.field2427 && (client.method1534(var11).field6963 != 0 || var11.field1880 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class137.field2159 == var11) {
                        if (arg1 != -1412584499 && (class69.field1167 == var11.field1857 || class206.field2894 == var11.field1857)) {
                            class218.field3108 = arg3;
                            class522.field7350 = arg6;
                            class26.field462 = arg0;
                            continue;
                        }
                        if (class457.field6442 && class604.field8712) {
                            int var16 = class602.field8697.method2153((byte) 120);
                            int var17 = class602.field8697.method2152(0);
                            int var18 = var17 - class94.field1453;
                            int var19 = var16 - class376.field5059;
                            if (var19 < class131.field2099) {
                                var19 = class131.field2099;
                            }
                            if (class131.field2099 + class638.field9294.field1853 < var11.field1853 + var19) {
                                var19 = class131.field2099 + class638.field9294.field1853 - var11.field1853;
                            }
                            if (class185.field2600 > var18) {
                                var18 = class185.field2600;
                            }
                            if ((class185.field2600 + class638.field9294.field1769) < (var11.field1769 + var18)) {
                                var18 = class185.field2600 + class638.field9294.field1769 - var11.field1769;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (class206.field2894 == var11.field1857) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1880 == 2) {
                        var20 = arg2;
                        var21 = arg9;
                        var22 = arg8;
                        var23 = arg7;
                    } else {
                        int var24 = var11.field1853 + var13;
                        int var25 = var11.field1769 + var14;
                        var21 = var14 <= arg9 ? arg9 : var14;
                        var23 = arg7 < var13 ? var13 : arg7;
                        if (var11.field1880 == 9) {
                            var25++;
                            var24++;
                        }
                        var20 = var24 >= arg2 ? arg2 : var24;
                        var22 = arg8 <= var25 ? arg8 : var25;
                    }
                    if (var20 > var23 && var21 < var22) {
                        if (var11.field1901 != 0) {
                            if (class13.field189 == var11.field1901 || class576.field7930 == var11.field1901) {
                                class310.method1944(var11.field1853, var14, var13, (byte) 6, class576.field7930 == var11.field1901, var11.field1769);
                                class48.field940[var12] = true;
                                class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                continue;
                            }
                            if (class200.field2814 == var11.field1901) {
                                if (var11.method810(false, class69.field1165) != null) {
                                    class184.method1146(arg5 ^ 0x76);
                                    class615.method3593(var11, class69.field1165, false, var14, var13);
                                    class18.field226[var12] = true;
                                    class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                }
                                continue;
                            }
                            if (class447.field6346 == var11.field1901) {
                                if (var11.method810(false, class69.field1165) != null) {
                                    class534.method3069(var11, (byte) 29, var13, var14);
                                    class18.field226[var12] = true;
                                    class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                }
                                continue;
                            }
                            if (class412.field5800 == var11.field1901) {
                                class286.method1829(var13, class60.field1065, var14, 1, class69.field1165, var11.field1853, var11.field1769);
                                class48.field940[var12] = true;
                                class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                continue;
                            }
                            if (class596.field8617 == var11.field1901) {
                                class454.method2665(var11.field1769, var14, var13, (byte) -116, class69.field1165, var11.field1853);
                                class48.field940[var12] = true;
                                class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                continue;
                            }
                            if (class92.field1430 == var11.field1901) {
                                if (!class137.field2157 && !class272.field3789) {
                                    continue;
                                }
                                int var26 = var11.field1853 + var13;
                                int var27 = var14 + 15;
                                if (class137.field2157) {
                                    int var28 = -256;
                                    if (class583.field8079 < 20) {
                                        var28 = -65536;
                                    }
                                    class206.field2905.method674(var26, var28, (byte) -109, -1, var27, "Fps:" + class583.field8079);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                        if (class597.field8629) {
                                            class532.method3059((byte) -68);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class176.method1116("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", true);
                                            }
                                        }
                                    }
                                    class206.field2905.method674(var26, var31, (byte) -121, -1, var27, "Mem:" + var30 + "k");
                                    var27 += 15;
                                    class206.field2905.method674(var26, -256, (byte) 70, -1, var27, "In:" + class57.field1012 + "B/s Out:" + class302.field4128 + "B/s");
                                    var27 += 15;
                                    int var33 = class69.field1165.method1286() / 1024;
                                    class206.field2905.method674(var26, var33 > 65536 ? -65536 : -256, (byte) 52, -1, var27, "Offheap:" + var33 + "k");
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 32; var37++) {
                                        var34 += class223.field3188[var37].method1717(4);
                                        var35 += class223.field3188[var37].method1725(-91);
                                        var36 += class223.field3188[var37].method1726((byte) 124);
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class474.method2752(0, true, (long) var39, 2, -32768) + "% (" + var38 + "%)";
                                    class503.field6998.method674(var26, -256, (byte) -63, -1, var27, var40);
                                    var27 += 12;
                                }
                                if (class23.field329 > 0) {
                                    class503.field6998.method674(var26, -256, (byte) 55, -1, var27, "Particles: " + class388.field5238 + " / " + class23.field329);
                                }
                                var27 += 12;
                                if (class272.field3789) {
                                    class503.field6998.method674(var26, -256, (byte) -68, -1, var27, "Polys: " + class69.field1165.method1339() + " Models: " + class69.field1165.method1287());
                                    var27 += 12;
                                    class503.field6998.method674(var26, -256, (byte) -106, -1, var27, "Ls: " + class393.field5537 + " La: " + class509.field7110 + " NPC: " + class467.field6575 + " Pl: " + class552.field7625);
                                    class490.method2843((byte) -61);
                                    var27 += 12;
                                }
                                class48.field940[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field1880 == 0) {
                            if (class403.field5737 == var11.field1901 && class69.field1165.method1328()) {
                                class69.field1165.method1268(var13, var14, var11.field1853, var11.field1769);
                            }
                            method2929(var13 - var11.field1800, var11.field1810, var20, arg3, var12, 9, var14 - var11.field1904, var23, var22, var21);
                            if (var11.field1886 != null) {
                                method2929(var13 - var11.field1800, var11.field1810, var20, var11.field1886, var12, 9, var14 - var11.field1904, var23, var22, var21);
                            }
                            class128 var41 = (class128) class211.field2971.method1242(arg5 - 9, (long) var11.field1810);
                            if (var41 != null) {
                                class434.method2579(var41.field2065, var23, var20, var12, var13, (byte) -2, var14, var21, var22);
                            }
                            if (class403.field5737 == var11.field1901 && class69.field1165.method1328()) {
                                class69.field1165.method1342();
                                class374.field5039 = true;
                            }
                            class69.field1165.method1308(arg7, arg9, arg2, arg8);
                        }
                        if (class201.field2818[var12] || class597.field8622 > 1) {
                            if (var11.field1880 == 3) {
                                if (var15 == 0) {
                                    if (var11.field1766) {
                                        class69.field1165.method1321(var13, var14, var11.field1853, var11.field1769, var11.field1757, 0);
                                    } else {
                                        class69.field1165.method1325(var13, var14, var11.field1853, var11.field1769, var11.field1757, 0);
                                    }
                                } else if (var11.field1766) {
                                    class69.field1165.method1321(var13, var14, var11.field1853, var11.field1769, var11.field1757 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class69.field1165.method1325(var13, var14, var11.field1853, var11.field1769, 255 - (var15 & 0xFF) << 24 | var11.field1757 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field1880 == 4) {
                                class91 var42 = var11.method814(38, class69.field1165);
                                if (var42 != null) {
                                    int var43 = var11.field1757;
                                    String var44 = var11.field1898;
                                    if (var11.field1787 != -1) {
                                        class621 var45 = class181.field2574.method866(var11.field1787, (byte) 79);
                                        var44 = var45.field8924;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field8948 == 1 || var11.field1867 != 1) && var11.field1867 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class429.method2554(0, var11.field1867);
                                        }
                                    }
                                    if (class615.field8838 == var11) {
                                        var44 = class263.field3679.method739(class173.field2491, arg5 ^ 0xFFFFFFC4);
                                        var43 = var11.field1757;
                                    }
                                    if (class555.field7649) {
                                        class69.field1165.method1303(var13, var14, var11.field1853 + var13, var11.field1769 + var14);
                                    }
                                    var42.method670(class257.field3566, var11.field1862 ? 255 - (var15 & 0xFF) << 24 : -1, null, var13, 91, 255 - (var15 & 0xFF) << 24 | var43, var11.field1769, null, var11.field1853, 0, var11.field1874, var11.field1793, var44, var11.field1832, var14, 0, var11.field1877);
                                    if (class555.field7649) {
                                        class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                    }
                                } else if (class608.field8766) {
                                    class403.method2407(var11, -9130);
                                }
                            } else if (var11.field1880 == 5) {
                                if (var11.field1828 < 0) {
                                    class52 var46;
                                    if (var11.field1787 == -1) {
                                        var46 = var11.method806(class69.field1165, arg5 ^ 0x764B);
                                    } else {
                                        class101 var47 = var11.field1809 ? class645.field9372.field2651 : null;
                                        var46 = class181.field2574.method868(var11.field1807 | 0xFF000000, 105, var11.field1861, var47, var11.field1867, class69.field1165, var11.field1785, var11.field1787);
                                    }
                                    if (var46 != null) {
                                        int var48 = var46.method419();
                                        int var49 = var46.method432();
                                        int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field1757 == 0 ? 16777215 : var11.field1757 & 0xFFFFFF);
                                        if (var11.field1760) {
                                            class69.field1165.method1303(var13, var14, var11.field1853 + var13, var11.field1769 + var14);
                                            if (var11.field1912 != 0) {
                                                int var51 = (var11.field1853 + var48 - 1) / var48;
                                                int var52 = (var49 - (1 - var11.field1769)) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field1757 == 0) {
                                                            var46.method500((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field1912);
                                                        } else {
                                                            var46.method498((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field1912, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field1757 == 0 && var15 == 0) {
                                                var46.method495(var13, var14, var11.field1853, var11.field1769);
                                            } else {
                                                var46.method426(var13, var14, var11.field1853, var11.field1769, 0, var50, 1);
                                            }
                                            class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                        } else if (var11.field1757 == 0 && var15 == 0) {
                                            if (var11.field1912 != 0) {
                                                var46.method500((float) var11.field1853 / 2.0F + (float) var13, (float) var11.field1769 / 2.0F + (float) var14, var11.field1853 * 4096 / var48, var11.field1912);
                                            } else if (var11.field1853 == var48 && var11.field1769 == var49) {
                                                var46.method497(var13, var14);
                                            } else {
                                                var46.method499(var13, var14, var11.field1853, var11.field1769);
                                            }
                                        } else if (var11.field1912 != 0) {
                                            var46.method498((float) var11.field1853 / 2.0F + (float) var13, (float) var11.field1769 / 2.0F + (float) var14, var11.field1853 * 4096 / var48, var11.field1912, 0, var50, 1);
                                        } else if (var11.field1853 == var48 && var11.field1769 == var49) {
                                            var46.method421(var13, var14, 0, var50, 1);
                                        } else {
                                            var46.method423(var13, var14, var11.field1853, var11.field1769, 0, var50, 1);
                                        }
                                    } else if (class608.field8766) {
                                        class403.method2407(var11, -9130);
                                    }
                                } else {
                                    var11.method799(class303.field4141, false, class358.field4823).method1654(-1, var13, var11.field1831 << 3, var11.field1769, 0, var14, var11.field1853, 0, class69.field1165, var11.field1848 << 3);
                                }
                            } else if (var11.field1880 == 6) {
                                class6.method38((byte) 83);
                                class157 var55 = null;
                                int var56 = 0;
                                if (var11.field1787 != -1) {
                                    class621 var57 = class181.field2574.method866(var11.field1787, (byte) 79);
                                    if (var57 != null) {
                                        class621 var58 = var57.method3619(var11.field1867, (byte) -17);
                                        class78 var59 = var11.field1754 == -1 ? null : class331.field4418.method195(var11.field1754, (byte) 13);
                                        class101 var60 = var11.field1809 ? class645.field9372.field2651 : null;
                                        var55 = var58.method3626(2048, var11.field1804, 1, var11.field1891, var59, class69.field1165, (byte) 106, var11.field1838, var60);
                                        if (var55 == null) {
                                            class403.method2407(var11, -9130);
                                        } else {
                                            var56 = -var55.method133() >> 1;
                                        }
                                    }
                                } else if (var11.field1780 == 5) {
                                    int var61 = var11.field1820;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class188 var62 = class349.field4696[var61];
                                        class78 var63 = var11.field1754 == -1 ? null : class331.field4418.method195(var11.field1754, (byte) 13);
                                        if (var62 != null && (class97.field1472 == var61 || class168.method1074(var62.field2630, arg5 - 9) == var11.field1859)) {
                                            var55 = var62.field2651.method720(var11.field1838, null, class412.field5801, class263.field3678, var11.field1891, 2048, -1, null, true, class181.field2574, var63, class331.field4418, 0, (byte) 90, class189.field2681, class516.field7253, 0, class69.field1165, var11.field1804);
                                        }
                                    }
                                } else if (var11.field1780 == 8 || var11.field1780 == 9) {
                                    class133 var65 = class568.method3229(var11.field1820, (byte) -88, false);
                                    class78 var66 = var11.field1754 == -1 ? null : class331.field4418.method195(var11.field1754, (byte) 13);
                                    if (var65 != null) {
                                        class101 var67 = var11.field1809 ? class645.field9372.field2651 : null;
                                        var55 = var65.method900(var11.field1891, var11.field1859, var11.field1780 == 9, (byte) 61, var11.field1838, class69.field1165, 2048, var66, var11.field1804, var67);
                                    }
                                } else if (var11.field1754 == -1) {
                                    var55 = var11.method816(class189.field2681, -1, class69.field1165, class516.field7253, 2048, class412.field5801, class181.field2574, 0, arg5 ^ 0x9, null, class645.field9372.field2651, -1, class331.field4418, class263.field3678);
                                    if (var55 == null && class608.field8766) {
                                        class403.method2407(var11, arg5 ^ 0xFFFFDC5F);
                                    }
                                } else {
                                    class78 var64 = class331.field4418.method195(var11.field1754, (byte) 13);
                                    var55 = var11.method816(class189.field2681, var11.field1891, class69.field1165, class516.field7253, 2048, class412.field5801, class181.field2574, var11.field1838, 0, var64, class645.field9372.field2651, var11.field1804, class331.field4418, class263.field3678);
                                    if (var55 == null && class608.field8766) {
                                        class403.method2407(var11, -9130);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field1779 <= 0) {
                                        var68 = 512;
                                    } else {
                                        var68 = (var11.field1853 << 9) / var11.field1779;
                                    }
                                    int var69;
                                    if (var11.field1776 > 0) {
                                        var69 = (var11.field1769 << 9) / var11.field1776;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = (var11.field1892 * var68 >> 9) + var11.field1853 / 2 + var13;
                                    int var71 = (var11.field1905 * var69 >> 9) + var11.field1769 / 2 + var14;
                                    class333.field4459.method1045();
                                    class69.field1165.method1355(class333.field4459);
                                    class69.field1165.method1365(var70, var71, var68, var69);
                                    class69.field1165.method1333((float) (var11.field1751 << 0), var11.field1863 ? (float) (var11.field1902 << 0) : (float) (var11.field1902 << 0) * 1.5F);
                                    if (arg1 == -1412584499 || class374.field5039) {
                                        class69.field1165.method1269();
                                        class69.field1165.method1265();
                                        class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                        class374.field5039 = false;
                                    }
                                    if (var11.field1817) {
                                        class69.field1165.method1309(false);
                                    }
                                    int var72 = (var11.field1890 << 0) * class1.field2[var11.field1823 << 3] >> 15;
                                    int var73 = (var11.field1890 << 0) * class1.field7[var11.field1823 << 3] >> 15;
                                    class84.field1366.method1046(-var11.field1876 << 3);
                                    class84.field1366.method1048(var11.field1797 << 3);
                                    class84.field1366.method1051(var11.field1841 << 0, (var11.field1786 << 0) + var72 + var56, var73 - -(var11.field1786 << 0));
                                    class84.field1366.method1043(var11.field1823 << 3);
                                    if (class555.field7649) {
                                        class69.field1165.method1303(var13, var14, var13 + var11.field1853, var11.field1769 + var14);
                                    }
                                    if (var11.field1863) {
                                        var55.method127(class84.field1366, null, var11.field1890 << 0, 1);
                                    } else {
                                        var55.method154(class84.field1366, null, 1);
                                    }
                                    if (class555.field7649) {
                                        class69.field1165.method1308(arg7, arg9, arg2, arg8);
                                    }
                                    if (var11.field1817) {
                                        class69.field1165.method1309(true);
                                    }
                                    class69.field1165.method1333(0.0F, 0.0F);
                                }
                            } else if (var11.field1880 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field1794) {
                                    var74 = var11.field1853 + var13;
                                    var75 = var11.field1769 + var14;
                                    var76 = var14;
                                    var77 = var13;
                                } else {
                                    var74 = var11.field1853 + var13;
                                    var76 = var14 + var11.field1769;
                                    var77 = var13;
                                    var75 = var14;
                                }
                                if (var11.field1782 == 1) {
                                    class69.field1165.method1349(var77, var75, var74, var76, var11.field1757, 0);
                                } else {
                                    class69.field1165.method1278(var77, var75, var74, var76, var11.field1757, var11.field1782, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg5 != 9) {
            method2929(70, 86, -117, null, -111, 43, 11, -98, 26, 36);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    private final void method2930(int arg0, int arg1, int arg2) {
        if (arg2 != 1183) {
            method2931(9, -37, 87, -3, false);
        }
        this.field7081 = arg0;
        this.field7077 = arg1;
        field7061++;
        if (this.field7084) {
            this.method2927(arg1, arg0, -1, true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method2157(byte arg0) {
        this.method2934(7934);
        field7067++;
        if (arg0 > -21) {
            this.mouseMoved(null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIZ)Lmg;")
    public static final class128 method2931(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7062++;
        class128 var5 = new class128();
        var5.field2063 = arg3;
        var5.field2065 = arg0;
        class211.field2971.method1241(var5, (long) arg2, -127);
        if (arg1 != -16962) {
            method2931(-99, 24, 48, 94, false);
        }
        class501.method2901(arg0, 125);
        class114 var6 = class612.method3584(arg2, arg1 + 16962);
        if (var6 != null) {
            class403.method2407(var6, -9130);
        }
        if (class615.field8838 != null) {
            class403.method2407(class615.field8838, arg1 ^ 0x61E8);
            class615.field8838 = null;
        }
        class319.method1989(105);
        if (var6 != null) {
            class274.method1772((byte) -122, var6, !arg4);
        }
        if (!arg4) {
            class123.method849(arg0);
        }
        if (!arg4 && class56.field1005 != -1) {
            class625.method3650(1, class56.field1005, false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ia", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2930(arg0.getY(), arg0.getX(), 1183);
        field7064++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method2932(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field7072++;
        if (arg5 >= -111) {
            return;
        }
        if (arg4 == arg6 && arg0 == arg1 && arg3 == arg7 && arg2 == arg9) {
            class523.method3017(arg1, arg7, arg8, 1135, arg6, arg2);
            return;
        }
        int var10 = arg6;
        int var11 = arg1;
        int var12 = arg6 * 3;
        int var13 = arg1 * 3;
        int var14 = arg4 * 3;
        int var15 = arg0 * 3;
        int var16 = arg3 * 3;
        int var17 = arg9 * 3;
        int var18 = var14 + arg7 - var16 - arg6;
        int var19 = arg2 - (var17 - var15) - arg1;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = arg6 + (var29 + var31 + var27 >> 12);
            int var34 = (var28 + var30 + var32 >> 12) + arg1;
            class523.method3017(var11, var33, arg8, 1135, var10, var34);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2933(int arg0, MouseEvent arg1) {
        field7060++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else {
            if (arg0 != 1) {
                this.mouseReleased(null);
            }
            if (var5) {
                return 2;
            } else if (var6) {
                return 4;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Z")
    public final boolean method2151(byte arg0) {
        field7080++;
        if (arg0 < 33) {
            this.mouseEntered(null);
        }
        return (this.field7058 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2930(arg0.getY(), arg0.getX(), 1183);
        field7071++;
    }

    @OriginalMember(owner = "client!ia", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field7056++;
        int var2 = this.method2933(1, arg0);
        if (var2 == 1) {
            this.method2927(arg0.getX(), arg0.getY(), 0, true);
        } else if (var2 == 4) {
            this.method2927(arg0.getX(), arg0.getY(), 2, true);
        } else if (var2 == 2) {
            this.method2927(arg0.getX(), arg0.getY(), 1, true);
        }
        this.field7079 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    private final void method2934(int arg0) {
        field7055++;
        if (this.field7085 == null) {
            return;
        }
        this.field7085.removeMouseMotionListener(this);
        this.field7085.removeMouseListener(this);
        this.field7066 = null;
        this.field7070 = this.field7053 = this.field7058 = 0;
        if (arg0 != 7934) {
            this.mouseReleased(null);
        }
        this.field7083 = null;
        this.field7077 = this.field7081 = this.field7079 = 0;
        this.field7085 = null;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)Lbh;")
    public final class32 method2156(byte arg0) {
        field7082++;
        if (arg0 >= -108) {
            this.field7053 = -6;
        }
        return (class32) this.field7066.method459(3553);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class506(Component arg0, boolean arg1) {
        this.method2926(arg0, 97);
        this.field7084 = arg1;
    }
}
