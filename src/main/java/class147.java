import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class147 {

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "[I")
    public int[] field2133;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "[I")
    public int[] field2140;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "Z")
    public static volatile boolean field2136 = true;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "S")
    public static short field2138 = 1;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field2139 = -1;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Lka;")
    public static class408 field2135 = new class408(30);

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lrg;")
    public static class366 field2141 = new class366(new byte[5000]);

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field2143 = 0;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Llr;")
    public static class105 field2144;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "Lnd;")
    public static class415 field2142;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "[I")
    public static int[] field2129;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V")
    public static final void method1060(byte arg0, int arg1) {
        field2137++;
        if (arg0 != 1) {
            method1062(45, -36, 94, -67);
        }
        if (class10.field78 == 0) {
            class105.field1477.method2391(16, arg1);
        } else {
            class380.field5248 = arg1;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZII)V")
    public static final void method1061(boolean arg0, int arg1, int arg2) {
        field2130++;
        class57 var3 = (class57) class30.field419.method837((byte) -72, (long) arg1);
        if (var3 != null && arg2 == -1) {
            for (int var4 = 0; var4 < var3.field741.length; var4++) {
                var3.field741[var4] = -1;
                var3.field739[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1062(int arg0, int arg1, int arg2, int arg3) {
        if (!class117.method913(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class436.field6160[arg0].method329(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class136.field2023) {
                    if (!class120.method932(var4, var6, var5)) {
                        return false;
                    }
                    if (!class120.method932(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method932(var4, var7, var5)) {
                        return false;
                    }
                    if (!class120.method932(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method932(var4, var8, var5)) {
                    return false;
                }
                if (!class120.method932(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class373.field5175) {
                    if (!class120.method932(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class120.method932(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method932(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class120.method932(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method932(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class120.method932(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class136.field2023) {
                    if (!class120.method932(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class120.method932(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method932(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class120.method932(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method932(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class120.method932(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class373.field5175) {
                    if (!class120.method932(var4, var6, var5)) {
                        return false;
                    }
                    if (!class120.method932(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method932(var4, var7, var5)) {
                        return false;
                    }
                    if (!class120.method932(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class120.method932(var4, var8, var5)) {
                    return false;
                }
                if (!class120.method932(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class120.method932(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class120.method932(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class120.method932(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class120.method932(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class120.method932(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BZZLg;)V")
    public static final void method1063(byte arg0, boolean arg1, boolean arg2, class435 arg3) {
        field2131++;
        int var4 = arg3.field6146;
        int var5 = (int) arg3.field4226;
        arg3.method1884(false);
        if (arg1) {
            class91.method720(var4, (byte) 111);
        }
        class78.method637(-116, var4);
        class108 var6 = class157.method1139(var5, false);
        int var7 = 103 % ((-arg0 - 83) / 38);
        if (var6 != null) {
            class298.method1821((byte) -123, var6);
        }
        class149.method1109(0);
        if (!arg2 && class350.field4712 != -1) {
            class282.method1769(0, 1, class350.field4712);
        }
        class15 var8 = new class15(class171.field2415);
        for (class435 var9 = (class435) var8.method89((byte) 127); var9 != null; var9 = (class435) var8.method93(false)) {
            if (!var9.method1887(123)) {
                var9 = (class435) var8.method89((byte) 123);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field6140 == 3) {
                int var10 = (int) var9.field4226;
                if ((var10 >>> 16) == var4) {
                    method1063((byte) -127, true, arg2, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lti;Z)Z")
    public static final boolean method1064(class5 arg0, boolean arg1) {
        boolean var2 = class436.field6160 == class125.field1879;
        int var3 = 0;
        arg0.method26((byte) 119);
        if (arg0.field52 < 0 || arg0.field55 < 0 || arg0.field47 >= class284.field3862 || arg0.field41 >= class354.field4768) {
            return false;
        }
        for (int var4 = arg0.field52; var4 <= arg0.field47; var4++) {
            for (int var7 = arg0.field55; var7 <= arg0.field41; var7++) {
                int var8 = 0;
                if (var4 > arg0.field52) {
                    var8++;
                }
                if (var4 < arg0.field47) {
                    var8 += 4;
                }
                if (var7 > arg0.field55) {
                    var8 += 8;
                }
                if (var7 < arg0.field41) {
                    var8 += 2;
                }
                class72.method567(arg0.field42, var4, var7);
                class63 var9 = class341.field4617[arg0.field42][var4][var7];
                class48 var10 = class22.method133(arg0, (byte) -115, var8);
                class48 var11 = var9.field853;
                if (var11 == null) {
                    var9.field853 = var10;
                } else {
                    while (var11.field608 != null) {
                        var11 = var11.field608;
                    }
                    var11.field608 = var10;
                }
                var9.field860 = (byte) (var9.field860 | var8);
                if (var2 && class124.field1876[var4][var7] != 0) {
                    var3 = class124.field1876[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field52; var5 <= arg0.field47; var5++) {
                for (int var6 = arg0.field55; var6 <= arg0.field41; var6++) {
                    if (class124.field1876[var5][var6] == 0) {
                        class124.field1876[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class419.field5818[class340.field4602++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    public static void method1065(byte arg0) {
        if (arg0 != -74) {
            method1060((byte) 6, 109);
        }
        field2135 = null;
        field2141 = null;
        field2129 = null;
        field2144 = null;
        field2142 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BIB)Z")
    public static final boolean method1066(int arg0, byte[] arg1, int arg2, byte arg3) {
        field2134++;
        boolean var4 = true;
        class366 var5 = new class366(arg1);
        if (arg3 > -20) {
            method1066(74, (byte[]) null, -10, (byte) 125);
        }
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method2293(-2);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class447 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method2251(-121);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method2306((byte) 69);
                                    }
                                    int var10 = var5.method2251(-97);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method2306((byte) 115) >> 2;
                                    var14 = arg0 + var12;
                                    var15 = arg2 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while ((class11.field107 - 1) <= var14);
                    } while (var15 >= (class264.field3620 - 1));
                    var16 = class133.method996((byte) -19, var6);
                } while (var13 == 22 && !class441.field6201 && var16.field6297 == 0 && var16.field6337 != 1 && !var16.field6310);
                if (!var16.method2775(82)) {
                    var4 = false;
                    class143.field2087++;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(I)V")
    public class147(int arg0) {
        this.field2132 = arg0;
        this.field2133 = new int[this.field2132];
        this.field2140 = new int[this.field2132];
    }
}
