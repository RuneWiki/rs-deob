import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class113 {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field1546 = 0;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Lvq;")
    public static class24 field1549 = new class24(73, 6);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILct;Lct;)I", line = 10)
    public static final int method796(int arg0, class104 arg1, class104 arg2) {
        if (arg0 != 1) {
            return -45;
        }
        field1544++;
        int var3 = 0;
        if (arg2.method708(class93.field1157, (byte) -89)) {
            var3++;
        }
        if (arg2.method708(class359.field5224, (byte) -126)) {
            var3++;
        }
        if (arg2.method708(class152.field2060, (byte) -113)) {
            var3++;
        }
        if (arg1.method708(class93.field1157, (byte) -119)) {
            var3++;
        }
        if (arg1.method708(class359.field5224, (byte) -118)) {
            var3++;
        }
        if (arg1.method708(class152.field2060, (byte) -95)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIZI)V", line = 46)
    public static final void method797(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1548++;
        long var6 = (long) (arg0 | (arg4 ? Integer.MIN_VALUE : 0));
        class243 var8 = (class243) class278.field4104.method609(var6, 108);
        if (var8 == null) {
            var8 = new class243();
            class278.field4104.method606(1, var8, var6);
        }
        if (var8.field3599.length <= arg3) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field3599.length; var11++) {
                var9[var11] = var8.field3599[var11];
                var10[var11] = var8.field3607[var11];
            }
            for (int var12 = var8.field3599.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field3607 = var10;
            var8.field3599 = var9;
        }
        if (arg2 == -1) {
            var8.field3599[arg3] = arg5;
            var8.field3607[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[Lth;Lfp;IZII[BIII)[I", line = 100)
    public static final int[] method798(int arg0, int arg1, class175[] arg2, class9 arg3, int arg4, boolean arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10, int arg11) {
        field1547++;
        int var12 = (arg11 & 0x7) * 8;
        int var13 = (arg9 & 0x7) * 8;
        if (!arg5) {
            class175 var14 = arg2[arg4];
            for (int var15 = 0; var15 < 8; var15++) {
                for (int var16 = 0; var16 < 8; var16++) {
                    int var17 = class92.method626(var16 & 0x7, -5268, arg7, var15 & 0x7) + arg10;
                    int var18 = class136.method906(var16 & 0x7, var15 & 0x7, arg6, arg7) + arg0;
                    if (var17 > 0 && var17 < class195.field2745 - 1 && var18 > 0 && var18 < class78.field984 - 1) {
                        var14.method1216(var17, var18, 0);
                    }
                }
            }
        }
        byte var19;
        if (arg5) {
            var19 = 1;
        } else {
            var19 = 4;
        }
        class256 var20 = new class256(arg8);
        int var21 = (arg11 & 0xFFFFFFF8) << 3;
        int var22 = arg9 & 0x1FFFFFF8 << 3;
        int var23 = arg6;
        byte var24 = 0;
        if (arg7 == 1) {
            var24 = 1;
        } else if (arg7 == 2) {
            var24 = 1;
            var23 = 1;
        } else if (arg7 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var19; var25++) {
            for (int var58 = 0; var58 < 64; var58++) {
                for (int var59 = 0; var59 < 64; var59++) {
                    if (arg1 != var25 || var58 < var12 || (var12 + 8) < var58 || var59 < var13 || var13 + 8 < var59) {
                        class376.method2382(-1, 0, false, 0, arg5, 0, (byte) -128, var20, 0, -1, 0, 0);
                    } else if (var12 + 8 == var58 || var13 + 8 == var59) {
                        int var66;
                        int var67;
                        if (arg7 == 0) {
                            var66 = var58 + arg10 - var12;
                            var67 = var59 + arg0 - var13;
                        } else if (arg7 == 1) {
                            var67 = var12 + arg0 + 8 - var58;
                            var66 = var59 + arg10 - var13;
                        } else if (arg7 == 2) {
                            var67 = -var59 - (-var13 - (arg0 + 8));
                            var66 = arg10 + (var12 - var58) + 8;
                        } else {
                            var67 = arg0 + var58 - var12;
                            var66 = var13 + (arg10 - -8) - var59;
                        }
                        class376.method2382(var67, 0, true, var22 + var59, arg5, 0, (byte) -124, var20, var21 + var58, var66, 0, arg4);
                    } else {
                        int var60 = arg10 + class92.method626(var59 & 0x7, arg6 - 5268, arg7, var58 & 0x7);
                        int var61 = class136.method906(var59 & 0x7, var58 & 0x7, 0, arg7) + arg0;
                        class376.method2382(var61, var23, false, var22 + var59, arg5, arg7, (byte) -122, var20, var21 + var58, var60, var24, arg4);
                        if (var58 == 63 || var59 == 63) {
                            int var62 = var58 == 63 ? 64 : var58;
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64;
                            int var65;
                            if (arg7 == 0) {
                                var64 = arg10 + var62 - var12;
                                var65 = var63 + arg0 - var13;
                            } else if (arg7 == 1) {
                                var65 = var12 + arg0 + 8 - var62;
                                var64 = arg10 + var63 - var13;
                            } else if (arg7 == 2) {
                                var64 = var12 + arg10 + 8 - var62;
                                var65 = arg0 - var63 - (-var13 - 8);
                            } else {
                                var65 = var62 + arg0 - var12;
                                var64 = arg10 + var13 + 8 - var63;
                            }
                            if (var64 >= 0 && var64 < class195.field2745 && var65 >= 0 && class78.field984 > var65) {
                                class264.field3910[arg4][var64][var65] = class264.field3910[arg4][var23 + var60][var24 + var61];
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        while (var20.field3762 < var20.field3764.length) {
            int var27 = var20.method1738((byte) -81);
            if (var27 == 128) {
                class307.field4536[0] = var20.method1767(arg6 + 1930493576);
                class307.field4536[1] = var20.method1747((byte) 12);
                class307.field4536[2] = var20.method1747((byte) 12);
                class307.field4536[3] = var20.method1747((byte) 12);
                var26 = true;
                class307.field4536[4] = var20.method1767(1930493576);
            } else {
                if (var27 != 129) {
                    var20.field3762--;
                    break;
                }
                if (class157.field2114 == null) {
                    class157.field2114 = new byte[4][][];
                }
                for (int var45 = 0; var45 < 4; var45++) {
                    byte var46 = var20.method1728((byte) 115);
                    if (var46 == 0 && class157.field2114[arg4] != null) {
                        if (var45 <= arg1) {
                            int var47 = arg10;
                            int var48 = arg10 + 7;
                            int var49 = arg0;
                            int var50 = arg0 + 7;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= class195.field2745) {
                                var48 = class195.field2745;
                            }
                            if (arg0 < 0) {
                                var49 = 0;
                            } else if (class78.field984 <= arg0) {
                                var49 = class78.field984;
                            }
                            if (arg10 < 0) {
                                var47 = 0;
                            } else if (arg10 >= class195.field2745) {
                                var47 = class195.field2745;
                            }
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 >= class78.field984) {
                                var50 = class78.field984;
                            }
                            while (var48 > var47) {
                                while (var50 > var49) {
                                    class157.field2114[arg4][var47][var49] = 0;
                                    var49++;
                                }
                                var47++;
                            }
                        }
                    } else if (var46 == 1) {
                        if (class157.field2114[arg4] == null) {
                            class157.field2114[arg4] = new byte[class195.field2745 + 1][class78.field984 + 1];
                        }
                        for (int var51 = 0; var51 < 64; var51 += 4) {
                            for (int var52 = 0; var52 < 64; var52 += 4) {
                                byte var53 = var20.method1728((byte) 114);
                                if (var45 <= arg1) {
                                    for (int var54 = var51; var54 < (var51 + 4); var54++) {
                                        for (int var55 = var52; var55 < (var52 + 4); var55++) {
                                            if (var12 <= var54 && var12 + 8 > var54 && var55 >= var13 && (var13 + 8) > var13) {
                                                int var56 = class92.method626(var55 & 0x7, -5268, arg7, var54 & 0x7) + arg10;
                                                int var57 = class136.method906(var55 & 0x7, var54 & 0x7, 0, arg7) + arg0;
                                                if (var56 >= 0 && var56 < class195.field2745 && var57 >= 0 && class78.field984 > var57) {
                                                    class157.field2114[arg4][var56][var57] = var53;
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
        boolean var28 = false;
        if (!arg5) {
            class199 var29 = null;
            label288: while (true) {
                int var31;
                label281: do {
                    while (true) {
                        while (var20.field3762 < var20.field3764.length) {
                            int var30 = var20.method1738((byte) 114);
                            if (var30 == 0) {
                                var29 = new class199(var20);
                            } else {
                                if (var30 == 1) {
                                    var31 = var20.method1738((byte) 85);
                                    continue label281;
                                }
                                if (var30 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var29 == null) {
                                    var29 = new class199();
                                }
                                var29.method1381((byte) -85, var20);
                            }
                        }
                        if (var29 != null) {
                            class111.method791(var29, arg0 >> 3, false, arg10 >> 3);
                        }
                        break label288;
                    }
                } while (var31 <= 0);
                for (int var32 = 0; var32 < var31; var32++) {
                    class157 var33 = new class157(var20);
                    if (var33.field2099 == 31) {
                        class111 var34 = class399.method2496(var20.method1767(arg6 + 1930493576), (byte) -89);
                        var33.method1065(-22119, var34.field1536, var34.field1531, var34.field1533, var34.field1537);
                    }
                    int var35 = var33.field4337 >> 7;
                    int var36 = var33.field4336 >> 7;
                    if (var33.field2100 == arg1 && var12 <= var35 && var35 < var12 + 8 && var13 <= var36 && var36 < var13 + 8) {
                        int var37 = (arg10 << 7) + class119.method811(var33.field4337 & 0x3FF, var33.field4336 & 0x3FF, arg7, arg6 - 5230);
                        int var38 = (arg0 << 7) + class222.method1523(arg7, var33.field4337 & 0x3FF, 72, var33.field4336 & 0x3FF);
                        var33.field4336 = var38;
                        var33.field4337 = var37;
                        int var39 = var33.field4337 >> 7;
                        int var40 = var33.field4336 >> 7;
                        if (var39 >= 0 && var40 >= 0 && class195.field2745 > var39 && class78.field984 > var40) {
                            var33.field4338 = class264.field3910[arg1][var39][var40] - var33.field4338;
                            if (arg3.method103() > 0) {
                                class86.method583(var33);
                            }
                        }
                    }
                }
            }
        }
        if (!var28 && class157.field2114 != null && class157.field2114[arg4] != null) {
            int var41 = arg10 + 7;
            int var42 = arg0 + 7;
            for (int var43 = arg10; var43 < var41; var43++) {
                for (int var44 = arg0; var44 < var42; var44++) {
                    class157.field2114[arg4][var43][var44] = 0;
                }
            }
        }
        if (var26) {
            return class307.field4536;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 574)
    public static final void method799(int arg0) {
        field1545++;
        int var1 = 78 / ((arg0 + 48) / 46);
        class103.method693(0, (long) class388.field5665, class74.field942);
        if (class318.field4672 != -1) {
            class381.method2420((byte) 38, class318.field4672);
        }
        for (int var2 = 0; var2 < class147.field1996; var2++) {
            if (class344.field5053[var2]) {
                class67.field895[var2] = true;
            }
            class115.field1569[var2] = class344.field5053[var2];
            class344.field5053[var2] = false;
        }
        class343.field5043 = class388.field5665;
        if (class74.field942.method109()) {
            class72.field941 = true;
        }
        if (class318.field4672 != -1) {
            class147.field1996 = 0;
            class435.method2669(-16777216);
        }
        class74.field942.method162();
        class330.method2157(class458.field6762, -1);
        class286.field4180 = 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 614)
    public static void method800(boolean arg0) {
        if (arg0) {
            method798(53, 116, (class175[]) null, (class9) null, 93, false, -65, -92, (byte[]) null, -45, 89, -87);
        }
        field1549 = null;
    }
}
