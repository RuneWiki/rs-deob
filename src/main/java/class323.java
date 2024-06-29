import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class323 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
    public static int[] field4425 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field4428 = 0;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4429 = "Please remove ";

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method2039(int arg0) {
        field4425 = null;
        field4429 = null;
        if (arg0 != -30175) {
            method2041(-8, (class383[]) null, 12, 84, true, 113);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Laa;ZI[BZI[Lie;III)[I")
    public static final int[] method2040(class281 arg0, boolean arg1, int arg2, byte[] arg3, boolean arg4, int arg5, class4[] arg6, int arg7, int arg8, int arg9) {
        field4430++;
        if (!arg4) {
            for (int var10 = 0; var10 < 4; var10++) {
                class4 var11 = arg6[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg8 + var12;
                        int var15 = arg2 + var13;
                        if (var14 >= 0 && class432.field6220 > var14 && var15 >= 0 && class267.field3646 > var15) {
                            var11.method21(var15, var14, (byte) -118);
                        }
                    }
                }
            }
        }
        class371 var16 = new class371(arg3);
        int var17 = arg7 + arg8;
        int var18 = arg2 + arg9;
        for (int var19 = 0; var19 < arg5; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class359.method2319(arg4, arg8 + var55, 0, -1, false, 0, var16, var19, var18 + var56, arg2 + var56, var17 + var55, 0);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = arg1;
        while (var16.field5258.length > var16.field5273) {
            int var22 = var16.method2429(0);
            if (var22 == 128) {
                class289.field4000[0] = var16.method2403((byte) 54);
                class289.field4000[1] = var16.method2378(-1);
                class289.field4000[2] = var16.method2378(-1);
                class289.field4000[3] = var16.method2378(-1);
                class289.field4000[4] = var16.method2403((byte) 120);
                var20 = true;
            } else {
                if (var22 != 129) {
                    var16.field5273--;
                    break;
                }
                if (class446.field6435 == null) {
                    class446.field6435 = new byte[4][][];
                }
                for (int var23 = 0; var23 < 4; var23++) {
                    byte var24 = var16.method2418(-21337);
                    if (var24 == 0 && class446.field6435[var23] != null) {
                        int var25 = arg8;
                        int var26 = arg8 + 64;
                        int var27 = arg2;
                        if (arg2 < 0) {
                            var27 = 0;
                        } else if (arg2 >= class267.field3646) {
                            var27 = class267.field3646;
                        }
                        int var28 = arg2 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (class432.field6220 <= var26) {
                            var26 = class432.field6220;
                        }
                        if (arg8 < 0) {
                            var25 = 0;
                        } else if (arg8 >= class432.field6220) {
                            var25 = class432.field6220;
                        }
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= class267.field3646) {
                            var28 = class267.field3646;
                        }
                        while (var26 > var25) {
                            while (var27 < var28) {
                                class446.field6435[var23][var25][var27] = 0;
                                var27++;
                            }
                            var25++;
                        }
                    } else if (var24 == 1) {
                        if (class446.field6435[var23] == null) {
                            class446.field6435[var23] = new byte[class432.field6220 + 1][class267.field3646 + 1];
                        }
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                byte var31 = var16.method2418(-21337);
                                for (int var32 = var29 + arg8; var32 < (arg8 + var29 + 4); var32++) {
                                    for (int var33 = arg2 + var30; var33 < (var30 + arg2 + 4); var33++) {
                                        if (var32 >= 0 && class432.field6220 > var32 && var33 >= 0 && class267.field3646 > var33) {
                                            class446.field6435[var23][var32][var33] = var31;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var24 == 2) {
                        if (class446.field6435[var23] == null) {
                            class446.field6435[var23] = new byte[class432.field6220 + 1][class267.field3646 + 1];
                        }
                        if (var23 > 0) {
                            int var34 = arg8;
                            int var35 = arg8 + 64;
                            int var36 = arg2;
                            if (arg2 < 0) {
                                var36 = 0;
                            } else if (arg2 >= class267.field3646) {
                                var36 = class267.field3646;
                            }
                            int var37 = arg2 + 64;
                            if (var35 < 0) {
                                var35 = 0;
                            } else if (var35 >= class432.field6220) {
                                var35 = class432.field6220;
                            }
                            if (arg8 < 0) {
                                var34 = 0;
                            } else if (class432.field6220 <= arg8) {
                                var34 = class432.field6220;
                            }
                            if (var37 < 0) {
                                var37 = 0;
                            } else if (class267.field3646 <= var37) {
                                var37 = class267.field3646;
                            }
                            while (var35 > var34) {
                                while (var37 > var36) {
                                    class446.field6435[var23][var34][var36] = class446.field6435[var23 - 1][var34][var36];
                                    var36++;
                                }
                                var34++;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (!arg4) {
            class44 var38 = null;
            label284: while (true) {
                while (true) {
                    while (var16.field5258.length > var16.field5273) {
                        int var43 = var16.method2429(0);
                        if (var43 == 0) {
                            var38 = new class44(var16);
                        } else if (var43 == 1) {
                            int var44 = var16.method2429(0);
                            if (var44 > 0) {
                                for (int var45 = 0; var45 < var44; var45++) {
                                    class347 var46 = new class347(var16);
                                    if (var46.field4867 == 31) {
                                        class311 var47 = class22.method147(var16.method2403((byte) 80), 2);
                                        var46.method2226(var47.field4255, var47.field4257, (byte) 17, var47.field4253, var47.field4252);
                                    }
                                    var46.field1583 += arg8 << 7;
                                    var46.field1591 += arg2 << 7;
                                    int var48 = var46.field1583 >> 7;
                                    int var49 = var46.field1591 >> 7;
                                    if (var48 >= 0 && var49 >= 0 && class432.field6220 > var48 && var49 < class267.field3646) {
                                        var46.field1588 = class418.field6051[var46.field4857][var48][var49] - var46.field1588;
                                        if (arg0.method1797() > 0) {
                                            class24.method162(var46);
                                        }
                                    }
                                }
                            }
                        } else if (var43 == 2) {
                            if (var38 == null) {
                                var38 = new class44();
                            }
                            var38.method316(var16, 8);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var38 != null) {
                        for (int var39 = 0; var39 < 8; var39++) {
                            for (int var40 = 0; var40 < 8; var40++) {
                                int var41 = (arg8 >> 3) + var39;
                                int var42 = (arg2 >> 3) + var40;
                                if (var41 >= 0 && class432.field6220 >> 3 > var41 && var42 >= 0 && var42 < class267.field3646 >> 3) {
                                    class374.method2441(var42, var38, 32712, var41);
                                }
                            }
                        }
                    }
                    break label284;
                }
            }
        }
        if (!var21 && class446.field6435 != null) {
            for (int var50 = 0; var50 < 4; var50++) {
                if (class446.field6435[var50] != null) {
                    for (int var51 = 0; var51 < 16; var51++) {
                        for (int var52 = 0; var52 < 16; var52++) {
                            int var53 = (arg8 >> 2) + var51;
                            int var54 = (arg2 >> 2) + var52;
                            if (var53 >= 0 && var53 < 26 && var54 >= 0 && var54 < 26) {
                                class446.field6435[var50][var53][var54] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class289.field4000;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[Lrg;IIZI)V")
    public static final void method2041(int arg0, class383[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 != 20069) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class383 var7 = arg1[var6];
            if (var7 != null && var7.field5538 == arg2) {
                class254.method1567(arg3, arg0, var7, (byte) -128, arg4);
                class190.method1245(arg3, (byte) -126, var7, arg0);
                if (var7.field5511 > (var7.field5433 - var7.field5431)) {
                    var7.field5511 = var7.field5433 - var7.field5431;
                }
                if (var7.field5511 < 0) {
                    var7.field5511 = 0;
                }
                if (var7.field5590 - var7.field5491 < var7.field5434) {
                    var7.field5434 = var7.field5590 - var7.field5491;
                }
                if (var7.field5434 < 0) {
                    var7.field5434 = 0;
                }
                if (var7.field5488 == 0) {
                    class21.method140(-4492, arg4, var7);
                }
            }
        }
        field4426++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILql;)I")
    public static final int method2042(int arg0, class437 arg1) {
        field4424++;
        class221 var2 = arg1.field6290;
        if (var2.field2959 != null) {
            var2 = var2.method1407(-109);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2951;
        class312 var4 = arg1.method402(0);
        if (arg1.field861) {
            var3 = var2.field2912;
        } else if (arg1.field928 == var4.field4295 || arg1.field928 == var4.field4299 || arg1.field928 == var4.field4285 || arg1.field928 == var4.field4294) {
            var3 = var2.field2960;
        } else if (arg1.field928 == var4.field4309 || arg1.field928 == var4.field4280 || arg1.field928 == var4.field4305 || arg1.field928 == var4.field4286) {
            var3 = var2.field2902;
        }
        int var5 = -79 % ((27 - arg0) / 51);
        return var3;
    }
}
