import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class28 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field325 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Llc;")
    public static class86 field326;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method197(int arg0) {
        field326 = null;
        if (arg0 != 1) {
            field326 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    public static final int method198(int arg0, int arg1, int arg2) {
        field322++;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        int var6 = 30 % ((9 - arg2) / 45);
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIIIIII)V")
    public static final void method199(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field324++;
        int var7 = arg6 - arg5;
        int var8 = arg2 + arg5;
        int var9 = arg1 + arg5;
        if (arg0 <= 63) {
            return;
        }
        for (int var10 = arg1; var10 < var9; var10++) {
            class177.method1330(class240.field3831[var10], arg2, arg3, 32232, arg4);
        }
        int var11 = arg4 - arg5;
        for (int var12 = arg6; var12 > var7; var12--) {
            class177.method1330(class240.field3831[var12], arg2, arg3, 32232, arg4);
        }
        for (int var13 = var9; var13 <= var7; var13++) {
            int[] var14 = class240.field3831[var13];
            class177.method1330(var14, arg2, arg3, 32232, var8);
            class177.method1330(var14, var11, arg3, 32232, arg4);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method200(int arg0, String arg1) {
        int var2 = 37 % ((-arg0 - 61) / 53);
        field328++;
        return class235.method1663(true, 97, arg1, 10);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field323++;
        long var8 = class267.method1857(arg2, arg4 + arg6, arg0 + arg1);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x37823C) >> 20;
            int var11 = ((int) var8 & 0x7EFE7) >> 14;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class36 var13 = class134.method970(var12, 0);
            if (var13.field460 == -1) {
                int[] var14 = class70.field1031;
                int var15 = (arg6 * 4) + ((-arg0 + 103) * 512 * 4) + 24624;
                int var16 = arg3;
                if (var8 > 0L) {
                    var16 = arg5;
                }
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var14[var15] = var16;
                        var14[var15 + 512] = var16;
                        var14[var15 + 1024] = var16;
                        var14[var15 + 1536] = var16;
                    } else if (var10 == 1) {
                        var14[var15] = var16;
                        var14[var15 + 1] = var16;
                        var14[var15 + 2] = var16;
                        var14[var15 + 3] = var16;
                    } else if (var10 == 2) {
                        var14[var15 + 3] = var16;
                        var14[var15 + 3 + 512] = var16;
                        var14[var15 + 3 + 1024] = var16;
                        var14[var15 + 3 + 1536] = var16;
                    } else if (var10 == 3) {
                        var14[var15 + 1536] = var16;
                        var14[var15 + 1536 + 1] = var16;
                        var14[var15 + 2 + 1536] = var16;
                        var14[var15 + 1536 + 3] = var16;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var14[var15] = var16;
                    } else if (var10 == 1) {
                        var14[var15 + 3] = var16;
                    } else if (var10 == 2) {
                        var14[var15 + 3 + 1536] = var16;
                    } else if (var10 == 3) {
                        var14[var15 + 1536] = var16;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var14[var15] = var16;
                        var14[var15 + 512] = var16;
                        var14[var15 + 1024] = var16;
                        var14[var15 + 1536] = var16;
                    } else if (var10 == 0) {
                        var14[var15] = var16;
                        var14[var15 + 1] = var16;
                        var14[var15 + 2] = var16;
                        var14[var15 + 3] = var16;
                    } else if (var10 == 1) {
                        var14[var15 + 3] = var16;
                        var14[var15 + 512 + 3] = var16;
                        var14[var15 + 3 + 1024] = var16;
                        var14[var15 + 1539] = var16;
                    } else if (var10 == 2) {
                        var14[var15 + 1536] = var16;
                        var14[var15 + 1537] = var16;
                        var14[var15 + 2 + 1536] = var16;
                        var14[var15 + 1536 + 3] = var16;
                    }
                }
            } else if (!class93.method735(var13, arg6, arg1, arg0, 48, arg4, var10)) {
                return false;
            }
        }
        long var17 = class274.method1898(arg2, arg4 + arg6, arg0 + arg1);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3F7A73) >> 20;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class36 var22 = class134.method970(var21, 0);
            if (var22.field460 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    int[] var24 = class70.field1031;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var25 = (103 - arg0) * 512 * 4 + ((arg6 * 4) + 24624);
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 514] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 513] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class93.method735(var22, arg6, arg1, arg0, 48, arg4, var19)) {
                return false;
            }
        }
        if (arg7 != 2) {
            field329 = -84;
        }
        long var26 = class250.method1787(arg2, arg4 + arg6, arg0 + arg1);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x3323C3) >> 20;
            int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class36 var30 = class134.method970(var29, 0);
            if (var30.field460 != -1 && !class93.method735(var30, arg6, arg1, arg0, 48, arg4, var28)) {
                return false;
            }
        }
        return true;
    }
}
