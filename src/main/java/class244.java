import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class244 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lta;")
    public static class197 field3675 = new class197(64);

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Z")
    public static boolean field3681 = false;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[I")
    public static int[] field3683 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
    public static boolean field3682 = false;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Ltk;")
    public static class251 field3677;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 7)
    public static void method1690(int arg0) {
        field3675 = null;
        field3683 = null;
        if (arg0 > 55) {
            field3677 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[Ljava/lang/Object;BI[J)V", line = 22)
    public static final void method1691(int arg0, Object[] arg1, byte arg2, int arg3, long[] arg4) {
        field3671++;
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            long var6 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var6;
            Object var8 = arg1[var5];
            int var9 = arg0;
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if (arg4[var10] < (long) (var10 & 0x1) + var6) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var9];
                    arg4[var9] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var9];
                    arg1[var9++] = var13;
                }
            }
            arg4[arg3] = arg4[var9];
            arg4[var9] = var6;
            arg1[arg3] = arg1[var9];
            arg1[var9] = var8;
            method1691(arg0, arg1, (byte) 76, var9 - 1, arg4);
            method1691(var9 + 1, arg1, (byte) 99, arg3, arg4);
        }
        if (arg2 <= 56) {
            method1692(false, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V", line = 80)
    public static final void method1692(boolean arg0, byte arg1) {
        field3672++;
        if (arg1 != -99) {
            return;
        }
        byte var2;
        byte[][] var3;
        if (class36.field534 && arg0) {
            var2 = 1;
            var3 = class86.field1259;
        } else {
            var3 = class60.field892;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class324.field5049[var5] >> 8) * 64 - class302.field4735;
            int var7 = (class324.field5049[var5] & 0xFF) * 64 - class110.field1744;
            byte[] var8 = var3[var5];
            if (var8 != null) {
                client.method1774(-111);
                class106.method822(var8, class290.field4569 * 8 - 48, var6, (class263.field3940 - 6) * 8, class90.field1309, var7, (byte) 0, arg0);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class324.field5049[var9] >> 8) * 64 - class302.field4735;
            int var11 = (class324.field5049[var9] & 0xFF) * 64 - class110.field1744;
            byte[] var12 = var3[var9];
            if (var12 == null && class290.field4569 < 800) {
                client.method1774(-114);
                for (int var13 = 0; var13 < var2; var13++) {
                    class242.method1674((byte) -127, var13, var11, var10, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Luc;", line = 153)
    public static final class190 method1693(int arg0) {
        field3680++;
        return arg0 == -1 ? class154.field2332 : (class190) null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IC)Z", line = 164)
    public static final boolean method1694(int arg0, char arg1) {
        field3673++;
        if (arg0 <= 119) {
            return true;
        } else {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)Z", line = 179)
    public static final boolean method1695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3678++;
        long var8 = class222.method1585(arg7, arg3 + arg4, arg0 - -arg1);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class101 var13 = class281.method1984(var12, false);
            if (var13.field1526 == -1) {
                int var14 = arg5;
                if (var8 > 0L) {
                    var14 = arg2;
                }
                int[] var15 = class168.field2525;
                int var16 = arg4 * 4 + (52736 - (arg0 * 512)) * 4 + 24624;
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
                        var15[var16 + 515] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536 + 3] = var14;
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
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
            } else if (!class326.method2236(23732, arg4, var13, arg3, arg1, arg0, var10)) {
                return false;
            }
        }
        long var17 = class274.method1910(arg7, arg3 + arg4, arg0 - -arg1);
        if (arg6 != 2) {
            return false;
        }
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3B02F6) >> 20;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var21 = ((int) var17 & 0x7D726) >> 14;
            class101 var22 = class281.method1984(var20, false);
            if (var22.field1526 == -1) {
                if (var21 == 9) {
                    int var23 = 15658734;
                    int[] var24 = class168.field2525;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var25 = (52736 - (arg0 * 512)) * 4 + arg4 * 4 + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 1 + 512] = var23;
                        var24[var25 + 1026] = var23;
                        var24[var25 + 1536 + 3] = var23;
                    }
                }
            } else if (!class326.method2236(23732, arg4, var22, arg3, arg1, arg0, var19)) {
                return false;
            }
        }
        long var26 = class136.method1039(arg7, arg3 + arg4, arg0 + arg1);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class101 var30 = class281.method1984(var29, false);
            if (var30.field1526 != -1 && !class326.method2236(23732, arg4, var30, arg3, arg1, arg0, var28)) {
                return false;
            }
        }
        return true;
    }
}
