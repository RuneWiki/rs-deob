import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class548 extends class215 {

    @OriginalMember(owner = "client!gh", name = "Lb", descriptor = "Lej;")
    public static class124 field7545 = new class124(84, -1);

    @OriginalMember(owner = "client!gh", name = "Ob", descriptor = "Z")
    public static boolean field7548 = true;

    @OriginalMember(owner = "client!gh", name = "Qb", descriptor = "Loaa;")
    public static class290 field7550 = new class290(7, 0, 1, 1);

    @OriginalMember(owner = "client!gh", name = "Tb", descriptor = "I")
    public static int field7553 = 0;

    @OriginalMember(owner = "client!gh", name = "Sb", descriptor = "I")
    public static int field7552 = 0;

    @OriginalMember(owner = "client!gh", name = "Rb", descriptor = "Lej;")
    public static class124 field7551 = new class124(45, 7);

    @OriginalMember(owner = "client!gh", name = "Jb", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!gh", name = "Kb", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!gh", name = "Mb", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!gh", name = "Nb", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!gh", name = "Pb", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method3155(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class729.field9867 = 0;
        class587.field8008 = 0;
        ++class470.field6597;
        if ((arg5 & 2) == 0) {
            for (class404 var8 = class362.field5206[var7]; var8 != null; var8 = var8.field5924) {
                if (!class397.method2483(var8, arg0, arg1, arg2, arg3)) {
                    class704.method3927(var8);
                    if (var8.field5934 != -1) {
                        class339.field4772[class729.field9867++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 1) == 0) {
            for (class404 var9 = class391.field5762[var7]; var9 != null; var9 = var9.field5924) {
                if (!class397.method2483(var9, arg0, arg1, arg2, arg3)) {
                    class704.method3927(var9);
                    if (var9.field5934 != -1) {
                        class307.field4265[class587.field8008++] = var9;
                    }
                }
            }
            for (class404 var10 = class375.field5310[var7]; var10 != null; var10 = var10.field5924) {
                if (!class397.method2483(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method49((byte) 122)) {
                        class704.method3927(var10);
                        if (var10.field5934 != -1) {
                            class307.field4265[class587.field8008++] = var10;
                        }
                    } else {
                        class704.method3927(var10);
                        if (var10.field5934 != -1) {
                            class339.field4772[class729.field9867++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class612.field8367; ++var11) {
                    if (!class397.method2483(class477.field6658[var11], arg0, arg1, arg2, arg3)) {
                        class704.method3927(class477.field6658[var11]);
                        if (class477.field6658[var11].field5934 != -1) {
                            if (class477.field6658[var11].method49((byte) 122)) {
                                class307.field4265[class587.field8008++] = class477.field6658[var11];
                            } else {
                                class339.field4772[class729.field9867++] = class477.field6658[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class729.field9867 > 0) {
            class534.method3077(class339.field4772, 0, class729.field9867 - 1);
            for (int var12 = 0; var12 < class729.field9867; ++var12) {
                class633.method3614(class339.field4772[var12], true, arg6);
            }
        }
        if (class390.field5647) {
            class44.field982.method329(0, (class669[]) null);
        }
        if ((arg5 & 2) == 0) {
            for (int var13 = class53.field1096; var13 < class510.field7094; ++var13) {
                if (var13 >= arg2 && arg1 != null) {
                    int var14 = class196.field2890.length;
                    if (class196.field2890.length + class237.field3442 > class434.field6208) {
                        var14 -= class196.field2890.length + class237.field3442 - class434.field6208;
                    }
                    int var15 = class196.field2890[0].length;
                    if (class196.field2890[0].length + class38.field943 > class432.field6185) {
                        var15 -= class196.field2890[0].length + class38.field943 - class432.field6185;
                    }
                    boolean[][] var16 = class272.field3824;
                    if (class148.field2474) {
                        if (class719.field9783) {
                            var16 = class375.field5307[var13];
                        }
                        for (int var17 = class232.field3369; var17 < var14; ++var17) {
                            int var18 = class237.field3442 + var17 - class232.field3369;
                            for (int var19 = class214.field3048; var19 < var15; ++var19) {
                                var16[var17][var19] = false;
                                if (class196.field2890[var17][var19]) {
                                    int var20 = class38.field943 + var19 - class214.field3048;
                                    for (int var21 = var13; var21 >= 0; --var21) {
                                        if (class649.field8928[var21][var18][var20] != null && class649.field8928[var21][var18][var20].field5570 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class393.method2471(var13, var18, (byte) -97, var20)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class719.field9783) {
                        if (arg4 >= 0) {
                            class683.field9250[var13].method1156(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class683.field9250[var13].method1160(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class9.field124; ++var22) {
                            class516.field7188[var22].method3477(new class42(var13 + 1), -1);
                        }
                    } else if (arg4 >= 0) {
                        class683.field9250[var13].method1156(class134.field2256, class492.field6813, class708.field9611, class272.field3824, false, arg4, arg5);
                    } else {
                        class683.field9250[var13].method1160(class134.field2256, class492.field6813, class708.field9611, class272.field3824, false, arg5);
                    }
                } else {
                    int var23 = class196.field2890.length;
                    if (class196.field2890.length + class237.field3442 > class434.field6208) {
                        var23 -= class196.field2890.length + class237.field3442 - class434.field6208;
                    }
                    int var24 = class196.field2890[0].length;
                    if (class196.field2890[0].length + class38.field943 > class432.field6185) {
                        var24 -= class196.field2890[0].length + class38.field943 - class432.field6185;
                    }
                    boolean[][] var25 = class272.field3824;
                    if (class148.field2474) {
                        if (class719.field9783) {
                            var25 = class375.field5307[var13];
                        }
                        for (int var26 = class232.field3369; var26 < var23; ++var26) {
                            int var27 = class237.field3442 + var26 - class232.field3369;
                            for (int var28 = class214.field3048; var28 < var24; ++var28) {
                                if (class196.field2890[var26][var28] && !class393.method2471(var13, var27, (byte) -97, class38.field943 + var28 - class214.field3048)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class719.field9783) {
                        if (arg4 >= 0) {
                            class683.field9250[var13].method1156(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class683.field9250[var13].method1160(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class9.field124; ++var29) {
                            class516.field7188[var29].method3477(new class42(var13 + 1), -1);
                        }
                    } else if (arg4 >= 0) {
                        class683.field9250[var13].method1156(class134.field2256, class492.field6813, class708.field9611, class272.field3824, true, arg4, arg5);
                    } else {
                        class683.field9250[var13].method1160(class134.field2256, class492.field6813, class708.field9611, class272.field3824, true, arg5);
                    }
                }
            }
        }
        if (class587.field8008 > 0) {
            class283.method1860(class307.field4265, 0, class587.field8008 - 1);
            for (int var30 = 0; var30 < class587.field8008; ++var30) {
                class633.method3614(class307.field4265[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IF)V")
    public final void method3156(int arg0, float arg1) {
        ++field7543;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field3066[super.field3109++] = (byte) var3;
        super.field3066[super.field3109++] = (byte) (var3 >> 8);
        if (arg0 != 18291) {
            field7548 = true;
        }
        super.field3066[super.field3109++] = (byte) (var3 >> 16);
        super.field3066[super.field3109++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
    public class548(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(FB)V")
    public final void method3157(float arg0, byte arg1) {
        ++field7546;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field3066[super.field3109++] = (byte) (var3 >> 24);
        super.field3066[super.field3109++] = (byte) (var3 >> 16);
        if (arg1 >= -76) {
            field7548 = true;
        }
        super.field3066[super.field3109++] = (byte) (var3 >> 8);
        super.field3066[super.field3109++] = (byte) var3;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIB)I")
    public static final int method3158(int arg0, int arg1, byte arg2) {
        ++field7547;
        if (arg2 <= 10) {
            return -118;
        } else if (arg0 == -1) {
            return 12345678;
        } else {
            int var3 = (arg0 & 127) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (arg0 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "(B)V")
    public static final void method3159(byte arg0) {
        if (~class158.field2530.toLowerCase().indexOf("microsoft") != 0) {
            class492.field6818[222] = 59;
            class492.field6818[187] = 27;
            class492.field6818[186] = 57;
            class492.field6818[221] = 43;
            class492.field6818[219] = 42;
            class492.field6818[191] = 73;
            class492.field6818[190] = 72;
            class492.field6818[220] = 74;
            class492.field6818[188] = 71;
            class492.field6818[189] = 26;
            class492.field6818[192] = 58;
            class492.field6818[223] = 28;
        } else {
            class492.field6818[46] = 72;
            class492.field6818[92] = 74;
            class492.field6818[44] = 71;
            class492.field6818[61] = 27;
            class492.field6818[91] = 42;
            if (class158.field2531 == null) {
                class492.field6818[192] = 58;
                class492.field6818[222] = 59;
            } else {
                class492.field6818[520] = 59;
                class492.field6818[192] = 28;
                class492.field6818[222] = 58;
            }
            class492.field6818[45] = 26;
            class492.field6818[47] = 73;
            class492.field6818[59] = 57;
            class492.field6818[93] = 43;
        }
        ++field7544;
        if (arg0 > -20) {
            field7548 = false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "(I)V")
    public static void method3160(int arg0) {
        if (arg0 >= 58) {
            field7550 = null;
            field7551 = null;
            field7545 = null;
        }
    }
}
