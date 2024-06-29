import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class291 {

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[S")
    public static short[] field4585 = new short[256];

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4584 = 0;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Luc;")
    public static class39 field4590 = new class39(32);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lhc;")
    public static class235 field4582;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1947(byte arg0) {
        field4585 = null;
        field4590 = null;
        field4582 = null;
        if (arg0 <= 19) {
            field4584 = 95;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILig;IIIIIZILfb;III)Lig;")
    public static final class9 method1948(int arg0, int arg1, class9 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, class30 arg10, int arg11, int arg12, int arg13) {
        long var14 = (long) ((arg13 << 24) + (arg11 << 16) + arg3) - (-((long) arg1 << 48) - ((long) arg6 << 32));
        class9 var16 = (class9) class244.field3971.method1887(0, var14);
        if (var16 == null) {
            byte var17;
            if (arg3 == 1) {
                var17 = 9;
            } else if (arg3 == 2) {
                var17 = 12;
            } else if (arg3 == 3) {
                var17 = 15;
            } else if (arg3 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class234 var20 = new class234(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int var21 = var20.method1563(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg12 + (class195.field3091[var33] * var30) >> 16;
                    int var35 = class195.field3089[var33] * var31 + arg7 >> 16;
                    var22[var23][var32] = var20.method1563(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg11 * var26 + arg13 * var25 >> 8);
                short var28 = (short) (((arg1 & 0xFC00) * var25 + (arg6 & 0xFC00) * var26 & 0xFC0000) + ((arg1 & 0x380) * var25 + (arg6 & 0x380) * var26 & 0x38000) + ((arg1 & 0x7F) * var25 + (arg6 & 0x7F) * var26 & 0x7F00) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1572(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1572(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1572(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1560(64, 768, -50, -10, -50);
            class244.field3971.method1886(-89, var14, var16);
        }
        field4580++;
        int var36 = arg3 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = arg2.method80();
        int var40 = arg2.method94();
        int var41 = -var36;
        int var42 = arg2.method101();
        class3 var43 = null;
        if (arg4 != -1409) {
            return null;
        }
        int var44 = var36;
        int var45 = arg2.method74();
        if (arg8) {
            if (arg9 > 1664 || arg9 < 384) {
                var41 -= 128;
            }
            if (arg9 > 128 && arg9 < 896) {
                var37 -= 128;
            }
            if (arg9 > 640 && arg9 < 1408) {
                var44 = var36 + 128;
            }
            if (arg9 > 1152 && arg9 < 1920) {
                var38 = var36 + 128;
            }
        }
        if (var37 > var39) {
            var39 = var37;
        }
        if (var40 > var38) {
            var40 = var38;
        }
        if (arg10 != null) {
            int var46 = arg10.field439[arg5];
            var43 = class261.method1769(var46 >> 16, (byte) 89);
            arg5 = var46 & 0xFFFF;
        }
        if (var45 > var44) {
            var45 = var44;
        }
        if (var42 < var41) {
            var42 = var41;
        }
        class9 var47;
        if (var43 == null) {
            var47 = var16.method72(true, true, true);
            var47.method98((var40 - var39) / 2, 128, (var45 - var42) / 2);
            var47.method90((var39 + var40) / 2, 0, (var42 + var45) / 2);
        } else {
            var47 = var16.method72(!var43.method11(arg5, (byte) 73), !var43.method10(arg5, false), true);
            var47.method98((var40 - var39) / 2, 128, (var45 - var42) / 2);
            var47.method90((var39 + var40) / 2, 0, (var42 + var45) / 2);
            var47.method78(var43, arg5);
        }
        if (arg9 != 0) {
            var47.method88(arg9);
        }
        class54 var48 = (class54) var47;
        if (arg0 != class34.method269(class240.field3892, arg7 + var42, arg12 - -var39, 103) || arg0 != class34.method269(class240.field3892, arg7 + var45, arg12 + var40, 103)) {
            for (int var49 = 0; var49 < var48.field831; var49++) {
                var48.field816[var49] += class34.method269(class240.field3892, var48.field855[var49] + arg7, var48.field820[var49] + arg12, 103) - arg0;
            }
            var48.field818 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBLhc;I)Lch;")
    public static final class290 method1949(int arg0, byte arg1, class235 arg2, int arg3) {
        int var4 = -12 / ((arg1 - 7) / 38);
        field4583++;
        return class212.method1440(arg3, arg2, arg0, 41) ? class228.method1517(72) : null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4588++;
        long var8 = class237.method1630(arg0, arg1 + arg2, arg5 + arg7);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x3E79AB) >> 20;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class193 var13 = class69.method501(0, var12);
            if (var13.field3032 == -1) {
                int[] var14 = class211.field3275;
                int var15 = arg6;
                if (var8 > 0L) {
                    var15 = arg3;
                }
                int var16 = (52736 - (arg7 * 512)) * 4 + arg1 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 1) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 3 + 512] = var15;
                        var14[var16 + 1024 + 3] = var15;
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1 + 1536] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 3 + 512] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 1539] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1537] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
            } else if (!class31.method244(arg7, (byte) -67, arg1, arg2, var10, var13, arg5)) {
                return false;
            }
        }
        long var17 = class6.method61(arg0, arg1 + arg2, arg7 - -arg5);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x7D00E) >> 14;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var17 >> 20 & 0x3;
            class193 var22 = class69.method501(arg4 ^ 0xFFFF9634, var20);
            if (var22.field3032 == -1) {
                if (var19 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class211.field3275;
                    int var25 = arg1 * 4 + ((103 - arg7) * 512 * 4) + 24624;
                    if (var21 == 0 || var21 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1 + 1024] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 2 + 1024] = var23;
                        var24[var25 + 1536 + 3] = var23;
                    }
                }
            } else if (!class31.method244(arg7, (byte) -67, arg1, arg2, var21, var22, arg5)) {
                return false;
            }
        }
        if (arg4 != -27084) {
            return false;
        }
        long var26 = class243.method1680(arg0, arg1 + arg2, arg5 + arg7);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x3C15AA) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class193 var30 = class69.method501(0, var29);
            if (var30.field3032 != -1 && !class31.method244(arg7, (byte) -67, arg1, arg2, var28, var30, arg5)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLai;)V")
    public static final void method1951(boolean arg0, class88 arg1) {
        field4581++;
        byte[] var2 = new byte[24];
        if (!arg0) {
            field4585 = null;
        }
        if (class157.field2452 != null) {
            try {
                class157.field2452.method424(0L, 0);
                int var3 = 0;
                class157.field2452.method415(var2, -1);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method669(0, var2, 24, -1);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
    public static final void method1952(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0;
        field4587++;
        int var6 = -1;
        int var7 = -arg0;
        int var8 = 0;
        if (arg2 >= -65) {
            method1952(53, 115, 94, -29, -82);
        }
        int var9 = class219.method1470(class223.field3423, arg0 + arg4, -1, class148.field2338);
        int var10 = class219.method1470(class223.field3423, arg4 - arg0, -1, class148.field2338);
        class166.method1124(true, class154.field2406[arg3], var9, arg1, var10);
        while (var8 < var5) {
            var6 += 2;
            var7 += var6;
            if (var7 > 0) {
                var5--;
                var7 -= var5 << 1;
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                if (var12 >= class90.field1568 && var11 <= class266.field4247) {
                    int var13 = class219.method1470(class223.field3423, arg4 + var8, -1, class148.field2338);
                    int var14 = class219.method1470(class223.field3423, arg4 - var8, -1, class148.field2338);
                    if (var12 <= class266.field4247) {
                        class166.method1124(true, class154.field2406[var12], var13, arg1, var14);
                    }
                    if (class90.field1568 <= var11) {
                        class166.method1124(true, class154.field2406[var11], var13, arg1, var14);
                    }
                }
            }
            var8++;
            int var15 = arg3 - var8;
            int var16 = arg3 + var8;
            if (var16 >= class90.field1568 && var15 <= class266.field4247) {
                int var17 = class219.method1470(class223.field3423, arg4 + var5, -1, class148.field2338);
                int var18 = class219.method1470(class223.field3423, arg4 - var5, -1, class148.field2338);
                if (var16 <= class266.field4247) {
                    class166.method1124(true, class154.field2406[var16], var17, arg1, var18);
                }
                if (var15 >= class90.field1568) {
                    class166.method1124(true, class154.field2406[var15], var17, arg1, var18);
                }
            }
        }
    }
}
