import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class72 {

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "J")
    public long field1520 = 0L;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lrf;")
    private static class163 field1514 = class53.method392(93, "Hidden");

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lrf;")
    public static class163 field1508 = field1514;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lfc;")
    public static class54 field1505 = new class54(64);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Ls;")
    public class166 field1502;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Ls;")
    public class166 field1504;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lu;")
    public static class184 field1507;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lue;")
    public static class189 field1519;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Ld;")
    public static class31 field1503;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lib;")
    public static class80 field1517;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1515++;
        int var7 = 2048 - arg3 & 0x7FF;
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = 0;
        int var10 = arg1;
        int var11 = 0;
        if (arg4 > -106) {
            return;
        }
        if (var8 != 0) {
            int var12 = class1.field8[var8];
            int var13 = class1.field21[var8];
            int var14 = var11 * var12 - arg1 * var13 >> 16;
            var10 = arg1 * var12 + var11 * var13 >> 16;
            var11 = var14;
        }
        if (var7 != 0) {
            int var15 = class1.field21[var7];
            int var16 = class1.field8[var7];
            int var17 = var9 * var16 + var10 * var15 >> 16;
            var10 = var10 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class33.field644 = arg6 - var11;
        class64.field1354 = arg3;
        class86.field1882 = arg5 - var9;
        class90.field1939 = arg0 - var10;
        class44.field894 = arg2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method512(byte arg0) {
        field1503 = null;
        field1517 = null;
        field1505 = null;
        field1508 = null;
        if (arg0 >= -103) {
            method514(101, 32, (byte) -72);
        }
        field1519 = null;
        field1507 = null;
        field1514 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIILoa;III)V")
    public static final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, class131 arg5, int arg6, int arg7, int arg8) {
        field1509++;
        class61 var9 = class199.method1314((byte) 127, arg1);
        int var10;
        int var11;
        if (arg7 == 1 || arg7 == 3) {
            var11 = var9.field1257;
            var10 = var9.field1250;
        } else {
            var10 = var9.field1257;
            var11 = var9.field1250;
        }
        int var12;
        int var13;
        if (arg6 + var10 <= 104) {
            var12 = (var10 >> 1) + arg6;
            var13 = (var10 + 1 >> 1) + arg6;
        } else {
            var12 = arg6;
            var13 = arg6 + 1;
        }
        int[][] var14 = class154.field3199[arg0];
        int var15;
        int var16;
        if (arg3 + var11 > 104) {
            var15 = arg3;
            var16 = arg3 + 1;
        } else {
            var15 = (var11 >> 1) + arg3;
            var16 = (var11 + 1 >> 1) + arg3;
        }
        int var17 = var14[var12][var15] + var14[var13][var16] + var14[var12][var16] + var14[var13][var15] >> 2;
        long var18 = (long) ((arg7 | 0x400) << 20 | arg3 << 7 | arg6 | arg2 << 14);
        int var20 = (arg6 << 7) + (var10 << 6);
        int var21 = (arg3 << 7) + (var11 << 6);
        if (var9.field1243 == 0) {
            var18 |= Long.MIN_VALUE;
        }
        if (var9.field1298 == 1) {
            var18 |= 0x400000L;
        }
        long var22 = var18 | (long) arg1 << 32;
        if (arg2 == 22) {
            class166 var24;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var24 = var9.method437(var20, 22, var17, -23866, var14, var21, arg7);
            } else {
                var24 = new class56(arg1, 22, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class172.method1158(arg4, arg6, arg3, var17, var24, var22);
            if (var9.field1296 == 1) {
                arg5.method875(arg3, arg6, true);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class166 var50;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var50 = var9.method437(var20, 10, var17, arg8 - 23866, var14, var21, arg7);
            } else {
                var50 = new class56(arg1, 10, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            if (var50 != null) {
                class6.method59(arg4, arg6, arg3, var17, var10, var11, var50, arg2 == 11 ? 256 : 0, var22);
            }
            if (var9.field1296 != 0) {
                arg5.method869(var9.field1272, arg6, (byte) 52, arg3, var10, var11);
            }
        } else if (arg2 >= 12) {
            class166 var25;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var25 = var9.method437(var20, arg2, var17, -23866, var14, var21, arg7);
            } else {
                var25 = new class56(arg1, arg2, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class6.method59(arg4, arg6, arg3, var17, 1, 1, var25, 0, var22);
            if (var9.field1296 != 0) {
                arg5.method869(var9.field1272, arg6, (byte) 52, arg3, var10, var11);
            }
        } else if (arg2 == arg8) {
            class166 var26;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var26 = var9.method437(var20, 0, var17, -23866, var14, var21, arg7);
            } else {
                var26 = new class56(arg1, 0, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class57.method412(arg4, arg6, arg3, var17, var26, null, class65.field1386[arg7], 0, var22);
            if (var9.field1296 != 0) {
                arg5.method879(14928, arg2, arg7, arg3, var9.field1272, arg6);
            }
        } else if (arg2 == 1) {
            class166 var27;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var27 = var9.method437(var20, 1, var17, -23866, var14, var21, arg7);
            } else {
                var27 = new class56(arg1, 1, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class57.method412(arg4, arg6, arg3, var17, var27, null, class74.field1551[arg7], 0, var22);
            if (var9.field1296 != 0) {
                arg5.method879(arg8 ^ 0x3A50, arg2, arg7, arg3, var9.field1272, arg6);
            }
        } else if (arg2 == 2) {
            int var28 = arg7 + 1 & 0x3;
            class166 var29;
            class166 var30;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var29 = var9.method437(var20, 2, var17, -23866, var14, var21, arg7 + 4);
                var30 = var9.method437(var20, 2, var17, -23866, var14, var21, var28);
            } else {
                var29 = new class56(arg1, 2, arg7 + 4, arg0, arg6, arg3, var9.field1279, true, null);
                var30 = new class56(arg1, 2, var28, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class57.method412(arg4, arg6, arg3, var17, var29, var30, class65.field1386[arg7], class65.field1386[var28], var22);
            if (var9.field1296 != 0) {
                arg5.method879(arg8 + 14928, arg2, arg7, arg3, var9.field1272, arg6);
            }
        } else if (arg2 == 3) {
            class166 var31;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var31 = var9.method437(var20, 3, var17, -23866, var14, var21, arg7);
            } else {
                var31 = new class56(arg1, 3, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class57.method412(arg4, arg6, arg3, var17, var31, null, class74.field1551[arg7], 0, var22);
            if (var9.field1296 != 0) {
                arg5.method879(arg8 + 14928, arg2, arg7, arg3, var9.field1272, arg6);
            }
        } else if (arg2 == 9) {
            class166 var32;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var32 = var9.method437(var20, arg2, var17, -23866, var14, var21, arg7);
            } else {
                var32 = new class56(arg1, arg2, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class6.method59(arg4, arg6, arg3, var17, 1, 1, var32, 0, var22);
            if (var9.field1296 != 0) {
                arg5.method869(var9.field1272, arg6, (byte) 52, arg3, var10, var11);
            }
        } else if (arg2 == 4) {
            class166 var33;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var33 = var9.method437(var20, 4, var17, -23866, var14, var21, arg7);
            } else {
                var33 = new class56(arg1, 4, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class31.method207(arg4, arg6, arg3, var17, var33, null, class65.field1386[arg7], 0, 0, 0, var22);
        } else if (arg2 == 5) {
            int var34 = 16;
            long var35 = class6.method58(arg4, arg6, arg3);
            if (var35 != 0L) {
                var34 = class199.method1314((byte) 126, Integer.MAX_VALUE & (int) (var35 >>> 32)).field1238;
            }
            class166 var37;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var37 = var9.method437(var20, 4, var17, -23866, var14, var21, arg7);
            } else {
                var37 = new class56(arg1, 4, arg7, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class31.method207(arg4, arg6, arg3, var17, var37, null, class65.field1386[arg7], 0, class195.field3876[arg7] * var34, class44.field895[arg7] * var34, var22);
        } else if (arg2 == 6) {
            int var38 = 8;
            long var39 = class6.method58(arg4, arg6, arg3);
            if (var39 != 0L) {
                var38 = class199.method1314((byte) 127, (int) (var39 >>> 32) & Integer.MAX_VALUE).field1238 / 2;
            }
            class166 var41;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var41 = var9.method437(var20, 4, var17, -23866, var14, var21, arg7 + 4);
            } else {
                var41 = new class56(arg1, 4, arg7 + 4, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class31.method207(arg4, arg6, arg3, var17, var41, null, 256, arg7, class48.field942[arg7] * var38, class187.field3731[arg7] * var38, var22);
        } else if (arg2 == 7) {
            int var42 = arg7 + 2 & 0x3;
            class166 var43;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var43 = var9.method437(var20, 4, var17, -23866, var14, var21, var42 + 4);
            } else {
                var43 = new class56(arg1, 4, var42 + 4, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class31.method207(arg4, arg6, arg3, var17, var43, null, 256, var42, 0, 0, var22);
        } else if (arg2 == 8) {
            long var44 = class6.method58(arg4, arg6, arg3);
            int var46 = 8;
            if (var44 != 0L) {
                var46 = class199.method1314((byte) 126, (int) (var44 >>> 32) & Integer.MAX_VALUE).field1238 / 2;
            }
            int var47 = arg7 + 2 & 0x3;
            class166 var48;
            class166 var49;
            if (var9.field1279 == -1 && var9.field1246 == null) {
                var48 = var9.method437(var20, 4, var17, -23866, var14, var21, arg7 + 4);
                var49 = var9.method437(var20, 4, var17, arg8 ^ 0xFFFFA2C6, var14, var21, var47 + 4);
            } else {
                var48 = new class56(arg1, 4, arg7 + 4, arg0, arg6, arg3, var9.field1279, true, null);
                var49 = new class56(arg1, 4, var47 + 4, arg0, arg6, arg3, var9.field1279, true, null);
            }
            class31.method207(arg4, arg6, arg3, var17, var48, var49, 256, arg7, class48.field942[arg7] * var46, class187.field3731[arg7] * var46, var22);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)V")
    public static final void method514(int arg0, int arg1, byte arg2) {
        class141.field2896.method326(104, 116);
        class141.field2896.method364(arg1, (byte) -35);
        field1516++;
        if (arg2 != -26) {
            method512((byte) 112);
        }
        class141.field2896.method386((byte) 108, arg0);
        class73.field1537++;
    }
}
