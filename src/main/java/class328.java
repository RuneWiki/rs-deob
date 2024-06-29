import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class328 {

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Lqi;")
    public static class257 field5058 = new class257();

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5060 = "Members object";

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "[I")
    public static int[] field5063 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIIII)Z", line = 6)
    public static final boolean method2289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class205.method1478(arg2, arg5 + arg4, arg3 + arg6);
        field5059++;
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x7FB62) >> 14;
            int var11 = (int) var8 >> 20 & 0x3;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class32 var13 = class226.method1607(109, var12);
            if (var13.field422 == -1) {
                int var14 = arg5 * 4 + (103 - arg3) * 512 * 4 + 24624;
                int var15 = arg7;
                int[] var16 = class287.field4453;
                if (var8 > 0L) {
                    var15 = arg0;
                }
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var16[var14] = var15;
                        var16[var14 + 512] = var15;
                        var16[var14 + 1024] = var15;
                        var16[var14 + 1536] = var15;
                    } else if (var11 == 1) {
                        var16[var14] = var15;
                        var16[var14 + 1] = var15;
                        var16[var14 + 2] = var15;
                        var16[var14 + 3] = var15;
                    } else if (var11 == 2) {
                        var16[var14 + 3] = var15;
                        var16[var14 + 512 + 3] = var15;
                        var16[var14 + 1024 + 3] = var15;
                        var16[var14 + 1539] = var15;
                    } else if (var11 == 3) {
                        var16[var14 + 1536] = var15;
                        var16[var14 + 1 + 1536] = var15;
                        var16[var14 + 1536 + 2] = var15;
                        var16[var14 + 3 + 1536] = var15;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var16[var14] = var15;
                    } else if (var11 == 1) {
                        var16[var14 + 3] = var15;
                    } else if (var11 == 2) {
                        var16[var14 + 3 + 1536] = var15;
                    } else if (var11 == 3) {
                        var16[var14 + 1536] = var15;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var16[var14] = var15;
                        var16[var14 + 512] = var15;
                        var16[var14 + 1024] = var15;
                        var16[var14 + 1536] = var15;
                    } else if (var11 == 0) {
                        var16[var14] = var15;
                        var16[var14 + 1] = var15;
                        var16[var14 + 2] = var15;
                        var16[var14 + 3] = var15;
                    } else if (var11 == 1) {
                        var16[var14 + 3] = var15;
                        var16[var14 + 3 + 512] = var15;
                        var16[var14 + 3 + 1024] = var15;
                        var16[var14 + 1539] = var15;
                    } else if (var11 == 2) {
                        var16[var14 + 1536] = var15;
                        var16[var14 + 1536 + 1] = var15;
                        var16[var14 + 1536 + 2] = var15;
                        var16[var14 + 1536 + 3] = var15;
                    }
                }
            } else if (!class52.method388(arg5, var11, var13, arg4, (byte) 100, arg6, arg3)) {
                return false;
            }
        }
        long var17 = class99.method745(arg2, arg4 + arg5, arg3 + arg6);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 14 & 0x1F;
            int var20 = ((int) var17 & 0x3C700C) >> 20;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class32 var22 = class226.method1607(0, var21);
            if (var22.field422 == -1) {
                if (var19 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class287.field4453;
                    int var25 = (103 - arg3) * 2048 + ((arg5 * 4) + 24624);
                    if (var20 == 0 || var20 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1 + 1024] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 1 + 512] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 1539] = var23;
                    }
                }
            } else if (!class52.method388(arg5, var20, var22, arg4, (byte) 111, arg6, arg3)) {
                return false;
            }
        }
        long var26 = class8.method77(arg2, arg4 + arg5, arg3 + arg6);
        if (var26 != 0L) {
            int var28 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class32 var29 = class226.method1607(arg1 - 121, var28);
            int var30 = (int) var26 >> 20 & 0x3;
            if (var29.field422 != -1 && !class52.method388(arg5, var30, var29, arg4, (byte) 113, arg6, arg3)) {
                return false;
            }
        }
        if (arg1 != -1) {
            method2291(-28, -126, -112, 6);
        }
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 218)
    public static void method2290(boolean arg0) {
        field5063 = null;
        if (!arg0) {
            field5060 = null;
            field5058 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)I", line = 244)
    public static final int method2291(int arg0, int arg1, int arg2, int arg3) {
        field5061++;
        if (class203.field3111 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg0;
        if (arg0 < 3 && (class324.field5005[1][var4][var5] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        if (arg3 < 77) {
            method2290(true);
        }
        int var8 = (128 - var6) * class203.field3111[var7][var4][var5] + class203.field3111[var7][var4 + 1][var5] * var6 >> 7;
        int var9 = (128 - var6) * class203.field3111[var7][var4][var5 + 1] + class203.field3111[var7][var4 + 1][var5 + 1] * var6 >> 7;
        int var10 = arg1 & 0x7F;
        return (128 - var10) * var8 + var9 * var10 >> 7;
    }
}
