import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class18 extends class266 {

    @OriginalMember(owner = "client!be", name = "C", descriptor = "J")
    public static long field303 = 0L;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field308 = 0;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "Lma;")
    public static class5 field310 = class12.method119("(U", (byte) 71);

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "Ltj;")
    public static class73 field309 = new class73(64);

    @OriginalMember(owner = "client!be", name = "V", descriptor = "[[[B")
    public static byte[][][] field321 = new byte[4][104][104];

    @OriginalMember(owner = "client!be", name = "U", descriptor = "J")
    public static volatile long field320 = 0L;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "Lma;")
    public class5 field305;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLii;I)V", line = 15)
    private final void method148(boolean arg0, class221 arg1, int arg2) {
        field314++;
        if (arg2 == 1) {
            this.field311 = arg1.method1509(true);
        } else if (arg2 == 2) {
            this.field318 = arg1.method1517((byte) -118);
        } else if (arg2 == 5) {
            this.field305 = arg1.method1501((byte) -56);
        }
        if (!arg0) {
            this.field311 = -41;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIZIZIIIII)Z", line = 41)
    public static final boolean method149(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (!arg4) {
            return false;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class165.field2518[var12][var13] = 0;
                class202.field3199[var12][var13] = 99999999;
            }
        }
        int var14 = arg11;
        field316++;
        class165.field2518[arg11][arg10] = 99;
        class202.field3199[arg11][arg10] = 0;
        int var15 = arg10;
        int var16 = 0;
        boolean var17 = false;
        byte var18 = 0;
        class111.field1649[var18] = arg11;
        int var32 = var18 + 1;
        class65.field1021[var18] = arg10;
        int[][] var19 = class242.field4031[class276.field4701].field793;
        while (var16 != var32) {
            var15 = class65.field1021[var16];
            var14 = class111.field1649[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg1 == var14 && arg3 == var15) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class242.field4031[class276.field4701].method384(var15, arg3, arg5 - 1, (byte) -119, arg1, arg0, 1, var14)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && class242.field4031[class276.field4701].method373(arg0, var14, 1, (byte) -108, arg1, arg5 - 1, arg3, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg8 != 0 && class242.field4031[class276.field4701].method387(arg2, arg3, 1, arg1, arg8, -128, arg9, var15, var14)) {
                var17 = true;
                break;
            }
            int var20 = class202.field3199[var14][var15] + 1;
            if (var14 > 0 && class165.field2518[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class111.field1649[var32] = var14 - 1;
                class65.field1021[var32] = var15;
                class165.field2518[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class202.field3199[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class165.field2518[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class111.field1649[var32] = var14 + 1;
                class65.field1021[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14 + 1][var15] = 8;
                class202.field3199[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class165.field2518[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class111.field1649[var32] = var14;
                class65.field1021[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14][var15 - 1] = 1;
                class202.field3199[var14][var15 - 1] = var20;
            }
            if (var15 < 103 && class165.field2518[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class111.field1649[var32] = var14;
                class65.field1021[var32] = var15 + 1;
                class165.field2518[var14][var15 + 1] = 4;
                class202.field3199[var14][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 > 0 && class165.field2518[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class111.field1649[var32] = var14 - 1;
                class65.field1021[var32] = var15 - 1;
                class165.field2518[var14 - 1][var15 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class202.field3199[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 103 && var15 > 0 && class165.field2518[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class111.field1649[var32] = var14 + 1;
                class65.field1021[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14 + 1][var15 - 1] = 9;
                class202.field3199[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 103 && class165.field2518[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class111.field1649[var32] = var14 - 1;
                class65.field1021[var32] = var15 + 1;
                class165.field2518[var14 - 1][var15 + 1] = 6;
                class202.field3199[var14 - 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && var15 < 103 && class165.field2518[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class111.field1649[var32] = var14 + 1;
                class65.field1021[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14 + 1][var15 + 1] = 12;
                class202.field3199[var14 + 1][var15 + 1] = var20;
            }
        }
        class261.field4464 = 0;
        if (!var17) {
            if (!arg6) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= arg1 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= (arg3 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class202.field3199[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg1 > var24) {
                            var26 = arg1 - var24;
                        } else if (var24 > arg2 + arg1 - 1) {
                            var26 = 1 - arg1 - (arg2 - var24);
                        }
                        if (var25 < arg3) {
                            var27 = arg3 - var25;
                        } else if (var25 > arg8 + arg3 - 1) {
                            var27 = var25 - (arg8 - 1) - arg3;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class202.field3199[var24][var25]) {
                            var14 = var24;
                            var15 = var25;
                            var21 = var28;
                            var22 = class202.field3199[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg11 == var14 && arg10 == var15) {
                return false;
            }
            class261.field4464 = 1;
        }
        byte var29 = 0;
        class111.field1649[var29] = var14;
        int var33 = var29 + 1;
        class65.field1021[var29] = var15;
        int var30;
        int var31 = var30 = class165.field2518[var14][var15];
        while (arg11 != var14 || arg10 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class111.field1649[var33] = var14;
                class65.field1021[var33++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class165.field2518[var14][var15];
        }
        if (var33 > 0) {
            class250.method1750(false, arg7, var33);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILii;)V", line = 338)
    public final void method150(int arg0, class221 arg1) {
        if (arg0 != -1) {
            return;
        }
        field313++;
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                return;
            }
            this.method148(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(ILni;)V", line = 372)
    public static final void method151(int arg0, class202 arg1) {
        class146.field2122 = arg1;
        if (arg0 != 6151) {
            field308 = 6;
        }
        field306++;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)Z", line = 393)
    public final boolean method152(int arg0) {
        if (arg0 < 116) {
            method151(-59, (class202) null);
        }
        field304++;
        return this.field311 == 115;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 405)
    public static void method153(int arg0) {
        field310 = null;
        if (arg0 < 111) {
            field303 = -29L;
        }
        field309 = null;
        field321 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V", line = 417)
    public static final void method154(boolean arg0) {
        if (arg0) {
            field317 = 21;
        }
        class209.field3312.method523(122);
        field315++;
    }
}
