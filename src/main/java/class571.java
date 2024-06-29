import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class571 extends class379 {

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lpc;")
    public class700 field7836;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
    public static int[] field7830 = new int[1];

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lmaa;")
    public static class497 field7835 = new class497(true);

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
    public static int[] field7841 = new int[5];

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "D")
    public static double field7828;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Z")
    public boolean field7842;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lha;I)V", line = 7)
    public static final void method3302(class66 arg0, int arg1) {
        field7831++;
        if (class718.field10089.method2736(-12418) == 0) {
            return;
        }
        if (class118.field1503.field10665.method1903(0) == 0) {
            for (class514 var2 = (class514) class718.field10089.method2725(37); var2 != null; var2 = (class514) class718.field10089.method2726(-126)) {
                class121.field1555.method2887(class145.field1820, var2.field7248, false, 24248, false, var2.field7251, var2.field7245, arg0, var2.field7253 ? class300.field3596.field7387 : null, arg0, var2.field7249, var2.field7246);
                var2.method2219(13630);
            }
            class41.method341(-77);
        } else {
            if (class699.field9510 == null) {
                Canvas var3 = new Canvas();
                var3.setSize(36, 32);
                class699.field9510 = class151.method1082(class323.field4014, 0, false, 0, class519.field7331, var3);
                class498.field6969 = class699.field9510.method579(class158.method1111(class45.field608, 0, class625.field8577, true), class600.method3418(class208.field2470, class45.field608, 0), true);
            }
            for (class514 var4 = (class514) class718.field10089.method2725(37); var4 != null; var4 = (class514) class718.field10089.method2726(-126)) {
                class121.field1555.method2887(class498.field6969, var4.field7248, false, 24248, false, var4.field7251, var4.field7245, arg0, var4.field7253 ? class300.field3596.field7387 : null, class699.field9510, var4.field7249, var4.field7246);
                var4.method2219(13630);
            }
        }
        if (arg1 >= -62) {
            field7828 = 0.4387135767672413D;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)Z", line = 59)
    public final boolean method3304(boolean arg0) {
        field7833++;
        if (!arg0) {
            this.field7836 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z", line = 70)
    public final boolean method3305(int arg0) {
        field7838++;
        int var2 = -14 / ((-arg0 - 85) / 35);
        return this.field7842;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 81)
    public static void method3306(byte arg0) {
        field7830 = null;
        if (arg0 > -72) {
            field7828 = 0.7328548788610169D;
        }
        field7835 = null;
        field7841 = null;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)I", line = 95)
    public final int method3307(boolean arg0) {
        field7840++;
        return arg0 ? -111 : 1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)I", line = 117)
    public static final int method3311(int arg0, int arg1, int arg2, int arg3) {
        field7837++;
        if (arg2 >= -125) {
            method3313(null, -107);
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;ZZLjava/lang/String;I)V", line = 140)
    public static final void method3312(String arg0, boolean arg1, boolean arg2, String arg3, int arg4) {
        class588.field8001 = arg2;
        class204.field2446 = arg1;
        int var5 = 107 % ((-arg4 - 22) / 62);
        class742.field10333 = arg0;
        if (!arg2) {
            class48.field648 = -1;
        }
        class710.field9967 = arg3;
        field7829++;
        if (!class588.field8001 && class742.field10333.equals("") || class710.field9967.equals("")) {
            class138.method1010(3, (byte) 50);
            return;
        }
        class455.field6415 = false;
        if (class268.field3168 != 1) {
            class25.field372 = 0;
            class233.field2779 = -1;
        }
        class138.method1010(-3, (byte) 50);
        class406.field5342 = 0;
        class303.field3619 = 1;
        class14.field227 = 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lfj;I)V", line = 178)
    public static final void method3313(class684 arg0, int arg1) {
        field7839++;
        if (class448.field6019 == arg0) {
            int var2 = class583.field7964.method2374((byte) 106);
            int var3 = (var2 & 0x7) + class553.field7695;
            int var4 = class620.field8435 + var3;
            int var5 = ((var2 & 0x7F) >> 4) + class158.field1964;
            int var6 = class632.field8626 + var5;
            int var7 = class583.field7964.method2421((byte) 116);
            class667 var8 = (class667) class673.field9230.method2121(110, (long) (var6 | var4 << 14 | class772.field10603 << 28));
            if (var8 != null) {
                for (class659 var9 = (class659) var8.field9164.method2725(37); var9 != null; var9 = (class659) var8.field9164.method2726(-124)) {
                    if ((var7 & 0x7FFF) == var9.field9062) {
                        var9.method2219(13630);
                        break;
                    }
                }
                if (var8.field9164.method2724((byte) -90)) {
                    var8.method2219(13630);
                }
                if (var5 >= 0 && var3 >= 0 && class596.field8090 > var5 && var3 < class107.field1350) {
                    class650.method3676(var5, -2058232919, class772.field10603, var3);
                }
            }
        } else if (class108.field1361 == arg0) {
            int var10 = class583.field7964.method2421((byte) 63);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = class583.field7964.method2386((byte) -105);
            int var12 = class158.field1964 + (var11 >> 4 & 0x7);
            int var13 = class553.field7695 + (var11 & 0x7);
            int var14 = class583.field7964.method2396((byte) 66);
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = class56.field760[var15];
            class10.method172((byte) -106, var12, var15, var13, var17, var10, var16, class772.field10603);
        } else if (class555.field7725 == arg0) {
            int var18 = class583.field7964.method2396((byte) 73);
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = class56.field760[var19];
            int var22 = class583.field7964.method2386((byte) -126);
            int var23 = ((var22 & 0x73) >> 4) + class158.field1964;
            int var24 = (var22 & 0x7) + class553.field7695;
            int var25 = class583.field7964.method2402((byte) 81);
            if (class81.method773(class118.field1502, false) || var23 >= 0 && var24 >= 0 && var23 < class596.field8090 && class107.field1350 > var24) {
                class662.method3723(class772.field10603, var19, var20, var23, var24, var25, 47, var21);
            }
        } else if (class164.field2009 == arg0) {
            int var26 = class583.field7964.method2396((byte) 37);
            int var27 = (var26 >> 4 & 0x7) + class158.field1964;
            int var28 = (var26 & 0x7) + class553.field7695;
            int var29 = class583.field7964.method2390((byte) 11);
            int var30 = class583.field7964.method2396((byte) 53);
            int var31 = class583.field7964.method2390((byte) 66);
            int var32 = class583.field7964.method2396((byte) 67);
            if (var27 >= 0 && var28 >= 0 && var27 < class596.field8090 && var28 < class107.field1350) {
                int var33 = var27 * 512 + 256;
                int var34 = var28 * 512 + 256;
                int var35 = class772.field10603;
                if (var35 < 3 && class77.method708(var27, -184949524, var28)) {
                    var35++;
                }
                class390 var36 = new class390(var29, var31, class228.field2707, class772.field10603, var35, var33, class483.method2867(class772.field10603, (byte) -93, var34, var33) - var30, var34, var27, var27, var28, var28, var32);
                class153.field1909.method2732(new class448(var36), 21939);
            }
        } else if (class784.field10829 == arg0) {
            int var37 = class583.field7964.method2396((byte) 53);
            int var38 = ((var37 & 0x7C) >> 4) + class158.field1964;
            int var39 = (var37 & 0x7) + class553.field7695;
            int var40 = class583.field7964.method2390((byte) -113);
            if (var40 == 65535) {
                var40 = -1;
            }
            int var41 = class583.field7964.method2396((byte) -125);
            int var42 = var41 >> 4 & 0xF;
            int var43 = var41 & 0x7;
            int var44 = class583.field7964.method2396((byte) 90);
            int var45 = class583.field7964.method2396((byte) -95);
            int var46 = class583.field7964.method2390((byte) -118);
            if (var38 >= 0 && var39 >= 0 && class596.field8090 > var38 && var39 < class107.field1350) {
                int var47 = var42 + 1;
                if (var38 - var47 <= class300.field3596.field3453[0] && (var38 + var47) >= class300.field3596.field3453[0] && (var39 - var47) <= class300.field3596.field3455[0] && class300.field3596.field3455[0] <= (var39 + var47)) {
                    class764.method4233(var43, (byte) -42, var46, var40, (var38 << 16) + (var39 << 8) + (class772.field10603 << 24) + var42, var45, false, var44);
                }
            }
        } else if (class683.field9352 == arg0) {
            int var48 = class583.field7964.method2396((byte) 42);
            int var49 = class158.field1964 + ((var48 & 0x7D) >> 4);
            int var50 = (var48 & 0x7) + class553.field7695;
            int var51 = class583.field7964.method2386((byte) -92);
            int var52 = var51 >> 2;
            int var53 = class56.field760[var52];
            int var54 = class583.field7964.method2393((byte) -107);
            int var55 = class583.field7964.method2390((byte) 69);
            if (var52 == 11) {
                var52 = 10;
            }
            class174 var56 = class379.field4811.method4192(27324, var55);
            int var57 = 0;
            if (var56.field2150 != null) {
                int var58 = -1;
                for (int var59 = 0; var59 < var56.field2150.length; var59++) {
                    if (var56.field2150[var59] == var52) {
                        var58 = var59;
                        break;
                    }
                }
                var57 = var56.field2156[var58].length;
            }
            int var60 = 0;
            if (var56.field2094 != null) {
                var60 = var56.field2094.length;
            }
            int var61 = 0;
            if (var56.field2174 != null) {
                var61 = var56.field2174.length;
            }
            if ((var54 & 0x1) == 1) {
                class592.method3391(class772.field10603, null, var53, var49, (byte) 27, var50);
            } else {
                int[] var62 = null;
                if ((var54 & 0x2) == 2) {
                    var62 = new int[var57];
                    for (int var63 = 0; var63 < var57; var63++) {
                        var62[var63] = class583.field7964.method2390((byte) -121);
                    }
                }
                short[] var64 = null;
                if ((var54 & 0x4) == 4) {
                    var64 = new short[var60];
                    for (int var65 = 0; var65 < var60; var65++) {
                        var64[var65] = (short) class583.field7964.method2390((byte) 0);
                    }
                }
                short[] var66 = null;
                if ((var54 & 0x8) == 8) {
                    var66 = new short[var61];
                    for (int var67 = 0; var67 < var61; var67++) {
                        var66[var67] = (short) class583.field7964.method2390((byte) -115);
                    }
                }
                class592.method3391(class772.field10603, new class481((long) (class151.field1891++), var62, var64, var66), var53, var49, (byte) 27, var50);
            }
        } else if (class283.field3281 == arg0) {
            int var68 = class583.field7964.method2386((byte) -84);
            int var69 = (var68 & 0x7) + class553.field7695;
            int var70 = class620.field8435 + var69;
            int var71 = ((var68 & 0x7A) >> 4) + class158.field1964;
            int var72 = class632.field8626 + var71;
            int var73 = class583.field7964.method2402((byte) 68);
            int var74 = class583.field7964.method2390((byte) -102);
            boolean var75 = var71 >= 0 && var69 >= 0 && var71 < class596.field8090 && class107.field1350 > var69;
            if (var75 || class81.method773(class118.field1502, false)) {
                class88.method807(class772.field10603, new class659(var74, var73), 15195, var72, var70);
                if (var75) {
                    class650.method3676(var71, -2058232919, class772.field10603, var69);
                }
            }
        } else if (class603.field8144 == arg0) {
            int var76 = class583.field7964.method2402((byte) 101);
            int var77 = class583.field7964.method2414(255);
            int var78 = class583.field7964.method2421((byte) 115);
            int var79 = class583.field7964.method2396((byte) -114);
            int var80 = (var79 & 0x7) + class553.field7695;
            int var81 = class620.field8435 + var80;
            int var82 = (var79 >> 4 & 0x7) + class158.field1964;
            int var83 = class632.field8626 + var82;
            if (class782.field10790 != var76) {
                boolean var84 = var82 >= 0 && var80 >= 0 && var82 < class596.field8090 && class107.field1350 > var80;
                if (var84 || class81.method773(class118.field1502, false)) {
                    class88.method807(class772.field10603, new class659(var78, var77), 15195, var83, var81);
                    if (var84) {
                        class650.method3676(var82, -2058232919, class772.field10603, var80);
                    }
                }
            }
        } else if (class656.field9047 == arg0) {
            int var85 = class583.field7964.method2396((byte) 97);
            int var86 = class158.field1964 + (var85 >> 4 & 0x7);
            int var87 = (var85 & 0x7) + class553.field7695;
            int var88 = class583.field7964.method2390((byte) -3);
            if (var88 == 65535) {
                var88 = -1;
            }
            int var89 = class583.field7964.method2396((byte) -82);
            int var90 = (var89 & 0xFF) >> 4;
            int var91 = var89 & 0x7;
            int var92 = class583.field7964.method2396((byte) -93);
            int var93 = class583.field7964.method2396((byte) -121);
            int var94 = class583.field7964.method2390((byte) 20);
            if (var86 >= 0 && var87 >= 0 && class596.field8090 > var86 && var87 < class107.field1350) {
                int var95 = var90 + 1;
                if (var86 - var95 <= class300.field3596.field3453[0] && var86 + var95 >= class300.field3596.field3453[0] && var87 - var95 <= class300.field3596.field3455[0] && (var87 + var95) >= class300.field3596.field3455[0]) {
                    class434.method2567(var93, var92, -1, var94, var91, var88, (var87 << 8) + ((class772.field10603 << 24) + var90 + (var86 << 16)));
                }
            }
        } else if (class708.field9944 == arg0) {
            int var96 = class583.field7964.method2390((byte) -122);
            int var97 = class583.field7964.method2396((byte) -114);
            class379.field4811.method4192(27324, var96).method1175(-121, var97);
        } else if (class621.field8526 == arg0) {
            int var98 = class583.field7964.method2396((byte) 36);
            int var99 = (var98 & 0x7) + class553.field7695;
            int var100 = var99 + class620.field8435;
            int var101 = (var98 >> 4 & 0x7) + class158.field1964;
            int var102 = var101 + class632.field8626;
            int var103 = class583.field7964.method2390((byte) 16);
            int var104 = class583.field7964.method2390((byte) 88);
            int var105 = class583.field7964.method2390((byte) 57);
            if (class673.field9230 != null) {
                class667 var106 = (class667) class673.field9230.method2121(65, (long) (class772.field10603 << 28 | var100 << 14 | var102));
                if (var106 != null) {
                    for (class659 var107 = (class659) var106.field9164.method2725(37); var107 != null; var107 = (class659) var106.field9164.method2726(-117)) {
                        if ((var103 & 0x7FFF) == var107.field9062 && var107.field9064 == var104) {
                            var107.method2219(13630);
                            var107.field9064 = var105;
                            class88.method807(class772.field10603, var107, 15195, var102, var100);
                            break;
                        }
                    }
                    if (var101 >= 0 && var99 >= 0 && class596.field8090 > var101 && class107.field1350 > var99) {
                        class650.method3676(var101, -2058232919, class772.field10603, var99);
                    }
                }
            }
        } else if (class96.field1251 == arg0) {
            class583.field7964.method2396((byte) 100);
            int var108 = class583.field7964.method2396((byte) 89);
            int var109 = ((var108 & 0x70) >> 4) + class158.field1964;
            int var110 = (var108 & 0x7) + class553.field7695;
            int var111 = class583.field7964.method2390((byte) 109);
            int var112 = class583.field7964.method2396((byte) -127);
            int var113 = class583.field7964.method2358(102);
            String var114 = class583.field7964.method2384(-6435);
            class682.method3827(var113, var114, var112, var111, class772.field10603, (byte) -95, var109, var110);
        } else {
            if (arg1 > -66) {
                field7841 = null;
            }
            if (class201.field2409 == arg0) {
                int var115 = class583.field7964.method2396((byte) -80);
                boolean var116 = (var115 & 0x80) != 0;
                int var117 = class158.field1964 + (var115 >> 3 & 0x7);
                int var118 = class553.field7695 + (var115 & 0x7);
                int var119 = var117 + class583.field7964.method2392(9);
                int var120 = class583.field7964.method2392(121) + var118;
                int var121 = class583.field7964.method2365(true);
                int var122 = class583.field7964.method2390((byte) 7);
                int var123 = class583.field7964.method2396((byte) -116) * 4;
                int var124 = class583.field7964.method2396((byte) -127) * 4;
                int var125 = class583.field7964.method2390((byte) -113);
                int var126 = class583.field7964.method2390((byte) -111);
                int var127 = class583.field7964.method2396((byte) -125);
                int var128 = class583.field7964.method2390((byte) -119);
                if (var127 == 255) {
                    var127 = -1;
                }
                if (var117 >= 0 && var118 >= 0 && var117 < class596.field8090 && var118 < class107.field1350 && var119 >= 0 && var120 >= 0 && var119 < class596.field8090 && var120 < class107.field1350 && var122 != 65535) {
                    int var129 = var128 << 2;
                    int var130 = var124 << 2;
                    int var131 = var120 * 512 + 256;
                    int var132 = var119 * 512 + 256;
                    int var133 = var117 * 512 + 256;
                    int var134 = var118 * 512 + 256;
                    int var135 = var123 << 2;
                    class68 var136 = new class68(var122, class772.field10603, class772.field10603, var133, var134, var135, class228.field2707 + var125, var126 - -class228.field2707, var127, var129, 0, var121, var130, var116, -1);
                    var136.method670(-1972170807, class228.field2707 + var125, var131, class483.method2867(class772.field10603, (byte) -68, var131, var132) - var130, var132);
                    class105.field1346.method2732(new class188(var136), 21939);
                }
            } else if (class788.field10862 == arg0) {
                int var137 = class583.field7964.method2386((byte) -126);
                int var138 = var137 >> 2;
                int var139 = var137 & 0x3;
                int var140 = class56.field760[var138];
                int var141 = class583.field7964.method2386((byte) -107);
                int var142 = ((var141 & 0x73) >> 4) + class158.field1964;
                int var143 = (var141 & 0x7) + class553.field7695;
                if (class81.method773(class118.field1502, false) || var142 >= 0 && var143 >= 0 && class596.field8090 > var142 && var143 < class107.field1350) {
                    class662.method3723(class772.field10603, var138, var139, var142, var143, -1, 98, var140);
                }
            } else if (class85.field1141 == arg0) {
                int var144 = class583.field7964.method2396((byte) 122);
                int var145 = class158.field1964 * 2 + (var144 >> 4 & 0xF);
                int var146 = (var144 & 0xF) + class553.field7695 * 2;
                int var147 = class583.field7964.method2396((byte) -107);
                boolean var148 = (var147 & 0x1) != 0;
                boolean var149 = (var147 & 0x2) != 0;
                int var150 = var149 ? var147 >> 2 : -1;
                int var151 = var145 + class583.field7964.method2392(115);
                int var152 = class583.field7964.method2392(-120) + var146;
                int var153 = class583.field7964.method2365(true);
                int var154 = class583.field7964.method2365(true);
                int var155 = class583.field7964.method2390((byte) 52);
                int var156 = class583.field7964.method2396((byte) 62);
                int var157;
                if (var149) {
                    var157 = (byte) var156;
                } else {
                    var157 = var156 * 4;
                }
                int var158 = class583.field7964.method2396((byte) -124) * 4;
                int var159 = class583.field7964.method2390((byte) -108);
                int var160 = class583.field7964.method2390((byte) -126);
                int var161 = class583.field7964.method2396((byte) 104);
                if (var161 == 255) {
                    var161 = -1;
                }
                int var162 = class583.field7964.method2390((byte) 110);
                if (var145 >= 0 && var146 >= 0 && var145 < class596.field8090 * 2 && class596.field8090 * 2 > var146 && var151 >= 0 && var152 >= 0 && class107.field1350 * 2 > var151 && class107.field1350 * 2 > var152 && var155 != 65535) {
                    int var163 = var151 * 256;
                    int var164 = var146 * 256;
                    int var165 = var157 << 2;
                    int var166 = var145 * 256;
                    int var167 = var152 * 256;
                    int var168 = var158 << 2;
                    int var169 = var162 << 2;
                    if (var153 != 0 && var150 != -1) {
                        class287 var170 = null;
                        if (var153 < 0) {
                            int var171 = -var153 - 1;
                            if (class782.field10790 == var171) {
                                var170 = class300.field3596;
                            } else {
                                var170 = class61.field825[var171];
                            }
                        } else {
                            int var172 = var153 - 1;
                            class273 var173 = (class273) class30.field444.method2121(123, (long) var172);
                            if (var173 != null) {
                                var170 = var173.field3210;
                            }
                        }
                        if (var170 != null) {
                            class15 var174 = var170.method1676(0);
                            if (var174.field279 != null && var174.field279[var150] != null) {
                                var165 -= var174.field279[var150][1];
                            }
                            if (var174.field232 != null && var174.field232[var150] != null) {
                                var165 -= var174.field232[var150][1];
                            }
                        }
                    }
                    class68 var175 = new class68(var155, class772.field10603, class772.field10603, var166, var164, var165, class228.field2707 + var159, class228.field2707 + var160, var161, var169, var153, var154, var168, var148, var150);
                    var175.method670(-1972170807, class228.field2707 + var159, var167, class483.method2867(class772.field10603, (byte) -122, var167, var163) - var168, var163);
                    class105.field1346.method2732(new class188(var175), 21939);
                }
            } else {
                class705.method4008(null, "T3 - " + arg0, -128);
                class268.method1590(12, false);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIII)Z", line = 893)
    public static final boolean method3314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7827++;
        if (arg5 > 2000 || arg0 > 2000 || arg7 > 2000 || arg3 > 2000 || arg6 > 2000 || arg4 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg0 >= -2000 && arg7 >= -2000 && arg3 >= -2000 && arg6 >= -2000 && arg4 >= -2000) {
            if (class480.field6714 == 2) {
                int var10 = class594.field8079 * arg5 + arg3;
                if (var10 >= 0 && var10 < class288.field3474.length && class288.field3474[var10] > ((arg1 << 8) - 38400)) {
                    return false;
                }
                int var11 = arg6 + (class594.field8079 * arg0);
                if (var11 >= 0 && var11 < class288.field3474.length && ((arg2 << 8) - 38400) < class288.field3474[var11]) {
                    return false;
                }
                int var12 = class594.field8079 * arg7 + arg4;
                if (var12 >= 0 && class288.field3474.length > var12 && (arg8 << 8) - 38400 < class288.field3474[var12]) {
                    return false;
                }
            }
            int var13 = arg6 - arg3;
            if (arg9 != -17851) {
                return false;
            }
            int var14 = arg0 - arg5;
            int var15 = arg4 - arg3;
            int var16 = arg7 - arg5;
            int var17 = arg2 - arg1;
            if (arg5 < arg0 && arg7 > arg7) {
                if (arg0 > arg7) {
                    arg0++;
                } else {
                    arg7++;
                }
                arg5--;
            } else if (arg7 > arg0) {
                if (arg5 <= arg7) {
                    arg7++;
                } else {
                    arg5++;
                }
                arg0--;
            } else {
                arg7--;
                if (arg0 >= arg5) {
                    arg0++;
                } else {
                    arg5++;
                }
            }
            int var18 = arg8 - arg1;
            int var19 = 0;
            if (arg0 != arg5) {
                var19 = (arg6 - arg3 << 12) / (arg0 - arg5);
            }
            int var20 = 0;
            if (arg0 != arg7) {
                var20 = (arg4 - arg6 << 12) / (arg7 - arg0);
            }
            int var21 = 0;
            if (arg5 != arg7) {
                var21 = (arg3 - arg4 << 12) / (arg5 - arg7);
            }
            int var22 = var13 * var16 - var14 * var15;
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg5 <= arg0 && arg5 <= arg7) {
                if (arg5 >= class274.field3211) {
                    return true;
                }
                if (arg7 > class274.field3211) {
                    arg7 = class274.field3211;
                }
                int var25 = (arg1 << 8) - (arg3 * var23 - var23);
                if (arg0 > class274.field3211) {
                    arg0 = class274.field3211;
                }
                if (arg7 > arg0) {
                    int var26;
                    int var27 = var26 = arg3 << 12;
                    int var28 = arg6 << 12;
                    if (arg5 < 0) {
                        var27 -= arg5 * var21;
                        var26 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        arg5 = 0;
                    }
                    if (arg0 < 0) {
                        var28 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if (arg0 != arg5 && var21 < var19 || arg0 == arg5 && var20 < var21) {
                        int var29 = arg7 - arg0;
                        int var30 = arg0 - arg5;
                        int var31 = class594.field8079 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var25, (var28 >> 12) + 1, (byte) 62, (var27 >> 12) - 1, var23, class288.field3474, var31, 0)) {
                                        return false;
                                    }
                                    var27 += var21;
                                    var25 += var24;
                                    var28 += var20;
                                    var31 += class594.field8079;
                                }
                            }
                            if (!class310.method1834(var25, (var26 >> 12) + 1, (byte) 61, (var27 >> 12) - 1, var23, class288.field3474, var31, 0)) {
                                return false;
                            }
                            var31 += class594.field8079;
                            var26 += var19;
                            var25 += var24;
                            var27 += var21;
                        }
                    } else {
                        int var32 = arg7 - arg0;
                        int var33 = arg0 - arg5;
                        int var34 = class594.field8079 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var25, (var27 >> 12) + 1, (byte) 123, (var28 >> 12) - 1, var23, class288.field3474, var34, 0)) {
                                        return false;
                                    }
                                    var34 += class594.field8079;
                                    var28 += var20;
                                    var25 += var24;
                                    var27 += var21;
                                }
                            }
                            if (!class310.method1834(var25, (var27 >> 12) + 1, (byte) -109, (var26 >> 12) - 1, var23, class288.field3474, var34, 0)) {
                                return false;
                            }
                            var27 += var21;
                            var25 += var24;
                            var26 += var19;
                            var34 += class594.field8079;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg3 << 12;
                    if (arg5 < 0) {
                        var35 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        var36 -= arg5 * var21;
                        arg5 = 0;
                    }
                    int var37 = arg4 << 12;
                    if (arg7 < 0) {
                        var37 -= arg7 * var20;
                        arg7 = 0;
                    }
                    if ((arg5 == arg7 || var21 >= var19) && (arg5 != arg7 || var19 >= var20)) {
                        int var41 = arg0 - arg7;
                        int var42 = arg7 - arg5;
                        int var43 = class594.field8079 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var25, (var37 >> 12) + 1, (byte) 91, (var35 >> 12) - 1, var23, class288.field3474, var43, 0)) {
                                        return false;
                                    }
                                    var37 += var20;
                                    var35 += var19;
                                    var43 += class594.field8079;
                                    var25 += var24;
                                }
                            }
                            if (!class310.method1834(var25, (var36 >> 12) + 1, (byte) -123, (var35 >> 12) - 1, var23, class288.field3474, var43, 0)) {
                                return false;
                            }
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                            var43 += class594.field8079;
                        }
                    } else {
                        int var38 = arg0 - arg7;
                        int var39 = arg7 - arg5;
                        int var40 = class594.field8079 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var25, (var35 >> 12) + 1, (byte) 68, (var37 >> 12) - 1, var23, class288.field3474, var40, 0)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var40 += class594.field8079;
                                    var37 += var20;
                                    var35 += var19;
                                }
                            }
                            if (!class310.method1834(var25, (var35 >> 12) + 1, (byte) -84, (var36 >> 12) - 1, var23, class288.field3474, var40, 0)) {
                                return false;
                            }
                            var25 += var24;
                            var36 += var21;
                            var40 += class594.field8079;
                            var35 += var19;
                        }
                    }
                }
            } else if (arg7 < arg0) {
                if (arg7 >= class274.field3211) {
                    return true;
                }
                if (arg5 > class274.field3211) {
                    arg5 = class274.field3211;
                }
                if (class274.field3211 < arg0) {
                    arg0 = class274.field3211;
                }
                int var44 = (arg8 << 8) + var23 - (arg4 * var23);
                if (arg5 < arg0) {
                    int var45;
                    int var46 = var45 = arg4 << 12;
                    if (arg7 < 0) {
                        var45 -= arg7 * var21;
                        var46 -= arg7 * var20;
                        var44 -= arg7 * var24;
                        arg7 = 0;
                    }
                    int var47 = arg3 << 12;
                    if (arg5 < 0) {
                        var47 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var21 > var20) {
                        int var48 = arg0 - arg5;
                        int var49 = arg5 - arg7;
                        int var50 = class594.field8079 * arg7;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var44, (var47 >> 12) + 1, (byte) 95, (var46 >> 12) - 1, var23, class288.field3474, var50, 0)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var50 += class594.field8079;
                                    var47 += var19;
                                    var46 += var20;
                                }
                            }
                            if (!class310.method1834(var44, (var45 >> 12) + 1, (byte) -56, (var46 >> 12) - 1, var23, class288.field3474, var50, 0)) {
                                return false;
                            }
                            var45 += var21;
                            var44 += var24;
                            var46 += var20;
                            var50 += class594.field8079;
                        }
                    } else {
                        int var51 = arg0 - arg5;
                        int var52 = arg5 - arg7;
                        int var53 = class594.field8079 * arg7;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var44, (var46 >> 12) + 1, (byte) -96, (var47 >> 12) - 1, var23, class288.field3474, var53, 0)) {
                                        return false;
                                    }
                                    var46 += var20;
                                    var53 += class594.field8079;
                                    var44 += var24;
                                    var47 += var19;
                                }
                            }
                            if (!class310.method1834(var44, (var46 >> 12) + 1, (byte) 124, (var45 >> 12) - 1, var23, class288.field3474, var53, 0)) {
                                return false;
                            }
                            var44 += var24;
                            var46 += var20;
                            var53 += class594.field8079;
                            var45 += var21;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg4 << 12;
                    int var56 = arg6 << 12;
                    if (arg7 < 0) {
                        var44 -= arg7 * var24;
                        var55 -= arg7 * var20;
                        var54 -= arg7 * var21;
                        arg7 = 0;
                    }
                    if (arg0 < 0) {
                        var56 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var20 >= var21) {
                        int var57 = arg5 - arg0;
                        int var58 = arg0 - arg7;
                        int var59 = class594.field8079 * arg7;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var44, (var56 >> 12) + 1, (byte) -63, (var54 >> 12) - 1, var23, class288.field3474, var59, 0)) {
                                        return false;
                                    }
                                    var56 += var19;
                                    var54 += var21;
                                    var59 += class594.field8079;
                                    var44 += var24;
                                }
                            }
                            if (!class310.method1834(var44, (var55 >> 12) + 1, (byte) 91, (var54 >> 12) - 1, var23, class288.field3474, var59, 0)) {
                                return false;
                            }
                            var55 += var20;
                            var59 += class594.field8079;
                            var44 += var24;
                            var54 += var21;
                        }
                    } else {
                        int var60 = arg5 - arg0;
                        int var61 = arg0 - arg7;
                        int var62 = class594.field8079 * arg7;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var44, (var54 >> 12) + 1, (byte) 102, (var56 >> 12) - 1, var23, class288.field3474, var62, 0)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var54 += var21;
                                    var56 += var19;
                                    var62 += class594.field8079;
                                }
                            }
                            if (!class310.method1834(var44, (var54 >> 12) + 1, (byte) 72, (var55 >> 12) - 1, var23, class288.field3474, var62, 0)) {
                                return false;
                            }
                            var62 += class594.field8079;
                            var54 += var21;
                            var55 += var20;
                            var44 += var24;
                        }
                    }
                }
            } else if (arg0 >= class274.field3211) {
                return true;
            } else {
                if (class274.field3211 < arg5) {
                    arg5 = class274.field3211;
                }
                int var63 = (arg2 << 8) + var23 - (arg6 * var23);
                if (arg7 > class274.field3211) {
                    arg7 = class274.field3211;
                }
                if (arg7 < arg5) {
                    int var64;
                    int var65 = var64 = arg6 << 12;
                    int var66 = arg4 << 12;
                    if (arg0 < 0) {
                        var65 -= arg0 * var19;
                        var63 -= arg0 * var24;
                        var64 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if (arg7 < 0) {
                        var66 -= arg7 * var21;
                        arg7 = 0;
                    }
                    if (arg0 != arg7 && var19 < var20 || arg0 == arg7 && var19 > var21) {
                        int var67 = arg5 - arg7;
                        int var68 = arg7 - arg0;
                        int var69 = class594.field8079 * arg0;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var63, (var66 >> 12) + 1, (byte) -99, (var65 >> 12) - 1, var23, class288.field3474, var69, 0)) {
                                        return false;
                                    }
                                    var69 += class594.field8079;
                                    var63 += var24;
                                    var66 += var21;
                                    var65 += var19;
                                }
                            }
                            if (!class310.method1834(var63, (var64 >> 12) + 1, (byte) -84, (var65 >> 12) - 1, var23, class288.field3474, var69, 0)) {
                                return false;
                            }
                            var63 += var24;
                            var69 += class594.field8079;
                            var65 += var19;
                            var64 += var20;
                        }
                    } else {
                        int var70 = arg5 - arg7;
                        int var71 = arg7 - arg0;
                        int var72 = class594.field8079 * arg0;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var63, (var65 >> 12) + 1, (byte) -85, (var66 >> 12) - 1, var23, class288.field3474, var72, 0)) {
                                        return false;
                                    }
                                    var66 += var21;
                                    var63 += var24;
                                    var65 += var19;
                                    var72 += class594.field8079;
                                }
                            }
                            if (!class310.method1834(var63, (var65 >> 12) + 1, (byte) -114, (var64 >> 12) - 1, var23, class288.field3474, var72, 0)) {
                                return false;
                            }
                            var65 += var19;
                            var63 += var24;
                            var72 += class594.field8079;
                            var64 += var20;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg6 << 12;
                    int var75 = arg3 << 12;
                    if (arg0 < 0) {
                        var73 -= arg0 * var20;
                        var63 -= arg0 * var24;
                        var74 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (arg5 < 0) {
                        var75 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var19 < var20) {
                        int var76 = arg7 - arg5;
                        int var77 = arg5 - arg0;
                        int var78 = class594.field8079 * arg0;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var63, (var73 >> 12) + 1, (byte) -87, (var75 >> 12) - 1, var23, class288.field3474, var78, 0)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var78 += class594.field8079;
                                    var73 += var20;
                                    var75 += var21;
                                }
                            }
                            if (!class310.method1834(var63, (var73 >> 12) + 1, (byte) -125, (var74 >> 12) - 1, var23, class288.field3474, var78, 0)) {
                                return false;
                            }
                            var78 += class594.field8079;
                            var63 += var24;
                            var74 += var19;
                            var73 += var20;
                        }
                    } else {
                        int var79 = arg7 - arg5;
                        int var80 = arg5 - arg0;
                        int var81 = class594.field8079 * arg0;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class310.method1834(var63, (var75 >> 12) + 1, (byte) -78, (var73 >> 12) - 1, var23, class288.field3474, var81, 0)) {
                                        return false;
                                    }
                                    var75 += var21;
                                    var73 += var20;
                                    var81 += class594.field8079;
                                    var63 += var24;
                                }
                            }
                            if (!class310.method1834(var63, (var74 >> 12) + 1, (byte) -110, (var73 >> 12) - 1, var23, class288.field3474, var81, 0)) {
                                return false;
                            }
                            var63 += var24;
                            var74 += var19;
                            var73 += var20;
                            var81 += class594.field8079;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V", line = 1531)
    public static final void method3315(boolean arg0, int arg1) {
        field7832++;
        class580.method3339((byte) -58);
        if (!class17.method211(class289.field3493, -25658)) {
            return;
        }
        class566.field7797++;
        if (class566.field7797 < 50 && !arg0) {
            return;
        }
        if (arg1 != -25849) {
            method3312(null, false, false, null, 111);
        }
        class566.field7797 = 0;
        if (!class455.field6415 && class436.field5748 != null) {
            class14.field224++;
            class336 var2 = class512.method3076(class447.field6016, class591.field8030, (byte) 64);
            class578.method3334(arg1 + 25853, var2);
            try {
                class671.method3765(8277);
            } catch (IOException var3) {
                class455.field6415 = true;
            }
        }
        class580.method3339((byte) -58);
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(Z)I", line = 1568)
    public int method3316(boolean arg0) {
        field7834++;
        if (arg0) {
            this.field7836 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lpc;)V", line = 1584)
    public class571(class700 arg0) {
        this.field7836 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Z")
    public abstract boolean method3301(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lld;Lld;IB)V")
    public abstract void method3303(class182 arg0, class182 arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Z")
    public abstract boolean method3308(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)V")
    public abstract void method3309(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public abstract void method3310(int arg0, int arg1);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public abstract void method3317(byte arg0);
}
