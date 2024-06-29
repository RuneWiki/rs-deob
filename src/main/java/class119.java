import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class119 {

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lvf;")
    private static class265 field2105 = class87.method582(-46, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lvf;")
    public static class265 field2107 = class87.method582(-46, "");

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lvf;")
    public static class265 field2103 = field2105;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2104 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lmh;")
    public static class114 field2106;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[Lcg;")
    public static class34[] field2101;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIII)V")
    public static final void method799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2108++;
        long var6 = class72.method510(arg0, arg4, arg5);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x38E780) >> 20;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class130 var11 = class84.method574(-127, var10);
            if (var11.field2339 == -1) {
                int var12 = arg2;
                if (var6 > 0L) {
                    var12 = arg3;
                }
                int var13 = (103 - arg5) * 512 * 4 + (arg4 * 4) + 24624;
                int[] var14 = class35.field822;
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var14[var13] = var12;
                        var14[var13 + 512] = var12;
                        var14[var13 + 1024] = var12;
                        var14[var13 + 1536] = var12;
                    } else if (var8 == 1) {
                        var14[var13] = var12;
                        var14[var13 + 1] = var12;
                        var14[var13 + 2] = var12;
                        var14[var13 + 3] = var12;
                    } else if (var8 == 2) {
                        var14[var13 + 3] = var12;
                        var14[var13 + 3 + 512] = var12;
                        var14[var13 + 3 + 1024] = var12;
                        var14[var13 + 3 + 1536] = var12;
                    } else if (var8 == 3) {
                        var14[var13 + 1536] = var12;
                        var14[var13 + 1536 + 1] = var12;
                        var14[var13 + 1538] = var12;
                        var14[var13 + 1536 + 3] = var12;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var14[var13] = var12;
                    } else if (var8 == 1) {
                        var14[var13 + 3] = var12;
                    } else if (var8 == 2) {
                        var14[var13 + 3 + 1536] = var12;
                    } else if (var8 == 3) {
                        var14[var13 + 1536] = var12;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var14[var13] = var12;
                        var14[var13 + 512] = var12;
                        var14[var13 + 1024] = var12;
                        var14[var13 + 1536] = var12;
                    } else if (var8 == 0) {
                        var14[var13] = var12;
                        var14[var13 + 1] = var12;
                        var14[var13 + 2] = var12;
                        var14[var13 + 3] = var12;
                    } else if (var8 == 1) {
                        var14[var13 + 3] = var12;
                        var14[var13 + 512 + 3] = var12;
                        var14[var13 + 3 + 1024] = var12;
                        var14[var13 + 1539] = var12;
                    } else if (var8 == 2) {
                        var14[var13 + 1536] = var12;
                        var14[var13 + 1 + 1536] = var12;
                        var14[var13 + 1538] = var12;
                        var14[var13 + 1539] = var12;
                    }
                }
            } else {
                class34 var15 = null;
                int var16 = var11.field2328;
                if (!var11.field2284) {
                    var15 = class258.field4441[var11.field2339];
                } else if (var8 == 0) {
                    var15 = class258.field4441[var11.field2339];
                } else if (var8 == 1) {
                    var16 = var11.field2309;
                    var15 = class13.field406[var11.field2339];
                } else if (var8 == 2) {
                    var15 = class5.field71[var11.field2339];
                } else if (var8 == 3) {
                    var16 = var11.field2309;
                    var15 = class181.field3216[var11.field2339];
                }
                if (var15 != null) {
                    var15.method277(arg4 * 4 + 48, (-var16 + 104 - arg5) * 4 + 48);
                }
            }
        }
        long var17 = class179.method1166(arg0, arg4, arg5);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x31B3BE) >> 20;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class130 var22 = class84.method574(-123, var21);
            if (var22.field2339 != -1) {
                int var26 = var22.field2328;
                class34 var27 = null;
                if (!var22.field2284) {
                    var27 = class258.field4441[var22.field2339];
                } else if (var19 == 0) {
                    var27 = class258.field4441[var22.field2339];
                } else if (var19 == 1) {
                    var27 = class13.field406[var22.field2339];
                    var26 = var22.field2309;
                } else if (var19 == 2) {
                    var27 = class5.field71[var22.field2339];
                } else if (var19 == 3) {
                    var27 = class181.field3216[var22.field2339];
                    var26 = var22.field2309;
                }
                if (var27 != null) {
                    var27.method277(arg4 * 4 + 48, 48 - -((-arg5 + 104 + -var26) * 4));
                }
            } else if (var20 == 9) {
                int[] var23 = class35.field822;
                int var24 = 15658734;
                if (var17 > 0L) {
                    var24 = 15597568;
                }
                int var25 = (103 - arg5) * 4 * 512 + arg4 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var23[var25 + 1536] = var24;
                    var23[var25 + 1 + 1024] = var24;
                    var23[var25 + 514] = var24;
                    var23[var25 + 3] = var24;
                } else {
                    var23[var25] = var24;
                    var23[var25 + 513] = var24;
                    var23[var25 + 1024 + 2] = var24;
                    var23[var25 + 3 + 1536] = var24;
                }
            }
        }
        long var28 = class23.method221(arg0, arg4, arg5);
        if (arg1 != -3 || var28 == 0L) {
            return;
        }
        int var30 = ((int) var28 & 0x352722) >> 20;
        int var31 = Integer.MAX_VALUE & (int) (var28 >>> 32);
        class130 var32 = class84.method574(arg1 + 79, var31);
        if (var32.field2339 == -1) {
            return;
        }
        class34 var33 = null;
        int var34 = var32.field2328;
        if (!var32.field2284) {
            var33 = class258.field4441[var32.field2339];
        } else if (var30 == 0) {
            var33 = class258.field4441[var32.field2339];
        } else if (var30 == 1) {
            var34 = var32.field2309;
            var33 = class13.field406[var32.field2339];
        } else if (var30 == 2) {
            var33 = class5.field71[var32.field2339];
        } else if (var30 == 3) {
            var33 = class181.field3216[var32.field2339];
            var34 = var32.field2309;
        }
        if (var33 != null) {
            var33.method277(arg4 * 4 + 48, (-arg5 + -var34 + 104) * 4 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)Z")
    public static final boolean method800(byte arg0, int arg1) {
        field2100++;
        if (arg0 == -39) {
            return (arg1 & 0x363E264F) >> 29 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static void method801(boolean arg0) {
        field2103 = null;
        if (!arg0) {
            method801(true);
        }
        field2107 = null;
        field2101 = null;
        field2105 = null;
        field2106 = null;
    }
}
