import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class128 {

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field2233 = 0;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field2232 = 0;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lp;")
    public static class280 field2229 = class18.method140((byte) -119, "::pcachesize");

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[BII[Lpk;IIZIII)V")
    public static final void method881(int arg0, byte[] arg1, int arg2, int arg3, class99[] arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field2228++;
        if (!arg7) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg9 + var11 > 0 && (arg9 + var11) < 103 && arg6 + var12 > 0 && arg6 + var12 < 103) {
                        arg4[arg10].field1604[arg9 + var11][arg6 + var12] = class214.method1432(arg4[arg10].field1604[arg9 + var11][arg6 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg7) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class25 var14 = new class25(arg1);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg8 == var15 && arg0 <= var35 && var35 < arg0 + 8 && arg3 <= var36 && (arg3 + 8) > var36) {
                        class283.method1919(class267.method1791((byte) 4, var35 & 0x7, var36 & 0x7, arg2) + arg6, arg7, 0, var14, arg2, 0, arg10, class66.method454(var35 & 0x7, var36 & 0x7, arg2, (byte) -127) + arg9, 0);
                    } else {
                        class283.method1919(-1, arg7, 0, var14, 0, 0, 0, -1, 0);
                    }
                }
            }
        }
        if (arg5 >= -31) {
            field2232 = -126;
        }
        while (var14.field475.length > var14.field481) {
            int var16 = var14.method189((byte) -103);
            if (var16 != 129) {
                var14.field481--;
                break;
            }
            for (int var22 = 0; var22 < 4; var22++) {
                byte var23 = var14.method200(32768);
                if (var23 == 0) {
                    if (var22 <= arg8) {
                        int var31 = arg9;
                        if (arg9 < 0) {
                            var31 = 0;
                        } else if (arg9 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg9 + 7;
                        int var33 = arg6;
                        if (arg6 < 0) {
                            var33 = 0;
                        } else if (arg6 >= 104) {
                            var33 = 104;
                        }
                        int var34 = arg6 + 7;
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        if (var34 < 0) {
                            var34 = 0;
                        } else if (var34 >= 104) {
                            var34 = 104;
                        }
                        while (var32 > var31) {
                            while (var33 < var34) {
                                class249.field4353[arg10][var31][var33] = 0;
                                var33++;
                            }
                            var31++;
                        }
                    }
                } else if (var23 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var14.method200(32768);
                            if (arg8 >= var22) {
                                int var27 = var24;
                                while ((var24 + 4) > var27) {
                                    int var28 = var25;
                                    while (var28 < var25 + 4) {
                                        if (var27 >= arg0 && arg0 + 8 > var27 && arg3 <= var28 && (arg3 + 8) > arg3) {
                                            int var29 = arg9 + class66.method454(var27 & 0x7, var28 & 0x7, arg2, (byte) -118);
                                            int var30 = arg6 + class267.method1791((byte) 4, var27 & 0x7, var28 & 0x7, arg2);
                                            if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                                class249.field4353[arg10][var29][var30] = var26;
                                            }
                                        }
                                        var25++;
                                    }
                                    var24++;
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var17 = false;
        if (var17) {
            return;
        }
        int var18 = arg9 + 7;
        int var19 = arg6 + 7;
        for (int var20 = arg9; var20 < var18; var20++) {
            for (int var21 = arg6; var21 < var19; var21++) {
                class249.field4353[arg10][var20][var21] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method882(int arg0) {
        class8.field167.method1485((byte) -112);
        if (arg0 == 4) {
            class120.field2137.method1485((byte) -76);
            field2231++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method883(boolean arg0) {
        field2229 = null;
        if (arg0) {
            method884(53);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method884(int arg0) {
        if (arg0 != -19552) {
            method882(-120);
        }
        if (class250.field4391 != null) {
            class250.field4391.method94((byte) -112);
        }
        field2235++;
        if (class4.field118 != null) {
            class4.field118.method94((byte) -112);
        }
    }
}
