import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class78 {

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field1248 = -1;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "[I")
    public static int[] field1245 = new int[1000];

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Ldf;")
    private static class51 field1249 = class46.method233("Players", 100);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Ldf;")
    public static class51 field1242 = field1249;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "[I")
    public static int[] field1250 = new int[4096];

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "[J")
    public static long[] field1251;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lwc;")
    public static class213 field1246;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIILkb;IJZ)Z")
    public static final boolean method552(int arg0, int arg1, int arg2, int arg3, int arg4, class49 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class195.method1382(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1242 = null;
        if (arg0 != 4) {
            return;
        }
        field1250 = null;
        field1249 = null;
        field1246 = null;
        field1251 = null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZIIIII)V")
    public static final void method554(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            field1250 = null;
        }
        field1243++;
        long var6 = class75.method542(arg3, arg4, arg1);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x7D1EC) >> 14;
            int var9 = arg5;
            int[] var10 = class59.field957;
            int var11 = ((int) var6 & 0x3B8C40) >> 20;
            if (var6 > 0L) {
                var9 = arg2;
            }
            int var12 = 24624 - (-(arg4 * 4) - (103 - arg1) * 512 * 4);
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class108 var14 = class41.method210(var13, (byte) 75);
            if (var14.field1836 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var11 == 0) {
                        var10[var12] = var9;
                        var10[var12 + 512] = var9;
                        var10[var12 + 1024] = var9;
                        var10[var12 + 1536] = var9;
                    } else if (var11 == 1) {
                        var10[var12] = var9;
                        var10[var12 + 1] = var9;
                        var10[var12 + 2] = var9;
                        var10[var12 + 3] = var9;
                    } else if (var11 == 2) {
                        var10[var12 + 3] = var9;
                        var10[var12 + 512 + 3] = var9;
                        var10[var12 + 1024 + 3] = var9;
                        var10[var12 + 1539] = var9;
                    } else if (var11 == 3) {
                        var10[var12 + 1536] = var9;
                        var10[var12 + 1536 + 1] = var9;
                        var10[var12 + 2 + 1536] = var9;
                        var10[var12 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var11 == 0) {
                        var10[var12] = var9;
                    } else if (var11 == 1) {
                        var10[var12 + 3] = var9;
                    } else if (var11 == 2) {
                        var10[var12 + 3 + 1536] = var9;
                    } else if (var11 == 3) {
                        var10[var12 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var11 == 3) {
                        var10[var12] = var9;
                        var10[var12 + 512] = var9;
                        var10[var12 + 1024] = var9;
                        var10[var12 + 1536] = var9;
                    } else if (var11 == 0) {
                        var10[var12] = var9;
                        var10[var12 + 1] = var9;
                        var10[var12 + 2] = var9;
                        var10[var12 + 3] = var9;
                    } else if (var11 == 1) {
                        var10[var12 + 3] = var9;
                        var10[var12 + 3 + 512] = var9;
                        var10[var12 + 3 + 1024] = var9;
                        var10[var12 + 1536 + 3] = var9;
                    } else if (var11 == 2) {
                        var10[var12 + 1536] = var9;
                        var10[var12 + 1536 + 1] = var9;
                        var10[var12 + 1538] = var9;
                        var10[var12 + 1536 + 3] = var9;
                    }
                }
            } else {
                class158 var15 = null;
                if (!var14.field1784) {
                    var15 = class30.field437[var14.field1836];
                } else if (var11 == 0) {
                    var15 = class30.field437[var14.field1836];
                } else if (var11 == 1) {
                    var15 = class93.field1557[var14.field1836];
                } else if (var11 == 2) {
                    var15 = class48.field764[var14.field1836];
                } else if (var11 == 3) {
                    var15 = class166.field2707[var14.field1836];
                }
                if (var15 != null) {
                    int var16 = (var14.field1824 * 4 - var15.field2583) / 2;
                    int var17 = (var14.field1807 * 4 - var15.field2577) / 2;
                    var15.method1110(arg4 * 4 + var16 + 48, (-arg1 + 104 + -var14.field1807) * 4 + (48 - -var17));
                }
            }
        }
        long var18 = class98.method726(arg3, arg4, arg1);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x39C8D8) >> 20;
            int var21 = ((int) var18 & 0x7E136) >> 14;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class108 var23 = class41.method210(var22, (byte) 75);
            if (var23.field1836 != -1) {
                class158 var24 = null;
                if (!var23.field1784) {
                    var24 = class30.field437[var23.field1836];
                } else if (var20 == 0) {
                    var24 = class30.field437[var23.field1836];
                } else if (var20 == 1) {
                    var24 = class93.field1557[var23.field1836];
                } else if (var20 == 2) {
                    var24 = class48.field764[var23.field1836];
                } else if (var20 == 3) {
                    var24 = class166.field2707[var23.field1836];
                }
                if (var24 != null) {
                    int var25 = (var23.field1824 * 4 - var24.field2583) / 2;
                    int var26 = (var23.field1807 * 4 - var24.field2577) / 2;
                    var24.method1110(arg4 * 4 + var25 + 48, var26 + 48 - -((-var23.field1807 + 104 + -arg1) * 4));
                }
            } else if (var21 == 9) {
                int[] var27 = class59.field957;
                int var28 = (52736 - (arg1 * 512)) * 4 + arg4 * 4 + 24624;
                int var29 = 15658734;
                if (var18 > 0L) {
                    var29 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var27[var28 + 1536] = var29;
                    var27[var28 + 1025] = var29;
                    var27[var28 + 512 + 2] = var29;
                    var27[var28 + 3] = var29;
                } else {
                    var27[var28] = var29;
                    var27[var28 + 512 + 1] = var29;
                    var27[var28 + 1026] = var29;
                    var27[var28 + 1536 + 3] = var29;
                }
            }
        }
        long var30 = class45.method230(arg3, arg4, arg1);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        int var33 = (int) var30 >> 20 & 0x3;
        class108 var34 = class41.method210(var32, (byte) 75);
        if (var34.field1836 == -1) {
            return;
        }
        class158 var35 = null;
        if (!var34.field1784) {
            var35 = class30.field437[var34.field1836];
        } else if (var33 == 0) {
            var35 = class30.field437[var34.field1836];
        } else if (var33 == 1) {
            var35 = class93.field1557[var34.field1836];
        } else if (var33 == 2) {
            var35 = class48.field764[var34.field1836];
        } else if (var33 == 3) {
            var35 = class166.field2707[var34.field1836];
        }
        if (var35 != null) {
            int var36 = (var34.field1807 * 4 - var35.field2577) / 2;
            int var37 = (var34.field1824 * 4 - var35.field2583) / 2;
            var35.method1110(arg4 * 4 + var37 + 48, (-var34.field1807 + 104 - arg1) * 4 + 48 + var36);
            return;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1250[var0] = class227.method1562(var0, 111);
        }
        field1251 = new long[100];
        field1252 = 0;
    }
}
