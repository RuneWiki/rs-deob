import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class236 {

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3543 = 500;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3546 = "Loading world list data";

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lth;")
    public static class57 field3545 = new class57(64);

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3550 = " ";

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
    public static int[] field3551 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[Z")
    public static boolean[] field3549 = new boolean[112];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3548;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3540++;
        int var6 = arg1 - arg0;
        int var7 = arg5 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class310.method2179(arg0, 115, arg2, arg5, arg3);
            }
        } else if (var7 == 0) {
            class221.method1614(arg2, -1, arg0, arg3, arg1);
        } else {
            if (~var6 > arg4) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg1;
                arg0 = arg3;
                arg1 = arg5;
                arg5 = var10;
                arg3 = var9;
            }
            if (arg0 > arg1) {
                int var11 = arg0;
                arg0 = arg1;
                arg1 = var11;
                int var12 = arg3;
                arg3 = arg5;
                arg5 = var12;
            }
            int var13 = arg1 - arg0;
            int var14 = arg5 - arg3;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var15 = -(var13 >> 1);
            int var16 = arg3 >= arg5 ? -1 : 1;
            int var17 = arg3;
            if (var8) {
                for (int var18 = arg0; var18 <= arg1; var18++) {
                    var15 += var14;
                    class274.field4158[var18][var17] = arg2;
                    if (var15 > 0) {
                        var15 -= var13;
                        var17 += var16;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg1; var19++) {
                    var15 += var14;
                    class274.field4158[var17][var19] = arg2;
                    if (var15 > 0) {
                        var17 += var16;
                        var15 -= var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 130)
    public static final void method1757(int arg0, int arg1) {
        if (arg0 != 100) {
            return;
        }
        field3538++;
        class362.field5742 = -1;
        class362.field5742 = -1;
        if (arg1 == 37) {
            class105.field1504 = 3.0F;
        } else if (arg1 == 50) {
            class105.field1504 = 4.0F;
        } else if (arg1 == 75) {
            class105.field1504 = 6.0F;
        } else if (arg1 == 100) {
            class105.field1504 = 8.0F;
        } else if (arg1 == 200) {
            class105.field1504 = 16.0F;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I", line = 162)
    public static final int method1758(int arg0) {
        if (arg0 != 0) {
            method1761(43);
        }
        field3547++;
        return class146.field2099;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIII)Z", line = 174)
    public static final boolean method1759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3541++;
        long var8 = class62.method503(arg5, arg6 + arg2, arg0 + arg3);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class261 var13 = class30.method212(0, var12);
            if (var13.field3931 == -1) {
                int[] var14 = class44.field624;
                int var15 = arg1;
                if (var8 > 0L) {
                    var15 = arg4;
                }
                int var16 = arg6 * 4 + (52736 - arg0 * 512) * 4 + 24624;
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
                        var14[var16 + 515] = var15;
                        var14[var16 + 1027] = var15;
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
                        var14[var16 + 1536 + 3] = var15;
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
                        var14[var16 + 515] = var15;
                        var14[var16 + 1027] = var15;
                        var14[var16 + 1539] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1537] = var15;
                        var14[var16 + 2 + 1536] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
            } else if (!class292.method2097(var10, arg2, arg6, arg3, var13, arg0, 26354)) {
                return false;
            }
        }
        if (arg7 != 292) {
            return false;
        }
        long var17 = class85.method693(arg5, arg2 + arg6, arg0 + arg3);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = ((int) var17 & 0x7C330) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class261 var22 = class30.method212(arg7 ^ 0x124, var21);
            if (var22.field3931 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    int var24 = arg6 * 4 + ((-arg0 + 103) * 2048) + 24624;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var25 = class44.field624;
                    if (var19 == 0 || var19 == 2) {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1025] = var23;
                        var25[var24 + 2 + 512] = var23;
                        var25[var24 + 3] = var23;
                    } else {
                        var25[var24] = var23;
                        var25[var24 + 513] = var23;
                        var25[var24 + 2 + 1024] = var23;
                        var25[var24 + 1539] = var23;
                    }
                }
            } else if (!class292.method2097(var19, arg2, arg6, arg3, var22, arg0, 26354)) {
                return false;
            }
        }
        long var26 = class313.method2191(arg5, arg6 + arg2, arg0 + arg3);
        if (var26 != 0L) {
            int var28 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            int var29 = (int) var26 >> 20 & 0x3;
            class261 var30 = class30.method212(arg7 - 292, var28);
            if (var30.field3931 != -1 && !class292.method2097(var29, arg2, arg6, arg3, var30, arg0, 26354)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lph;Lph;Lhf;Lph;B)Z", line = 385)
    public static final boolean method1760(class361 arg0, class361 arg1, class330 arg2, class361 arg3, byte arg4) {
        if (arg4 >= -86) {
            return false;
        }
        class256.field3833 = arg2;
        class266.field4060 = arg3;
        class130.field1881 = arg1;
        class237.field3552 = arg0;
        field3542++;
        return true;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 404)
    public static void method1761(int arg0) {
        field3545 = null;
        field3546 = null;
        field3548 = null;
        field3549 = null;
        if (arg0 == -1027) {
            field3550 = null;
            field3551 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)Lgi;", line = 420)
    public static final class287 method1762(int arg0) {
        field3544++;
        if (class105.field1505 == null) {
            return null;
        }
        for (class287 var1 = (class287) class40.field578.method2079(true); var1 != null; var1 = (class287) class40.field578.method2079(true)) {
            class200 var2 = class349.method2447(var1.field4350, (byte) -9);
            if (var2 != null && var2.field2935 && var2.method1455(arg0 ^ 0xFFFFD85B)) {
                return var1;
            }
        }
        if (arg0 != -10201) {
            field3549 = (boolean[]) null;
        }
        return null;
    }
}
