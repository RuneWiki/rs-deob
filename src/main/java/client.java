import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class6 {

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
    public static boolean field3638 = true;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[[S")
    private static short[][] field3647 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3641 = 0;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field3652 = "Loaded interfaces";

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Lfg;")
    public static class18 field3636 = new class18(64);

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 4)
    public static final void method1809() {
        boolean var0 = class339.field4830 == 1 && class21.field317 > 200 || class339.field4830 == 0 && class21.field317 > 50;
        for (int var1 = 0; var1 < class21.field317; var1++) {
            class127 var10 = class367.field5225[class75.field1290[var1]];
            if (var10.method1069(-1810533241)) {
                var10.method1547((byte) -115);
                if (var10.field6526 >= 0 && var10.field6513 >= 0 && var10.field6504 < class183.field2703 && var10.field6508 < class66.field1056) {
                    var10.field2046 = var10.field5661 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field5663) {
                        var11++;
                    }
                    if (var10.field5669 > class267.field4002) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1070((byte) -50) << 2);
                    if (class45.field678 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field5686 = var12 + 1;
                } else {
                    var10.field5686 = -1;
                }
            } else {
                var10.field5686 = -1;
            }
        }
        for (int var2 = 0; var2 < class156.field2376; var2++) {
            class98 var7 = class447.field6512[class416.field6027[var2]];
            if (var7.method820(-1810533241) && var7.field1545.method69((byte) -48)) {
                var7.method1547((byte) -115);
                if (var7.field6526 >= 0 && var7.field6513 >= 0 && var7.field6504 < class183.field2703 && var7.field6508 < class66.field1056) {
                    int var8 = 0;
                    if (!var7.field5663) {
                        var8++;
                    }
                    if (var7.field5669 > class267.field4002) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method1070((byte) -50) << 2);
                    if (class45.field678 == 0) {
                        if (var7.field1545.field141) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class45.field678 == 1) {
                        if (var7.field1545.field141) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field1545.field158) {
                        var9 += 512;
                    } else if (!var7.field1545.field138) {
                        var9 += 256;
                    }
                    var7.field5686 = var9 + 1;
                } else {
                    var7.field5686 = -1;
                }
            } else {
                var7.field5686 = -1;
            }
        }
        for (int var3 = 0; var3 < class431.field6220.length; var3++) {
            class257 var4 = class431.field6220[var3];
            if (var4 != null) {
                if (var4.field3713 == 1) {
                    class98 var5 = class447.field6512[var4.field3708];
                    if (var5 != null && var5.field5686 >= 0) {
                        var5.field5686 += 1024;
                    }
                } else if (var4.field3713 == 10) {
                    class127 var6 = class367.field5225[var4.field3708];
                    if (var6 != null && var6.field5686 >= 0) {
                        var6.field5686 += 1024;
                    }
                }
            }
        }
        class86.field1394.field5686 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lmb;IIIIIII)V", line = 141)
    public static final void method1810(class258[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class258 var9 = arg0[var8];
            if (var9 != null && var9.field3754 == arg1) {
                int var10 = var9.field3750 + arg6;
                int var11 = var9.field3908 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3793 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3764 + var10;
                    int var17 = var9.field3758 + var11;
                    if (var9.field3793 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (!var9.field3825 || var9.field3793 == 0 || var9.field3857 || method1815(var9).field6033 != 0 || class276.field4156 == var9 || var9.field3821 == 1338) {
                    if (!var9.field3825 || !method1823(var9)) {
                        if (class273.field4109 == var9) {
                            class282.field4229 = true;
                            class415.field6005 = var10;
                            class441.field6411 = var11;
                        }
                        if (!var9.field3825 || var9.field3820 || var12 < var14 && var13 < var15) {
                            if (var9.field3793 == 0) {
                                if (!var9.field3825 && method1823(var9) && class183.field2714 != var9) {
                                    continue;
                                }
                                if (var9.field3762 && class129.field2111 >= var12 && class291.field4327 >= var13 && class129.field2111 < var14 && class291.field4327 < var15) {
                                    for (class254 var18 = (class254) class182.field2688.method157((byte) -125); var18 != null; var18 = (class254) class182.field2688.method145(24)) {
                                        if (var18.field3667) {
                                            var18.method251(51);
                                            var18.field3678.field3895 = false;
                                        }
                                    }
                                    if (class135.field2164 == 0) {
                                        class273.field4109 = null;
                                        class276.field4156 = null;
                                    }
                                    class5.field34 = 0;
                                    class367.field5221 = false;
                                    class237.field3418 = false;
                                    if (!class84.field1365) {
                                        class388.method2457(0);
                                    }
                                }
                            }
                            boolean var19;
                            if (class129.field2111 >= var12 && class291.field4327 >= var13 && class129.field2111 < var14 && class291.field4327 < var15) {
                                var19 = true;
                            } else {
                                var19 = false;
                            }
                            if (!class84.field1365 && var19) {
                                class248.method1790((byte) -42, class291.field4327 - var11, class129.field2111 - var10, var9);
                            }
                            if (var9.field3825) {
                                boolean var20 = false;
                                if (class408.field5943 == 1 && var19) {
                                    var20 = true;
                                }
                                boolean var21 = false;
                                if (class60.field951 == 1 && class62.field1000 >= var12 && class78.field1320 >= var13 && class62.field1000 < var14 && class78.field1320 < var15) {
                                    var21 = true;
                                }
                                if (var9.field3834 != null) {
                                    for (int var22 = 0; var22 < var9.field3834.length; var22++) {
                                        if (class33.field482[var9.field3834[var22]]) {
                                            if (var9.field3907 == null || class267.field4002 >= var9.field3907[var22]) {
                                                byte var23 = var9.field3901[var22];
                                                if (var23 == 0 || ((var23 & 0x8) == 0 || !class33.field482[86] && !class33.field482[82] && !class33.field482[81]) && ((var23 & 0x2) == 0 || class33.field482[86]) && ((var23 & 0x1) == 0 || class33.field482[82]) && ((var23 & 0x4) == 0 || class33.field482[81])) {
                                                    class153.method1183(27425, -1, "", var22 + 1, var9.field3854);
                                                    int var24 = var9.field3893[var22];
                                                    if (var9.field3907 == null) {
                                                        var9.field3907 = new int[var9.field3834.length];
                                                    }
                                                    if (var24 == 0) {
                                                        var9.field3907[var22] = Integer.MAX_VALUE;
                                                    } else {
                                                        var9.field3907[var22] = class267.field4002 + var24;
                                                    }
                                                }
                                            }
                                        } else if (var9.field3907 != null) {
                                            var9.field3907[var22] = 0;
                                        }
                                    }
                                }
                                if (var21) {
                                    class268.method1911(var9, class62.field1000 - var10, 0, class78.field1320 - var11);
                                }
                                if (class273.field4109 != null && class273.field4109 != var9 && var19 && method1815(var9).method2615(false)) {
                                    class135.field2162 = var9;
                                }
                                if (class276.field4156 == var9) {
                                    class239.field3451 = true;
                                    class278.field4187 = var10;
                                    class452.field6584 = var11;
                                }
                                if (var9.field3857 || var9.field3821 != 0) {
                                    if (var19 && class282.field4228 != 0 && var9.field3913 != null) {
                                        class254 var25 = new class254();
                                        var25.field3667 = true;
                                        var25.field3678 = var9;
                                        var25.field3680 = class282.field4228;
                                        var25.field3683 = var9.field3913;
                                        class182.field2688.method148((byte) 85, var25);
                                    }
                                    if (class273.field4109 != null || class133.field2141 != null || class84.field1365 || var9.field3821 != 1400 && class5.field34 > 0) {
                                        var21 = false;
                                        var20 = false;
                                        var19 = false;
                                    }
                                    if (var9.field3821 != 0) {
                                        if (var9.field3821 == 1337 || var9.field3821 == 1403) {
                                            class291.field4331 = var9;
                                            if (class250.field3616 != null) {
                                                class250.field3616.method2815(var9.field3758, class73.field1235, 84);
                                            }
                                            if (var9.field3821 == 1337) {
                                                if (!class84.field1365 && var19) {
                                                    class303.method2073(20, class73.field1235);
                                                    for (class39 var26 = (class39) class83.field1358.method2496(87); var26 != null; var26 = (class39) class83.field1358.method2487(0)) {
                                                        if (class129.field2111 >= var26.field603 && class129.field2111 < var26.field607 && class291.field4327 >= var26.field605 && class291.field4327 < var26.field602) {
                                                            class388.method2457(0);
                                                            class378.method2400(-2031984799, var26.field604);
                                                        }
                                                    }
                                                }
                                                class379.method2406(var9, var10, (byte) 120, var11);
                                                continue;
                                            }
                                        }
                                        if (var9.field3821 == 1338) {
                                            if (var9.method1871(class73.field1235, 16785) == null || class234.field3392 != 0 && class234.field3392 != 3 || class84.field1365 || !var19) {
                                                continue;
                                            }
                                            int var27 = class129.field2111 - var10;
                                            int var28 = class291.field4327 - var11;
                                            int var29 = var9.field3803[var28];
                                            if (var27 < var29 || var27 > var9.field3726[var28] + var29) {
                                                continue;
                                            }
                                            int var30 = var27 - var9.field3764 / 2;
                                            int var31 = var28 - var9.field3758 / 2;
                                            int var32;
                                            if (class322.field4643 == 4) {
                                                var32 = (int) class106.field1756 & 0x3FFF;
                                            } else {
                                                var32 = (int) class106.field1756 + class1.field3 & 0x3FFF;
                                            }
                                            int var33 = class56.field897[var32];
                                            int var34 = class56.field898[var32];
                                            if (class322.field4643 != 4) {
                                                var33 = (class248.field3593 + 256) * var33 >> 8;
                                                var34 = (class248.field3593 + 256) * var34 >> 8;
                                            }
                                            int var35 = var30 * var34 + var31 * var33 >> 15;
                                            int var36 = var31 * var34 - var30 * var33 >> 15;
                                            int var37;
                                            int var38;
                                            if (class322.field4643 == 4) {
                                                var37 = (class369.field5238 >> 7) + (var35 >> 2);
                                                var38 = (class263.field3956 >> 7) - (var36 >> 2);
                                            } else {
                                                int var39 = (class86.field1394.method1070((byte) -50) - 1) * 64;
                                                var37 = (class86.field1394.field6520 - var39 >> 7) + (var35 >> 2);
                                                var38 = (class86.field1394.field6519 - var39 >> 7) - (var36 >> 2);
                                            }
                                            if (class291.field4332 && (class320.field4637 & 0x40) != 0) {
                                                class258 var40 = class102.method849((byte) -105, class46.field751, class242.field3536);
                                                if (var40 == null) {
                                                    class282.method2000(76);
                                                } else {
                                                    class26.method217(var37, class171.field2549, 18, var38, class72.field1207, 12154, " ->", 1L);
                                                }
                                                continue;
                                            }
                                            if (class336.field4809 == 1) {
                                                class26.method217(var37, class72.field1210, 39, var38, -1, 12154, "", 1L);
                                            }
                                            class26.method217(var37, class117.field1839, 15, var38, -1, 12154, "", 1L);
                                            continue;
                                        }
                                        if (var9.field3821 == 1400) {
                                            class331.field4759 = var9;
                                            if (var19) {
                                                class367.field5221 = true;
                                            }
                                            if (var21) {
                                                int var41 = (int) ((double) (class62.field1000 - var10 - var9.field3764 / 2) * 2.0D / (double) class272.field4078);
                                                int var42 = (int) (-((double) (class78.field1320 - var11 - var9.field3758 / 2) * 2.0D / (double) class272.field4078));
                                                int var43 = class110.field1797 + var41 + class272.field4096;
                                                int var44 = class373.field5295 + var42 + class272.field4088;
                                                class294 var45 = class402.method2550((byte) 84);
                                                if (var45 == null) {
                                                    continue;
                                                }
                                                int[] var46 = new int[3];
                                                var45.method2054(var43, var46, (byte) -117, var44);
                                                if (var46 != null) {
                                                    if (class33.field482[82] && class289.field4315 > 0) {
                                                        class422.method2652(var46[1], 63, var46[0], var46[2]);
                                                        continue;
                                                    }
                                                    class237.field3418 = true;
                                                    class350.field4967 = var46[0];
                                                    class257.field3724 = var46[1];
                                                    class361.field5148 = var46[2];
                                                }
                                                class5.field34 = 1;
                                                class311.field4529 = false;
                                                class174.field2567 = class129.field2111;
                                                class197.field2877 = class291.field4327;
                                                continue;
                                            }
                                            if (var20 && class5.field34 > 0) {
                                                if (class5.field34 == 1 && (class174.field2567 != class129.field2111 || class291.field4327 != class197.field2877)) {
                                                    class393.field5742 = class110.field1797;
                                                    class436.field6358 = class373.field5295;
                                                    class5.field34 = 2;
                                                }
                                                if (class5.field34 == 2) {
                                                    class311.field4529 = true;
                                                    class202.method1533((int) ((double) (class174.field2567 - class129.field2111) * 2.0D / (double) class272.field4082) + class393.field5742, true);
                                                    class198.method1513((byte) -103, class436.field6358 - (int) ((double) (class197.field2877 - class291.field4327) * 2.0D / (double) class272.field4082));
                                                }
                                                continue;
                                            }
                                            if (class5.field34 > 0 && !class311.field4529) {
                                                if ((class60.field963 == 1 || class133.method1102(-2001)) && class389.field5591 > 2) {
                                                    class238.method1732(2, -67);
                                                } else if (class19.method121(122)) {
                                                    class238.method1732(1, -96);
                                                }
                                            }
                                            class5.field34 = 0;
                                            continue;
                                        }
                                        if (var9.field3821 == 1401) {
                                            if (var20) {
                                                class113.method976(-1, class291.field4327 - var11, class129.field2111 - var10, var9.field3764, var9.field3758);
                                            }
                                            continue;
                                        }
                                        if (var9.field3821 == 1402) {
                                            class107.method947(true, var9);
                                            continue;
                                        }
                                        if (var9.field3821 == 1406) {
                                            class258.method1861(var11, var9, var10, 6);
                                            continue;
                                        }
                                    }
                                    if (!var9.field3738 && var21) {
                                        var9.field3738 = true;
                                        if (var9.field3851 != null) {
                                            class254 var47 = new class254();
                                            var47.field3667 = true;
                                            var47.field3678 = var9;
                                            var47.field3668 = class62.field1000 - var10;
                                            var47.field3680 = class78.field1320 - var11;
                                            var47.field3683 = var9.field3851;
                                            class182.field2688.method148((byte) 125, var47);
                                        }
                                    }
                                    if (var9.field3738 && var20 && var9.field3804 != null) {
                                        class254 var48 = new class254();
                                        var48.field3667 = true;
                                        var48.field3678 = var9;
                                        var48.field3668 = class129.field2111 - var10;
                                        var48.field3680 = class291.field4327 - var11;
                                        var48.field3683 = var9.field3804;
                                        class182.field2688.method148((byte) 81, var48);
                                    }
                                    if (var9.field3738 && !var20) {
                                        var9.field3738 = false;
                                        if (var9.field3886 != null) {
                                            class254 var49 = new class254();
                                            var49.field3667 = true;
                                            var49.field3678 = var9;
                                            var49.field3668 = class129.field2111 - var10;
                                            var49.field3680 = class291.field4327 - var11;
                                            var49.field3683 = var9.field3886;
                                            class18.field241.method148((byte) 78, var49);
                                        }
                                    }
                                    if (var20 && var9.field3855 != null) {
                                        class254 var50 = new class254();
                                        var50.field3667 = true;
                                        var50.field3678 = var9;
                                        var50.field3668 = class129.field2111 - var10;
                                        var50.field3680 = class291.field4327 - var11;
                                        var50.field3683 = var9.field3855;
                                        class182.field2688.method148((byte) 111, var50);
                                    }
                                    if (!var9.field3895 && var19) {
                                        var9.field3895 = true;
                                        if (var9.field3849 != null) {
                                            class254 var51 = new class254();
                                            var51.field3667 = true;
                                            var51.field3678 = var9;
                                            var51.field3668 = class129.field2111 - var10;
                                            var51.field3680 = class291.field4327 - var11;
                                            var51.field3683 = var9.field3849;
                                            class182.field2688.method148((byte) 95, var51);
                                        }
                                    }
                                    if (var9.field3895 && var19 && var9.field3735 != null) {
                                        class254 var52 = new class254();
                                        var52.field3667 = true;
                                        var52.field3678 = var9;
                                        var52.field3668 = class129.field2111 - var10;
                                        var52.field3680 = class291.field4327 - var11;
                                        var52.field3683 = var9.field3735;
                                        class182.field2688.method148((byte) 90, var52);
                                    }
                                    if (var9.field3895 && !var19) {
                                        var9.field3895 = false;
                                        if (var9.field3739 != null) {
                                            class254 var53 = new class254();
                                            var53.field3667 = true;
                                            var53.field3678 = var9;
                                            var53.field3668 = class129.field2111 - var10;
                                            var53.field3680 = class291.field4327 - var11;
                                            var53.field3683 = var9.field3739;
                                            class18.field241.method148((byte) 105, var53);
                                        }
                                    }
                                    if (var9.field3829 != null) {
                                        class254 var54 = new class254();
                                        var54.field3678 = var9;
                                        var54.field3683 = var9.field3829;
                                        class242.field3508.method148((byte) 113, var54);
                                    }
                                    if (var9.field3751 != null && class205.field3009 > var9.field3756) {
                                        if (var9.field3812 == null || class205.field3009 - var9.field3756 > 32) {
                                            class254 var59 = new class254();
                                            var59.field3678 = var9;
                                            var59.field3683 = var9.field3751;
                                            class182.field2688.method148((byte) 116, var59);
                                        } else {
                                            label688: for (int var55 = var9.field3756; var55 < class205.field3009; var55++) {
                                                int var56 = class228.field3349[var55 & 0x1F];
                                                for (int var57 = 0; var57 < var9.field3812.length; var57++) {
                                                    if (var9.field3812[var57] == var56) {
                                                        class254 var58 = new class254();
                                                        var58.field3678 = var9;
                                                        var58.field3683 = var9.field3751;
                                                        class182.field2688.method148((byte) 125, var58);
                                                        break label688;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3756 = class205.field3009;
                                    }
                                    if (var9.field3891 != null && class281.field4211 > var9.field3760) {
                                        if (var9.field3852 == null || class281.field4211 - var9.field3760 > 32) {
                                            class254 var64 = new class254();
                                            var64.field3678 = var9;
                                            var64.field3683 = var9.field3891;
                                            class182.field2688.method148((byte) 119, var64);
                                        } else {
                                            label668: for (int var60 = var9.field3760; var60 < class281.field4211; var60++) {
                                                int var61 = class282.field4222[var60 & 0x1F];
                                                for (int var62 = 0; var62 < var9.field3852.length; var62++) {
                                                    if (var9.field3852[var62] == var61) {
                                                        class254 var63 = new class254();
                                                        var63.field3678 = var9;
                                                        var63.field3683 = var9.field3891;
                                                        class182.field2688.method148((byte) 120, var63);
                                                        break label668;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3760 = class281.field4211;
                                    }
                                    if (var9.field3838 != null && class365.field5197 > var9.field3890) {
                                        if (var9.field3867 == null || class365.field5197 - var9.field3890 > 32) {
                                            class254 var69 = new class254();
                                            var69.field3678 = var9;
                                            var69.field3683 = var9.field3838;
                                            class182.field2688.method148((byte) 77, var69);
                                        } else {
                                            label648: for (int var65 = var9.field3890; var65 < class365.field5197; var65++) {
                                                int var66 = class188.field2787[var65 & 0x1F];
                                                for (int var67 = 0; var67 < var9.field3867.length; var67++) {
                                                    if (var9.field3867[var67] == var66) {
                                                        class254 var68 = new class254();
                                                        var68.field3678 = var9;
                                                        var68.field3683 = var9.field3838;
                                                        class182.field2688.method148((byte) 80, var68);
                                                        break label648;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3890 = class365.field5197;
                                    }
                                    if (var9.field3904 != null && class277.field4172 > var9.field3734) {
                                        if (var9.field3865 == null || class277.field4172 - var9.field3734 > 32) {
                                            class254 var74 = new class254();
                                            var74.field3678 = var9;
                                            var74.field3683 = var9.field3904;
                                            class182.field2688.method148((byte) 90, var74);
                                        } else {
                                            label628: for (int var70 = var9.field3734; var70 < class277.field4172; var70++) {
                                                int var71 = class209.field3047[var70 & 0x1F];
                                                for (int var72 = 0; var72 < var9.field3865.length; var72++) {
                                                    if (var9.field3865[var72] == var71) {
                                                        class254 var73 = new class254();
                                                        var73.field3678 = var9;
                                                        var73.field3683 = var9.field3904;
                                                        class182.field2688.method148((byte) 101, var73);
                                                        break label628;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3734 = class277.field4172;
                                    }
                                    if (var9.field3822 != null && class432.field6227 > var9.field3809) {
                                        if (var9.field3911 == null || class432.field6227 - var9.field3809 > 32) {
                                            class254 var79 = new class254();
                                            var79.field3678 = var9;
                                            var79.field3683 = var9.field3822;
                                            class182.field2688.method148((byte) 82, var79);
                                        } else {
                                            label608: for (int var75 = var9.field3809; var75 < class432.field6227; var75++) {
                                                int var76 = class443.field6436[var75 & 0x1F];
                                                for (int var77 = 0; var77 < var9.field3911.length; var77++) {
                                                    if (var9.field3911[var77] == var76) {
                                                        class254 var78 = new class254();
                                                        var78.field3678 = var9;
                                                        var78.field3683 = var9.field3822;
                                                        class182.field2688.method148((byte) 118, var78);
                                                        break label608;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3809 = class432.field6227;
                                    }
                                    if (class23.field352 > var9.field3881 && var9.field3833 != null) {
                                        class254 var80 = new class254();
                                        var80.field3678 = var9;
                                        var80.field3683 = var9.field3833;
                                        class182.field2688.method148((byte) 111, var80);
                                    }
                                    if (class49.field789 > var9.field3881 && var9.field3782 != null) {
                                        class254 var81 = new class254();
                                        var81.field3678 = var9;
                                        var81.field3683 = var9.field3782;
                                        class182.field2688.method148((byte) 110, var81);
                                    }
                                    if (class147.field2279 > var9.field3881 && var9.field3914 != null) {
                                        class254 var82 = new class254();
                                        var82.field3678 = var9;
                                        var82.field3683 = var9.field3914;
                                        class182.field2688.method148((byte) 88, var82);
                                    }
                                    if (class6.field57 > var9.field3881 && var9.field3781 != null) {
                                        class254 var83 = new class254();
                                        var83.field3678 = var9;
                                        var83.field3683 = var9.field3781;
                                        class182.field2688.method148((byte) 122, var83);
                                    }
                                    if (class175.field2609 > var9.field3881 && var9.field3768 != null) {
                                        class254 var84 = new class254();
                                        var84.field3678 = var9;
                                        var84.field3683 = var9.field3768;
                                        class182.field2688.method148((byte) 82, var84);
                                    }
                                    var9.field3881 = class341.field4845;
                                    if (var9.field3815 != null) {
                                        for (int var85 = 0; var85 < class228.field3334; var85++) {
                                            class254 var86 = new class254();
                                            var86.field3678 = var9;
                                            var86.field3676 = class199.field2909[var85];
                                            var86.field3674 = class441.field6405[var85];
                                            var86.field3683 = var9.field3815;
                                            class182.field2688.method148((byte) 115, var86);
                                        }
                                    }
                                    if (class64.field1037 && var9.field3823 != null) {
                                        class254 var87 = new class254();
                                        var87.field3678 = var9;
                                        var87.field3683 = var9.field3823;
                                        class182.field2688.method148((byte) 110, var87);
                                    }
                                }
                                if (var9.field3793 == 5 && var9.field3892 != -1) {
                                    var9.method1858(-82).method2815(var9.field3758, class73.field1235, -123);
                                }
                            }
                            if (!var9.field3825 && class273.field4109 == null && class133.field2141 == null && !class84.field1365) {
                                if ((var9.field3830 >= 0 || var9.field3856 != 0) && class129.field2111 >= var12 && class291.field4327 >= var13 && class129.field2111 < var14 && class291.field4327 < var15) {
                                    if (var9.field3830 >= 0) {
                                        class183.field2714 = arg0[var9.field3830];
                                    } else {
                                        class183.field2714 = var9;
                                    }
                                }
                                if (var9.field3793 == 8 && class129.field2111 >= var12 && class291.field4327 >= var13 && class129.field2111 < var14 && class291.field4327 < var15) {
                                    class348.field4926 = var9;
                                }
                                if (var9.field3882 > var9.field3758) {
                                    class13.method85(var9, class291.field4327, var9.field3764 + var10, 32, var9.field3758, class129.field2111, var11, var9.field3882);
                                }
                            }
                            class156.method1227(var11, (byte) 111, var9, arg4, var10, arg2, arg5, arg3);
                            if (var9.field3793 == 0) {
                                method1810(arg0, var9.field3854, var12, var13, var14, var15, var10 - var9.field3791, var11 - var9.field3900);
                                if (var9.field3869 != null) {
                                    method1810(var9.field3869, var9.field3854, var12, var13, var14, var15, var10 - var9.field3791, var11 - var9.field3900);
                                }
                                class120 var88 = (class120) class355.field5045.method1219((long) var9.field3854, -124);
                                if (var88 != null) {
                                    if (var88.field1875 == 0 && !class84.field1365 && var19 && !class342.field4850) {
                                        class388.method2457(0);
                                    }
                                    class200.method1521(var11, var13, var10, var14, var15, var12, var88.field1874, -25216);
                                }
                            }
                        }
                    }
                } else if (var12 < var14 && var13 < var15) {
                    class156.method1227(var11, (byte) 111, var9, arg4, var10, arg2, arg5, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1057)
    public final void method32(int arg0) {
        method1811(-27);
        field3642++;
        class14.method89((byte) -99);
        class180.method1404(0);
        class6.method34(2);
        class71.method575((byte) -123);
        class202.method1525(-2092404400);
        class90.method720(18675);
        class84.method645((byte) -121);
        class257.method1855(30131);
        class37.method270((byte) 91);
        class219.method1661(10);
        class240.method1748(0);
        class117.method992(true);
        class377.method2389((byte) 46);
        class174.method1353(116);
        class63.method485(-13158);
        class281.method1994(-8923);
        class18.method109(arg0 + 15849);
        class98.method815(-7971);
        class444.method2775(100);
        class158.method1247(-4);
        class452.method2814((byte) 111);
        class391.method2493((byte) 116);
        class258.method1870((byte) 127);
        class319.method2138(true);
        class127.method1075((byte) -11);
        class156.method1223(-21787);
        class22.method158((byte) -64);
        class359.method2303((byte) 54);
        class143.method1133(4);
        class210.method1584(-88);
        class351.method2251(122);
        class153.method1176((byte) -127);
        class51.method411(arg0 + 42697);
        class390.method2478((byte) -97);
        class220.method1675((byte) -121);
        class168.method1284((byte) -127);
        class120.method1010(arg0 ^ 0xFFFFC266);
        class417.method2618(390087964);
        class134.method1105(false);
        class186.method1447(-1);
        class382.method2414((byte) -70);
        class100.method825(-22109);
        class126.method1062(arg0 + 15847);
        class30.method226(arg0 ^ 0x3DF1);
        class59.method455(true);
        class207.method1569((byte) -127);
        class422.method2650((byte) 38);
        class35.method253((byte) 113);
        class206.method1554((byte) 35);
        class289.method2030(0);
        class435.method2730(12024);
        class276.method1970((byte) -82);
        class293.method2048((byte) 126);
        class109.method958(arg0 ^ 0xFFFF90D5);
        class99.method824(27);
        class88.method661(0);
        class428.method2671((byte) -89);
        class399.method2545((byte) -101);
        class263.method1882((byte) -109);
        class306.method2093((byte) 98);
        class279.method1985(2);
        class45.method362((byte) -23);
        class342.method2205((byte) -45);
        class283.method2008(false);
        class136.method1113(0);
        class209.method1575(1913281025);
        class124.method1045(0);
        class78.method616(-23359);
        class365.method2334((byte) 50);
        class284.method2010(-81);
        class322.method2144(-97);
        class367.method2339(arg0 ^ 0x2B1B7075);
        class302.method2071(false);
        class387.method2453(true);
        class15.method91((byte) -27);
        class191.method1477(arg0 ^ 0x6AB1);
        class379.method2405(1);
        class16.method96(-88);
        class280.method1989(-27394);
        class218.method1646((byte) 90);
        class315.method2128(128);
        class264.method1886(0);
        class23.method161(false);
        class58.method445(-10708);
        class442.method2754();
        class123.method1039(-8217);
        class408.method2579((byte) 80);
        class282.method1999(true);
        class380.method2407((byte) 79);
        class362.method2323(-31902);
        class225.method1698(-16922);
        class216.method1635();
        class272.method1947();
        class172.method1312(47047344);
        class198.method1510(128);
        class304.method2082();
        class214.method1630((byte) 22);
        class242.method1770(true);
        class355.method2279(108);
        class345.method2227((byte) 103);
        class200.method1522(true);
        class102.method847(-46);
        class415.method2598(20);
        class413.method2593(115);
        class179.method1401((byte) -112);
        class451.method2808(true);
        class321.method2141((byte) -82);
        class361.method2315(false);
        class183.method1428(false);
        class253.method1826(arg0 + 12147);
        class432.method2685((byte) 91);
        class46.method376(false);
        class419.method2634(-2821);
        class389.method2463((byte) -91);
        class74.method589((byte) 62);
        class255.method1846(-128);
        class52.method419(arg0 + 35216);
        class269.method1923(2);
        class170.method1307(true);
        class356.method2281(-62);
        class161.method1261((byte) -99);
        class277.method1981(arg0 + 21613);
        class360.method2308((byte) -59);
        class75.method593(64);
        class239.method1739((byte) -123);
        class305.method2090(99);
        class339.method2196(168);
        class196.method1503((byte) 110);
        class303.method2074(-104);
        class107.method952(arg0 + 15848);
        class346.method2232(110);
        class403.method2558((byte) -104);
        class331.method2168((byte) 116);
        class145.method1146();
        class91.method776(-1);
        class139.method1124(arg0 ^ 0xFFFFEA17);
        class265.method1892((byte) 62);
        class254.method1838(false);
        class140.method1125(31164);
        class447.method2797((byte) -84);
        class256.method1851(true);
        class69.method515(true);
        class77.method608((byte) -28);
        class54.method430();
        class364.method2325((byte) 120);
        class137.method1121((byte) 125);
        class420.method2638(arg0 ^ 0xFFFFFECD);
        class49.method391(arg0 + 13610);
        class7.method52(false);
        class148.method1157(5);
        class350.method2248(arg0 + 15742);
        class36.method256(true);
        class348.method2241(true);
        class135.method1110((byte) 122);
        class83.method643(0);
        class334.method2183(false);
        class1.method1(-126);
        class188.method1460(15340);
        class76.method599(-1439612562);
        class338.method2192(arg0 ^ 0x2ECD6870);
        class144.method1136(false);
        class79.method626((byte) 89);
        class221.method1690(true);
        class66.method502((byte) -65);
        class238.method1735(arg0 ^ 0xFFFFCACA);
        class141.method1132(true);
        class439.method2745(-110);
        class8.method55(45);
        class327.method2159();
        class192.method1482(arg0 ^ 0xFFFFC211);
        class132.method1101((byte) -28);
        class39.method333(-1);
        class20.method130((byte) 92);
        class164.method1272(false);
        class287.method2023((byte) -85);
        class56.method440(0);
        class231.method1716(128);
        class320.method2139(1833392871);
        class397.method2534(11);
        class211.method1618((byte) 121);
        class381.method2412(199);
        class446.method2791((byte) -128);
        class425.method2667(0);
        class122.method1026(true);
        class203.method1543();
        class383.method2428(-2);
        class354.method2273((byte) -11);
        class129.method1087((byte) 48);
        class393.method2503(-13);
        class243.method1775(arg0 + 38707);
        class44.method357(-1);
        class92.method779(arg0 ^ 0xFFFFF78F);
        class236.method1726(6104);
        class205.method1550(arg0 ^ 0x3DB6);
        class150.method1162(false);
        class190.method1471(0);
        class352.method2268();
        class349.method2243(true);
        class115.method981(false);
        class437.method2736(true);
        class252.method1807(-13505);
        class371.method2353(0);
        class106.method943(arg0 ^ 0x3DE8);
        class133.method1103(-2);
        class368.method2346();
        class424.method2659();
        class119.method999(-1785);
        class297.method2065(arg0 + 15725);
        class105.method935(arg0 ^ 0x3DEC);
        class199.method1517(arg0 + 15752);
        class450.method2803((byte) 79);
        class9.method62(arg0 ^ 0xFFFFC215);
        class234.method1721(-1);
        class326.method2155(0);
        class357.method2284();
        class386.method2447();
        class267.method1904(64);
        class244.method1776((byte) -86);
        class173.method1321();
        class171.method1310(-1309794792);
        class270.method1926(5658);
        class41.method341(111);
        class33.method242((byte) 113);
        class50.method398(49);
        class19.method120(-5054);
        class27.method221((byte) -126);
        class423.method2655((byte) -85);
        class394.method2508(101);
        class347.method2234(-24556);
        class358.method2296(true);
        class193.method1484((byte) 21);
        class61.method471(29714);
        class147.method1153(12);
        class372.method2370((byte) -2);
        class388.method2456(false);
        class273.method1956((byte) -48);
        class291.method2037(arg0 + 15913);
        class217.method1640(-126);
        class245.method1781(5877);
        class121.method1017(65535);
        class187.method1456(arg0 ^ 0xFFFFC262);
        class73.method584((byte) 125);
        class42.method343((byte) 80);
        class182.method1417((byte) -105);
        class310.method2116(64);
        class328.method2162(-4466);
        class93.method784((byte) -19);
        class333.method2181(86);
        class157.method1235((byte) 34);
        class48.method387(true);
        class329.method2164(84);
        class429.method2678(true);
        class28.method223(false);
        class369.method2347(-127);
        class247.method1786(true);
        class443.method2768(arg0 ^ 0x3DE8);
        class416.method2602(arg0 ^ 0x3DF4);
        class176.method1361((byte) -93);
        class152.method1169(-127);
        class275.method1966(true);
        class113.method973((byte) -77);
        class151.method1165(-253);
        class175.method1360((byte) -48);
        class40.method336((byte) -9);
        class268.method1912((byte) -90);
        class55.method438(10);
        class336.method2185((byte) 107);
        class409.method2581((byte) 124);
        class60.method460(8);
        class250.method1800((byte) 120);
        class376.method2386((byte) -26);
        class230.method1709(true);
        class12.method82(arg0 ^ 0xFFFFC26C);
        class407.method2575(true);
        class47.method382(arg0 ^ 0x3DAF);
        class85.method649((byte) 102);
        class285.method2018((byte) -117);
        class433.method2707();
        class25.method213();
        class185.method1437(false);
        class418.method2622((byte) -83);
        class384.method2437(arg0 + 15969);
        class402.method2553(113);
        class311.method2121(54);
        class292.method2045(arg0 ^ arg0);
        class197.method1507((byte) -94);
        class86.method656(-118);
        class72.method578(116);
        class341.method2201(0);
        class308.method2111(arg0 ^ 0xFFFFC217);
        class13.method84(-67);
        class431.method2680(8);
        class375.method2382(0);
        class21.method144((byte) 31);
        class288.method2027(false);
        class317.method2131(-26251);
        class441.method2750(17213);
        class307.method2098(false);
        class278.method1982((byte) 100);
        class169.method1291(113);
        class323.method2146((byte) 77);
        class286.method2019(-95);
        class398.method2538((byte) -75);
        class228.method1704(-1);
        class62.method477(-1);
        class5.method27(arg0 + 11777);
        class26.method214((byte) -3);
        if (class6.field80) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1373)
    public static final void main(String[] arg0) {
        field3645++;
        try {
            if (arg0.length != 4) {
                class48.method389(1, "argument count");
            }
            class334.field4790 = Integer.parseInt(arg0[0]);
            class360.field5124 = 2;
            if (arg0[1].equals("live")) {
                class331.field4762 = 0;
            } else if (arg0[1].equals("rc")) {
                class331.field4762 = 1;
            } else if (arg0[1].equals("wip")) {
                class331.field4762 = 2;
            } else {
                class48.method389(1, "modewhat");
            }
            class202.field2945 = class435.method2729(arg0[2], (byte) -93);
            if (class202.field2945 == -1) {
                if (arg0[2].equals("english")) {
                    class202.field2945 = 0;
                } else if (arg0[2].equals("german")) {
                    class202.field2945 = 1;
                } else {
                    class48.method389(1, "language");
                }
            }
            class407.method2572(class202.field2945, (byte) 108);
            class64.field1036 = false;
            class373.field5302 = false;
            if (arg0[3].equals("game0")) {
                class336.field4809 = 0;
            } else if (arg0[3].equals("game1")) {
                class336.field4809 = 1;
            } else {
                class48.method389(1, "game");
            }
            class170.field2531 = "";
            class307.field4490 = class336.field4809;
            class281.field4210 = 0;
            class351.field4986 = 0;
            client var1 = new client();
            class122.field1926 = var1;
            var1.method41(29, class336.field4809 == 1 ? "stellardawn" : "runescape", class331.field4762 + 32, 1024, 558, true, false, 768);
            class239.field3443.setLocation(40, 40);
        } catch (Exception var3) {
            class282.method2003((String) null, -24830, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1439)
    public static void method1811(int arg0) {
        int var1 = -121 % ((21 - arg0) / 37);
        field3636 = null;
        field3652 = null;
        field3647 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1457)
    public static final void method1812() {
        class387.field5547 = 0;
        for (int var0 = 0; var0 < class156.field2376; var0++) {
            class98 var1 = class447.field6512[class416.field6027[var0]];
            if (var1.field5663 && var1.method814((byte) -14) != -1) {
                int var2 = (var1.method1070((byte) -50) - 1) * 64 + 60;
                int var3 = var1.field6520 - var2 >> 7;
                int var4 = var1.field6519 - var2 >> 7;
                class390 var5 = class182.method1419(-97, var3, class367.field5213, var4);
                if (var5 != null) {
                    int var6 = var5.field5657;
                    if (var5 instanceof class98) {
                        var6 += 2048;
                    }
                    if (var5.field5664 == 0 && var5.method814((byte) -14) != -1) {
                        class205.field3006[class387.field5547] = var6;
                        class47.field760[class387.field5547] = var6;
                        class387.field5547++;
                        var5.field5664++;
                    }
                    class205.field3006[class387.field5547] = var6;
                    class47.field760[class387.field5547] = var1.field5657 + 2048;
                    class387.field5547++;
                    var5.field5664++;
                }
            }
        }
        class292.method2044(class47.field760, 0, class387.field5547 - 1, class205.field3006, (byte) 104);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1507)
    public static final void method1813() {
        for (int var0 = -1; var0 < class21.field317 + class156.field2376; var0++) {
            class390 var1;
            if (var0 < 0) {
                var1 = class86.field1394;
            } else if (var0 < class21.field317) {
                var1 = class367.field5225[class75.field1290[var0]];
            } else {
                var1 = class447.field6512[class416.field6027[var0 - class21.field317]];
            }
            if (var1.field5686 >= 0) {
                int var2 = var1.method1070((byte) -50);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field6520 & 0x7F) != 0 || (var1.field6519 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field6520 & 0x7F) != 64 || (var1.field6519 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field6520 >> 7;
                    int var4 = var1.field6519 >> 7;
                    if (var1.field5686 > class244.field3547[var3][var4]) {
                        class244.field3547[var3][var4] = var1.field5686;
                        class205.field3013[var3][var4] = 1;
                    } else if (class244.field3547[var3][var4] == var1.field5686) {
                        var10002 = class205.field3013[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field6520 - var5 >> 7;
                    int var7 = var1.field6519 - var5 >> 7;
                    int var8 = var1.field6520 + var5 >> 7;
                    int var9 = var1.field6519 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field5686 > class244.field3547[var10][var11]) {
                                class244.field3547[var10][var11] = var1.field5686;
                                class205.field3013[var10][var11] = 1;
                            } else if (class244.field3547[var10][var11] == var1.field5686) {
                                var10002 = class205.field3013[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1601)
    private final void method1814(int arg0) {
        field3637++;
        if (class123.field1951.field5926 > class339.field4829) {
            class111.field1808 = (class123.field1951.field5926 * 50 - 50) * 5;
            if (class86.field1396 == class250.field3621) {
                class86.field1396 = class397.field5833;
            } else {
                class86.field1396 = class250.field3621;
            }
            if (class111.field1808 > 3000) {
                class111.field1808 = 3000;
            }
            if (class123.field1951.field5926 >= 2 && class123.field1951.field5925 == 6) {
                this.method30("js5connect_outofdate", 16013);
                class240.field3463 = 1000;
                return;
            }
            if (class123.field1951.field5926 >= 4 && class123.field1951.field5925 == -1) {
                this.method30("js5crc", arg0 + 7087);
                class240.field3463 = 1000;
                return;
            }
            if (class123.field1951.field5926 >= 4 && (class240.field3463 == 0 || class240.field3463 == 5)) {
                if (class123.field1951.field5925 == 7 || class123.field1951.field5925 == 9) {
                    this.method30("js5connect_full", arg0 + 7087);
                } else if (class123.field1951.field5925 <= 0) {
                    this.method30("js5io", arg0 + 7087);
                } else {
                    this.method30("js5connect", 16013);
                }
                class240.field3463 = 1000;
                return;
            }
        }
        if (arg0 != 8926) {
            method1811(-4);
        }
        class339.field4829 = class123.field1951.field5926;
        if (class111.field1808 > 0) {
            class111.field1808--;
            return;
        }
        try {
            if (class152.field2319 == 0) {
                class140.field2217 = class188.field2783.method1383(class86.field1396, true, class447.field6515);
                class152.field2319++;
            }
            if (class152.field2319 == 1) {
                if (class140.field2217.field2121 == 2) {
                    this.method1817(1000, true);
                    return;
                }
                if (class140.field2217.field2121 == 1) {
                    class152.field2319++;
                }
            }
            if (class152.field2319 == 2) {
                class214.field3165 = new class219((Socket) class140.field2217.field2125, class188.field2783);
                class37 var2 = new class37(5);
                var2.method267(15, false);
                var2.method275(558, 1414495172);
                class214.field3165.method1653(var2.field578, 3, 5, 0);
                class152.field2319++;
                class323.field4661 = class10.method63(-21149);
            }
            if (class152.field2319 == 3) {
                if (class240.field3463 == 0 || class240.field3463 == 5 || class214.field3165.method1655(arg0 - 19487) > 0) {
                    int var3 = class214.field3165.method1662(1);
                    if (var3 != 0) {
                        this.method1817(var3, true);
                        return;
                    }
                    class152.field2319++;
                } else if ((class10.method63(-21149) - class323.field4661) > 30000L) {
                    this.method1817(1001, true);
                    return;
                }
            }
            if (class152.field2319 == 4) {
                boolean var4 = class240.field3463 == 5 || class240.field3463 == 10 || class240.field3463 == 28;
                class123.field1951.method2559((byte) -28, !var4, class214.field3165);
                class140.field2217 = null;
                class152.field2319 = 0;
                class214.field3165 = null;
            }
        } catch (IOException var5) {
            this.method1817(1002, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmb;)Lrd;", line = 1755)
    public static final class417 method1815(class258 arg0) {
        class417 var1 = (class417) class83.field1359.method1219(((long) arg0.field3854 << 32) + (long) arg0.field3860, -120);
        return var1 == null ? arg0.field3780 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 1761)
    public static final void method1816() {
        for (int var0 = 0; var0 < class183.field2703; var0++) {
            int[] var1 = class244.field3547[var0];
            for (int var2 = 0; var2 < class66.field1056; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1779)
    public final void method45(int arg0) {
        field3644++;
        if (class240.field3463 == 1000) {
            return;
        }
        long var2 = class428.method2673(125) / 1000000L - class390.field5611;
        class390.field5611 = class428.method2673(127) / 1000000L;
        boolean var4 = class372.method2364(2);
        if (var4 && class387.field5546 && class157.field2389 != null) {
            class157.field2389.method2256(true);
        }
        if (class240.field3463 == 30 || class240.field3463 == 10) {
            if (class267.field4001 != 0L && class267.field4001 < class10.method63(-21149)) {
                class211.method1616(false, class331.field4757, class285.method2015(6071), -124, class7.field99);
            } else if (class73.field1235.method670() && class62.field995) {
                class214.method1624(31269);
            }
        }
        if (class315.field4585 == null) {
            Container var5;
            if (class239.field3443 == null) {
                var5 = class188.field2783.field2639;
            } else {
                var5 = class239.field3443;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class239.field3443 == var5) {
                Insets var8 = class239.field3443.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class349.field4962 != var6 || class311.field4526 != var7) {
                if (class73.field1235 == null || class73.field1235.method705()) {
                    class383.method2433(true);
                } else {
                    class349.field4962 = var6;
                    class311.field4526 = var7;
                }
                class267.field4001 = class10.method63(-21149) + 500L;
            }
        }
        if (class315.field4585 != null && !class37.field533 && (class240.field3463 == 30 || class240.field3463 == 10)) {
            class211.method1616(false, -1, class62.field1007, -83, -1);
        }
        boolean var9 = false;
        if (class188.field2786) {
            var9 = true;
            class188.field2786 = false;
        }
        if (var9) {
            class58.method450(0);
        }
        if (class73.field1235 != null && class73.field1235.method700() || class285.method2015(6071) != 1) {
            class126.method1061(false);
        }
        int var10 = -8 / ((-arg0 - 63) / 34);
        if (class240.field3463 == 0) {
            class180.method1408(class277.field4163[class307.field4490], class407.field5932[class307.field4490], class90.field1424, (byte) 78, class69.field1124, class360.field5130[class307.field4490], var9);
        } else if (class240.field3463 == 5) {
            class79.method629(false, class277.field4163[class307.field4490].getRGB(), class73.field1235, class360.field5130[class307.field4490].getRGB(), var9 | class73.field1235.method700(), class407.field5932[class307.field4490].getRGB(), class250.field3620);
        } else if (class240.field3463 == 10) {
            class292.method2041(false);
        } else if (class240.field3463 == 25 || class240.field3463 == 28) {
            if (class326.field4695 == 1) {
                if (class382.field5437 > class323.field4658) {
                    class323.field4658 = class382.field5437;
                }
                int var11 = (class323.field4658 - class382.field5437) * 50 / class323.field4658;
                class30.method228(true, class117.field1851 + "<br>(" + var11 + "%)", class107.field1763, true);
            } else if (class326.field4695 == 2) {
                if (class381.field5395 < class176.field2629) {
                    class381.field5395 = class176.field2629;
                }
                int var12 = (class381.field5395 - class176.field2629) * 50 / class381.field5395 + 50;
                class30.method228(true, class117.field1851 + "<br>(" + var12 + "%)", class107.field1763, true);
            } else {
                class30.method228(true, class117.field1851, class107.field1763, true);
            }
        } else if (class240.field3463 == 30) {
            class140.method1126(var2, 0);
        } else if (class240.field3463 == 40) {
            class30.method228(true, class420.field6136 + "<br>" + class351.field5006, class107.field1763, true);
        }
        if (class447.field6525 == 3) {
            for (int var13 = 0; var13 < class32.field449; var13++) {
                Rectangle var14 = class256.field3698[var13];
                if (class371.field5250[var13]) {
                    class73.field1235.method736(var14.height, (byte) -40, -1996553985, var14.width, var14.x, var14.y);
                } else if (class255.field3697[var13]) {
                    class73.field1235.method736(var14.height, (byte) -40, -1996554240, var14.width, var14.x, var14.y);
                }
            }
        }
        if (class148.method1156(false)) {
            class171.method1311(125, class73.field1235);
        }
        if ((class240.field3463 == 30 || class240.field3463 == 10) && class447.field6525 == 0 && class285.method2015(6071) == 1 && !var9 && class177.field2646.equals("1.1")) {
            int var15 = 0;
            for (int var16 = 0; var16 < class32.field449; var16++) {
                if (class255.field3697[var16]) {
                    class255.field3697[var16] = false;
                    class93.field1465[var15++] = class256.field3698[var16];
                }
            }
            class73.field1235.method728(class93.field1465, var15);
        } else if (class240.field3463 != 0) {
            class73.field1235.method749();
            for (int var17 = 0; var17 < class32.field449; var17++) {
                class255.field3697[var17] = false;
            }
        }
        if (class98.field1529) {
            class19.method117(16383);
        }
        if (class12.field197 && class240.field3463 == 10 && class321.field4642 != -1) {
            class12.field197 = false;
            class119.method1002(0, class188.field2783);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1998)
    public final void method37(int arg0) {
        if (arg0 != 600) {
            this.method1822((byte) -62);
        }
        field3639++;
        if (class240.field3463 == 1000) {
            return;
        }
        class267.field4002++;
        if ((class267.field4002 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class111.field1807 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class23.field351.setSeed((long) class111.field1807);
        }
        this.method1824(120);
        if (class1.field2 != null) {
            class1.field2.method990(-125);
        }
        class134.method1108(true);
        class11.method65((byte) -125);
        class391.method2492((byte) 125);
        class388.method2455((byte) 45);
        if (class73.field1235 != null) {
            class73.field1235.method745((int) class10.method63(-21149));
        }
        if (class328.field4731 != null) {
            int var3 = class328.field4731.method1280(0);
            class282.field4228 = var3;
        }
        class27.method222((byte) 112);
        if (class240.field3463 == 0) {
            this.method1822((byte) 68);
            class79.method627(-30);
        } else if (class240.field3463 == 5) {
            this.method1822((byte) 111);
            class79.method627(-79);
        } else if (class240.field3463 == 25 || class240.field3463 == 28) {
            class416.method2600((byte) 124);
        }
        if (class240.field3463 == 10) {
            this.method1820((byte) 80);
            class34.method248(116);
            class392.method2498(-3);
            class206.method1563((byte) -41);
        } else if (class240.field3463 == 30) {
            class48.method388(-66);
        } else if (class240.field3463 == 40) {
            class206.method1563((byte) -59);
            if (class11.field159 != -3) {
                if (class11.field159 == 15) {
                    class228.method1706(32);
                } else if (class11.field159 != 2) {
                    class174.method1352((byte) -124);
                }
            }
        }
        class218.method1651(true, class73.field1235);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V", line = 2088)
    private final void method1817(int arg0, boolean arg1) {
        class152.field2319 = 0;
        field3643++;
        if (!arg1) {
            method1812();
        }
        class140.field2217 = null;
        class214.field3165 = null;
        class123.field1951.field5925 = arg0;
        class123.field1951.field5926++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2107)
    public final void init() {
        field3648++;
        if (!this.method42(1)) {
            return;
        }
        class334.field4790 = Integer.parseInt(this.getParameter("worldid"));
        class360.field5124 = Integer.parseInt(this.getParameter("modewhere"));
        if (class360.field5124 < 0 || class360.field5124 > 1) {
            class360.field5124 = 0;
        }
        class331.field4762 = Integer.parseInt(this.getParameter("modewhat"));
        if (class331.field4762 < 0 || class331.field4762 > 2) {
            class331.field4762 = 0;
        }
        try {
            class202.field2945 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class202.field2945 = 0;
        }
        class407.method2572(class202.field2945, (byte) 108);
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class64.field1036 = true;
        } else {
            class64.field1036 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class373.field5302 = true;
        } else {
            class373.field5302 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class336.field4809 = 1;
        } else {
            class336.field4809 = 0;
        }
        try {
            class351.field4986 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class351.field4986 = 0;
        }
        class107.field1765 = this.getParameter("quiturl");
        class170.field2531 = this.getParameter("settings");
        if (class170.field2531 == null) {
            class170.field2531 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class281.field4210 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class281.field4210 = 0;
            }
        }
        class307.field4490 = Integer.parseInt(this.getParameter("colourid"));
        if (class307.field4490 < 0 || class360.field5130.length <= class307.field4490) {
            class307.field4490 = 0;
        }
        class122.field1926 = this;
        this.method39(558, 765, class331.field4762 + 32, 503, false);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 2187)
    public static final void method1818() {
        int var0 = class279.field4189 ? class21.field317 : class21.field317 + class156.field2376;
        for (int var1 = -1; var1 < var0; var1++) {
            class390 var2;
            if (var1 < 0) {
                var2 = class86.field1394;
            } else if (var1 < class21.field317) {
                var2 = class367.field5225[class75.field1290[var1]];
            } else {
                var2 = class447.field6512[class416.field6027[var1 - class21.field317]];
            }
            if (var2.field5686 >= 0) {
                int var3 = var2.method1070((byte) -50);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field6520 & 0x7F) == 0 && (var2.field6519 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field6520 & 0x7F) == 64 && (var2.field6519 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class127 && var2.field5702 != null && class267.field4002 >= var2.field5707 && class267.field4002 < var2.field5709) {
                    ((class127) var2).field2046 = false;
                }
                var2.field6506 = class109.method957(var2.field6519, var2.field6520, class367.field5213, 20663);
                class74.method587(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 2232)
    public final void method43(byte arg0) {
        field3635++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class383.method2433(true);
        class41.field631 = new class240(class188.field2783);
        class123.field1951 = new class406();
        if (class331.field4762 != 0) {
            class275.field4144 = new byte[50][];
        }
        class398.method2539(class188.field2783, (byte) 7);
        if (class360.field5124 == 0) {
            class409.field5971 = this.getCodeBase().getHost();
            class50.field801 = 443;
            class115.field1827 = 43594;
        } else if (class360.field5124 == 1) {
            class409.field5971 = this.getCodeBase().getHost();
            class115.field1827 = class334.field4790 + 40000;
            class50.field801 = class334.field4790 + 50000;
        } else if (class360.field5124 == 2) {
            class115.field1827 = class334.field4790 + 40000;
            class409.field5971 = "127.0.0.1";
            class50.field801 = class334.field4790 + 50000;
        }
        class447.field6515 = class409.field5971;
        class285.field4266 = class115.field1827;
        class397.field5833 = class50.field801;
        class250.field3621 = class115.field1827;
        if (class336.field4809 == 1) {
            class41.field635 = true;
            class416.field6026 = class124.field1980;
            class284.field4256 = 16777215;
            class435.field6341 = 0;
            class365.field5199 = class281.field4215;
            class383.field5473 = class322.field4653;
            class196.field2874 = class179.field2666;
        } else {
            class383.field5473 = class258.field3817;
            class416.field6026 = field3647;
            class196.field2874 = class179.field2663;
            class365.field5199 = class27.field400;
        }
        class86.field1396 = class285.field4266;
        if (class177.field2636 == 3) {
            class419.field6108 = class334.field4790;
        }
        class74.field1274 = class265.field3976 = class144.field2251 = class73.field1214 = new short[256];
        class40.method337(45);
        class219.method1658(class33.field475, false);
        class40.method339(class33.field475, 109);
        class328.field4731 = class13.method86((byte) 76);
        if (class328.field4731 != null) {
            class328.field4731.method1281(true, class33.field475);
        }
        class51.field837 = class177.field2636;
        try {
            if (class188.field2783.field2641 != null) {
                class423.field6171 = new class63(class188.field2783.field2641, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class278.field4174[var3] = new class63(class188.field2783.field2642[var3], 6000, 0);
                }
                class129.field2100 = new class63(class188.field2783.field2651, 6000, 0);
                class334.field4788 = new class281(255, class423.field6171, class129.field2100, 500000);
                class76.field1303 = new class63(class188.field2783.field2649, 24, 0);
                class188.field2783.field2649 = null;
                class188.field2783.field2642 = null;
                class188.field2783.field2651 = null;
                class188.field2783.field2641 = null;
            }
        } catch (IOException var4) {
            class334.field4788 = null;
            class423.field6171 = null;
            class76.field1303 = null;
            class129.field2100 = null;
        }
        if (class336.field4809 == 0) {
            class302.field4415 = class322.field4648;
        } else if (class336.field4809 == 1) {
            class302.field4415 = class171.field2545;
        }
        if (class360.field5124 != 0) {
            class153.field2337 = true;
        }
        if (arg0 > -114) {
            field3647 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lmb;)Lmb;", line = 2359)
    public static final class258 method1819(class258 arg0) {
        int var1 = method1815(arg0).method2605(-23241);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class342.method2207(arg0.field3754, (byte) 14);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2381)
    private final void method1820(byte arg0) {
        class228.field3334 = 0;
        field3653++;
        while (class85.method653(-1) && class228.field3334 < 128) {
            if (!class192.method1481(true) || class292.field4334 != '`' && class292.field4334 != '§') {
                class199.field2909[class228.field3334] = class382.field5464;
                class441.field6405[class228.field3334] = class292.field4334;
                class228.field3334++;
            } else if (class148.method1156(false)) {
                class157.method1236((byte) 19);
            } else {
                class364.method2329((byte) -85);
            }
        }
        if (class148.method1156(false)) {
            class269.method1917(127);
        }
        class409.field5967++;
        if (arg0 != 80) {
            field3641 = -54;
        }
        class379.method2406((class258) null, -1, (byte) 95, -1);
        class258.method1861(-1, (class258) null, -1, 6);
        if (class321.field4642 != -1) {
            class200.method1521(0, 0, 0, class113.field1819, class277.field4170, 0, class321.field4642, arg0 ^ 0xFFFF9DD0);
        }
        class341.field4845++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class98 var12 = class447.field6512[var2];
            if (var12 != null) {
                byte var13 = var12.field1545.field171;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method1070((byte) -50);
                    if ((var13 & 0x2) != 0 && var12.field5695 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field5694[0] + var15;
                            int var18 = var12.field5696[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class183.field2703 - var14 - 1) {
                                var17 = class183.field2703 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > class66.field1056 - var14 - 1) {
                                var18 = class66.field1056 - var14 - 1;
                            }
                            int var19 = class446.method2790(var17, var12.field5696[0], var14, var12.field5694[0], class322.field4646[var12.field6509], 0, -1, true, var14, 22, 0, class156.field2367, class83.field1361, var18, var14);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field5694[var20] = class156.field2367[var19 - var20 - 1];
                                    var12.field5696[var20] = class83.field1361[var19 - var20 - 1];
                                    var12.field5701[var20] = 1;
                                }
                                var12.field5695 = var19;
                            }
                        }
                    }
                    class240.method1749((byte) -103, var12, true);
                    int var21 = class193.method1487((byte) 66, var12);
                    class91.method770(class399.field5870, class73.field1223, arg0 ^ 0x50, var12, var21);
                    class387.method2452(var12, -11877);
                }
            }
        }
        if (class419.field6072 == 0 && class205.field3012 == 0) {
            if (class322.field4643 == 2) {
                class315.method2126(0);
            } else {
                class150.method1163(-13736);
            }
            if ((class265.field3985 >> 7) < 14 || class265.field3985 >> 7 >= class183.field2703 - 14 || (class286.field4288 >> 7) < 14 || class286.field4288 >> 7 >= class66.field1056 - 14) {
                class49.method393(75);
            }
        }
        while (true) {
            class254 var3;
            class258 var4;
            class258 var5;
            do {
                var3 = (class254) class242.field3508.method150(0);
                if (var3 == null) {
                    while (true) {
                        class254 var6;
                        class258 var7;
                        class258 var8;
                        do {
                            var6 = (class254) class18.field241.method150(0);
                            if (var6 == null) {
                                while (true) {
                                    class254 var9;
                                    class258 var10;
                                    class258 var11;
                                    do {
                                        var9 = (class254) class182.field2688.method150(0);
                                        if (var9 == null) {
                                            if (class273.field4109 != null) {
                                                class244.method1777(arg0 ^ 0x5E68);
                                            }
                                            if ((class267.field4002 % 1500) == 0) {
                                                class230.method1713((byte) 57);
                                            }
                                            class207.method1566((byte) 112);
                                            if (class315.field4587 && class10.method63(-21149) - 60000L > class402.field5880) {
                                                class239.method1740((byte) 102);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field3678;
                                        if (var10.field3860 < 0) {
                                            break;
                                        }
                                        var11 = class342.method2207(var10.field3754, (byte) 14);
                                    } while (var11 == null || var11.field3869 == null || var11.field3869.length <= var10.field3860 || var11.field3869[var10.field3860] != var10);
                                    class216.method1636(var9);
                                }
                            }
                            var7 = var6.field3678;
                            if (var7.field3860 < 0) {
                                break;
                            }
                            var8 = class342.method2207(var7.field3754, (byte) 14);
                        } while (var8 == null || var8.field3869 == null || var8.field3869.length <= var7.field3860 || var8.field3869[var7.field3860] != var7);
                        class216.method1636(var6);
                    }
                }
                var4 = var3.field3678;
                if (var4.field3860 < 0) {
                    break;
                }
                var5 = class342.method2207(var4.field3754, (byte) 14);
            } while (var5 == null || var5.field3869 == null || var5.field3869.length <= var4.field3860 || var5.field3869[var4.field3860] != var4);
            class216.method1636(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 2614)
    public static final void method1821() {
        int var0 = class279.field4189 ? class21.field317 : class21.field317 + class156.field2376;
        for (int var1 = -1; var1 < var0; var1++) {
            class390 var2;
            if (var1 < 0) {
                var2 = class86.field1394;
            } else if (var1 < class21.field317) {
                var2 = class367.field5225[class75.field1290[var1]];
            } else {
                var2 = class447.field6512[class416.field6027[var1 - class21.field317]];
            }
            var2.field5664 = 0;
            if (var2.field5686 < 0) {
                var2.field5663 = false;
            } else {
                int var3 = var2.method1070((byte) -50);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field6520 & 0x7F) != 0 || (var2.field6519 & 0x7F) != 0) {
                        var2.field5663 = false;
                        continue;
                    }
                } else if ((var2.field6520 & 0x7F) != 64 || (var2.field6519 & 0x7F) != 64) {
                    var2.field5663 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field6520 >> 7;
                    int var5 = var2.field6519 >> 7;
                    if (class244.field3547[var4][var5] != var2.field5686) {
                        var2.field5663 = true;
                        continue;
                    }
                    if (class205.field3013[var4][var5] > 1) {
                        var10002 = class205.field3013[var4][var5]--;
                        var2.field5663 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field6520 - var6 >> 7;
                    int var8 = var2.field6519 - var6 >> 7;
                    int var9 = var2.field6520 + var6 >> 7;
                    int var10 = var2.field6519 + var6 >> 7;
                    if (!class402.method2548(var7, 128, var9, var8, var10, var2.field5686)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class244.field3547[var11][var12] == var2.field5686) {
                                    var10002 = class205.field3013[var11][var12]--;
                                }
                            }
                        }
                        var2.field5663 = true;
                        continue;
                    }
                }
                if (var2 instanceof class127 && var2.field5702 != null && class267.field4002 >= var2.field5707 && class267.field4002 < var2.field5709) {
                    ((class127) var2).field2046 = false;
                }
                var2.field5663 = false;
                var2.field6506 = class109.method957(var2.field6519, var2.field6520, class367.field5213, 20663);
                class74.method587(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2731)
    private final void method1822(byte arg0) {
        if (!class12.field197) {
            label227: while (true) {
                do {
                    if (!class85.method653(-1)) {
                        break label227;
                    }
                } while (class292.field4334 != 's' && class292.field4334 != 'S');
                class12.field197 = true;
            }
        }
        field3646++;
        if (class409.field5970 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class10.method63(-21149);
            if (class74.field1278 == 0L) {
                class74.field1278 = var4;
            }
            if (var3 > 16384 && (var4 - class74.field1278) < 5000L) {
                if ((var4 - class30.field440) > 1000L) {
                    System.gc();
                    class30.field440 = var4;
                }
                class69.field1124 = 5;
                class90.field1424 = class113.field1816;
            } else {
                class90.field1424 = class397.field5815;
                class409.field5970 = 10;
                class69.field1124 = 5;
            }
        } else if (class409.field5970 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class322.field4646[var6] = class50.method401(class183.field2703, (byte) 113, class66.field1056);
            }
            class90.field1424 = class389.field5593;
            class409.field5970 = 20;
            class69.field1124 = 10;
        } else if (class409.field5970 == 20) {
            if (class1.field2 == null) {
                class1.field2 = new class117(class123.field1951, class41.field631);
            }
            if (class1.field2.method994((byte) -110)) {
                class362.field5159 = class98.method813(1, 0, 1000000, false, true);
                class399.field5867 = class98.method813(1, 1, 1000000, false, true);
                class217.field3222 = class98.method813(1, 2, 1000000, false, true);
                class240.field3469 = class98.method813(1, 3, 1000000, false, true);
                class176.field2622 = class98.method813(1, 4, 1000000, false, true);
                class119.field1862 = class98.method813(1, 5, 1000000, true, true);
                class446.field6501 = class98.method813(1, 6, 1000000, true, false);
                class270.field4043 = class98.method813(1, 7, 1000000, false, true);
                class100.field1561 = class98.method813(1, 8, 1000000, false, true);
                class446.field6488 = class98.method813(1, 9, 1000000, false, true);
                class74.field1282 = class98.method813(1, 10, 1000000, false, true);
                class151.field2312 = class98.method813(1, 11, 1000000, false, true);
                class132.field2126 = class98.method813(1, 12, 1000000, false, true);
                class275.field4139 = class98.method813(1, 13, 1000000, false, true);
                class109.field1780 = class98.method813(1, 14, 1000000, false, false);
                class273.field4105 = class98.method813(1, 15, 1000000, false, true);
                class238.field3425 = class98.method813(1, 16, 1000000, false, true);
                class361.field5141 = class98.method813(1, 17, 1000000, false, true);
                class247.field3585 = class98.method813(1, 18, 1000000, false, true);
                class40.field620 = class98.method813(1, 19, 1000000, false, true);
                class48.field783 = class98.method813(1, 20, 1000000, false, true);
                class28.field422 = class98.method813(1, 21, 1000000, false, true);
                class12.field208 = class98.method813(1, 22, 1000000, false, true);
                class49.field785 = class98.method813(1, 23, 1000000, true, true);
                class390.field5644 = class98.method813(1, 24, 1000000, false, true);
                class323.field4659 = class98.method813(1, 25, 1000000, false, true);
                class394.field5753 = class98.method813(1, 26, 1000000, true, true);
                class293.field4352 = class98.method813(1, 27, 1000000, false, true);
                class347.field4910 = class98.method813(1, 28, 1000000, true, true);
                class90.field1424 = class450.field6536;
                class69.field1124 = 15;
                class409.field5970 = 30;
            } else {
                class90.field1424 = class214.field3164;
                class69.field1124 = 12;
            }
        } else if (class409.field5970 == 30) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class359.field5121[var8].method2397(125) * class315.field4589[var8] / 100;
            }
            if (var7 == 100) {
                class69.field1124 = 20;
                class90.field1424 = class360.field5136;
                class141.method1128(16742584, class100.field1561);
                class58.method452(1, class100.field1561);
                class409.field5970 = 40;
            } else {
                class69.field1124 = 20;
                if (var7 != 0) {
                    class90.field1424 = class106.field1754 + var7 + "%";
                }
            }
        } else if (class409.field5970 == 40) {
            if (class347.field4910.method1345((byte) 46)) {
                this.method1825(class347.field4910.method1336(-122, 1), 19);
                class409.field5970 = 50;
                class69.field1124 = 25;
                class90.field1424 = class39.field611;
            } else {
                class90.field1424 = class5.field35 + class347.field4910.method1347((byte) -50) + "%";
                class69.field1124 = 25;
            }
        } else if (class409.field5970 == 50) {
            class292.method2040(2, 22050, -119, class59.field946);
            class255.field3690 = new class210();
            class255.field3690.method1594(128, 16384, 9);
            class157.field2389 = class78.method609(22050, class188.field2783, 0, true, class33.field475);
            class157.field2389.method2253(class255.field3690, (byte) -22);
            class157.method1231(class109.field1780, class273.field4105, class255.field3690, -22, class176.field2622);
            class91.field1446 = class78.method609(2048, class188.field2783, 1, true, class33.field475);
            class220.field3275 = new class68();
            class91.field1446.method2253(class220.field3275, (byte) -22);
            class416.field6016 = new class249(22050, class326.field4692);
            class329.field4740 = class446.field6501.method1359(64, "scape main");
            class69.field1124 = 30;
            class90.field1424 = class255.field3692;
            class409.field5970 = 60;
        } else if (class409.field5970 == 60) {
            int var9 = class388.method2458((byte) -32, class100.field1561, class275.field4139);
            int var10 = class190.method1474(6);
            if (var10 > var9) {
                class69.field1124 = 35;
                class90.field1424 = class98.field1540 + var9 * 100 / var10 + "%";
            } else {
                class90.field1424 = class164.field2467;
                class69.field1124 = 35;
                class409.field5970 = 70;
            }
        } else if (class409.field5970 == 70) {
            int var11 = class137.method1120(-7907, class100.field1561);
            int var12 = class377.method2387(95);
            if (var12 > var11) {
                class90.field1424 = class247.field3584 + var11 * 100 / var12 + "%";
                class69.field1124 = 40;
            } else {
                class90.field1424 = class364.field5182;
                class69.field1124 = 40;
                class409.field5970 = 80;
            }
        } else if (class409.field5970 == 80) {
            if (class394.field5753.method1345((byte) 69)) {
                class196.field2873 = new class373(class394.field5753, class446.field6488, class100.field1561);
                class90.field1424 = class157.field2395;
                class409.field5970 = 90;
                class69.field1124 = 45;
            } else {
                class90.field1424 = class358.field5111 + class394.field5753.method1347((byte) -50) + "%";
                class69.field1124 = 45;
            }
        } else if (class409.field5970 == 90) {
            class90.field1424 = class268.field4023;
            class69.field1124 = 50;
            class409.field5970 = 95;
        } else if (class409.field5970 == 95) {
            if (class12.field197) {
                class230.field3364 = 0;
                class360.field5139 = 0;
                class62.field1007 = 1;
                class319.field4614 = 0;
                class436.field6356 = 0;
            }
            class12.field197 = true;
            class119.method1002(0, class188.field2783);
            class211.method1617(-55);
            class198.method1508(false, -26411, class230.field3364);
            class90.field1424 = class267.field4000;
            class69.field1124 = 55;
            class409.field5970 = 100;
        } else if (class409.field5970 == 100) {
            class441.method2749(0, class275.field4139, class73.field1235, class100.field1561);
            class69.field1124 = 60;
            class90.field1424 = class441.field6408;
            class168.method1288(-6, 5);
            class409.field5970 = 110;
        } else if (class409.field5970 == 110) {
            class217.field3222.method1345((byte) 27);
            byte var13 = 0;
            int var14 = var13 + class217.field3222.method1347((byte) -50);
            class238.field3425.method1345((byte) 107);
            int var15 = var14 + class238.field3425.method1347((byte) -50);
            class361.field5141.method1345((byte) 97);
            int var16 = var15 + class361.field5141.method1347((byte) -50);
            class247.field3585.method1345((byte) 66);
            int var17 = var16 + class247.field3585.method1347((byte) -50);
            class40.field620.method1345((byte) 17);
            int var18 = var17 + class40.field620.method1347((byte) -50);
            class48.field783.method1345((byte) 110);
            int var19 = var18 + class48.field783.method1347((byte) -50);
            class28.field422.method1345((byte) 22);
            int var20 = var19 + class28.field422.method1347((byte) -50);
            class12.field208.method1345((byte) 93);
            int var21 = var20 + class12.field208.method1347((byte) -50);
            class390.field5644.method1345((byte) 19);
            int var22 = var21 + class390.field5644.method1347((byte) -50);
            class323.field4659.method1345((byte) 113);
            int var23 = var22 + class323.field4659.method1347((byte) -50);
            class293.field4352.method1345((byte) 76);
            int var24 = var23 + class293.field4352.method1347((byte) -50);
            if (var24 < 1100) {
                class69.field1124 = 65;
                class90.field1424 = class380.field5391 + var24 / 11 + "%";
            } else {
                class207.method1568(106, class217.field3222);
                class7.method49(class217.field3222, 1);
                class183.method1427(class217.field3222, (byte) -19);
                class56.method441(class270.field4043, class217.field3222, 0);
                class249.method1795(class270.field4043, class238.field3425, true, -26455);
                class422.method2649(class247.field3585, true, class270.field4043, (byte) -107);
                class26.method218(27594, true, class40.field620, class270.field4043);
                class375.method2383(class217.field3222, (byte) -109);
                class26.method216(class362.field5159, class399.field5867, class48.field783, -74);
                class196.method1505(class217.field3222, 28);
                class193.method1489(1583160, class28.field422, class270.field4043);
                class9.method60(class12.field208, 1);
                class179.method1399(class217.field3222, (byte) 122);
                class55.method437(-18856, class240.field3469, class270.field4043, class100.field1561, class275.field4139);
                class123.method1036((byte) -109, class217.field3222);
                class214.method1627(class361.field5141, (byte) -108);
                class180.method1406(false, new class356(), class390.field5644, class323.field4659);
                class161.method1264(class323.field4659, (byte) 32, class390.field5644);
                class218.method1652(-73, class217.field3222);
                class239.method1738((byte) 28, class217.field3222);
                class225.method1697((byte) 104, class217.field3222);
                class11.method76((byte) 127, class100.field1561, class217.field3222);
                class349.method2244(class217.field3222, false, class100.field1561);
                class423.method2654(class217.field3222, true);
                class18.method101(-28075, class100.field1561, class217.field3222);
                class44.method358(class217.field3222, 72);
                class242.method1766(class217.field3222, (byte) 127);
                class69.field1124 = 65;
                class90.field1424 = class211.field3144;
                class230.method1714(-28016);
                class409.field5970 = 120;
            }
        } else if (class409.field5970 == 120) {
            int var25 = class52.method416(true, class100.field1561);
            int var26 = class437.method2737(-28015);
            if (var25 < var26) {
                class69.field1124 = 70;
                class90.field1424 = class21.field314 + var25 * 100 / var26 + "%";
            } else {
                class174.method1334(class73.field1235, (byte) -12, class100.field1561);
                class302.method2070(126, class171.field2548);
                class69.field1124 = 70;
                class90.field1424 = class39.field613;
                class409.field5970 = 130;
            }
        } else if (class409.field5970 == 130) {
            class48.field781 = new class84();
            class188.field2783.method1384(class48.field781, true, 10);
            class90.field1424 = class28.field423;
            class409.field5970 = 140;
            class69.field1124 = 75;
        } else if (class409.field5970 == 140) {
            if (class74.field1282.method1337("", "huffman", false)) {
                class107 var27 = new class107(class74.field1282.method1328("", (byte) -97, "huffman"));
                class389.method2465((byte) 112, var27);
                class69.field1124 = 80;
                class90.field1424 = class242.field3535;
                class409.field5970 = 150;
            } else {
                class69.field1124 = 80;
                class90.field1424 = class263.field3961 + "0%";
            }
        } else if (class409.field5970 == 150) {
            if (!class240.field3469.method1345((byte) 117)) {
                class90.field1424 = class418.field6069 + class240.field3469.method1347((byte) -50) * 3 / 4 + "%";
                class69.field1124 = 85;
            } else if (!class132.field2126.method1345((byte) 123)) {
                class90.field1424 = class418.field6069 + (class132.field2126.method1347((byte) -50) / 10 + 75) + "%";
                class69.field1124 = 85;
            } else if (!class275.field4139.method1345((byte) 103)) {
                class90.field1424 = class418.field6069 + (class275.field4139.method1347((byte) -50) / 20 + 85) + "%";
                class69.field1124 = 85;
            } else if (class49.field785.method1329("details", 0)) {
                class272.method1940(class49.field785);
                class28.method224(true, class293.field4352);
                class397.method2533(class196.field2873, class270.field4043, (byte) -128);
                class90.field1424 = field3652;
                class409.field5970 = 160;
                class69.field1124 = 85;
            } else {
                class90.field1424 = class418.field6069 + ((class49.field785.method1338(-4342, "details") / 10) + 90) + "%";
                class69.field1124 = 85;
            }
        } else if (class409.field5970 == 160) {
            int var28 = class157.method1232(114);
            if (var28 == -1) {
                class69.field1124 = 90;
                class90.field1424 = class33.field486;
            } else if (var28 == 7 || var28 == 9) {
                this.method30("worldlistfull", 16013);
                class168.method1288(-6, 1000);
            } else if (class273.field4114) {
                class90.field1424 = class306.field4472;
                class409.field5970 = 170;
                class69.field1124 = 90;
            } else {
                this.method30("worldlistio_" + var28, 16013);
                class168.method1288(-6, 1000);
            }
        } else if (class409.field5970 == 170) {
            class425.field6183 = new String[class242.field3534];
            class102.field1590 = new boolean[class413.field6001];
            class27.field401 = new int[class413.field6001];
            for (int var29 = 0; var29 < class413.field6001; var29++) {
                if (class126.method1063(var29, 19).field4827 == 0) {
                    class102.field1590[var29] = true;
                    class289.field4306++;
                }
                class27.field401[var29] = -1;
            }
            class348.method2242(0);
            class21.field310 = class240.field3469.method1359(91, "loginscreen");
            class119.field1862.method1340(false, -1, true);
            class446.field6501.method1340(true, -1, true);
            class100.field1561.method1340(true, -1, true);
            class275.field4139.method1340(true, -1, true);
            class74.field1282.method1340(true, -1, true);
            class240.field3469.method1340(true, -1, true);
            class217.field3222.field2564 = 2;
            class98.field1529 = true;
            class361.field5141.field2564 = 2;
            class238.field3425.field2564 = 2;
            class247.field3585.field2564 = 2;
            class40.field620.field2564 = 2;
            class48.field783.field2564 = 2;
            class28.field422.field2564 = 2;
            class211.method1616(false, -1, class62.field1007, -35, -1);
            class69.field1124 = 95;
            class409.field5970 = 180;
            class90.field1424 = class422.field6145;
        } else if (class409.field5970 == 180) {
            class183.method1420(true, -1);
        } else if (arg0 <= 23) {
            method1809();
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lmb;)Z", line = 3271)
    public static final boolean method1823(class258 arg0) {
        if (class342.field4850) {
            if (method1815(arg0).field6033 != 0) {
                return false;
            }
            if (arg0.field3793 == 0) {
                return false;
            }
        }
        return arg0.field3873;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 3285)
    private final void method1824(int arg0) {
        field3640++;
        boolean var2 = class123.field1951.method2569(-45);
        int var3 = -82 / ((arg0 - 16) / 48);
        if (!var2) {
            this.method1814(8926);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 3300)
    private final void method1825(byte[] arg0, int arg1) {
        if (arg1 <= 1) {
            field3636 = null;
        }
        field3650++;
        class37 var3 = new class37(arg0);
        while (true) {
            int var4;
            do {
                while (true) {
                    var4 = var3.method271((byte) 124);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 != 1) {
                        break;
                    }
                    int[] var7 = class317.field4596 = new int[6];
                    var7[0] = var3.method320((byte) -87);
                    var7[1] = var3.method320((byte) -87);
                    var7[2] = var3.method320((byte) -87);
                    var7[3] = var3.method320((byte) -87);
                    var7[4] = var3.method320((byte) -87);
                    var7[5] = var3.method320((byte) -87);
                }
            } while (var4 != 4);
            int var5 = var3.method271((byte) 107);
            class280.field4193 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class280.field4193[var6] = var3.method320((byte) -87);
                if (class280.field4193[var6] == 65535) {
                    class280.field4193[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 3359)
    public final void method31(int arg0) {
        field3649++;
        if (class315.field4587) {
            class239.method1740((byte) 113);
        }
        if (class73.field1235 != null) {
            class73.field1235.method685((byte) -31);
        }
        if (class315.field4585 != null) {
            class89.method664(class315.field4585, class188.field2783, arg0 ^ 0xFFFFFFFB);
            class315.field4585 = null;
        }
        if (class48.field781 != null) {
            class48.field781.field1368 = false;
        }
        class48.field781 = null;
        if (class124.field2028 != null) {
            class124.field2028.method1654(-21013);
            class124.field2028 = null;
        }
        class369.method2351(class33.field475, -1);
        class338.method2193(class33.field475, arg0 ^ arg0);
        if (class328.field4731 != null) {
            class328.field4731.method1282(class33.field475, arg0 ^ 0xFB);
        }
        class140.method1127(0);
        class248.method1792(arg0 ^ 0xFFFFFF96);
        class328.field4731 = null;
        if (class157.field2389 != null) {
            class157.field2389.method2255(false);
        }
        if (class91.field1446 != null) {
            class91.field1446.method2255(false);
        }
        class123.field1951.method2568(30000);
        class41.field631.method1752((byte) -128);
        if (class265.field3987 != null) {
            class265.field3987.method1890(false);
            class265.field3987 = null;
        }
    }
}
