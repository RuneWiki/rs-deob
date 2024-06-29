import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class286 extends class287 {

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "J")
    public long field4419;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "[Lvl;")
    public static class6[] field4418 = new class6[2048];

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field4417 = 0;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "S")
    public static short field4420 = 1;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Lod;")
    public static class223 field4421 = new class223(64);

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "Lug;")
    public static class253 field4425;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "[Lgj;")
    public static class290[] field4423;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 5)
    public static void method2019(int arg0) {
        field4418 = null;
        field4423 = null;
        field4425 = null;
        if (arg0 < 124) {
            method2020(-127, false, -67);
        }
        field4421 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZI)V", line = 21)
    public static final void method2020(int arg0, boolean arg1, int arg2) {
        class45.field604 = (float) arg0;
        class6.field114 = (float) arg2;
        if (class166.field2715 == 2) {
            class293.field4536 = arg2;
            class185.field2999 = arg0;
        }
        class245.method1753(arg1);
        class281.field4320 = true;
        field4426++;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V", line = 49)
    public class286() {
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I", line = 54)
    public static final int method2021(int arg0, int arg1) {
        field4422++;
        if (arg1 < 0) {
            return 0;
        }
        class111 var2 = (class111) class267.field4161.method2168((long) arg1, (byte) -83);
        if (var2 == null) {
            return class135.method988(arg0 - 20887, arg1).field5172;
        }
        int var3 = 0;
        for (int var4 = arg0; var4 < var2.field1547.length; var4++) {
            if (var2.field1547[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class135.method988(-20887, arg1).field5172 - var2.field1547.length);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(J)V", line = 90)
    public class286(long arg0) {
        this.field4419 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Z", line = 99)
    public static final boolean method2022(byte arg0, int arg1) {
        if (arg0 != -33) {
            method2020(124, true, -5);
        }
        field4424++;
        if (class34.field505[arg1]) {
            return true;
        } else if (class57.field795.method1829(arg1, 0)) {
            int var2 = class57.field795.method1826(0, arg1);
            if (var2 == 0) {
                class34.field505[arg1] = true;
                return true;
            }
            if (class269.field4182[arg1] == null) {
                class269.field4182[arg1] = new class136[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class269.field4182[arg1][var3] == null) {
                    byte[] var4 = class57.field795.method1813(var3, arg1, true);
                    if (var4 != null) {
                        class136 var5 = class269.field4182[arg1][var3] = new class136();
                        var5.field2069 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method993(-116, new class6(var4));
                        } else {
                            var5.method994(new class6(var4), (byte) -113);
                        }
                    }
                }
            }
            class34.field505[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IS)Z", line = 159)
    public static final boolean method2023(int arg0, short arg1) {
        field4416++;
        if (arg1 == 28 || arg1 == 20 || arg1 == 24 || arg1 == 1 || arg1 == 43 || arg1 == 17 || arg1 == 50 || arg1 == 33) {
            return true;
        } else if (arg1 == 18 || arg1 == 39 || arg1 == 1002 || arg1 == 1006) {
            return true;
        } else if (arg1 == 58 || arg1 == 51 || arg1 == 46 || arg1 == 3 || arg1 == 26) {
            return true;
        } else if (arg1 == 31 || arg1 == 12 || arg1 == 42 || arg1 == 14 || arg1 == 13 || arg1 == 59) {
            return true;
        } else {
            if (arg0 >= -66) {
                method2024(63, false, (class136) null, false, 17);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZLcd;ZI)V", line = 195)
    public static final void method2024(int arg0, boolean arg1, class136 arg2, boolean arg3, int arg4) {
        int var5 = arg2.field2137;
        field4415++;
        if (arg2.field2150 == 0) {
            arg2.field2137 = arg2.field2048;
        } else if (arg2.field2150 == 1) {
            arg2.field2137 = arg4 - arg2.field2048;
        } else if (arg2.field2150 == 2) {
            arg2.field2137 = arg2.field2048 * arg4 >> 14;
        } else if (arg2.field2150 == 3) {
            if (arg2.field2063 == 2) {
                arg2.field2137 = arg2.field2048 * 32 + ((arg2.field2048 - 1) * arg2.field2074);
            } else if (arg2.field2063 == 7) {
                arg2.field2137 = arg2.field2048 * 115 + ((arg2.field2048 - 1) * arg2.field2074);
            }
        }
        int var6 = arg2.field2078;
        if (arg2.field2143 == 0) {
            arg2.field2078 = arg2.field2104;
        } else if (arg2.field2143 == 1) {
            arg2.field2078 = arg0 - arg2.field2104;
        } else if (arg2.field2143 == 2) {
            arg2.field2078 = arg2.field2104 * arg0 >> 14;
        } else if (arg2.field2143 == 3) {
            if (arg2.field2063 == 2) {
                arg2.field2078 = arg2.field2104 * 32 + ((arg2.field2104 - 1) * arg2.field2071);
            } else if (arg2.field2063 == 7) {
                arg2.field2078 = (arg2.field2104 - 1) * arg2.field2071 + arg2.field2104 * 12;
            }
        }
        if (arg2.field2150 == 4) {
            arg2.field2137 = arg2.field2118 * arg2.field2078 / arg2.field2122;
        }
        if (arg2.field2143 == 4) {
            arg2.field2078 = arg2.field2137 * arg2.field2122 / arg2.field2118;
        }
        if (class290.field4478 && (client.method953(arg2).field1843 != 0 || arg2.field2063 == 0)) {
            if (arg2.field2078 < 5 && arg2.field2137 < 5) {
                arg2.field2078 = 5;
                arg2.field2137 = 5;
            } else {
                if (arg2.field2137 <= 0) {
                    arg2.field2137 = 5;
                }
                if (arg2.field2078 <= 0) {
                    arg2.field2078 = 5;
                }
            }
        }
        if (arg2.field2038 == 1337) {
            class30.field450 = arg2;
        }
        if (arg1 && arg2.field2165 != null && (arg2.field2137 != var5 || arg2.field2078 != var6)) {
            class15 var7 = new class15();
            var7.field243 = arg2.field2165;
            var7.field248 = arg2;
            class77.field1037.method19(var7, -1058);
        }
        if (!arg3) {
            method2021(78, -33);
        }
    }
}
