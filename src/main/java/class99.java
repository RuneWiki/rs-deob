import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class99 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lqc;")
    public static class97 field2100 = new class97(64);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2102 = new CRC32();

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lvd;")
    public static class123 field2104 = new class123();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lo;")
    public static class84 field2107 = class15.method124("Error loading your profile)3", 255);

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lo;")
    public static class84 field2106 = class15.method124("Checking for updates )2 ", 255);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lo;")
    public static class84 field2109 = class15.method124("::fpson", 255);

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Lo;")
    public static class84 field2110 = class15.method124("null", 255);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lad;")
    public static class5 field2108;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[Lqb;")
    public static class96[] field2105;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method747(int arg0, int arg1, int arg2) {
        field2095++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class49 var3 = class110.method856((byte) -128, arg0);
        int var4 = 91 / ((-arg1 - 5) / 57);
        return var3.method418(arg2, 65535);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhc;BZ)V", line = 36)
    public static final void method748(class45 arg0, byte arg1, boolean arg2) {
        field2096++;
        if (arg1 != -37) {
            field2104 = null;
        }
        if (class37.field722 != null) {
            try {
                class37.field722.method395(arg1 ^ 0x23AD);
            } catch (Exception var8) {
            }
            class37.field722 = null;
        }
        class37.field722 = arg0;
        class51.method441(arg2, -23689);
        class109.field2373 = null;
        class12.field242 = 0;
        class116.field2514.field482 = 0;
        class35.field693 = null;
        while (true) {
            class48 var3 = (class48) class89.field2019.method60((byte) -113);
            if (var3 == null) {
                while (true) {
                    class48 var4 = (class48) class42.field852.method60((byte) -77);
                    if (var4 == null) {
                        if (class8.field158 != 0) {
                            try {
                                class27 var5 = new class27(4);
                                var5.method226(arg1 ^ 0x2589, 4);
                                var5.method226(-9646, class8.field158);
                                var5.method217(0, 769666216);
                                class37.field722.method396(var5.field502, 4, 0, true);
                            } catch (IOException var7) {
                                try {
                                    class37.field722.method395(-9098);
                                } catch (Exception var6) {
                                }
                                class120.field2658++;
                                class37.field722 = null;
                            }
                        }
                        class71.field1491 = 0;
                        class37.field721 = System.currentTimeMillis();
                        return;
                    }
                    class86.field1959.method675((byte) -105, var4);
                    class126.field2783.method71(124, var4, var4.field731);
                    class112.field2435--;
                    class51.field1091++;
                }
            }
            class112.field2423.method71(124, var3, var3.field731);
            class3.field33++;
            class115.field2495--;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 110)
    public static final void method749(boolean arg0) {
        field2098++;
        if (class105.field2225 == 1) {
            if (class128.field2820 >= 539 && class128.field2820 <= 573 && class109.field2367 >= 169 && class109.field2367 < 205 && class3.field32[0] != -1) {
                class74.field1546 = 0;
                class39.field798 = true;
                class27.field522 = true;
            }
            if (class128.field2820 >= 569 && class128.field2820 <= 599 && class109.field2367 >= 168 && class109.field2367 < 205 && class3.field32[1] != -1) {
                class39.field798 = true;
                class27.field522 = true;
                class74.field1546 = 1;
            }
            if (class128.field2820 >= 597 && class128.field2820 <= 627 && class109.field2367 >= 168 && class109.field2367 < 205 && class3.field32[2] != -1) {
                class39.field798 = true;
                class27.field522 = true;
                class74.field1546 = 2;
            }
            if (class128.field2820 >= 625 && class128.field2820 <= 669 && class109.field2367 >= 168 && class109.field2367 < 203 && class3.field32[3] != -1) {
                class39.field798 = true;
                class27.field522 = true;
                class74.field1546 = 3;
            }
            if (class128.field2820 >= 666 && class128.field2820 <= 696 && class109.field2367 >= 168 && class109.field2367 < 205 && class3.field32[4] != -1) {
                class39.field798 = true;
                class74.field1546 = 4;
                class27.field522 = true;
            }
            if (class128.field2820 >= 694 && class128.field2820 <= 724 && class109.field2367 >= 168 && class109.field2367 < 205 && class3.field32[5] != -1) {
                class27.field522 = true;
                class74.field1546 = 5;
                class39.field798 = true;
            }
            if (class128.field2820 >= 722 && class128.field2820 <= 756 && class109.field2367 >= 169 && class109.field2367 < 205 && class3.field32[6] != -1) {
                class39.field798 = true;
                class27.field522 = true;
                class74.field1546 = 6;
            }
            if (class128.field2820 >= 540 && class128.field2820 <= 574 && class109.field2367 >= 466 && class109.field2367 < 502 && class3.field32[7] != -1) {
                class27.field522 = true;
                class74.field1546 = 7;
                class39.field798 = true;
            }
            if (class128.field2820 >= 572 && class128.field2820 <= 602 && class109.field2367 >= 466 && class109.field2367 < 503 && class3.field32[8] != -1) {
                class27.field522 = true;
                class39.field798 = true;
                class74.field1546 = 8;
            }
            if (class128.field2820 >= 599 && class128.field2820 <= 629 && class109.field2367 >= 466 && class109.field2367 < 503 && class3.field32[9] != -1) {
                class74.field1546 = 9;
                class39.field798 = true;
                class27.field522 = true;
            }
            if (class128.field2820 >= 627 && class128.field2820 <= 671 && class109.field2367 >= 467 && class109.field2367 < 502 && class3.field32[10] != -1) {
                class39.field798 = true;
                class27.field522 = true;
                class74.field1546 = 10;
            }
            if (class128.field2820 >= 669 && class128.field2820 <= 699 && class109.field2367 >= 466 && class109.field2367 < 503 && class3.field32[11] != -1) {
                class27.field522 = true;
                class39.field798 = true;
                class74.field1546 = 11;
            }
            if (class128.field2820 >= 696 && class128.field2820 <= 726 && class109.field2367 >= 466 && class109.field2367 < 503 && class3.field32[12] != -1) {
                class39.field798 = true;
                class74.field1546 = 12;
                class27.field522 = true;
            }
            if (class128.field2820 >= 724 && class128.field2820 <= 758 && class109.field2367 >= 466 && class109.field2367 < 502 && class3.field32[13] != -1) {
                class74.field1546 = 13;
                class39.field798 = true;
                class27.field522 = true;
            }
        }
        if (arg0) {
            field2105 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lec;", line = 234)
    public static final class28 method750(int arg0, int arg1) {
        field2101++;
        class28 var2 = (class28) class27.field495.method737((long) arg0, (byte) -82);
        if (var2 != null) {
            return var2;
        }
        int var3 = 4 % ((arg1 + 68) / 55);
        byte[] var4 = class36.field704.method909((byte) -125, arg0, 4);
        class28 var5 = new class28();
        if (var4 != null) {
            var5.method260(new class27(var4), (byte) 55, arg0);
        }
        var5.method258((byte) 126);
        class27.field495.method744(-121, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 258)
    public static void method751(int arg0) {
        field2110 = null;
        int var1 = 64 / ((arg0 + 31) / 45);
        field2109 = null;
        field2104 = null;
        field2105 = null;
        field2100 = null;
        field2108 = null;
        field2102 = null;
        field2106 = null;
        field2107 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lmc;", line = 275)
    public static final class75 method752(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        field2097++;
        int var3 = arg0 & 0xFFFF;
        if (arg1 != 694) {
            field2110 = null;
        }
        if (class60.field1254[var2] == null || class60.field1254[var2][var3] == null) {
            boolean var4 = class128.method998(var2, -20142);
            if (!var4) {
                return null;
            }
        }
        return class60.field1254[var2][var3];
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 313)
    public static final void method753(int arg0) {
        int var1 = -107 / ((-arg0 - 38) / 50);
        field2099++;
        while (true) {
            class88 var2 = class25.field421;
            class62 var3;
            synchronized (class25.field421) {
                var3 = (class62) class6.field100.method691(-20575);
            }
            if (var3 == null) {
                return;
            }
            var3.field1291.method33(var3.field1292, (int) var3.field731, var3.field1285, (byte) 2, false);
        }
    }
}
