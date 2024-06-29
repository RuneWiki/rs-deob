import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 {

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Ldj;")
    public static class44 field484 = class89.method650(255, "mapscene");

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[S")
    public static short[] field487 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Ldj;")
    public static class44 field481 = class89.method650(255, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "[I")
    public static int[] field488 = new int[2000];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field478 = 0;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field486 = 0;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lne;")
    public static class146 field477;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lnf;BIBIZI)V")
    public static final void method191(class147 arg0, byte arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        field482++;
        long var7 = (long) ((arg6 << 16) + arg2);
        class236 var9 = (class236) class186.field3215.method828(var7, (byte) -40);
        if (var9 != null) {
            return;
        }
        class236 var10 = (class236) class200.field3544.method828(var7, (byte) -40);
        if (var10 != null) {
            return;
        }
        class236 var11 = (class236) class88.field1675.method828(var7, (byte) -40);
        int var12 = -82 % ((arg3 + 48) / 58);
        if (var11 == null) {
            if (!arg5) {
                class236 var13 = (class236) class116.field2072.method828(var7, (byte) -40);
                if (var13 != null) {
                    return;
                }
            }
            class236 var14 = new class236();
            var14.field4382 = arg4;
            var14.field4383 = arg0;
            var14.field4384 = arg1;
            if (arg5) {
                class186.field3215.method830(var14, var7, 1);
                class3.field44++;
            } else {
                class87.field1664.method845(121, var14);
                class88.field1675.method830(var14, var7, 1);
                class54.field991++;
            }
        } else if (arg5) {
            var11.method1288(false);
            class186.field3215.method830(var11, var7, 1);
            class54.field991--;
            class3.field44++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method192(boolean arg0) {
        field488 = null;
        field484 = null;
        field477 = null;
        field487 = null;
        if (!arg0) {
            field481 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)J")
    public static final synchronized long method193(byte arg0) {
        field485++;
        long var1 = System.currentTimeMillis();
        if (arg0 <= 70) {
            method197(true, null);
        }
        if (class84.field1636 > var1) {
            class215.field3921 += class84.field1636 - var1;
        }
        class84.field1636 = var1;
        return class215.field3921 + var1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILvc;)V")
    public static final void method194(int arg0, class223 arg1) {
        if (arg0 != 0) {
            return;
        }
        field483++;
        int var2 = arg1.field4033;
        if (var2 == 324) {
            if (class136.field2429 == -1) {
                class173.field3010 = arg1.field4139;
                class136.field2429 = arg1.field4046;
            }
            if (class76.field1469.field642) {
                arg1.field4046 = class136.field2429;
            } else {
                arg1.field4046 = class173.field3010;
            }
        } else if (var2 == 325) {
            if (class136.field2429 == -1) {
                class136.field2429 = arg1.field4046;
                class173.field3010 = arg1.field4139;
            }
            if (class76.field1469.field642) {
                arg1.field4046 = class173.field3010;
            } else {
                arg1.field4046 = class136.field2429;
            }
        } else if (var2 == 327) {
            arg1.field4036 = 150;
            arg1.field4081 = (int) (Math.sin((double) class46.field868 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4052 = 5;
            arg1.field4050 = -1;
        } else if (var2 == 328) {
            if (class96.field1774.field395 == null) {
                arg1.field4050 = 0;
            } else {
                arg1.field4036 = 150;
                arg1.field4081 = (int) (Math.sin((double) class46.field868 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4052 = 5;
                arg1.field4050 = ((int) class96.field1774.field395.method306(-58) << 11) + 2047;
                arg1.field4105 = class96.field1774.field2264;
                arg1.field4044 = class96.field1774.field2249;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    public static final int method195(int arg0, int arg1, int arg2) {
        field489++;
        int var3 = 52 % ((-arg0 - 45) / 62);
        class93 var4 = (class93) class54.field990.method828((long) arg2, (byte) -40);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var4.field1734.length) {
            return var4.field1734[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)I")
    public static final int method196(int arg0, int arg1, int arg2, int arg3) {
        field491++;
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        return arg2 == -218 ? (arg0 >> 2 << 10) + (arg1 >> 5 << 7) + (arg3 >> 1) : -61;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLld;)V")
    public static final void method197(boolean arg0, class124 arg1) {
        int var2 = arg1.field2198 - class46.field868;
        arg1.field2261 = 0;
        if (arg1.field2208 == 0) {
            arg1.field2211 = 1024;
        }
        field480++;
        if (arg0) {
            field486 = -67;
        }
        if (arg1.field2208 == 1) {
            arg1.field2211 = 1536;
        }
        int var3 = arg1.field2231 * 64 + arg1.field2218 * 128;
        arg1.field2260 += (var3 - arg1.field2260) / var2;
        int var4 = arg1.field2233 * 128 + arg1.field2231 * 64;
        if (arg1.field2208 == 2) {
            arg1.field2211 = 0;
        }
        if (arg1.field2208 == 3) {
            arg1.field2211 = 512;
        }
        arg1.field2195 += (var4 - arg1.field2195) / var2;
    }
}
