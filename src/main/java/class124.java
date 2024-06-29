import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class124 extends class34 {

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Ldb;")
    public static class39 field1833 = new class39(8);

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static int field1842 = -2;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "Lpk;")
    public static class237 field1841;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "[Lwh;")
    public static class289[] field1839;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
    public static final void method870(byte arg0) {
        int var1 = class44.field776 * 128 - -64;
        ++field1831;
        int var2 = class178.field2607 * 128 - -64;
        int var3 = class268.method1810(class260.field3986, var1, (byte) 118, var2) - class179.field2616;
        if (~class61.field1024 > -101) {
            if (var2 > class209.field3127) {
                class209.field3127 += (-class209.field3127 + var2) * class61.field1024 / 1000 + class86.field1313;
                if (var2 < class209.field3127) {
                    class209.field3127 = var2;
                }
            }
            if (var1 > class90.field1377) {
                class90.field1377 += (-class90.field1377 + var1) * class61.field1024 / 1000 + class86.field1313;
                if (var1 < class90.field1377) {
                    class90.field1377 = var1;
                }
            }
            if (class209.field3127 > var2) {
                class209.field3127 -= (-var2 + class209.field3127) * class61.field1024 / 1000 + class86.field1313;
                if (var2 > class209.field3127) {
                    class209.field3127 = var2;
                }
            }
            if (~var1 > ~class90.field1377) {
                class90.field1377 -= (-var1 + class90.field1377) * class61.field1024 / 1000 + class86.field1313;
                if (~var1 < ~class90.field1377) {
                    class90.field1377 = var1;
                }
            }
            if (var3 > class157.field2292) {
                class157.field2292 += (-class157.field2292 + var3) * class61.field1024 / 1000 + class86.field1313;
                if (var3 < class157.field2292) {
                    class157.field2292 = var3;
                }
            }
            if (class157.field2292 > var3) {
                class157.field2292 -= (-var3 + class157.field2292) * class61.field1024 / 1000 + class86.field1313;
                if (~var3 < ~class157.field2292) {
                    class157.field2292 = var3;
                }
            }
        } else {
            class209.field3127 = class178.field2607 * 128 - -64;
            class90.field1377 = class44.field776 * 128 + 64;
            class157.field2292 = class268.method1810(class260.field3986, class90.field1377, (byte) 118, class209.field3127) - class179.field2616;
        }
        int var4 = class210.field3135 * 128 + 64;
        int var5 = class139.field2006 * 128 - -64;
        int var6 = class268.method1810(class260.field3986, var4, (byte) 118, var5) + -class19.field339;
        int var7 = -class90.field1377 + var4;
        int var8 = -class209.field3127 + var5;
        int var9 = -class157.field2292 + var6;
        int var10 = (int) Math.sqrt((double) (var7 * var7 - -(var8 * var8)));
        int var11 = 6 / ((14 - arg0) / 51);
        int var12 = 2047 & (int) (325.949D * Math.atan2((double) var9, (double) var10));
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        int var13 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 2047;
        int var14 = var13 - class205.field3074;
        if (var12 > class254.field3919) {
            class254.field3919 += class123.field1821 - -((var12 - class254.field3919) * class127.field1866 / 1000);
            if (~var12 > ~class254.field3919) {
                class254.field3919 = var12;
            }
        }
        if (~var12 > ~class254.field3919) {
            class254.field3919 -= (-var12 + class254.field3919) * class127.field1866 / 1000 + class123.field1821;
            if (~class254.field3919 > ~var12) {
                class254.field3919 = var12;
            }
        }
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (~var14 < -1) {
            class205.field3074 += class127.field1866 * var14 / 1000 + class123.field1821;
            class205.field3074 &= 2047;
        }
        if (var14 < 0) {
            class205.field3074 -= -var14 * class127.field1866 / 1000 + class123.field1821;
            class205.field3074 &= 2047;
        }
        int var15 = -class205.field3074 + var13;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (~var15 > -1 && ~var14 < -1 || var15 > 0 && var14 < 0) {
            class205.field3074 = var13;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZJII)Ljava/lang/String;")
    public static final String method871(int arg0, boolean arg1, long arg2, int arg3, int arg4) {
        char var6 = ',';
        ++field1830;
        boolean var7 = false;
        char var8 = '.';
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 < 0L) {
            var7 = true;
            arg2 = -arg2;
        }
        if (arg4 > -88) {
            return null;
        } else {
            if (arg0 == 0) {
                var6 = '.';
                var8 = ',';
            }
            if (arg0 == 2) {
                var8 = 160;
            }
            if (arg3 > 0) {
                for (int var10 = 0; arg3 > var10; ++var10) {
                    int var11 = (int) arg2;
                    arg2 /= 10L;
                    var9.append((char) (-((int) arg2 * 10) + var11 + 48));
                }
                var9.append(var6);
            }
            int var12 = 0;
            while (true) {
                int var13 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (-((int) arg2 * 10) + 48 - -var13));
                if (~arg2 == -1L) {
                    if (var7) {
                        var9.append('-');
                    }
                    return var9.reverse().toString();
                }
                if (arg1) {
                    ++var12;
                    if (var12 % 3 == 0) {
                        var9.append(var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field1836;
        int[][] var3 = super.field618.method91(125, arg1);
        if (super.field618.field211) {
            int[][] var4 = this.method231(arg1, (byte) 102, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class226.field3527; ++var11) {
                var10[var11] = -var5[var11] + 4096;
                var8[var11] = -var6[var11] + 4096;
                var7[var11] = -var9[var11] + 4096;
            }
        }
        int var12 = 58 % ((-54 - arg0) / 44);
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public static void method872(boolean arg0) {
        field1839 = null;
        if (arg0) {
            method874(-82, 98, 64, (byte) -54, 15, true, 50);
        }
        field1841 = null;
        field1833 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (~arg1 == -1) {
            super.field604 = ~arg2.method407(arg0 + 249) == -2;
        }
        if (arg0 == 6) {
            ++field1837;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field1832;
        if (arg0 <= 75) {
            return null;
        } else {
            int[] var3 = super.field610.method228(24856, arg1);
            if (super.field610.field597) {
                int[] var4 = this.method230(arg1, -15337, 0);
                for (int var5 = 0; var5 < class226.field3527; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lgk;I)I")
    public static final int method873(class224 arg0, int arg1) {
        int var2 = arg0.field3478;
        class110 var3 = arg0.method165((byte) -61);
        ++field1835;
        if (arg0.field399 != var3.field1651) {
            if (arg0.field399 != var3.field1636 && ~arg0.field399 != ~var3.field1634 && ~arg0.field399 != ~var3.field1642 && arg0.field399 != var3.field1646) {
                if (arg0.field399 == var3.field1650 || ~arg0.field399 == ~var3.field1658 || arg0.field399 == var3.field1670 || arg0.field399 == var3.field1652) {
                    var2 = arg0.field3477;
                }
            } else {
                var2 = arg0.field3505;
            }
        } else {
            var2 = arg0.field3500;
        }
        return arg1 != 2047 ? -3 : var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIBIZI)V")
    public static final void method874(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        ++field1834;
        if (arg3 < 58) {
            field1838 = -86;
        }
        class61.field1024 = arg4;
        class86.field1313 = arg2;
        class178.field2607 = arg6;
        class179.field2616 = arg0;
        class44.field776 = arg1;
        if (arg5 && class61.field1024 >= 100) {
            class209.field3127 = class178.field2607 * 128 + 64;
            class90.field1377 = class44.field776 * 128 + 64;
            class157.field2292 = class268.method1810(class260.field3986, class90.field1377, (byte) 118, class209.field3127) + -class179.field2616;
        }
        class133.field1954 = 2;
    }
}
