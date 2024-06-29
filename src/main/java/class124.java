import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class124 {

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field1653 = 0;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lfh;")
    public static class140 field1650;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIZII)Z", line = 11)
    public static final boolean method917(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            field1650 = (class140) null;
        }
        field1651++;
        long var8 = class9.method62(arg1, arg3 + arg7, arg6 - -arg2);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = ((int) var8 & 0x7E0CC) >> 14;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class219 var13 = class345.method2392(var12, 0);
            if (var13.field3095 == -1) {
                int var14 = arg0;
                int[] var15 = class37.field452;
                int var16 = 24624 - (-((52736 - (arg6 * 512)) * 4) - (arg7 * 4));
                if (var8 > 0L) {
                    var14 = arg4;
                }
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1 + 1536] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
            } else if (!class261.method1801(arg3, arg6, var13, 4, arg7, arg2, var10)) {
                return false;
            }
        }
        long var17 = class106.method748(arg1, arg3 + arg7, arg2 + arg6);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x35E805) >> 20;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var21 = ((int) var17 & 0x7DA9B) >> 14;
            class219 var22 = class345.method2392(var20, 0);
            if (var22.field3095 == -1) {
                if (var21 == 9) {
                    int var23 = 15658734;
                    int[] var24 = class37.field452;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var25 = arg7 * 4 + (((52736 - (arg6 * 512)) * 4) + 24624);
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 1536 + 3] = var23;
                    }
                }
            } else if (!class261.method1801(arg3, arg6, var22, 4, arg7, arg2, var19)) {
                return false;
            }
        }
        long var26 = class340.method2366(arg1, arg3 + arg7, arg2 + arg6);
        if (var26 != 0L) {
            int var28 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            int var29 = ((int) var26 & 0x389BDA) >> 20;
            class219 var30 = class345.method2392(var28, 0);
            if (var30.field3095 != -1 && !class261.method1801(arg3, arg6, var30, 4, arg7, arg2, var29)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 223)
    public static void method918(boolean arg0) {
        field1650 = null;
        if (!arg0) {
            field1650 = (class140) null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V", line = 233)
    public static final void method919(int arg0, int arg1) {
        class90.field1134 = 1000 / arg0;
        if (arg1 != -27143) {
            field1650 = (class140) null;
        }
        field1649++;
    }
}
