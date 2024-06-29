import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class154 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
    public static boolean field2109 = false;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field2113 = 0;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "B")
    public byte field2108;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "B")
    public byte field2110;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "B")
    public byte field2123;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "B")
    public byte field2125;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "B")
    public byte field2127;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "B")
    public byte field2128;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "B")
    public byte field2131;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "S")
    public short field2134;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Z")
    public boolean field2107;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Z")
    public boolean field2111;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Z")
    public boolean field2114;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Z")
    public boolean field2116;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Z")
    public boolean field2120;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Z")
    public boolean field2126;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Z")
    public boolean field2129;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Z")
    public boolean field2132;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Z")
    public boolean field2133;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[Ls;")
    public static class143[] field2118;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[Z")
    public static boolean[] field2117;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[[B")
    public static byte[][] field2122;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    public static final void method949(int arg0, int arg1) {
        field2112++;
        if (arg0 != 65535) {
            method953(true);
        }
        for (class97 var2 = class80.field1050.method2296(5773); var2 != null; var2 = class80.field1050.method2304(100)) {
            if ((var2.field1339 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method625((byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLei;)V")
    public static final void method950(boolean arg0, class236 arg1) {
        field2124++;
        if (arg0) {
            method954(34, -103, 55);
        }
        arg1.field3538 = null;
        if (class363.field5340 < 20) {
            class71.field928.method2125(arg1, -29983);
            class363.field5340++;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIB)V")
    public static final void method951(int arg0, int arg1, int arg2, byte arg3) {
        if (arg0 == 0) {
            class177.method1082(class247.field3701, 0);
            class331.field4955++;
        }
        field2119++;
        if (arg0 == 1) {
            class177.method1082(class13.field153, 0);
            class413.field6137++;
        }
        class189.field2840.method2377(class17.field250 + arg1, -122);
        class189.field2840.method2352(class185.field2786.method578(false, 82) ? 1 : 0, -128);
        class189.field2840.method2340((byte) -117, class112.field1487 + arg2);
        class8.field80 = arg1;
        class452.field6685 = arg2;
        class381.field5557 = false;
        if (arg3 <= 89) {
            method950(true, (class236) null);
        }
        class351.method2111(-90);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZ[Lek;IIIIILdr;[BII)[I")
    public static final int[] method952(boolean arg0, boolean arg1, class375[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class261 arg8, byte[] arg9, int arg10, int arg11) {
        field2121++;
        int var12 = (arg11 & 0x7) * 8;
        int var13 = (arg3 & 0x7) * 8;
        byte var14;
        if (arg0) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (!arg0) {
            class375 var15 = arg2[arg6];
            for (int var16 = 0; var16 < 8; var16++) {
                for (int var17 = 0; var17 < 8; var17++) {
                    int var18 = class99.method634(var16 & 0x7, 25, arg4, var17 & 0x7) + arg5;
                    int var19 = class429.method2639(var16 & 0x7, false, arg4, var17 & 0x7) + arg7;
                    if (var18 > 0 && (class115.field1522 - 1) > var18 && var19 > 0 && class198.field3004 - 1 > var19) {
                        var15.method2247(var18, -1, var19);
                    }
                }
            }
        }
        class385 var20 = new class385(arg9);
        int var21 = arg11 & 0x1FFFFFF8 << 3;
        int var22 = arg3 & 0x1FFFFFF8 << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg4 == 1) {
            var24 = 1;
        } else if (arg4 == 2) {
            var24 = 1;
            var23 = 1;
        } else if (arg4 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var14; var25++) {
            for (int var58 = 0; var58 < 64; var58++) {
                for (int var59 = 0; var59 < 64; var59++) {
                    if (arg10 != var25 || var58 < var12 || var58 > (var12 + 8) || var13 > var59 || var13 + 8 < var59) {
                        class28.method163(arg0, 0, -1, 0, -1, -50, var20, false, 0, 0, 0, 0);
                    } else if ((var12 + 8) == var58 || var13 + 8 == var59) {
                        int var66;
                        int var67;
                        if (arg4 == 0) {
                            var66 = -var13 - (-var59 - arg7);
                            var67 = arg5 + var58 - var12;
                        } else if (arg4 == 1) {
                            var67 = var59 + arg5 - var13;
                            var66 = var12 + arg7 + 8 - var58;
                        } else if (arg4 == 2) {
                            var66 = var13 + arg7 + 8 - var59;
                            var67 = arg5 + var12 + 8 - var58;
                        } else {
                            var66 = arg7 + var58 - var12;
                            var67 = var13 - (var59 - arg5 - 8);
                        }
                        class28.method163(arg0, arg6, var67, var21 + var58, var66, -50, var20, true, 0, 0, 0, var22 + var59);
                    } else {
                        int var60 = class99.method634(var58 & 0x7, -127, arg4, var59 & 0x7) + arg5;
                        int var61 = arg7 + class429.method2639(var58 & 0x7, false, arg4, var59 & 0x7);
                        class28.method163(arg0, arg6, var60, var21 + var58, var61, -50, var20, false, var24, arg4, var23, var22 + var59);
                        if (var58 == 63 || var59 == 63) {
                            int var62 = var58 == 63 ? 64 : var58;
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64;
                            int var65;
                            if (arg4 == 0) {
                                var65 = arg7 + var63 - var13;
                                var64 = var62 - (var12 - arg5);
                            } else if (arg4 == 1) {
                                var64 = arg5 + var63 - var13;
                                var65 = arg7 + var12 + 8 - var62;
                            } else if (arg4 == 2) {
                                var64 = var12 + arg5 + 8 - var62;
                                var65 = -var63 - (-var13 - arg7 - 8);
                            } else {
                                var65 = var62 + arg7 - var12;
                                var64 = arg5 + var13 + 8 - var63;
                            }
                            if (var64 >= 0 && var64 < class115.field1522 && var65 >= 0 && var65 < class198.field3004) {
                                class355.field5243[arg6][var64][var65] = class355.field5243[arg6][var60 + var23][var24 + var61];
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        boolean var27 = false;
        while (var20.field5685.length > var20.field5666) {
            int var28 = var20.method2343(255);
            if (var28 == 128) {
                class212.field3196[0] = var20.method2323(-56);
                class212.field3196[1] = var20.method2327((byte) -116);
                class212.field3196[2] = var20.method2327((byte) -116);
                class212.field3196[3] = var20.method2327((byte) -116);
                class212.field3196[4] = var20.method2323(-41);
                var26 = true;
            } else {
                if (var28 != 129) {
                    var20.field5666--;
                    break;
                }
                if (class210.field3161 == null) {
                    class210.field3161 = new byte[4][][];
                }
                for (int var45 = 0; var45 < 4; var45++) {
                    byte var46 = var20.method2341((byte) 54);
                    if (var46 == 0 && class210.field3161[arg6] != null) {
                        if (var45 <= arg10) {
                            int var47 = arg5;
                            int var48 = arg5 + 7;
                            int var49 = arg7;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (class115.field1522 <= var48) {
                                var48 = class115.field1522;
                            }
                            if (arg5 < 0) {
                                var47 = 0;
                            } else if (arg5 >= class115.field1522) {
                                var47 = class115.field1522;
                            }
                            int var50 = arg7 + 7;
                            if (arg7 < 0) {
                                var49 = 0;
                            } else if (arg7 >= class198.field3004) {
                                var49 = class198.field3004;
                            }
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (class198.field3004 <= var50) {
                                var50 = class198.field3004;
                            }
                            while (var47 < var48) {
                                while (var50 > var49) {
                                    class210.field3161[arg6][var47][var49] = 0;
                                    var49++;
                                }
                                var47++;
                            }
                        }
                    } else if (var46 == 1) {
                        if (class210.field3161[arg6] == null) {
                            class210.field3161[arg6] = new byte[class115.field1522 + 1][class198.field3004 + 1];
                        }
                        for (int var51 = 0; var51 < 64; var51 += 4) {
                            for (int var52 = 0; var52 < 64; var52 += 4) {
                                byte var53 = var20.method2341((byte) 54);
                                if (arg10 >= var45) {
                                    for (int var54 = var51; var54 < (var51 + 4); var54++) {
                                        for (int var55 = var52; var55 < var52 + 4; var55++) {
                                            if (var12 <= var54 && var12 + 8 > var54 && var55 >= var13 && (var13 + 8) > var13) {
                                                int var56 = class99.method634(var54 & 0x7, -127, arg4, var55 & 0x7) + arg5;
                                                int var57 = arg7 + class429.method2639(var54 & 0x7, false, arg4, var55 & 0x7);
                                                if (var56 >= 0 && var56 < class115.field1522 && var57 >= 0 && class198.field3004 > var57) {
                                                    class210.field3161[arg6][var56][var57] = var53;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            class451 var29 = null;
            while (true) {
                while (var20.field5685.length > var20.field5666) {
                    int var30 = var20.method2343(255);
                    if (var30 == 0) {
                        var29 = new class451(var20);
                    } else if (var30 == 1) {
                        int var31 = var20.method2343(255);
                        if (var31 > 0) {
                            for (int var32 = 0; var32 < var31; var32++) {
                                class21 var33 = new class21(var20);
                                if (var33.field294 == 31) {
                                    class287 var34 = class367.method2207(var20.method2323(-48), (byte) 108);
                                    var33.method133(var34.field4366, var34.field4367, var34.field4368, var34.field4372, -69);
                                }
                                int var35 = var33.field2033 >> 7;
                                int var36 = var33.field2038 >> 7;
                                if (var33.field284 == arg10 && var35 >= var12 && (var12 + 8) > var35 && var13 <= var36 && var36 < var13 + 8) {
                                    int var37 = (arg5 << 7) + class406.method2548(var33.field2033 & 0x3FF, 70, arg4, var33.field2038 & 0x3FF);
                                    int var38 = class415.method2590(-116, arg4, var33.field2038 & 0x3FF, var33.field2033 & 0x3FF) + (arg7 << 7);
                                    var33.field2038 = var38;
                                    var33.field2033 = var37;
                                    int var39 = var33.field2033 >> 7;
                                    int var40 = var33.field2038 >> 7;
                                    if (var39 >= 0 && var40 >= 0 && class115.field1522 > var39 && class198.field3004 > var40) {
                                        var33.field2040 = class355.field5243[arg10][var39][var40] - var33.field2040;
                                        if (arg8.method342() > 0) {
                                            class303.method1864(var33);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var30 == 2) {
                        if (var29 == null) {
                            var29 = new class451();
                        }
                        var29.method2776((byte) 33, var20);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var29 != null) {
                    class326.method2015(var29, 115, arg5 >> 3, arg7 >> 3);
                }
                break;
            }
        }
        if (!var27 && class210.field3161 != null && class210.field3161[arg6] != null) {
            int var41 = arg5 + 7;
            int var42 = arg7 + 7;
            for (int var43 = arg5; var43 < var41; var43++) {
                for (int var44 = arg7; var44 < var42; var44++) {
                    class210.field3161[arg6][var43][var44] = 0;
                }
            }
        }
        if (!arg1) {
            method949(-42, 99);
        }
        if (var26) {
            return class212.field3196;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static void method953(boolean arg0) {
        field2122 = null;
        if (arg0) {
            method952(true, true, (class375[]) null, -82, 112, -8, 119, 0, (class261) null, (byte[]) null, -79, -34);
        }
        field2117 = null;
        field2118 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
    public static final int method954(int arg0, int arg1, int arg2) {
        field2130++;
        int var3 = -53 % ((77 - arg0) / 32);
        int var4 = arg1 >>> 31;
        return (arg1 + var4) / arg2 - var4;
    }
}
