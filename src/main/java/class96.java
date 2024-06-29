import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class96 {

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field1417 = 0;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "[[I")
    public static int[][] field1410 = new int[104][104];

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lia;")
    public static class209 field1405;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Llb;")
    public static class211 field1421;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I", line = 8)
    public static final int method762(int arg0, int arg1) {
        field1430++;
        if (arg0 < 60) {
            method765(-111, -24, -57, -7);
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xDF) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)V", line = 69)
    public static final void method763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -3) {
            return;
        }
        field1412++;
        if (arg4 < 0 || arg0 < 0 || arg4 >= 103 || arg0 >= 103) {
            return;
        }
        if (arg5 == 0) {
            class10 var8 = class179.method1300(arg3, arg4, arg0);
            if (var8 != null) {
                int var9 = (int) (var8.field91 >>> 32) & Integer.MAX_VALUE;
                if (arg6 == 2) {
                    var8.field98 = new class30(var9, 2, arg7 + 4, arg3, arg4, arg0, arg2, false, var8.field98);
                    var8.field94 = new class30(var9, 2, arg7 + 1 & 0x3, arg3, arg4, arg0, arg2, false, var8.field94);
                } else {
                    var8.field98 = new class30(var9, arg6, arg7, arg3, arg4, arg0, arg2, false, var8.field98);
                }
            }
        }
        if (arg5 == 1) {
            class290 var10 = class3.method36(arg3, arg4, arg0);
            if (var10 != null) {
                int var11 = (int) (var10.field4550 >>> 32) & Integer.MAX_VALUE;
                if (arg6 == 4 || arg6 == 5) {
                    var10.field4563 = new class30(var11, 4, arg7, arg3, arg4, arg0, arg2, false, var10.field4563);
                } else if (arg6 == 6) {
                    var10.field4563 = new class30(var11, 4, arg7 + 4, arg3, arg4, arg0, arg2, false, var10.field4563);
                } else if (arg6 == 7) {
                    var10.field4563 = new class30(var11, 4, (arg7 + 2 & 0x3) + 4, arg3, arg4, arg0, arg2, false, var10.field4563);
                } else if (arg6 == 8) {
                    var10.field4563 = new class30(var11, 4, arg7 + 4, arg3, arg4, arg0, arg2, false, var10.field4563);
                    var10.field4549 = new class30(var11, 4, (arg7 + 2 & 0x3) + 4, arg3, arg4, arg0, arg2, false, var10.field4549);
                }
            }
        }
        if (arg5 == 2) {
            class91 var12 = class83.method681(arg3, arg4, arg0);
            if (arg6 == 11) {
                arg6 = 10;
            }
            if (var12 != null) {
                var12.field1326 = new class30(Integer.MAX_VALUE & (int) (var12.field1327 >>> 32), arg6, arg7, arg3, arg4, arg0, arg2, false, var12.field1326);
            }
        }
        if (arg5 == 3) {
            class173 var13 = class217.method1552(arg3, arg4, arg0);
            if (var13 != null) {
                var13.field2560 = new class30(Integer.MAX_VALUE & (int) (var13.field2568 >>> 32), 22, arg7, arg3, arg4, arg0, arg2, false, var13.field2560);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)I", line = 168)
    public static final int method764(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -32) {
            field1417 = -126;
        }
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        field1414++;
        return (arg3 >> 2 << 10) + (arg0 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIII)V", line = 195)
    public static final void method765(int arg0, int arg1, int arg2, int arg3) {
        field1402++;
        class147 var4 = class92.method731(-29125, arg0, 11);
        var4.method1095(95);
        var4.field2240 = arg1;
        var4.field2249 = arg3;
        if (arg2 != 24834) {
            method766(-59, (class211) null);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILlb;)V", line = 220)
    public static final void method766(int arg0, class211 arg1) {
        if (arg0 <= -60) {
            class15.field180 = arg1;
            class79.field1109 = class15.field180.method1523(9271, 16);
            field1429++;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 243)
    public static void method767(boolean arg0) {
        if (!arg0) {
            field1410 = (int[][]) ((int[][]) null);
        }
        field1410 = (int[][]) null;
        field1421 = null;
        field1405 = null;
    }
}
