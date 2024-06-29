import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class186 {

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lmh;")
    public static class62 field2974 = class201.method1405(true, "weiss:");

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lmh;")
    public static class62 field2975 = class201.method1405(true, ")1");

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lmh;")
    public static class62 field2972 = class201.method1405(true, "T");

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
    public static int[] field2979 = new int[5];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lhi;")
    public static class26 field2966;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBIIII)I", line = 4)
    public static final int method1300(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2971++;
        if ((arg5 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg1;
        }
        if (arg2 != -29) {
            field2972 = (class62) null;
        }
        if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return (1 - arg6) + 7 - arg1;
        } else {
            return 1 + 7 - arg0 - arg4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1301(int arg0) {
        class252.field4282 = null;
        class98.field1621 = null;
        class206.field3494 = null;
        class143.field2283 = (int[][][]) null;
        class129.field2120 = (byte[][][]) null;
        class274.field4639 = null;
        class121.field2020 = (byte[][][]) null;
        class35.field473 = (byte[][][]) null;
        if (arg0 != -6316) {
            field2966 = (class26) null;
        }
        class78.field1312 = null;
        class206.field3502 = (byte[][][]) null;
        class72.field1110 = (byte[][][]) null;
        field2973++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIZ)I", line = 65)
    public static final int method1302(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field2966 = (class26) null;
        }
        field2977++;
        if (arg1 == arg2) {
            return arg1;
        } else {
            int var4 = 128 - arg0;
            int var5 = (arg1 >>> 7 & 0x1FE01FE) * var4 + (arg2 >>> 7 & 0x1FE01FE) * arg0 & 0xFF00FF00;
            int var6 = (arg1 & 0xFF00FF) * var4 + ((arg2 & 0xFF00FF) * arg0) & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILna;BI)V", line = 87)
    public static final void method1303(int arg0, class153 arg1, byte arg2, int arg3) {
        if ((arg3 & 0x80) != 0) {
            arg1.field3861 = class75.field1223.method748(-3);
            arg1.field3835 = class75.field1223.method734(false);
        }
        field2970++;
        if ((arg3 & 0x10) != 0) {
            int var4 = class75.field1223.method748(-3);
            boolean var5 = (var4 & 0x8000) != 0;
            int var6 = class75.field1223.method720(true);
            int var7 = class75.field1223.method702(arg2 + 42);
            int var8 = class75.field1223.field1476;
            if (arg1.field2430 != null && arg1.field2448 != null) {
                boolean var9 = false;
                long var10 = arg1.field2430.method451(31);
                if (var6 <= 1) {
                    if (!var5 && (class304.field5236 == 1 || class14.field111 == 1)) {
                        var9 = true;
                    } else {
                        for (int var12 = 0; var12 < class141.field2269; var12++) {
                            if (class55.field808[var12] == var10) {
                                var9 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var9 && class73.field1111 == 0) {
                    class137.field2222.field1476 = 0;
                    class75.field1223.method718(class137.field2222.field1495, 16, 0, var7);
                    int var13 = -1;
                    class137.field2222.field1476 = 0;
                    class62 var14;
                    if (var5) {
                        var4 &= 0x7FFF;
                        class214 var15 = class284.method1932(class137.field2222, arg2 + 298);
                        var13 = var15.field3635;
                        var14 = var15.field3640.method1794((byte) -34, class137.field2222);
                    } else {
                        var14 = class299.method2022(class36.method233(class137.field2222, (byte) -78).method427(22874));
                    }
                    arg1.field3869 = var14.method440((byte) 54);
                    arg1.field3825 = var4 & 0xFF;
                    arg1.field3844 = 150;
                    arg1.field3850 = var4 >> 8;
                    if (var6 == 2) {
                        class38.method260(var5 ? 17 : 1, var14, class254.method1772(new class62[] { class104.field1708, arg1.method1105((byte) 105) }, 0), var13, -1, (class62) null);
                    } else if (var6 == 1) {
                        class38.method260(var5 ? 17 : 1, var14, class254.method1772(new class62[] { class207.field3511, arg1.method1105((byte) 105) }, 0), var13, -1, (class62) null);
                    } else {
                        class38.method260(var5 ? 17 : 2, var14, arg1.method1105((byte) 105), var13, arg2 + 42, (class62) null);
                    }
                }
            }
            class75.field1223.field1476 = var7 + var8;
        }
        if ((arg3 & 0x400) != 0) {
            int var16 = class75.field1223.method739(true);
            int var17 = class75.field1223.method744(arg2 + 129);
            arg1.method1576(var16, class199.field3367, -126, var17);
        }
        if ((arg3 & 0x40) != 0) {
            arg1.field3869 = class75.field1223.method696((byte) -92);
            if (arg1.field3869.method456(0, arg2 ^ 0xFFFF83B3) == 126) {
                arg1.field3869 = arg1.field3869.method407(1, 15552);
                class116.method901(2, arg1.method1105((byte) 105), arg1.field3869, (byte) 126);
            } else if (class268.field4551 == arg1) {
                class116.method901(2, arg1.method1105((byte) 105), arg1.field3869, (byte) 113);
            }
            arg1.field3844 = 150;
            arg1.field3825 = 0;
            arg1.field3850 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            arg1.field3842 = class75.field1223.method739(true);
            arg1.field3865 = class75.field1223.method739(true);
            arg1.field3878 = class75.field1223.method739(true);
            arg1.field3866 = class75.field1223.method739(true);
            arg1.field3852 = class75.field1223.method691(128) + class199.field3367;
            arg1.field3837 = class75.field1223.method691(128) + class199.field3367;
            arg1.field3809 = class75.field1223.method739(true);
            arg1.field3824 = 0;
            arg1.field3808 = 1;
        }
        if ((arg3 & 0x4) != 0) {
            int var18 = class75.field1223.method734(false);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class75.field1223.method739(true);
            class124.method942(117, var19, arg1, var18);
        }
        if ((arg3 & 0x2) != 0) {
            int var20 = class75.field1223.method702(arg2 + 42);
            byte[] var21 = new byte[var20];
            class92 var22 = new class92(var21);
            class75.field1223.method698(0, var20, 3, var21);
            class181.field2868[arg0] = var22;
            arg1.method1104(var22, 65535);
        }
        if ((arg3 & 0x8) != 0) {
            arg1.field3848 = class75.field1223.method721(81);
            if (arg1.field3848 == 65535) {
                arg1.field3848 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field3847 = class75.field1223.method748(-3);
            int var23 = class75.field1223.method704(1509947792);
            arg1.field3813 = 0;
            arg1.field3855 = var23 >> 16;
            arg1.field3871 = (var23 & 0xFFFF) + class199.field3367;
            arg1.field3851 = 0;
            if (arg1.field3847 == 65535) {
                arg1.field3847 = -1;
            }
            if (class199.field3367 < arg1.field3871) {
                arg1.field3813 = -1;
            }
            if (arg1.field3847 != -1 && class199.field3367 == arg1.field3871) {
                int var24 = class115.method895(arg2 ^ 0x64, arg1.field3847).field4611;
                if (var24 != -1) {
                    class96 var25 = class151.method1085(var24, (byte) 111);
                    if (var25 != null && var25.field1586 != null) {
                        class113.method881(var25, arg1.field3821, arg1.field3814, class268.field4551 == arg1, (byte) -76, 0);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var26 = class75.field1223.method739(true);
            int var27 = class75.field1223.method739(true);
            arg1.method1576(var26, class199.field3367, -128, var27);
            arg1.field3863 = class199.field3367 + 300;
            arg1.field3867 = class75.field1223.method720(true);
        }
        if (arg2 != -43) {
            field2974 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z", line = 326)
    public static final boolean method1304(int arg0, int arg1, int arg2) {
        if (arg1 > -102) {
            field2979 = (int[]) null;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class216 var3 = class252.method1755(arg2, (byte) -97);
        field2965++;
        return var3.method1532(128, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 345)
    public static void method1305(byte arg0) {
        field2966 = null;
        field2974 = null;
        field2975 = null;
        if (arg0 < 20) {
            method1303(-118, (class153) null, (byte) 100, -2);
        }
        field2979 = null;
        field2972 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z", line = 359)
    public static final boolean method1306(int arg0, int arg1) {
        if (arg1 != -1) {
            method1300(-16, 118, (byte) -59, -11, -49, -13, 60);
        }
        field2980++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V", line = 379)
    public static final void method1307(int arg0, int arg1, int arg2) {
        field2968++;
        class151 var3 = class165.method1194((byte) 1, arg1, arg0);
        var3.method1088(124);
        var3.field2395 = arg2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILmh;)V", line = 394)
    public static final void method1308(int arg0, class62 arg1) {
        field2969++;
        class274 var2 = (class274) class204.field3440.method334(-18673);
        if (arg0 != -1) {
            return;
        }
        while (var2 != null) {
            if (var2.field4650.method446((byte) 113, arg1)) {
                class304.field5235 = var2;
                return;
            }
            var2 = (class274) class204.field3440.method335((byte) 126);
        }
    }
}
