import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class78 extends class516 {

    @OriginalMember(owner = "client!qv", name = "fb", descriptor = "I")
    public int field873 = -1;

    @OriginalMember(owner = "client!qv", name = "cb", descriptor = "Z")
    private boolean field870 = false;

    @OriginalMember(owner = "client!qv", name = "ob", descriptor = "I")
    public int field882 = -1;

    @OriginalMember(owner = "client!qv", name = "mb", descriptor = "I")
    private int field880 = 0;

    @OriginalMember(owner = "client!qv", name = "Y", descriptor = "I")
    public int field866 = 0;

    @OriginalMember(owner = "client!qv", name = "W", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!qv", name = "X", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!qv", name = "Z", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!qv", name = "ab", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!qv", name = "bb", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!qv", name = "db", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qv", name = "eb", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!qv", name = "gb", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!qv", name = "hb", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!qv", name = "ib", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!qv", name = "jb", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!qv", name = "lb", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!qv", name = "nb", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!qv", name = "pb", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!qv", name = "qb", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!qv", name = "kb", descriptor = "Lda;")
    public static class442 field878;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = 101 % ((69 - arg0) / 48);
        ++field867;
        return this.field880;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
    public static void method563(byte arg0) {
        if (arg0 >= -19) {
            field874 = -13;
        }
        field878 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        ++field865;
        class12 var5 = arg1.method153();
        var5.method50(super.field3470, super.field3464 + -10, super.field3460);
        if (arg2 != -31634) {
            this.method89(42);
        }
        class581 var6 = class35.field367.method3051((byte) -20, this.field877);
        class231 var7 = var6.method3419(0, this.field879, -106, 0, arg1, 131072, -1, (class73) null, (class247) null);
        if (var7 != null && (class529.field7284 ? var7.method1570(arg0, arg3, var5, true, var6.field8234, class775.field10662) : var7.method1578(arg0, arg3, var5, true, var6.field8234))) {
            return true;
        } else {
            if (~this.field882 != 0) {
                class581 var8 = class35.field367.method3051((byte) -20, this.field882);
                class231 var9 = var8.method3419(0, this.field875, arg2 ^ 31737, 0, arg1, 131072, -1, (class73) null, (class247) null);
                if (var9 != null && (class529.field7284 ? var9.method1570(arg0, arg3, var5, true, var8.field8234, class775.field10662) : var9.method1578(arg0, arg3, var5, true, var8.field8234))) {
                    return true;
                }
            }
            if (~this.field873 != 0) {
                class581 var10 = class35.field367.method3051((byte) -20, this.field873);
                class231 var11 = var10.method3419(0, this.field876, -118, 0, arg1, 131072, -1, (class73) null, (class247) null);
                if (var11 != null && (!class529.field7284 ? var11.method1578(arg0, arg3, var5, true, var10.field8234) : var11.method1570(arg0, arg3, var5, true, var10.field8234, class775.field10662))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(Lha;I)Ltja;")
    public final class491 method72(class473 arg0, int arg1) {
        if (arg1 != -5047) {
            this.field873 = 62;
        }
        ++field869;
        return null;
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(B)I")
    public final int method564(byte arg0) {
        if (arg0 > -46) {
            this.field866 = 47;
        }
        ++field871;
        class581 var2 = class35.field367.method3051((byte) -20, this.field877);
        int var3 = var2.field8234;
        if (this.field882 != -1) {
            class581 var4 = class35.field367.method3051((byte) -20, this.field882);
            if (~var3 > ~var4.field8234) {
                var3 = var4.field8234;
            }
        }
        if (this.field873 != -1) {
            class581 var5 = class35.field367.method3051((byte) -20, this.field873);
            if (~var3 > ~var5.field8234) {
                var3 = var5.field8234;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(Lha;I)V")
    public final void method76(class473 arg0, int arg1) {
        int var3 = 15 / ((-30 - arg1) / 42);
        ++field883;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(II)I")
    public static final int method565(int arg0, int arg1) {
        ++field872;
        if (arg1 <= 78) {
            field874 = 66;
        }
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + -61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILha;)Lrk;")
    public final class289 method74(int arg0, class473 arg1) {
        ++field864;
        class44 var3 = class450.method2720(super.field3467, super.field3470 >> class732.field10110, super.field3460 >> class732.field10110);
        class727 var4 = class349.method2197(super.field3467, super.field3470 >> class732.field10110, super.field3460 >> class732.field10110);
        int var5 = 0;
        if (var3 != null && var3.field465.field3749) {
            var5 = var3.field465.method78((byte) -97);
        }
        if (var4 != null && var4.field10059 > -var5) {
            var5 = -var4.field10059;
        }
        if (~this.field866 != ~var5) {
            super.field3464 -= this.field866;
            this.field866 = var5;
            super.field3464 += var5;
        }
        class12 var6 = arg1.method153();
        var6.method42();
        if (this.field866 == 0) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class418 var10 = class661.field9303[super.field3469];
            int var11 = this.field880 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method2529(super.field3460 + var14, super.field3470 + var13, (byte) -128);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method2529(super.field3460 + var17, super.field3470 + var16, (byte) -128);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method2529(super.field3460 + var20, super.field3470 + var19, (byte) -128);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method2529(super.field3460 - -var23, super.field3470 - -var22, (byte) -128);
            int var25 = var15 < var18 ? var15 : var18;
            int var26 = ~var24 < ~var21 ? var21 : var24;
            int var27 = ~var24 < ~var18 ? var18 : var24;
            int var28 = var15 < var21 ? var15 : var21;
            if (~var11 != -1) {
                int var29 = (int) (Math.atan2((double) (-var26 + var25), (double) var11) * 2607.5945876176133D) & 16383;
                if (var29 != 0) {
                    var6.method52(var29);
                }
            }
            int var30 = var15 - -var24;
            if (var11 != 0) {
                int var31 = 16383 & (int) (Math.atan2((double) (-var27 + var28), (double) var11) * 2607.5945876176133D);
                if (~var31 != -1) {
                    var6.method45(-var31);
                }
            }
            if (var30 > var18 + var21) {
                var30 = var18 + var21;
            }
            int var32 = (var30 >> 1) - super.field3464;
            if (var32 != 0) {
                var6.method47(0, var32, 0);
            }
        }
        var6.method47(super.field3470, super.field3464 + -10, super.field3460);
        if (arg0 <= 75) {
            return null;
        } else {
            class289 var33 = class122.method863(3, (byte) 105, true);
            this.field880 = 0;
            this.field870 = false;
            if (~this.field873 != 0) {
                class231 var34 = class35.field367.method3051((byte) -20, this.field873).method3419(0, this.field876, -94, 0, arg1, 2048, -1, (class73) null, (class247) null);
                if (var34 != null) {
                    if (!class529.field7284) {
                        var34.method1586(var6, var33.field4255[2], 0);
                    } else {
                        var34.method1580(var6, var33.field4255[2], class775.field10662, 0);
                    }
                    this.field870 |= var34.method1575();
                    this.field880 = var34.method1539();
                }
            }
            if (this.field882 != -1) {
                class231 var35 = class35.field367.method3051((byte) -20, this.field882).method3419(0, this.field875, -102, 0, arg1, 2048, -1, (class73) null, (class247) null);
                if (var35 != null) {
                    if (!class529.field7284) {
                        var35.method1586(var6, var33.field4255[1], 0);
                    } else {
                        var35.method1580(var6, var33.field4255[1], class775.field10662, 0);
                    }
                    this.field870 |= var35.method1575();
                    if (~var35.method1539() < ~this.field880) {
                        this.field880 = var35.method1539();
                    }
                }
            }
            class231 var36 = class35.field367.method3051((byte) -20, this.field877).method3419(0, this.field879, -113, 0, arg1, 2048, -1, (class73) null, (class247) null);
            if (var36 != null) {
                if (class529.field7284) {
                    var36.method1580(var6, var33.field4255[0], class775.field10662, 0);
                } else {
                    var36.method1586(var6, var33.field4255[0], 0);
                }
                this.field870 |= var36.method1575();
                if (~var36.method1539() < ~this.field880) {
                    this.field880 = var36.method1539();
                }
            }
            return var33;
        }
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)I")
    public final int method78(byte arg0) {
        ++field881;
        if (arg0 >= -31) {
            this.method89(-118);
        }
        return -10;
    }

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field868;
        if (arg0 != 25833) {
            method565(-94, -103);
        }
        return false;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIII)V")
    public class78(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)Z")
    public final boolean method80(int arg0) {
        ++field884;
        return arg0 < 63 ? false : this.field870;
    }
}
