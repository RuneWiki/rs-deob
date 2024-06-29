import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class294 {

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[Z")
    public static boolean[] field4666 = new boolean[100];

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
    public static boolean field4671 = false;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lre;")
    public static class266 field4664 = new class266();

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field4672 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "[I")
    public static int[] field4673 = new int[64];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILsb;Lsb;)V")
    public static final void method1971(int arg0, class124 arg1, class124 arg2) {
        field4668++;
        class198.field3231 = class97.method735(arg1, 0, class193.field3168, arg2, -1);
        class223.field3554 = (class30) class198.field3231;
        class106.field1617 = class97.method735(arg1, 0, class212.field3395, arg2, arg0 - 16921);
        class23.field362 = class97.method735(arg1, 0, class157.field2554, arg2, -1);
        if (arg0 != 16920) {
            method1974(-5, -33, 14, 122, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method1972(byte arg0) {
        field4665++;
        if (class52.method434(-1176340616) != 2 || arg0 < 52) {
            return;
        }
        int var1 = class265.field4236 % 104;
        byte var2 = (byte) (class265.field4236 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class229.field3656[var3][var1][var16] = var2;
            }
        }
        if (class92.field1448 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class25.field423[var4] = -1000000;
            class19.field299[var4] = 1000000;
            class266.field4246[var4] = 0;
            class281.field4457[var4] = 1000000;
            class167.field2752[var4] = 0;
        }
        if (class184.field3033 != 1) {
            int var15 = class218.method1450(class148.field2434, class31.field527, true, class92.field1448);
            if ((var15 - class150.field2457) >= 800 || (class43.field790[class92.field1448][class31.field527 >> 7][class148.field2434 >> 7] & 0x4) == 0) {
                return;
            }
            class276.method1866(class148.field2434 >> 7, -125, class26.field455, false, class31.field527 >> 7, 1);
            return;
        }
        if ((class43.field790[class92.field1448][class48.field878.field2849 >> 7][class48.field878.field2887 >> 7] & 0x4) != 0) {
            class276.method1866(class48.field878.field2887 >> 7, -128, class26.field455, false, class48.field878.field2849 >> 7, 0);
        }
        if (class146.field2408 >= 310) {
            return;
        }
        int var5 = class148.field2434 >> 7;
        int var6 = class31.field527 >> 7;
        int var7 = class48.field878.field2849 >> 7;
        int var8 = class48.field878.field2887 >> 7;
        int var9;
        if (var5 >= var8) {
            var9 = var5 - var8;
        } else {
            var9 = var8 - var5;
        }
        int var10;
        if (var7 > var6) {
            var10 = var7 - var6;
        } else {
            var10 = var6 - var7;
        }
        if ((var10 != 0 || var9 != 0) && var10 > -104 && var10 < 104 && var9 > -104 && var9 < 104) {
            if (var9 >= var10) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var8) {
                    if (var5 < var8) {
                        var5++;
                    } else if (var8 < var5) {
                        var5--;
                    }
                    if ((class43.field790[class92.field1448][var6][var5] & 0x4) != 0) {
                        class276.method1866(var5, -125, class26.field455, false, var6, 1);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var6 < var7) {
                            var6++;
                        } else if (var7 < var6) {
                            var6--;
                        }
                        if ((class43.field790[class92.field1448][var6][var5] & 0x4) != 0) {
                            class276.method1866(var5, -127, class26.field455, false, var6, 1);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var7) {
                if (var6 < var7) {
                    var6++;
                } else if (var6 > var7) {
                    var6--;
                }
                if ((class43.field790[class92.field1448][var6][var5] & 0x4) != 0) {
                    class276.method1866(var5, -126, class26.field455, false, var6, 1);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var5 < var8) {
                        var5++;
                    } else if (var5 > var8) {
                        var5--;
                    }
                    var14 -= 65536;
                    if ((class43.field790[class92.field1448][var6][var5] & 0x4) != 0) {
                        class276.method1866(var5, -125, class26.field455, false, var6, 1);
                        return;
                    }
                }
            }
            return;
        }
        class161.method1167((Throwable) null, -127, "RC: " + var6 + "," + var5 + " " + var7 + "," + var8 + " " + class256.field4082 + "," + class170.field2787);
        return;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Ldk;")
    public static final class236 method1973(int arg0, int arg1) {
        field4662++;
        class236 var2 = (class236) class184.field3031.method1155((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field3196.method900(4, arg1, false);
        class236 var4 = new class236();
        if (var3 != null) {
            var4.method1564(arg1, new class136(var3), -1);
        }
        if (arg0 == -1000000) {
            class184.field3031.method1161(var4, (byte) -118, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIB)V")
    public static final void method1974(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4667++;
        if ((arg2 - arg0) >= class32.field540 && class61.field1034 >= (arg2 + arg0) && class108.field1650 <= arg1 - arg0 && class154.field2509 >= arg0 + arg1) {
            class163.method1178((byte) -50, arg3, arg0, arg1, arg2);
        } else {
            class285.method1909(arg3, arg1, arg0, -1, arg2);
        }
        if (arg4 != 112) {
            field4664 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lne;I)V")
    public static final void method1975(class78 arg0, int arg1) {
        class220.field3520 = 3;
        class39 var2 = null;
        field4663++;
        class80.method643(true, (byte) -124);
        class153.field2495 = true;
        class37.field626 = 0;
        class179.field2991 = true;
        class80.field1324 = true;
        class132.field2209 = true;
        class230.field3660 = true;
        class104.field1595 = true;
        class111.field1719 = 127;
        class153.field2496 = true;
        class255.field4071 = 0;
        class151.field2470 = true;
        class89.field1425 = true;
        class112.field1731 = true;
        class77.field1287 = 127;
        class134.field2221 = 0;
        class150.field2463 = true;
        class112.field1735 = 2;
        class163.field2643 = 0;
        class274.field4382 = 255;
        if (class269.field4324 < 96) {
            class98.method742(0);
        } else {
            class98.method742(2);
        }
        class282.field4476 = 0;
        class234.field3710 = false;
        class137.field2308 = true;
        class256.field4075 = false;
        class171.field2825 = false;
        class14.field198 = 0;
        class179.field2990 = 0;
        try {
            class115 var3 = arg0.method635((byte) 126, "runescape");
            while (var3.field1937 == 0) {
                class234.method1550(-28773, 1L);
            }
            if (var3.field1937 == 1) {
                var2 = (class39) var3.field1936;
                byte[] var4 = new byte[(int) var2.method323((byte) 48)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method324(var5, (byte) -86, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class82.method664(11, new class136(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 > 63 && var2 != null) {
                var2.method325((byte) -96);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method1976(int arg0) {
        if (arg0 != 1) {
            field4673 = null;
        }
        field4664 = null;
        field4673 = null;
        field4666 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
    public static final void method1977(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class274.field4382 * arg3 >> 8;
        field4670++;
        if (arg2 != 905962088) {
            method1975((class78) null, -121);
        }
        if (var4 != 0 && arg0 != -1) {
            class31.method269(class94.field1471, 0, var4, arg0, 0, false);
            class178.field2968 = true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JB)V")
    public static final void method1978(long arg0, byte arg1) {
        if (arg1 < 45) {
            field4672 = -117;
        }
        field4669++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class45.field820; var3++) {
            if (class159.field2570[var3] == arg0) {
                class45.field820--;
                for (int var4 = var3; var4 < class45.field820; var4++) {
                    class35.field603[var4] = class35.field603[var4 + 1];
                    class200.field3263[var4] = class200.field3263[var4 + 1];
                    class248.field3932[var4] = class248.field3932[var4 + 1];
                    class159.field2570[var4] = class159.field2570[var4 + 1];
                    class277.field4401[var4] = class277.field4401[var4 + 1];
                    class297.field4703[var4] = class297.field4703[var4 + 1];
                }
                class204.field3288 = class61.field1040;
                class131.field2182++;
                class87.field1405.method607(46, (byte) 78);
                class87.field1405.method967((byte) -8, arg0);
                return;
            }
        }
    }
}
