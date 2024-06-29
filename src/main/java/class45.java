import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class45 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lbd;")
    public static class162 field721 = class17.method142(0, "leuchten3:");

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Z")
    public static boolean field724 = true;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lbd;")
    public static class162 field725 = class17.method142(0, "null");

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "J")
    public static long field723;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V", line = 20)
    public static final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field726++;
        long var6 = class82.method626(arg1, arg2, arg0);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x3D7ACC) >> 20;
            int var9 = ((int) var6 & 0x7E63C) >> 14;
            int[] var10 = class316.field5328;
            int var11 = arg2 * 4 + ((-(arg0 * 512) + 52736) * 4) + 24624;
            int var12 = arg4;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            if (var6 > 0L) {
                var12 = arg5;
            }
            class311 var14 = class229.method1637(var13, (byte) 93);
            if (var14.field5205 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var10[var11] = var12;
                        var10[var11 + 512] = var12;
                        var10[var11 + 1024] = var12;
                        var10[var11 + 1536] = var12;
                    } else if (var8 == 1) {
                        var10[var11] = var12;
                        var10[var11 + 1] = var12;
                        var10[var11 + 2] = var12;
                        var10[var11 + 3] = var12;
                    } else if (var8 == 2) {
                        var10[var11 + 3] = var12;
                        var10[var11 + 515] = var12;
                        var10[var11 + 1027] = var12;
                        var10[var11 + 1539] = var12;
                    } else if (var8 == 3) {
                        var10[var11 + 1536] = var12;
                        var10[var11 + 1536 + 1] = var12;
                        var10[var11 + 1536 + 2] = var12;
                        var10[var11 + 1536 + 3] = var12;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var10[var11] = var12;
                    } else if (var8 == 1) {
                        var10[var11 + 3] = var12;
                    } else if (var8 == 2) {
                        var10[var11 + 3 + 1536] = var12;
                    } else if (var8 == 3) {
                        var10[var11 + 1536] = var12;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var10[var11] = var12;
                        var10[var11 + 512] = var12;
                        var10[var11 + 1024] = var12;
                        var10[var11 + 1536] = var12;
                    } else if (var8 == 0) {
                        var10[var11] = var12;
                        var10[var11 + 1] = var12;
                        var10[var11 + 2] = var12;
                        var10[var11 + 3] = var12;
                    } else if (var8 == 1) {
                        var10[var11 + 3] = var12;
                        var10[var11 + 3 + 512] = var12;
                        var10[var11 + 1024 + 3] = var12;
                        var10[var11 + 3 + 1536] = var12;
                    } else if (var8 == 2) {
                        var10[var11 + 1536] = var12;
                        var10[var11 + 1536 + 1] = var12;
                        var10[var11 + 1538] = var12;
                        var10[var11 + 1536 + 3] = var12;
                    }
                }
            } else {
                class99 var15 = null;
                if (!var14.field5192) {
                    var15 = class18.field303[var14.field5205];
                } else if (var8 == 0) {
                    var15 = class18.field303[var14.field5205];
                } else if (var8 == 1) {
                    var15 = class129.field2336[var14.field5205];
                } else if (var8 == 2) {
                    var15 = class297.field4978[var14.field5205];
                } else if (var8 == 3) {
                    var15 = class128.field2325[var14.field5205];
                }
                if (var15 != null) {
                    int var16 = (var14.field5217 * 4 - var15.field557) / 2;
                    int var17 = (var14.field5201 * 4 - var15.field556) / 2;
                    var15.method266(arg2 * 4 + var17 + 48, (104 - arg0 + -var14.field5217) * 4 + 48 + var16);
                }
            }
        }
        if (arg3 != 5854) {
            method326(92, 30, 92, 37, -2, 26);
        }
        long var18 = class104.method846(arg1, arg2, arg0);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class311 var23 = class229.method1637(var22, (byte) 93);
            if (var23.field5205 != -1) {
                class99 var27 = null;
                if (!var23.field5192) {
                    var27 = class18.field303[var23.field5205];
                } else if (var20 == 0) {
                    var27 = class18.field303[var23.field5205];
                } else if (var20 == 1) {
                    var27 = class129.field2336[var23.field5205];
                } else if (var20 == 2) {
                    var27 = class297.field4978[var23.field5205];
                } else if (var20 == 3) {
                    var27 = class128.field2325[var23.field5205];
                }
                if (var27 != null) {
                    int var28 = (var23.field5201 * 4 - var27.field556) / 2;
                    int var29 = (var23.field5217 * 4 - var27.field557) / 2;
                    var27.method266(arg2 * 4 + var28 + 48, (104 - (var23.field5217 + arg0)) * 4 + var29 + 48);
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int[] var25 = class316.field5328;
                int var26 = arg2 * 4 + (103 - arg0) * 4 * 512 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1024 + 1] = var24;
                    var25[var26 + 512 + 2] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 513] = var24;
                    var25[var26 + 2 + 1024] = var24;
                    var25[var26 + 1539] = var24;
                }
            }
        }
        long var30 = class256.method1768(arg1, arg2, arg0);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) var30 >> 20 & 0x3;
        int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class311 var34 = class229.method1637(var33, (byte) 93);
        if (var34.field5205 == -1) {
            return;
        }
        class99 var35 = null;
        if (!var34.field5192) {
            var35 = class18.field303[var34.field5205];
        } else if (var32 == 0) {
            var35 = class18.field303[var34.field5205];
        } else if (var32 == 1) {
            var35 = class129.field2336[var34.field5205];
        } else if (var32 == 2) {
            var35 = class297.field4978[var34.field5205];
        } else if (var32 == 3) {
            var35 = class128.field2325[var34.field5205];
        }
        if (var35 != null) {
            int var36 = (var34.field5201 * 4 - var35.field556) / 2;
            int var37 = (var34.field5217 * 4 - var35.field557) / 2;
            var35.method266(arg2 * 4 + var36 + 48, (-var34.field5217 + 104 + -arg0) * 4 + 48 + var37);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 325)
    public static void method327(byte arg0) {
        field725 = null;
        if (arg0 != 115) {
            field722 = -65;
        }
        field721 = null;
    }
}
