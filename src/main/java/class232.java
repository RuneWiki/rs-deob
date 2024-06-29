import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class232 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Z")
    public boolean field3587 = false;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lec;")
    public static class40 field3593;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
    public static final void method1575(int arg0, int arg1) {
        class201 var2 = class3.field40[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class201 var4 = class3.field40[var3][arg0][arg1] = class3.field40[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3018--;
                for (int var5 = 0; var5 < var4.field3026; var5++) {
                    class128 var6 = var4.field3037[var5];
                    if ((var6.field1880 >> 29 & 0x3L) == 2L && var6.field1882 == arg0 && var6.field1870 == arg1) {
                        var6.field1878--;
                    }
                }
            }
        }
        if (class3.field40[0][arg0][arg1] == null) {
            class3.field40[0][arg0][arg1] = new class201(0, arg0, arg1);
        }
        class3.field40[0][arg0][arg1].field3017 = var2;
        class3.field40[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lca;IIB)V")
    private final void method1576(class54 arg0, int arg1, int arg2, byte arg3) {
        if (arg1 == 1) {
            this.field3590 = arg0.method423(-94);
        } else if (arg1 == 2) {
            this.field3588 = arg0.method408(8);
        } else if (arg1 == 3) {
            this.field3587 = true;
        } else if (arg1 == 4) {
            this.field3590 = -1;
        }
        field3595++;
        int var5 = -3 / ((arg3 - 51) / 34);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZI)Lbk;")
    public final class46 method1577(int arg0, boolean arg1, int arg2) {
        field3594++;
        class46 var4 = (class46) class181.field2629.method945((long) ((arg1 ? 262144 : 0) | this.field3590 | arg2 << 16), true);
        if (var4 != null) {
            return var4;
        }
        class24.field390.method1629(this.field3590, 0);
        class46 var5 = class273.method1827(class24.field390, this.field3590, (byte) 126, 0);
        if (var5 != null) {
            var5.method370(class51.field839, class69.field1148, class177.field2595);
            var5.field3549 = var5.field3546;
            var5.field3537 = var5.field3545;
            if (arg1) {
                var5.method365();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method360();
            }
            class181.field2629.method941(var5, (long) (this.field3590 | arg2 << 16 | (arg1 ? 262144 : 0)), -8447);
        }
        if (arg0 < 73) {
            this.field3590 = -37;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method1578(int arg0) {
        field3593 = null;
        if (arg0 != 15789) {
            field3593 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIILbg;IJZ)Z")
    public static final boolean method1579(int arg0, int arg1, int arg2, int arg3, int arg4, class264 arg5, int arg6, long arg7, boolean arg8) {
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
        return class29.method204(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIII)V")
    public static final void method1580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3591++;
        int var9 = arg3 + 1;
        class222.method1519((byte) -117, arg5, class241.field3751[arg3], arg4, arg1);
        int var8 = arg0 - 1;
        class222.method1519((byte) -111, arg5, class241.field3751[arg0], arg4, arg1);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class241.field3751[var6];
            var7[arg5] = var7[arg4] = arg1;
        }
        if (arg2 != 15887) {
            method1579(-11, -67, 39, -107, 35, (class264) null, -43, 10L, false);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public static final void method1581(int arg0) {
        if (arg0 != 262144) {
            field3593 = null;
        }
        class141.field2030.method940(61);
        field3589++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjk;)Z")
    public static final boolean method1582(int arg0, class297 arg1) {
        field3592++;
        if (arg0 != 4) {
            method1575(3, -29);
        }
        if (arg1.field4653 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field4653.length; var2++) {
            int var3 = class137.method933(var2, arg1, (byte) -71);
            int var4 = arg1.field4665[var2];
            if (arg1.field4653[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field4653[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field4653[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lca;BI)V")
    public final void method1583(class54 arg0, byte arg1, int arg2) {
        if (arg1 >= -84) {
            this.field3588 = -66;
        }
        field3596++;
        while (true) {
            int var4 = arg0.method407(255);
            if (var4 == 0) {
                return;
            }
            this.method1576(arg0, var4, arg2, (byte) 115);
        }
    }
}
