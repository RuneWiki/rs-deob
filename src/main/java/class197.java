import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class197 extends class137 {

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "[I")
    public int[] field3549 = new int[1];

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "[I")
    public int[] field3557 = new int[] { -1 };

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "Lhh;")
    public static class163 field3546 = class137.method1065(" weitere Optionen", 17);

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "[[S")
    public static short[][] field3550 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field3553 = 0;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "[I")
    public static int[] field3552 = new int[4096];

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "F")
    public static float field3556;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
    public static final void method1418(byte arg0) {
        int var1 = class235.field4201 * 128 + 64;
        field3554++;
        if (arg0 != -43) {
            field3556 = 0.71211165F;
        }
        int var2 = class49.field819 * 128 + 64;
        int var3 = class127.method1011(var1, var2, class20.field323, arg0 + 29951) - class50.field853;
        if (class181.field3321 >= 100) {
            class123.field2367 = class49.field819 * 128 + 64;
            class88.field1636 = class235.field4201 * 128 + 64;
            class191.field3490 = class127.method1011(class88.field1636, class123.field2367, class20.field323, 29908) - class50.field853;
        } else {
            if (class88.field1636 < var1) {
                class88.field1636 += (var1 - class88.field1636) * class181.field3321 / 1000 + class262.field4566;
                if (class88.field1636 > var1) {
                    class88.field1636 = var1;
                }
            }
            if (var2 > class123.field2367) {
                class123.field2367 += class262.field4566 + ((var2 - class123.field2367) * class181.field3321 / 1000);
                if (var2 < class123.field2367) {
                    class123.field2367 = var2;
                }
            }
            if (class191.field3490 < var3) {
                class191.field3490 += (var3 - class191.field3490) * class181.field3321 / 1000 + class262.field4566;
                if (var3 < class191.field3490) {
                    class191.field3490 = var3;
                }
            }
            if (var3 < class191.field3490) {
                class191.field3490 -= class262.field4566 + ((class191.field3490 - var3) * class181.field3321 / 1000);
                if (class191.field3490 < var3) {
                    class191.field3490 = var3;
                }
            }
            if (class88.field1636 > var1) {
                class88.field1636 -= (class88.field1636 - var1) * class181.field3321 / 1000 + class262.field4566;
                if (var1 > class88.field1636) {
                    class88.field1636 = var1;
                }
            }
            if (var2 < class123.field2367) {
                class123.field2367 -= (class123.field2367 - var2) * class181.field3321 / 1000 + class262.field4566;
                if (class123.field2367 < var2) {
                    class123.field2367 = var2;
                }
            }
        }
        int var4 = class10.field162 * 128 + 64;
        int var5 = class262.field4581 * 128 + 64;
        int var6 = class127.method1011(var4, var5, class20.field323, 29908) - class219.field3983;
        int var7 = var5 - class123.field2367;
        int var8 = var4 - class88.field1636;
        int var9 = var6 - class191.field3490;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class63.field1072;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var13 > 0) {
            class63.field1072 += class46.field772 * var13 / 1000 + class49.field829;
            class63.field1072 &= 0x7FF;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < 0) {
            class63.field1072 -= class49.field829 + (-var13 * class46.field772 / 1000);
            class63.field1072 &= 0x7FF;
        }
        int var14 = var12 - class63.field1072;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var11 > class13.field201) {
            class13.field201 += class49.field829 + ((var11 - class13.field201) * class46.field772 / 1000);
            if (var11 < class13.field201) {
                class13.field201 = var11;
            }
        }
        if (var11 < class13.field201) {
            class13.field201 -= (class13.field201 - var11) * class46.field772 / 1000 + class49.field829;
            if (class13.field201 < var11) {
                class13.field201 = var11;
            }
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class63.field1072 = var12;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static final void method1419(int arg0) {
        field3559++;
        if (arg0 != -1024) {
            method1425((byte) -16);
        }
        if (class262.field4583 == 30) {
            class174.method1292(25, true);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1420(int arg0, int arg1, byte arg2) {
        if (arg2 > -78) {
            return false;
        } else {
            field3551++;
            return (arg0 >> arg1 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
    public static void method1421(byte arg0) {
        field3546 = null;
        if (arg0 != 109) {
            field3546 = null;
        }
        field3552 = null;
        field3550 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Z")
    public static final boolean method1422(int arg0, int arg1) {
        field3547++;
        int var2 = 78 % ((-arg1 - 55) / 53);
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V")
    public static final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3548++;
        class201.field3611 = class58.field952 * arg0 / arg2;
        class27.field419 = arg4;
        class175.field3192 = -1;
        class169.field3086 = class124.field2395 * arg1 / arg3;
        class227.method1583((byte) 59);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
    public static final void method1424(byte arg0) {
        if (arg0 == 86) {
            field3558++;
            class219.field3978.method120((byte) -116);
        }
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)V")
    public static final void method1425(byte arg0) {
        if (class59.field973 != null) {
            class59.field973.method423((byte) -30);
        }
        if (class253.field4431 != null) {
            class253.field4431.method423((byte) -30);
        }
        field3555++;
        class262.method1770(2, class244.field4306, true, 22050);
        class59.field973 = class50.method354(0, class202.field3675, (byte) 94, class169.field3090, 22050);
        class59.field973.method434(class215.field3916, 0);
        class253.field4431 = class50.method354(1, class202.field3675, (byte) 77, class169.field3090, 2048);
        class253.field4431.method434(class225.field4085, 0);
        if (arg0 < 52) {
            method1421((byte) -64);
        }
    }
}
