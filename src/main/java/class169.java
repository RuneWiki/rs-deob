import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class169 extends class164 {

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "[I")
    public static int[] field2434 = new int[1000];

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
    public static final void method1107(int arg0, int arg1) {
        if (arg1 != -2836) {
            return;
        }
        class294.field4647 = -1;
        field2429++;
        class271.field3963 = arg0;
        class294.field4647 = -1;
        class199.method1281(-1);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)Luk;")
    public static final class199 method1108(byte arg0, int arg1) {
        class199 var2 = (class199) class215.field2997.method65((byte) -120, (long) arg1);
        field2432++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1294.method1861(arg1, 16, 1);
        class199 var4 = new class199();
        if (var3 != null) {
            var4.method1283(-27, new class216(var3));
        }
        class215.field2997.method64((long) arg1, -1, var4);
        if (arg0 <= 88) {
            method1110((class82) null, -74);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2433++;
        if (arg2 >= -30) {
            method1108((byte) 83, -52);
        }
        long var8 = class255.method1634(arg1, arg4 + arg5, arg6 + arg7);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x7D01E) >> 14;
            int var11 = (int) var8 >> 20 & 0x3;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class273 var13 = class164.method1081(0, var12);
            if (var13.field4049 == -1) {
                int var14 = arg0;
                int var15 = (52736 - (arg6 * 512)) * 4 + ((arg5 * 4) + 24624);
                if (var8 > 0L) {
                    var14 = arg3;
                }
                int[] var16 = class155.field2242;
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var11 == 1) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 512 + 3] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var11 == 3) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 2 + 1536] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var16[var15] = var14;
                    } else if (var11 == 1) {
                        var16[var15 + 3] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var11 == 3) {
                        var16[var15 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var11 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var11 == 1) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 515] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1 + 1536] = var14;
                        var16[var15 + 1538] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
            } else if (!class49.method299(arg4, 1, arg7, var11, arg5, var13, arg6)) {
                return false;
            }
        }
        long var17 = class168.method1103(arg1, arg5 + arg4, arg6 - -arg7);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3432BB) >> 20;
            int var20 = ((int) var17 & 0x7DDE2) >> 14;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class273 var22 = class164.method1081(0, var21);
            if (var22.field4049 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class155.field2242;
                    int var25 = 24624 - (-((103 - arg6) * 512 * 4) - (arg5 * 4));
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 514] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 513] = var23;
                        var24[var25 + 2 + 1024] = var23;
                        var24[var25 + 1539] = var23;
                    }
                }
            } else if (!class49.method299(arg4, 1, arg7, var19, arg5, var22, arg6)) {
                return false;
            }
        }
        long var26 = class268.method1719(arg1, arg4 + arg5, arg6 + arg7);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x30A9DE) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class273 var30 = class164.method1081(0, var29);
            if (var30.field4049 != -1 && !class49.method299(arg4, 1, arg7, var28, arg5, var30, arg6)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lwe;I)Z")
    public static final boolean method1110(class82 arg0, int arg1) {
        field2431++;
        if (arg0.field1136 == 205) {
            class24.field291 = 250;
            return true;
        } else {
            if (arg1 != -2976) {
                field2434 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLbc;)V")
    public static final void method1111(byte arg0, class282 arg1) {
        field2428++;
        class5.field68 = arg1;
        if (arg0 != -20) {
            method1112(true);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    public static void method1112(boolean arg0) {
        field2434 = null;
        if (arg0) {
            method1108((byte) 5, -60);
        }
    }
}
