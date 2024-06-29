import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class110 extends class97 {

    @OriginalMember(owner = "client!s", name = "U", descriptor = "Lke;")
    public static class65 field2716 = class1.method17(":  ", -124);

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Lke;")
    public static class65 field2719 = class1.method17("(Z", -114);

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public static int field2725 = 0;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "Lie;")
    public static class53 field2720 = new class53();

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Lke;")
    public static class65 field2727 = class1.method17("(U4", -127);

    @OriginalMember(owner = "client!s", name = "S", descriptor = "B")
    public byte field2714;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "Lta;")
    public class112 field2715;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "[I")
    public static int[] field2726;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Z", line = 3)
    public static final boolean method900(int arg0, int arg1) {
        field2713++;
        if (arg1 < 32) {
            return false;
        } else if (arg0 == arg1) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)Lke;", line = 29)
    public static final class65 method901(int arg0, int arg1) {
        field2723++;
        class65 var2 = class39.method320(arg0, (byte) -36);
        if (arg1 <= 83) {
            return null;
        }
        for (int var3 = var2.method528(113) - 3; var3 > 0; var3 -= 3) {
            var2 = class21.method172(-113, new class65[] { var2.method555(0, var3, (byte) -78), class44.field1157, var2.method539(-27693, var3) });
        }
        if (var2.method528(107) > 8) {
            var2 = class21.method172(-100, new class65[] { class48.field1261, var2.method555(0, var2.method528(118) - 8, (byte) -78), class70.field1819, class13.field289, var2, class44.field1170 });
        } else if (var2.method528(110) > 4) {
            var2 = class21.method172(-71, new class65[] { class117.field2935, var2.method555(0, var2.method528(123) - 4, (byte) -78), class54.field1384, class13.field289, var2, class44.field1170 });
        }
        return class21.method172(-100, new class65[] { class111.field2756, var2 });
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[BI)I", line = 63)
    public static final int method902(int arg0, int arg1, byte[] arg2, int arg3) {
        field2721++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = class17.field358[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = -11 / ((arg3 - 7) / 39);
        return ~var4;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(II)Lec;", line = 98)
    public static final class27 method903(int arg0, int arg1) {
        field2717++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 >= -78) {
            return null;
        }
        if (class88.field2361[var2] == null || class88.field2361[var2][var3] == null) {
            boolean var4 = class28.method232(var2, true);
            if (!var4) {
                return null;
            }
        }
        return class88.field2361[var2][var3];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V", line = 133)
    public static void method904(boolean arg0) {
        field2720 = null;
        field2716 = null;
        if (arg0) {
            field2716 = null;
        }
        field2727 = null;
        field2719 = null;
        field2726 = null;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)I", line = 152)
    public static final int method905(int arg0) {
        field2712++;
        int var1 = 3;
        if (class76.field2038 < 310) {
            int var2 = class102.field2642 >> 7;
            int var3 = class51.field1293 >> 7;
            int var4 = class32.field833.field1067 >> 7;
            int var5 = class32.field833.field1070 >> 7;
            if ((class114.field2852[class19.field462][var2][var3] & 0x4) != 0) {
                var1 = class19.field462;
            }
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            int var7;
            if (var5 <= var3) {
                var7 = var3 - var5;
            } else {
                var7 = var5 - var3;
            }
            if (var6 <= var7) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var5) {
                    var9 += var8;
                    if (var3 < var5) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((class114.field2852[class19.field462][var2][var3] & 0x4) != 0) {
                        var1 = class19.field462;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var4 > var2) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class114.field2852[class19.field462][var2][var3] & 0x4) != 0) {
                            var1 = class19.field462;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var7 * 65536 / var6;
                while (var2 != var4) {
                    var10 += var11;
                    if (var2 < var4) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class114.field2852[class19.field462][var2][var3] & 0x4) != 0) {
                        var1 = class19.field462;
                    }
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var5) {
                            var3++;
                        } else if (var3 > var5) {
                            var3--;
                        }
                        if ((class114.field2852[class19.field462][var2][var3] & 0x4) != 0) {
                            var1 = class19.field462;
                        }
                    }
                }
            }
        }
        if ((class114.field2852[class19.field462][class32.field833.field1067 >> 7][class32.field833.field1070 >> 7] & 0x4) != arg0) {
            var1 = class19.field462;
        }
        return var1;
    }
}
