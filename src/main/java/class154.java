import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class154 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lkb;")
    private static class93 field3031 = class76.method390(":clan:", 0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lkb;")
    private static class93 field3027 = class76.method390("Use", 0);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lkb;")
    public static class93 field3039 = class76.method390("(U0a )2 non)2existant gosub script)2num: ", 0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lkb;")
    public static class93 field3029 = field3027;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lkb;")
    public static class93 field3042 = class76.method390("<col=ff0000>", 0);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lkb;")
    public static class93 field3037 = class76.method390("scrollbar", 0);

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lkb;")
    public static class93 field3043 = class76.method390("Das ist eine Mitglieder)2Welt(Q", 0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lrh;")
    public static class162 field3032;

    @OriginalMember(owner = "client!r", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class177.field3509 != null) {
            class181.field3585 = 0;
            class167.field3339 = -1;
            class6.field112 = -1;
        }
        field3034++;
    }

    @OriginalMember(owner = "client!r", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3033++;
        if (class177.field3509 != null) {
            class181.field3585 = 0;
            class167.field3339 = arg0.getX();
            class6.field112 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!r", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3044++;
        if (class177.field3509 != null) {
            class181.field3585 = 0;
            class167.field3339 = arg0.getX();
            class6.field112 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method989(byte arg0) {
        field3042 = null;
        field3029 = null;
        field3031 = null;
        field3032 = null;
        field3027 = null;
        field3037 = null;
        field3043 = null;
        if (arg0 != -107) {
            field3037 = null;
        }
        field3039 = null;
    }

    @OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3038++;
    }

    @OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class177.field3509 != null) {
            class65.field1104 = 0;
        }
        field3028++;
    }

    @OriginalMember(owner = "client!r", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3035++;
        if (class177.field3509 != null) {
            class181.field3585 = 0;
            class205.field3983 = arg0.getX();
            class205.field3964 = arg0.getY();
            class169.field3371 = class171.method1146((byte) 15);
            if (arg0.isMetaDown()) {
                class148.field2854 = 2;
                class65.field1104 = 2;
            } else {
                class148.field2854 = 1;
                class65.field1104 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!r", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class177.field3509 != null) {
            class181.field3585 = 0;
            class167.field3339 = arg0.getX();
            class6.field112 = arg0.getY();
        }
        field3026++;
    }

    @OriginalMember(owner = "client!r", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3040++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!r", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class177.field3509 != null) {
            class181.field3585 = 0;
            class65.field1104 = 0;
        }
        field3036++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)Lih;")
    public static final class81 method990(int arg0, boolean arg1) {
        class81 var2 = (class81) class161.field3220.method680((long) arg0, (byte) 106);
        field3025++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class117.field2182.method461(6, (byte) 125, arg0);
        class81 var4 = new class81();
        var4.field1488 = arg0;
        if (var3 != null) {
            var4.method410((byte) -87, new class158(var3));
        }
        var4.method412(64);
        if (var4.field1490) {
            var4.field1441 = false;
            var4.field1480 = 0;
        }
        class161.field3220.method678(arg1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z")
    public static final boolean method991(int arg0) {
        field3030++;
        if (class147.field2840 == null) {
            return false;
        }
        try {
            int var1 = class147.field2840.method4(5);
            if (var1 == 0) {
                return false;
            }
            if (class67.field1240 == -1) {
                class147.field2840.method3(class59.field942.field3162, -1, 1, 0);
                class59.field942.field3153 = 0;
                class67.field1240 = class59.field942.method40(arg0 - 128);
                var1--;
                class157.field3109 = class188.field3683[class67.field1240];
            }
            if (~class157.field3109 == arg0) {
                if (var1 <= 0) {
                    return false;
                }
                class147.field2840.method3(class59.field942.field3162, -1, 1, 0);
                var1--;
                class157.field3109 = class59.field942.field3162[0] & 0xFF;
            }
            if (class157.field3109 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class147.field2840.method3(class59.field942.field3162, arg0 - 1, 2, 0);
                var1 -= 2;
                class59.field942.field3153 = 0;
                class157.field3109 = class59.field942.method1071(28101);
            }
            if (class157.field3109 > var1) {
                return false;
            }
            class59.field942.field3153 = 0;
            class147.field2840.method3(class59.field942.field3162, arg0 - 1, class157.field3109, 0);
            class49.field790 = 0;
            class141.field2760 = class177.field3518;
            class177.field3518 = class83.field1535;
            class83.field1535 = class67.field1240;
            if (class67.field1240 == 123) {
                class37.field624 = class59.field942.method1054(128);
                class16.field287 = class203.field3928;
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 14) {
                class82.method419((byte) 93);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 140) {
                class184.field3627 = class59.field942.method1037(16711680) * 30;
                class67.field1240 = -1;
                class124.field2308 = class203.field3928;
                return true;
            }
            if (class67.field1240 == 75) {
                int var2 = class59.field942.method1037(16711680);
                int var3 = class59.field942.method1076(24277);
                int var4 = class59.field942.method1037(16711680);
                int var5 = class59.field942.method1047(255);
                class65 var6 = class204.method1325(65535, var3);
                if (var6.field1111 != var4 || var6.field1157 != var2 || var6.field1082 != var5) {
                    var6.field1111 = var4;
                    var6.field1157 = var2;
                    var6.field1082 = var5;
                    class160.method1095(arg0, var6);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 252) {
                long var7 = class59.field942.method1048(true);
                class93 var9 = class156.method1007(class148.method904(class59.field942, 2).method498(false));
                class189.method1223(6, class133.method797(arg0 + 37, var7).method505((byte) -122), 2249, var9);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 52) {
                for (int var10 = 0; var10 < class47.field758.length; var10++) {
                    if (class47.field758[var10] != class194.field3768[var10]) {
                        class47.field758[var10] = class194.field3768[var10];
                        class141.method889(var10, arg0 ^ 0x6834);
                        class67.field1239[class91.method479(31, class161.field3221++)] = var10;
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 98) {
                int var11 = class59.field942.method1042(-21530);
                int var12 = class59.field942.method1070(-2);
                class65 var13 = class204.method1325(arg0 + 65535, var12);
                if (var13.field1173 != var11 || var11 == -1) {
                    var13.field1043 = 0;
                    var13.field1151 = 0;
                    var13.field1173 = var11;
                    class160.method1095(0, var13);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 176) {
                int var14 = class59.field942.method1070(-2);
                int var15 = class59.field942.method1070(arg0 - 2);
                int var16 = class59.field942.method1071(arg0 + 28101);
                class65 var17 = class204.method1325(65535, var14);
                if (var16 == 65535) {
                    var16 = -1;
                }
                if (var17.field1152) {
                    var17.field1132 = var15;
                    var17.field1038 = var16;
                    class166 var18 = class166.method1126(-115, var16);
                    var17.field1054 = var18.field3273;
                    var17.field1180 = var18.field3276;
                    var17.field1140 = var18.field3316;
                    var17.field1111 = var18.field3287;
                    var17.field1157 = var18.field3286;
                    var17.field1082 = var18.field3267;
                    if (var17.field1044 > 0) {
                        var17.field1082 = var17.field1082 * 32 / var17.field1044;
                    }
                    class160.method1095(0, var17);
                } else if (var16 == -1) {
                    class67.field1240 = -1;
                    var17.field1174 = 0;
                    return true;
                } else {
                    class166 var19 = class166.method1126(-12, var16);
                    var17.field1037 = var16;
                    var17.field1111 = var19.field3287;
                    var17.field1157 = var19.field3286;
                    var17.field1082 = var19.field3267 * 100 / var15;
                    var17.field1174 = 4;
                    class160.method1095(0, var17);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 33) {
                class95.method534((byte) -58);
                class16.field281 = class59.field942.method1054(128);
                class124.field2308 = class203.field3928;
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 1) {
                class122.method696(true);
                class67.field1240 = -1;
                return false;
            }
            if (class67.field1240 == 65) {
                int var20 = class157.field3109 + class59.field942.field3153;
                int var21 = class59.field942.method1071(28101);
                int var22 = class59.field942.method1071(28101);
                if (class97.field1824 != var21) {
                    class97.field1824 = var21;
                    class193.method1245(class97.field1824, arg0 + 18792);
                    class191.method1231(class97.field1824, (byte) 64);
                    for (int var23 = 0; var23 < 100; var23++) {
                        class203.field3927[var23] = true;
                    }
                }
                while (var22-- > 0) {
                    int var24 = class59.field942.method1076(24277);
                    int var25 = class59.field942.method1071(28101);
                    int var26 = class59.field942.method1054(128);
                    class78 var27 = (class78) class147.field2834.method616((long) var24, -1);
                    if (var27 != null && var27.field1406 != var25) {
                        class18.method108(0, true, var27);
                        var27 = null;
                    }
                    if (var27 == null) {
                        var27 = class35.method193(arg0, var25, var24, var26);
                    }
                    var27.field1404 = true;
                }
                for (class78 var28 = (class78) class147.field2834.method612(12981); var28 != null; var28 = (class78) class147.field2834.method623((byte) -77)) {
                    if (var28.field1404) {
                        var28.field1404 = false;
                    } else {
                        class18.method108(0, true, var28);
                    }
                }
                class37.field610 = new class113(512);
                while (class59.field942.field3153 < var20) {
                    int var29 = class59.field942.method1076(24277);
                    int var30 = class59.field942.method1071(28101);
                    int var31 = class59.field942.method1071(arg0 ^ 0x6DC5);
                    int var32 = class59.field942.method1076(24277);
                    for (int var33 = var30; var33 <= var31; var33++) {
                        long var34 = ((long) var29 << 32) + (long) var33;
                        class37.field610.method617(arg0, var34, new class197(var32));
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 221) {
                class140.field2721 = true;
                class88.field1596 = class59.field942.method1054(128);
                class36.field598 = class59.field942.method1054(128);
                class160.field3212 = class59.field942.method1071(28101);
                class82.field1500 = class59.field942.method1054(128);
                class28.field454 = class59.field942.method1054(128);
                if (class28.field454 >= 100) {
                    class81.field1497 = class36.field598 * 128 + 64;
                    class152.field2939 = class88.field1596 * 128 + 64;
                    class108.field1965 = class189.method1226(class81.field1497, -1, class152.field2939, class114.field2145) - class160.field3212;
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 248) {
                class175.field3455 = class203.field3928;
                long var36 = class59.field942.method1048(true);
                if (var36 == 0L) {
                    class24.field368 = null;
                    class98.field1838 = null;
                    class194.field3762 = null;
                    class67.field1240 = -1;
                    class103.field1896 = 0;
                    return true;
                }
                long var38 = class59.field942.method1048(true);
                class194.field3762 = class133.method797(arg0 + 37, var38);
                class24.field368 = class133.method797(37, var36);
                class181.field3582 = class59.field942.method1066(true);
                int var40 = class59.field942.method1054(128);
                if (var40 == 255) {
                    class67.field1240 = -1;
                    return true;
                }
                class103.field1896 = var40;
                class136[] var41 = new class136[100];
                for (int var42 = 0; var42 < class103.field1896; var42++) {
                    var41[var42] = new class136();
                    var41[var42].field718 = class59.field942.method1048(true);
                    var41[var42].field2641 = class133.method797(37, var41[var42].field718);
                    var41[var42].field2632 = class59.field942.method1071(28101);
                    var41[var42].field2634 = class59.field942.method1066(true);
                    if (class46.field735 == var41[var42].field718) {
                        class136.field2640 = var41[var42].field2634;
                    }
                }
                boolean var43 = false;
                int var44 = class103.field1896;
                while (var44 > 0) {
                    boolean var45 = true;
                    var44--;
                    for (int var46 = 0; var46 < var44; var46++) {
                        if (var41[var46].field2641.method512(116, var41[var46 + 1].field2641) > 0) {
                            var45 = false;
                            class136 var47 = var41[var46];
                            var41[var46] = var41[var46 + 1];
                            var41[var46 + 1] = var47;
                        }
                    }
                    if (var45) {
                        break;
                    }
                }
                class98.field1838 = var41;
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 189) {
                class124.method706(true, arg0 ^ 0x1);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 105) {
                class124.method706(false, 1);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 222) {
                int var48 = class59.field942.method1071(28101);
                class16.method93(-104, var48);
                class200.field3873[class91.method479(31, class14.field250++)] = class91.method479(32767, var48);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 148) {
                class95.method534((byte) 125);
                int var49 = class59.field942.method1075(arg0 - 1);
                int var50 = class59.field942.method1068((byte) -99);
                int var51 = class59.field942.method1086(91);
                class184.field3628[var50] = var49;
                class180.field3575[var50] = var51;
                class12.field193[var50] = 1;
                for (int var52 = 0; var52 < 98; var52++) {
                    if (var49 >= class73.field1346[var52]) {
                        class12.field193[var50] = var52 + 2;
                    }
                }
                class9.field148[class91.method479(class127.field2386++, 31)] = var50;
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 218) {
                int var53 = class59.field942.method1034(arg0 + 54);
                class97.field1824 = var53;
                class193.method1245(var53, 18792);
                class191.method1231(class97.field1824, (byte) 64);
                for (int var54 = 0; var54 < 100; var54++) {
                    class203.field3927[var54] = true;
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 46) {
                long var55 = class59.field942.method1048(true);
                boolean var57 = false;
                if ((Long.MIN_VALUE & var55) != 0L) {
                    var57 = true;
                }
                int var58 = class59.field942.method1071(28101);
                byte var59 = class59.field942.method1066(true);
                if (var57) {
                    if (class103.field1896 == 0) {
                        class67.field1240 = -1;
                        return true;
                    }
                    boolean var60 = false;
                    long var61 = var55 & Long.MAX_VALUE;
                    int var63;
                    for (var63 = 0; var63 < class103.field1896 && (class98.field1838[var63].field718 != var61 || class98.field1838[var63].field2632 != var58); var63++) {
                    }
                    if (var63 < class103.field1896) {
                        while (class103.field1896 - 1 > var63) {
                            class98.field1838[var63] = class98.field1838[var63 + 1];
                            var63++;
                        }
                        class103.field1896--;
                        class98.field1838[class103.field1896] = null;
                    }
                } else {
                    class136 var64 = new class136();
                    var64.field718 = var55;
                    var64.field2641 = class133.method797(37, var64.field718);
                    var64.field2634 = var59;
                    var64.field2632 = var58;
                    int var65;
                    for (var65 = class103.field1896 - 1; var65 >= 0; var65--) {
                        int var66 = class98.field1838[var65].field2641.method512(100, var64.field2641);
                        if (var66 == 0) {
                            class98.field1838[var65].field2632 = var58;
                            class98.field1838[var65].field2634 = var59;
                            class67.field1240 = -1;
                            class175.field3455 = class203.field3928;
                            if (class46.field735 == var55) {
                                class136.field2640 = var59;
                            }
                            return true;
                        }
                        if (var66 < 0) {
                            break;
                        }
                    }
                    if (class98.field1838.length <= class103.field1896) {
                        class67.field1240 = -1;
                        return true;
                    }
                    for (int var67 = class103.field1896 - 1; var67 > var65; var67--) {
                        class98.field1838[var67 + 1] = class98.field1838[var67];
                    }
                    if (class103.field1896 == 0) {
                        class98.field1838 = new class136[100];
                    }
                    class98.field1838[var65 + 1] = var64;
                    class103.field1896++;
                    if (class46.field735 == var55) {
                        class136.field2640 = var59;
                    }
                }
                class67.field1240 = -1;
                class175.field3455 = class203.field3928;
                return true;
            }
            if (class67.field1240 == 238) {
                int var68 = class59.field942.method1077((byte) -66);
                class65 var69 = class204.method1325(65535, var68);
                for (int var70 = 0; var70 < var69.field1146.length; var70++) {
                    var69.field1146[var70] = -1;
                    var69.field1146[var70] = 0;
                }
                class160.method1095(arg0, var69);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 124) {
                int var71 = class59.field942.method1076(24277);
                int var72 = class59.field942.method1071(28101);
                if (var71 < -70000) {
                    var72 += 32768;
                }
                class65 var73;
                if (var71 < 0) {
                    var73 = null;
                } else {
                    var73 = class204.method1325(65535, var71);
                }
                while (class59.field942.field3153 < class157.field3109) {
                    int var74 = class59.field942.method1072(arg0 ^ 0xFFFF9DA2);
                    int var75 = class59.field942.method1071(arg0 ^ 0x6DC5);
                    int var76 = 0;
                    if (var75 != 0) {
                        var76 = class59.field942.method1054(arg0 + 128);
                        if (var76 == 255) {
                            var76 = class59.field942.method1076(24277);
                        }
                    }
                    if (var73 != null && var74 >= 0 && var73.field1146.length > var74) {
                        var73.field1146[var74] = var75;
                        var73.field1102[var74] = var76;
                    }
                    class169.method1138(var74, var72, -128, var75 - 1, var76);
                }
                if (var73 != null) {
                    class160.method1095(0, var73);
                }
                class95.method534((byte) 96);
                class200.field3873[class91.method479(31, class14.field250++)] = class91.method479(32767, var72);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 153) {
                if (class97.field1824 != -1) {
                    class190.method1229(class97.field1824, 0, 0);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 142) {
                class93 var77 = class59.field942.method1035(255);
                Object[] var78 = new Object[var77.method510(94) + 1];
                for (int var79 = var77.method510(72) - 1; var79 >= 0; var79--) {
                    if (var77.method491((byte) -68, var79) == 115) {
                        var78[var79 + 1] = class59.field942.method1035(class29.method159(arg0, 255));
                    } else {
                        var78[var79 + 1] = Integer.valueOf(class59.field942.method1076(24277));
                    }
                }
                var78[0] = Integer.valueOf(class59.field942.method1076(arg0 + 24277));
                class104 var80 = new class104();
                var80.field1924 = var78;
                class82.method421(var80, false);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 13) {
                class93 var81 = class59.field942.method1035(255);
                if (var81.method519(31574, class93.field1714)) {
                    boolean var111 = false;
                    class93 var112 = var81.method497((byte) -108, var81.method489((byte) -95, class39.field641), 0);
                    long var113 = var112.method482(82);
                    for (int var115 = 0; var115 < class27.field424; var115++) {
                        if (class166.field3280[var115] == var113) {
                            var111 = true;
                            break;
                        }
                    }
                    if (!var111 && class174.field3446 == 0) {
                        class189.method1223(4, var112, arg0 ^ 0x8C9, class131.field2474);
                    }
                } else if (var81.method519(arg0 ^ 0x7B56, class193.field3752)) {
                    class93 var82 = var81.method497((byte) -75, var81.method489((byte) 126, class39.field641), 0);
                    long var83 = var82.method482(arg0 + 127);
                    boolean var85 = false;
                    for (int var86 = 0; var86 < class27.field424; var86++) {
                        if (class166.field3280[var86] == var83) {
                            var85 = true;
                            break;
                        }
                    }
                    if (!var85 && class174.field3446 == 0) {
                        class93 var87 = var81.method497((byte) -88, var81.method510(arg0 + 101) - 9, var81.method489((byte) 98, class39.field641) + 1);
                        class189.method1223(8, var82, 2249, var87);
                    }
                } else if (var81.method519(31574, class83.field1533)) {
                    class93 var106 = var81.method497((byte) -89, var81.method489((byte) 91, class39.field641), 0);
                    long var107 = var106.method482(arg0 ^ 0xFFFFFFCC);
                    boolean var109 = false;
                    for (int var110 = 0; var110 < class27.field424; var110++) {
                        if (class166.field3280[var110] == var107) {
                            var109 = true;
                            break;
                        }
                    }
                    if (!var109 && class174.field3446 == 0) {
                        class189.method1223(10, var106, 2249, class43.field712);
                    }
                } else if (var81.method519(31574, field3031)) {
                    class93 var88 = var81.method497((byte) -119, var81.method489((byte) 40, field3031), 0);
                    class189.method1223(11, class43.field712, 2249, var88);
                } else if (var81.method519(31574, class62.field987)) {
                    class93 var105 = var81.method497((byte) -107, var81.method489((byte) 33, class62.field987), 0);
                    if (class174.field3446 == 0) {
                        class189.method1223(12, class43.field712, arg0 + 2249, var105);
                    }
                } else if (var81.method519(31574, class189.field3703)) {
                    class93 var104 = var81.method497((byte) -108, var81.method489((byte) -107, class189.field3703), 0);
                    if (class174.field3446 == 0) {
                        class189.method1223(13, class43.field712, arg0 + 2249, var104);
                    }
                } else if (var81.method519(31574, class39.field649)) {
                    class93 var99 = var81.method497((byte) -120, var81.method489((byte) -109, class39.field641), 0);
                    long var100 = var99.method482(-116);
                    boolean var102 = false;
                    for (int var103 = 0; var103 < class27.field424; var103++) {
                        if (class166.field3280[var103] == var100) {
                            var102 = true;
                            break;
                        }
                    }
                    if (!var102 && class174.field3446 == 0) {
                        class189.method1223(14, var99, 2249, class43.field712);
                    }
                } else if (var81.method519(31574, class189.field3695)) {
                    boolean var89 = false;
                    class93 var90 = var81.method497((byte) -126, var81.method489((byte) -97, class39.field641), 0);
                    long var91 = var90.method482(-73);
                    for (int var93 = 0; var93 < class27.field424; var93++) {
                        if (class166.field3280[var93] == var91) {
                            var89 = true;
                            break;
                        }
                    }
                    if (!var89 && class174.field3446 == 0) {
                        class189.method1223(15, var90, 2249, class43.field712);
                    }
                } else if (var81.method519(31574, class7.field115)) {
                    class93 var94 = var81.method497((byte) -112, var81.method489((byte) 33, class39.field641), 0);
                    long var95 = var94.method482(arg0 ^ 0x70);
                    boolean var97 = false;
                    for (int var98 = 0; var98 < class27.field424; var98++) {
                        if (class166.field3280[var98] == var95) {
                            var97 = true;
                            break;
                        }
                    }
                    if (!var97 && class174.field3446 == 0) {
                        class189.method1223(16, var94, arg0 ^ 0x8C9, class43.field712);
                    }
                } else {
                    class189.method1223(0, class43.field712, arg0 + 2249, var81);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 246) {
                class182.method1185(false);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 118 || class67.field1240 == 23 || class67.field1240 == 207 || class67.field1240 == 88 || class67.field1240 == 109 || class67.field1240 == 30 || class67.field1240 == 172 || class67.field1240 == 167 || class67.field1240 == 188 || class67.field1240 == 100 || class67.field1240 == 242) {
                class93.method494((byte) -127);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 163) {
                int var116 = class59.field942.method1054(128);
                int var117 = class59.field942.method1054(arg0 + 128);
                int var118 = class59.field942.method1054(128);
                int var119 = class59.field942.method1054(128);
                int var120 = class59.field942.method1071(arg0 ^ 0x6DC5);
                class189.field3697[var116] = true;
                class49.field788[var116] = var117;
                class37.field628[var116] = var118;
                class24.field369[var116] = var119;
                class93.field1709[var116] = var120;
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 44) {
                long var121 = class59.field942.method1048(true);
                int var123 = class59.field942.method1071(arg0 ^ 0x6DC5);
                int var124 = class59.field942.method1054(128);
                class93 var125 = class133.method797(37, var121).method505((byte) -103);
                for (int var126 = 0; var126 < class62.field991; var126++) {
                    if (class151.field2910[var126] == var121) {
                        if (class114.field2119[var126] != var123) {
                            class114.field2119[var126] = var123;
                            if (var123 > 0) {
                                class189.method1223(5, class43.field712, 2249, class203.method1321(new class93[] { var125, class161.field3232 }, arg0 ^ 0xFFFFFFFC));
                            }
                            if (var123 == 0) {
                                class189.method1223(5, class43.field712, 2249, class203.method1321(new class93[] { var125, class83.field1534 }, arg0 + 104));
                            }
                        }
                        class205.field3973[var126] = var124;
                        var125 = null;
                        break;
                    }
                }
                if (var125 != null && class62.field991 < 200) {
                    class151.field2910[class62.field991] = var121;
                    class179.field3549[class62.field991] = var125;
                    class114.field2119[class62.field991] = var123;
                    class205.field3973[class62.field991] = var124;
                    class62.field991++;
                }
                class16.field287 = class203.field3928;
                boolean var127 = false;
                int var128 = class62.field991;
                while (var128 > 0) {
                    boolean var129 = true;
                    var128--;
                    for (int var130 = 0; var130 < var128; var130++) {
                        if (class114.field2119[var130] != class204.field3947 && class114.field2119[var130 + 1] == class204.field3947 || class114.field2119[var130] == 0 && class114.field2119[var130 + 1] != 0) {
                            var129 = false;
                            int var131 = class114.field2119[var130];
                            class114.field2119[var130] = class114.field2119[var130 + 1];
                            class114.field2119[var130 + 1] = var131;
                            class93 var132 = class179.field3549[var130];
                            class179.field3549[var130] = class179.field3549[var130 + 1];
                            class179.field3549[var130 + 1] = var132;
                            long var133 = class151.field2910[var130];
                            class151.field2910[var130] = class151.field2910[var130 + 1];
                            class151.field2910[var130 + 1] = var133;
                            int var135 = class205.field3973[var130];
                            class205.field3973[var130] = class205.field3973[var130 + 1];
                            class205.field3973[var130 + 1] = var135;
                        }
                    }
                    if (var129) {
                        break;
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 198) {
                int var136 = class59.field942.method1071(28101);
                int var137 = class59.field942.method1076(arg0 ^ 0x5ED5);
                int var138 = class59.field942.method1047(255);
                class65 var139 = class204.method1325(arg0 ^ 0xFFFF, var137);
                var139.field1081 = (var136 << 16) + var138;
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 64) {
                class95.method534((byte) -66);
                class28.field463 = class59.field942.method1083(true);
                class67.field1240 = -1;
                class124.field2308 = class203.field3928;
                return true;
            }
            if (class67.field1240 == 104) {
                class112.field2085 = class59.field942.method1054(arg0 ^ 0x80);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 122) {
                int var140 = class59.field942.method1071(28101);
                int var141 = class59.field942.method1070(-2);
                class65 var142 = class204.method1325(65535, var141);
                if (var142 != null && var142.field1076 == 0) {
                    if (var142.field1103 - var142.field1052 < var140) {
                        var140 = var142.field1103 - var142.field1052;
                    }
                    if (var140 < 0) {
                        var140 = 0;
                    }
                    if (var142.field1162 != var140) {
                        var142.field1162 = var140;
                        class160.method1095(0, var142);
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 38) {
                class140.field2721 = true;
                class53.field894 = class59.field942.method1054(128);
                class136.field2646 = class59.field942.method1054(128);
                class51.field849 = class59.field942.method1071(28101);
                class82.field1507 = class59.field942.method1054(arg0 + 128);
                class1.field14 = class59.field942.method1054(128);
                if (class1.field14 >= 100) {
                    int var143 = class53.field894 * 128 + 64;
                    int var144 = class136.field2646 * 128 + 64;
                    int var145 = class189.method1226(var144, -1, var143, class114.field2145) - class51.field849;
                    int var146 = var145 - class108.field1965;
                    int var147 = var143 - class152.field2939;
                    int var148 = var144 - class81.field1497;
                    int var149 = (int) Math.sqrt((double) (var147 * var147 + var148 * var148));
                    class184.field3629 = (int) (Math.atan2((double) var146, (double) var149) * 325.949D) & 0x7FF;
                    class141.field2763 = (int) (Math.atan2((double) var147, (double) var148) * -325.949D) & 0x7FF;
                    if (class184.field3629 < 128) {
                        class184.field3629 = 128;
                    }
                    if (class184.field3629 > 383) {
                        class184.field3629 = 383;
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 24) {
                class194.field3764 = class59.field942.method1086(arg0 ^ 0x56);
                class155.field3056 = class59.field942.method1055((byte) -24);
                while (class157.field3109 > class59.field942.field3153) {
                    class67.field1240 = class59.field942.method1054(128);
                    class93.method494((byte) -127);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 63) {
                class93 var150 = class59.field942.method1035(arg0 + 255);
                int var151 = class59.field942.method1055((byte) -24);
                int var152 = class59.field942.method1054(128);
                if (var152 >= 1 && var152 <= 8) {
                    if (var150.method523(117, class73.field1345)) {
                        var150 = null;
                    }
                    class148.field2846[var152 - 1] = var150;
                    class204.field3938[var152 - 1] = var151 == 0;
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 133) {
                int var153 = class59.field942.method1076(24277);
                boolean var154 = class59.field942.method1055((byte) -24) == 1;
                class65 var155 = class204.method1325(65535, var153);
                if (var155.field1073 != var154) {
                    var155.field1073 = var154;
                    class160.method1095(0, var155);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 79) {
                int var156 = class59.field942.method1076(24277);
                int var157 = class59.field942.method1071(arg0 + 28101);
                if (var156 < -70000) {
                    var157 += 32768;
                }
                class65 var158;
                if (var156 >= 0) {
                    var158 = class204.method1325(65535, var156);
                } else {
                    var158 = null;
                }
                if (var158 != null) {
                    for (int var159 = 0; var159 < var158.field1146.length; var159++) {
                        var158.field1146[var159] = 0;
                        var158.field1102[var159] = 0;
                    }
                }
                class207.method1348(var157, (byte) 113);
                int var160 = class59.field942.method1071(arg0 ^ 0x6DC5);
                for (int var161 = 0; var161 < var160; var161++) {
                    int var162 = class59.field942.method1055((byte) -24);
                    if (var162 == 255) {
                        var162 = class59.field942.method1070(-2);
                    }
                    int var163 = class59.field942.method1037(16711680);
                    if (var158 != null && var158.field1146.length > var161) {
                        var158.field1146[var161] = var163;
                        var158.field1102[var161] = var162;
                    }
                    class169.method1138(var161, var157, arg0 ^ 0xFFFFFF84, var163 - 1, var162);
                }
                if (var158 != null) {
                    class160.method1095(arg0, var158);
                }
                class95.method534((byte) -64);
                class200.field3873[class91.method479(31, class14.field250++)] = class91.method479(32767, var157);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 126) {
                int var164 = class59.field942.method1071(28101);
                if (var164 == 65535) {
                    var164 = -1;
                }
                class70.method371((byte) -38, var164);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 48) {
                int var165 = class59.field942.method1053(727140680);
                int var166 = class59.field942.method1037(arg0 + 16711680);
                if (var166 == 65535) {
                    var166 = -1;
                }
                class23.method136(var166, var165, 22607);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 95) {
                int var167 = class59.field942.method1055((byte) -24);
                int var168 = class59.field942.method1070(-2);
                int var169 = class59.field942.method1037(16711680);
                class78 var170 = (class78) class147.field2834.method616((long) var168, -1);
                if (var170 != null) {
                    class18.method108(arg0, var170.field1406 != var169, var170);
                }
                class35.method193(0, var169, var168, var167);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 168) {
                int var171 = class59.field942.method1076(24277);
                class78 var172 = (class78) class147.field2834.method616((long) var171, -1);
                if (var172 != null) {
                    class18.method108(0, true, var172);
                }
                if (class82.field1511 != null) {
                    class160.method1095(arg0, class82.field1511);
                    class82.field1511 = null;
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 53) {
                int var173 = class59.field942.method1075(-1);
                class30.field508 = class77.field1393.method916(var173, 106);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 170) {
                int var174 = class59.field942.method1077((byte) -66);
                class93 var175 = class59.field942.method1035(255);
                class65 var176 = class204.method1325(65535, var174);
                if (!var175.method485((byte) -44, var176.field1131)) {
                    var176.field1131 = var175;
                    class160.method1095(0, var176);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 199) {
                class37.field629 = class59.field942.method1054(128);
                if (class37.field629 == 1) {
                    class151.field2932 = class59.field942.method1071(28101);
                }
                if (class37.field629 >= 2 && class37.field629 <= 6) {
                    if (class37.field629 == 2) {
                        class175.field3452 = 64;
                        class68.field1251 = 64;
                    }
                    if (class37.field629 == 3) {
                        class175.field3452 = 0;
                        class68.field1251 = 64;
                    }
                    if (class37.field629 == 4) {
                        class175.field3452 = 128;
                        class68.field1251 = 64;
                    }
                    if (class37.field629 == 5) {
                        class175.field3452 = 64;
                        class68.field1251 = 0;
                    }
                    if (class37.field629 == 6) {
                        class175.field3452 = 64;
                        class68.field1251 = 128;
                    }
                    class37.field629 = 2;
                    class18.field311 = class59.field942.method1071(28101);
                    class39.field642 = class59.field942.method1071(arg0 + 28101);
                    class41.field681 = class59.field942.method1054(arg0 ^ 0x80);
                }
                if (class37.field629 == 10) {
                    class66.field1204 = class59.field942.method1071(28101);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 226) {
                for (int var177 = 0; var177 < class206.field4035.length; var177++) {
                    if (class206.field4035[var177] != null) {
                        class206.field4035[var177].field2077 = -1;
                    }
                }
                for (int var178 = 0; var178 < class143.field2791.length; var178++) {
                    if (class143.field2791[var178] != null) {
                        class143.field2791[var178].field2077 = -1;
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 161) {
                class27.field424 = class157.field3109 / 8;
                for (int var179 = 0; var179 < class27.field424; var179++) {
                    class166.field3280[var179] = class59.field942.method1048(true);
                    class137.field2650[var179] = class133.method797(37, class166.field3280[var179]);
                }
                class67.field1240 = -1;
                class16.field287 = class203.field3928;
                return true;
            }
            if (class67.field1240 == 149) {
                byte var180 = class59.field942.method1040(false);
                int var181 = class59.field942.method1047(255);
                class194.field3768[var181] = var180;
                if (class47.field758[var181] != var180) {
                    class47.field758[var181] = var180;
                    class141.method889(var181, 26676);
                }
                class67.field1239[class91.method479(class161.field3221++, 31)] = var181;
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 117) {
                class140.field2721 = false;
                for (int var182 = 0; var182 < 5; var182++) {
                    class189.field3697[var182] = false;
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 28) {
                long var183 = class59.field942.method1048(true);
                class59.field942.method1066(true);
                long var185 = class59.field942.method1048(true);
                long var187 = (long) class59.field942.method1071(28101);
                long var189 = (long) class59.field942.method1060(255);
                long var191 = (var187 << 32) + var189;
                int var193 = class59.field942.method1054(128);
                boolean var194 = false;
                for (int var195 = 0; var195 < 100; var195++) {
                    if (class61.field978[var195] == var191) {
                        var194 = true;
                        break;
                    }
                }
                if (var193 <= 1) {
                    for (int var196 = 0; var196 < class27.field424; var196++) {
                        if (class166.field3280[var196] == var183) {
                            var194 = true;
                            break;
                        }
                    }
                }
                if (!var194 && class174.field3446 == 0) {
                    class61.field978[class138.field2679] = var191;
                    class138.field2679 = (class138.field2679 + 1) % 100;
                    class93 var197 = class156.method1007(class148.method904(class59.field942, 2).method498(false));
                    if (var193 == 2 || var193 == 3) {
                        class201.method1315(9, class203.method1321(new class93[] { class178.field3537, class133.method797(37, var183).method505((byte) -94) }, arg0 - 72), var197, class133.method797(37, var185).method505((byte) -70), arg0 ^ 0x63);
                    } else if (var193 == 1) {
                        class201.method1315(9, class203.method1321(new class93[] { class169.field3363, class133.method797(37, var183).method505((byte) -73) }, 127), var197, class133.method797(37, var185).method505((byte) -124), 99);
                    } else {
                        class201.method1315(9, class133.method797(arg0 + 37, var183).method505((byte) -92), var197, class133.method797(37, var185).method505((byte) -75), 99);
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 103) {
                int var198 = class59.field942.method1077((byte) -66);
                class65 var199 = class204.method1325(65535, var198);
                var199.field1174 = 3;
                var199.field1037 = class106.field1940.field560.method883((byte) -95);
                class160.method1095(0, var199);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 17) {
                class155.field3056 = class59.field942.method1068((byte) -79);
                class194.field3764 = class59.field942.method1055((byte) -24);
                for (int var200 = class155.field3056; var200 < class155.field3056 + 8; var200++) {
                    for (int var201 = class194.field3764; var201 < class194.field3764 + 8; var201++) {
                        if (class169.field3358[class114.field2145][var200][var201] != null) {
                            class169.field3358[class114.field2145][var200][var201] = null;
                            class147.method903(256, var201, var200);
                        }
                    }
                }
                for (class179 var202 = (class179) class1.field3.method692(false); var202 != null; var202 = (class179) class1.field3.method695(512)) {
                    if (var202.field3554 >= class155.field3056 && class155.field3056 + 8 > var202.field3554 && var202.field3556 >= class194.field3764 && var202.field3556 < class194.field3764 + 8 && class114.field2145 == var202.field3566) {
                        var202.field3567 = 0;
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 255) {
                class172.field3403 = class59.field942.method1054(128);
                class80.field1422 = class59.field942.method1054(128);
                class158.field3136 = class59.field942.method1054(128);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 70) {
                int var203 = class59.field942.method1054(128);
                if (class59.field942.method1054(128) == 0) {
                    class63.field999[var203] = new class60();
                } else {
                    class59.field942.field3153--;
                    class63.field999[var203] = new class60(class59.field942);
                }
                class67.field1240 = -1;
                class113.field2095 = class203.field3928;
                return true;
            }
            if (class67.field1240 == 206) {
                int var204 = class59.field942.method1034(arg0 + 91);
                int var205 = class59.field942.method1075(-1);
                class65 var206 = class204.method1325(65535, var205);
                if (var206.field1174 != 2 || var206.field1037 != var204) {
                    var206.field1037 = var204;
                    var206.field1174 = 2;
                    class160.method1095(arg0, var206);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 229) {
                int var207 = class59.field942.method1054(arg0 ^ 0x80);
                int var208 = class59.field942.method1086(125);
                int var209 = class59.field942.method1086(103);
                class114.field2145 = var209 >> 1;
                class106.field1940.method609((var209 & 0x1) == 1, (byte) 123, var208, var207);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 11) {
                class141.method876(class59.field942, -1, class157.field3109, class77.field1393);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 73) {
                int var210 = class59.field942.method1071(arg0 ^ 0x6DC5);
                int var211 = class59.field942.method1054(128);
                int var212 = class59.field942.method1071(arg0 + 28101);
                class13.method73(var211, 1, var212, var210);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 174) {
                long var213 = class59.field942.method1048(true);
                long var215 = (long) class59.field942.method1071(28101);
                boolean var217 = false;
                long var218 = (long) class59.field942.method1060(255);
                int var220 = class59.field942.method1054(arg0 + 128);
                long var221 = (var215 << 32) + var218;
                for (int var223 = 0; var223 < 100; var223++) {
                    if (class61.field978[var223] == var221) {
                        var217 = true;
                        break;
                    }
                }
                if (var220 <= 1) {
                    for (int var224 = 0; var224 < class27.field424; var224++) {
                        if (class166.field3280[var224] == var213) {
                            var217 = true;
                            break;
                        }
                    }
                }
                if (!var217 && class174.field3446 == 0) {
                    class61.field978[class138.field2679] = var221;
                    class138.field2679 = (class138.field2679 + 1) % 100;
                    class93 var225 = class156.method1007(class148.method904(class59.field942, 2).method498(false));
                    if (var220 == 2 || var220 == 3) {
                        class189.method1223(7, class203.method1321(new class93[] { class178.field3537, class133.method797(37, var213).method505((byte) -87) }, -66), 2249, var225);
                    } else if (var220 == 1) {
                        class189.method1223(7, class203.method1321(new class93[] { class169.field3363, class133.method797(arg0 + 37, var213).method505((byte) -106) }, arg0 ^ 0xFFFFFFD4), 2249, var225);
                    } else {
                        class189.method1223(3, class133.method797(37, var213).method505((byte) -85), 2249, var225);
                    }
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 208) {
                int var226 = class59.field942.method1047(255);
                if (var226 == 65535) {
                    var226 = -1;
                }
                int var227 = class59.field942.method1070(-2);
                int var228 = class59.field942.method1034(58);
                if (var228 == 65535) {
                    var228 = -1;
                }
                int var229 = class59.field942.method1076(24277);
                for (int var230 = var226; var230 <= var228; var230++) {
                    long var231 = ((long) var229 << 32) + ((long) var230);
                    class44 var233 = class37.field610.method616(var231, arg0 - 1);
                    if (var233 != null) {
                        var233.method235(false);
                    }
                    class37.field610.method617(0, var231, new class197(var227));
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 96) {
                int var234 = class59.field942.method1071(28101);
                int var235 = class59.field942.method1076(24277);
                class65 var236 = class204.method1325(arg0 + 65535, var235);
                if (var236.field1174 != 1 || var236.field1037 != var234) {
                    var236.field1174 = 1;
                    var236.field1037 = var234;
                    class160.method1095(0, var236);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 21) {
                class67.field1240 = -1;
                class35.field574 = 0;
                return true;
            }
            if (class67.field1240 == 90) {
                class124.method705(9209, class59.field942);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 152) {
                int var237 = class59.field942.method1070(-2);
                int var238 = class59.field942.method1037(16711680);
                class194.field3768[var238] = var237;
                if (class47.field758[var238] != var237) {
                    class47.field758[var238] = var237;
                    class141.method889(var238, 26676);
                }
                class67.field1239[class91.method479(31, class161.field3221++)] = var238;
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 225) {
                int var239 = class59.field942.method1047(255);
                int var240 = class59.field942.method1070(-2);
                int var241 = var239 & 0x1F;
                int var242 = var239 >> 5 & 0x1F;
                int var243 = var239 >> 10 & 0x1F;
                int var244 = (var243 << 19) - (-(var242 << 11) - (var241 << 3));
                class65 var245 = class204.method1325(65535, var240);
                if (var245.field1167 != var244) {
                    var245.field1167 = var244;
                    class160.method1095(0, var245);
                }
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 87) {
                class155.field3056 = class59.field942.method1054(arg0 + 128);
                class194.field3764 = class59.field942.method1068((byte) -125);
                class67.field1240 = -1;
                return true;
            }
            if (class67.field1240 == 101) {
                for (int var246 = 0; var246 < class153.field2994; var246++) {
                    class204 var247 = class131.method767(var246, (byte) 92);
                    if (var247 != null && var247.field3949 == 0) {
                        class194.field3768[var246] = 0;
                        class47.field758[var246] = 0;
                    }
                }
                class95.method534((byte) 110);
                class67.field1240 = -1;
                class161.field3221 += 32;
                return true;
            }
            if (class67.field1240 == 60) {
                int var248 = class59.field942.method1042(-21530);
                int var249 = class59.field942.method1038(87);
                int var250 = class59.field942.method1077((byte) -66);
                class65 var251 = class204.method1325(arg0 ^ 0xFFFF, var250);
                int var252 = var251.field1139 + var249;
                int var253 = var251.field1144 + var248;
                if (var251.field1113 != var252 || var251.field1090 != var253) {
                    var251.field1113 = var252;
                    var251.field1090 = var253;
                    class160.method1095(0, var251);
                }
                class67.field1240 = -1;
                return true;
            }
            class141.method882(true, "T1 - " + class67.field1240 + "," + class177.field3518 + "," + class141.field2760 + " - " + class157.field3109, null);
            class122.method696(true);
        } catch (IOException var257) {
            class136.method857(104);
        } catch (Exception var258) {
            String var255 = "T2 - " + class67.field1240 + "," + class177.field3518 + "," + class141.field2760 + " - " + class157.field3109 + "," + (class106.field1940.field2038[0] + class49.field787) + "," + (class106.field1940.field2064[0] + class68.field1242) + " - ";
            for (int var256 = 0; var256 < class157.field3109 && var256 < 50; var256++) {
                var255 = var255 + class59.field942.field3162[var256] + ",";
            }
            class141.method882(true, var255, var258);
            class122.method696(true);
        }
        return true;
    }
}
