import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class500 {

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "[I")
    public static int[] field6870 = new int[25];

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "Liv;")
    public static class635 field6868;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "[I")
    public static int[] field6869;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
    public static final void method2920(boolean arg0) {
        field6867++;
        if (arg0) {
            method2922(80, 68);
        }
        for (int var1 = 0; var1 < class34.field423; var1++) {
            int var2 = class4.field58[var1];
            class506 var3 = ((class647) class486.field6697.method4253((long) var2, -1)).field9191;
            int var4 = class48.field674.method2557(14929);
            if ((var4 & 0x4) != 0) {
                var4 += class48.field674.method2557(14929) << 8;
            }
            if ((var4 & 0x8000) != 0) {
                var4 += class48.field674.method2557(14929) << 16;
            }
            if ((var4 & 0x8) != 0) {
                int[] var5 = new int[4];
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] = class48.field674.method2568((byte) -80);
                    if (var5[var6] == 65535) {
                        var5[var6] = -1;
                    }
                }
                int var7 = class48.field674.method2557(14929);
                class777.method4274(var5, var7, false, var3);
            }
            if ((var4 & 0x1000) != 0) {
                int var8 = class48.field674.method2580((byte) 123);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class48.field674.method2521(115);
                int var10 = class48.field674.method2561((byte) -94);
                int var11 = var10 & 0x7;
                int var12 = var10 >> 3 & 0xF;
                if (var12 == 15) {
                    var12 = -1;
                }
                var3.method1799(1, var12, 0, var9, var8, var11);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field6964.method1297(-97)) {
                    class580.method3407(var3, -30920);
                }
                var3.method2965(524288, class677.field9511.method3700(32501, class48.field674.method2568((byte) -80)));
                var3.method1798(var3.field6964.field2737, false);
                var3.field4117 = var3.field6964.field2676 << 3;
                if (var3.field6964.method1297(-114)) {
                    class616.method3542(var3, null, 0, var3.field4136[0], null, (byte) 127, var3.field10361, var3.field4142[0]);
                }
            }
            if ((var4 & 0x4000) != 0) {
                int var13 = class48.field674.method2580((byte) 124);
                var3.field4112 = class48.field674.method2555(124);
                var3.field4116 = class48.field674.method2557(14929);
                var3.field4094 = (var13 & 0x8000) != 0;
                var3.field4075 = var13 & 0x7FFF;
                var3.field4103 = class594.field8494 + var3.field4075 + var3.field4112;
            }
            if ((var4 & 0x10) != 0) {
                var3.field4054 = class48.field674.method2576(125);
                if (var3.field4054 == 65535) {
                    var3.field4054 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field4079 = class48.field674.method2581(99);
                var3.field4070 = class48.field674.method2519(!arg0);
                var3.field4105 = class48.field674.method2529(71);
                var3.field4058 = class48.field674.method2529(51);
                var3.field4099 = class48.field674.method2576(117) + class594.field8494;
                var3.field4060 = class48.field674.method2568((byte) -80) + class594.field8494;
                var3.field4042 = class48.field674.method2561((byte) -94);
                var3.field4070 += var3.field4136[0];
                var3.field4141 = 1;
                var3.field4140 = 0;
                var3.field4079 += var3.field4142[0];
                var3.field4058 += var3.field4136[0];
                var3.field4105 += var3.field4142[0];
            }
            if ((var4 & 0x800) != 0) {
                int var14 = var3.field6964.field2715.length;
                int var15 = 0;
                if (var3.field6964.field2700 != null) {
                    var15 = var3.field6964.field2700.length;
                }
                int var16 = 0;
                if (var3.field6964.field2733 != null) {
                    var16 = var3.field6964.field2733.length;
                }
                int var17 = class48.field674.method2555(126);
                if ((var17 & 0x1) == 1) {
                    var3.field6951 = null;
                } else {
                    int[] var18 = null;
                    if ((var17 & 0x2) == 2) {
                        var18 = new int[var14];
                        for (int var19 = 0; var19 < var14; var19++) {
                            var18[var19] = class48.field674.method2565((byte) -85);
                        }
                    }
                    short[] var20 = null;
                    if ((var17 & 0x4) == 4) {
                        var20 = new short[var15];
                        for (int var21 = 0; var21 < var15; var21++) {
                            var20[var21] = (short) class48.field674.method2565((byte) -87);
                        }
                    }
                    short[] var22 = null;
                    if ((var17 & 0x8) == 8) {
                        var22 = new short[var16];
                        for (int var23 = 0; var23 < var16; var23++) {
                            var22[var23] = (short) class48.field674.method2580((byte) 92);
                        }
                    }
                    long var24 = (long) (var3.field6956++) << 32 | (long) var2;
                    var3.field6951 = new class499(var24, var18, var20, var22);
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field6949 = class48.field674.method2580((byte) 49);
                var3.field6940 = class48.field674.method2565((byte) -89);
            }
            if ((var4 & 0x10000) != 0) {
                int var26 = var3.field6964.field2695.length;
                int var27 = 0;
                if (var3.field6964.field2700 != null) {
                    var27 = var3.field6964.field2700.length;
                }
                byte var28 = 0;
                if (var3.field6964.field2733 != null) {
                    var27 = var3.field6964.field2733.length;
                }
                int var29 = class48.field674.method2557(14929);
                if ((var29 & 0x1) != 1) {
                    int[] var30 = null;
                    if ((var29 & 0x2) == 2) {
                        var30 = new int[var26];
                        for (int var31 = 0; var31 < var26; var31++) {
                            var30[var31] = class48.field674.method2580((byte) 122);
                        }
                    }
                    short[] var32 = null;
                    if ((var29 & 0x4) == 4) {
                        var32 = new short[var27];
                        for (int var33 = 0; var33 < var27; var33++) {
                            var32[var33] = (short) class48.field674.method2580((byte) 53);
                        }
                    }
                    short[] var34 = null;
                    if ((var29 & 0x8) == 8) {
                        var34 = new short[var28];
                        for (int var35 = 0; var35 < var28; var35++) {
                            var34[var35] = (short) class48.field674.method2576(127);
                        }
                    }
                    long var36 = (long) var2 | (long) (var3.field6955++) << 32;
                    new class499(var36, var30, var32, var34);
                }
            }
            if ((var4 & 0x80000) != 0) {
                int var38 = class48.field674.method2568((byte) -80);
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var39 = class48.field674.method2521(-126);
                int var40 = class48.field674.method2560(true);
                int var41 = var40 & 0x7;
                int var42 = var40 >> 3 & 0xF;
                if (var42 == 15) {
                    var42 = -1;
                }
                var3.method1799(2, var42, 0, var39, var38, var41);
            }
            if ((var4 & 0x100) != 0) {
                var3.field4072 = class48.field674.method2544(0);
                var3.field4081 = class48.field674.method2544(0);
                var3.field4074 = class48.field674.method2529(74);
                var3.field4046 = (byte) class48.field674.method2557(14929);
                var3.field4092 = class594.field8494 + class48.field674.method2576(125);
                var3.field4121 = class594.field8494 + class48.field674.method2568((byte) -80);
            }
            if ((var4 & 0x2000) != 0) {
                int var43 = class48.field674.method2560(true);
                int[] var44 = new int[var43];
                int[] var45 = new int[var43];
                for (int var46 = 0; var46 < var43; var46++) {
                    int var47 = class48.field674.method2565((byte) -95);
                    if ((var47 & 0xC000) == 49152) {
                        int var48 = class48.field674.method2576(115);
                        var44[var46] = class694.method3895(var48, var47 << 16);
                    } else {
                        var44[var46] = var47;
                    }
                    var45[var46] = class48.field674.method2580((byte) 65);
                }
                var3.method1789(var44, -19286, var45);
            }
            if ((var4 & 0x40000) != 0) {
                var3.field6953 = class48.field674.method2532((byte) -111);
                if ("".equals(var3.field6953) || var3.field6953.equals(var3.field6964.field2714)) {
                    var3.field6953 = var3.field6964.field2714;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var49 = class48.field674.method2555(125);
                if (var49 > 0) {
                    for (int var50 = 0; var50 < var49; var50++) {
                        int var51 = -1;
                        int var52 = -1;
                        int var53 = class48.field674.method2527((byte) -24);
                        int var54 = -1;
                        if (var53 == 32767) {
                            var53 = class48.field674.method2527((byte) -24);
                            var52 = class48.field674.method2527((byte) -24);
                            var51 = class48.field674.method2527((byte) -24);
                            var54 = class48.field674.method2527((byte) -24);
                        } else if (var53 == 32766) {
                            var53 = -1;
                        } else {
                            var52 = class48.field674.method2527((byte) -24);
                        }
                        int var55 = class48.field674.method2527((byte) -24);
                        int var56 = class48.field674.method2560(true);
                        var3.method1794(var51, 125, var56, var52, class594.field8494, var53, var55, var54);
                    }
                }
            }
            if ((var4 & 0x400) != 0) {
                int var57 = class48.field674.method2561((byte) -94);
                int[] var58 = new int[var57];
                int[] var59 = new int[var57];
                int[] var60 = new int[var57];
                for (int var61 = 0; var61 < var57; var61++) {
                    int var62 = class48.field674.method2568((byte) -80);
                    if (var62 == 65535) {
                        var62 = -1;
                    }
                    var58[var61] = var62;
                    var59[var61] = class48.field674.method2555(125);
                    var60[var61] = class48.field674.method2576(127);
                }
                class276.method1758(var59, var60, var3, -21386, var58);
            }
            if ((var4 & 0x80) != 0) {
                var3.field4069 = class48.field674.method2532((byte) -127);
                var3.field4102 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var63 = class48.field674.method2565((byte) -88);
                if (var63 == 65535) {
                    var63 = -1;
                }
                int var64 = class48.field674.method2577(111);
                int var65 = class48.field674.method2560(true);
                int var66 = var65 & 0x7;
                int var67 = (var65 & 0x7E) >> 3;
                if (var67 == 15) {
                    var67 = -1;
                }
                var3.method1799(0, var67, 0, var64, var63, var66);
            }
            if ((var4 & 0x20000) != 0) {
                var3.field6952 = class48.field674.method2576(120);
                if (var3.field6952 == 65535) {
                    var3.field6952 = var3.field6964.field2705;
                }
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public static void method2921(int arg0) {
        field6870 = null;
        field6868 = null;
        if (arg0 != 0) {
            field6869 = null;
        }
        field6869 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2922(int arg0, int arg1) {
        if (arg0 != 32767) {
            method2921(-6);
        }
        field6866++;
        class622 var2 = (class622) class108.field1547.method4253((long) arg1, arg0 - 32768);
        if (var2 != null) {
            class562 var3 = var2.field8775.method3983((byte) 22);
            if (var3 != null) {
                double var4 = var2.field8775.method3979((byte) 44);
                if (var4 >= (double) var3.method3273((byte) -49) && (double) var3.method3272(arg0 - 32639) >= var4) {
                    return var3.method3278((byte) 81);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method2923(int arg0, String arg1, byte arg2) {
        field6871++;
        class371 var3 = class490.method2867((byte) -111, 2, (long) arg0);
        var3.method2212(-97);
        if (arg2 != -35) {
            field6869 = null;
        }
        var3.field5227 = arg1;
    }
}
